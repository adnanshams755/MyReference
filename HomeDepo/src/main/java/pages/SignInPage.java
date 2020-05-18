package pages;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import reporting.TestLogger;

public class SignInPage {

    @FindBy(how = How.XPATH, using = "//a[@id='headerMyAccount']//div[@class='MyAccount__label SimpleFlyout__link--bold'][contains(text(),'My Account')]")
    public static WebElement myAccountTabWebElement;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Sign in')]")
    public static WebElement signInTabWebElement;

    @FindBy(how = How.XPATH, using = "//input[@id='email']")
    public static WebElement typeEmailTabWebElement;

    @FindBy(how = How.XPATH, using = "//input[@id='password-input-field']")
    public static WebElement typePasswordTabWebElement;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Sign In')]")
    public static WebElement clickSignInTabWebElement;

    public  WebElement getMyAccountTabWebElement() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return myAccountTabWebElement;
    }

    public  WebElement getSignInTabWebElement() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return signInTabWebElement;
    }

    public  WebElement getTypeEmailTabWebElement() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return typeEmailTabWebElement;
    }

    public  WebElement getTypePasswordTabWebElement() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return typePasswordTabWebElement;
    }

    public  WebElement getClickSignInTabWebElement() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return clickSignInTabWebElement;
    }


    public void signIn() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getMyAccountTabWebElement().click();
        getSignInTabWebElement().click();
        getTypeEmailTabWebElement().sendKeys("adnanshams755@gmail.com");
        getTypePasswordTabWebElement().sendKeys("Bangladesh1");
        getClickSignInTabWebElement().click();
        CommonAPI.sleepFor(15);
    }


}
