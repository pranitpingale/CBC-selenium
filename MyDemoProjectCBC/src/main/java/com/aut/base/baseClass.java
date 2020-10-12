package com.aut.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class baseClass {
	public static Properties prop;
	public WebDriver driver;
	
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
	
	public void launchapp() throws Exception, IOException {
		WebDriverManager.chromedriver().setup();
		String browserName = prop.getProperty("browser");
		System.out.println(browserName);
		if(browserName.contains("Chrome")) {
			driver = new ChromeDriver();
			
		}else if (browserName.contains("Firefox")) {
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
	}
	
	}

