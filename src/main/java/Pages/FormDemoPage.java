package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class FormDemoPage extends BasePage {
    public FormDemoPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "name")
    private WebElement textName;

    public void enterTextInName(String Risco) {
        textName.sendKeys(Risco);
    }

    @FindBy(id = "inputEmail4")
    private WebElement textEmail;

    public void enterEmail(String riscoEmail) {
        textEmail.sendKeys(riscoEmail);
    }

    String riscoEmail = "riscocalin@gmail.com";
    @FindBy(id = "inputPassword4")
    private WebElement textPassword;

    public void enterPassword(String qwe123) {
        textPassword.sendKeys(qwe123);
    }

    @FindBy(id = "company")
    private WebElement textCompany;

    public void enterCompany(String GMB) {
        textCompany.sendKeys(GMB);
    }

    @FindBy(id = "websitename")
    private WebElement textWebsite;


    public void enterWebsite(String site) {

        textWebsite.sendKeys(site);
    }
    String site = "WWW.GMB.COM";

    @FindBy(css = "option[value='RO']")
    private WebElement enterCountry;

    public void clickOnCountry() {
        enterCountry.click();
    }

    @FindBy(id = "inputCity")
    private WebElement textCity;

    public void enterCity(String Cluj) {
        textCity.sendKeys(Cluj);
    }

    String Cluj = "Cluj-Napoca";
    @FindBy(id = "inputAddress1")
    private WebElement enterAddress;

    public void texAddress(String address) {
        enterAddress.sendKeys(address);
    }

    String address = "Str Borhanciului nr.24";
    @FindBy(id = "inputAddress2")
    private WebElement enterAddress2;
    public void textAddress1(String address2){
        enterAddress2.sendKeys(address2);
    }
   String address2 = "N/A";
    @FindBy(id = "inputState")
    private WebElement enterState;
    public void textState(String state){
        enterState.sendKeys(state);
    }
    String state = "N/A";
    @FindBy(id = "inputZip")
    private WebElement enterZipCode;
    public void textZipCode(String zipCode){
        enterZipCode.sendKeys(zipCode);
    }
    String zipCode = "400632";
    @FindBy(css = "#seleniumform > div.text-right.mt-20 > button")
    private WebElement submitButton;
    public void clickOnSubmit(){submitButton.click();}

    @FindBy(css = "#__next > div > section.mt-50 > div > div > div > div > p")
    private WebElement checkTheValidation;
    public void setCheckTheValidation(){checkTheValidation.getText();}
}
