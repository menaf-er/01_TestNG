package tests.day18_PageObjectModel;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class C01_ConfigReader {

    @Test
    public  void test01(){

        Driver.getDriver().get(ConfigReader.getProperty("amazonURL"));
        Driver.getDriver().get(ConfigReader.getProperty("facebookURL"));

    }
}
