package javascriptExecutorScrollupandDown;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HorizontallScroll {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.selenium.dev/");

        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Simulate a page with horizontal scroll (you might need to adjust the content)
        js.executeScript("document.body.style.width = '3000px';"); // Make the body wider to enable horizontal scrolling

        // Horizontal scroll right by 500 pixels
        js.executeScript("window.scrollBy(500, 0)"); // Note the change (500, 0)
        Thread.sleep(2000);

        // Horizontal scroll left by 500 pixels
        js.executeScript("window.scrollBy(-500, 0)"); // Note the change (-500, 0)
        Thread.sleep(2000);

        //Reset the page width
        js.executeScript("document.body.style.width = '100%';");

        driver.quit();
    }
}
