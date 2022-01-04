package com.test.sel.selenium_training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumSessionEight {
	
	public static void main (String args []) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[12]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/p[2]s/a")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/p[2]/a")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/p[2]/a")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/p[2]/a")).click();
		Thread.sleep(5000);
		driver.navigate().back();
		driver.navigate().back();
		// finally quit the browser 
		driver.quit();
		//if we are using driver.quit after performing all the action then we need not to use
		//driver.navvigate.back();
		
	}

}
