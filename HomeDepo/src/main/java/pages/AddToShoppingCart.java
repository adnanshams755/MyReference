package pages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import reporting.TestLogger;

public class AddToShoppingCart {

    HomePage homePage = null;

    @FindBy(how = How.XPATH, using = "//*[@id=\"products\"]/div/div[6]/div/div[4]/div[3]/div/a/span")
    public static WebElement item1WebElement;

    public  WebElement getItem1WebElement() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return item1WebElement;}


        public void addToShopingCartMethod(WebDriver driver) throws InterruptedException {
            TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
            homePage = PageFactory.initElements(driver,HomePage.class);
            homePage.clickhouseholdEssentialTab(driver);
            getItem1WebElement().click();
            CommonAPI.sleepFor(7);
        }

    }


