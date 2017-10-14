package com.icicibank.loans.homeloans;

import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunching {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Driver//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//driver.get("https://www.google.com");
		driver.navigate().to("https://www.amazon.co.uk");		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		 String x =driver.getTitle();
		 System.out.println(x);
		 String y = driver.getCurrentUrl();
		 System.out.println(y);
		 driver.close();
		 //driver.quit();
 
 
	}

	
}
