package class04HW;

import Utlis.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HW01 extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {

           openBrowserAndLaunchApplication("http://practice.syntaxtechs.net/basic-select-dropdown-demo.php","Edge");
            WebElement drive = driver.findElement(By.xpath("//Select[@id='select-demo']"));

            Select days = new Select(drive);
            days.selectByVisibleText("Tuesday");
            Thread.sleep(3000);
            days.selectByIndex(5);
            Thread.sleep(3000);
            days.selectByValue("Friday");
            Thread.sleep(3000);
            driver.quit();

    }
}
