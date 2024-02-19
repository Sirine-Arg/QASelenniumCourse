package methods;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import java.time.Duration;

public class ClickSeleniumSendKeys {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        driver.get("file://C:/Users/SirineArgoubi/QAcart_Selenium_Course_Biggener/src/test/resources/index.html");
        driver.findElement(By.cssSelector("[data-testid=email]")).sendKeys("me@sirineargoubi.com");
        driver.findElement(By.xpath("//*[@data-testid='password']")).sendKeys("test1234!");
        driver.findElement(By.id("Banana")).click();
    }
}
