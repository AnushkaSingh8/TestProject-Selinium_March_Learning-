package mouse_Operation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class ClickAndhold {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
        driver.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html");
        WebElement element = driver.findElement(By.xpath("//li[@name='A'])"));
        Actions act = new Actions(driver);

        act.clickAndHold(element)
                .pause(Duration.ofSeconds(5))   // pauses the action for 3 seconds
                .release(element)              //releases the mouse button on the same element
                .build()                 // method create an action     // when we have to perform more than one element /action we need to use build() like hold and release
                .perform();              // complete an action     //executes the sequence of actions.


    }
}
