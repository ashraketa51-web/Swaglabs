# Swag Labs UI Automation Testing (Selenium + TestNG)

[![Java](https://img.shields.io/badge/Java-✓-blue)](#)
[![Maven](https://img.shields.io/badge/Maven-✓-blue)](#)
[![Selenium](https://img.shields.io/badge/Selenium-UI%20Automation-brightgreen)](#)
[![TestNG](https://img.shields.io/badge/TestNG-Test%20Framework-orange)](#)

UI automation testing project for the **Swag Labs (SauceDemo)** web application.  
Built with **Java + Selenium WebDriver + TestNG**, managed by **Maven**, and designed to practice real-world test automation structure and execution.

---

## ✨ Key Highlights
- Automated UI test scenarios using **Selenium WebDriver**
- Test execution and suites managed with **TestNG**
- Dependency management with **Maven** (`pom.xml`)
- Clean, scalable test execution using a TestNG suite file (`testng.xml`)
- Easy to run locally and extend with new test cases

---

## 🧰 Tech Stack
- **Java**
- **Selenium WebDriver**
- **TestNG**
- **Maven**

---

## ✅ Test Coverage (Examples)
> Update this list to match what you actually automated.

- Login (valid/invalid credentials)
- Add items to cart
- Remove items from cart
- Checkout flow (basic happy path)
- UI validations (titles, buttons, messages)

---

## 📦 Project Structure
> Adjust folder names if your structure is different.

```bash
Swag_Labs/
├─ src/
│  ├─ test/java/            # Test classes
│  ├─ main/java/            # (Optional) Utilities / pages / drivers
├─ testng.xml               # TestNG suite runner
├─ pom.xml                  # Maven dependencies and plugins
└─ README.md
