package com.test.sel.selenium_training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumSessionTwo {
	
	public static void main (String args []) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
//		WebDriver driver = new ChromeDriver();
		
//		WebDriver browser = new ChromeDriver();
		
//		driver.manage().window().maximize();		
//		driver.navigate().to("http://www.fb.com");
//		driver.findElement(By.id("email")).sendKeys("ramanareddy3107@gmail.com");
//		driver.findElement(By.id("pass")).sendKeys("ramanareddy@7");
//		driver.findElement(By.id("loginbutton")).click();
	
//	   driver.navigate().to("http://www.fb.com");
//	   driver.findElement(By.name("email")).sendKeys("ramanareddy3107@gmail.com");
//	   driver.findElement(By.name("pass")).sendKeys("ramanareddy@7");
//	   driver.findElement(By.name("login")).click();
	  
//	   WebDriver driver1 = new ChromeDriver();
//	   driver1.manage().window().maximize();
//	   driver1.navigate().to("https://the-internet.herokuapp.com/");
//	   driver1.findElement(By.xpath("//*[@id=\"content\"]/ul/li[1]/a")).click();
//	   driver1.navigate().back();
	   Thread.sleep(20000);
//	   driver1.findElement(By.xpath("//*[@id=\"content\"]/ul/li[2]/a")).click();
//	   driver1.findElement(By.xpath("//*[@id=\"content\"]/div/button")).click();
//	   driver1.navigate().back();
	   
	   WebDriver driver2 = new ChromeDriver();
	   driver2.manage().window().maximize();
	   driver2.navigate().to("https://the-internet.herokuapp.com/");
	   driver2.findElement(By.xpath("//*[@id=\"content\"]/ul/li[4]/a")).click();
//	   driver2.navigate().back();
	 
	}
}
