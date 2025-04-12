package checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Checkbox1 {
    public static void main(String[] args) throws InterruptedException {
// Select first 3 checkbox
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        driver.get("https://testautomationpractice.blogspot.com/");
        List<WebElement> allcheckbox = driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
        // Print the total number of radio buttons
        System.out.println("total num of radio button" + allcheckbox.size());
        Thread.sleep(4000);
        // when we have to select specific checkbox / radiobox we cant use for each loop coz of indexing
        for (int i = 0; i < 3; i++) {    // we can also use same loop to unselect all 3
            allcheckbox.get(i).click();
        }
        // Unselect all checkboxes using loop         // first it will select all first 3 and then select all and unselect first 3
       // for(int i=0; i< allcheckbox.size();i++){
       //     allcheckbox.get(i).click();}


        for(int i=0; i< allcheckbox.size();i++){
            if(allcheckbox.get(i).isSelected()){
                allcheckbox.get(i).click();}

        }

    }
}
