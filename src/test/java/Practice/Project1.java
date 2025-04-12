package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Project1 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://tutorialsninja.com/demo/");
        driver.findElement(By.xpath("//span[text()='My Account']")).click();
        driver.findElement(By.linkText("Register")).click();
        String act_Title ="Register Account";
        String exp_Title=driver.getTitle();
        System.out.println(exp_Title);

        if(act_Title.equals(exp_Title)){
            System.out.println("Test paased");
        }else {
            System.out.println("Test failed");
        }

        //
        driver.findElement(By.id("input-firstname")).sendKeys("anushka");
         driver.findElement(By.xpath("//input[@id='input-lastname']\n")).sendKeys("Singh");
        driver.findElement(By.xpath("//input[@id='input-email']\n")).sendKeys("singhanushka4556@gmail.com");
        driver.findElement(By.xpath("//input[@id='input-telephone']\n")).sendKeys("7275114556");
        driver.findElement(By.xpath("//input[@id='input-password']\n")).sendKeys("Anushka@12345");
        driver.findElement(By.xpath("//input[@id='input-confirm']\n")).sendKeys("Anushka@12345");
        driver.findElement(By.cssSelector("input[value='1'][name='newsletter']")).click();
        List<WebElement> count= driver.findElements(By.xpath("//input[@type='radio']"));
        System.out.println(count.size());


    }


    public static class Login {
        public static void main(String[] args) {
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
    // Implicit wait, this is not required for maximize but good practice.
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

            driver.get("https://panel.unolo.com/login?redirect=/");



            driver.findElement(By.xpath("//input[@name='email']")).sendKeys("siddharth.kilam@gmail.com");
            driver.findElement(By.xpath("//input[@name='password']")).sendKeys("siddharth.kilam@gmail.com");
            driver.findElement(By.xpath("//button[@type='submit']")).click();
            //To get title of webpage and print
            System.out.println(driver.getCurrentUrl());
            // To get source of webpage and print
            System.out.println(driver.getPageSource());
            // To capture title and print
            System.out.println(driver.getTitle());


            //driver.findElement(By.xpath("//button[@id='change_plan']")).click();
          //  driver.findElement(By.xpath("//li[contains(.,'Elite')]")).click();

            // To get title of webpage and print
            String act_Title=driver.getTitle();
            System.out.println(act_Title);
            String ex_Title="Login | Unolo";
            if(act_Title.equals(ex_Title)) {
                System.out.println("Test passed");
            }else{
                    System.out.println("Test failed");
                }

            driver.close();  //Closes the currently focused browser window.
            // driver.quit(); //Closes all browser windows and terminates the entire browser process.
            }
        }
}

