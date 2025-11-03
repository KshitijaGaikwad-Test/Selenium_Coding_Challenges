package ParallelTestExecution;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class ParallelEx1 extends LaunchQuit  {


        @Test
        public void Searching_For_Dresses() {

            WebElement searchField = driver.findElement(By.id("twotabsearchtextbox"));
            searchField.sendKeys("dress");
            searchField.sendKeys(Keys.ENTER);


        }
    }

