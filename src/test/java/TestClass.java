import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.sql.Driver;

public class TestClass {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new EdgeDriver();
        driver.get("https://www.google.com");
        System.out.println(driver.getTitle());
        String currentURL=driver.getCurrentUrl();
        System.out.println(currentURL);
        Thread.sleep(5000);
        driver.quit();


    }
}
