package Cucumber.PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DashboardPagePOM {
    String dashBoardURL = "http://budgetcalculator-thirdproject.herokuapp.com/dashboard";

    String userNameCSS = "body > nav > div > div.col-4.username.nav-item-padding > p";
    String dashboardButtonCSS = "body > nav > div > div.col-4.set-center.nav-item-padding > a > button";
    String signOutButtonCSS = "body > nav > div > div.col-4.logout.nav-item-padding > a > button";
    //Todo: Could be replace to find the data-target
    String addGroupButtonCSS = "body > div:nth-child(3) > div > div:nth-child(1) > button";
    String searchInputID = "search";
    String searchButtonCSS = "body > div:nth-child(3) > div > div:nth-child(2) > form > button";

    String githubIconCSS = "body > footer > div > div > div.col-12.col-sm-6.list-inline.social-link-container > ul > li:nth-child(1) > a";
    String linkedinIconCSS = "body > footer > div > div > div.col-12.col-sm-6.list-inline.social-link-container > ul > li:nth-child(2) > a";
    String githubIconHref = "https://github.com/IstvanGercsak";
    String linkedinIconHref = "https://www.linkedin.com/in/istvangercsak/";

    WebElement userNameCSS(WebDriver driver) {
        return driver.findElement(By.cssSelector(userNameCSS));
    }

    WebElement dashboardButtonCSS(WebDriver driver) {
        return driver.findElement(By.cssSelector(dashboardButtonCSS));
    }

    WebElement signOutButtonCSS(WebDriver driver) {
        return driver.findElement(By.cssSelector(signOutButtonCSS));
    }

    WebElement githubIconCSS(WebDriver driver) {
        return driver.findElement(By.cssSelector(githubIconCSS));
    }

    WebElement linkedinIconCSS(WebDriver driver) {
        return driver.findElement(By.cssSelector(linkedinIconCSS));
    }

    WebElement addGroupButtonCSS(WebDriver driver) {
        return driver.findElement(By.cssSelector(addGroupButtonCSS));
    }

    WebElement searchInputID(WebDriver driver) {
        return driver.findElement(By.id(searchInputID));
    }

    WebElement searchButtonCSS(WebDriver driver) {
        return driver.findElement(By.cssSelector(searchButtonCSS));
    }

}
