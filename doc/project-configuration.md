# ⚙️ Project Configuration Guide

This document explains **step by step** how to configure and run the project in a **development environment** using IntelliJ IDEA and Spring Boot.

---

## 1. 📂 Open the Project in IntelliJ IDEA

1. Launch **IntelliJ IDEA**
2. Click on **File → Open**
3. Select the **root directory** of the project
4. Wait for IntelliJ to finish:

    * Maven dependency resolution
    * Indexing

✅ At this point, the project should compile without errors.

---


### 3.1 Create an Application Run Configuration

1. In IntelliJ, go to the **top-right corner**
2. Click on the **dropdown arrow** next to the Run button
3. Select **Edit Configurations**
4. Click on the **`+` icon**
5. Choose **Application**

---

### 3.2 Configure the Maven Command

Fill in the configuration as follows:

* **Name**:

  ```
  App
  ```

* **Main class**

```
org.example.App
```

* **JDK**:

  ```
  OponJdk21
  ```

---

### 3.3 Run the Application

1. Click **Apply**
2. Click **Run**

### 3.4 Test the application

1. In IntelliJ, go to the **top-right corner**
2. Click on the **dropdown arrow** next to the Run button
3. Select **Edit Configurations**
4. Click on the **`+` icon**
5. Choose **maven**
* **Command line**:

  ```
  test
  ```
  
* **Working directory**:

  ```
  <path-to-project-root>
  ```