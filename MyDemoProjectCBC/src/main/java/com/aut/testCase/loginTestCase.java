package com.aut.testCase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.aut.pageobjects.loginPage;
import com.aut.utilities.excelUtil;

public class loginTestCase extends excelUtil {
	loginPage loginPage;
 
  public loginTestCase() {
	   super();
  }
  
  @DataProvider
  public Object[][] getLoginData(){
	   
	   Object data [][] = excelUtil.getTestData("LOGIN");
	   return data;
	   }
   
  @BeforeMethod
  
  public void setUp() {
	 launchapp();
	 loginPage = new loginPage();
  }
  
  @Test(dataProvider = "getTestData")	
  
  public void loginTest(String username, String password){
	  
	  loginPage.login(username, password);
	 
	}
	
		
  @AfterMethod
  public void tearDown(){
	driver.quit();
	}
  
  
  
  

}
