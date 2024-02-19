package Windows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandleAndHandles {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("file://C://Users/SirineArgoubi/QAcart_Selenium_Course_Biggener/src/test/resources/windows.html");
        driver.manage().window().maximize();
        System.out.println(driver.getWindowHandle());
        driver.findElement(By.id("qa-cart")).click();
        //String parent = driver.getWindowHandle();
        System.out.println(driver.getWindowHandles());

    }
}
