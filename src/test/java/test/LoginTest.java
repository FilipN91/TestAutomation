package test;

import method.LoginMethod;
import method.VerifyMethod;
import org.testng.annotations.Test;
import page.HomePage;
import page.MyAccountPage;

public class LoginTest extends BaseTest{

    @Test
    public void Login(){
        HomePage homePage = new HomePage(driver);
        LoginMethod loginMethod = new LoginMethod(driver);
        VerifyMethod verifyMethod = new VerifyMethod(driver);

        homePage.clickOnMyAccountButton();
        loginMethod.login();
        verifyMethod.verifySuccessfulLogin();
    }
}
