package com.test.sel.selenium_training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumSessionSeven {
	
	public static void main (String args []) throws InterruptedException  {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[11]/a")).click();
		driver.findElement(By.id("dropdown")).click();
		driver.findElement(By.xpath("//*[@id=\"dropdown\"]/option[2]")).click();
	    Thread.sleep(10000);
	    driver.navigate().back();
	    driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[11]/a")).click();
		driver.findElement(By.id("dropdown")).click();
		driver.findElement(By.xpath("//*[@id=\"dropdown\"]/option[3]")).click();
	    Thread.sleep(10000);
	    driver.navigate().back();
	    
		
	}
	

}
