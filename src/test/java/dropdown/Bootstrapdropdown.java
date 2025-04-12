package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Bootstrapdropdown {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(300));
        driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
        driver.findElement(By.xpath("//span[@class='multiselect-selected-text']")).click();

        // Select single Web element (try one of these XPaths)
        // driver.findElement(By.xpath("//label[text()='Java']")).click();
        //driver.findElement(By.xpath("//label[text()='Java']/input")).click();
         driver.findElement(By.xpath("//ul[contains(@class,'multiselect')]//li/a[text()='Java']")).click();


        /// Capture all options and find out size (adjust XPath if needed)
        List<WebElement> Options = driver.findElements(By.xpath("//ul[contains(@class,'multiselect')]//li//label"));
        System.out.println(Options.size());
        // Printing all options
        for (WebElement op : Options) {
            System.out.println(op.getText());
        }
        // Select Multiple option


    }
}
