import fs from 'node:fs';
import path from 'node:path';
const root = 'work/extract/assets/public';
const out = [];
const allUrls = new Set();
const allApi = new Set();
const allDomains = new Set();
function walk(dir, acc) {
  for (const e of fs.readdirSync(dir, { withFileTypes: true })) {
    const p = path.join(dir, e.name);
    if (e.isDirectory()) walk(p, acc);
    else if (e.isFile()) acc.push(p);
  }
  return acc;
}
const files = walk(root, []).filter(f => f.endsWith('.js') && !f.endsWith('.map') && !/LICENSE/i.test(f));
out.push('JS文件总数=' + files.length);
const urlRe = /https?:\/\/[^\s"'\u0060<>)\]]*|wss?:\/\/[^\s"'\u0060<>)\]]*/g;
const apiRe = /\/[a-zA-Z0-9_\-]*(api|graphql|rest|v1|v2|v3)\/[^\s"'\u0060<>)\]]*/g;
const srcApkRe = /source=apk/g;
const clarityRe = /clarity/gi;
const cryptoRe = /\b(aes|rsa|sha256|md5|base64|encrypt|decrypt|token|authorization|bearer|apikey|secret|privatekey|publickey)\b/gi;
const verRe = /(?:version|appVersion)["'\s:=]+([0-9]+\.[0-9]+\.[0-9]+)/gi;
const fileStats = [];
for (const f of files) {
  const text = fs.readFileSync(f, 'latin1');
  const urls = [...new Set([...text.matchAll(urlRe)].map(m => m[0]))];
  const apis = [...new Set([...text.matchAll(apiRe)].map(m => m[0]))];
  const srcApk = [...text.matchAll(srcApkRe)].length;
  const clarity = [...text.matchAll(clarityRe)].length;
  const versions = [...new Set([...text.matchAll(verRe)].map(m => m[1]))];
  let cryptoCount = 0; const cryptoHits = new Set();
  for (const m of text.matchAll(cryptoRe)) { cryptoCount++; if (cryptoHits.size < 30) cryptoHits.add(m[0].toLowerCase()); }
  fileStats.push({ f: f.replace(/\\/g, '/'), size: fs.statSync(f).size, urls: urls.length, apis: apis.length, srcApk, clarity, versions, cryptoCount, cryptoHits: [...cryptoHits] });
  urls.forEach(u => allUrls.add(u));
  apis.forEach(a => allApi.add(a));
  for (const u of urls) { const m = /^https?:\/\/([^\/]+)/.exec(u); if (m) allDomains.add(m[1]); }
}
fileStats.sort((a, b) => b.size - a.size);
out.push('\n=== 文件统计（按大小降序） ===');
for (const s of fileStats) {
  out.push(s.f + ' size=' + s.size + ' urls=' + s.urls + ' apis=' + s.apis + ' srcApk=' + s.srcApk + ' clarity=' + s.clarity + ' versions=' + JSON.stringify(s.versions) + ' crypto=' + s.cryptoCount + ' hits=' + s.cryptoHits.join(','));
}
out.push('\n=== 全部域名（含端口，去重） ===');
for (const d of allDomains) out.push(d);
out.push('\n=== 全部完整 URL（去重，上限500，共 ' + allUrls.size + '） ===');
for (const u of [...allUrls].slice(0, 500)) out.push(u);
out.push('\n=== API/路径（去重，上限500，共 ' + allApi.size + '） ===');
for (const a of [...allApi].slice(0, 500)) out.push(a);
fs.writeFileSync('work/scan_js.txt', out.join('\n'));
console.log('js scan done; files=' + files.length);
