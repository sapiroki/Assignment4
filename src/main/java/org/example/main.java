package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class main {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com/signup");

        WebElement acceptCookiesButton = driver.findElement(By.cssSelector("button[data-cookiebanner='accept_button']"));

        acceptCookiesButton.click();

        WebElement firstName = driver.findElement(By.name("firstname"));
        firstName.sendKeys("Kirill");

        WebElement lastName = driver.findElement(By.name("lastname"));
        lastName.sendKeys("Shapiro");

        WebElement email = driver.findElement(By.name("reg_email__"));
        email.sendKeys("kirill.shapiro1@gmail.com");

        WebElement reemail = driver.findElement(By.name("reg_email_confirmation__"));
        reemail.sendKeys("kirill.shapiro1@gmail.com");

        WebElement password = driver.findElement(By.name("reg_passwd__"));
        password.sendKeys("12345678");

        Select day = new Select(driver.findElement(By.name("birthday_day")));
        day.selectByVisibleText("6");

        Select month = new Select(driver.findElement(By.name("birthday_month")));
        month.selectByVisibleText("апр");

        Select year = new Select(driver.findElement(By.name("birthday_year")));
        year.selectByVisibleText("2001");

        WebElement femaleRadioButton = driver.findElement(By.xpath("//input[@value='1']"));
        WebElement maleRadioButton = driver.findElement(By.xpath("//input[@value='2']"));

        femaleRadioButton.click();

        WebElement submit = driver.findElement(By.name("websubmit"));
        submit.click();

        driver.quit();
    }
}
