package day16_notations;

import org.testng.annotations.Test;
import utilities.TestBase;

public class C01_BeforeMethodAfterMethod extends TestBase {
    // @BeforeMethod ve @AfterMethod  notasyonlari
    // JUnit'deki @Before ve @After gibidir
    // her test method'undan once ve sonra calisirlar
    @Test
    public void test01() {
        driver.get("https://www.amazon.com");
    }

    @Test
    public void test02() {
        driver.get("https://www.bestbuy.com");
    }

    @Test
    public void test03() {
        driver.get("https://www.trendyol.com");
    }

    @Test
    public void sahibindencom() {
        driver.get("https://www.sahibinden.com");
    }
}
