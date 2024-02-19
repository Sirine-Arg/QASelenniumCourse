package basics;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSourceSelenium {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://qacart.com/ar");
        String pageSource = driver.getPageSource();
        System.out.println("The current page source is " + pageSource);
    }
}
