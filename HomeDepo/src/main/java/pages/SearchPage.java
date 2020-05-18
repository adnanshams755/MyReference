package pages;


import base.CommonAPI;
import datasuply.DataSource;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import reporting.TestLogger;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SearchPage {

    @FindBy(how = How.CSS, using = "#headerSearch")
    public static WebElement searchInputWebElement;

    @FindBy(how = How.CLASS_NAME, using = "SearchBox__buttonIcon")
    public static WebElement submitWebElement;

    public WebElement getSearchInputWebElement() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return searchInputWebElement;
    }

    public WebElement getSubmitWebElement() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return submitWebElement;
    }

    public void clearInputBox() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getSearchInputWebElement().clear();
    }

    public void typeItemName(String value) {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getSearchInputWebElement().sendKeys(value);
    }

    public void clickOnSearch() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getSubmitWebElement().click();
    }

    public void clearTypeNClickOnSearch() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        List<String> list = getItems();
        for (int i = 0; i < list.size(); i++) {
            typeItemName(list.get(i));
            clickOnSearch();
            clearInputBox();
        }

    }

    public void searchItemsAndSubmitButton1() throws Exception, IOException, SQLException, ClassNotFoundException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        List<String> list = DataSource.getItemsListFromDB();
        for (int i = 0; i < list.size(); i++) {
            typeItemName(list.get(i));
            clickOnSearch();
            clearInputBox();
            //verification
        }
    }

    public void searchItemsAndSubmitButton() throws Exception, IOException, SQLException, ClassNotFoundException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        List<String> list = getItems();
        for (int i = 0; i < list.size(); i++) {
            typeItemName(list.get(i));
            clickOnSearch();
            clearInputBox();
            //verification
        }
    }

    public void searchItemsAndSubmitButton2() throws IOException {
        String[] list1 = DataSource.getDataFromExcelFile();
        for (int i = 0; i < list1.length; i++) {
            typeItemName(list1[i]);
            clickOnSearch();
            clearInputBox();
            //verification
        }
    }
        public List<String> getItems () {
            TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
            List<String> itemsList = new ArrayList<String>();
            itemsList.add("lock");
            itemsList.add("bulb");
            itemsList.add("fan");
            itemsList.add("microwave");


            return itemsList;

        }

    }

