package class02HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.sql.Driver;

public class HW01 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        driver.get("http://www.facebook.com");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[text()='Create new account']")).click();
        Thread.sleep(7000);
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Tia");
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Rue");
        driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("tia.rue@syntax.com");
        driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("password123");
        driver.findElement(By.xpath("//select[@name='birthday_month']")).sendKeys("August");
        driver.findElement(By.xpath("//select[@name='birthday_day']")).sendKeys("15");
        driver.findElement(By.xpath("//select[@name='birthday_year']")).sendKeys("1996");
        WebElement gender = driver.findElement(By.xpath("//input[@type='radio' and @value='1']"));
        gender.click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//img[@class='_8idr img']")).click();
        Thread.sleep(3000);
        driver.quit();
    }
}
