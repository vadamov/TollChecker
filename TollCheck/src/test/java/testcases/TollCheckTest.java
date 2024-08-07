package testcases;

import com.example.tollchecker.actions.BrowserActions;
import com.example.tollchecker.pages.TollPage;
import com.example.tollchecker.validations.ResultHandler;
import org.testng.annotations.*;
import utils.TollValidation;
import dataproviders.DataProviderClass;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TollCheckTest {
    private BrowserActions browserActions;
    private WebDriver driver;
    private WebDriverWait wait;
    private TollPage tollCheckPage;
    private ResultHandler resultHandler = new ResultHandler();

    @BeforeSuite
    public void setUp() {
        browserActions = new BrowserActions();
        browserActions.setUp();
        driver = browserActions.getDriver();
        wait = browserActions.getWait();
        tollCheckPage = new TollPage(driver);
    }

    @Test(dataProvider = "testData", dataProviderClass = DataProviderClass.class)
    public void testToll(String numberPlate, String expectedStatus) {
        tollCheckPage.clearInputField();
        tollCheckPage.enterNumberPlate(numberPlate);
        tollCheckPage.clickCheckButton();
        TollValidation.validateTollStatus(wait, tollCheckPage, numberPlate,
                expectedStatus, resultHandler);
    }

    @AfterSuite
    public void tearDownSuite() {
        resultHandler.printResults();
        browserActions.tearDown();
    }

}