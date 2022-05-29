package tests.day17_pom;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FacebookPage;
import utilities.Driver;

public class C03_PageClassKullanımı {

    @Test
    public void test01() {

        FacebookPage facebookpage= new FacebookPage();

        // facebook anasayfaya gidin
        Driver.getDriver().get("https://www.facebook.com");

        // cikarsa cookies kabul edin


        // kullanici mail kutusuna rastgele bir isim yazdirin
        Faker faker = new Faker();
        facebookpage.mailBox.sendKeys(faker.internet().emailAddress());


        // kullanici sifre kutusuna rastgele bir password yazdirin
        facebookpage.passwordBox.sendKeys(faker.internet().password());

        // login butonuna basin
        facebookpage.loginKutusu.click();

        // giris yapilamadigini test edin
        Assert.assertTrue(facebookpage.girilemediYazisiElementi.isDisplayed());
        Driver.closeDriver();

    }
}

