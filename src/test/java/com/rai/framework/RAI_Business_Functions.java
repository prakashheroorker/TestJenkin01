package com.rai.framework;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class RAI_Business_Functions extends BaseClass {

	static boolean isSafari = false;


	// ********************************************************************************************************************************************
	public void Vuse_CF_inputText(By by, String elementname, String data) throws Exception {
		try {
			rdriver.findElement(by).clear();
			Thread.sleep(2000);
			rdriver.findElement(by).sendKeys(data);

		} catch (Exception e) {
			// TODO: handle exception
			reportiumClient.reportiumAssert("Failed To Locate " + elementname + " Text field.", false);
			e.printStackTrace();
		}
	}



	// ********************************************************************************************************************************************
	public void Vuse_CF_selectByValue(By by, String elementname, String data) throws Exception {
		try {
			WebDriverWait wait = new WebDriverWait(rdriver, 45);
			wait.until(ExpectedConditions.visibilityOfElementLocated(by));
			// wait.until(ExpectedConditions.elementToBeSelected(by));
			WebElement e1 = rdriver.findElement(by);
			if (e1.isDisplayed()) {

				Select se = new Select(e1);
				se.selectByVisibleText(data.trim());

			}
		} catch (Exception e) {
			// TODO: handle exception
			reportiumClient.reportiumAssert("Failed to select " + elementname + " from the dropdown.", false);
			e.printStackTrace();
		}
	}


	// ********************************************************************************************************************************************
	public boolean isDisabled_Grizzly(By by, String elementname) throws IOException {
		// Click Button
		try {
			@SuppressWarnings("unused")
			JavascriptExecutor js = (JavascriptExecutor) rdriver;
			WebElement e1 = rdriver.findElement(by);

			if (e1.isSelected()) {
				// enable- fail
				reportiumClient.reportiumAssert(elementname + " Element Is Visible", true);

			} else {
				// disable - pass
				reportiumClient.reportiumAssert(elementname + " Element Is Not Visible", false);
			}
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			reportiumClient.reportiumAssert(elementname + " Element Is Not Visible", false);
			e.printStackTrace();
			return false;
		}
	}

	// ********************************************************************************************************************************************
	public void CF_clickUsingJs(By by, String elementname) throws Exception {
		try {
			reportiumClient.testStep("Clicking " + elementname + " button");
			WebElement e1 = rdriver.findElement(by);

			if (e1.isDisplayed()) {
				if (!isSafari) {

					JavascriptExecutor executor = (JavascriptExecutor) rdriver;
					executor.executeScript("arguments[0].click();", e1);
				} else {
					e1.click();
				}

			}
		} catch (Exception e) {
			// TODO: handle exception
			reportiumClient.reportiumAssert("Failed To Click On " + elementname + " Element.", false);

			e.printStackTrace();
		}
	}

	// ********************************************************************************************************************************************

	public void Vuse_CF_clickUsingJs(By by, String elementname) throws Exception {
		try {
			reportiumClient.testStep("Clicking " + elementname + " button");
			WebElement e1 = rdriver.findElement(by);
			JavascriptExecutor executor = (JavascriptExecutor) rdriver;
			executor.executeScript("arguments[0].click();", e1);

		} catch (Exception e) {
			// TODO: handle exception
			reportiumClient.reportiumAssert("Failed To Click On " + elementname + " Element.", false);
			e.printStackTrace();
		}
	}

	// ********************************************************************************************************************************************

	public boolean isEnabled_Grizzly(By by, String elementname) throws IOException {
		// Click Button
		try {
			@SuppressWarnings("unused")
			JavascriptExecutor js = (JavascriptExecutor) rdriver;
			WebDriverWait wait = new WebDriverWait(rdriver, 20);
			wait.until(ExpectedConditions.visibilityOfElementLocated(by));
			WebElement e1 = rdriver.findElement(by);
			if (e1.isDisplayed()) {
				if (e1.isSelected()) {
					reportiumClient.reportiumAssert(elementname + " Element Is Visible", true);
					CF_clickUsingJs(by, elementname);
					Thread.sleep(3000);
				}

			}
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			reportiumClient.reportiumAssert(elementname + " Element Is not  Visible", false);
			e.printStackTrace();
			return false;
		}
	}

	// ********************************************************************************************************************************************
	public void isSelected_Grizzly(By by, String elementname) throws IOException {
		// Click Button
		try {
			@SuppressWarnings("unused")
			JavascriptExecutor js = (JavascriptExecutor) rdriver;

			WebElement e1 = rdriver.findElement(by);
			if (e1.isSelected()) {

				reportiumClient.reportiumAssert("Clicked on " + elementname + " Button Successfully.", true);
				rdriver.executeScript("mobile:screen:image");
				Thread.sleep(3000);
			}

		} catch (Exception e) {
			// TODO: handle exception
			reportiumClient.reportiumAssert("Failed to Click on" + elementname, false);
			e.printStackTrace();

		}
	}


	// ********************************************************************************************************************************************
	public boolean Vuse_CF_VerifyObjectDisplayed(By by) throws Exception {

		try {
			WebElement e1 = rdriver.findElement(by);

			if (e1.isDisplayed()) {
				System.out.println("Object Is Displayed");
			}
			return e1.isDisplayed();
		} catch (Exception e) {
			reportiumClient.reportiumAssert("Failed To Locate The Object", false);
			return false;
		}
	}


	// ********************************************************************************************************************************************
	public boolean Vuse_CF_VerifyObjectDisplayed(By by, String Element) throws Exception {

		try {

			WebElement e1 = rdriver.findElement(by);

			if (e1.isDisplayed()) {
				System.out.println(Element + "is visible");
			}
			return e1.isDisplayed();
		} catch (Exception e) {
			System.out.println("Proceeding to Else block");
			return false;
		}
	}
	public boolean fnVerifyObjectDisplayedNegativeValidation(By by) throws Exception {


		WebElement e1 = rdriver.findElement(by);

		if (e1.isDisplayed()) {
			rdriver.executeScript("mobile:screen:image");
		}
		return e1.isDisplayed();
	}

	// ********************************************************************************************************************************************
	public void HardRestrictionValidationminicart(String RestrictionType, String data2, By... by) throws Exception {
		try {
			/* WebDriverWait wait = new WebDriverWait(rdriver, 60); */
			//JavascriptExecutor executor = (JavascriptExecutor) rdriver;
			if (RestrictionType.equalsIgnoreCase("Hard")) {

				// Not available for shipment
				fnContentValidation(data2, by[0]);

			}
		} catch (Exception e) {
			System.err.println("Usage: ... [Error textString]..[Error textString]..]");
			reportiumClient.reportiumAssert("Error : On  Verification Failed", false);
		}

	}

	// ********************************************************************************************************************************************
	public void fnContentValidation(String data, By by) throws Exception {
		try {
			WebElement e1 = rdriver.findElement(by);
			if (e1.isDisplayed()) {
				String actualString = e1.getText().trim().replace("\n", "").replace(" ", "");
				data = data.trim().replace("\n", "").replace(" ", "");
				boolean ActualString = actualString.equalsIgnoreCase(data);
				System.out.println(">>>>>>>" + actualString + ">>>>>>");

				if (ActualString) {
					reportiumClient.reportiumAssert("'" + data + "'" + " Content validated successfully", true);
					rdriver.executeScript("mobile:screen:image");
				} else {
					reportiumClient.reportiumAssert("'" + data + "'" + " Content validation failed", false);
				}
			}

		}

		catch (Exception e) {
			// TODO: handle exception
			reportiumClient.reportiumAssert("'" + data + "'" + " Content validation failed", false);
			e.printStackTrace();
		}
	}

	// ********************************************************************************************************************************************

	public void fnContentValidation(String data, By by, String value) throws Exception {
		try {
			WebElement e1 = rdriver.findElement(by);
			if (e1.isDisplayed()) {
				String actualString = e1.getText().trim();
				data = data.trim();

				System.out.println(">>>>>>>" + actualString + ">>>>>>");

				if (actualString.equalsIgnoreCase(data)) {
					reportiumClient.reportiumAssert("'" + value + "'" + " displayed successfully", true);
				} else {
					reportiumClient.reportiumAssert("'" + value + "'" + "  validation failed", false);

				}

			}
		}

		catch (Exception e) {
			// TODO: handle exception
			reportiumClient.reportiumAssert("'" + value + "'" + " Is Not Present In Element", false);
			e.printStackTrace();
		}
	}

	// ********************************************************************************************************************************************
	public void Vuse_CF_inputTextSendkeys(By by, String elementname, String data) throws Exception {
		try {
			WebElement e1 = rdriver.findElement(by);
			// rdriver.findElement(by).clear();
			Thread.sleep(2000);
			// Action Class
			rdriver.findElement(by).sendKeys(data);

		} catch (Exception e) {
			// TODO: handle exception
			reportiumClient.reportiumAssert("Failed To Locate " + elementname + " Text field.", false);
			e.printStackTrace();
		}
	}

	// ********************************************************************************************************************************************
	//Soft restriction
	public void SoftRestrictionValidation(String State,String RestrictionType, By ...by) throws Exception
	{
		try
		{
			//WebDriverWait wait = new WebDriverWait(rdriver, 60);
			JavascriptExecutor executor = (JavascriptExecutor)rdriver;
			if(RestrictionType.equalsIgnoreCase("Soft"))
			{
				WebElement e1 = rdriver.findElement(by[0]);
				//signed for by an adult
				WebElement e2 = rdriver.findElement(by[1]);

				//Terms Of Sale
				executor.executeScript("arguments[0].click();", e1);
				executor.executeScript("arguments[0].click();", e2);

				reportiumClient.reportiumAssert("Terms Of Use And Signed By Adults Check Box Have Been Selected", true);


				//For TX users
				if(State.equalsIgnoreCase("TX"))
				{

					WebElement e3 = rdriver.findElement(by[2]);
					WebElement e4 = rdriver.findElement(by[3]);
					WebElement e5 = rdriver.findElement(by[4]);
					//wait.until(ExpectedConditions.visibilityOfElementLocated(by[4]));


					executor.executeScript("arguments[0].click();", e3);
					executor.executeScript("arguments[0].click();", e4);
					executor.executeScript("arguments[0].click();", e5);
					reportiumClient.reportiumAssert("E Warning Check Box Is Selected", true);


				}
				else if(State.equalsIgnoreCase("CA"))
				{
					WebElement e6 = rdriver.findElement(by[5]);
					WebElement e7 = rdriver.findElement(by[6]);
					//WebElement e8 = rdriver.findElement(by[7]);
					//wait.until(ExpectedConditions.visibilityOfElementLocated(by[2]));
					executor.executeScript("arguments[0].click();", e6);
					//executor.executeScript("arguments[0].click();", e8);
					executor.executeScript("arguments[0].click();", e7);
					reportiumClient.reportiumAssert("Phone Call Warning , Shipping and Billing and Product Explore Check Boxes are Selected", true);


				}
				else if(State.equalsIgnoreCase("FL"))
				{
					WebElement e9 = rdriver.findElement(by[8]);
					executor.executeScript("arguments[0].click();", e9);
					reportiumClient.reportiumAssert("Tobacco Product Warning Check Box Is Selected", true);

				}
				else if(State.equalsIgnoreCase("MN"))
				{
					WebElement e10 = rdriver.findElement(by[9]);
					//wait.until(ExpectedConditions.visibilityOfElementLocated(by[3]));
					executor.executeScript("arguments[0].click();", e10);
					reportiumClient.reportiumAssert("I understand that I am solely... Warning Check Box Is Selected", true);

				}


				else if(State.equalsIgnoreCase("WA"))
				{
					WebElement e11 = rdriver.findElement(by[10]);
					executor.executeScript("arguments[0].click();", e11);
					reportiumClient.reportiumAssert("I understand that Washington state... Check Box Is Selected", true);

				}
			}      
		}
		catch(Exception e)
		{
			System.err.println("Usage: ... [Terms] [Adult] ...[Optional : If Sates(CA,FL,TX)[Phone Call Warning text]]");
			reportiumClient.reportiumAssert("Failed To Perform Requested Actions In Checkout Page", false);
		}
	}


	// ********************************************************************************************************************************************
	public void ExciseTaxCalculationUpdate(String SalesTax, String ExciseTax,String ExciseExpected,
			String SubTotalExpected, String OrderTotalExpected,String SalesTaxExpected,String ShippingExpected,
			String FreeShippingExpected,String FlavorType,String OrderDiscount,By PriceTablePath,By ...by) throws Exception
	{

		By PriceTable =PriceTablePath;
		try
		{
			WebDriverWait wait = new WebDriverWait(rdriver, 30);
			wait.until(ExpectedConditions.visibilityOfElementLocated(PriceTable));
			if((ExciseTax.equalsIgnoreCase("Yes"))&&(SalesTax.equalsIgnoreCase("Yes")))
			{

				if(rdriver.findElement(PriceTable).isDisplayed())
				{

					//Verify Excise tax value
					fnContentValidation(ExciseExpected,by[0],"ExciseTax Value" +ExciseExpected);

					//Verify Subtotal value
					fnContentValidation(SubTotalExpected,by[2],"SubTotal Value" +SubTotalExpected);
					//Sales tax Value
					fnContentValidation(SalesTaxExpected,by[1],"SalesTax Value" +SalesTaxExpected);
					//Ordertotal value
					fnContentValidation(OrderTotalExpected,by[3],"OrderTotal Value" +OrderTotalExpected);

					//Shipping and Free Shipping value
					fnContentValidation(ShippingExpected,by[4],"Shipping Value" +ShippingExpected);
					if(FlavorType.equalsIgnoreCase("AutoShip"))
					{
						fnContentValidation(FreeShippingExpected,by[5],"FreeShipping Value" +FreeShippingExpected);

						fnContentValidation(OrderDiscount,by[6],"AutoShip Discount Value" +OrderDiscount);
					}
					if(FlavorType.equalsIgnoreCase("VeloSubscription"))
					{
						fnContentValidation(OrderDiscount,by[5],"AutoShip Discount Value" +OrderDiscount);
					}
				}
			}

			else if ((ExciseTax.equalsIgnoreCase("No"))&&(SalesTax.equalsIgnoreCase("Yes"))){
				if(rdriver.findElement(PriceTable).isDisplayed())
				{
					//Verify Subtotal value
					fnContentValidation(SubTotalExpected,by[2],"subtotal Value" +SubTotalExpected);
					//Sales tax Value
					fnContentValidation(SalesTaxExpected,by[1],"SalesTax Value" +SalesTaxExpected);
					//Ordertotal value
					fnContentValidation(OrderTotalExpected,by[3],"OrderTotal Value" +OrderTotalExpected);

					//Shipping and Free Shipping value
					fnContentValidation(ShippingExpected,by[4],"Shipping Value" +ShippingExpected);
					if(FlavorType.equalsIgnoreCase("AutoShip"))
					{
						fnContentValidation(FreeShippingExpected,by[5],"FreeShipping Value" +FreeShippingExpected);
						fnContentValidation(OrderDiscount,by[6],"AutoShip Discount Value" +OrderDiscount);
					}
					if(FlavorType.equalsIgnoreCase("VeloSubscription"))
					{
						fnContentValidation(OrderDiscount,by[5],"AutoShip Discount Value" +OrderDiscount);
					}
				}
			}
			else if ((ExciseTax.equalsIgnoreCase("Yes"))&&(SalesTax.equalsIgnoreCase("No"))){
				if(rdriver.findElement(PriceTable).isDisplayed()){

					//Verify Excise tax value
					fnContentValidation(ExciseExpected,by[0],"ExciseTax Value" +ExciseExpected);

					//Verify Subtotal value
					fnContentValidation(SubTotalExpected,by[2],"SubTotal Value" +SubTotalExpected);

					//Ordertotal value
					fnContentValidation(OrderTotalExpected,by[3],"OrderTotal Value" +OrderTotalExpected);

					//Shipping and Free Shipping value
					fnContentValidation(ShippingExpected,by[4],"Shipping Value" +ShippingExpected);
					if(FlavorType.equalsIgnoreCase("Autoship"))
					{
						fnContentValidation(FreeShippingExpected,by[5],"FreeShipping Value" +FreeShippingExpected);
						fnContentValidation(OrderDiscount,by[6],"AutoShip Discount Value" +OrderDiscount);
					}
					if(FlavorType.equalsIgnoreCase("VeloSubscription"))
					{
						fnContentValidation(OrderDiscount,by[5],"AutoShip Discount Value" +OrderDiscount);
					}
				}
			}      

		}
		catch (Exception e)
		{
			reportiumClient.reportiumAssert("All Total Values Are not Matched", false);
			e.printStackTrace();      
		}
	}

	// ********************************************************************************************************************************************
	public boolean Grizzly_isSelected(By by, String elementname) throws IOException {
		// Click Button
		try 
		{
			@SuppressWarnings("unused")
			JavascriptExecutor js = (JavascriptExecutor) rdriver;
			WebDriverWait wait = new WebDriverWait(rdriver, 20);
			wait.until(ExpectedConditions.visibilityOfElementLocated(by));
			WebElement e1 = rdriver.findElement(by);
			if (e1.isDisplayed()) 
			{
				if (e1.isSelected()) 
				{
					reportiumClient.reportiumAssert("Element is Enabled", true);
					CF_clickUsingJs(by, elementname);
					Thread.sleep(3000);
				} 

			}
			return true;
		} 
		catch (Exception e) 
		{
			// TODO: handle exception

			e.printStackTrace();
			return false;
		}

	}
	// ********************************************************************************************************************************************
	public boolean Grizzly_fnCkeckbox(By by, String elementname) throws IOException {
		// Click Button
		try 
		{
			@SuppressWarnings("unused")
			JavascriptExecutor js = (JavascriptExecutor) rdriver;
			WebDriverWait wait = new WebDriverWait(rdriver, 20);
			wait.until(ExpectedConditions.visibilityOfElementLocated(by));
			WebElement e1 = rdriver.findElement(by);
			if (e1.isDisplayed()) 
			{
				if (e1.isSelected()) 
				{
					reportiumClient.reportiumAssert("Element is Enabled", true);
					CF_clickUsingJs(by, elementname);
					Thread.sleep(3000);
				} 
				CF_clickUsingJs(by, elementname);
			}
			return true;
		} 
		catch (Exception e) 
		{
			// TODO: handle exception

			e.printStackTrace();
			return false;
		}

	}
	// ********************************************************************************************************************************************
	public void fnAmericanSpiritSGW(By by, String pageName, String data) {

		WebDriverWait wait = new WebDriverWait(rdriver, 120);
		wait.until(ExpectedConditions.visibilityOfElementLocated(by));
		WebElement e1 = rdriver.findElement(by);
		String extractedMessage = e1.getAttribute("alt");

		if (extractedMessage.equalsIgnoreCase(data)) {
			reportiumClient.reportiumAssert("SGW content" + data + " is verified on" + pageName, true);
		} else {
			reportiumClient.reportiumAssert("SGW content is not verified on" + pageName, false);
		}
	}
	// ********************************************************************************************************************************************
	public void fn_Velo_SelectByOption(By by,String data) throws Exception 
	{
		try
		{
			//WebDriverWait wait = new WebDriverWait(driver, 30);
			WebElement e1 = rdriver.findElement(by);
			//     wait.until(ExpectedConditions.visibilityOfElementLocated(by));
			if(e1.isDisplayed())
			{
				if (!isSafari){
					e1.click();
					e1.sendKeys(data);
					Thread.sleep(2000);
					e1.sendKeys(Keys.ENTER);
				}else{
					fn_Velo_jsSelect(by, data);
				}

			}
		}
		catch (Exception e)
		{

			e.printStackTrace();
		}
	}

	// ********************************************************************************************************************************************
	public void fn_Velo_jsSelect(By by, String data) throws Exception {

		try{

			WebElement e1 = rdriver.findElement(by);
			JavascriptExecutor executor = (JavascriptExecutor) rdriver;
			executor.executeScript("const textToFind = '" + data + "';" +
					"const dd = arguments[0];" +
					"dd.selectedIndex = [...dd.options].findIndex (option => option.text === textToFind);", e1);

		}

		catch (Exception e) 
		{
			// TODO: handle exception
			reportiumClient.reportiumAssert("Select " + data + " From dropdown", false);
			e.printStackTrace();
		}

	}

	// ********************************************************************************************************************************************

	/*public void getAttributeValueGrizzly(By by) throws Exception 
	{
		String value= rdriver.findElement(by).getAttribute("class");
		if(value.contains("active"))
		{
			CF_clickUsingJs(MyGrizzly_Grizzlist.weFistbump, "Thumb Nail");
		}
		else
		{
			reportiumClient.reportiumAssert("Thumb button is enabled", true);
		}

	}*/


	// ********************************************************************************************************************************************
	public void logResult(boolean result, String statement) throws Exception
	{try{
		if(result == true)
		{
			reportiumClient.reportiumAssert("statement", true);

		}
		else
		{
			reportiumClient.reportiumAssert("statement", false);
		}
	}
	catch(Exception e){

		reportiumClient.reportiumAssert("statement", false);

		e.printStackTrace();
	}
	}

	// ********************************************************************************************************************************************
	public void fnButtonDisable(By by,String elementname)
	{
		WebElement e1 = rdriver.findElement(by);
		String disable=e1.getAttribute("disabled");
		if(disable.equalsIgnoreCase("true"))
		{
			reportiumClient.reportiumAssert("Button"+ elementname +"Disabled", true);
		}
		else
		{
			reportiumClient.reportiumAssert("Button"+ elementname +" not Disabled", false);
		}


	}

	// ********************************************************************************************************************************************

	// ********************************************************************************************************************************************
	// ********************************************************************************************************************************************
	// ********************************************************************************************************************************************
	// ********************************************************************************************************************************************
	// ********************************************************************************************************************************************
	// ********************************************************************************************************************************************
	// ********************************************************************************************************************************************
	// ********************************************************************************************************************************************

}