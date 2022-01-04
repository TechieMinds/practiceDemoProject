package com.test.sel.selenium_training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumSessionOne {

	public static void main(String args[]) {
		WebDriverManager.chromedriver().setup();
		
		//to open Chrome browser
		WebDriver browser = new ChromeDriver();
		
		//maximize
		browser.manage().window().maximize();
		
		//to navigate to a web app
		browser.navigate().to("https://fb.com");
		
		browser.findElement(By.id("email")).sendKeys("sai@gmail.com");
		
		
	}
}
