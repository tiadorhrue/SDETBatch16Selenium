package Class04;

import Utlis.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import javax.lang.model.util.Elements;
import java.util.List;

public class RadioButtonDemo02 extends CommonMethods {
    public static void main(String[] args) {

        openBrowserAndLaunchApplication("http://practice.syntaxtechs.net/basic-radiobutton-demo.php","Edge");
        List<WebElement> ageGroup =  driver.findElements(By.xpath("//input[@name='ageGroup']"));

        String option = "5 - 15";

        for(WebElement age: ageGroup){

            String value = age.getAttribute("value");
            if(value.equals(option)){
                age.click();
                break;
            }
        }


    }
}
