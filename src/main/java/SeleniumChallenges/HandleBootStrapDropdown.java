package SeleniumChallenges;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBootStrapDropdown {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
        driver.manage().window().maximize();

        //Select single option
        driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click();

    }
}
