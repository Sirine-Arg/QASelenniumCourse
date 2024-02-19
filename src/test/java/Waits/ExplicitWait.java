package Waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWait {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("file://C:\\Users\\SirineArgoubi\\QAcart_Selenium_Course_Biggener\\src\\test\\resources\\wait.html");
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

                wait.until(ExpectedConditions.visibilityOfElementLocated((By.className("primary")))).click();
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("cover")));
                wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("cover")));
                driver.findElement(By.className("secondary")).click();

    }
}
