package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BasePage {

    public static WebDriver driver;
    public static WebElement element = null;
    public static String loginPageUrl = "https://twitter.com/login";

    public static void setup() {
        driver = new ChromeDriver();
        System.out.println("Opening browser");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
}
