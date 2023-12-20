package com.simplilearn.seleniumtest;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LauchChromeTest {
public static void main(String[] args) {
		
		// step1: formulate a test domain url & driver path
		String siteUrl = "https://www.google.com/";
		String driverPath = "drivers/windows/chromedriver.exe";
		
		// step2: set system properties for selenium dirver
		System.setProperty("webdriver.chrome.driver", driverPath);
		
		// step3: instantiate selenium webdriver
		WebDriver driver = new ChromeDriver();
		
		
		driver.get(siteUrl);
		
		
		driver.close();
	}


}
