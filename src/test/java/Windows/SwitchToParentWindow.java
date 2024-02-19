package Windows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class SwitchToParentWindow {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("file://C://Users/SirineArgoubi/QAcart_Selenium_Course_Biggener/src/test/resources/windows.html");
        driver.manage().window().maximize();

        String parent = driver.getWindowHandle();
        driver.findElement(By.id("qa-cart")).click();
        Set<String> allWindows = driver.getWindowHandles();

        for(String window:allWindows) {
            if (!window.equalsIgnoreCase(parent)) {
                driver.switchTo().window(window);
                Thread.sleep(3000);
                driver.close();
            }
        }
        driver.switchTo().window(parent);
        driver.findElement(By.id("youtube-channel")).click();
    }
}

