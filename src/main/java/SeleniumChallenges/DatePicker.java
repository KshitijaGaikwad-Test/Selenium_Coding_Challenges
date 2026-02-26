package SeleniumChallenges;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {
    static ChromeDriver driver;
    public static void main(String[] args) {
         driver = new ChromeDriver();
        driver.get("https://jqueryui.com/datepicker/");
        driver.manage().window().maximize();
        WebElement frame = driver.findElement(By.tagName("iframe"));
        driver.switchTo().frame(frame);
        driver.findElement(By.id("datepicker")).click();
        selectDate("2","May","2025");


    }

    public static void selectDate( String date, String month, String year){
        String dispMonth = driver.findElement(By.className("ui-datepicker-month")).getText();
        String dispYear = driver.findElement(By.className("ui-datepicker-year")).getText();

        while(true){
            if(dispMonth.equals(month) && dispYear.equals(year)){
                break;
            }else{
                driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
                dispMonth = driver.findElement(By.className("ui-datepicker-month")).getText();
                dispYear = driver.findElement(By.className("ui-datepicker-year")).getText();
            }
        }


    }
}
