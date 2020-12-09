package Cucumber.Steps;

import Cucumber.DriverFactory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Hook extends DriverFactory {

    public static WebDriver driver;
    ChromeOptions chromeOptions = new ChromeOptions();
    String systemChromePropertyKey = "webdriver.chrome.driver";
    String chromeDriverRoute = "/Users/istvangercsak/IdeaProjects/WebDriver/chromeDriver_mac/87.0.4280.88/chromedriver";


    @Before
    public void setUp() {
        System.setProperty(systemChromePropertyKey, chromeDriverRoute);
        chromeOptions.addArguments("headless");
        driver = new ChromeDriver(chromeOptions);
        driver.get("https://budgetcalculator-thirdproject.herokuapp.com/");
    }

    @After
    public void tearDown() {
        driver.quit();
    }

}
