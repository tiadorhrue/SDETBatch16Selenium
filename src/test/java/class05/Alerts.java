package class05;

import Utlis.CommonMethods;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import javax.sql.CommonDataSource;

public class Alerts extends CommonMethods {

    public static void main(String[] args) throws InterruptedException {
        String URL="http://practice.syntaxtechs.net/javascript-alert-box-demo.php";
        String browser="Edge";
        openBrowserAndLaunchApplication(URL, browser);

        WebElement alert1Btn = driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']"));
        alert1Btn.click();

        Thread.sleep(3000);
        Alert confirmationAlert1 = driver.switchTo().alert();
        confirmationAlert1.accept();

        WebElement alert2Btn = driver.findElement(By.xpath("//button[@onclick='myConfirmFunctions()']"));
        alert2Btn.click();
        Thread.sleep(3000);

        Alert confirmationAlret2 = driver.switchTo().alert();
        confirmationAlret2.dismiss();
    }
}
