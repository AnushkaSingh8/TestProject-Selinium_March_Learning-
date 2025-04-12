package wait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

/*
Condition	                                             Description
elementToBeClickable(By.id("btn"))              	            Waits until the element is visible and clickable
visibilityOfElementLocated(By.id("textBox"))	                Waits until the element is visible on the page
presenceOfElementLocated(By.id("menu"))                         Waits until the element is present in the DOM (even if not visible)
textToBePresentInElementLocated(By.id("message"), "Success")	Waits until specific text appears in an element
titleContains("Login")	                                        Waits until the page title contains the word "Login"
 */
public class ExplicitWait {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/login/");
        // 1. Creating an Explicit Wait Object - Using Duration.ofSeconds(15)
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        // 2. Waiting Until the Login Button is Clickable
        WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("login")));

        loginButton.click(); // Now the button is clickable
// If the condition is not met within 15 seconds, it throws a TimeoutException.
        driver.quit();
/*
When to Use?
When dealing with elements that appear dynamically (e.g., pop-ups, AJAX calls).
When waiting for specific conditions like:
Element to be clickable
Element to be visible
Text to be present
 */
    }
}
