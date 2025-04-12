package mouse_Operation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Doubleclick2 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
        driver.manage().window().maximize();
        driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");

        driver.switchTo().frame("iframeResult");
        WebElement box1 = driver.findElement(By.cssSelector("#field1"));
        WebElement box2 = driver.findElement(By.cssSelector("#field2"));
        WebElement button = driver.findElement(By.cssSelector(" button[ondblclick='myFunction()']"));

        box1.clear();
        box1.sendKeys("welcome");

        Actions act = new Actions(driver);
        act.doubleClick(button).perform();
        String s = box2.getAttribute("value");
        // validation- box 2 should contain "welcome"
        if (s.equals("welcome")) {
            System.out.println("text copied");
        } else {
            System.out.println("not copied");
        }


    }
}
