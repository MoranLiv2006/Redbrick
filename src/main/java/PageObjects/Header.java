package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Header {

    @FindBy(how = How.CSS, using = "button[id='radix-\\:R156\\:-trigger-trigger-0']")
    public WebElement btn_companies;

    @FindBy(how = How.CSS, using = "li[class='relative flex h-full flex-row flex-nowrap items-center'] a[href='/company']")
    public WebElement btn_aboutUs;

    @FindBy(how = How.CSS, using = "li[class='relative flex h-full flex-row flex-nowrap items-center'] a[href='/careers']")
    public WebElement btn_careers;

    @FindBy(how = How.CSS, using = "li[class='relative flex h-full flex-row flex-nowrap items-center'] a[href='/whats-new']")
    public WebElement btn_whatsNew;

    @FindBy(how = How.CSS, using = "li[class='relative flex h-full flex-row flex-nowrap items-center'] a[href='/contact-us']")
    public WebElement btn_contactUs;

    @FindBy(how = How.CSS, using = "div[class='z-nav flex w-full flex-row flex-wrap items-center justify-start'] a[class='row-wrap w-21 flex cursor-pointer items-center justify-start']")
    public WebElement btn_homepage;
}
