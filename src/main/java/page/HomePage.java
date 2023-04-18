package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{
    public HomePage(WebDriver driver) {
        super(driver);
    }
    By myAccountButtonBy = By.id("menu-item-50");

    public void clickOnMyAccountButton(){
        click(myAccountButtonBy);
    }
}
