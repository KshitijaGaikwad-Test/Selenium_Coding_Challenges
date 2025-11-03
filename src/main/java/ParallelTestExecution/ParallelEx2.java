package ParallelTestExecution;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ParallelEx2 extends LaunchQuit {

    @Test
    public void Searching_For_BottomWare()
         {

            WebElement searchField = driver.findElement(By.id("twotabsearchtextbox"));
            searchField.sendKeys("BottomWare");
            searchField.sendKeys(Keys.ENTER);



        }

    }

