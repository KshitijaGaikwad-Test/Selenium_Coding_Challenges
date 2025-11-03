package SeleniumChallenges;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HandleDynamicDropdown {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        WebElement dropEle = driver.findElement(By.xpath("//select[@id='country']"));
        Select optionToBeSelected = new Select(dropEle);

        //Select option from the dropdown
            //1. Using Select Class -
        // optionToBeSelected.selectByVisibleText("India");
        // optionToBeSelected.selectByValue("japan");
        // optionToBeSelected.selectByIndex(3);


        //Capture the options list from the dropdown using getOptions() method
        List<WebElement> options = optionToBeSelected.getOptions();
        System.out.println("Total options from dropdown :"+options.size());

        //Print all available options using for loop
        for(int i=0; i<options.size();i++){
            System.out.println(options.get(i).getText());
        }


    }
}
