package pageSteps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pages.LoginPage;

public class LoginPageStep {

    private static LoginPage loginPage = LoginPage.getInstance();

    @Given("^Start driver and browser$")
    public void startDriver() {
        loginPage.startDriver();
    }

    @When("^Nagivate to url$")
    public void navigateToUrl() {
        loginPage.navigateToUrl();
    }

    @And("^Enter to Email$")
    public void enterEmail() {
        loginPage.enterEmail();
    }

    @And("^Enter to Password$")
    public void enterPassword() {
        loginPage.enterPassword();
    }

    @And("^Enter to SignIn$")
    public void enterSignIn() {
        loginPage.enterSignIn();
    }
}
