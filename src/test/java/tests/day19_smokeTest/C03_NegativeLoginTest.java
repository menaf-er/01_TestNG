package tests.day19_smokeTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BrcRentaCarPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C03_NegativeLoginTest {
    // Bir test method olustur positiveLoginTest()
    //       https://www.bluerentalcars.com/ adresine git
    //      login butonuna bas
    //test data user email: customer@bluerentalcars.com ,
    //test data password : 54321
    //Degerleri girildiginde sayfaya basarili sekilde girilemedigini test et

    BrcRentaCarPage rentacarPage = new BrcRentaCarPage();

    @Test
    public void wrongPassword() {

        Driver.getDriver().get(ConfigReader.getProperty("BlueRentaCarURL"));

        rentacarPage.ilkLoginButonu.click();

        rentacarPage.emailTextBox.sendKeys(ConfigReader.getProperty("wrongclientEmail"));

        rentacarPage.passwordTextBox.sendKeys(ConfigReader.getProperty("wrongclientPassword"));

        rentacarPage.ikiciLoginButonu.click();

        Assert.assertTrue(rentacarPage.ikiciLoginButonu.isDisplayed());

        Driver.closeDriver();

        // bu class da 2 test methodu daha olusuturun,
        // biri yanlıs kullanıcı
        // diğeri yanlıs sifre ve kullanıcı adı
        //E2E testi yapın
        // otel ile ilgili projedeki calısmaları da yap.
    }
}
