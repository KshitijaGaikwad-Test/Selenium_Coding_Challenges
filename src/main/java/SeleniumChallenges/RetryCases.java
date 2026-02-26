package SeleniumChallenges;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class RetryCases {
    @Test(retryAnalyzer = RetryAnalyzer.class)
        public void setUp(){
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        String webTitle =driver.getTitle();
        SoftAssert sa= new SoftAssert();
        System.out.println(webTitle);
        sa.assertEquals(webTitle,"Gooogle");
        sa.assertAll();

        }

    }

