import driver_factory.DriverFacory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.ConfigLoader;
import utils.EXcelFileManager;
import utils.JsonFileManager;

import java.util.HashMap;
import java.util.Map;

public class BaseTest {
    WebDriver driver;
    ConfigLoader configLoader = new ConfigLoader("src/main/resources/config.properties");
    public JsonFileManager jsonFileManager;
    public EXcelFileManager excelFileManager;

    @BeforeMethod


    public void setUp() {

        excelFileManager = new EXcelFileManager("src/main/resources/Providerss.xlsx", "KhaledSheet");
        jsonFileManager = new JsonFileManager("src/main/resources/Credentials.json");
        driver = DriverFacory.getDriver("chrome");
        driver.get( configLoader.getProperty("url")  );
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) driver.quit();
    }
}