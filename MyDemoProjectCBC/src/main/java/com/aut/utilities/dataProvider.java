package com.aut.utilities;

import org.testng.annotations.DataProvider;

public class dataProvider {
  
  @DataProvider(name = "testData")	
  public Object[][] getData()
  {
  Object[][] data = new Object[1][2];
	  
  data[0][0]="seleniumTest123@gmail.com";
  data[0][1]="test123123";
	  
  return data;    

  }

}
