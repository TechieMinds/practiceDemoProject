package com.test.sel.selenium_training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumSessionTen {
	
	public static void main (String args []) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
	    driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[14]/a")).click();
	    driver.findElement(By.xpath("//*[@id=\"content\"]/div/a[1]")).click();
	    driver.findElement(By.xpath("//*[@id=\"start\"]/button")).click();
	    Thread.sleep(10000);
	    driver.navigate().back();
	    driver.findElement(By.xpath("//*[@id=\"content\"]/div/a[2]")).click();
	    driver.findElement(By.xpath("//*[@id=\"start\"]/button")).click();
	    Thread.sleep(10000);
	    driver.navigate().back();
	    Thread.sleep(10000);
	    driver.navigate().back();
		
	}

}
