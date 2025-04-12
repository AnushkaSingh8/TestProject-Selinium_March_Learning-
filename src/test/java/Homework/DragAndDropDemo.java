package Homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDropDemo {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();


            // Open the demo website
            driver.get("https://jqueryui.com/droppable/");
            driver.manage().window().maximize();

            //  Switch to the iframe containing drag-and-drop elements
          driver.switchTo().frame(0);

            //  Locate the draggable and droppable elements
            WebElement draggable = driver.findElement(By.id("draggable"));
            WebElement droppable = driver.findElement(By.id("droppable"));

            // Perform drag and drop using Actions class
            Actions actions = new Actions(driver);
            actions.dragAndDrop(draggable, droppable).perform();

            //
            System.out.println("Successfully performed drag and drop!");


        }
    }


