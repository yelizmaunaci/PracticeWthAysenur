package day4_xpath;

import Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P1_Xpath_Yeliz {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("http://practice.cybertekschool.com/forgot_password");

        WebElement homeLink = driver.findElement(By.xpath("//a[@class='nav-link']"));

        WebElement forgotPasswordHeader = driver.findElement(By.xpath("//h2[.='Forgot Password']"));

        WebElement emailText = driver.findElement(By.xpath("//label[.=\"E-mail\"]"));

        WebElement emailInputBox = driver.findElement(By.cssSelector("input[type=\"text\"]"));

        WebElement retrievePassword = driver.findElement(By.cssSelector("button#form_submit"));

        WebElement PoweredText = driver.findElement(By.xpath("//div[@style=\"text-align: center;\"]"));


        if (homeLink.isDisplayed() && forgotPasswordHeader.isDisplayed() &&
                emailText.isDisplayed() && emailInputBox.isDisplayed() && retrievePassword.isDisplayed()
                && PoweredText.isDisplayed()) {
            System.out.println("all of them DISPLAYED");
        } else {
            System.err.println("FAILED");
        }

        driver.close();

    }
}
