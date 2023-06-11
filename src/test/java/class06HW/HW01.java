package class06HW;

import Utlis.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HW01 extends CommonMethods {
    public static void main(String[] args) {

        String URL = "http://practice.syntaxtechs.net/dynamic-elements-loading.php";
        String browser= "Edge";
        openBrowserAndLaunchApplication(URL,browser);

        WebElement startBtn = driver.findElement(By.xpath("//button[text()='Start']"));
        startBtn.click();

        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//h4[text()='Welcome Syntax Technologies']"),"Welcome Syntax Technologies"));


        WebElement text = driver.findElement(By.xpath("//h4[text()='Welcome Syntax Technologies']"));
        System.out.println(text.getText());

    }
}
