package com.simplilearn.seleniumtest;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LauchFireFoxTest {

public static void main(String[] args) {
		
		
		String siteUrl = "https://www.google.com/";
		String driverPath = "drivers/windows/geckodriver.exe";
		
		
		System.setProperty("webdriver.gecko.driver", driverPath);
		
		
		WebDriver driver = new FirefoxDriver();
		
		
		driver.get(siteUrl);
		
		
		
	}
}

