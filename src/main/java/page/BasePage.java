package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class BasePage {

    public WebDriver driver;
    public WebDriverWait wait;

    public BasePage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver,10);
    }
    public void waitForElementToAppear(By locator) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
    public void click(By locator){
        waitForElementToAppear(locator);
        driver.findElement(locator).click();
    }
    public void writeText(By locator, String text){
        waitForElementToAppear(locator);
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(text);
    }
    public String readText(By locator){
        waitForElementToAppear(locator);
        return driver.findElement(locator).getText();
    }
    public String readAttribute(By locator, String attribute){
        waitForElementToAppear(locator);
        return driver.findElement(locator).getAttribute(attribute);
    }
    public void assertStringEquals(String actualString, String expectedString) {
        Assert.assertEquals(actualString, expectedString);
    }
}
