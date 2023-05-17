package class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class NavigateCommand {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new EdgeDriver();
        driver.get("https://www.google.com");
        Thread.sleep(2000);
        driver.navigate().to("https://www.facebook.com/");
        Thread.sleep(2000);
        driver.navigate().refresh();
        Thread.sleep(1000);
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().forward();
        driver.quit();// closes out the complete browser
        driver.close();// closes out the tab

    }
}

