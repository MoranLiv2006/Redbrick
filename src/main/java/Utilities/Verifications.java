package Utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.util.List;

public class Verifications extends Base {

    public static boolean verifyElementIsDisplayedAndEnabled(WebElement webElement) {
        webDriverWait.until(ExpectedConditions.visibilityOf(webElement));
        return webElement.isDisplayed() && webElement.isEnabled();
    }

    public static void verifyListIsLoadedCorrectly(List<WebElement> webElementList) {
        webDriverWait.until(ExpectedConditions.visibilityOfAllElements(webElementList));
        Assert.assertNotEquals(webElementList.size(), 0);
    }
}
