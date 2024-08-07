package com.example.tollchecker.actions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class BrowserActions {
    private static final String BASE_URL = "https://check.bgtoll.bg/#/";
    private WebDriver driver;
    private WebDriverWait wait;

    public void setUp() {
        ChromeOptions chromeOptions = new ChromeOptions();
        // To run in headless mode (no UI) and disable GPU acceleration
        chromeOptions.addArguments("--headless");
        chromeOptions.addArguments("--disable-gpu");
        driver = getWebDriver(chromeOptions);
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        driver.get(BASE_URL);
    }

    public static WebDriver getWebDriver(ChromeOptions options) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        return driver;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public WebDriverWait getWait() {
        return wait;
    }

    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}