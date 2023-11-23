
import Pages.BasePage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Pages.BasePage;
import Pages.SimpleFormPage;

public class SimpleFormTests extends BasePage {
    private SimpleFormPage simpleFormPage;
    private final By simpleFormDemoLink = By.linkText("Simple Form Demo");

    @BeforeMethod
    public void setUp() {
        super.setUp();
        simpleFormPage = new SimpleFormPage(driver);

    }

    @Test
    public void enterMessageAndClickGetCheckedValue() {
        driver.findElement(simpleFormDemoLink).click();
        simpleFormPage.entrTextInTextField("Test");
        simpleFormPage.clickOnCheckedValueButton();
        String actualResult = driver.findElement(By.id("message")).getText();
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("Test"));


    }

    @Test
    public void enterMessageAndClickGetCheckedValue1() {
        driver.findElement(simpleFormDemoLink).click();
        simpleFormPage.entrTextInTextField("ΩΩ{}");
        simpleFormPage.clickOnCheckedValueButton();

        String actualResult = driver.findElement(By.id("message")).getText();
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("ΩΩ{}"));
    }

    @Test
    public void enterMessageAndClickGetCheckedValue2() {
        driver.findElement(simpleFormDemoLink).click();
        simpleFormPage.entrTextInTextField("123");
        simpleFormPage.clickOnCheckedValueButton();

        String actualResult = driver.findElement(By.id("message")).getText();
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("123"));
    }

    @Test
    public void enter2ValuesAndCheckTheirSum() {
        driver.findElement(simpleFormDemoLink).click();
        simpleFormPage.enterFirstValue("1");
        simpleFormPage.enterSecondValue("2");
        simpleFormPage.clickOnGetSum();
        String actualResult = driver.findElement(By.id("addmessage")).getText();
        System.out.println(actualResult);
    }
}


