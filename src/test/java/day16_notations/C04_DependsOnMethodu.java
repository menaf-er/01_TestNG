package day16_notations;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utilities.TestBase;

import java.time.Duration;

public class C04_DependsOnMethodu {

    /*
     DependsOnMethods test method'larinin calisma siralamasina karismaz
     Sadece bagli olan test, baglandigi testin sonucuna bakar
     baglandigi test PASSED olmazsa, baglanan test hic calismaz(ignore)
    */
    WebDriver driver;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }


    @Test
    public void test01() {
        driver.get("https://www.ramazon1.com");

    }

    @Test (dependsOnMethods = "test01")
    public void test02() {
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("nutella" + Keys.ENTER);
    }

    @Test (dependsOnMethods = "test02")
    public void test03() {
        WebElement sonucYaziElementi = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));
        Assert.assertTrue(sonucYaziElementi.getText().contains("nutella"));

    }

    @Test
    public  void test04(){
        System.out.println("bak bu calıstı");
    }

}

