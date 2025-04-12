package Upload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class FileUploadBySendkeys {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        driver.get("https://demoqa.com/upload-download");
        // first we check that upload file open with click or not if not then use actions class to  click - move to element
        driver.findElement(By.xpath("//input[@id='uploadFile']"))
                //     .sendKeys("C:\\Users\\anush\\Downloads\\Route.xlsx");
                .sendKeys("C:\\Users\\anush\\OneDrive\\Desktop\\kedarnath pics\\anushka.jpg");
                   // send keys= path from properties and\\ file name
                    //C:\Users\anush\OneDrive\Desktop\Fileupload.exe
    }
}
