package TestPage;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.AddToShoppingCart;
import reporting.TestLogger;

public class TestAddToShoppingCart extends CommonAPI {

    @Test
    public void lookUpAddToCart() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        AddToShoppingCart addToCartPage = PageFactory.initElements(driver, AddToShoppingCart.class);
        addToCartPage.addToShopingCartMethod(driver);
}
}
