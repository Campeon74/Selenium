import org.junit.jupiter.api.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeTest {

    @Test
    public void testSearch() {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1200, 800));

        driver.get("https://actitime.com");

        WebElement headerButtonElement = driver.findElementByClassName("header__button" );
        headerButtonElement.click();

        WebElement firstNameInput = driver.findElementById("first-name");
        firstNameInput.sendKeys("Fredrik");

        WebElement lastNameInput = driver.findElementById("last-name");
        lastNameInput.sendKeys("Meister");

        WebElement emailInput = driver.findElementById("email");
        emailInput.sendKeys("tjosan@supermail.com");

        WebElement companyInput = driver.findElementById("company");
        companyInput.sendKeys("The Best Company");
    }
}
