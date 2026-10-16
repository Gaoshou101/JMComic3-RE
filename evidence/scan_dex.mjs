import fs from 'node:fs';
const dex = 'work/extract/classes.dex';
const buf = fs.readFileSync(dex);
const out = [];
out.push('=== classes.dex 基本信息 ===');
out.push('size=' + buf.length);
out.push('magicHex=' + buf.subarray(0,8).toString('hex'));
out.push('magicText=' + buf.subarray(0,8).toString('latin1'));
out.push('version=' + buf.subarray(4,8).toString('latin1'));
out.push('classes2.dex exists=' + fs.existsSync('work/extract/classes2.dex'));
const text = buf.toString('latin1');
const pats = [
  [/a7m3p9xv/g, 'a7m3p9xv'],
  [/t6qk2z8/g, 't6qk2z8'],
  [/addJavascriptInterface/g, 'addJavascriptInterface'],
  [/WebView/g, 'WebView'],
  [/okhttp/gi, 'okhttp'],
  [/aes/gi, 'aes'],
  [/rsa/gi, 'rsa'],
  [/sha256/gi, 'sha256'],
  [/md5/gi, 'md5'],
  [/base64/gi, 'base64'],
  [/encrypt/gi, 'encrypt'],
  [/decrypt/gi, 'decrypt'],
  [/token/gi, 'token'],
  [/authorization/gi, 'authorization'],
  [/Bearer/gi, 'Bearer'],
  [/\/api\//g, '/api/'],
];
for (const [re, name] of pats) {
  const ms = [...text.matchAll(re)];
  out.push('\n--- pattern ' + name + ' count=' + ms.length + ' ---');
  for (const m of ms.slice(0, 40)) {
    const i = m.index;
    const ctx = text.slice(Math.max(0, i - 60), i + 100).replace(/[\x00-\x1f]/g, '.');
    out.push('@' + i + ': ' + ctx);
  }
  if (ms.length > 40) out.push('... truncated ' + (ms.length - 40) + ' more');
}
const urls = [...new Set([...text.matchAll(/https?:\/\/[a-zA-Z0-9.\-_\/:%?&=~#]+/g)].map(m => m[0]))];
out.push('\n=== https? URLs (unique, ' + urls.length + ') ===');
for (const u of urls.slice(0, 300)) out.push(u);
fs.writeFileSync('work/scan_dex.txt', out.join('\n'));
console.log('dex scan done');
