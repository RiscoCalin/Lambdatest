import Pages.BasePage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Pages.BasePage;
import Pages.FormDemoPage;
public class FormDemoTests extends BasePage {
private FormDemoPage formDemoPage;
private final By formDemoPagelink = By.linkText("Input Form Submit");
@BeforeMethod
    public void setUp(){
    super.setUp();
    formDemoPage = new FormDemoPage(driver);
}
@Test
    public void enterData(){
    driver.findElement(formDemoPagelink).click();
    formDemoPage.enterTextInName("Risco");
    formDemoPage.enterEmail("riscocalin@gmail.com");
    formDemoPage.enterPassword("qwe123");
    formDemoPage.enterCompany("GMB");
    formDemoPage.enterWebsite("WWW.GMB.COM");
    formDemoPage.clickOnCountry();
    formDemoPage.enterCity("Cluj");
    formDemoPage.texAddress("Str Borhanciului nr.24");
    formDemoPage.textAddress1("N/A");
    formDemoPage.textState("N/A");
    formDemoPage.textZipCode("400632");
    formDemoPage.clickOnSubmit();

    String actualResult =  driver.findElement(By.cssSelector("#__next > div > section.mt-50 > div > div > div > div > p")).getText();
Assert.assertTrue(actualResult.contains("Thanks for contacting us, we will get back to you shortly."));
}


}
