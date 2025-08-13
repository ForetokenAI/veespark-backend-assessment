# VeeSpark - 实战编码评估 (Java Spring Boot Version)

欢迎！这是 VeeSpark 后端评估任务的 Java Spring Boot 版本。您被邀请完成一个简短的、真实世界的编码挑战，旨在反映您在实际工作中可能遇到的任务。

---

## 📋 重要须知

- 您的 **屏幕和音频录制** 已经通过浏览器开始。
- 请 **不要关闭或刷新评估页面** —— 否则录制将停止，可能导致提交作废。
- 您可以使用 **任何 AI 工具**（如 ChatGPT、GitHub Copilot 等）。
- 这是一个 **独立完成** 的任务 —— 不允许结对编程或外部协助。

如遇任何问题，请立即联系评估团队：**[assessment@foretokenai.com](mailto:assessment@foretokenai.com)**。

---

## 🚀 项目运行

### 前提条件
- Java 17 或更高版本
- Maven 3.6 或更高版本

### 运行项目
```bash
# 编译项目
mvn clean compile

# 运行应用
mvn spring-boot:run

# 运行测试
mvn test
```

应用将在 `http://localhost:8080` 启动。

### API 端点
- `GET /users` - 获取所有用户
- `GET /users/{id}` - 根据ID获取用户
- `GET /users?status=active&team=marketing` - 带过滤条件获取用户
- `GET /users/inactive` - 获取非活跃用户

---

## 💻 您将完成的任务

您将在一个小型、真实的 Java Spring Boot 代码库中工作。目标不是完成所有任务，而是做出扎实、有思考的进展。

您将处理以下 4 个任务 —— 请在时间限制内尽量完成：

1. **修复 Bug**  
   目前，`GET /users/{id}` 在以下两种情况下都会返回 **404 Not Found**：
   - 当用户不存在时  
   - 当 ID 格式无效（不是合法的 UUID v4）  

   请修改逻辑，使得：
   - 如果 ID 格式无效 → 返回 **400 Bad Request**
   - 如果 ID 格式有效但用户不存在 → 返回 **404 Not Found**

2. **扩展 API**  
   添加查询过滤功能，例如：`/users?status=active&team=marketing`

3. **构建新功能**  
   添加接口 `GET /users/inactive`，返回过去 30 天以上无登录记录的用户。

4. **编写测试**  
   为任意一个接口添加集成测试。

---

## 📦 提交内容

倒计时结束后，平台将要求您：

1. 🎤 在浏览器中录制一个 **简短的回顾视频**（最多 2 分钟）
2. 📁 压缩并上传您修改后的项目，格式为 `.zip`

---

## 💡 我们的评估标准

我们不仅仅关注代码是否完美，更关注：

- 您在真实代码库中的操作能力
- 您的问题解决能力
- 编码能力以及文档表达的清晰度

---

## 📄 关于 `wiki.md`

代码仓库中包含一个 `wiki.md` 文件。  
该文档最后更新时间是 **数年前**，其中可能包含 **不准确或过时的信息**。  
请仅将其作为**参考**，不要视为权威说明。

---

祝您好运！我们期待看到您的思路与解决方案！