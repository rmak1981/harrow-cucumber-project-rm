package uk.gov.harrow.pages;

import com.cucumber.listener.Reporter;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uk.gov.harrow.utility.UtilityRM;

/*
 * Ravi's Creation
 * Date of Creation 26 Apr 20
 */
public class HomePage extends UtilityRM {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @FindBy(xpath = "//span[@class='icon-fallback']")
    WebElement _loginOrRegisterLink;
    @FindBy(xpath = "//span[@class='button__text'][contains(text(),'Services')]")
    WebElement _serviceBtn;

    public void clickOnLoginOrRegisterLink(){
        Reporter.addStepLog("click on log in register link " + _loginOrRegisterLink.toString()+"<br>");
        clickOnElement(_loginOrRegisterLink);
        log.info("click on log in register link " + _loginOrRegisterLink.toString());
    }
    public void clickOnServiceLink(){
        Reporter.addStepLog("click on service link" + _serviceBtn.toString()+"<br>");
        clickOnElement(_serviceBtn);
        log.info("click on service link" + _serviceBtn.toString());
    }
    public String getServiceText(){
        Reporter.addStepLog("get text from service"+_serviceBtn.toString());
        log.info("get text from service"+_serviceBtn.toString());
        return getTextFromElement(_serviceBtn);
    }
}
