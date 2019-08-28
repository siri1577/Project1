package com.Exercise.Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.Locale;
import static junit.framework.TestCase.assertTrue;
import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertEquals;


import com.Exercise.Pages.ExercisePage;

public class exerciseObjectivesStepDef {
	String label1 = "lbl_val_1";
	String label2 = "lbl_val_2";
	String label3 = "lbl_val_3";
	String label4 = "lbl_val_4";
	String label5 = "lbl_val_5";
	String txtvalue1 = "txt_val_1";
	String txtvalue2 = "txt_val_2";
	String txtvalue3 = "txt_val_3";
	String txtvalue4 = "txt_val_4";
	String txtvalue5 = "txt_val_5";

	WebDriver driver;
	
	ExercisePage exerPage = new ExercisePage(driver);
	
	@Given("^Get Chrome Browser$")
	public void Get_Chrome_Browser_and_get_URL() throws Throwable {
		exerPage.setUp();
	}
	
	@When("^Navigate to Url$")
	public void Navigate_to_Url() {
		exerPage.getUrl();
	}
	

	@Then("^Verify right count of values appeared on the screen$")
	public void verifyExerciseObjective1()
	{		

		assertTrue(exerPage.verifyCountOfValues(label1));
		assertTrue(exerPage.verifyCountOfValues(label2));
		assertTrue(exerPage.verifyCountOfValues(label3));
		assertTrue(exerPage.verifyCountOfValues(label4));
		assertTrue(exerPage.verifyCountOfValues(label5));		
		
	}
	
	
	@Then("^Verify values on the screen are greater than 0$")
	public void verifyExerciseObjective2()
	{
		assertFalse(exerPage.verifyValueIsPositive(txtvalue1) < 0);
		assertFalse(exerPage.verifyValueIsPositive(txtvalue2) < 0);
		assertFalse(exerPage.verifyValueIsPositive(txtvalue3) < 0);
		assertFalse(exerPage.verifyValueIsPositive(txtvalue4) < 0);
		assertFalse(exerPage.verifyValueIsPositive(txtvalue5) < 0);
		
	}
	


	@Then("^Verify total balance matches sum of values$")
	public void verifyExerciseObjective3()
	{   
		assertTrue(exerPage.verifyTotalBalance());
	}
	
	
	
	@Then("^Verify values are formatted as currencies$")
	public void verifyExerciseObjective4()
	{   
		assertTrue(exerPage.verifyValuesFormattedAsCurrencies(txtvalue1));
		assertTrue(exerPage.verifyValuesFormattedAsCurrencies(txtvalue2));
		assertTrue(exerPage.verifyValuesFormattedAsCurrencies(txtvalue3));
		assertTrue(exerPage.verifyValuesFormattedAsCurrencies(txtvalue4));
		assertTrue(exerPage.verifyValuesFormattedAsCurrencies(txtvalue5));
	}

}
