package com.aut.testCase;


import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aut.base.baseClass;
import com.aut.pageobjects.LoginPage;
import com.aut.utilities.excelUtil;


public class loginTestCase extends baseClass  {
	LoginPage loginPage;

  
  @DataProvider
  public Object[][] getLoginData(){
	   
	   Object data [][] = excelUtil.getTestData("LOGIN");
	   return data;
	   }
   
  @BeforeMethod(alwaysRun=true)
  
  public void setUp() throws Exception, IOException {
	 loadConfig();
	 launchapp();
	 loginPage = new LoginPage();
  }
 
  @Test(dataProvider = "getLoginData")	
  public void loginTest(String username, String password){
	  
  LoginPage page =PageFactory.initElements(driver, LoginPage.class);
	
   page.userName(username);
   page.passWord(password);
   page.login();
   
  }
	
		
  @AfterMethod
  public void tearDown(){
	driver.quit();
	}
  
  
  
  

}
