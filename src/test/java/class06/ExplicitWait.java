package class06;

import Utlis.CommonMethods;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWait extends CommonMethods {
    public static void main(String[] args) {
        String URL = "https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver";
        String browser= "Edge";
        openBrowserAndLaunchApplication(URL,browser);


        WebElement button1 = driver.findElement(By.xpath("//button[@id='enable-button']"));
        button1.click();

        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Button']")));

        WebElement button2 = driver.findElement(By.xpath("//button[text()='Button']"));
        button2.click();

        WebElement alertButn= driver.findElement(By.xpath("//button[@id='alert']"));
        alertButn.click();

        wait.until(ExpectedConditions.alertIsPresent());
        Alert alr = driver.switchTo().alert();
        alr.accept();

    }


}
