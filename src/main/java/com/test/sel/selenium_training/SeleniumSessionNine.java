package com.test.sel.selenium_training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumSessionNine {

	public static void main (String args []) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
	    driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[13]/a")).click();
	    driver.findElement(By.xpath("//*[@id=\"checkbox\"]")).click();
	    driver.findElement(By.xpath("//*[@id=\"checkbox-example\"]/button")).click();
	    Thread.sleep(10000);
	    driver.findElement(By.xpath("//*[@id=\"checkbox-example\"]/button")).click();
	    Thread.sleep(10000);
	    driver.findElement(By.xpath("//*[@id=\"input-example\"]/button")).click();
	    driver.findElement(By.xpath("//*[@id=\"input-example\"]/input")).sendKeys("disabled in 10 Sec.");
	    Thread.sleep(10000);
	    driver.findElement(By.xpath("//*[@id=\"input-example\"]/button")).click();
	    Thread.sleep(10000);
	    driver.findElement(By.xpath("//*[@id=\"input-example\"]/input")).clear();
	    Thread.sleep(10000);
	    driver.navigate().back();
	    
	}
	
}
