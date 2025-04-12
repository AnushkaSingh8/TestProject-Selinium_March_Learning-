package javascriptExecutorScrollupandDown;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollByPixel {
    public static void main(String[] args) throws InterruptedException {
// x- horizntal,y-vertical
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.selenium.dev/");
        driver.manage().window().maximize();

        //  Create JavaScriptExecutor object
        JavascriptExecutor js = (JavascriptExecutor) driver;

        //  Scroll down by 500 pixels
        js.executeScript("window.scrollBy(0,500)");
        Thread.sleep(2000); // Pause to see the effect

        //  Scroll up by 500 pixels
        js.executeScript("window.scrollBy(0,-500)");
        Thread.sleep(2000);
    }
}
