package com.test.sel.selenium_training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SeliniumSessionFive {
	
	public static void main (String [] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
	   
		driver.navigate().to("https://www.google.com/search?q=royalenfied&rlz=1C1CHZL_enIN833IN833&oq=royalenfied&aqs=chrome..69i57j46i10i199i291i433j0i10i433l4j0i10.4545j0j7&sourceid=chrome&ie=UTF-8");
		driver.manage().window().maximize();
	    driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div[1]/a/h3/span")).click();
	    driver.findElement(By.id("close-gdpr")).click();
	    driver.findElement(By.id("languageSelector-5012")).click();
	    driver.findElement(By.xpath("//*[@id=\"language-dropdown-5530\"]/div/div/div[9]/ul/li/a")).click();
	    driver.findElement(By.id("close-gdpr")).click();
	    driver.findElement(By.className("navigationAnalytics")).click();
	    driver.findElement(By.id("close-gdpr")).click();
	    driver.findElement(By.className("icon-arrow-down")).click();
	    driver.findElement(By.className("custom-btn colored-btn arrow-right clr-w model bg-red")).click();
	    driver.findElement(By.id("name")).sendKeys("Venkata Ramana Reddy.N");
	    driver.findElement(By.id("email")).sendKeys("ramanareddy3107@gmail.com");
	    driver.findElement(By.id("mobile")).sendKeys("7799283360");
	    driver.findElement(By.name("pinCode")).sendKeys("505467");
	    driver.findElement(By.id("motorcycle")).click();
	    driver.findElement(By.cssSelector("top: 0px;")).click();
	    driver.findElement(By.className("recaptcha-checkbox-border")).click();
	    driver.findElement(By.id("enquiry-form-submit")).click();
	    Thread.sleep(10000);
	    driver.navigate().back();
	    
	}
	
}
