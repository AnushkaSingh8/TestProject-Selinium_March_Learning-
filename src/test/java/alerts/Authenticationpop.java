package alerts;

import Selinium_march_learn.Main;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Authenticationpop {
    public static void main(String[] args) {

            WebDriver driver = new ChromeDriver();
            //	driver.get("https://the-internet.herokuapp.com/basic_auth");
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));

            //syntax=https://username:password@ url (https://the-internet.herokuapp.com/basic_auth)
            driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
        }


}
