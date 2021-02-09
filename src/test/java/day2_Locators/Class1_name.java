package day2_Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import javafx.scene.control.TableRow;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class1_name {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.google.com");

        Thread.sleep(1000);

        driver.findElement(By.name("q")).sendKeys("java");

        driver.findElement(By.name("btnK")).click();

    }
}
