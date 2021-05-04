import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.pagefactory.ByChained;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class AdlibrisTest {
    @Test
    public void testAdlibris() {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1200, 800));
        WebDriverWait wait = new WebDriverWait(driver, 30);

        driver.get("https://adlibris.com/se");

        // Search query for Praktisk mjukvarutestning
        WebElement searchElement = driver.findElementById("q");
        searchElement.sendKeys("Praktisk mjukvarutestning");
        searchElement.submit();

        // Navigate to the product
        WebElement productElement = driver.findElementById("search")
                .findElement(By.className("search-result__product__name"));
        productElement.click();

        // Add the product to the shopping cart
        WebElement addToCartElement = driver.findElementByClassName("product__add-to-cart");
        addToCartElement.click();

        // Go to the shopping cart
        WebElement lookElement = driver.findElementByClassName("material-icons__shopping_cart");
        lookElement.click();

        // Waiting for the button to get visable on the site
        wait.until
                (ExpectedConditions.visibilityOfElementLocated(
                        new ByChained(
                        By.className("mini-cart"),
                        By.linkText("Till kassan")
                        )
                )
        );

        // Click on check out
        WebElement checkOutElement = driver.findElementByClassName("mini-cart").findElement(By.className("cart__checkout"));
        checkOutElement.click();

    }

}
