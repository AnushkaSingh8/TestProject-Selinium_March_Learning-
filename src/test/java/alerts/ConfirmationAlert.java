package alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ConfirmationAlert {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(300));
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        // Confirmation alert with ok button and cancel button
        driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
        Alert al = driver.switchTo().alert();// for ok button
        al.accept();
        al.dismiss();// for cancel
    }
}
