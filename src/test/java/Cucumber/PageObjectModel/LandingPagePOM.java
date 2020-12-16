package Cucumber.PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPagePOM {

    public String landingPageUrl = "https://budgetcalculator-thirdproject.herokuapp.com/";
    String userNameID = "username";
    String passwordID = "password";
    String loginButtonCSS = "body > div.container-fluid > div > div > div > form > button";
    String signUpButtonCSS = "body > div.container-fluid > div > div > div > a > button";
    String githubIconCSS = "body > footer > div > div > div.col-sm-12.col-md-6.list-inline.social-link-container > ul > li:nth-child(1) > a";
    String linkedInIconCSS = "body > footer > div > div > div.col-sm-12.col-md-6.list-inline.social-link-container > ul > li:nth-child(2) > a";

    String githubIconHref = "https://github.com/IstvanGercsak";
    String linkedinIconHref = "https://www.linkedin.com/in/istvangercsak/";


    public WebElement userNameID(WebDriver driver) {
        return driver.findElement(By.id(userNameID));
    }

    public WebElement passwordID(WebDriver driver) {
        return driver.findElement(By.id(passwordID));
    }

    public WebElement loginButtonCSS(WebDriver driver) {
        return driver.findElement(By.cssSelector(loginButtonCSS));
    }

    public WebElement signUpButtonCSS(WebDriver driver) {
        return driver.findElement(By.cssSelector(signUpButtonCSS));
    }

    public WebElement githubIconCSS(WebDriver driver) {
        return driver.findElement(By.cssSelector(githubIconCSS));
    }

    public WebElement linkedInIconCSS(WebDriver driver) {
        return driver.findElement(By.cssSelector(linkedInIconCSS));
    }

}
