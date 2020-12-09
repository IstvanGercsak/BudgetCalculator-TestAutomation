package Cucumber.Steps;

import Cucumber.DriverFactory.DriverFactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

public class SignUpPageTest extends DriverFactory {

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
        System.out.println(driver.getCurrentUrl());
    }
}
