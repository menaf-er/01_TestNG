package tests.day17_pom;

import org.testng.annotations.Test;
import utilities.Driver;

public class C01_NewDriverFirstClass {

    @Test(groups = "grup1")
    public void test01() {
        Driver.getDriver().get("htts://www.amazon.com");
         /*
        Bugune kadar TestBase class'ina extends ederek kullandigimiz driver yerine
        bundan sonra Driver class'indan kullanacagimiz getDriver static method'unu kullanacagiz

        Driver.getDriver()    in
        driver                out
         */

        Driver.getDriver().get("https://www.bestbuy.com");
        Driver.getDriver().get("https://www.sahibinden.com");

        Driver.closeDriver();

    }
}
