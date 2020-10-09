package com.aut.pageobjects;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aut.base.baseClass;



@Test
public class loginPage extends baseClass  {
	
	
	@FindBy(id="inputEmail") WebElement usrName;
	
	@FindBy(how=How.ID ,using="inputPassword")
    WebElement pwd;

	@FindBy(how=How.ID ,using="login")
    WebElement submit;
	
	
	public loginPage() {
		PageFactory.initElements(driver, null);
	}
	

    @Test

	public void login(String username, String password) {
		
    	usrName.sendKeys(username);
    	pwd.sendKeys(password);
    	submit.click();
		
	}	

	
	
	
	
	
	
	
}
