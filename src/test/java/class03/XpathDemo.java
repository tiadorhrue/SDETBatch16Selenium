package class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class XpathDemo {
    public static void main(String[] args) {
        WebDriver driver=new EdgeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();

        WebElement username= driver.findElement(By.xpath("//input[@id='txtUsername']"));
        username.sendKeys("Admin");

        WebElement password = driver.findElement(By.xpath("//input[@id='txtPassword']"));
        password.sendKeys("Hum@nhrm123");

        WebElement LoginBtn = driver.findElement((By.xpath("//input[contains(@id, 'Login')]")));
        LoginBtn.click();

        WebElement pimTab = driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule'])"));
        pimTab.click();


    }
}
