package tests.day19_smokeTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BrcRentaCarPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C02_PozitifLoginTest {

    BrcRentaCarPage rentacarPage = new BrcRentaCarPage();

    @Test
    public void positiveLoginTest() {
        // Bir test method olustur positiveLoginTest()
        //       https://www.bluerentalcars.com/ adresine git


        Driver.getDriver().get(ConfigReader.getProperty("BlueRentaCarURL"));

//      login butonuna bas
        rentacarPage.ilkLoginButonu.click();

        //test data user email: customer@bluerentalcars.com ,
        rentacarPage.emailTextBox.sendKeys(ConfigReader.getProperty("clientEmail"));

        //test data password : 12345
        rentacarPage.passwordTextBox.sendKeys(ConfigReader.getProperty("clientPassword"));

        // login butonuna tıklayın
        rentacarPage.ikiciLoginButonu.click();

        //Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et

        String actualUserName = rentacarPage.kullanıcıProfilİsmi.getText();
        String expectedUserName = ConfigReader.getProperty("BlueRentaCarUserName");

        Assert.assertEquals(actualUserName, expectedUserName);

        Driver.closeDriver();


    }
}
