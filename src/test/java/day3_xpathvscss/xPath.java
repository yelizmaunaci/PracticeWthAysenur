package day3_xpathvscss;

import Utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xPath {
    public static void main(String[] args) throws InterruptedException {
        //go to this link: http://practice.cybertekcshool.com/multiple_buttons
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        //locate button2 USING XPATH LOCATOR

        //WebElement button2 = driver.findElement(By.xpath("//button[.='Button 2']"));
        WebElement button2 = driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/button[2]"));

        Thread.sleep(1000);
        button2.click();

    }
}
