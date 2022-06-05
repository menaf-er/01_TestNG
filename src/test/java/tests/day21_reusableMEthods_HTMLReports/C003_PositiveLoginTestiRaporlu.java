package tests.day21_reusableMEthods_HTMLReports;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import pages.BrcRentaCarPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;


public class C003_PositiveLoginTestiRaporlu extends TestBaseRapor {

    BrcRentaCarPage rentacarPage = new BrcRentaCarPage();

    @Test
    public void positiveLoginTest() {

        extentTest=extentReports.createTest("Pozitif Login", "Gecerli Username ve şifre ile giriş yapabilmeli");


        // Bir test method olustur positiveLoginTest()
        //       https://www.bluerentalcars.com/ adresine git


        Driver.getDriver().get(ConfigReader.getProperty("BlueRentaCarURL"));
        extentTest.info("BlueRenaCar anasayfaya gidildi");

//      login butonuna bas
        rentacarPage.ilkLoginButonu.click();
        extentTest.info("login butonuna tıklandı");

        //test data user email: customer@bluerentalcars.com ,
        rentacarPage.emailTextBox.sendKeys(ConfigReader.getProperty("clientEmail"));
        extentTest.info("geçerli email yazıldı");

        //test data password : 12345
        rentacarPage.passwordTextBox.sendKeys(ConfigReader.getProperty("clientPassword"));
        extentTest.info("gecerli password yazıldı");

        // login butonuna tıklayın
        rentacarPage.ikiciLoginButonu.click();
        extentTest.info("Login butonu click edildi");

        //Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et

        String actualUserName = rentacarPage.kullanıcıProfilİsmi.getText();
        String expectedUserName = ConfigReader.getProperty("BlueRentaCarUserName");

        Assert.assertEquals(actualUserName, expectedUserName);
        extentTest.pass("kullanıcı başarılı bir şekilde giriş yaptı");

        Driver.closeDriver();

    }


}