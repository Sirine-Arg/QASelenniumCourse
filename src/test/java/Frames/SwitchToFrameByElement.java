package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToFrameByElement {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("file:///C://Users/SirineArgoubi/QAcart_Selenium_Course_Biggener/src/test/resources/frames.html");
        driver.manage().window().maximize();

        WebElement nestedFrame = driver.findElement(By.id("menu"));
        driver.switchTo().frame(nestedFrame);
        driver.switchTo().frame("links");
        driver.findElement(By.id("aboutPage")).click();

}
}
