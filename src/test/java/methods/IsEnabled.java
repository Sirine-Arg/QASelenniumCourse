package methods;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file://C:/Users/SirineArgoubi/QAcart_Selenium_Course_Biggener/src/test/resources/index.html");
        boolean checkBox = driver.findElement(By.cssSelector("[data-testid='checkbox']")).isSelected();
        System.out.println(checkBox);
        boolean email = driver.findElement(By.cssSelector("[data-testid='email']")).isEnabled();
        System.out.println(email);
        String attribute = driver.findElement(By.cssSelector("[data-testid='submit']")).getAttribute("class");
        System.out.println(attribute);
        String tagName = driver.findElement(By.cssSelector("[data-testid='submit']")).getTagName();
        System.out.println(tagName);
        String name = driver.findElement(By.cssSelector("[data-testid='submit']")).getCssValue("background-color");
        System.out.println(name);
        String borderRadius = driver.findElement(By.cssSelector("[data-testid='submit']")).getCssValue("border-radius");
        System.out.println(borderRadius);
        Point location = driver.findElement(By.cssSelector("[data-testid='submit']")).getLocation();
        System.out.println(location.y); //x, y
        Dimension size = driver.findElement(By.cssSelector("[data-testid='submit']")).getSize();
        System.out.println(size.width); // width, height
        Rectangle rect = driver.findElement(By.cssSelector("[data-testid='submit']")).getRect();
        System.out.println(rect.height); //x, y, width, height

        driver.quit();




    }
}
