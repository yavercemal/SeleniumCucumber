package pages;

import base.BasePage;
import org.openqa.selenium.By;

public class LoginPage extends BasePage {

    private static LoginPage instance;

    public static synchronized LoginPage getInstance() {
        if (instance == null)
            instance = new LoginPage();
        return instance;
    }

    public void startDriver() {
        BasePage.setup();
    }

    public void navigateToUrl() {
        driver.get(loginPageUrl);
    }

    public void enterEmail() {
        element = driver.findElement(By.xpath("//input[@name='session[username_or_email]']"));
        element.sendKeys("cemal@gmail.com");
    }

    public void enterPassword() {
        element = driver.findElement(By.xpath("//input[@name='session[password]']"));
        element.sendKeys("12345");
    }

    public void enterSignIn() {
        element = driver.findElement(By.xpath("//div[@data-testid='LoginForm_Login_Button']"));
        element.click();
    }
}
