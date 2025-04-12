package mouse_Operation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Tooltip {
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        driver.get("https://demoqa.com/tool-tips");
        WebElement tooltipElement =driver.findElement(By.xpath("//button[@id='toolTipButton']"));
        //String tooltipText = tooltipElement.getAttribute("title"); // Get tooltip text
       // System.out.println("Tooltip text is: " + tooltipText);

        Actions act = new Actions(driver);
        act.moveToElement(tooltipElement).perform(); // for mouse hover action





    }
}
