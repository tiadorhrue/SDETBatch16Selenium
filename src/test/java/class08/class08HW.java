package class08;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class class08HW extends CommonMethods {
    public static void main(String[] args) {
        String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";
        String browser = "Edge";

        openBrowserAndLaunchApplication(url, browser);

        WebElement userName = driver.findElement(By.xpath("//input[@id='txtUsername']"));
        userName.sendKeys("Admin");
        WebElement passWord = driver.findElement(By.xpath("//input[@id='txtPassword']"));
        passWord.sendKeys("Hum@nhrm123");
        WebElement loginButton = driver.findElement(By.xpath("//input[@id='btnLogin']"));
        loginButton.click();

        WebElement recruitBtn = driver.findElement(By.xpath("//a[@id='menu_recruitment_viewRecruitmentModule']"));
        recruitBtn.click();

        WebElement fromCalender = driver.findElement(By.xpath("//input[@id='candidateSearch_fromDate']"));
        fromCalender.click();

        WebElement month = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
        month.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        Select sel = new Select(month);
        sel.selectByVisibleText("Feb");

        WebElement year = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
        year.click();
        Select selYear = new Select(year);
        selYear.selectByVisibleText("2024");

        WebElement day = driver.findElement(By.xpath("//a[text()='15']"));
        day.click();


        WebElement toCalender = driver.findElement(By.xpath("//input[@id='candidateSearch_toDate']"));
        toCalender.click();

        WebElement toMonth = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
        toMonth.click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        Select selMon = new Select(toMonth);
        selMon.selectByVisibleText("Aug");

        WebElement toYear = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
        toYear.click();

        Select selToYear = new Select(toYear);
        selToYear.selectByVisibleText("2026");

        WebElement toDay = driver.findElement(By.xpath("//a[text()='20']"));
        toDay.click();



//
    }
}

