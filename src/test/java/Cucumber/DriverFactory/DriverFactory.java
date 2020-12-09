package Cucumber.DriverFactory;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

public class DriverFactory {

    public WebDriver driver;

    Logger logger = LogManager.getLogger(DriverFactory.class);

    public WebDriver getDriver() {
        return this.driver;
    }
}
