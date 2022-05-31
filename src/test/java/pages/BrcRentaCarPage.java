package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BrcRentaCarPage {

    public BrcRentaCarPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@class='btn btn-primary btn-sm']")
    public WebElement ilkLoginButonu;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement emailTextBox;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordTextBox;


    @FindBy(xpath = "//button[contains(text(),'Login')]")
    public WebElement ikiciLoginButonu;

    @FindBy (xpath = "//button[@id='dropdown-basic-button']")
    public WebElement kullanıcıProfilİsmi;
}
