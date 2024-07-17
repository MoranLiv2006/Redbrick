package Utilities;

import PageObjects.*;
import org.openqa.selenium.support.PageFactory;

public class ManagePages extends Base {

    public static void initPages() {
        homePage = PageFactory.initElements(webDriver, HomePage.class);
        header = PageFactory.initElements(webDriver, Header.class);
        contactUs = PageFactory.initElements(webDriver, ContactUs.class);
        whatsNew = PageFactory.initElements(webDriver, WhatsNew.class);
        careers = PageFactory.initElements(webDriver, Careers.class);
        aboutUs = PageFactory.initElements(webDriver, AboutUs.class);
        values = PageFactory.initElements(webDriver, Values.class);
        people = PageFactory.initElements(webDriver, People.class);
    }
}
