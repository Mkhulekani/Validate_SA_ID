
# South African ID Validator

[![Java](https://img.shields.io/badge/Java-17%2B-blue)](https://www.java.com)
[![Gradle](https://img.shields.io/badge/Gradle-7.4+-brightgreen)](https://gradle.org)
[![License](https://img.shields.io/badge/License-MIT-yellow)](LICENSE)

A Java application that validates South African ID numbers according to official specifications.

## Features

- Complete validation of all ID components
- Detailed validation output
- Simple console interface
- Comprehensive test coverage

## Installation

https://github.com/Mkhulekani/Validate_SA_ID.git
cd validate_sa_id
./gradlew build
Usage


# Run with Gradle
./gradlew run

# Or run the built JAR
java -jar build/libs/validate_sa_id.jar
Example Session
SOUTH AFRICAN ID VALIDATOR
==========================

Enter ID number (or 'quit' to exit): 9202204720082

Validation Results:
-----------------
✓ Length (13 digits)
✓ Numeric format
✓ Valid date (20 Feb 1992)
✓ Gender digits
✓ Citizenship digit
✓ Luhn checksum

Additional Information:
----------------------
Date of Birth : 20 February 1992
Gender        : Female
Citizenship   : SA Citizen

FINAL VERDICT: VALID SA ID
Testing
Download
./gradlew test
License
MIT License

