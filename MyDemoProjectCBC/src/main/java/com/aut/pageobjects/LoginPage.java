package com.aut.pageobjects;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


import com.aut.base.baseClass;


public class LoginPage extends baseClass  {
	
	@CacheLookup
	@FindBy(how=How.XPATH ,using="//*[@id=\"inputEmail\"]")
	WebElement usrName;
	
	@CacheLookup
	@FindBy(how=How.XPATH ,using="//*[@id=\"inputPassword\"]")
    WebElement pwd;
	
	@CacheLookup
	@FindBy(how=How.XPATH ,using="//*[@id=\"recaptcha-anchor\"]/div[1]")
    WebElement robot;

	@CacheLookup
	@FindBy(how=How.XPATH ,using="//*[@id=\"login\"]")
    WebElement submit;


   public void userName(String username) {

    usrName.sendKeys(username);	
   
   }
   
   public void passWord(String password) {
	   		
   	pwd.sendKeys(password);
		
	}
   
   public void checkRobot() {
 		
   submit.click();
			
	}
   
   public void login() {
  		
   submit.click();
			
	}
 
	
	
}
