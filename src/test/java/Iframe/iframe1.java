package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class iframe1 {
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        driver.get("https://demoqa.com/frames");
        // Find all iframe elements, or find specific frame IDs.
      //  List<WebElement> listOfFrames = driver.findElements(By.tagName("iframe"));
     //   System.out.println("Number of frames: " + listOfFrames.size());

        /*//Or get the frame by the correct Id.
        WebElement frame1 = driver.findElement(By.id("frame1"));
        WebElement frame2 = driver.findElement(By.id("frame2"));
        System.out.println("Frame 1 is present: " + (frame1 != null));
        System.out.println("Frame 2 is present: " + (frame2 != null));*/

        // Switch to the iframe using id or name
        //  driver.switchTo().frame("frame1");


        //By index= used mostly you have single frame

        // Switch to the iframe using WebElement
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='frame1']")));

        // Corrected XPath to find the h1 element
        WebElement Element = driver.findElement(By.xpath("//h1[text()='This is a sample page']"));
        System.out.println(Element.getText());

        // Switch back to the parent frame
        driver.switchTo().parentFrame();

        driver.quit(); // added quit driver.


    }
}
