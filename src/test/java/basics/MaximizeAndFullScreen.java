package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizeAndFullScreen {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("file://C:/Users/SirineArgoubi/QAcart_Selenium_Course_Biggener/src/test/resources/index.html");
        driver.manage().window().maximize();
        //driver.manage().window().fullscreen();

    }
}
