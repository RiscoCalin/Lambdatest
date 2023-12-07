import Pages.BasePage;
import Pages.KeyPressPage;
import jdk.jfr.Description;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class KeyPressTests extends BasePage {
    private KeyPressPage keyPressPage;
    private static final By KEY_PRESS_LINK_TEXT = By.linkText("Key Press");

    @BeforeMethod
    public void setUp() {
        super.setUp();
        keyPressPage = new KeyPressPage(driver);
    }

    @Description("Write a letter and check the result")

    @Test
    public void writeALetterAndCheckTheResult() {
        driver.findElement(KEY_PRESS_LINK_TEXT).click();
        keyPressPage.typeInTheTextField("T");

        String actualResult = driver.findElement(By.id("result")).getText();
        Assert.assertTrue(actualResult.contains("T"));
    }

    @Description("Write an integer and check the result")
    @Test
    public void writeAnIntegerAndCheckTheResult() {
        driver.findElement(KEY_PRESS_LINK_TEXT).click();
        keyPressPage.typeInTheTextField("1");

        String actualResult = driver.findElement(By.id("result")).getText();
        Assert.assertEquals(actualResult, "You entered: 1");
    }

    @Description("Press CTRL Button")
    @Test
    public void pressCTRLButton() {
        driver.findElement(KEY_PRESS_LINK_TEXT).click();
        keyPressPage.typeInCONTROLKey();

        String actualResult = driver.findElement(By.id("result")).getText();
        Assert.assertEquals(actualResult, "You entered: CONTROL");
    }
}
