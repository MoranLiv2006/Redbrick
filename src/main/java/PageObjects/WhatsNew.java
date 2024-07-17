package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class WhatsNew {

    @FindBy(how = How.CSS, using = "h1[class='type-h1 border-l-2 border-l-secondary pl-3 md:pl-4 lg:pl-6 !pl-0 !border-none !type-archiveHeading']")
    public WebElement txt_whatsNewTitle;

    @FindBy(how = How.CSS, using = "div[class='box-px relative flex flex-row flex-nowrap items-center justify-start gap-1 overflow-y-hidden overflow-x-scroll [-ms-overflow-style:none] [scrollbar-width:none] [&::-webkit-scrollbar]:hidden'] button")
    public List<WebElement> list_categoriesButtons;

    @FindBy(how = How.CSS, using = "div.flex.flex-col.flex-nowrap.gap-2.px-2.py-2.sm\\:px-3.md\\:py-3 > h3")
    public List<WebElement> list_h3Title;
//
//
}
