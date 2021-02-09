package day1_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleVerification {
    public static void main(String[] args) throws InterruptedException {

 // setup chrome driver
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.google.com");
        System.out.println("current Title= "+ driver.getTitle());

        String currentUrl= driver.getCurrentUrl();
        System.out.println("current Url= "+currentUrl);

        Thread.sleep(2500);

        driver.close();

    }
}
