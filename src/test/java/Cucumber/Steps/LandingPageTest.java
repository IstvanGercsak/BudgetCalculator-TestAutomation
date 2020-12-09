package Cucumber.Steps;

import Cucumber.PageObjectModel.LandingPagePOM;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

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
}
