package wait;
// Feature	    Implicit Wait                         	Explicit Wait
//Scope    	    Applies globally to all elements	    Applies to a specific element
//Control       No control over specific elements	    Waits for specific conditions
//Performance 	Can slow down tests if set too high  	Faster, as it waits only when needed
//Example Use	General waits for slow-loading elements	Waiting for pop-ups, AJAX elements
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class ImplicitWait {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        // It tells Selenium to wait for a certain amount of time before throwing an exception if an element is not found.
        // Setting an implicit wait of 10 seconds
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.facebook.com/login/");

        // The driver will wait for up to 10 seconds for elements to appear before throwing an error
/*
When to Use?
When you want a default wait time for all elements.
Useful when dealing with elements that take a little time to load.
Disadvantage:
Applies to all elements, even if not needed, which might slow down test execution.
 */
        driver.quit();
    }
}
