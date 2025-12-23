import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends  BaseTest {
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 1 ,  description = "Valid Login Test")
    public void validLoginTest() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login((String) jsonFileManager.getValue("username"),
                (String) jsonFileManager.getValue("password"));
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/inventory.html",
                "Login failed -); URL mismatch");
    }

    @Test
//  (dataProviderClass = TestProvider.class, dataProvider = "addToCartData")
    public void addItemToCart() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login((String) jsonFileManager.getValue("username"),
                (String) jsonFileManager.getValue("password"));
        ProductPage productPage = new ProductPage(driver);
        productPage.clickProductAddToCart(excelFileManager.getCellData(2,0)   );
        Assert.assertEquals(
                productPage.getProductPageTitle(), "Your Cart", "Add to cart failed -);"
        );
    }

    @Test
//            (dataProviderClass = TestProvider.class, dataProvider = "checkoutData")
    public void checkout(String firstName, String lastName, String postalCode) {
        ProductPage productPage = new ProductPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        CheckOutPage checkOutPage = new CheckOutPage(driver);
        loginPage.login((String) jsonFileManager.getValue("username"),
                (String) jsonFileManager.getValue("password"));
        productPage.clickProductAddToCart(excelFileManager.getCellData(  2,0)  );
        checkOutPage.checkOut( firstName, lastName, postalCode );
        Assert. assertEquals(
                driver.findElement(By.className("complete-header")).getText(), "Thank you for your order!", "Checkout failed -);");
    }
}