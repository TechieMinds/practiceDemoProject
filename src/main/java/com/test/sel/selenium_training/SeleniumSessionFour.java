package com.test.sel.selenium_training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumSessionFour {

	public static void main(String [] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com/search?rlz=1C1CHZL_enIN833IN833&sxsrf=ALeKk01wiOhgZIf702j1g-_Ll962jsFu7g%3A1606746258690&ei=kgDFX6THKerVrtoP0bOVuA8&q=salesforce+home&oq=salesforce+home&gs_lcp=CgZwc3ktYWIQAzIHCAAQyQMQQzICCAAyAggAMgIIADICCAAyAggAMgIIADICCAAyAggAMgIIADoRCAAQsAMQigMQtwMQ5QIQiwM6BAgAEENQtKEBWLrEAWCyyQFoA3AAeAGAAZYCiAGqBpIBBTAuNC4xmAEAoAEBqgEHZ3dzLXdpesgBCrgBAsABAQ&sclient=psy-ab&ved=0ahUKEwik2PifvKrtAhXqqksFHdFZBfcQ4dUDCA0&uact=5");
		driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div[1]/a/h3/span")).click();
		driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/div/div/div/div[2]/div[1]/div[1]/div[3]/div/div[2]/div/a/span")).click();
		driver.findElement(By.xpath("//*[@id=\"UserFirstName-KwBW\"]")).sendKeys("Venkata Ramana Reddy");
		driver.findElement(By.xpath("//*[@id=\"UserLastName-MDsW\"]")).sendKeys("Nandikonda");
		Thread.sleep(5000);
		driver.findElement(By.name("Watch demos")).click();
		Thread.sleep(10000);
		driver.navigate().back();
		Thread.sleep(10000);
		driver.navigate().back();
		
	}
	
}
