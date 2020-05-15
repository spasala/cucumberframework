package seleniumPages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Page_GoogleHomepage extends Page_BasePage{
    public void launchBrowser() {
        System.setProperty("webdriver.chrome.driver" ,  "/Users/satyampasala/Downloads/chromedriver");
        driver = new ChromeDriver();
    }

    public void openGoogleURL() {
        driver.get("http://www.google.com");
    }

    public void checkSearchBoxIsDisplayed() {
        if(driver.findElement(By.name("q")).isDisplayed()) {
            System.out.println("Search text box is displayed");
        } else {
            System.out.println("Search text box is NOT displayed");
        }
    }

    public void checkGoogleSearchButtonIsDisplayed() {
        if(driver.findElement(By.name("btnK")).isDisplayed()) {
            System.out.println("Google Search button is displayed");
        } else {
            System.out.println("Google Search button is NOT displayed");
        }
    }

    public void checkImFeelingLuckyButtonIsDisplayed() {
        if(driver.findElement(By.name("btnI")).isDisplayed()) {
            System.out.println("I'm Feeling Lucky button is displayed");
        } else {
            System.out.println("I'm Feeling Lucky button is NOT displayed");
        }
    }

    public void clickGoogleSearchButton() {
        driver.findElement(By.name("btnK")).submit();
    }

    public void enterSearchText(String text) {
        driver.findElement(By.name("q")).sendKeys(text);
    }
}