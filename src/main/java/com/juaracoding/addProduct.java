package com.juaracoding;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class addProduct {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\Belajar Coding\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        System.out.println("Open Browser");
        driver.manage().window().maximize();
        JavascriptExecutor js = (JavascriptExecutor) driver;

        driver.get("https://shop.demoqa.com/my-account/");
        driver.findElement(By.xpath("/html/body/div[1]/section/div/div/div/span[1]/a")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[3]/div/div[2]/div/div/div/div[2]/div[2]/div[2]/div/h3/a")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/form/table/tbody/tr[1]/td/select")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/form/table/tbody/tr[1]/td/select")).sendKeys("Grey");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/form/table/tbody/tr[2]/td/select")).sendKeys("42");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/form/div/div[2]/button")).click();

        driver.quit();
        System.out.println("Close Browser");
    }
}
