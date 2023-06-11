package class03HW;

import Utlis.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static Utlis.CommonMethods.driver;

public class HW01 {
    public static void main(String[] args) throws InterruptedException {

        CommonMethods.openBrowserAndLaunchApplication("http://practice.syntaxtechs.net/input-form-demo.php","Edge");
        WebElement firstName = driver.findElement(By.cssSelector("input[name='first_name']"));
        firstName.sendKeys("Tia");
        WebElement lastName = driver.findElement(By.cssSelector("input[name='last_name']"));
        lastName.sendKeys("Rue");
        WebElement eMail = driver.findElement(By.cssSelector("input[name='email']"));
        eMail.sendKeys("tia.rue@syntax.com");
        WebElement phoneNumber = driver.findElement(By.cssSelector("input[name='phone']"));
        phoneNumber.sendKeys("8551234567");
        WebElement address = driver.findElement(By.cssSelector("input[name='address']"));
        address.sendKeys("1234 Love Lane");
        WebElement city = driver.findElement(By.cssSelector("input[name='city']"));
        city.sendKeys("Atlanta");
        WebElement state = driver.findElement(By.cssSelector("select[name=state]"));
        state.click();
        WebElement stateOptions= driver.findElement(By.xpath("//option[text() = 'Georgia']"));
        stateOptions.click();
        WebElement zipCode = driver.findElement(By.cssSelector("input[name='zip']"));
        zipCode.sendKeys("11122");
        WebElement webSite = driver.findElement(By.cssSelector("input[name='website']"));
        webSite.sendKeys("www.tiarue.com");
        WebElement areYouHosting= driver.findElement(By.cssSelector("input[value=yes]"));
        areYouHosting.click();
        WebElement projDesc= driver.findElement(By.cssSelector("textarea[name=comment]"));
        projDesc.sendKeys("The best project you have ever seen!");
        WebElement send = driver.findElement(By.cssSelector("button[type=submit]"));
        send.click();
        Thread.sleep(4000);
        CommonMethods.closeBrowser();











    }
}
