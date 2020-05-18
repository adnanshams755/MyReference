package TestPage;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.BathSolutionPage;
import pages.HomePage;
import reporting.TestLogger;


public class TestBathSolution extends CommonAPI {


    @Test
    public void lookUpBathSolution() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        BathSolutionPage bathSolutionPage = PageFactory.initElements(driver, BathSolutionPage.class);
        bathSolutionPage.clickOnDifferentBathTab(driver);
    }
}
