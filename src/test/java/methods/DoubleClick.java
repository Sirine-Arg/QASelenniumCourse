package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class DoubleClick {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("file://C:/Users/SirineArgoubi/QAcart_Selenium_Course_Biggener/src/test/resources/index.html");
        driver.manage().window().maximize();

        Actions action = new Actions(driver);
        WebElement doubleClickBtn = driver.findElement(By.cssSelector("[data-testid='right double click btn']"));
        action.doubleClick(doubleClickBtn).perform();

        WebElement rightClickButton = driver.findElement(By.cssSelector("[data-testid='right double click btn']"));
        action.contextClick(rightClickButton).perform();
        action.doubleClick(driver.findElement(By.xpath("//*[@class='btn btn-primary']"))).perform();



    }
}
