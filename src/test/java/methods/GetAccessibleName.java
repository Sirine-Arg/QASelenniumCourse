package methods;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class GetAccessibleName {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("file://C:/Users/SirineArgoubi/QAcart_Selenium_Course_Biggener/src/test/resources/index.html");
        String name = driver.findElement(By.cssSelector("[data-testid=email]")).getAccessibleName();
        System.out.println(name);
        String role =  driver.findElement(By.cssSelector("[data-testid=submit]")).getAriaRole();
        System.out.println(role);
    }
}
