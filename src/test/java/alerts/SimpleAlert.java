package alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class SimpleAlert {
    public static void main(String[] args) {
        // Set up WebDriver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));

        // Open webpage with JavaScript alerts
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        // Click the button to trigger the alert
        driver.findElement(By.cssSelector("button[onclick='jsAlert()']")).click();

        // Switch to the alert and get the alert text
        Alert alert = driver.switchTo().alert();
        String alertText = alert.getText();  // Get the text of the alert
        System.out.println("Alert Message: " + alertText);  // Print alert text

        // Accept the alert (click "OK")
        alert.accept();
    }
}
