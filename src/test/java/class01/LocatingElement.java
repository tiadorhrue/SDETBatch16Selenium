package class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LocatingElement {
    public static void main(String[] args) {
        WebDriver driver=new EdgeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();

        driver.findElement(By.id("email")).sendKeys("tiadivine96@gmail.com");
        driver.findElement(By.name("pass")).sendKeys("Password1234");
    }
}
