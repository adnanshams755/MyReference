package pages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import reporting.TestLogger;

public class StorageOrganizationPage {

    HomePage homePage = null;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Shop Shoe Storage')]")
    public static WebElement shoeStorageTabWebElement;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Shop Clothes Racks')]")
    public static WebElement shoeRackTabWebElement;

    public  WebElement getShoeStorageTabWebElement() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return shoeStorageTabWebElement;
    }

    public  WebElement getShoeRackTabWebElement() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return shoeRackTabWebElement;
    }

    public void clickOnDifferentShoeStorageTab(WebDriver driver) throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homePage = PageFactory.initElements(driver,HomePage.class);
        homePage.clickOnStorageOrganizatitonTab(driver);
        getShoeStorageTabWebElement().click();
        CommonAPI.sleepFor(2);
        CommonAPI.navigateBackward();
        getShoeRackTabWebElement().click();
        CommonAPI.sleepFor(2);
    }

}
