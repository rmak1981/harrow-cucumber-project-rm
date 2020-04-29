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
public class ServicePage extends UtilityRM {


        private static final Logger log = LogManager.getLogger(ServicePage.class.getName());

        @FindBy(xpath = "//a[@id='js-menu-first-item']")
        WebElement _adultSocielCareText;

        @FindBy(xpath = "//span[@class='button__text'][contains(text(),'Close')]")
        WebElement _closeLink;

        public String getAdultSocialCareText(){
           // waitUntilElementToBeClickable(_adultSocielCareText, 20);
            Reporter.addStepLog("Get Adult Social Care Text"+ _adultSocielCareText.toString());
            log.info("Get Adult Social Care Text"+ _adultSocielCareText.toString());
            return getTextFromElement(_adultSocielCareText);

        }
        public void clickOnCloseButton(){
            //waitUntilElementToBeClickable(_closeLink, 20);
            Reporter.addStepLog(" Clicking on close link" + _closeLink);
            clickOnElement(_closeLink);
            log.info(" Clicking on close link" + _closeLink);
        }

    }


