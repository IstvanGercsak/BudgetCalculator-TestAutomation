package Cucumber.PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpPagePOM {
    public String signUpPageUrl = "https://budgetcalculator-thirdproject.herokuapp.com/sign_up";
    String userNameID = "username";
    String passwordID = "password";
    String passwordAgainID = "password-again";
    String currencyCSS = "body > div > div > div > div > form > select";
    String signUpCSS = "body > div > div > div > div > form > button";
    String backButtonCSS = "body > div > div > div > div > a > button";
    String githubIconCSS = "body > footer > div > div > div.col-12.col-sm-6.list-inline.social-link-container > ul > li:nth-child(1) > a";
    String linkedInIconCSS = "body > footer > div > div > div.col-sm-12.col-md-6.list-inline.social-link-container > ul > li:nth-child(2) > a";

    public WebElement userNameID(WebDriver driver) {
        return driver.findElement(By.id(userNameID));
    }

    public WebElement passwordID(WebDriver driver) {
        return driver.findElement(By.id(passwordID));
    }

    public WebElement passwordAgainID(WebDriver driver) {
        return driver.findElement(By.id(passwordAgainID));
    }

    public WebElement currencyCSS(WebDriver driver) {
        return driver.findElement(By.cssSelector(currencyCSS));
    }

    public WebElement signUpCSS(WebDriver driver) {
        return driver.findElement(By.cssSelector(signUpCSS));
    }

    public WebElement backButtonCSS(WebDriver driver) {
        return driver.findElement(By.cssSelector(backButtonCSS));
    }

    public WebElement githubIconCSS(WebDriver driver) {
        return driver.findElement(By.cssSelector(githubIconCSS));
    }

    public WebElement linkedInIconCSS(WebDriver driver) {
        return driver.findElement(By.cssSelector(linkedInIconCSS));
    }


}

