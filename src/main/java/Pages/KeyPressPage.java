package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.swing.*;

public class KeyPressPage extends BasePage {
    //=====================================================
    public KeyPressPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    //=====================================================
    @FindBy(id = "my_field")
    private WebElement textField;

    public void typeInTheTextField(String text) {
        textField.sendKeys(text);
    }

    public void typeInCONTROLKey() {
        textField.click();
        Actions action = new Actions(driver);
        action.keyDown(Keys.CONTROL).perform();
    }


    }

