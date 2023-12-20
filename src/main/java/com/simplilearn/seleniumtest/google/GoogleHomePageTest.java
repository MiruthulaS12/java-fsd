package com.simplilearn.seleniumtest.google;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleHomePageTest {
	public static void main(String[] args) {

		String siteUrl = "https://www.google.com/";
		String driverPath = "drivers/windows/geckodriver.exe";

		System.setProperty("webdriver.chrome.driver", driverPath);

		
		WebDriver driver = new FirefoxDriver();

		
		driver.get(siteUrl);

		
		if(siteUrl.equals(driver.getCurrentUrl())) {
			System.out.println("Test is Passed !");
		} else {
			System.out.println("Test is Failed !");
		}
		
		System.out.println("Expected Url :: " + siteUrl);
		System.out.println("Actual Url :: " + driver.getCurrentUrl());
		
		
		
		driver.close();
	}

}
