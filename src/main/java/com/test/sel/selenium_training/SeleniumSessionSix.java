package com.test.sel.selenium_training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumSessionSix {
	
	public static void main(String args[]) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
//		driver.navigate().to("https://the-internet.herokuapp.com/");
//		driver.manage().window().maximize();
//		driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[8]/a")).click();
//		driver.findElement(By.name("Username")).sendKeys("ramana@123");
//		driver.findElement(By.name("Password")).sendKeys("ramana123");
//		Thread.sleep(10000);
//		driver.navigate().back();
		
		driver.navigate().to("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[9]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/a")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[9]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[2]/a")).click();
		Thread.sleep(10000);
		driver.navigate().back();
//		driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[9]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/a")).click();
		Thread.sleep(10000);
		driver.navigate().back();
//		driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[9]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[4]/a")).click();
		Thread.sleep(10000);
		driver.navigate().back();
//		driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[9]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[5]/a")).click();
		Thread.sleep(10000);
		driver.navigate().back();
//		driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[9]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"page-footer\"]/div/div/a")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("ramanareddy3107@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"subscribe\"]/div/select")).sendKeys("//*[@id=\"subscribe\"]/div/select/option[3]");
		driver.findElement(By.name("fields[send_book_sample]")).click();
		driver.findElement(By.id("submit")).click();
		
	}

}
