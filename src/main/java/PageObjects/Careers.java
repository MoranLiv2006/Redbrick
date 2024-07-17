package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class Careers {

    @FindBy(how = How.CSS, using = "h1[class='type-h1 border-l-2 border-l-secondary pl-3 md:pl-4 lg:pl-6 sm:flex-[0_1_50%] sm:w-[50%]']")
    public WebElement txt_careerTitle;

    @FindBy(how = How.XPATH, using = "//*[@class='relative w-1/3']//img")
    public List<WebElement> list_titleImages;

    @FindBy(how = How.XPATH, using = "div > div:nth-child(2) > h3:nth-child(2)")
    public List<WebElement> list_offices;

    @FindBy(how = How.CSS, using = "div[class='portable-text [&_p]:max-w-[calc(theme(width.cols5)-theme(spacing.2))] [&_p]:md:max-w-cols8'] h3")
    public WebElement txt_perksTitle;

    @FindBy(how = How.CSS, using = "div[class='flex w-full flex-col items-start justify-start overflow-hidden rounded-md bg-white p-3'] h5")
    public List<WebElement> list_perks;
//
}
