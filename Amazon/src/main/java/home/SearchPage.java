package home;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SearchPage {

    @FindBy(how = How.CSS, using = "#twotabsearchtextbox")
    public static WebElement serachInputWebElement;

    @FindBy(how = How.CSS, using = "#twotabsearchtextbox")
    public static WebElement submitWebElement;

    public void typeItemName(String value){
        serachInputWebElement.sendKeys(value);
    }

    public void clickOnSearch(){
        submitWebElement.click();
    }

    public void typeNSubmit(){
        typeItemName("Books");
        clickOnSearch();
    }

}
