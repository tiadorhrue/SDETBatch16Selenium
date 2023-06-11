package class08;

import Utlis.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DynamicTablePages extends CommonMethods {
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

        //        click on PIM
        WebElement pimBtn = driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']"));
        pimBtn.click();


        boolean found = false;
        while (!found) {

            List<WebElement> allIDs = driver.findElements(By.xpath("//table/tbody/tr/td[2]"));

            for (int i = 0; i < allIDs.size(); i++) {
                String iD = allIDs.get(i).getText();
                if (iD.equals("53481AA")) {
                    System.out.println("click on the check box on row number " + (i + 1));
                    WebElement checkBox = driver.findElement(By.xpath("//table/tbody/tr[" + (i + 1) + "]/td[1]"));
                    checkBox.click();

                    found=true;
                    break;
                }
            }
            if(!found){
                WebElement nextBtn = driver.findElement(By.xpath("//a[text()='Next"));
                nextBtn.click();
            }
        }
    }
}