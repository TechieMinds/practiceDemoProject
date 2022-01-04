package com.test.sel.selenium_training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumSessionEleven {
	
	public static void main (String args []) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
//		click on the Entry Ad
	    driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[15]/a")).click();
	    Thread.sleep(5000);
//	    Click on Close
	    driver.findElement(By.xpath("//*[@id=\"modal\"]/div[2]/div[3]/p")).click();
	    Thread.sleep(10000);
//	    Click on the click here
	    driver.findElement(By.xpath("//*[@id=\"restart-ad\"]")).click();
	    Thread.sleep(5000);
//	    Click on the click here again
	    driver.findElement(By.xpath("//*[@id=\"restart-ad\"]")).click();
	    Thread.sleep(10000);
//	    Click on the Close
	    driver.findElement(By.xpath("//*[@id=\"modal\"]/div[2]/div[3]/p")).click();
	    Thread.sleep(5000);
//	    Click on click here
	    driver.findElement(By.xpath("//*[@id=\"restart-ad\"]")).click();
	    Thread.sleep(5000);
//	    Click on Close
	    driver.findElement(By.xpath("//*[@id=\"modal\"]/div[2]/div[3]/p")).click();
	    Thread.sleep(5000);
//	    Click on click here
	    driver.findElement(By.xpath("//*[@id=\"restart-ad\"]")).click();
	    Thread.sleep(10000);
//	    Click on Close
	    driver.findElement(By.xpath("//*[@id=\"modal\"]/div[2]/div[3]/p")).click();
	    Thread.sleep(10000);
	    driver.navigate().back();
	    
	}

}
