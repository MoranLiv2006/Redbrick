package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class Values {

    @FindBy(how = How.CSS, using = "h1[class='type-h1 border-l-2 border-l-secondary pl-3 md:pl-4 lg:pl-6']")
    public WebElement txt_valuesTitle;

    @FindBy(how = How.CSS, using = "h3[class='type-h3']")
    public WebElement txt_h3Title;

    @FindBy(how = How.CSS, using = "p[class='type-b1 text-center'] span")
    public WebElement txt_h3Description;

    @FindBy(how = How.CSS, using = "h2[class='type-h2']")
    public WebElement txt_ourMissionTitle;

    @FindBy(how = How.CSS, using = "div[class='portable-text [&_p]:max-w-[calc(theme(width.cols5)-theme(spacing.2))] [&_p]:md:max-w-cols8'] p")
    public WebElement txt_ourMissionDescription;

    @FindBy(how = How.CSS, using = "h2[class='type-h1 border-l-2 border-l-neutral-50 pl-3 md:pl-4 lg:pl-6']")
    public List<WebElement> list_missionTitles;

    @FindBy(how = How.CSS, using = "article[class='portable-text [&_p]:font-semibold']")
    public List<WebElement> list_missionArticles;

    @FindBy(how = How.XPATH, using = "//*[@id=\"__next\"]/div/div[3]/main/section[4]/div/div[2]/section/div/div[2]/div/div")
    public WebElement txt_techMissionDescription;

    @FindBy(how = How.XPATH, using = "//*[@id=\"__next\"]/div/div[3]/main/section[4]/div/div[2]/section/div/div[1]/figure/img")
    public WebElement image_techImage;

    @FindBy(how = How.XPATH, using = "//*[@id=\"__next\"]/div/div[3]/main/section[6]/div/div[2]/section/div/div[2]/div/div")
    public List<WebElement> list_impactMissionDescriptions;

    @FindBy(how = How.XPATH, using = "//*[@id=\"__next\"]/div/div[3]/main/section[6]/div/div[2]/section/div/div[1]/figure/img")
    public List<WebElement> list_impactImages;

    @FindBy(how = How.XPATH, using = "//*[@id=\"__next\"]/div/div[3]/main/section[9]/div/div[2]/section/div/div[2]/div/div")
    public List<WebElement> list_communityMissionDescriptions;

    @FindBy(how = How.XPATH, using = "//*[@id=\"__next\"]/div/div[3]/main/section[9]/div/div[2]/section/div/div[1]/figure/img")
    public List<WebElement> list_communityImages;

    @FindBy(how = How.CSS, using = "div.mt-\\[calc\\(theme\\(magic\\.headerHeight\\.initial\\)\\*-1\\)\\].w-full.pt-\\[theme\\(magic\\.headerHeight\\.initial\\)\\].w-full.md\\:mt-\\[calc\\(theme\\(magic\\.headerHeight\\.md\\)\\*-1\\)\\].md\\:pt-\\[theme\\(magic\\.headerHeight\\.md\\)\\].flex-grow.flex.flex-col > main > div.align-center.z-headerBackground.sticky.top-0.flex.flex-row.flex-nowrap.justify-center.gap-1.bg-yellow-50.px-3.py-2.md\\:px-8.md\\:py-\\[1\\.25rem\\].transition-shadow.shadow-md > div:nth-child(2)")
    public WebElement btn_stickyHeaderPeople;
}
