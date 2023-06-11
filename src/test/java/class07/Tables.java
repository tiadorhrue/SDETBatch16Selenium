package class07;

import Utlis.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Tables extends CommonMethods {
    public static void main(String[] args) {

        String url = "https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html";
        String browser = "Edge";

        openBrowserAndLaunchApplication(url,browser);

        // printing the table out as a whole

        WebElement wholeTable =driver.findElement(By.xpath("//table[@id='customers']"));
        String allText = wholeTable.getText();
        System.out.println(allText);

        System.out.println("***************************************************");

        // printing out the table based on rows

        List<WebElement> allrows= driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
        for (WebElement row : allrows){
            String rowText = row.getText();
            System.out.println(rowText);
        }

        System.out.println("****************************************************");

        List<WebElement> allCellData = driver.findElements(By.xpath("//table=[@id='customers'/tbody/tr/td']"));
        for(WebElement cell:allCellData){
            String cellData = cell.getText();
            System.out.println(cellData);
        }

    }
}
