package com.aut.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baseClass {
	public static Properties prop;
	public static WebDriver driver;
	
	@BeforeTest
	public void loadConfig() {
		try {
			prop = new Properties();
			System.out.println("Super constructor invoked");
			FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+"\\configuration\\config.properties");
			prop.load(ip);
			System.out.println("driver:" +driver);
		}
		catch(FileNotFoundException e ) {
			e.printStackTrace();
		}
		catch (IOException e) {
		e.printStackTrace();
	}
	}
	
	public static void launchapp() {
		WebDriverManager.chromedriver().setup();
		String browserName = prop.getProperty("browser");
		if(browserName.contains("Chrome")) {
			driver = new ChromeDriver();
			
		}else if (browserName.contains("Firefox")) {
			driver = new FirefoxDriver();
		}
	}
	
	}

