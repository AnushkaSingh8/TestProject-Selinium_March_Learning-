package checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class practicechkbox {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        driver.get("https://testautomationpractice.blogspot.com/");
        List<WebElement> allcheckbox = driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
        // Print the total number of radio buttons
        System.out.println("total num of radio button" +"" +allcheckbox.size());
        Thread.sleep(4000);

        // Select all checkboxes using for-each loop
        for (WebElement el : allcheckbox) {
            System.out.println(el.getText());
        }
    }
}
