package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class HandleFrame {
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        driver.get("https://ui.vision/demo/webtest/frames/");
        WebElement Frame1= driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
        driver.switchTo().frame(Frame1);

        driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("welcome");

        driver.switchTo().defaultContent(); //go back to the page
// Frame 2
        WebElement Frame2= driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
        driver.switchTo().frame(Frame2);

        driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("Selenium");
        driver.switchTo().defaultContent(); //go back to the page

// Frame 3
        WebElement Frame3= driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
        driver.switchTo().frame(Frame3);

        driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("Selenium1");
// Innner Frame - iframe  part of frame 3

    }
}
