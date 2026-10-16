# JMComic3 v2.1.11 — APK 逆向工程仓库

本项目托管对 `JMComic3v2.1.11.apk` 的完整静态逆向结果：分析报告、APK 解包产物、
jadx 反编译 Java 源码树、以及全部原始扫描证据。
样本为本地 fixture，仅用于技术研究与兼容性分析。

## 1. 关键标识

| 项目 | 值 |
| --- | --- |
| 样本 | `apk/JMComic3v2.1.11.apk` |
| SHA-256 | `4a36ec11089eb04972d6f833f0047a003a5152c384cabdc7c249ff4268f9d3d7` |
| 包名 | `com.a7m3p9xv.t6qk2z8.app` |
| 应用名 / 版本 | JMComic3 / 2.1.11 |
| 启动入口 | `MainActivity` (LAUNCHER) |
| 技术栈 | Android/Kotlin 壳 + Capacitor WebView + React(CRA) + Cordova 兼容层 |

## 2. 目录结构

```
.
├── README.md                        本文件
├── reports/
│   └── JMComic3v2.1.11_reverse_engineering_report.md   完整分析报告（中文）
├── apk/
│   └── JMComic3v2.1.11.apk          原始样本（SHA-256 见上）
├── jadx-src/                        jadx 1.5.3 反编译 Java 源码树（1232 个 .java）
│   ├── com/a7m3p9xv/t6qk2z8/app/    应用自有代码：MainActivity.java、R.java
│   ├── com/capacitorjs/             Capacitor 插件（app / filesystem / preferences）
│   ├── com/getcapacitor/            Capacitor 运行时（桥接、Cordova 兼容）
│   ├── com/lorentech/               Cordova 卷控插件
│   ├── androidx/  kotlin/  org/     第三方库
│   └── A/ a0/ B/ b0/ ...            混淆后的包（单/双字母顶层包）
├── unpacked/                        APK 解包产物（657 文件）
│   ├── AndroidManifest.xml          清单
│   ├── classes.dex                  唯一 DEX（1,013,284 B, dex\n035）
│   ├── resources.arsc               资源表
│   ├── assets/
│   │   ├── capacitor.config.json
│   │   ├── capacitor.plugins.json
│   │   ├── native-bridge.js
│   │   └── public/                  PWA（React CRA）前端
│   │       ├── index.html
│   │       ├── manifest.json
│   │       ├── service-worker.js
│   │       ├── cordova.js / cordova_plugins.js
│   │       └── static/js/*.chunk.js  JS bundle（含 crypto 线索）
│   ├── res/                         资源
│   ├── kotlin/  org/                Kotlin / 第三方 class 资源
│   └── META-INF/                    签名与版本清单（CERT.RSA 等）
└── evidence/                        原始扫描证据（可复核）
    ├── scan_dex.txt                 DEX 字符串/模式扫描
    ├── scan_js.txt                  JS bundle 端点与 crypto 关键词扫描
    ├── scan_manifest_arsc.txt       清单/资源扫描
    ├── cert.txt                     keytool 证书解析
    ├── main_src.txt                 主入口相关 Dex 字符串
    ├── jadx_manifest.json           jadx 解析后的清单
    ├── jadx_main_activity.json      MainActivity 结构
    ├── jadx_get_app_info.json       包信息
    ├── jadx_main_full.json          主入口完整转储
    ├── src_*.java                   androidx 组件源码片段
    └── scan_*.mjs                   扫描脚本（可重跑复核）
```

## 3. 要点速览

- **签名证书**：`CN=tseng, OU=develop, O=develop, L=tw, ST=tw, C=tw`，序列号 `520e20cf43b88b80`，SHA384withRSA / RSA 2048，有效期 2025-06-09 → 2052-10-25。
- **权限**：CAMERA、RECORD_AUDIO、READ/WRITE_EXTERNAL_STORAGE、INTERNET、DUMP、MODIFY_AUDIO_SETTINGS。
- **WebView 桥接**：`addJavascriptInterface` 暴露 Java 对象；存在 secret token 校验，失败即禁用 exec() 桥
  （字符串 `Bridge access attempt with wrong secret token...`）。
- **Capacitor 配置**：`server.androidScheme=http`、`server.cleartext=true`。
- **JS 端点**：`jm365.work`、`payment.gcomicloveu.org`、`18comic.vip`、`discord.gg`，
  字节跳动 `*.bytepluses.com`（`newsvr-2025.txt` 下发），Clarity 埋点 `clarity.ms/tag/tqghr4tg54`。
- **加密线索**：JS 中出现 AES / RSA / privatekey / publickey / secret / md5 / sha256 / bearer / authorization。

详见 `reports/JMComic3v2.1.11_reverse_engineering_report.md`（含证据来源对照表）。

## 4. 复核方式

```bash
sha256sum apk/JMComic3v2.1.11.apk     # 应为 4a36ec11...8f9d3d7
node evidence/scan_js.mjs unpacked/assets/public   # 重跑 JS 端点扫描
node evidence/scan_dex.mjs unpacked/classes.dex    # 重跑 DEX 扫描
```

重新生成 Java 源码树：

```bash
java -cp jadx-1.5.3-all.jar jadx.cli.JadxCLI -d jadx-out --no-res apk/JMComic3v2.1.11.apk
```

## 5. 复现工具链

| 工具 | 版本 | 用途 |
| --- | --- | --- |
| jadx | 1.5.3 (`jadx-1.5.3-all.jar`) | Java 源码树反编译、清单/结构解析 |
| apktool | — | 资源/manifest 解码 |
| keytool (JDK) | 17 | 证书解析 |
| Node.js | — | 自定义 DEX/JS 字符串与正则扫描 |

## 6. 范围与限制

- 本仓库为**静态**分析结果；动态行为（实际网络请求、桥接调用、下发内容）未做验证。
- `jadx-src/` 为反编译产物，混淆包名（`A/`、`a0/` 等）非原始工程结构；部分方法存在恢复失败标记。
- 未完成项：JS bridge 白名单、`newsvr` 下发内容、支付参数签名方案、硬编码密钥确认。
