package Homework;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Alertinput {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
        // Open webpage with JavaScript alerts
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        // Click the button to trigger the alert
        driver.findElement(By.cssSelector("button[onclick='jsPrompt()']")).click();

        // Switch to the alert and get the alert text
        Alert alert = driver.switchTo().alert();
        // Get the alert message text
        String alertText = alert.getText();
        System.out.println("Alert Message: " + alertText);

        // alert.sendkeys("My name is anushka");

        // Enter input into the alert
        String inputText = "My name is Anushka";
        alert.sendKeys(inputText);

        // Accept the alert
        alert.accept();

        // Print the input text to the console
        System.out.println("Input Given: " + inputText);


    }
}
