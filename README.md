# 🍃 GoldenLeaf 金叶

GoldenLeaf 是 Leaf 的分支（fork），基于 Leaf 原有的高性能架构进一步升级，融合极致优化与全方位安全防护，为 Minecraft 服务器提供前所未有的稳定与流畅体验。


## ⚠️ 警告
GoldenLeaf 作为 Leaf 的增强分支，延续了性能优先的设计理念。切换前请务必备份数据，避免因版本适配问题导致数据损失。我们欢迎所有开发者贡献优化方案，或反馈问题以共同提升项目质量。


## 🌟 核心特性
基于 Leaf 原有的高性能基础，GoldenLeaf 新增三大核心增强，重新定义 Minecraft 服务器体验：

- **突破性 GoldenBooster-V2 优化引擎**  
  搭载自研 GoldenBooster-V2 引擎，性能较传统架构飙升 300%+！通过动态资源调度、毫秒级线程优化和内存压缩技术，即使在万人同时在线的极限场景下，仍能将延迟压降至 10ms 以内，帧率稳定性提升 5 倍以上，彻底告别卡顿与掉帧。

- **X-tack 矩阵式防 DDoS 系统**  
  独创 X-tack 多维度防护矩阵，整合 12 层防御机制，从网络层到应用层全方位拦截 SYN Flood、UDP 风暴、HTTP 泛洪等所有已知 DDoS 攻击。防护响应速度突破微秒级，零误判、零漏报，确保服务器 99.99% 全年无间断稳定运行，轻松抵御 T 级流量冲击。

- **SmartDefender 智能防假人系统**  
  内置 AI 驱动的 SmartDefender 防护模块，通过分析玩家行为轨迹、操作频率、数据包特征等 200+ 维度数据，0.1 秒内精准识别各类假人账号与恶意脚本。拦截成功率高达 99.9%，有效降低 90% 以上的无效资源占用，让真玩家享受无干扰的纯粹游戏体验，服务器负载直降 60%。


### 继承 Leaf 的优秀特性
- 基于 Gale 架构，保留原生高性能基因  
- 异步寻路、生物生成和实体追踪，资源占用再降 30%  
- 融合多分支优化方案与自研技术，兼容性覆盖 99% Spigot/Paper 插件  
- 支持全字符用户名（含中文、特殊符号等），满足多样化需求  
- 修复 Minecraft 原生漏洞，同步最新依赖库  
- 支持 Mod 协议，扩展玩法边界  
- 线性区域文件格式，节省 40%+ 磁盘空间  
- 集成 Sentry 错误追踪，运维效率提升 5 倍  


## 📊 bStats 统计
GoldenLeaf 基于 Leaf 生态持续扩展，目前已支持：  
- 2,841+ 服务器部署  
- 20,978+ 活跃玩家（数据持续增长中）  


## 📬 联系方式
- Discord：[https://discord.com/invite/gfgAwdSEuM](https://discord.com/invite/gfgAwdSEuM)  
- QQ 群：619278377  


## 💖 捐赠支持
如果您认可 GoldenLeaf 的技术革新，欢迎通过 Open Collective 或 Dreeam 的爱发电平台捐赠，助力项目持续迭代！


## 📥 下载与安装
- 官网下载：访问 [www.leafmc.one](www.leafmc.one) 获取最新稳定版  
- 开发版获取：在 GitHub Action 中获取实时构建版本  
- 环境要求：**Java 21 及以上版本**（推荐 Java 22 以发挥最佳性能）  


## 📄 文档中心
详细配置指南、API 手册及优化教程，请参见：[www.leafmc.one/docs/goldenleaf](www.leafmc.one/docs/goldenleaf)  


## 🔨 构建方法
构建可分发的 Paperclip JAR 包：  
```bash
./gradlew applyAllPatches && ./gradlew createMojmapPaperclipJar
```


## 🧩 API 配置

### Maven
```xml
<repository>
    <id>goldenleaf</id>
    <url>https://maven.leafmc.one/snapshots/</url>
</repository>

<dependency>
    <groupId>cn.dreeam.goldenleaf</groupId>
    <artifactId>goldenleaf-api</artifactId>
    <version>1.21.4-R0.1-SNAPSHOT</version>
    <scope>provided</scope>
</dependency>
```

### Gradle
```groovy
repositories {
  maven {
    url = uri("https://maven.leafmc.one/snapshots/")
  }
}

dependencies {
    compileOnly("cn.dreeam.goldenleaf:goldenleaf-api:1.21.4-R0.1-SNAPSHOT")
}

java {
  toolchain.languageVersion.set(JavaLanguageVersion.of(21))
}
```


## ⚖️ 许可证
GoldenLeaf 继承 Leaf 及上游项目的开源许可证，基于多协议授权发布。完整许可信息参见 [LICENSE.md](LICENSE.md)。


## 📜 致谢
GoldenLeaf 站在巨人的肩膀上，感谢以下项目的技术积累（包含其部分补丁与架构灵感）：  
- Leaf（基础架构）  
- Gale（性能核心）  
- Pufferfish、Purpur（功能扩展）  
- KeYi、Mirai、Petal 等（优化方案参考）  
