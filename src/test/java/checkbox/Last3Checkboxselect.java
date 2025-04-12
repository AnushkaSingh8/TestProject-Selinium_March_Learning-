package checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Last3Checkboxselect {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        driver.get("https://testautomationpractice.blogspot.com/");
        List<WebElement> allcheckbox = driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
        // Print the total number of radio buttons
        System.out.println("total num of radio button" + allcheckbox.size());
        Thread.sleep(4000);
        // Total num of checkbox-how many checkbox u want to select= starting index 7-3=4(4 is starting index 0)
        // when we have to select count of radiobox we cant use for each loop
         for(int i=4; i< allcheckbox.size();i++){
             allcheckbox.get(i).click();
         }


    }
}
