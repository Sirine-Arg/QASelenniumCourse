package Windows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class QuitAndClose {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("file://C://Users/SirineArgoubi/QAcart_Selenium_Course_Biggener/src/test/resources/windows.html");
        driver.manage().window().maximize();

        String parent = driver.getWindowHandle();
        driver.findElement(By.id("qa-cart")).click();

        Set<String> allWindows = driver.getWindowHandles();
        for(String window:allWindows) {
            if (!window.equalsIgnoreCase(parent)) {
                driver.switchTo().window(window);
                driver.close();
            }
        }

    }
}
