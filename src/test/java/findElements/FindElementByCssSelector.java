package findElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementByCssSelector {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("file://C:/Users/SirineArgoubi/QAcart_Selenium_Course_Biggener/src/test/resources/index.html");
        driver.manage().window().maximize();
        //By welcomeHeader = By.id("welcome");
        WebElement welcomeHeader = driver.findElement(By.id("welcome"));
        String elementText = welcomeHeader.getText();
        System.out.println(elementText);


        //welcomeHeader.getText();


        //String elementText = driver.findElement(By.cssSelector("#welcome")).getText();
        //String elementText = driver.findElement(By.cssSelector("[data-testid=\"welcome-header\"]")).getText();
        //String elementText = driver.findElement(welcomeHeader).getText();
        //System.out.println(elementText);
        driver.quit();
    }
}
