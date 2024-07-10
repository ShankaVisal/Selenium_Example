import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FromTest {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","D:/JAVA/Selenium_Example/src/test/java/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.shankavisal.me");
    }
}
