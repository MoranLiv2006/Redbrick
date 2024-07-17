package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class HomePage {

    @FindBy(how = How.CSS, using = "#lottie > svg")
    public WebElement image_redbrickLogo;

    @FindBy(how = How.CSS, using = "h1[class='type-h1']")
    public WebElement txt_homepageTitle;

    @FindBy(how = How.CSS, using = "p[class='type-l1']")
    public WebElement txt_titleDescription;

    @FindBy(how = How.CSS, using = "div[class='portable-text md:max-w-[calc(theme(width.cols5)-theme(spacing.8))]']")
    public List<WebElement> list_redbrickBulletPoints;
}
