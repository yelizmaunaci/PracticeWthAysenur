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

        driver.navigate().back();

        Thread.sleep(1000);

        driver.navigate().forward();

        driver.navigate().to("https://www.facebook.com");

        Thread.sleep(1000);

        System.out.println("current Title " + driver.getTitle());

        String expectedUrl ="yeliz";
        currentUrl= driver.getCurrentUrl();
        System.out.println("current Url= "+ currentUrl);

        if(currentUrl.contains(expectedUrl)){
            System.out.println("Current url pass: " +currentUrl);
        }else{
            System.err.println("Fail ");
}

        driver.close();

        /*
          if (url.contains(expectedInUrl)) {
            System.out.println("Current url verification pass!: " + url);
        } else {
            System.err.println("URL verification Fail: " );


        }
         */

    }
}
