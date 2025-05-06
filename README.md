# South African ID Validator

[![Java](https://img.shields.io/badge/Java-17%2B-blue)](https://www.java.com)
[![Gradle](https://img.shields.io/badge/Gradle-7.4+-brightgreen)](https://gradle.org)
[![License](https://img.shields.io/badge/License-MIT-yellow)](LICENSE)

A Java application that validates South African ID numbers according to the official specifications, including:
- Length verification (13 digits)
- Date of birth validation (YYMMDD)
- Citizenship digit check
- Luhn algorithm checksum validation
- Gender identification

## Features

✅ **Complete Validation**  
Checks all components of a SA ID number:
- Length and numeric format
- Valid date of birth
- Citizenship status (0=SA Citizen, 1=Permanent Resident)
- Gender (determined by 4-digit sequence)
- Luhn checksum verification

✅ **Detailed Output**  
Provides comprehensive validation results including:
- Pass/fail status for each validation component
- Extracted birth date
- Determined gender
- Citizenship status

✅ **User-Friendly Interface**  
Simple console interface with:
- Clear prompts
- Color-coded results
- Continuous validation mode

## Installation

1. **Prerequisites**:
   - Java 17 or higher
   - Gradle 7.4+

2. **Clone the repository**:
   
   git clone https://github.com/yourusername/validate_sa_id.git
   cd validate_sa_id
Build the project:

bash
Copy
Download
./gradlew build
Usage
Running the Application
bash
Copy
Download
# Run with Gradle
./gradlew run

# Or run the built JAR
java -jar build/libs/validate_sa_id.jar
Example Output
Copy
Download
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

FINAL VERDICT: ✅ VALID SA ID
Testing
The project includes JUnit 5 tests. Run them with:

bash
Copy
Download
./gradlew test
Test cases cover:

Valid ID numbers

Invalid formats

Edge cases

Special scenarios

Implementation Details
The validator implements:

Date Validation - Checks if YYMMDD is a valid date

Luhn Algorithm - Mathematical checksum verification

Gender Detection - Based on digits 7-10

Citizenship Check - Digit 11 (0 or 1)

Contributing
Contributions are welcome! Please:

Fork the repository

Create a feature branch

Submit a pull request

License
This project is licensed under the MIT License - see the LICENSE file for details.

<div align="center"> <i>Built with Java and Gradle</i> </div> ```
Additional Files to Include:
LICENSE (Create a file named LICENSE in your repo root):

MIT License

Copyright (c) [year] [fullname]

Permission is hereby granted...
[Standard MIT License text]
.gitignore (For Java/Gradle projects):

.gradle/
build/
.idea/
*.iml
*.class
.DS_Store
How to Add These Files:
Create README.md in your project root

Add the license file

Update the .gitignore

Commit and push:
git add README.md LICENSE .gitignore
git commit -m "Add project documentation"
git push origin main
This README will:

Clearly explain your project

Showcase its features


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

To complete your project setup:

1. Create `README.md` and paste this content
2. Create `LICENSE` file with MIT License text
3. Update `.gitignore` with standard Java/Gradle entries
