# JUnit-Test-Development
This repository contains solutions for the first assignment of the Software Testing course at the University of Tehran. The focus is on writing tests using JUnit, including developing tests for a Gradle project, testing a university unit selection system, and identifying and fixing issues in existing tests.


## Table of Contents

- [Introduction](#introduction)
- [Assignment Overview](#assignment-overview)
- [Prerequisites](#prerequisites)
- [Installation](#installation)
- [Usage](#usage)
- [Project Structure](#project-structure)
- [Results and Analysis](#results-and-analysis)
- [Report](#report)
- [License](#license)

## Introduction

This project is part of the Software Testing course and aims to provide hands-on experience with JUnit testing. The assignment is divided into three main tasks, each focusing on different aspects of test development and correction using JUnit.

## Assignment Overview

### Question 1: Writing Tests for an Existing Gradle Project

- **Task:** Write JUnit tests for all classes in the project.
- **Objective:** Gain familiarity with setting up and running tests in a Gradle project using JUnit.

### Question 2: Testing a University Unit Selection System

- **Task:** Write tests for a provided codebase that simulates a university unit selection system. The system must check prerequisites for a course based on a student's grades and course list.
- **Objective:** Develop and validate test cases to ensure the system correctly handles course prerequisites.

### Question 3: Identifying and Correcting Issues in Existing Tests

- **Task:** Review a set of given tests that contain issues, identify the problems, and provide corrections with all possible solutions.
- **Objective:** Improve your ability to analyze and fix flawed tests, enhancing the overall reliability of the test suite.

## Prerequisites

Before running the tests, ensure you have the following installed:

- Java Development Kit (JDK) 8 or higher
- Gradle
- An IDE with JUnit support (e.g., IntelliJ IDEA, Eclipse)

## Installation

To set up the project locally, follow these steps:

1. Clone the repository:
    ```sh
    git clone https://github.com/PouyaGohari/JUnit-Test-Development.git
    cd JUnit-Test-Development
    ```

2. Ensure that Gradle is installed and set up on your system.

3. Open the project in your IDE and allow it to download the necessary dependencies.

## Usage

To run the tests:

1. Open your IDE and navigate to the test directory.
2. Right-click on the test directory or specific test class and select "Run" to execute the tests.
3. Review the test results in the console output or test runner tab of your IDE.

Alternatively, you can run all tests using Gradle from the command line:

```sh
./gradlew test
```
## Project Structure

```bash
JUnit-Test-Development/
├── src/
│   ├── main/               # Source files for the projects
│   └── test/               # JUnit test files
└── build.gradle            # Gradle build file
```
## Results and Analysis

- **Question 1:** Developed comprehensive test cases for each class in the CA1 project. Verified their correctness using JUnit.
- **Question 2:** Successfully wrote tests for the university unit selection system, ensuring that prerequisite checks functioned correctly.
- **Question 3:** Identified issues in the given tests, such as incorrect assertions and logical errors, and provided multiple solutions to correct these tests.

## Report

A detailed report documenting the research, methodology, implementation, and analysis for each part of the assignment is available [here](Report/Report.pdf).

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.


