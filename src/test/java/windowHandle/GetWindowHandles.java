package windowHandle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class GetWindowHandles {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");

        // Store main window ID
        String mainWindow = driver.getWindowHandle();

        // Click a product details button that opens in a new tab
        driver.findElement(By.id("viewDetails")).click();

        // Get all window handles (IDs of all open tabs/windows)
        Set<String> allWindows = driver.getWindowHandles();

// Now Switch to the new window
// Looping through all windows:
        for (String window : allWindows) //The for loop checks each window ID in allWindows.
        {
            if (!window.equals(mainWindow)) { // If it's NOT the main window
                driver.switchTo().window(window); // Switch to the new window
                break; // Exit the loop after switching
            }
        }
        // Now we are in the new tab, get product name
        String productTitle = driver.findElement(By.id("productTitle")).getText();
        System.out.println("Product Title: " + productTitle);

        // Close the new tab
        driver.close();

        // Switch back to the main window
        driver.switchTo().window(mainWindow);
    }
}
