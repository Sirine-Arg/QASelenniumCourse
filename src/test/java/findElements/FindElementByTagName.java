package findElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementByTagName {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("file://C:/Users/SirineArgoubi/QAcart_Selenium_Course_Biggener/src/test/resources/index.html");
        driver.manage().window().maximize();
        //String elementText = driver.findElement(By.tagName("li")).getText();
        String elementText = driver.findElement(By.xpath("//*[@data-testid='welcome-header']")).getText();

        System.out.println(elementText);
        driver.quit();
    }
}
