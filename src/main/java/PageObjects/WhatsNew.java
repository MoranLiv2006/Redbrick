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
    public List<WebElement> list_h3Titles;

    @FindBy(how = How.CSS, using = "#__next > div > div.mt-\\[calc\\(theme\\(magic\\.headerHeight\\.initial\\)\\*-1\\)\\].w-full.pt-\\[theme\\(magic\\.headerHeight\\.initial\\)\\].w-full.md\\:mt-\\[calc\\(theme\\(magic\\.headerHeight\\.md\\)\\*-1\\)\\].md\\:pt-\\[theme\\(magic\\.headerHeight\\.md\\)\\].flex-grow.flex.flex-col > main > section > div > div > div:nth-child(3) > div > div > a > span > div > div > h3")
    public List<WebElement> list_pressH3Titles;
}
