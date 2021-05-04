import org.junit.jupiter.api.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;

public class GoogleTest {

    @Test
    public void testSearch() {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1200, 800));

            driver.get("https://www.google.com");

            WebElement searchElement = driver.findElementByName("q" );
            searchElement.sendKeys("softwaretesting");
            searchElement.submit();

            // driver.close(); // If you want to close the web browser after testing
    }

}
