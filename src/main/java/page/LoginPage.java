package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends HomePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }
    By userNameBy = By.id("username");
    By passwordBy = By.id("password");
    By loginButtonBy = By.name("login");

    public void writeUserName(String text){
        writeText(userNameBy,text);
    }
    public void writePassword(String text){
        writeText(passwordBy,text);
    }
    public void clickOnLoginButton(){
        click(loginButtonBy);
    }
}
