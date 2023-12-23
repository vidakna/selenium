package login;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginMain {
    public WebDriver driver;

    public WebDriver inheritanceANYO() {
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
    }
}
