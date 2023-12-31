package com.simplilearn.seleniumtest.google;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;


public class GoogleSearchTest {

	public static void main(String[] args) throws InterruptedException {
		
		
		String siteUrl = "https://www.google.com/";
		String driverPath = "drivers/windows/geckodriver.exe";
		
		
		System.setProperty("webdriver.geckodriver.driver", driverPath);
		
		
		WebDriver driver = new FirefoxDriver();
		
		
		driver.get(siteUrl);
		
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("selenium documentation");
		searchBox.submit();
		
		Thread.sleep(2000);
		
		String expectedTitle = "selenium documentation - Google Search";
		String actualTitle = driver.getTitle();
		
		if(expectedTitle.equals(actualTitle)) {
			System.out.println("Test is Passed !");
		} else {
			System.out.println("Test is Failed !");
		}
		
		System.out.println("Expected Title : " + expectedTitle);
		System.out.println("Actual Title : " + actualTitle);
		
		// step5: close driver
		driver.close();
		
		
	}

	}


