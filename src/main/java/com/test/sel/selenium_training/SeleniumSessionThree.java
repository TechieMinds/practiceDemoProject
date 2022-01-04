package com.test.sel.selenium_training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumSessionThree {

	public static void main (String args []) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
//		WebDriver driver = new ChromeDriver();
//    	driver.manage().window().maximize();
//		driver.navigate().to("https://the-internet.herokuapp.com/");
//		driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[5]/a")).click();
//		driver.findElement(By.id("4d3ee640-153b-0139-158b-16cc996cb59c")).click();
//		driver.findElement(By.id("7b8b22f0-153b-0139-159f-16cc996cb59c")).click();
//		driver.findElement(By.id("a47a03a0-153b-0139-15c7-16cc996cb59c")).click();
//		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[2]/table/tbody/tr[1]/td[7]/a[1]")).click();
//		driver.navigate().back();
//		driver.navigate().back();
		
		WebDriver driver1 = new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.navigate().to("https://the-internet.herokuapp.com/");
		driver1.findElement(By.xpath("//*[@id=\"content\"]/ul/li[6]/a")).click();
		Thread.sleep(10000);
		driver1.findElement(By.xpath("//*[@id='checkboxes']/input[2]")).click();
		Thread.sleep(10000);
		driver1.navigate().back();
		
	}
	
}
