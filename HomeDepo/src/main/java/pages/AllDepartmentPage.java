package pages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AllDepartmentPage {


    @FindBy(how = How.XPATH, using = "//*[@id=\"container\"]/div[2]/div[1]/div[4]/div/ul/li[1]/a")
    public static WebElement allDepartmentTabWebElement;

    @FindBy(how = How.XPATH, using = "//a[@class='MainFlyout__link'][contains(text(),'Electrical')]")
    public static WebElement electricalTabWebElement;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Light Bulbs')]")
    public static WebElement lightBulbTabWebElement;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'LED Light Bulbs')]")
    public static WebElement ledLightTabWebElement;



    public  void  clickOnLedLight(WebDriver driver) throws InterruptedException {
       CommonAPI.Hover(driver, allDepartmentTabWebElement);
       CommonAPI.Hover(driver, electricalTabWebElement);
       CommonAPI.Hover(driver, lightBulbTabWebElement);
       CommonAPI.HoverAndClick(driver, ledLightTabWebElement, ledLightTabWebElement);
       CommonAPI.sleepFor(15);



    }
}
