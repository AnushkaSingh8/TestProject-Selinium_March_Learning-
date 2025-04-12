package mouse_Operation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class MouseHover {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/order_details?order_id=OD431524397997575100&item_id=431524397997575100&unit_id=431524397997575100000");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        Actions act = new Actions(driver);
        WebElement over =driver.findElement(By.xpath("//*[text()='Home & Furniture']"));
        act.moveToElement(over).perform(); // for mouse hover action
    }

}
