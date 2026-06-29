# 🚀 CI/CD Pipeline with GitHub, Jenkins, Maven & Apache Tomcat

<p align="center">

![Java](https://img.shields.io/badge/Java-11-orange?style=for-the-badge\&logo=openjdk)
![Maven](https://img.shields.io/badge/Maven-3.9-red?style=for-the-badge\&logo=apachemaven)
![Jenkins](https://img.shields.io/badge/Jenkins-CI-blue?style=for-the-badge\&logo=jenkins)
![Tomcat](https://img.shields.io/badge/Apache-Tomcat-yellow?style=for-the-badge\&logo=apachetomcat)
![GitHub](https://img.shields.io/badge/GitHub-Repository-black?style=for-the-badge\&logo=github)

</p>

---

## 📌 Project Overview

This project demonstrates a complete **Continuous Integration and Continuous Deployment (CI/CD)** workflow using **GitHub**, **Jenkins**, **Apache Maven**, and **Apache Tomcat**.

Whenever changes are pushed to the GitHub repository, Jenkins automatically:

* 📥 Pulls the latest source code
* 🔨 Builds the project using Maven
* 📦 Packages the application into a WAR file
* 🚀 Deploys the application to Apache Tomcat

---

## 🏗️ Architecture

```text
            Developer
                │
                ▼
          Push Code to GitHub
                │
                ▼
        GitHub Webhook Trigger
                │
                ▼
             Jenkins
      (CI Build & Deployment)
                │
                ▼
         Maven Build (WAR)
                │
                ▼
         Apache Tomcat Server
                │
                ▼
       Live Web Application
```

---

# 🛠️ Tech Stack

| Technology           | Purpose                  |
| -------------------- | ------------------------ |
| Java 11              | Backend Development      |
| Maven                | Build Automation         |
| Jenkins              | Continuous Integration   |
| Git & GitHub         | Version Control          |
| Apache Tomcat 9      | Application Server       |
| AWS EC2              | Hosting Jenkins & Tomcat |
| Linux (Amazon Linux) | Operating System         |

---

# ✨ Features

* ✅ Automated Build Process
* ✅ Continuous Integration
* ✅ Continuous Deployment
* ✅ GitHub Version Control
* ✅ Maven Build Automation
* ✅ Apache Tomcat Deployment
* ✅ Jenkins Dashboard Monitoring
* ✅ WAR Packaging
* ✅ Workspace Cleanup Before Build

---

# 📂 Project Structure

```
Maven-Jenkins-Tomcat
│
├── src
│   ├── main
│   │   ├── java
│   │   └── webapp
│   │       └── index.jsp
│   │
│   └── test
│
├── pom.xml
└── README.md
```

---

# ⚙️ Jenkins Build Workflow

```
GitHub Push
      │
      ▼
Clone Repository
      │
      ▼
Maven Clean
      │
      ▼
Compile
      │
      ▼
Package WAR
      │
      ▼
Deploy to Tomcat
      │
      ▼
Application Live
```

---

# 🚀 How to Run

### Clone Repository

```bash
git clone https://github.com/<SubhashiniRajamani>/Maven-Jenkins-Tomcat.git
```

### Build Using Maven

```bash
mvn clean package
```

### Deploy

Deploy the generated WAR file to Apache Tomcat.

```
target/maven-app-1.war
```

---

# 🔄 CI/CD Workflow

```text
Code Change
     │
     ▼
Git Push
     │
     ▼
GitHub Webhook
     │
     ▼
Jenkins Job Triggered
     │
     ▼
Maven Build
     │
     ▼
WAR Generated
     │
     ▼
Deploy to Tomcat
     │
     ▼
Updated Web Application
```

---

# 📊 Build Status

```
✔ Source Code Pulled
✔ Maven Build Successful
✔ WAR Generated
✔ Application Deployed
✔ Website Updated
```

---

# 📚 Learning Outcomes

Through this project I learned:

* Git & GitHub workflows
* Jenkins job configuration
* Maven build lifecycle
* Apache Tomcat deployment
* GitHub Webhooks
* AWS EC2 server setup
* Linux administration
* CI/CD automation
* Java web application deployment

---

# 🔮 Future Enhancements

* Jenkins Pipeline using Jenkinsfile
* Docker containerization
* Kubernetes deployment
* SonarQube integration
* Nexus Artifact Repository
* Slack/Email build notifications
* Automated testing with JUnit

---

# 👩‍💻 Author

**Subhashini Rajamani**

---

<p align="center">

### 🚀 Happy Learning & Happy Deploying!

</p>
