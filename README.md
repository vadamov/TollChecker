**TollChecker is a Java-based tool designed to verify toll payments for vehicles in Bulgaria. 
This project is an educational exercise created to demonstrate automated testing and web interaction using Selenium WebDriver and TestNG.**

**Automated Toll Verification**: Checks the toll payment status for vehicles registered in Bulgaria.

**Headless Browser Testing**: Utilizes headless Chrome for streamlined, UI-free operation.

**Comprehensive Test Suite**: Includes various test cases to validate toll statuses and ensure accurate results.

**Result Handling**: Differentiates between valid and expired toll results, with clear console outputs.

This project was developed as a practice exercise to explore the capabilities of Selenium WebDriver for automating web interactions and to practice writing automated tests with TestNG.
It’s a great example of how to use these tools for web testing, though it is not intended for production use.

**Performance**

TollChecker is optimized for performance, handling a large number of checks and number plates with impressive speed.

**Prerequisites**
**Java JDK 17**: Ensure you have Java Development Kit 17 installed.

**Maven**: Apache Maven is required to build the project.

**Usage**
To check the toll payment statuses:

**1**.Enter the Vehicle Number Plate: The test cases will input various number plates into the toll check website.

**2**.Check Status: The system will verify if the toll is paid and handle the result accordingly.

**3**.View Results: Results are printed to the console, showing valid and expired tolls.

**Customizing Data**
The number plates used in the tests are provided in the **DataProviderClass**. You can modify or add new number plates by editing the class.


**Code Overview**
**BrowserActions**: Manages browser setup, including headless Chrome configuration and WebDriver initialization.

**TollPage**: Contains methods for interacting with the web page, such as entering number plates and clicking buttons.

**DateUtils**: Provides utility methods for parsing and formatting date information.

**ResultHandler**: Handles and stores the results of toll status checks, differentiating between valid and expired results.

**StatusValidator**: Validates that the toll status displayed on the page matches the expected status.

**TollValidation**: Handles the validation of toll statuses, including error handling and result categorization.

**DataProviderClass**: Supplies test data for the toll checks, including number plates and expected results.

**TollCheckTest**: Contains the test cases that run the toll verification process using the provided data.
