package Alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class SendKeysToAlert {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("file://C:\\Users\\SirineArgoubi\\QAcart_Selenium_Course_Biggener\\src\\test\\resources\\alert.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.findElement(By.className("prompt")).click();
        Thread.sleep(2000);
        driver.switchTo().alert().sendKeys("Hello Alert !");
        driver.switchTo().alert().accept();

    }
}
