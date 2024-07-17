package Utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class UiActions extends Base{

    public static void clickWebElement(WebElement webElement) {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(webElement));
        webElement.click();
    }

    public static String getTextFromElement(WebElement webElement) {
        webDriverWait.until(ExpectedConditions.visibilityOf(webElement));
        return webElement.getText();
    }

    public static void writeTextToElement(WebElement webElement, String text) {
        webDriverWait.until(ExpectedConditions.visibilityOf(webElement));
        webElement.sendKeys(text);
    }

    public static void chooseOptionFromDropdown(WebElement dropdownElement, String optionToChoose) {
        webDriverWait.until(ExpectedConditions.visibilityOf(dropdownElement));
        Select select = new Select(dropdownElement);
        for (WebElement webElement : select.getOptions()) {
            System.out.println(getTextFromElement(webElement));
        }
    }

    public static void scrollElementIntoView(WebElement webElement) {
        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        js.executeScript("arguments[0].scrollIntoView(true);", webElement);
        webDriverWait.until(ExpectedConditions.visibilityOf(webElement));
    }
}
