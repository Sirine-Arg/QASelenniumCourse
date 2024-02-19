package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//import java.time.Duration;

public class DropDownLists {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
       // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        driver.get("file://C:/Users/SirineArgoubi/QAcart_Selenium_Course_Biggener/src/test/resources/index.html");
        //Select coursesDropDown = new Select(driver.findElement(By.id("courses")));

        WebElement dropDown = driver.findElement(By.id("courses"));
        Select coursesDropDown = new Select(dropDown);
        //coursesDropDown.selectByIndex(2);
        //coursesDropDown.selectByVisibleText("selenium");
        coursesDropDown.selectByValue("appium");




    }
}
