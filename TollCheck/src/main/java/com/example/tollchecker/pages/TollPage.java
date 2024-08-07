package com.example.tollchecker.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TollPage {
    private final WebDriver driver;

    // Locators
    public static final By INPUT_FIELD = By.xpath("//input");
    public static final By CHECK_BUTTON = By.xpath("//button[text()='Проверка']");
    public static final By STATUS_PAID = By.xpath("//span[@class='cell--status paid']");
    public static final By DATE_FIELD = By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[3]/div/table/tbody/tr/td[5]");

    public TollPage(WebDriver driver) {
        this.driver = driver;
    }

    //Enters the provided number plate into the input field on the page
    public void enterNumberPlate(String numberPlate) {
        driver.findElement(INPUT_FIELD).sendKeys(numberPlate);
    }
public void clearInputField(){
        driver.findElement(INPUT_FIELD).clear();
}
    //Click on the check button
    public void clickCheckButton() {
        driver.findElement(CHECK_BUTTON).click();
    }

    public WebElement getStatusElement() {
        return driver.findElement(STATUS_PAID);
    }

    public WebElement getDateElement() {
        return driver.findElement(DATE_FIELD);
    }
}