import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

import static io.github.bonigarcia.wdm.WebDriverManager.*;

public class UI {

    public static void main(String[] args)
    {

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/form");
        driver.findElementById("first-name").sendKeys("Mohamed");
        driver.findElementById("last-name").sendKeys("Hatem");
        driver.findElementById("job-title").sendKeys("Computer Engineer");
        driver.findElementByClassName("input-group").findElement(By.id("radio-button-2") ).click();
        driver.findElement(By.xpath("/html/body/div/form/div/div[8]")).click();
        driver.close();



    }

}
