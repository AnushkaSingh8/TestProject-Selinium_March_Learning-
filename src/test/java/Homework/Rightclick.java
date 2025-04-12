package Homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Rightclick {

        public static void main(String[] args) throws InterruptedException {
            // Setup WebDriver
            WebDriver driver = new ChromeDriver();

            // Open the demo website
            driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
            driver.manage().window().maximize();

            Thread.sleep(2000);
            WebElement rightClickButton = driver.findElement(By.cssSelector(".context-menu-one"));

            // Perform right-click using Actions class
            Actions actions = new Actions(driver);
            actions.contextClick(rightClickButton).perform();

            //  Select an option from the context menu
            WebElement editOption = driver.findElement(By.xpath("//li[contains(@class, 'context-menu-icon-edit')]"));
            editOption.click();

            //  Print confirmation
            System.out.println("Successfully selected 'Edit' from the context menu!");


        }

    }
