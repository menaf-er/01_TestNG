package tests.day18_PageObjectModel;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FacebookPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C02_ConfigReaderKullanımı {


    @Test
    public void test01() {
        FacebookPage facebookPage = new FacebookPage();

        // facebook anasayfaya gidin
        Driver.getDriver().get(ConfigReader.getProperty("facebookURL"));

        // cikarsa cookies kabul edin



        // kullanici mail kutusuna yanlis kullanici ismi yazdirin
         facebookPage.mailBox.sendKeys(ConfigReader.getProperty("facebookWrongUSerName"));


        // kullanici sifre kutusuna yanlis password yazdirin

        facebookPage.passwordBox.sendKeys(ConfigReader.getProperty("123456"));

        // login butonuna basin

        facebookPage.loginKutusu.click();

        // giris yapilamadigini test edin

        Assert.assertTrue(facebookPage.girilemediYazisiElementi.isDisplayed());

        // sayfayi kapatin

        Driver.closeDriver();
    }


}
