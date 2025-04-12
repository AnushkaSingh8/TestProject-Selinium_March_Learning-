package ConditionalMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Isdisplayed {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://tutorialsninja.com/demo/");

        WebElement image= driver.findElement(By.linkText("Qafox.com"));
        System.out.println(image.isDisplayed());


       //Boolean logo= driver.findElement(By.xpath("//i[@class='fa fa-user']")).isDisplayed();
       // System.out.println(logo  +" "+ "is visible");




    }
}
