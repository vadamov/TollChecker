package com.example.tollchecker.validations;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

/**
 * Utility class for validating the status of a toll check.
 * Provides method to compare the actual status displayed on the page with the expected status.
 */
public class StatusValidator {
    //Validates that the status displayed on the web page matches the expected status.
    public static void validateStatus(WebElement statusElement, String expectedStatus, String numberPlate) {
        String actualStatus = statusElement.getText();
        Assert.assertEquals(actualStatus, expectedStatus, "Status mismatch for plate: " + numberPlate);
    }
}