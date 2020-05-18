package pages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import reporting.TestLogger;

import java.util.List;

public class BathSolutionPage {

    HomePage homePage = null;
    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Bath Vanities')]")
    public static WebElement bathVanitiesTabWebElement;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Bathroom Faucets')]")
    public static WebElement bathFaucetsTabWebElement;

    public WebElement getBathVanitiesTabWebElement() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        return bathVanitiesTabWebElement;
    }

    public WebElement getBathFaucetsTabWebElement() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        return bathFaucetsTabWebElement;
    }

    public void clickOnDifferentBathTab(WebDriver driver) throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnbathSolutionTab(driver);
        getBathVanitiesTabWebElement().click();
        CommonAPI.sleepFor(2);
        CommonAPI.navigateBackward();
        getBathFaucetsTabWebElement().click();
        CommonAPI.sleepFor(2);
    }

    /*public void getItemsList(){
        List<String> list = CommonAPI.getListOfText(".promotionalNav2.card.textContainer p(1)");
        for(String st:list) {
            System.out.println(st);
        }
    }
    public void readNValidatebathSolution(WebDriver driver){
        homePage = PageFactory.initElements(driver,HomePage.class);
        homePage.clickOnbathSolutionTab(driver);
        getItemsList();
    }*/


}
