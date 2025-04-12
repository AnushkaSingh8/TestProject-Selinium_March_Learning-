package javascriptExecutorScrollupandDown;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrolldownToBottomOfPage {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.selenium.dev/");
        driver.manage().window().maximize();

        //  Create JavaScriptExecutor object
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Scroll down to the bottom of the page
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        Thread.sleep(2000);

        //  Scroll up to the top of the page
        js.executeScript("window.scrollTo(0, 0)");
        Thread.sleep(2000);
}
    }
