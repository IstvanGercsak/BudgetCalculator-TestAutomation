package Cucumber.Steps;

import Cucumber.DriverFactory.DriverFactory;

import Cucumber.PageObjectModel.LandingPagePOM;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class LandingPageTest extends LandingPagePOM {

    DriverFactory driverFactory = new DriverFactory();

    Logger logger = LogManager.getLogger(LandingPageTest.class);
    ChromeOptions chromeOptions = new ChromeOptions();
    String systemChromePropertyKey = "webdriver.chrome.driver";
    String chromeDriverRoute = "/Users/istvangercsak/IdeaProjects/WebDriver/chromeDriver_mac/87.0.4280.88/chromedriver";

    @Before
    public void setUp() {
        System.setProperty(systemChromePropertyKey, chromeDriverRoute);
        chromeOptions.addArguments("headless");
        driverFactory.driver = new ChromeDriver(chromeOptions);
        driverFactory.driver.get("https://budgetcalculator-thirdproject.herokuapp.com/");
        logger.info("Headless Chrome browser starts");
    }

    @After
    public void tearDown() {
        driverFactory.driver.close();
    }

    @When("I open the browser and get the title")
    public void iOpenTheBrowserBrowserWithHeadlessAndGoTheTheLandingPage() {
        System.out.println(driverFactory.driver.getTitle());
    }

    @When("I click on the sign up button")
    public void iClickOnTheSignUpButton() {
        signUpButtonCSS(driverFactory.driver).click();
    }

}
