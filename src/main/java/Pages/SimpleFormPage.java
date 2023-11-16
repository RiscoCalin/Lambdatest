package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SimpleFormPage extends BasePage {
    public SimpleFormPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "input[placeholder='Please enter your Message']")
    private WebElement textField;

    public void entrTextInTextField(String text) {
        textField.sendKeys(text);
    }

    @FindBy(id = "showInput")
    private WebElement getCheckValueButton;

    public void clickOnCheckedValueButton() {
        getCheckValueButton.click();
    }

    @FindBy(id = "message")
    private WebElement checkMessage;

    public void setCheckMessage() {
        checkMessage.getText();
    }
        @FindBy(id = "sum1")
        private WebElement firstValue;
        public void enterFirstValue(String ValueA) {
            firstValue.sendKeys(ValueA);


    }
    @FindBy(id = "sum2")
    private WebElement secondValue;
    public void enterSecondValue(String ValueB) {
        secondValue.sendKeys(ValueB);


    }
    @FindBy(css = "#gettotal > button")
    private WebElement getSum;
    public void clickOnGetSum(){
        getSum.click();
    }
    @FindBy(id="addmessage")
    private WebElement getRez;

    public void  GetRez(){
        getRez.getText();

    }

}

