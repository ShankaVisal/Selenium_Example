import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    public static void main(String[] args) {
        // Set the path to the chromedriver executable
        System.setProperty("webdriver.chrome.driver", "D:/JAVA/Selenium_Example/src/test/java/chromedriver.exe");

        // Initialize the WebDriver (ChromeDriver in this case)
        WebDriver driver = new ChromeDriver();

        // Open the Google homepage
        driver.get("https://www.google.com");

        // Find the search box element by its name attribute
        WebElement searchBox = driver.findElement(By.name("q"));

        // Enter the search query
        searchBox.sendKeys("Selenium WebDriver");

        // Submit the search form
        searchBox.submit();

        // Close the browser
        driver.quit();
    }
}
