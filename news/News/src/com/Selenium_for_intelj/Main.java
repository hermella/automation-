package com.Selenium_for_intelj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static ArrayList<String>  titlesDes = new ArrayList<>();
    static ArrayList<String>  Desc = new ArrayList<>();
    static ArrayList<String> img = new ArrayList<>();
    public static void main(String[] args) {
	// write your code here





        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ajirit\\Documents\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://addisfortune.net/");

        List<WebElement> header = driver.findElements(By.tagName("h3"));
        //List<WebElement> image  = driver.findElements(By.className("span2"));
        List<WebElement> description = driver.findElements(By.tagName("excerpt-post-p-justify"));

        for (WebElement i:header ) {
            String headline = i.getText();
            titlesDes.add(headline);
            //System.out.println(headline);

            break;
        }


        for (WebElement i:description ) {
            String story = i.getText();
            //System.out.println(story);
            Desc.add(story);
        }

        int i = 0;

        while(i < titlesDes.size()){
            System.out.println(titlesDes.get(i));
        }

        int j = 0;
        while(j < Desc.size()){
            System.out.println(Desc.get(i));
        }

        /*for (WebElement i:image){
            String images = i.getText();
            img.add(images);
            System.out.println(images);
        }


        driver.get("file:///C:/Users/Ajirit/Documents/3rd.%202nd/SE/news/form.html");
        int i = 0;
        while(i < titlesDes.size()){
            String header1 = titlesDes.get(i);
            String descr =  Desc.get(i);
            driver.findElement(By.id("title")).sendKeys(header1);
            driver.findElement(By.id("description")).sendKeys(descr);
        }
        */




//        System.out.println(header.get(0).getText());
//        System.out.println(description.get(1).getText());

    }
}
