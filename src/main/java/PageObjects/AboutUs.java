package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AboutUs {

    @FindBy(how = How.CSS, using = "h1[class='type-h1 border-l-2 border-l-secondary pl-3 md:pl-4 lg:pl-6']")
    public WebElement txt_aboutUsTitle;

    @FindBy(how = How.CSS, using = "div[class='align-center z-headerBackground sticky top-0 flex flex-row flex-nowrap justify-center gap-1 bg-yellow-50 px-3 py-2 md:px-8 md:py-[1.25rem] transition-shadow'] > div> a[href='/company']")
    public WebElement btn_companyCategory;

    @FindBy(how = How.CSS, using = "div[class='align-center z-headerBackground sticky top-0 flex flex-row flex-nowrap justify-center gap-1 bg-yellow-50 px-3 py-2 md:px-8 md:py-[1.25rem] transition-shadow'] > div> a[href='/people']")
    public WebElement btn_peopleCategory;

    @FindBy(how = How.CSS, using = "div[class='align-center z-headerBackground sticky top-0 flex flex-row flex-nowrap justify-center gap-1 bg-yellow-50 px-3 py-2 md:px-8 md:py-[1.25rem] transition-shadow'] > div> a[href='/values']")
    public WebElement btn_valuesCategory;
//
}
