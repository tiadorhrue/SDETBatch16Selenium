package class07HW;

import Utlis.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Tables extends CommonMethods {
    public static void main(String[] args) {

            String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";
            String browser = "Edge";

            openBrowserAndLaunchApplication(url,browser);

            WebElement userName = driver.findElement(By.xpath("//input[@id='txtUsername']"));
            userName.sendKeys("Admin");
            WebElement passWord = driver.findElement(By.xpath("//input[@id='txtPassword']"));
            passWord.sendKeys("Hum@nhrm123");
            WebElement loginButton = driver.findElement(By.xpath("//input[@id='btnLogin']"));
            loginButton.click();

            WebElement pimBtn = driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']"));
            pimBtn.click();

            List<WebElement> findIDs = driver.findElements(By.xpath("//table/tbody/tr/td[2]"));


            for (int i = 0; i < findIDs.size(); i++) {
                String id= findIDs.get(i).getText();
                if(id.equals("55804A")){
                    System.out.println("Id 55804A is in row : "+i);
                }
            }

        }
    }

