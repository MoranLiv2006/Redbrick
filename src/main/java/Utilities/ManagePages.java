package Utilities;

import PageObjects.ContactUs;
import PageObjects.Header;
import PageObjects.HomePage;
import org.openqa.selenium.support.PageFactory;

public class ManagePages extends Base {

    public static void initPages() {
        homePage = PageFactory.initElements(webDriver, HomePage.class);
        header = PageFactory.initElements(webDriver, Header.class);
        contactUs = PageFactory.initElements(webDriver, ContactUs.class);
    }
}
