package class04HW;

import Utlis.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HW02 extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
        String URL = "https://www.facebook.com/";
        String browser = "Edge";

        openBrowserAndLaunchApplication(URL , browser);

        WebElement signUp = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
        signUp.click();

        Thread.sleep(3000);
        WebElement month = driver.findElement(By.xpath("//Select[@name='birthday_month']"));
        Select mon = new Select(month);
        mon.selectByIndex(7);

        WebElement days = driver.findElement(By.xpath("//Select[@name='birthday_day']"));
        Select day = new Select(days);
        day.selectByValue("15");

        WebElement year = driver.findElement(By.xpath("//Select[@name='birthday_year']"));
        Select years = new Select(year);
        years.selectByVisibleText("1996");
        Thread.sleep(3000);

        driver.quit();
    }
}
