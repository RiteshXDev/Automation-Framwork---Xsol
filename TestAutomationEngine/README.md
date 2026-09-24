# Hybrid Automation Framework

![Java](https://img.shields.io/badge/Java-17-orange)
![Appium](https://img.shields.io/badge/Appium-2.x-blue)
![Selenium](https://img.shields.io/badge/Selenium-4.x-brightgreen)
![TestNG](https://img.shields.io/badge/TestNG-Framework-red)
![Maven](https://img.shields.io/badge/Maven-Build-blueviolet)
![Platform](https://img.shields.io/badge/Platform-Android%20%7C%20iOS%20%7C%20Web-success)
![License](https://img.shields.io/badge/License-MIT-lightgrey)

A scalable, enterprise-grade **Hybrid Automation Framework** built with **Java, Selenium WebDriver, Appium, TestNG, and Maven**, supporting end-to-end automated testing across **Android**, **iOS**, and **Web** platforms from a single, unified codebase.

---

## Table of Contents

1. [Project Overview](#1-project-overview)
2. [Key Features](#2-key-features)
3. [Architecture](#3-architecture)
4. [Project Structure](#4-project-structure)
5. [Technology Stack](#5-technology-stack)
6. [System Requirements](#6-system-requirements)
7. [Quick Start (Install → Configure → Run)](#7-quick-start-install--configure--run)
8. [Installation Guide](#8-installation-guide)
9. [Configuration](#9-configuration)
10. [Running Tests](#10-running-tests)
11. [Reports, Logs & Screenshots](#11-reports-logs--screenshots)
12. [Adding a New Test](#12-adding-a-new-test)
13. [Troubleshooting](#13-troubleshooting)
14. [Best Practices](#14-best-practices)
15. [Naming Conventions](#15-naming-conventions)
16. [License](#16-license)

---

## 1. Project Overview

The Hybrid Automation Framework automates testing across **Android, iOS, and Web** platforms using a shared architecture, while isolating platform-specific logic where required. It is designed to minimize maintenance overhead, maximize reusability, and support enterprise-scale automation initiatives.

**Design objectives:**

- Provide reusable, modular automation components
- Support Android, iOS, and Web testing from a single framework
- Minimize code duplication across platforms
- Enable parallel execution across devices and browsers
- Automatically generate detailed execution reports
- Capture screenshots on test failure
- Log all execution activity via Log4j2
- Integrate seamlessly with Jenkins CI/CD pipelines
- Allow flexible, JSON-based configuration
- Simplify the process of adding new test cases

---

## 2. Key Features

### Core Framework

| Category | Capabilities |
|---|---|
| Language & Build | Java 17, Maven |
| Test Execution | TestNG, Retry Analyzer, Parallel Execution |
| Design | Page Object Model, Factory Pattern, Singleton, Strategy, Builder, Listener |
| Reporting | Extent Reports, Execution Summary, Performance Report |
| Logging | Log4j2 (platform-segmented logs) |
| Configuration | JSON-based, environment-independent |
| CI/CD | Jenkins-ready |

### Mobile Automation

- Android automation via **UiAutomator2**
- iOS automation via **XCUITest**
- Automatic Appium server start/stop
- APK and IPA installation support
- Emulator, simulator, and physical device support

### Web Automation

- Supported browsers: **Chrome**, **Microsoft Edge**, **Firefox**
- Headless execution
- Incognito mode
- Cross-browser and parallel browser execution

---

## 3. Architecture

The framework follows a **layered architecture** that separates concerns and isolates platform-specific logic while sharing a common execution flow.

```
                                    TestNG Suite
                                         │
                                         ▼
                               TestNG XML Configuration
                                         │
                                         ▼
                           MobileBaseTest / WebBaseTest
                                         │
                   ┌─────────────────────┴─────────────────────┐
                   ▼                                           ▼
         Mobile Driver Factory                         Browser Factory
                   │                                           │
        Android Driver / iOS Driver              Chrome / Edge / Firefox
                   │                                           │
                   ▼                                           ▼
         MobileUIController                         WebUIController
                   │                                           │
                   ▼                                           ▼
              Page Objects                            Page Objects
                   │                                           │
                   └───────────────┬───────────────────────────┘
                                   ▼
                             Test Execution
                                   ▼
              Screenshots • Logs • Reports • Performance Logs
```

### Architecture Layers

| Layer | Responsibility | Example Classes |
|---|---|---|
| **Test Layer** | Executes test scenarios, calls page methods, performs validations | `LoginTest`, `DashboardTest` |
| **Base Test Layer** | Reads config, starts Appium, initializes driver/reports/controllers, handles teardown | `MobileBaseTest`, `WebBaseTest` |
| **Driver Layer** | Instantiates the correct platform driver | `AndroidDriver`, `IOSDriver`, `ChromeDriver` |
| **Controller Layer** | Common interface between tests and drivers (click, type, scroll, wait, screenshot) | `MobileUIController`, `WebUIController` |
| **Page Object Layer** | Encapsulates locators, actions, and business logic per screen | `LoginPage`, `HomePage` |
| **Utility Layer** | Reusable helpers (config, JSON, screenshots, performance, dates, waits) | `ConfigLoader`, `ScreenshotUtils` |
| **Listener Layer** | Monitors execution — failure screenshots, retries, report updates | `TestListener` |

> Instead of writing `driver.findElement(locator).click();`, tests call `controller.click(locator);` — which handles logging, waiting, error handling, and screenshot capture automatically.

---

## 4. Project Structure

```
HybridAutomationFramework
│
├── src
│   ├── main
│   │   ├── java
│   │   │   ├── base/               # MobileBaseTest, WebBaseTest
│   │   │   ├── controller/         # MobileUIController, WebUIController
│   │   │   ├── factory/            # BrowserFactory, DriverFactory, AppiumServerFactory
│   │   │   ├── listeners/          # TestListener
│   │   │   ├── pages/              # LoginPage, DashboardPage
│   │   │   ├── utils/              # ConfigLoader, ScreenshotUtils, PerformanceLogger
│   │   │   └── models/
│   │   └── resources
│   │       ├── config/             # mobile-config.json, web-config.json
│   │       ├── log4j2.xml
│   │       └── test-data/
│   └── test
│       └── java/                   # LoginTest, DashboardTest
│
├── reports/
├── logs/
├── screenshots/
├── testng.xml
├── pom.xml
└── README.md
```

---

## 5. Technology Stack

| Technology | Purpose |
|---|---|
| Java 17 | Core programming language |
| Selenium 4 | Web automation |
| Appium 2 | Mobile automation |
| TestNG | Test execution framework |
| Maven | Dependency & build management |
| Log4j2 | Logging |
| Extent Reports | HTML execution reporting |
| JSON | Configuration management |
| Android Studio / SDK | Android development & emulation |
| Xcode | iOS development (macOS only) |
| Git | Version control |
| Jenkins | Continuous integration |

---

## 6. System Requirements

### Software

| Software | Required Version |
|---|---|
| Java | 17 or later |
| Maven | 3.9 or later |
| Node.js | Latest LTS |
| Appium | 2.x or later |
| Android Studio | Latest stable |
| Android SDK | Installed |
| IntelliJ IDEA | Latest |
| Git | Latest |
| Xcode *(macOS only)* | Latest |

### Hardware

| | Minimum | Recommended |
|---|---|---|
| RAM | 8 GB | 16 GB or higher |
| CPU | Intel i5 / Ryzen 5 | Intel i7 / Ryzen 7 or better |
| Storage | 10 GB free | SSD storage |
| Other | — | macOS system + physical Android/iOS devices for iOS automation |

### Supported Platforms

- **Mobile:** Android Emulator, Android Physical Device, iOS Simulator, iPhone/iPad
- **Web:** Google Chrome, Microsoft Edge, Mozilla Firefox

### Design Patterns Used

Page Object Model · Factory Pattern · Singleton Pattern · Strategy Pattern · Builder Pattern (Capabilities) · Listener Pattern · Dependency Injection (where applicable)

---

## 7. Quick Start (Install → Configure → Run)

This is the fastest path from a clean machine to a passing test run. Each step links to the detailed section if you need more context.

| # | Step | Command / Action | Detail |
|---|---|---|---|
| 1 | Install Java 17, Maven, Git, Node.js | See [Installation Guide](#8-installation-guide) | §8, Steps 1–4 |
| 2 | Install Appium + drivers | `npm install -g appium`<br>`appium driver install uiautomator2`<br>`appium driver install xcuitest` | §8, Steps 5–6 |
| 3 | Install Android Studio & configure SDK | Set `ANDROID_HOME` / `ANDROID_SDK_ROOT`, add platform-tools to `PATH` | §8, Steps 7–8 |
| 4 | *(macOS only)* Install Xcode | `xcode-select --install` | §8, Step 9 |
| 5 | Clone the repository | `git clone https://github.com/<username>/<repository>.git`<br>`cd HybridAutomationFramework` | §8, Step 11 |
| 6 | Import into IntelliJ & resolve dependencies | Open project → `mvn clean install` | §8, Steps 12–13 |
| 7 | Confirm the build compiles | `mvn clean compile` → expect `BUILD SUCCESS` | §8 |
| 8 | Connect a device / start an emulator | `adb devices` or `emulator -avd <name>` | §10 |
| 9 | Place your app binary | Copy `.apk`/`.ipa` into `apps/` | §9 |
| 10 | Point the framework at your app | Edit `mobile-config.json` (`app`, `appPackage`, `appActivity` or `bundleId`) | §9 |
| 11 | Point the framework at your site (Web) | Edit `web-config.json` (`browser`, `url`) | §9 |
| 12 | *(If needed)* Fix local Node/Appium paths | Update `AppiumServerFactory.java` with `withNodeExecutable` / `withAppiumJS` | §9 |
| 13 | Run a single test to validate the setup | `mvn -Dtest=LoginTest test` | §10 |
| 14 | Review the result | Open `reports/ExtentReport.html` | §11 |

> **First time?** Steps 1–7 only need to be done once per machine. Steps 8–14 are what you'll repeat for every new project or app under test.

### Minimal end-to-end example

```bash
# 1. Verify toolchain
java -version && mvn -version && node -v && appium -v

# 2. Clone and enter the project
git clone https://github.com/<username>/<repository>.git
cd HybridAutomationFramework

# 3. Resolve dependencies and build
mvn clean install

# 4. Start an emulator (Android example)
emulator -list-avds
emulator -avd Pixel_9_API_35

# 5. Confirm the device is visible
adb devices

# 6. Update mobile-config.json to point at your APK, then run a smoke test
mvn -Dtest=LoginTest test

# 7. Open the report
#    reports/ExtentReport.html
```

If every command above completes without error and `ExtentReport.html` shows a passing result, your environment is fully configured and ready for regular use.

---

## 8. Installation Guide

Follow these steps in order on a fresh machine.

### Step 1 — Install Java 17

Download from [Adoptium](https://adoptium.net/) or [Oracle](https://www.oracle.com/java/technologies/downloads/).

```bash
java -version     # Expected: java version "17.x.x"
javac -version
```

**Configure `JAVA_HOME`:**

- **Windows:** Set `JAVA_HOME` (e.g. `C:\Program Files\Java\jdk-17`) via Environment Variables, and add `%JAVA_HOME%\bin` to `PATH`. Verify with `echo %JAVA_HOME%`.
- **macOS:** Run `/usr/libexec/java_home`, then `export JAVA_HOME=$(/usr/libexec/java_home)`.

### Step 2 — Install Maven

Download from [maven.apache.org](https://maven.apache.org/download.cgi), extract (e.g. `C:\Apache\maven`), set `MAVEN_HOME`, and add `%MAVEN_HOME%\bin` to `PATH`.

```bash
mvn -version       # Expected: Apache Maven 3.9.x / Java 17
```

### Step 3 — Install Git

Download from [git-scm.com](https://git-scm.com/) and verify:

```bash
git --version
```

### Step 4 — Install Node.js

Appium requires Node.js. Install the **Latest LTS** from [nodejs.org](https://nodejs.org/).

```bash
node -v            # e.g. v22.x.x
npm -v
```

### Step 5 — Install Appium

```bash
npm install -g appium
appium -v           # Expected: 2.x.x
```

### Step 6 — Install Appium Drivers

```bash
appium driver install uiautomator2
appium driver install xcuitest
appium driver list  # Expected: uiautomator2, xcuitest
```

### Step 7 — Install Android Studio

Download from [developer.android.com/studio](https://developer.android.com/studio) and install the Android SDK, SDK Platform, SDK Build Tools, and Android Emulator.

Verify via **Android Studio → Settings → Android SDK** that all components are installed.

### Step 8 — Configure Android Environment Variables

Set `ANDROID_HOME` and `ANDROID_SDK_ROOT` (e.g. `C:\Users\<username>\AppData\Local\Android\Sdk`), and add `platform-tools`, `tools`, and `emulator` to `PATH`.

```bash
adb devices
```

### Step 9 — Install Xcode (macOS only)

Install Xcode from the App Store, then:

```bash
xcode-select --install
sudo xcodebuild -license
xcodebuild -version
```

### Step 10 — Install IntelliJ IDEA

Download the [Community or Ultimate Edition](https://www.jetbrains.com/idea/).

### Step 11 — Clone the Repository

```bash
git clone https://github.com/<username>/<repository>.git
cd HybridAutomationFramework
```

### Step 12 — Import into IntelliJ

Open IntelliJ → **Open Project** → select `HybridAutomationFramework` → wait for Maven to resolve dependencies.

### Step 13 — Download Maven Dependencies

```bash
mvn clean install
# or
mvn dependency:resolve
```

This resolves Selenium, Appium Java Client, TestNG, Log4j2, Extent Reports, Jackson, Apache Commons, and all other dependencies.

### Verification Checklist

```bash
mvn clean compile   # Expected: BUILD SUCCESS
adb devices         # Expected: connected device or emulator
appium              # Expected: "Appium REST http interface listener started" (Ctrl+C to stop)
node -v && npm -v && java -version && mvn -version && git --version
```

**First-time setup checklist:**

- [ ] Java 17, Maven, Git, and Node.js installed
- [ ] Appium installed with UiAutomator2 and XCUITest drivers
- [ ] Android Studio installed and Android SDK configured
- [ ] Environment variables set (`JAVA_HOME`, `MAVEN_HOME`, `ANDROID_HOME`, `ANDROID_SDK_ROOT`)
- [ ] Project imports successfully into IntelliJ
- [ ] Maven dependencies downloaded
- [ ] Device/emulator visible via `adb devices`
- [ ] Appium starts successfully
- [ ] Project builds via `mvn clean compile`

Once complete, proceed to [Configuration](#8-configuration).

---

## 9. Configuration

Configuration files live under `src/main/resources/config/` and avoid hardcoding values in source code.

### Mobile Configuration — `mobile-config.json`

```json
{
  "platformName": "Android",
  "automationName": "UiAutomator2",
  "deviceName": "Pixel_8",
  "platformVersion": "15",
  "udid": "emulator-5554",
  "app": "apps/demo.apk",
  "appPackage": "com.demo.app",
  "appActivity": "com.demo.app.MainActivity",
  "bundleId": "",
  "noReset": false,
  "fullReset": false,
  "newCommandTimeout": 300
}
```

| Property | Description |
|---|---|
| `platformName` | Android or iOS |
| `automationName` | UiAutomator2 or XCUITest |
| `deviceName` | Device or emulator name |
| `platformVersion` | Android/iOS version |
| `udid` | Device identifier |
| `app` | Path to APK or IPA |
| `appPackage` | Android package name |
| `appActivity` | Android launch activity |
| `bundleId` | iOS bundle identifier |
| `noReset` | Preserve app data between runs |
| `fullReset` | Reinstall app before run |
| `newCommandTimeout` | Driver session timeout (seconds) |

**Android example:** `deviceName: Pixel_9_Pro`, `platformVersion: 15`, `udid: emulator-5554`, `app: apps/MyApplication.apk`, `appPackage: com.company.application`, `appActivity: com.company.application.MainActivity`

**iOS example:** `deviceName: iPhone 16`, `platformVersion: 18`, `bundleId: com.company.application`, `app: apps/MyApplication.ipa`

### iOS Bundle ID Configuration (Xcode)

The **bundle ID** uniquely identifies your iOS app and must match exactly between your Xcode project, your provisioning profile, and the `bundleId` value in `mobile-config.json`. Mismatches are one of the most common causes of failed iOS test launches.

#### How to Find the Bundle ID in Xcode

1. Open your `.xcodeproj` or `.xcworkspace` file in Xcode.
2. Select the project name in the **Project Navigator** (left panel).
3. Select your app **Target** under **TARGETS**.
4. Go to the **General** tab.
5. Under **Identity**, find the **Bundle Identifier** field — this is your bundle ID (e.g. `com.company.application`).

Alternatively, from the command line:

```bash
# From an already-built .app or .ipa
/usr/libexec/PlistBuddy -c "Print :CFBundleIdentifier" "<path-to-app>/Info.plist"
```

#### How to Configure the Bundle ID

1. In Xcode, go to **Target → Signing & Capabilities**.
2. Under **Signing**, set your **Team** (your Apple ID / Apple Developer account).
3. Update the **Bundle Identifier** field to your desired value (e.g. `com.yourname.myapp`).
4. Xcode will automatically attempt to generate a matching provisioning profile.
5. Copy the same value into `mobile-config.json`:

```json
"bundleId": "com.yourname.myapp"
```

6. Rebuild the app (`Product → Build`) so the compiled `.app`/`.ipa` matches the updated identifier.

#### Changing the Bundle ID When It Expires (Free Apple ID / Personal Team)

With a **free Apple Developer account** (a "Personal Team," not a paid $99/year membership), apps are signed with a **7-day provisioning profile**. After 7 days, the app stops launching on the device and must be re-signed — often requiring a **new bundle ID**, since a free account can't reuse an identifier still tied to an expired profile on Apple's servers.

**Steps to re-provision with a new bundle ID:**

1. Open the project in Xcode and go to **Target → Signing & Capabilities**.
2. Confirm your **Personal Team** is still selected under **Team**.
3. Change the **Bundle Identifier** to a new, unique value — a common convention is appending a version or date suffix:
   ```
   com.yourname.myapp2
   com.yourname.myapp.v2
   com.yourname.myapp.20260721
   ```
4. Let Xcode automatically create a new provisioning profile (**Automatically manage signing** should be checked).
5. On the physical device, go to **Settings → General → VPN & Device Management** and remove the old, expired app profile/trust entry if present.
6. Rebuild and reinstall the app on the device (`Product → Run`, or via Appium install).
7. Update `mobile-config.json` with the **new** `bundleId` so the framework launches the correct, freshly signed app:
   ```json
   "bundleId": "com.yourname.myapp2"
   ```
8. Re-run your test suite to confirm the app launches successfully.

> **Tip:** Free-account provisioning profiles expire every 7 days regardless of whether the bundle ID changes — expect to repeat this process weekly during active iOS test development. A paid Apple Developer Program membership issues profiles valid for up to 1 year and removes this limitation.

### Web Configuration — `web-config.json`

```json
{
    "browser": "chrome",
    "url": "https://test.company.com",
    "implicitWait": 10,
    "explicitWait": 30,
    "headless": false
}
```

| Property | Description |
|---|---|
| `browser` | `chrome` / `edge` / `firefox` |
| `url` | Application under test URL |
| `implicitWait` | Default implicit wait (seconds) |
| `explicitWait` | Explicit wait (seconds) |
| `headless` | Run browser headlessly |

### Appium Server Configuration

The framework starts and stops Appium automatically via `src/main/java/core/factory/AppiumServerFactory.java`. Depending on your OS, update the Node.js executable and Appium entry-point paths.

**Node.js executable:**

```java
.withNodeExecutable(new File("C:\\Program Files\\nodejs\\node.exe"))
```

| OS | Locate with | Typical path |
|---|---|---|
| Windows | `where node` | `C:\Program Files\nodejs\node.exe` |
| macOS (Intel) | `which node` | `/usr/local/bin/node` |
| macOS (Apple Silicon) | `which node` | `/opt/homebrew/bin/node` |

**Appium `main.js` location:**

```bash
npm root -g
```

Append `appium/build/lib/main.js` to the result, then update:

```java
.withAppiumJS(new File("<YOUR_PATH>/appium/build/lib/main.js"))
```

### TestNG Configuration — `testng.xml`

```xml
<suite name="Regression Suite" parallel="tests" thread-count="3">
```

| Property | Description |
|---|---|
| `parallel` | `tests` / `classes` / `methods` |
| `thread-count` | Number of parallel threads |
| `preserve-order` | Execute tests in declared order |

### Logging Configuration

Configure log level, file/console output, and rolling policies in `src/main/resources/log4j2.xml`. Logs are generated under `logs/android/`, `logs/ios/`, and `logs/web/`.

### Application & Report Paths

- Place APK/IPA files under `apps/` and reference them in `mobile-config.json`
- Reports are generated under `reports/` (`ExtentReport.html`, `ExecutionSummary.html`, `PerformanceReport.html`)
- Screenshots for failed tests are saved under `screenshots/`

### Pre-Run Checklist

- [ ] Java, Maven, Git, Node.js, Appium installed
- [ ] UiAutomator2 / XCUITest drivers installed
- [ ] Android SDK configured and device connected
- [ ] `mobile-config.json` and `web-config.json` updated
- [ ] Node.js and Appium `main.js` paths updated (if required)
- [ ] APK/IPA copied into `apps/`
- [ ] `testng.xml` configured
- [ ] `mvn clean compile` succeeds

---

## 10. Running Tests

Tests can be run via **IntelliJ IDEA**, **Maven**, or **Jenkins**.

### Verify Devices

```bash
adb devices                     # Android
xcrun xctrace list devices      # iOS (macOS only)
emulator -list-avds             # List available emulators
emulator -avd Pixel_9_API_35    # Start a specific emulator
```

### Start Appium (manual, if not auto-managed)

```bash
appium
# Appium REST http interface listener started
# Default: http://127.0.0.1:4723
```

### Run from IntelliJ IDEA

Open `src/test/java` → select a test (e.g. `LoginTest.java`) → right-click → **Run**.

The framework will read configuration, start Appium, initialize the driver, execute tests, generate reports, and tear down the session automatically.

### Run via Maven

| Task | Command |
|---|---|
| Run all tests | `mvn clean test` |
| Android tests | `mvn test -Dplatform=android` |
| iOS tests | `mvn test -Dplatform=ios` |
| Web tests (Chrome) | `mvn test -Dbrowser=chrome` |
| Web tests (Edge) | `mvn test -Dbrowser=edge` |
| Web tests (Firefox) | `mvn test -Dbrowser=firefox` |
| Run a specific suite | `mvn test -DsuiteXmlFile=testng.xml` |
| Run smoke suite | `mvn test -DsuiteXmlFile=Smoke.xml` |
| Run regression suite | `mvn test -DsuiteXmlFile=Regression.xml` |
| Run a single class | `mvn -Dtest=LoginTest test` |
| Run multiple classes | `mvn -Dtest=LoginTest,DashboardTest test` |
| Run a single method | `mvn -Dtest=LoginTest#verifyLogin test` |

### Parallel Execution

Configure in `testng.xml`:

```xml
<suite name="Regression" parallel="classes" thread-count="5">
```

Supported modes: `parallel="tests"`, `parallel="classes"`, `parallel="methods"`

### Framework Execution Flow

```
                                   Start Execution
                                         │
                                         ▼
                              Read Configuration Files
                                         │
                                         ▼
                             Initialize Logging (Log4j2)
                                         │
                                         ▼
                                Start Appium Server
                                         │
                                         ▼
                                   Create Driver
                                         │
                   ┌─────────────────────┼─────────────────────┐
                   ▼                     ▼                     ▼
           Android Driver           iOS Driver             Web Driver
          (UiAutomator2)            (XCUITest)        (Chrome / Edge / Firefox)
                   │                     │                     │
                   └─────────────────────┼─────────────────────┘
                                         ▼
                              Initialize Controllers
                                         │
                                         ▼
                              Initialize Page Objects
                                         │
                                         ▼
                               Execute Test Cases
                                         │
                                         ▼
                                  Capture Logs
                                         │
                                         ▼
                         Capture Screenshots (on failure)
                                         │
                                         ▼
                             Generate Extent Report
                                         │
                                         ▼
                            Generate Performance Report
                                         │
                                         ▼
                                   Close Driver
                                         │
                                         ▼
                                  Stop Appium Server
                                         │
                                         ▼
                                Execution Complete
```

### Stopping Execution

Press `Ctrl + C` to stop a manually started Appium server or an in-progress console execution. Appium instances managed by the framework shut down automatically after test completion.

---

## 11. Reports, Logs & Screenshots

### Extent Reports

Generated automatically after each run under `reports/`:

- `ExtentReport.html` — interactive dashboard with pass/fail breakdown, categories, device/platform/browser info, screenshots, and stack traces
- `ExecutionSummary.html` — start/end time, total/passed/failed/skipped counts, total duration
- `PerformanceReport.html` — per-test execution time, slowest/fastest test, average duration

**Sample summary:**

```
Hybrid Automation Framework Report
Total Tests : 45   Passed : 43   Failed : 2   Skipped : 0   Duration : 18 Minutes
```

### Logs

Log4j2 generates platform-segmented logs under `logs/android/`, `logs/ios/`, and `logs/web/`, each capturing test start/end, driver lifecycle, UI actions, waits, performance data, errors, and exceptions.

```
09:30:15 INFO  Driver Started
09:30:16 INFO  Launching Application
09:30:22 INFO  Clicking Login Button
09:30:27 INFO  Login Successful
09:30:35 INFO  Driver Closed
```

### Screenshots

Automatically captured on test failure and attached to the Extent Report:

```
screenshots/
    LoginTest_20260721_101530.png
    DashboardTest_20260721_102015.png
```

---

## 12. Adding a New Test

```
Create Page Object → Add Locators → Create Page Methods
     → Create Test Class → Update testng.xml → Execute Test
```

1. **Create a Page Object** in `src/main/java/pages` containing element locators, page actions, and business logic.
2. **Add locators** using ID, Accessibility ID, XPath, CSS Selector (web), Class Name, or Name — never store locators inside test classes.
3. **Create reusable page methods** (e.g. login, logout, search, submit) to centralize UI interactions and simplify maintenance.
4. **Create a test class** in `src/test/java` that extends the appropriate base class, initializes page objects, and performs assertions — keeping business logic in the Page Objects.
5. **Update `testng.xml`** to register the new test class within the relevant suite (smoke, regression, etc.).
6. **Run the test** via IntelliJ, Maven, TestNG suite, or Jenkins pipeline.

---

## 13. Troubleshooting

| Symptom | Likely Cause | Fix |
|---|---|---|
| `adb devices` shows nothing | USB debugging disabled, driver issue, or ADB stuck | Enable USB debugging on the device; run `adb kill-server && adb start-server && adb devices` |
| Appium fails to start / port in use | Another Appium instance already running on port `4723` | Stop other instances; ensure only one Appium server is active |
| `mvn clean compile` fails | Missing/incompatible Java version or unresolved dependencies | Confirm `java -version` shows 17.x; rerun `mvn clean install` |
| Appium can't find Node.js | Hardcoded Node path in `AppiumServerFactory.java` doesn't match this machine | Run `where node` (Windows) or `which node` (macOS) and update `.withNodeExecutable(...)` |
| Appium can't find `main.js` | Global npm path differs from the hardcoded value | Run `npm root -g`, append `appium/build/lib/main.js`, update `.withAppiumJS(...)` |
| App fails to launch on device | Wrong `appPackage`/`appActivity` (Android) or `bundleId` (iOS) | Verify these values match your APK/IPA exactly |
| iOS driver can't connect | Xcode hasn't trusted the device, or WebDriverAgent isn't installed | Trust the device in Xcode; verify with `xcrun xctrace list devices` |
| Web tests can't reach the app | Incorrect `url` in `web-config.json`, or wrong `browser` value | Confirm the URL is reachable manually and the browser value is `chrome`/`edge`/`firefox` |
| Tests time out intermittently | Implicit/explicit waits too short for the environment | Increase `implicitWait` / `explicitWait` in `web-config.json`, or `newCommandTimeout` in `mobile-config.json` |
| Reports/screenshots missing after a run | `reports/`, `logs/`, or `screenshots/` folders not writable, or run was interrupted | Verify folder permissions; let the run complete without killing the process mid-execution |

---

## 14. Best Practices

- Create one business flow per test case
- Avoid `Thread.sleep()` — use explicit waits
- Store all locators inside Page Objects, never in test classes
- Reuse existing controller methods rather than duplicating logic
- Keep test methods short, focused, and readable
- Use descriptive, consistent test names
- Separate test data from test logic
- Keep assertions within test classes only
- Log key actions to simplify debugging
- Keep only one Appium server instance running (port `4723`)
- Verify device connectivity before execution
- Run `mvn clean test` after any dependency update
- Keep `mobile-config.json` and `web-config.json` synchronized with your environment
- Review the Extent Report after every run to investigate failures

---

## 15. Naming Conventions

| Type | Examples |
|---|---|
| Page Objects | `LoginPage`, `DashboardPage`, `SettingsPage` |
| Test Classes | `LoginTest`, `DashboardTest`, `SettingsTest` |
| Test Methods | `verifyLogin()`, `verifyLogout()`, `verifyUserCanSearch()`, `verifyPayment()`, `verifySettingsSaved()` |

Following these conventions keeps the framework organized, scalable, and easy to maintain.

---

## 16. License

Distributed under the **MIT License**.
