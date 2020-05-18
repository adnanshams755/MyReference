package TestPage;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.BathSolutionPage;
import pages.StorageOrganizationPage;
import reporting.TestLogger;

public class TestStorageOrganization extends CommonAPI {

    @Test
    public void lookUpBathSolution() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        StorageOrganizationPage storageorganizationpage = PageFactory.initElements(driver, StorageOrganizationPage.class);
        storageorganizationpage.clickOnDifferentShoeStorageTab(driver);
    }
}
