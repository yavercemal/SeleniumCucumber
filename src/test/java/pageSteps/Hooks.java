package pageSteps;

import base.BasePage;
import cucumber.api.java.After;

public class Hooks extends BasePage {

    @After
    public void quit() {
        System.out.println("quit browser");
        driver.quit();
    }
}