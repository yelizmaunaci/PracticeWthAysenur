package day2_Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class1_ID {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://login.yahoo.com");

        driver.findElement(By.id("login-username")).sendKeys("yeliz");

        //driver.findElement(By.id("mbr-forgot-link")).click();




    }
}
