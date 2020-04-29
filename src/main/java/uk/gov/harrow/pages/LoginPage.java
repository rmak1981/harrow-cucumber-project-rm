package uk.gov.harrow.pages;

import com.cucumber.listener.Reporter;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uk.gov.harrow.utility.UtilityRM;

/*
 * Ravi's Creation
 * Date of Creation
 */
public class LoginPage extends UtilityRM {

    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    @FindBy(xpath = "//li[@class='navbar-text myprofile_salutation']")
    WebElement _welcomeText;

    @FindBy(id = "username-input")
    WebElement _emailField;

    @FindBy(id = "password-input")
    WebElement _passwordField;

    @FindBy(xpath = "//input[@id='submitBtnSignIn']")
    WebElement _loginButton;

    @FindBy(xpath = "//span[@id='password.errors']")
    WebElement _errorMessage;

    public String getWelcomeText(){
        Reporter.addStepLog("get welcome Text" + _welcomeText.toString());
        log.info("get welcome Text" + _welcomeText.toString());
        return getTextFromElement(_welcomeText);
    }
    public void enterEmail(String email) {
        Reporter.addStepLog("enter email"+ _emailField.toString());
        sendTextToElement(_emailField, email);
        log.info("enter email"+ _emailField.toString());
    }
    public void enterPassword(String password) {
        Reporter.addStepLog("enter password"+ _passwordField.toString());
        sendTextToElement(_passwordField, password);
        log.info("enter password"+ _passwordField.toString());
    }
    public void clickOnLoginButton() {
        Reporter.addStepLog(" Clicking on Login Button" + _loginButton);
        clickOnElement(_loginButton);
        log.info(" Clicking on Login Button" + _loginButton);
    }
    public String getErrorText() {
        Reporter.addStepLog("Get Error message text " + _errorMessage.toString());
        log.info("Get Error message text " + _errorMessage.toString());
        return getTextFromElement(_errorMessage);
    }
}
