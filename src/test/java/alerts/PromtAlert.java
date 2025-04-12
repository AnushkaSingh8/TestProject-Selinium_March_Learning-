package alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class PromtAlert {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(300));
        // Prompt alert with input and click ok button  we have to perm 2 action so we store in variable
        driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
        Alert al=driver.switchTo().alert();
        al.sendKeys("annie");
        Thread.sleep(3000);
        al.accept();

    }
}
