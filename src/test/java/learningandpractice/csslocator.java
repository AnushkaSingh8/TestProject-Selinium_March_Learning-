package learningandpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class csslocator {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().timeouts().getImplicitWaitTimeout();
        //  tagname#value of id
        // driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("nokia");
        //    driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("nokia");
        // tagname.classname   - also used to find group of element
       // driver.findElement(By.cssSelector("input.search-box-text.ui-autocomplete-input")).sendKeys("nokia");

         // Tag[attribute="value"]
         // driver.findElement(By.cssSelector("input[placeholder=\"Search store\"]")).sendKeys("nokia");

        //

    }
}
