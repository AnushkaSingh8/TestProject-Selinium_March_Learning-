package cookies;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Set;

public class AddyourCookie {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().window().maximize();
        driver.get("https://panel.unolo.com/organization/field_executive");

        // Add your cookie
        Cookie c=new Cookie("COMPANY","Amazon");
        driver.manage().addCookie(c);


        Set<Cookie> allCookie = driver.manage().getCookies();
        for (Cookie ck : allCookie) {
            System.out.println(ck);
        }
    }
}
