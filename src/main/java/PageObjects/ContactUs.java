package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ContactUs {

    @FindBy(how = How.CSS, using = "nav[aria-label=\"Main\"]")
    public WebElement image_header;

    @FindBy(how = How.CSS, using = "h1[class='type-h1 border-l-2 border-l-secondary pl-3 md:pl-4 lg:pl-6']")
    public WebElement txt_contactUsTitle;

    @FindBy(how = How.CSS, using = "input[label='Name']")
    public WebElement input_name;

    @FindBy(how = How.CSS, using = "input[label='Email address']")
    public WebElement input_email;

//    @FindBy(how = How.ID, using = "react-select-:Rddte6:-input")
    @FindBy(how = How.CSS, using = "div[class=' css-1pc6j40']")
    public WebElement btn_dropdown;

    @FindBy(how = How.CSS, using = "textarea[label='Message']")
    public WebElement input_message;

//



}
