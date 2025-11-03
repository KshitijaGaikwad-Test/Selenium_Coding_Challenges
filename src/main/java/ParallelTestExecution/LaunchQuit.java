package ParallelTestExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class LaunchQuit {
    WebDriver driver;

    @BeforeMethod
    @Parameters("browser")
    public void launch(String nameOfBrowser){
        if(nameOfBrowser.equalsIgnoreCase("chrome")){
             driver = new ChromeDriver();
        }else if (nameOfBrowser.equalsIgnoreCase("firefox")){
             driver = new FirefoxDriver();
        }else if (nameOfBrowser.equalsIgnoreCase("safari")){
             driver = new SafariDriver();
        }

        driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=155259813593&hvpone=&hvptwo=&hvadid=674893540034&hvpos=&hvnetw=g&hvrand=17067972991858395855&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9146233&hvtargid=kwd-64107830&hydadcr=14452_2316413&gad_source=1");
        driver.manage().window().maximize();
    }
}
