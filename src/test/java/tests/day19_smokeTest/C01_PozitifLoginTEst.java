package tests.day19_smokeTest;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class C01_PozitifLoginTEst {

    @Test
    public void test01() {

        Driver driver1 = new Driver();

        driver1.getDriver().get(ConfigReader.getProperty("amazonURL"));
    }
}
