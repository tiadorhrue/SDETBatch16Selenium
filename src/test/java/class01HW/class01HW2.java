package class01HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.devtools.v85.webaudio.WebAudio;
import org.openqa.selenium.edge.EdgeDriver;

public class class01HW2 {
    public static void main(String[] args) {
        WebDriver driver=new EdgeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        driver.manage().window().maximize();
        driver.findElement(By.name("ctl00$MainContent$username")).sendKeys("Tester");
        driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("test");
        System.out.println(driver.getTitle());
    }
}
