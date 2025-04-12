package Homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import java.time.Duration;
// Hidden dropdown
public class Multi_select {
    public static void main(String[] args) {
        // Set up WebDriver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Open webpage with dropdown
        driver.get("https://demoqa.com/select-menu");
       WebElement option= driver.findElement(By.xpath("(//div[contains(@class,'css-1hwfws3')])[3]"));

    }
}
