package TestPage;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.SignInPage;
import reporting.TestLogger;

public class TestSignIn extends CommonAPI {

    @Test
    public void lookUpAddToCart() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        SignInPage signin = PageFactory.initElements(driver, SignInPage.class);
        signin.signIn();
    }

}