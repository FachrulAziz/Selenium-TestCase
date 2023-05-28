package com.juaracoding;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class login {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\Belajar Coding\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        JavascriptExecutor js = (JavascriptExecutor) driver;

        driver.get("https://shop.demoqa.com/");
        driver.get("https://shop.demoqa.com/my-account/");
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/main/article/div/div/div[2]/div[1]/form/p[1]/input")).sendKeys("fachrulaziz95");
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/main/article/div/div/div[2]/div[1]/form/p[2]/span/input")).sendKeys("vegazr4362");
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/main/article/div/div/div[2]/div[1]/form/p[3]/button")).click();
        delay(3);
        driver.quit();
        System.out.println("Close Browser");
    }
    static void delay(long detik){
        try {
            Thread.sleep(detik*3000); // delay 3 detik
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
