package mouse_Operation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class DoubleClick {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/buttons");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
        driver.manage().window().maximize();

        Actions act = new Actions(driver);
        // double click 
        WebElement doubleclick = driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
        act.doubleClick(doubleclick).perform();
    }
}
