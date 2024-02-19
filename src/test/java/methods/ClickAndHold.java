package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHold {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("file://C:/Users/SirineArgoubi/QAcart_Selenium_Course_Biggener/src/test/resources/index.html");
        driver.manage().window().maximize();

        Actions action = new Actions(driver);
        WebElement source = driver.findElement(By.id("draggable-1"));
        WebElement destination = driver.findElement(By.cssSelector(".example-dropzone"));
        action.clickAndHold(source).moveToElement(destination).release().build();
    }
}
