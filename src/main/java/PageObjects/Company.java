package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class Company {

    @FindBy(how = How.CSS, using = "h1[class='type-h1 border-l-2 border-l-secondary pl-3 md:pl-4 lg:pl-6']")
    public WebElement txt_companyTitle;

    @FindBy(how = How.CSS, using = "article[class='portable-text max-w-cols10 [&>p]:md:max-w-cols6 [&>p]:max-w-[27rem] max-w-cols10 [&>p]:md:max-w-cols6 [&>p]:max-w-[27rem] align-center [&>p]:align-center'] h3[class='type-h3'] span")
    public WebElement txt_h3Title;

    @FindBy(how = How.CSS, using = "p[class='type-b1 text-center'] span")
    public WebElement txt_h3Description;

    @FindBy(how = How.CSS, using = "div[class='portable-text md:max-w-[calc(theme(width.cols5)-theme(spacing.8))]']")
    public List<WebElement> list_companyCharacteristics;

    @FindBy(how = How.CSS, using = "div[class='portable-text [&_p]:max-w-[calc(theme(width.cols5)-theme(spacing.2))] [&_p]:md:max-w-cols8'] h3")
    public WebElement txt_nextAcquisitionTitle;

    @FindBy(how = How.CSS, using = "div[class='flex w-full flex-col items-start justify-start overflow-hidden rounded-md bg-white p-3'] h5")
    public List<WebElement> list_nextAcquisitionObjects;
}
