package com.aut.testCase;


import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aut.base.baseClass;
import com.aut.pageobjects.LoginPage;

public class loginTest_DataProvider extends baseClass  {
	LoginPage loginPage;

   
  @BeforeMethod(alwaysRun=true)
  
  public void setUp() throws Exception, IOException {
	 loadConfig();
	 launchapp();
	 loginPage = new LoginPage();
  }
  
  @DataProvider(name = "testData")	
  public Object[][] getData()
  {
  Object[][] data = new Object[1][2];
	  
  data[0][0]="seleniumTest123@gmail.com";
  data[0][1]="test123123";
	  
  return data;    

  }
 
  @Test(dataProvider = "testData")	
  public void loginTest(String username, String password){
	  System.out.println(username+ "-"+password );
	  
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