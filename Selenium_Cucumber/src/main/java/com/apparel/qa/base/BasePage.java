package com.apparel.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {

	public static WebDriver driver;
	public static Properties propFile;

	public BasePage(){

		try
		{FileInputStream fio = new FileInputStream(System.getProperty("user.dir")
				+"\\src\\main\\java\\com\\apparel\\qa\\config\\config.properties");

		propFile = new Properties();
		propFile.load(fio);		
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void initialize() {
		
		String driverTest = propFile.getProperty("browser");
//		String driverURL = propFile.getProperty("url");
		
		if(driverTest.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}

		driver.manage().window().maximize();

	}
	
}
