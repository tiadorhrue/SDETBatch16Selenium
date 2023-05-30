package Utlis;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CommonMethods {

    public static WebDriver driver;
    public static void openBrowserAndLaunchApplication(String url, String browser){
        switch (browser){
            case "chrome":
                driver=new ChromeDriver();
                break;

            case "firefox":
                driver=new FirefoxDriver();
                break;
            case "Edge":
                driver=new EdgeDriver();

        }
//       maximize the window
        driver.manage().window().maximize();
        //navigate to the url
        driver.get(url);
    }
    public static void closeBrowser(){

        driver.close();
    }
}
