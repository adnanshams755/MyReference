package TestPage;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.AllDepartmentPage;
import reporting.TestLogger;

public class TestLedLight extends CommonAPI {

    @Test
    public void clickOnLedLightTest() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        AllDepartmentPage allDepartmentPage = PageFactory.initElements(driver, AllDepartmentPage.class);
        allDepartmentPage.clickOnLedLight(driver);
    }
}