package driver_factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import java.util.HashMap;
import java.util.Map;

public class EdgeDriverObject {

    public static WebDriver getEdgeDriver() {
        EdgeOptions option = new EdgeOptions();
        Map<String, Object> prefs = new HashMap<>();
        prefs.put("profile.password_manager_leak_detection", false);
        option.setExperimentalOption("prefs", prefs);
        WebDriver driver = new org.openqa.selenium.edge.EdgeDriver(option);
        driver.manage().window().maximize();
        return driver;
    }
}


