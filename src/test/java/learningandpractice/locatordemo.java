package learningandpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class locatordemo {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.opencart.com/");
        driver.manage().timeouts().getImplicitWaitTimeout();

        driver.findElement(By.name("")).sendKeys();  //Name
        // Id
        boolean logodisplay = driver.findElement(By.id("logo")).isDisplayed(); // is displayed return boolean value true or false
        System.out.println(logodisplay);
        // Link text
        driver.findElement(By.linkText("Tablets")).click();
        driver.findElement(By.partialLinkText("blets")).click(); // not recommended its maybe common to multiple one not unique one
        // Tag name and class name = used to find group of webelement not used for locating specific web element
        List <WebElement> link =driver.findElements(By.tagName("a"));
        System.out.println(link.size());
        // class name
        List <WebElement> headerlink =driver.findElements(By.className("list.inline.item"));
        System.out.println(headerlink.size());
// To print  all link
        for(WebElement el:link){
            System.out.println();
        }


    }


}
