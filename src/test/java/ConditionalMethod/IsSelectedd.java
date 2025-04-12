package ConditionalMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class IsSelectedd {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
      //  Boolean select= driver.findElement(By.cssSelector("input[value='1'][name='newsletter']")).isSelected();
        //System.out.println(select);
        WebElement yes=driver.findElement(By.cssSelector("input[value='1'][name='newsletter']"));
        WebElement No=driver.findElement(By.cssSelector("input[value='0']"));
        System.out.println(yes.isSelected());    // false
        System.out.println(No.isSelected());    // true

        // After selecting
        yes.click();
        System.out.println(yes.isSelected());    //true
        System.out.println(No.isSelected());    // false

    }
}
