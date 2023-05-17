package class01HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class class01HW1 {
    public static void main(String[] args) {
        WebDriver driver=new EdgeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.manage().window().maximize();
        driver.findElement(By.id("customer.firstName")).sendKeys("Tiadorh");
        driver.findElement(By.id("customer.lastName")).sendKeys("Rue");
        driver.findElement(By.id("customer.address.street")).sendKeys("123 Pleasent Place");
        driver.findElement(By.id("customer.address.city")).sendKeys("Atlanta");
        driver.findElement(By.id("customer.address.state")).sendKeys("Georgia");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("34566");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("123-456-7899");
        driver.findElement(By.id("customer.ssn")).sendKeys("111-22-3333");
        driver.findElement(By.id("customer.username")).sendKeys("TiaSyntax");
        driver.findElement(By.id("customer.password")).sendKeys("Password123");
        driver.findElement(By.id("repeatedPassword")).sendKeys("Password123");





    }
}
