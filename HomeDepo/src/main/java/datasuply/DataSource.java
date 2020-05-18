package datasuply;

import base.CommonAPI;
import datasources.ConnectToExcelFile;
import datasources.ConnectToSqlDB;
import reporting.TestLogger;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DataSource {

    public static ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
    public static ConnectToExcelFile excelFile = new ConnectToExcelFile();
    public static String[] getDataFromExcelFile() throws IOException {
        String path = System.getProperty("user.dir")+"/data/test1.xls";
        String [] data = excelFile.fileReader2(path,0);
        return data;
    }
    public static List<String> getItemValue(){
        List<String> itemsList = new ArrayList<String>();
        itemsList.add("Java Book");
        itemsList.add("Selenium Book");
        itemsList.add("Laptop");
        itemsList.add("Honey");
        itemsList.add("Toothpaste");
        itemsList.add("ear-ring");
        itemsList.add("ps4games");
        itemsList.add("macAir");

        return itemsList;
    }
    //Database

    public static List<String> getItemsListFromDB()throws Exception, IOException, SQLException, ClassNotFoundException {
        List<String> list = new ArrayList<>();
        list = connectToSqlDB.readDataBase("ItemList", "items");
        return list;
    }

   /* public static void main(String[] args) throws Exception, IOException, SQLException, ClassNotFoundException {
        List<String> list = new ArrayList<>();
        list = connectToSqlDB.readDataBase("ItemList", "items");
        System.out.println(list.get(0));
    }*/

}
