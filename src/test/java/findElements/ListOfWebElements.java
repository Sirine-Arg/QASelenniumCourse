package findElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ListOfWebElements {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("file://C:/Users/SirineArgoubi/QAcart_Selenium_Course_Biggener/src/test/resources/index.html");
        driver.manage().window().maximize();
        List<WebElement> courseList= driver.findElements(By.cssSelector(".course-list li"));
        //WebElement css = courseList.get(8);
        System.out.println(courseList.size());
        driver.quit();
    }
}
