package method;

import org.openqa.selenium.WebDriver;
import page.BasePage;
import page.MyAccountPage;

public class VerifyMethod extends BasePage {
    public VerifyMethod(WebDriver driver) {
        super(driver);
    }
    MyAccountPage myAccountPage = new MyAccountPage(driver);

    public void verifySuccessfulLogin(){
        assertStringEquals(myAccountPage.readTextFromLogoutButton(),"woocommerce-MyAccount-navigation-link woocommerce-MyAccount-navigation-link--customer-logout");
    }
}
