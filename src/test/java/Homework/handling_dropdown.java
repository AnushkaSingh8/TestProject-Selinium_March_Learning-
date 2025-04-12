package Homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class handling_dropdown {
    public static void main(String[] args) {
        // Set up WebDriver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Open webpage with dropdown
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");

        // Locate the dropdown element
        WebElement dropdownElement = driver.findElement(By.xpath("//select[@class='form-select']"));

        // Create Select object
        Select dropdown = new Select(dropdownElement);

        // Select an option by visible text
        dropdown.selectByVisibleText("Two");

        // Print the currently selected option
        WebElement selectedOption = dropdown.getFirstSelectedOption();
        System.out.println("Selected Option: " + selectedOption.getText());

        // Get all options from dropdown
        List<WebElement> options = dropdown.getOptions();
        System.out.println("Total options in dropdown: " + options.size());

        // Print all dropdown options
        System.out.println("Dropdown Options:");
        for (WebElement option : options) {
            System.out.println(option.getText());
        }

        // Close the browser
        driver.quit();
    }
}
