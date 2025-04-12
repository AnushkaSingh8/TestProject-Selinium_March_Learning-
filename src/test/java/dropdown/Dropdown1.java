package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class Dropdown1 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        driver.get("https://testautomationpractice.blogspot.com/");
        WebElement dropdown=driver.findElement(By.xpath("//select[@id='country']"));

        // Create Select object
        Select dropdowncountry= new Select(dropdown);

        dropdowncountry.selectByVisibleText("Japan");
      //  dropdowncountry.selectByValue("France");
      //  dropdowncountry.selectByIndex(2);

        // Get all options from dropdown --dropdowncountry.getOptions();
          List <WebElement> Options =dropdowncountry.getOptions();
        System.out.println(Options.size());

// Printing the dropdown opton
        for(WebElement op:Options){
        System.out.println(op.getText());}
    }
}
