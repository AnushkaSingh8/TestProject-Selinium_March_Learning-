package windowHandle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Set;

public class Windowhandle {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        System.out.println(driver.getWindowHandle());
        driver.findElement(By.xpath("//a[@href='http://www.orangehrm.com']")).click();
        System.out.println(driver.getWindowHandle());
        driver.close();  // close parent window
    }}