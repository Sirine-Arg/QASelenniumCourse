package Waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ThreadSleep {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("file://C:\\Users\\SirineArgoubi\\QAcart_Selenium_Course_Biggener\\src\\test\\resources\\wait.html");
        driver.manage().window().maximize();


        Thread.sleep(4000);
        driver.findElement(By.className("primary")).click();


    }
}
