package Cucumber.Steps;

import Cucumber.PageObjectModel.SignUpPagePOM;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class SignUpPageTest extends SignUpPagePOM {

    public WebDriver driver;
    Logger logger = LogManager.getLogger(LandingPageTest.class);
    LandingPageTest landingPage = new LandingPageTest();

    public SignUpPageTest() {
        driver = Hook.driver;
    }

    @When("I click on the sign up button")
    public void iClickOnTheSignUpButton() {
        landingPage.signUpButtonCSS(driver).click();
    }

    @Then("I arrive on the sign up page")
    public void iArriveOnTheSignUpPage() {
        Assert.assertEquals(driver.getCurrentUrl(), signUpPageUrl);
    }

    @When("I click on the back button")
    public void iClickOnTheBackButton() {
        logger.info("Back button interaction");
        backButtonCSS(driver).click();
    }

    @Then("I arrive on the landing page")
    public void iArriveOnTheLandingPage() {
        logger.info("Checking the landing page url");
        Assert.assertEquals(driver.getCurrentUrl(), landingPage.landingPageUrl);
    }
}
