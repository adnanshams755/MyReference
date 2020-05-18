package TestPage;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class TestLinkNumber extends CommonAPI {

    @Test
    public void Home(){
        List<WebElement> ebay=driver.findElements(By.tagName("a"));
        System.out.println(ebay.size());
    }
}
