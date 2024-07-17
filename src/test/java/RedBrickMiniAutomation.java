import Utilities.Base;
import Utilities.UiActions;
import Utilities.Verifications;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.stream.Collectors;

import static Utilities.ApiActions.getChuckNorrisJoke;

public class RedBrickMiniAutomation extends Base {

    @Test
    public void homePageTest() {
        //Verifying 'Redbrick' logo is display on the homepage
        Assert.assertTrue(Verifications.verifyElementIsDisplayedAndEnabled(homePage.image_redbrickLogo));

        //Verifying 'Redbrick' motto is as expected
        Assert.assertEquals(UiActions.getTextFromElement(homePage.txt_homepageTitle), "We build software that helps digital entrepreneurs thrive");

        //Verifying the title description isn't null and making sure it contains the year when 'Redbrick' founded.
        Assert.assertNotNull(UiActions.getTextFromElement(homePage.txt_titleDescription));
        Assert.assertTrue(UiActions.getTextFromElement(homePage.txt_titleDescription).contains("2011"));

        //Making sure the 'Redbrick' company bullet-points list is loaded correctly and each bullet point isn't null,
        // and finally scroll to each point and print it
        Verifications.verifyListIsLoadedCorrectly(homePage.list_redbrickBulletPoints);
        for (WebElement webElement : homePage.list_redbrickBulletPoints) {
            UiActions.scrollElementIntoView(webElement);
            Assert.assertNotNull(UiActions.getTextFromElement(webElement));
            System.out.println(UiActions.getTextFromElement(webElement));
        }
    }

    @Test
    public void aboutUsPageTest() {
        //From the header, entering to the "about us" page
        UiActions.clickWebElement(header.btn_aboutUs);

        //Verifying the "about us" title is as expected
        Assert.assertEquals(UiActions.getTextFromElement(aboutUs.txt_aboutUsTitle), "We are Redbrick");

        //Focusing on the "values" part
        UiActions.clickWebElement(aboutUs.btn_valuesCategory);

        //Verifying values title and description are as expected
        Verifications.verifyElementIsDisplayedAndEnabled(values.txt_valuesTitle);
        Assert.assertEquals(UiActions.getTextFromElement(values.txt_valuesTitle), "We believe in being leaders");
        Assert.assertEquals(UiActions.getTextFromElement(values.txt_h3Title), "Our global impact");
        Assert.assertEquals(UiActions.getTextFromElement(values.txt_h3Description),
                "We support thousands of entrepreneurs with technology that gives them a competitive edge to succeed.");

        //Verifying 'Redbrick' mission values are as expected per mission type
        Assert.assertEquals(UiActions.getTextFromElement(values.txt_ourMissionTitle), "Our mission");
        Assert.assertEquals(UiActions.getTextFromElement(values.txt_ourMissionDescription), "Redbrick is " +
                "committed to supporting digital entrepreneurs with innovative solutions that level the playing field " +
                "and create equal opportunity to succeed within their industry. We’re building a pathway for the next " +
                "generation of business leaders. That means we also have a responsibility to:");
        for (WebElement missionTitle : values.list_missionTitles) {
            switch (UiActions.getTextFromElement(missionTitle)) {
                case "Tech": {
                    UiActions.scrollElementIntoView(missionTitle);
                    System.out.println("Mission: " + UiActions.getTextFromElement(missionTitle) + " - " +
                            UiActions.getTextFromElement(values.list_missionArticles.get(0)));
                    Assert.assertEquals(UiActions.getTextFromElement(missionTitle), "Tech");
                    Verifications.verifyElementIsDisplayedAndEnabled(values.image_techImage);
                    Assert.assertNotNull(UiActions.getTextFromElement(values.txt_techMissionDescription));
                    System.out.println(UiActions.getTextFromElement(values.txt_techMissionDescription));
                    System.out.println("");
                    break;
                }
                case "Impact": {
                    System.out.println("Mission: " + UiActions.getTextFromElement(missionTitle) + " - " +
                            UiActions.getTextFromElement(values.list_missionArticles.get(1)));
                    Assert.assertEquals(UiActions.getTextFromElement(missionTitle), "Impact");
                    for (WebElement missionImage : values.list_impactImages) {
                        Assert.assertTrue(Verifications.verifyElementIsDisplayedAndEnabled(missionImage));
                    }
                    for (WebElement impactMissionDescription : values.list_impactMissionDescriptions) {
                        Assert.assertNotNull(UiActions.getTextFromElement(impactMissionDescription));
                        System.out.println(UiActions.getTextFromElement(impactMissionDescription));
                    }
                    System.out.println("");
                    break;
                }
                case "Community": {
                    System.out.println("Mission: " + UiActions.getTextFromElement(missionTitle) + " - " +
                            UiActions.getTextFromElement(values.list_missionArticles.get(2)));
                    Assert.assertEquals(UiActions.getTextFromElement(missionTitle), "Community");
                    for (WebElement missionImage : values.list_communityImages) {
                        Assert.assertTrue(Verifications.verifyElementIsDisplayedAndEnabled(missionImage));
                    }
                    for (WebElement communityMissionDescription : values.list_communityMissionDescriptions) {
                        Assert.assertNotNull(UiActions.getTextFromElement(communityMissionDescription));
                        System.out.println(UiActions.getTextFromElement(communityMissionDescription));
                    }
                    System.out.println("");
                    break;
                }
            }

        }

        //Focusing on the "people" part
        UiActions.clickWebElement(values.btn_stickyHeaderPeople);

        //Verifying people title and description are as expected
        Verifications.verifyElementIsDisplayedAndEnabled(people.txt_peopleTitle);
        Assert.assertEquals(UiActions.getTextFromElement(people.txt_peopleTitle), "Our team is the reason we succeed");
        Assert.assertEquals(UiActions.getTextFromElement(people.txt_h3Title), "We like to do things differently");
        Assert.assertEquals(UiActions.getTextFromElement(people.txt_h3Description),
                "Our unique team model allows us to build solutions in-house and provide continual support to" +
                        " our portfolio companies as they scale. At the helm is a tight-knit group of passionate innovators and leaders.");
        UiActions.scrollElementIntoView(people.txt_strategicLeadershipDescription);
        Assert.assertEquals(UiActions.getTextFromElement(people.txt_strategicLeadershipTitle), "Strategic leadership");
        Assert.assertEquals(UiActions.getTextFromElement(people.txt_strategicLeadershipDescription),
                "Our big thinkers. Meet the leadership team behind the acquisitions, investments," +
                        " and strategic direction of Redbrick and its portfolio companies.");

        //Printing all the leadership team names:
        System.out.println("The leadership team names:");
        Verifications.verifyListIsLoadedCorrectly(people.list_leadersNames);
        System.out.println(people.list_leadersNames.stream().map(WebElement::getText).collect(Collectors.joining(", ")));

        //Focusing on the "company" part
        UiActions.clickWebElement(people.btn_stickyHeaderCompany);

        //Verifying company title and description are as expected
        Verifications.verifyElementIsDisplayedAndEnabled(header.btn_homepage);
        Verifications.verifyElementIsDisplayedAndEnabled(company.txt_companyTitle);
        Assert.assertEquals(UiActions.getTextFromElement(company.txt_companyTitle), "We are Redbrick");
        Assert.assertEquals(UiActions.getTextFromElement(company.txt_h3Title), "Creating a pathway for the next generation of tech");
        Assert.assertEquals(UiActions.getTextFromElement(company.txt_h3Description),
                "Redbrick is home to passionate innovators with a mission to build, acquire, and scale " +
                        "companies that empower digital entrepreneurs.");

        //Verifying the company characteristics are not null and print them
        for (WebElement companyChar : company.list_companyCharacteristics) {
            UiActions.scrollElementIntoView(companyChar);
            Assert.assertNotNull(UiActions.getTextFromElement(companyChar));
            System.out.println(UiActions.getTextFromElement(companyChar));
        }

        //Verifying the company next acquisitions objects
        UiActions.scrollElementIntoView(company.txt_nextAcquisitionTitle);
        Assert.assertEquals(UiActions.getTextFromElement(company.txt_nextAcquisitionTitle), "Our next acquisition");
        System.out.println("Our next acquisition objects are: ");
        for (WebElement nextAcquisitionObject : company.list_nextAcquisitionObjects) {
            Assert.assertNotNull(UiActions.getTextFromElement(nextAcquisitionObject));
            System.out.println(UiActions.getTextFromElement(nextAcquisitionObject));
        }
        Verifications.verifyElementIsDisplayedAndEnabled(header.btn_homepage);
    }

    @Test
    public void careersPageTest() {
        //From the header, entering to the "careers" page
        UiActions.clickWebElement(header.btn_careers);

        //Verifying the careers page title
        Assert.assertEquals(UiActions.getTextFromElement(careers.txt_careerTitle),
                "Welcome to working at Redbrick");

        //Verifying the images are display
        for (WebElement webElementImage : careers.list_titleImages) {
            Assert.assertTrue(Verifications.verifyElementIsDisplayedAndEnabled(webElementImage));
        }

        //Verifying the perks list is not empty and print them
        UiActions.scrollElementIntoView(careers.txt_perksTitle);
        Assert.assertEquals(UiActions.getTextFromElement(careers.txt_perksTitle),
                "Here’s how we take care of our team");
        System.out.println("Some of the most popular perks are:");
        for (WebElement perk : careers.list_perks) {
            System.out.println(UiActions.getTextFromElement(perk));
        }
    }

    @Test
    public void whatsNewPageTest() {
        //From the header, entering to the "what's new" page
        UiActions.clickWebElement(header.btn_whatsNew);

        //Verifying the what's new page title
        Assert.assertEquals(UiActions.getTextFromElement(whatsNew.txt_whatsNewTitle),
                "Redbrick walks with Pride");

        //for each category, the automation will verify that the brick news titles are not empty and will print them
        for (WebElement category : whatsNew.list_categoriesButtons) {

            System.out.println(UiActions.getTextFromElement(category));
            UiActions.clickWebElement(category);

            if (UiActions.getTextFromElement(category).equalsIgnoreCase("Press")) {
                UiActions.scrollElementIntoView(whatsNew.list_pressH3Titles.get(1));
                Verifications.verifyListIsLoadedCorrectly(whatsNew.list_pressH3Titles);
                for (WebElement newsTitle : whatsNew.list_pressH3Titles) {
                    Verifications.verifyElementIsDisplayedAndEnabled(newsTitle);
                    Assert.assertNotNull(UiActions.getTextFromElement(newsTitle));
                    System.out.println(UiActions.getTextFromElement(newsTitle));
                }
                return;
            }

            //Wait for the news list to reload properly
            UiActions.scrollElementIntoView(whatsNew.list_h3Titles.get(1));
            Verifications.verifyListIsLoadedCorrectly(whatsNew.list_h3Titles);
            for (WebElement newsTitle : whatsNew.list_h3Titles) {
                Verifications.verifyElementIsDisplayedAndEnabled(newsTitle);
                Assert.assertNotNull(UiActions.getTextFromElement(newsTitle));
                System.out.println(UiActions.getTextFromElement(newsTitle));
            }
        }
    }

    @Test
    public void contactUsPageTest() throws InterruptedException {
        //From the header, entering to the "contact us" page
        UiActions.clickWebElement(header.btn_contactUs);

        //Verifying the "contact us" title is as expected
        Assert.assertEquals(UiActions.getTextFromElement(contactUs.txt_contactUsTitle), "Contact us");

        Assert.assertTrue(Verifications.verifyElementIsDisplayedAndEnabled(contactUs.input_name));
        UiActions.writeTextToElement(contactUs.input_name, getMY_NAME());

        Assert.assertTrue(Verifications.verifyElementIsDisplayedAndEnabled(contactUs.input_email));
        UiActions.writeTextToElement(contactUs.input_email, getMY_EMAIL());

        String messageText =
                "Hi, my name is Moran Liv and I'm a QA Automation engineer with almost 4 years of experience and almost" +
                        " 2 years of manual QA experience.\n" +
                        "I've made this simple automation on 'RedBrick' website to demonstrate my automation skills.\n" +
                        "Here is a 'Chuck Norris joke' for a funny closer: \n";

        Assert.assertTrue(Verifications.verifyElementIsDisplayedAndEnabled(contactUs.input_message));
        UiActions.writeTextToElement(contactUs.input_message, messageText + getChuckNorrisJoke() + "\n\n" +
                "Would love to hear back from you.\nMoran Liv");

        Thread.sleep(15000);
    }

}
