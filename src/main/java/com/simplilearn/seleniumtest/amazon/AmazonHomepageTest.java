package com.simplilearn.seleniumtest.amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class AmazonHomepageTest {
	public static void main(String[] args) {

		
		String siteUrl = "https://www.amazon.in";
		String driverPath = "drivers/windows/geckodriver.exe";

		
		System.setProperty("webdriver.geckodriver.driver", driverPath);

		
		WebDriver driver = new FirefoxDriver();

		
		driver.get(siteUrl);
		String expectedTitle  = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		String actualTitle  = driver.getTitle();
		
		if(expectedTitle.equals(actualTitle)) {
			System.out.println("Test is Passed !");
		} else {
			System.out.println("Test is Failed !");
		}
		
		System.out.println("Expected Title : " + expectedTitle);
		System.out.println("Actual Title : " + actualTitle);
		
		driver.close();
	}
		
		
		
	}


