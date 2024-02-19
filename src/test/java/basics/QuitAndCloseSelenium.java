package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitAndCloseSelenium {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://qacart.com/ar");
        String title = driver.getTitle();
        System.out.println("The current Title is " + title);
        driver.close(); // Close only one window
        driver.quit();// Close all the windows and tabs
    }
}
