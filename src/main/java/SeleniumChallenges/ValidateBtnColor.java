package SeleniumChallenges;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ValidateBtnColor {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/buttons");
        WebElement button = driver.findElement(By.id("doubleClickBtn"));
        String btnClrBeforeHover = button.getCssValue("background-color");
        System.out.println("Button color before hover : "+btnClrBeforeHover);
        Actions actions = new Actions(driver);
        actions.moveToElement((button)).perform();
        String btnClrAfterHover = button.getCssValue("background-color");
        System.out.println("Button color after hover : "+btnClrAfterHover);
        if(!btnClrBeforeHover.equals(btnClrAfterHover)){
            System.out.println("Button color is changed after hover");
        }else System.out.println("Button color is not changed after hover");

    }
}
