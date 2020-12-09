package Cucumber.Steps;

import Cucumber.PageObjectModel.LandingPagePOM;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LandingPageTest extends LandingPagePOM {

    public WebDriver driver;
    Logger logger = LogManager.getLogger(LandingPageTest.class);

    public LandingPageTest() {
        driver = Hook.driver;
    }

    @When("I open the browser and get the title")
    public void iOpenTheBrowserBrowserWithHeadlessAndGoTheTheLandingPage() {
        System.out.println(driver.getTitle());
    }

    @Given("^The social link for ([^\"]*) is available$")
    public void theSocialLinkForSocial_iconIsAvailable(String socialIcon) {
        if (socialIcon.equals("Github")) {
            githubIconCSS(driver).isEnabled();
            githubIconCSS(driver).isDisplayed();
        } else {
            linkedInIconCSS(driver).isEnabled();
            linkedInIconCSS(driver).isDisplayed();
        }
    }

    @When("^The social link for ([^\"]*) has the correct href as ([^\"]*)$")
    public void theSocialLinkForSocial_iconHasTheCorrectHrefAsSocial_href(String socialIcon, String socialHref) {
        if (socialIcon.equals("Github")) {
            Assert.assertEquals(githubIconCSS(driver).getAttribute("href"), socialHref);
        } else {
            Assert.assertEquals(linkedInIconCSS(driver).getAttribute("href"), socialHref);
        }
    }
}