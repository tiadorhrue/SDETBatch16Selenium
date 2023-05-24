package Utlis;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CommonMethods {

    public static WebDriver driver;
    public static void openBrowserAndLaunchApplication(String url){
        driver=new EdgeDriver();
        driver.get(url);
        driver.manage().window().maximize();
    }
    public static void closeBrowser(){
        driver.close();
    }
}
