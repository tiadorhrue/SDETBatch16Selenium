package class03HW;

import Utlis.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static Utlis.CommonMethods.driver;

public class HW02 {
    public static void main(String[] args) throws InterruptedException {

        CommonMethods.openBrowserAndLaunchApplication("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login%E2%80%9D","Edge");
        WebElement userName = driver.findElement(By.cssSelector("input[name=txtUsername"));
        userName.sendKeys("Admin");
        WebElement logIn = driver.findElement(By.cssSelector("input[type=submit]"));
        logIn.click();
        Thread.sleep(4000);
        driver.close();



    }
}
