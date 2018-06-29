package com.Selenium_for_intelj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.setProperty("webdriver.chrome.driver", "E:\\se lab\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("http://www.facebook.com");
        ((ChromeDriver) driver).findElement(By.id("email")).sendKeys("0912234738");
        driver.findElement(By.id("pass")).sendKeys("25989773");
        driver.findElement(By.id("loginbutton")).click();
        String val =  driver.findElement(By.id("notificationsCountValue")).getText();

        System.out.println(val);
    }
}
