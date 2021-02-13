package day3_xpathvscss;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathvscss {
    public static void main(String[] args) {
        //1. Open Chrome Browser

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");
        //2. Go to https://www.amazon.com
        driver.get("https://www.amazon.com");

        //3. Enter search term(use css selector to locate search box)
        //WebElement amazonSearchBar = driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"));
        WebElement amazonSearchBar = driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));

        amazonSearchBar.sendKeys("apple" + Keys.ENTER);
        //amazonSearchBar.findElement(By.id("twotabsearchtextbox")).sendKeys("apple");

        //Verify title contains search term

        String expectedInTitle = "apple";
        String actualTittle = driver.getTitle();


        if(actualTittle.contains(expectedInTitle)){
            System.out.println("Tittle contains" + actualTittle +" ");

        }else{
            System.out.println("Title does not contain search key");

        }



    }
}
