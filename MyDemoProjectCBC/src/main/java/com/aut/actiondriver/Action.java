package com.aut.actiondriver;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.aut.base.baseClass;

public class Action extends baseClass{
	
public static void scrollByVisibilityOfElement(WebDriver driver, WebElement ele) {
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView();", ele);
}

public static void click(WebDriver ldriver, WebElement locatorName) {
	Actions act = new Actions(ldriver);
	act.moveToElement(locatorName).click().build().perform();
}


}
