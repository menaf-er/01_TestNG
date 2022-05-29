package day16_notations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utilities.TestBase;

public class C02_BeforeClass_AfterClass extends TestBase {

    // JUnit'te @BeforeClass  ve @AfterClass notasyonuna sahip
    // method'lar static olmak ZORUNDAYDI
    // TestNG bu ZORUNLULUK'tan bizi kurtariyor

     /*
     TestNg bize daha fazla before ve after notasyonlari sunar
     diger before/after notasyonlari tanimlayacagimiz
     grup, test veya suit'den once ve sonra calisirlar
     ileride xml dosyalari ile birlikte bunu gorecegiz
     */

    @BeforeClass
    public void beforeClassMethod(){
        System.out.println("Before class calısınca :  + before class");
    }
    @AfterClass
    public void AfterClassMethod(){
        System.out.println("afterclass calısınca : " + driver.getCurrentUrl());
    }
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