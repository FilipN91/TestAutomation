package method;

import org.openqa.selenium.WebDriver;
import page.LoginPage;
import page.MyAccountPage;

public class LoginMethod extends LoginPage {

    public LoginMethod(WebDriver driver) {
        super(driver);
    }
    public void login(){
        writeUserName("TestTest123123@gmail.com");
        writePassword("TestTest123!!!");
        clickOnLoginButton();
    }
}
