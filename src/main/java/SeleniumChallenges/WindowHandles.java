package SeleniumChallenges;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowHandles {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.naukri.com/chatbot?conversation=marketing_reg&app=Naukri&domain=Naukri&context.src_tmp=19717&utm_source=google&utm_medium=cpc&utm_campaign=Search_Brand_FORGE&gclsrc=aw.ds&gad_source=1&gad_campaignid=22529405481&gbraid=0AAAAADLp3cHwWXY6xJStS9sZGB76fyq3y&gclid=CjwKCAjwu9fHBhAWEiwAzGRC_-QpneeklsGEf47bNCI1k-aS7YgN1GE_KrRDReM6ERCV2efH8C5RlBoCnA0QAvD_BwE");
        Thread.sleep(500);
        WebElement terms = driver.findElement(By.xpath("//a[@target='_blank']"));
        terms.click();
        driver.manage().window().maximize();

        //GetWindowHandle will always give u Parent window ID
        String ParentId = driver.getWindowHandle();
        System.out.println("Parent window ID is " + ParentId);

        Set<String> allOpenedWindowIds = driver.getWindowHandles();
        System.out.println("All opened window Id's are :" + allOpenedWindowIds);


    }
}
