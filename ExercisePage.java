package com.Exercise.Pages;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

// This class will store all the locators and the methods of login page
public class ExercisePage extends BaseClass
{
	//WebDriver driver;
	//private String id;
	private WebDriver driver;
	
	
	//Constructor
	public ExercisePage(WebDriver driver)
	{
		this.driver = driver;
	} 
	
	private Double convertToNumber(String dollarAmt) {
		   String amount = dollarAmt.replace("$","");
		   amount= amount.replaceAll(",", "");
		  return    Double.parseDouble(amount);
		   
	   }
	
	private String convertNumberToDollar(Double number) {
		   NumberFormat format = NumberFormat.getCurrencyInstance(Locale.US);
	       return format.format(number);
		   
	   }
    private String findElement(String element) {
		   
		   return driver.findElement(By.id(element)).getText();
	   }
	
	public boolean verifyCountOfValues(String id)
	{
		if (findElement(id) != null)
		{
			return true;
	    }
		else
		{
			return false;
	    }		
	}
	
	public Double verifyValueIsPositive(String id)
	{
	    //String id = driver.findElement(value).getText();
		Double number = convertToNumber(findElement(id));
	    return number;

	}
	public boolean verifyTotalBalance() { 
		   
		   String firstNumber = findElement("txt_val_1");
		   String secondNumber = findElement("txt_val_2");
		   String thirdNumber = findElement("txt_val_3");
		   String fourthNumber = findElement("txt_val_4");
		   String fifthNumber = findElement("txt_val_5");
		   Double totalBalance = convertToNumber (findElement("txt_ttl_val"));
		double sum  =   convertToNumber(firstNumber) +  
				convertToNumber(secondNumber)+convertToNumber(thirdNumber)+
				convertToNumber(fourthNumber)+convertToNumber(fifthNumber);
		
		  if (sum != totalBalance)
			  return false;
		  else
			  return true;
	    }
	public boolean verifyValuesFormattedAsCurrencies(String id) { 

		   String firstNumberText = findElement(id);   
		   Double firstNumber = convertToNumber(findElement(id));
		   return (firstNumberText.equals(convertNumberToDollar(firstNumber)));
		   
		   
	}
	
}
