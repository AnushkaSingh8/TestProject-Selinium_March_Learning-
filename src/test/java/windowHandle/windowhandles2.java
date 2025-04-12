package windowHandle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class windowhandles2 {
    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        System.out.println(driver.getWindowHandle());
        driver.findElement(By.xpath("//a[@href='http://www.orangehrm.com']")).click();
        System.out.println(driver.getWindowHandle());
driver.close();
    }
}
