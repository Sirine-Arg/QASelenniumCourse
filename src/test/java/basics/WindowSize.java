package basics;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowSize {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("file://C:/Users/SirineArgoubi/QAcart_Selenium_Course_Biggener/src/test/resources/index.html");
        //Dimension iphoneXR = new Dimension(414, 896);
        Dimension ipadAir = new Dimension(820, 1180);
        driver.manage().window().setSize(ipadAir);

     }
}
