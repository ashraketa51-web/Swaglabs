package driver_factory;

package driver_factory;

import org.openqa.selenium.WebDriver;

public class FirefoxDriver {

    public  static WebDriver getFirefoxDriver(){
        WebDriver driver = new org.openqa.selenium.firefox.FirefoxDriver();
        driver.manage().window().maximize();
        return driver;

    }
}