package Windows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class SwitchToWindow {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("file://C://Users/SirineArgoubi/QAcart_Selenium_Course_Biggener/src/test/resources/windows.html");
        driver.manage().window().maximize();

        String parent = driver.getWindowHandle();
        //System.out.println(parent);
        driver.findElement(By.id("qa-cart")).click();

        Set<String> allWindows = driver.getWindowHandles();
        //System.out.println(allWindows);

        for(String window:allWindows) {

            if (!window.equalsIgnoreCase(parent)) {
                System.out.println(driver.getTitle());
                driver.switchTo().window(window);
                System.out.println(driver.getTitle());
                driver.switchTo().window(parent);
                System.out.println(driver.getTitle());
            }
        }


        //driver.quit();
    }
}
