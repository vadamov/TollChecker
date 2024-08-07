package utils;

import com.example.tollchecker.pages.TollPage;
import com.example.tollchecker.utils.DateUtils;
import com.example.tollchecker.validations.StatusValidator;
import com.example.tollchecker.validations.ResultHandler;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.LocalDateTime;

import static org.testng.AssertJUnit.fail;

public class TollValidation {

    public static void validateTollStatus(WebDriverWait wait, TollPage tollCheckPage, String numberPlate, String expectedStatus, ResultHandler resultHandler) {
        try {
            // Wait until the element becomes visible
            WebElement statusElement = wait.until(ExpectedConditions.visibilityOfElementLocated(TollPage.STATUS_PAID));
            statusElement = wait.until(ExpectedConditions.visibilityOf(tollCheckPage.getStatusElement()));
            // Validate if the actual status matches the expected status
            StatusValidator.validateStatus(statusElement, expectedStatus, numberPlate);

            // Check if date info is available and parse it
            WebElement info = tollCheckPage.getDateElement();
            LocalDateTime date = null;
            if (info.isDisplayed()) {
                date = DateUtils.parseDate(info.getText());
            }

            resultHandler.handleResult(numberPlate.toUpperCase(), date);
            //Handle exceptions
        } catch (TimeoutException e) {
            resultHandler.handleExpiredResult(numberPlate.toUpperCase());
            throw new AssertionError("EXPIRED " + numberPlate.toUpperCase(), e);

        } catch (NoSuchElementException e) {
            resultHandler.handleExpiredResult(numberPlate.toUpperCase());
            throw new AssertionError("NoSuchElement: " + numberPlate.toUpperCase(), e);

        } catch (Exception e) {
            resultHandler.handleExpiredResult(numberPlate.toUpperCase());
            throw new AssertionError("Unexpected result for: " + numberPlate.toUpperCase() + ": " + e.getMessage(), e);
        }
    }
}
