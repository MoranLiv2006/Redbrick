package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class People {

    @FindBy(how = How.CSS, using = "h1[class='type-h1 border-l-2 border-l-secondary pl-3 md:pl-4 lg:pl-6']")
    public WebElement txt_peopleTitle;

    @FindBy(how = How.CSS, using = "article[class='portable-text max-w-cols10 [&>p]:md:max-w-cols6 [&>p]:max-w-[27rem] max-w-cols10 [&>p]:md:max-w-cols6 [&>p]:max-w-[27rem] align-center [&>p]:align-center'] h3[class='type-h3'] span")
    public WebElement txt_h3Title;

    @FindBy(how = How.CSS, using = "p[class='type-b1 text-center'] span")
    public WebElement txt_h3Description;

    @FindBy(how = How.CSS, using = "body > div:nth-child(1) > div:nth-child(1) > div:nth-child(4) > main:nth-child(2) > section:nth-child(3) > div:nth-child(1) > div:nth-child(2) > section:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > h2:nth-child(1)")
    public WebElement txt_strategicLeadershipTitle;

    @FindBy(how = How.CSS, using = "body > div:nth-child(1) > div:nth-child(1) > div:nth-child(4) > main:nth-child(2) > section:nth-child(3) > div:nth-child(1) > div:nth-child(2) > section:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > article:nth-child(1) > p:nth-child(1)")
    public WebElement txt_strategicLeadershipDescription;

    @FindBy(how = How.CSS, using = "h5[class='font-base type-md cardsDesktop:type-h5 cardsDesktop:mt-2 mt-1 font-semibold']")
    public List<WebElement> list_leadersNames;
//
}
