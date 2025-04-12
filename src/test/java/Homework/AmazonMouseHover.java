package Homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class AmazonMouseHover {


    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();

driver.get("https://www.amazon.in/b/?_encoding=UTF8&node=4286640031&ref_=sv_top_hk_mega_7");
        //  Locate "Accounts & Lists" menu
        WebElement accountsLists = driver.findElement(By.id("nav-link-accountList"));

        //  Perform mouse hover using Actions class
        Actions actions = new Actions(driver);
        actions.moveToElement(accountsLists).perform();

        Thread.sleep(2000);

        // Click on "Your Account" option
        WebElement yourAccount = driver.findElement(By.xpath("//span[text()='Your Account']"));
        yourAccount.click();

        // Print confirmation
        System.out.println("Successfully clicked on 'Your Account'!");//
    }
}