package SeleniumChallenges;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingHiddenDropdown {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        WebElement userNameField = driver.findElement(By.xpath("//input[@name='username']"));
        userNameField.sendKeys("Admin");
        WebElement passwordField = driver.findElement(By.xpath("//input[@name='password']"));
        passwordField.sendKeys("admin123");
        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
        loginButton.click();
        Thread.sleep(3000);
        WebElement adminOption = driver.findElement(By.xpath("(//li[@class='oxd-main-menu-item-wrapper'])[1]"));
        adminOption.click();
        WebElement userRoleDropdown = driver.findElement(By.xpath("(//div[@class='oxd-select-text oxd-select-text--active'])[1]"));
        userRoleDropdown.click();
    }
}
