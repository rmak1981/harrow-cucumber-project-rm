package uk.gov.harrow.cucumber.stepdefs;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import uk.gov.harrow.pages.HomePage;
import uk.gov.harrow.pages.ServicePage;

/*
 * Ravi's Creation
 * Date of Creation 26 Apr 20
 */
public class ServiceSteps {

    @When("^I click on services button$")
    public void iClickOnServicesButton() {
        new HomePage().clickOnServiceLink();
    }

    @Then("^I should navigate to services page successfully$")
    public void iShouldNavigateToServicesPageSuccessfully() {
        Assert.assertEquals(new ServicePage().getAdultSocialCareText(),"Adult Social Care");
    }

    @And("^I click on close button$")
    public void iClickOnCloseButton() {
        new ServicePage().clickOnCloseButton();
    }

    @Then("^I should see \"([^\"]*)\" text$")
    public void iShouldSeeText(String text) {
        Assert.assertEquals(new HomePage().getServiceText(),text);

    }
}
