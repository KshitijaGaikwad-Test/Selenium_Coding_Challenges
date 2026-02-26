package SeleniumChallenges;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HandleBootStrapDropdown {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/select-menu");
        driver.manage().window().maximize();

        //Select single option
        driver.findElement(By.xpath("(//div[@class=' css-yk16xz-control'])[3]")).click();
        List<WebElement> allOptions = driver.findElements(By.xpath("(//div[@class=' css-2b097c-container'])[3]//div[@class=' css-26l3qy-menu']//div"));
        System.out.println("Size of all options :"+allOptions.size());

        for(WebElement op:allOptions){
            String option = op.getText();
            if(option.equals("Green")||option.equals("Black")){
                op.click();
            }
        }
    }
}
