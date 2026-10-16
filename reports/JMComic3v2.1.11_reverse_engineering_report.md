# JMComic3v2.1.11.apk 逆向分析报告

## 1. 基本信息

| 项目 | 值 |
| --- | --- |
| 样本文件 | E:\迅雷下载\JMComic3v2.1.11.apk（本地 fixture） |
| SHA-256 | 4a36ec11089eb04972d6f833f0047a003a5152c384cabdc7c249ff4268f9d3d7 |
| 包名 | com.a7m3p9xv.t6qk2z8.app |
| 应用名 | JMComic3 |
| 版本 | 2.1.11（versionName） |
| 启动入口 | MainActivity（LAUNCHER） |

证据类型：本地实证（jadx 解析 AndroidManifest + 文件哈希）。

## 2. 技术栈

- Android/Kotlin 应用壳 + Capacitor WebView 容器 + React（Create React App）前端。
- 内置 Cordova 兼容层：MockCordovaWebViewImpl、SystemWebViewEngine、cordova-plugin-volume-control（VolumeControl）。
- PWA 化打包：assets/public 下包含 index.html、manifest.json、service-worker.js。
- androidx 组件：InitializationProvider、FileProvider、ProfileInstallReceiver、EmojiCompat、ProcessLifecycle。

证据类型：本地实证（DEX/资源扫描）+ 推理（组件组合判断）。

## 3. 签名证书

| 项目 | 值 |
| --- | --- |
| 所有者/颁发者 | CN=tseng, OU=develop, O=develop, L=tw, ST=tw, C=tw |
| 序列号 | 520e20cf43b88b80 |
| 有效期 | 2025-06-09 12:23:31 CST 至 2052-10-25 12:23:31 CST |
| 签名算法 | SHA384withRSA |
| 公钥 | RSA 2048 位 |
| 证书版本 | 3 |
| SHA1 | A0:00:61:5A:64:20:F9:78:CA:C1:33:FE:2E:4B:D4:02:05:7D:37:0C |
| SHA256 | 88:29:41:55:C8:FC:E4:54:61:28:3E:CB:C1:5B:5D:C2:B9:39:94:31:23:53:67:D4:D6:48:E6:FE:F2:72:D4:6A |
| SubjectKeyIdentifier | 3C 67 FD EF 81 96 EE 05 82 A2 75 C4 39 20 64 E8 7A FA 2F E2 |

META-INF 目录：CERT.RSA、CERT.SF、MANIFEST.MF、version-control-info.textproto，以及 androidx/kotlinx 版本清单文件。

证据类型：本地实证（keytool 解析 META-INF/CERT.RSA）。

## 4. 权限清单

- android.permission.CAMERA
- android.permission.DUMP
- android.permission.INTERNET
- android.permission.MODIFY_AUDIO_SETTINGS
- android.permission.READ_EXTERNAL_STORAGE
- android.permission.RECORD_AUDIO
- android.permission.WRITE_EXTERNAL_STORAGE

证据类型：本地实证（jadx manifest 输出）。

## 5. Manifest 导出组件

- MainActivity：LAUNCHER 入口。
- FileProvider：authorities 为 `{{pkg}}.fileprovider`（模板占位，构建时替换为包名）。
- InitializationProvider：authorities 为 `{{pkg}}.androidx-startup`（androidx.startup 初始化链）。
- ProfileInstallReceiver：androidx.profileinstaller 安装期接收器。

证据类型：本地实证（jadx_manifest.json）。

## 6. DEX 概况与 WebView 桥接面

- 仅一个 classes.dex，大小 1,013,284 B，magic 为 dex\n035，无 classes2.dex。
- DEX 中存在 `addJavascriptInterface` 字符串（@896364）：WebView 向 JS 暴露 Java 桥接对象。
- 关键校验字符串：`Bridge access attempt with wrong secret token, possibly from malicious code. Disabling exec() bridge!` —— 桥接对象对调用方携带的 secret token 做校验，失败即禁用 exec() 桥。
- 存在 WebView POST 消息通道（android/webkit 消息对象/方法相关字符串）。
- 可读 URL 字符串：`http://schemas.android.com/apk/res/android`、`https://ssl.gstatic.com/accessibility/javascript/android/`。
- DEX 模式计数：okhttp/aes/encrypt/decrypt/api 各 0 次；rsa=4、base64=7、token=6。

证据类型：本地实证（DEX 十六进制/字符串扫描）+ 推理（桥接语义）。

## 7. Capacitor 配置

capacitor.config.json：

- appId：com.a7m3p9xv.t6qk2z8.app
- server.androidScheme = http（WebView 以 http scheme 加载）
- server.cleartext = true（允许明文流量）
- 启用 SplashScreen
- StatusBar 颜色 #d1d1d1

证据类型：本地实证（assets/capacitor.config.json）。

## 8. PWA 外壳

- assets/public/index.html：繁体中文界面，标题 JMComic3，主题色 #000000，主入口脚本 main.9a45a3ff.js，并加载微软 Clarity 埋点脚本 https://www.clarity.ms/tag/tqghr4tg54。
- manifest.json：PWA 声明，start_url 为 `/?source=apk`。
- service-worker.js：离线缓存层。

证据类型：本地实证（资源解包扫描）。

## 9. JS 网络端点

核心 bundle：assets/public/static/js/main.9a45a3ff.js（794,500 B，22 个 URL，crypto 关键词命中 65 次：token/aes/decrypt/authorization/bearer/base64/encrypt/md5/sha256）。

发现域名与端点：

- `https://jm365.work/AwNzE2`
- `payment.gcomicloveu.org/payments/order/6aa86c8520484331b19d9e7dfd1078cb`（支付/订单）
- `18comic.vip`
- `discord.gg/V74p7HM`
- 字节跳动 newsvr 三个端点（均请求 `newsvr-2025.txt`，疑似动态下发/调度）：
  - `rup4a04-c02.tos-cn-hongkong.bytepluses.com`
  - `rup4a04-c01.tos-ap-southeast-1.bytepluses.com`
  - `rup4a04-c03.tos-cn-beijing.bytepluses.com.cn`
- `https://www.clarity.ms/tag/tqghr4tg54`（行为分析埋点）

chunk 明细：

- 7761.1932c1a9.chunk.js（517 KB）：crypto 命中 decrypt/aes/encrypt/base64/token。
- 355.a49c914f.chunk.js（310 KB，271 命中）：aes/rsa/privatekey/publickey/secret/md5/sha256。
- 9907.73996f84.chunk.js：内嵌版本号 2.1.11；API 路径 `/v1/urls/count.json`、`/api/info.json?limit=1&url=`、`/v2/share/stats`。

证据类型：本地实证（JS 字符串/正则扫描）。

## 10. Cordova 层

- assets/public 下包含 cordova.js、cordova_plugins.js。
- 插件：cordova-plugin-volume-control（plugins/cordova-plugin-volume-control/www/VolumeControl.js）。
- Java 侧：MockCordovaWebViewImpl、SystemWebViewEngine、VolumeControl 实现（与 MODIFY_AUDIO_SETTINGS 权限呼应）。

证据类型：本地实证（资源扫描 + DEX 类名）。

## 11. 风险面归纳

1. 明文通信：server.androidScheme=http 且 cleartext=true，接口流量存在被中间人监听/降级的可能。
2. WebView 桥接暴露：addJavascriptInterface 桥接对象有 secret token 校验与 exec() 禁用兜底；若 token 泄露或被伪造调用仍存面。
3. 外联面广：第三方支付域名、字节跳动下发端点、Discord、Clarity 埋点，客户端发往这些域名的请求/上报行为需动态验证。
4. 客户端密钥线索：JS 中出现 AES/RSA/privatekey/publickey/secret/md5/sha256，结合 bearer/authorization/token 计数，说明认证与加密逻辑集中在 JS bundle；密钥是否硬编码需进一步静态还原确认（当前未完成）。
5. 敏感权限：CAMERA、RECORD_AUDIO、读写外部存储，与 WebView 前端能力相组合的滥用面需要动态验证。
6. 未知项：未确认 JS bridge 具体白名单、newsrv 下发内容、支付参数签名方案。

证据类型：推理（基于上述本地实证汇总）。

## 12. 证据来源对照

| 结论 | 证据类型 |
| --- | --- |
| 包名/版本/入口/权限/组件 | 本地实证（jadx manifest） |
| 签名证书字段 | 本地实证（keytool） |
| DEX/JS 字符串与计数 | 本地实证（扫描脚本） |
| WebView 桥接行为语义 | 推理 |
| 风险面归纳 | 推理 |
| 动态行为（实际请求、桥接调用） | 未知（未做动态分析） |
