package uk.gov.harrow.cucumber.stepdefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import uk.gov.harrow.pages.HomePage;
import uk.gov.harrow.pages.LoginPage;

/*
 * Ravi's Creation
 * Date of Creation 26 Apr 20
 */
public class MyStepdefs {

    @Given("^I am on Home page$")
    public void iAmOnHomePage() {

    }

    @When("^I click on login or register link$")
    public void iClickOnLoginOrRegisterLink() {
        new HomePage().clickOnLoginOrRegisterLink();

    }

    @Then("^I should navigate to login page successfully$")
    public void iShouldNavigateToLoginPageSuccessfully() {
        Assert.assertEquals(new LoginPage().getWelcomeText(),"Welcome Guest!");
    }

    @And("^I enter email \"([^\"]*)\"$")
    public void iEnterEmail(String email)  {
        new LoginPage().enterEmail(email);
    }

    @And("^I enter password \"([^\"]*)\"$")
    public void iEnterPassword(String password)  {
        new LoginPage().enterPassword(password);
    }

    @And("^I click on Login button$")
    public void iClickOnLoginButton() {
        new LoginPage().clickOnLoginButton();
    }

    @Then("^I should see error massage \"([^\"]*)\"$")
    public void iShouldSeeErrorMassage(String errorMassage)  {
        Assert.assertEquals(new LoginPage().getErrorText(),"Invalid Username/Password supplied");
    }



}
