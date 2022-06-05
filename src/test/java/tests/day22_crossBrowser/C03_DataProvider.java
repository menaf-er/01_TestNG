package tests.day22_crossBrowser;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C03_DataProvider {




    @Test
    public void test01() {

        AmazonPage amazonPage = new AmazonPage();
        // amazon anasayfaya gidelim

        Driver.getDriver().get(ConfigReader.getProperty("amazonURL"));

        // nutella icin arama yapalim
        amazonPage.aramaKutusu.sendKeys("nutella" + Keys.ENTER);

        // sonuclarin nutella icerdigini test edelim

        String exceptedKelime = "nutella";
        String actualSonucYazısı = amazonPage.aramaSonucElementi.getText();

        Assert.assertTrue(actualSonucYazısı.contains(exceptedKelime));

        // sayfayi kapatalım
        Driver.closeDriver();
    }

    @DataProvider
    public static Object[][] AranacakKelimeler() {
        Object [][] arananKelimeArrayi = {{"nutella"}, {"java"}, {"gokhan"}, {"istanbul"}};
        return arananKelimeArrayi;
    }
    @Test (dataProvider = "AranacakKelimeler")
    //arayacagımız kelimeleri bir liste gibi tutup bana yollayacak bir veri sağlayıcısı oluşturacagız.

    public void dataProviderTesti(String arananKelime) {
        AmazonPage amazonPage = new AmazonPage();
        // amazon anasayfaya gidelim
        Driver.getDriver().get(ConfigReader.getProperty("amazonURL"));

        // nutella, java, gokhan, istanbul için arama yapalım,
        amazonPage.aramaKutusu.sendKeys("arananKelime" + Keys.ENTER);

        // sonucların aradıgımız kelime ieçrdiğini test edelim
        String exceptedKelime = "arananKelime";
        String actualSonucYazısı = amazonPage.aramaSonucElementi.getText();

        //sayfayı kapatalım.
        Driver.closeDriver();
    }
}
