package class06;

import Utlis.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class ImplicitWait extends CommonMethods {
    public static void main(String[] args) {
        String URL = "https://www.facebook.com/";
        String browser= "Edge";
        openBrowserAndLaunchApplication(URL,browser);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        WebElement createAccountBtn= driver.findElement(By.xpath("//a[text()='Create new account']"));
        createAccountBtn.click();

        WebElement firstName = driver.findElement(By.xpath("//input[@name='firstname']"));
        sendText("abacadabra",firstName);

    }
}
