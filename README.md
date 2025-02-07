Karnataka Tourism Website Automation

📌 Project Overview

This project automates the testing of the Karnataka Tourism Website using Selenium WebDriver with Java, ensuring seamless functionality and user experience. The framework follows industry best practices, leveraging TestNG for test execution and Extent Reports for detailed test reporting.

🛠️ Tech Stack

Language: Java

Automation Tool: Selenium WebDriver

Test Framework: TestNG

Reporting: Extent Reports

Build Tool: Maven

Version Control: Git

🚀 Features

Automated testing for critical workflows like searching destinations, booking tours, and user navigation.

Page Object Model (POM) for maintainability and reusability.

Data-driven testing using TestNG and Excel (if applicable).

Detailed Extent Reports with test execution status, screenshots, and logs.

Parallel Execution support using TestNG.

CI/CD integration (if required).

📂 Project Structure

KarnatakaTourismAutomation/
│-- src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── pages/          # Page Object Model classes
│   │   │   ├── utils/          # Utility classes (e.g., WebDriver setup, config)
│   ├── test/
│   │   ├── java/
│   │   │   ├── testcases/      # Test classes
│-- test-output/                 # Extent Reports
│-- pom.xml                      # Maven dependencies
│-- README.md                    # Project documentation

🔧 Prerequisites

Java JDK 8+

Maven installed

Google Chrome/Firefox (ensure WebDriver compatibility)

TestNG plugin installed in IDE (Eclipse/IntelliJ)

📌 Setup & Execution

Clone the Repository:

git clone https://github.com/Rafayal383/KarnatakTourismAutomation-Selenium.git
cd KarnatakTourismAutomation-Selenium

Install Dependencies:

mvn clean install

Run Tests:

mvn test

View Reports:

Navigate to test-output/ExtentReports/ to view the latest execution report.

📝 Reporting

Extent Reports provide an interactive and visually appealing report.

The reports include test status, screenshots on failure, and execution logs.

🤝 Contributing

Feel free to fork this repository and submit pull requests. Contributions are always welcome! 🚀

📄 License

This project is licensed under the MIT License.

📧 Contact

For any queries or suggestions, reach out via rafayalsanju@gmail.com.
