import Utilities.ApiActions;
import Utilities.Base;
import Utilities.UiActions;
import org.testng.annotations.Test;

import static Utilities.ApiActions.getChuckNorrisJoke;

public class RedBrickMiniAutomation extends Base {

    @Test
    public void test() throws InterruptedException {
        System.out.println("dd");

        UiActions.clickWebElement(header.btn_contactUs);
        System.out.println(UiActions.getTextFromElement(contactUs.txt_contactUsTitle));

        UiActions.writeTextToElement(contactUs.input_name, getMY_NAME());
        UiActions.writeTextToElement(contactUs.input_email, getMY_EMAIL());
        String messageText =
                "Hi, my name is Moran Liv and I'm a QA Automation engineer with almost 4 years of experience and almost" +
                        " 2 years of manual QA experience.\n" +
                        "I've made this simple automation on 'RedBrick' website to demonstrate my automation skills.\n" +
                        "Here is a 'Chuck Norris joke' for a funny closer: \n";
        UiActions.writeTextToElement(contactUs.input_message, messageText + getChuckNorrisJoke() + "\n\n" +
                "Would love to hear back from you.\nMoran Liv");

        Thread.sleep(15000);
    }
}
