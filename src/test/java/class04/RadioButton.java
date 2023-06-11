package class04;

import Utlis.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RadioButton extends CommonMethods {
    public static void main(String[] args) {

        openBrowserAndLaunchApplication("http://practice.syntaxtechs.net/basic-radiobutton-demo.php","Edge");
        WebElement r1 = driver.findElement(By.xpath("//input[@value='Male' and @name='optradio']"));
        r1.click();

        boolean r1isSelected = r1.isSelected();
        System.out.println("The radio button is selected: "+r1isSelected);

        boolean r1isDisplayed = r1.isDisplayed();
        System.out.println("The radio button is selected: "+r1isDisplayed);

        boolean r1isEnabled = r1.isEnabled();
        System.out.println("The radio button is selected: "+r1isEnabled);

        WebElement r2 = driver.findElement(By.xpath("//input[@value='Female' and @name='optradio']"));
        r2.click();

        r1isSelected=r1.isSelected();
        System.out.println("The male radio button is selected: "+r1isSelected);

    }
}
