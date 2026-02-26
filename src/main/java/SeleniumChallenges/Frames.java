package SeleniumChallenges;

import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://yi.vision/demo/webtest/frames/");
        driver.manage().window().maximize();


    }
}
