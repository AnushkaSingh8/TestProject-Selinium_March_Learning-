package cookies;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Set;

public class GetAllCookies {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().window().maximize();
        driver.get("https://panel.unolo.com/organization/field_executive");
        Set<Cookie> allCookie = driver.manage().getCookies();
        for (Cookie ck : allCookie) {
            System.out.println(ck);
        }

        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("siddharth.kilam@gmail.com");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("siddharth.kilam@gmail.com");
      //  driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.findElement(By.xpath("//button[@text()='Later'")).click();

    }


}
