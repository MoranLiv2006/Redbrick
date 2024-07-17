package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class Companies {

    @FindBy(how = How.CSS, using = "div[class='m-0 flex flex-initial list-none flex-col items-start justify-start gap-2']")
    public List<WebElement> list_companiesButtons;

    @FindBy(how = How.CSS, using = "div[class='relative mb-3 h-6 md:h-8'] img")
    public WebElement image_companyLogo;

    @FindBy(how = How.CSS, using = "h1[class='type-h1']")
    public WebElement txt_companySlogan;

    @FindBy(how = How.CSS, using = "a[class='link-button link-button large']")
    public WebElement btn_visitCompany;

    @FindBy(how = How.CSS, using = "p[class='type-b1 text-center'] span")
    public List<WebElement> list_companyUsagesSummary;
}
