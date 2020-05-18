package pages;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import reporting.TestLogger;

public class HomePage {


    @FindBy(how = How.XPATH, using = "//p[contains(text(),'Bath Solutions')]")
    public static WebElement bathSolutionTabWebElement;

    @FindBy(how = How.XPATH, using = "//p[contains(text(),'Storage & Organization')]")
    public static WebElement storageOrganizationTabWebElement;

    @FindBy(how = How.XPATH, using = "//p[contains(text(),'Household Essentials')]")
    public static WebElement householdEssentialTabWebElement;

    public  WebElement getBathSolutionTabWebElement() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return bathSolutionTabWebElement;
    }

    public  WebElement getStorageOrganizationTabWebElement() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return storageOrganizationTabWebElement;
    }

    public  WebElement getHouseholdEssentialTabWebElement() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return householdEssentialTabWebElement;
    }


    public void clickOnbathSolutionTab(WebDriver driver) {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getBathSolutionTabWebElement().click();
    }

    public void clickOnStorageOrganizatitonTab(WebDriver driver) {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getStorageOrganizationTabWebElement().click();
    }

    public void clickhouseholdEssentialTab(WebDriver driver) {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getHouseholdEssentialTabWebElement().click();
    }
}


