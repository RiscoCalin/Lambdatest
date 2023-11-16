package Pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class BasePage {
    public static WebDriver driver;
    private String BASE_URL = "https://www.lambdatest.com/selenium-playground/";

    public BasePage() {

    }

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(BASE_URL);
    }

    @AfterMethod//foloseste @AfterMethod daca vrem
    //sa inchide browserul dupa test care in parte
    // public void tearDown(){
    //   driver.quit();
    public void tearDown() {
        if (driver != null) {
            driver.quit();

        }
    }
}
