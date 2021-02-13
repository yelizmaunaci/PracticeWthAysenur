package day4_xpath;

import Utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P1_XPath_CssSelector1 {
    public static void main(String[] args) {


        //XPATHand CSSSelectorPRACTICESDO NOT USE ANY DEVELOPER TOOLS TO GET ANY LOCATORS.
        //TC #1: PracticeCybertek.com_ForgotPassword WebElement verification
        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        //2. Go to http://practice.cybertekschool.com/forgot_password
        driver.get("http://practice.cybertekschool.com/forgot_password");


        //3. Locate all the WebElements on the page using XPATH and/or CSSlocator only (total of 6)
        //a. “Home” linkb.
        WebElement homebutton = driver.findElement(By.xpath("/html/body/nav/ul/li/a"));

        //“Forgot password” headerc.
        WebElement forgotPasswordButton = driver.findElement(By.xpath("//*[@id=\"content\"]/div/h2"));

        //“E-mail” textd.
        WebElement emailText = driver.findElement(By.xpath("//*[@id=\"forgot_password\"]/div/div/label"));

        // E-mail input boxe.
        WebElement emailInputBox = driver.findElement(By.xpath("//*[@id=\"forgot_password\"]/div/div/input"));

        //“Retrieve password” buttonf.
        WebElement retrivePasswordButton = driver.findElement(By.xpath("//*[@id=\"form_submit\"]/i"));

        //“Powered byCybertek School” text
        WebElement poweredByCybertekbutton = driver.findElement(By.xpath("//*[@id=\"page-footer\"]/div/div"));

        //4. Verify all WebElements are displayed.
        if(homebutton.isDisplayed()&& forgotPasswordButton.isDisplayed()&& emailText.isDisplayed()&& emailInputBox.isDisplayed()
            && retrivePasswordButton.isDisplayed()&& poweredByCybertekbutton.isDisplayed()){
            System.out.println("All elements are displayed");
        }else{
            System.err.println("Failed!");
        }
        driver.close();



    }
}