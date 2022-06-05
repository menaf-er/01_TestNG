package tests.day22_crossBrowser;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.BrcRentaCarPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C04_negativeLoginDataProvider {

    @DataProvider
    public static Object[][] KullaniciListesi() {

        Object[][] kullaniciBilgileri = {{"gohan@haber.com", "123456"}, {"yaman@buisibiliri.com", "456879"}, {"g.yaman@gmail.com", "787987646"}};

        return kullaniciBilgileri;
    }

    @Test (dataProvider = "KullaniciListesi")
    public void wrongPassword(String userEmail, String password) {
        BrcRentaCarPage rentacarPage = new BrcRentaCarPage();

        Driver.getDriver().get(ConfigReader.getProperty("BlueRentaCarURL"));

        rentacarPage.ilkLoginButonu.click();

        rentacarPage.emailTextBox.sendKeys(userEmail);

        rentacarPage.passwordTextBox.sendKeys(password);

        rentacarPage.ikiciLoginButonu.click();

        Assert.assertTrue(rentacarPage.ikiciLoginButonu.isDisplayed());

        Driver.closeDriver();
    }
}
