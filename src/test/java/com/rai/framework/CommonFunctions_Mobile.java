package com.rai.framework;


import java.util.HashMap;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import goVype_Properties_mobile.*;


public class CommonFunctions_Mobile extends BaseClass {

	public 	RAI_Mobile_Utility_Functions rai;

	public CommonFunctions_Mobile(	RAI_Mobile_Utility_Functions obj) {
		this.rai = obj;
	}

	// *******************************************************************************************************
	// Verify Age Certify andd Click on Button 19

	public void launchApplication(String url) throws Exception {

		//rai.fnClearCache();

		if(Constants.PM_DEVICEType.equalsIgnoreCase("Android"))
		{
			rai.launchurl(url);
		}
		if(Constants.PM_DEVICEType.equalsIgnoreCase("IOS"))
		{
			rai.launchurl(url);
			rai.switchToContext(adriver, "NATIVE_APP");
			rdriver.findElement(By.xpath("//XCUIElementTypeTextField[contains(@value,'User Name')]")).sendKeys("vuse");
			rdriver.findElement(By.xpath("//XCUIElementTypeSecureTextField[@value='Password']")).sendKeys("VsU6Zc0m0x4d05LG");
			rdriver.findElement(By.id("Log In")).click();
			
			rai.switchToContext(adriver, "WEBVIEW");
		}
		
		
		//rai.ClickUsingOCR("Accept All Cookies");
		rai.clickbutton(Vype_CommonXpath.AcceptAllCookies, "Cookies");
		
		rai.VerifyElementVisible(Vype_CommonXpath.weAgeCertify, "Age Certify");

		Thread.sleep(3000);

		// Select "Ontario" from the drop down
		String province = "Ontario";
		rai.selectByValue(goVype_Properties_mobile.Vype_CommonXpath.weDropDownProvince, "Province", province);

		// Click on "I am 19 or over" button
		rai.clickUsingJs(goVype_Properties_mobile.Vype_CommonXpath.btnIam19, " Iam 19 or Over");

		// Verify Menu is displayed
		rai.VerifyElementsVisible(Vype_CommonXpath.btnmenu, "Menu");

	}

	public void Username(String UN) {
		// TODO Auto-generated method stub
		try {

			// Write code here that turns the phrase above into concrete actions
			rai.inputTextjavaScriptSendkeys(rdriver,Vype_Common.txtUsername, UN);

			//Click Login Button
			rai.clickbutton(Vype_Common.btnLogin, "Login Button Should Be Clicked");

			//Verify that the error message "Password is required"  is displayed below the password field
			String errorPwd = rai.getText(Vype_PlatinumProfileTrigger.weErrorMsgPasswordField);
			if(errorPwd.equalsIgnoreCase("Password is required")){
				rai.VerifyElementsVisible(Vype_PlatinumProfileTrigger.weErrorMsgPasswordField,"Password Is Required Error Message");
			}} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

	public void passworderror(String password) {
        // TODO Auto-generated method stub
        try {
        
         //  rai.inputTextjavaScripfnPasswordencryption(rdriver,Vype_Common.txtPassword, password);
           rai.inputTextjavaScripfnPasswordencryption(rdriver,Vype_CommonXpath.txtPassword,password);
           rai.ClearTextField((Vype_CommonXpath.txtUsername));
            
            //Click Login Button
            rai.clickbutton(Vype_Common.btnLogin, "Login Button Should Be Clicked");
            
            //Verify that the error message "Password is required"  is displayed below the password field
            String errorPwd = rai.getText(Vype_PlatinumProfileTrigger.weErrorMsgEmailFeild);
            
            if(errorPwd.equalsIgnoreCase("Email address is required")){
                rai.VerifyElementsVisible(Vype_PlatinumProfileTrigger.weErrorMsgEmailFeild,"Email Is Required Error Message");
        }
        }



       
    
        catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }    
        }

	// ******************************************************************************************************

	// Login application using valid credentials

	public void loginApplication(String UN, String pwd) {

		try {


			// Enter User name in the user name text field
			//rai.inputText(Vype_CommonXpath.txtUsername, "Username", UN);
			rai.inputTextjavaScriptSendkeys(adriver,Vype_CommonXpath.txtUsername,UN);
			/*Map<String, Object> params = new HashMap<>();
			params.put("label", "john.doe@mail.com");
			// params.put("text", "alva.white36@bat.com");
			params.put("text", UN);
			params.put("operation", "sinraie");
			rdriver.executeScript("mobile:edit-text:set", params);*/

			// Enter Password in the password text field
			//rai.fnPasswordEncryption(pwd, Vype_CommonXpath.txtPassword);

			/*Map<String, Object> params1 = new HashMap<>();
			params1.put("label", "Password");
			// params1.put("text", "TEST1234");
			params1.put("text", pwd);
			params1.put("label.direction", "above");
			params1.put("label.offset", "3%");
			rdriver.executeScript("mobile:edit-text:set", params1);*/

			rai.inputTextjavaScripfnPasswordencryption(adriver,Vype_CommonXpath.txtPassword,pwd);  
			// Click on Login button
			rai.clickUsingJs(Vype_CommonXpath.btnLogin, "Login button");
			//rai.ClickUsingOCR("Never");

		} catch (Exception e) {

			rai.fnCatchBlock(e);
		}

	}

	// **********************************************************************************************************************

	// Navigate to ePod Devices

	public void navigateToePodDevice() throws Exception {
		try {

			// Clicking on Menu and Verify My Account link

			rai.clickbutton(Vype_CommonXpath.btnmenu, "Menu");

			Thread.sleep(1000);

			rai.VerifyTextUsingOCR("My Account", "Menu");

			// Click on Shop link
			rai.clickLink(Vype_CommonXpath.lnkShop, "Shop");

			// Click on ePod link
			rai.clickLink(Vype_CommonXpath.lnkePod2, "Shop link from the main menu navigation");

			// Click on device link under the ePod section
			rai.clickbutton(Vype_CommonXpath.lnkDevices, "Starter Kit from the Epod section");

			// Verify that ePod starter kit page is displayed.
			//rai.VerifyElementsVisible(Vype_CommonXpath.wetxtVuseePod, "VUSE ePod");

		} catch (Exception e) {
			rai.fnCatchBlock(e);
		}
	}

	// ********************************************************************************************************

	// Navigate to ePod pods

	public void navigateToePodPods() throws Exception {
		try {

			// Clicking on Menu and navigate to ePodpods

			rai.clickbutton(Vype_CommonXpath.btnmenu, "Menu");

			// Click on Shop link
			rai.clickLink(Vype_CommonXpath.lnkShop, "Shop");

			// Click on ePod link
			rai.clickLink(Vype_CommonXpath.lnkePod2, " ePod2 link");

			// Click ePod link
			rai.clickLink(Vype_CommonXpath.LnkePod, "ePod link");

			// Verify that ePod's pods page is displayed.
			rai.VerifyElementsVisible(Vype_CommonXpath.pgEpodPods, "ePod Pods");

		} catch (Exception e) {
			rai.fnCatchBlock(e);
		}



	}

	//Adding flavor
	public void Addflavor(String flavor,String count) throws Exception 
	{

		int flavorcount = Integer.parseInt(count);


		/*boolean b=rai.verifyobjectisnotavailable(Vype_CommonXpath.Addflavor(flavor));
		if(b==true)
		{*/
		rai.ScrollByxpath(Vype_CommonXpath.txtflavor(flavor));
		rai.clickUsingJs(Vype_CommonXpath.Addflavor(flavor),flavor);
		rai.clickUsingJs(Vype_CommonXpath.btnAddToCart(flavor),  "Add to cart ");
		for(int i=0;i<flavorcount;i++)
		{
			rai.clickUsingJs(Vype_CommonXpath.Nicotinestrength(flavor),  "+");
		}

		rai.clickUsingJs(Vype_CommonXpath.btnadd$(flavor),  "Add to cart ");



		/*	if(b==false)
		{
			rai.ScrollByxpath(Vype_CommonXpath.txtflavor1(flavor));
			rai.clickUsingJs(Vype_CommonXpath.Addflavor1(flavor),flavor);

			for(int i=0;i<flavorcount;i++)
			{
				rai.clickUsingJs(Vype_CommonXpath.Nicotinestrength1(flavor),  "+");
			}

			rai.clickUsingJs(Vype_CommonXpath.btnAddToCart,  "Add to cart ");

		}
		 */


	}

	// ****************************************************************************************************

	// Verify Footer links

	public void VerifyAllFooterLinks() throws Exception {
		try {


			rai.ScrollByxpath(Vype_CommonXpath.lnkInstagram);
			// Verify Instagram text is displayed
			rai.VerifyElementsVisible(Vype_CommonXpath.lnkInstagram, "Instagram text ");

			// Verify Facebook text is displayed
			rai.VerifyElementsVisible(Vype_CommonXpath.lnkFacebook, "Facebook text ");

			// Verify Twitter text is displayed
			rai.VerifyElementsVisible(Vype_CommonXpath.lnkTwitter, "Twitter text ");

			// Verify Youtube text is displayed
			rai.VerifyElementsVisible(Vype_CommonXpath.lnkYoutube, "Youtube text ");

			// Verify Contact Us text is displayed
			rai.VerifyElementsVisible(Vype_CommonXpath.lnkContactUs, "Contact Us text ");

			// Verify FAQs text is displayed
			rai.VerifyElementsVisible(Vype_CommonXpath.lnkFaqs, "FAQs text ");

			rai.VerifyElementsVisible(Vype_CommonXpath.lnkStoreLocator, "Store Locator Text ");

			rai.VerifyElementsVisible(Vype_CommonXpath.lnkStoremap, "Store Map Text ");

			rai.SwipeDown(1);

			// Verify Condition of Sale text is displayed
			rai.VerifyElementsVisible(Vype_CommonXpath.lnkConditionofSale, "Condition of Sale text ");

			// Verify Privacy Policy text is displayed
			rai.VerifyElementsVisible(Vype_CommonXpath.lnkPrivacyPolicy, "Privacy Policy text ");

			// Verify Terms and conditions text is displayed
			rai.VerifyElementsVisible(Vype_CommonXpath.lnkTermsandConditions, "Terms and conditions text ");

			// Verify Cookie Policy text is displayed
			rai.VerifyElementsVisible(Vype_CommonXpath.lnkCookiePolicy, "Cookie Policy text ");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	public void verifySavingsInformationIcon() {
		try {
			List<WebElement> list;



			// Verify all the product details in cart page
			list = adriver.findElements(By.xpath("//*[contains(@class,'Stats__Help')]"));
			System.out.println("Total number of information icons is: " + list.size());
			for (int a = 0; a < list.size(); a++) {



				String itemName = list.get(a).getAttribute("data-tip");
				reportiumClient.reportiumAssert(itemName + "Information icon" + a + "content displayed :", true);




				// System.out.println(" Account section link is:" +itemName);



			}



			// Verify Active credits and used credits
			List<WebElement> list2;



			list2 = adriver.findElements(By.xpath("//*[contains(@class,'Credit__Container')]"));



			System.out.println("Total number of information icons is: " + list2.size());
			for (int a = 0; a < list2.size(); a++) {



				String itemName = list2.get(a).getText();



				reportiumClient.reportiumAssert(itemName + "Credits content content displayed :", true);



				// System.out.println(" Account section link is:" +itemName);



			}



		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// ***********************************************************************************************************

	// Navigate to Acessories page
	public void navigateToAccessoriesPage() throws Exception {
		try {

			rai.clickbutton(Vype_CommonXpath.btnmenu, "clicking on menu");
			rai.VerifyElementsVisible(Vype_CommonXpath.lnkShop, "Shops link from the main menu navigation");

			// Hover the mouse on Shop link
			rai.clickbutton(Vype_CommonXpath.lnkShop, "Shops link from the main menu navigation");

			// click on epod2
			// rai.clickbutton(Vype_CommonXpath.lnkepod2, "epod2 link from Shop
			// navigation");

			rai.ClickUsingOCR("ePod 2");

			// Click on Accessories Link
			rai.clickUsingJs(Vype_CommonXpath.lnkAccessories, "Accessories from epod navigation ");

			// Verify the user is redirected to Vuse ePod Charger Page
			// rai.VerifyElementsVisible(Vype_CommonXpath.txtePodAccessories,
			// "ePod Accessories ");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	// ***********************************************************************************************************************************
	// Add Quantityfor one time Purchase for ePodPods
	public void addQuantityForOneTimePurchaseforePodPods() throws Exception {
		try {
			// click on One time purchase
			// rai.clickbutton(Vype_CommonXpath.lnkOneTimePurchase, "One Time Purchase");

			// Scroll to view quality
			rai.ScrollByxpath(Vype_CommonXpath.txtPack);
			Thread.sleep(5000);

			// click on plus button Nicotine strength 1.6%
			rai.clickUsingJs(Vype_CommonXpath.btn1point6percent, "Add Button");
			Thread.sleep(5000);

			// click on Add To Cart.
			//rai.clickbutton(Vype_CommonXpath.btnAddToCart, "Add To Cart");
			Thread.sleep(5000);
			// Verify mini cart is updated
			String num1 = rai.getText(Vype_CommonXpath.txtnumber);
			rai.VerifyElementVisible(Vype_CommonXpath.txtnumber, "Cart is updated with " + num1 + "items ");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	//*************************************************************************************************************************

	// Click on Minicart
	public void navigatetoViewCart() throws Exception {
		try {

			// Click on the Cart icon
			rai.clickLink(Vype_CommonXpath.lnkCartIcon, "Cart Icon");

			Thread.sleep(5000);

			// Verify that Shipping Cart page
			//rai.VerifyElementVisible(Vype_CommonXpath.pgCart, "Shipping Cart");

			String products=rai.getText(Vype_CommonXpath.productdetails);
			System.out.println(products);

			rai.VerifyElementVisible(Vype_CommonXpath.productdetails,products);

			rai.ScrollByxpath(Vype_CommonXpath.cartsummary);
			rai.VerifyElementVisible(Vype_CommonXpath.cartsummary,"Cart summary");




		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// **************************************************************************************************************

	// checkout and submit order
	public void checkoutAndSubmiOrder(String UserCardNumber, String UserCardExpiryDate, String UserCardCVV,
			String UserCardFullName) throws Exception {
		try {

			String PhoneNum = "9987786567";
			// Click on 'Check Out' button from the Cart Page.
			rai.clickUsingJs(Vype_Cart.btnCheckOut, "Cart Page - Check Out");

			// Verify that Check Out Page is displayed
			rai.VerifyElementsVisible(Vype_CheckOut.pgCheckOut, "Check Out");

			Thread.sleep(2000);

			// Click on Home
			rai.clickUsingJs(Vype_CommonXpath.weHomeAddress, "Home");
			// String
			// totalAmtPaid=rai.getText(Vype_PlatinumProfileTrigger.cartValueTotal);

			rai.ScrollByxpath(Vype_CheckOut.txtPhonunum);

			/*if(rai.getText(Vype_CheckOut.txtPhonunum).isEmpty()){

				//rai.inputText(Vype_CheckOut.txtPhonunum, "Phone num", PhoneNum);
				Map<String, Object> params4 = new HashMap<>();
				params4.put("label", "Phone number");
				params4.put("text", PhoneNum);
				params4.put("operation", "sinraie");
				String res4= (String) rdriver.executeScript("mobile:edit-text:set", params4);
			}

			 */

			// Click on 'Go to delivery' button
			rai.clickUsingJs(Vype_CheckOut.btnGoToDelivery, "Go to delivery");



			// Click on 'Go to Billing' button
			rai.clickUsingJs(Vype_CheckOut.btnGoToBilling, "Go to billing");

			// Check if Card details are Not filled, Fill the card details
			if (rai.VerifyPageObject(Vype_CheckOut.txtCardNumber, "NO")) {

				Map<String, Object> params = new HashMap<>();
				params.put("label", "cardNumber");
				// params.put("text", "alva.white36@bat.com");
				params.put("text", UserCardNumber);
				params.put("operation", "sinraie");
				adriver.executeScript("mobile:edit-text:set", params);

				// Enter the Card Number
				// rai.inputText(Vype_CheckOut.txtCardNumber,"Enter the Card
				// Number", UserCardNumber);

				Map<String, Object> params1 = new HashMap<>();
				params1.put("label", "expiry");
				params1.put("text", UserCardExpiryDate);
				params1.put("label.direction", "above");
				params1.put("label.offset", "3%");
				adriver.executeScript("mobile:edit-text:set", params1);

				Map<String, Object> params2 = new HashMap<>();
				params2.put("label", "cvv");
				params2.put("text", UserCardCVV);
				params2.put("label.direction", "above");
				params2.put("label.offset", "3%");
				adriver.executeScript("mobile:edit-text:set", params2);

				Map<String, Object> params3 = new HashMap<>();
				params3.put("label", "fullName");
				params3.put("text", UserCardFullName);
				params3.put("label.direction", "above");
				params3.put("label.offset", "3%");
				adriver.executeScript("mobile:edit-text:set", params3);

				// Enter the Card Expire Date
				// rai.inputText(Vype_CheckOut.txtCardExpiryDate, "Enter the
				// Card Expiry Date", UserCardExpiryDate);

				// Enter the Card CVV
				// rai.inputText(Vype_CheckOut.txtCVV,"Enter the Card
				// CVV",UserCardCVV);

				// Enter the Card Name
				// rai.inputText(Vype_CheckOut.txtNameOnCard,"Enter the Card
				// Name",UserCardFullName);

				// Select the check box "Save credit card details for future
				// payments
				// rai.selectCheckbox(Vype_CheckOut.chkboxSaveCreditCardDetails,
				// "Select the checkbox 'Save credit card details for future
				// payments'");

			}

			rai.clickUsingJs(Vype_CheckOut.chkboxBillingAddressSameAsShippingAddress,
					"check box Billing address is same as Shipping Address");
			// If check box Billing address is same as Shipping Address is not
			// selected then select
			/*
			 * if(!rai.ch(Vype_CheckOut.
			 * chkboxBillingAddressSameAsShippingAddress,
			 * "check box Billing address is same as Shipping Address ")){
			 * 
			 * //In some scenarios this check box will not be visible, so if it
			 * is visible we are selecting it.
			 * if(rai.VerifyElementVisible(Vype_CheckOut.
			 * chkboxBillingAddressSameAsShippingAddress, "NO")){
			 * rai.selectCheckbox(Vype_CheckOut.
			 * chkboxBillingAddressSameAsShippingAddress,
			 * "check box Billing address is same as Shipping Address"); } }
			 */

			// Click the 'I have read the Terms & Conditions' check box
			rai.clickbutton(Vype_CheckOut.weChkoxIhaveReadTandC, "I have read the Terms and conditions checkbox");

			// Click on "Submit Order" button
			rai.clickbutton(Vype_CheckOut.btnSubmitOrder, "Submit Order");

			Thread.sleep(4000);

			rai.ClickUsingOCR("No thanks");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//****************************************************************************************************************************************
	// order confirmation page
	public void verifyOrderConfirmationPage() throws Exception {
		try {
			// String OrderValue="";
			Thread.sleep(10000);
			// Verify that Order Confirmation page is displayed
			rai.VerifyElementsVisible(Vype_CheckOut.pgOrderCofirmation, "Order Cofirmation");

			// Verify the Text 'Thank you for your order!'
			rai.VerifyElementsVisible(Vype_CheckOut.weTxtThankYouForYourOrder, "Thank you for your order!");

			// Verify the Text 'We are getting started on your order....'
			rai.VerifyElementsVisible(Vype_CheckOut.weTxtWeAreGettingStarted,
					"Text 'We are getting started on your order....'");

			// Get the Order Value from the Order Confirmation Page
			String OrderValue=rai.getText(Vype_CheckOut.weTxtOrderValue);


			System.out.println(">>>>>>order id "+OrderValue.substring(1)+">>>>>>>>>");

			//click on show order summary
			rai.clickUsingJs(Vype_CheckOut.btnshowordersummary, "show order summary ");

			//verify order summary
			String ordersummary=rai.getText(Vype_CheckOut.txtordersummary);
			rai.VerifyElementVisible(Vype_CheckOut.txtordersummary,ordersummary);
			//scroll to delivary type
			rai.ScrollByxpath(Vype_CheckOut.txtdelivarytype);
			String delivary=rai.getText(Vype_CheckOut.txtdelivarytype);

			//verify delivary type
			rai.VerifyElementVisible(Vype_CheckOut.txtdelivarytype, delivary);





		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//****************************************************************************************************************************************

	//Engrave Device
	public void engraveDevice(String patternName,String TextDirection,String FontStyle,String Text)  throws Exception{
		try{

			List<WebElement> list;

			rai.SwipeUpSmallerUnits(2);

			//Select pattern
			rai.clickUsingJs(Vype_CommonXpath.btnHoya(patternName), "Device pattern name is: "+ patternName);
			String Pattern = rai.getText(Vype_CommonXpath.btnHoya(patternName));
			System.out.println("Device pattern is: "+Pattern);

			//CLick on Add Pattern button
			rai.clickUsingJs(Vype_CommonXpath.btnAddPattern, "Add Pattern");



			//Verify the page Now customize the back displayed
			rai.VerifyElementsVisible(Vype_CommonXpath.txtCustomizeBack, "02 | Now Customize the Back");

			//Scroll till the text tile
			//rai.ScrollByxpath(Vype_CommonXpath.btnText);



			//Click on Text
			rai.clickUsingJs(Vype_CommonXpath.btnText, "Text");



			//Select direction 
			rai.clickUsingJs(Vype_CommonXpath.btnVertical(TextDirection), "Text direction selected is: "+ TextDirection);
			String Direction = rai.getText(Vype_CommonXpath.btnVertical(TextDirection));
			System.out.println("Text direction is: "+Direction);




			//Select Font style
			rai.clickUsingJs(Vype_CommonXpath.btnFontStyle(FontStyle), "Font style is: "+ FontStyle);
			String FontStyle1 = rai.getText(Vype_CommonXpath.btnFontStyle(FontStyle));
			System.out.println("Font style is: "+FontStyle1);

			//Enter Text
			//rai.inputText(Vype_CommonXpath.txtEnterText, "Enter your text field", Text);
			Map<String, Object> params1 = new HashMap<>();
			params1.put("label", "Enter your text");
			params1.put("text", Text);
			params1.put("label.direction", "above");
			params1.put("label.offset", "3%");
			String res1 = (String) rdriver.executeScript("mobile:edit-text:set", params1);


			//Click on Add Text button
			rai.clickUsingJs(Vype_CommonXpath.btnAddText, "Add Text");

			//Verify Engraving Summary page displayed
			rai.VerifyElementsVisible(Vype_CommonXpath.txtEngravingSummary, "Engraving Summary");

			//Verify the engraving summary
			list = rdriver.findElements(By.xpath("//h4[contains(text(),'Items')]//following-sibling::div//div//div//main"));
			String itemName ="";

			// List<String> item=new ArrayList<String>();
			for(int i=0;i<list.size();i++){
				itemName= list.get(i).getText();
				itemName = itemName.replaceAll("[\\n\\t ]", " ");
				System.out.println(itemName);
				if( (itemName.contains(Pattern)) || (itemName.contains(FontStyle1))  )  
				{
					rai.VerifyElementsVisible(Vype_CommonXpath.txtEngravingSummary, "The image is shown with customizations added: "+itemName);
				}



			}




			//Click on Add to cart button
			rai.clickUsingJs(Vype_CommonXpath.btnAddtoCart, "Add to cart ");




		}
		catch (Exception e){
			e.printStackTrace();
		}
	}

	//****************************************************************************************************************************************

	//Verify Items in cart page
	public void verifyItemsInCartPage() throws Exception {
		try{



			List<WebElement> list;



			//Verify all the product details in cart page
			list = rdriver.findElements(By.xpath("(//*[contains(@class,'Main__CartSection')])[1]"));
			// "(//*[contains(text(),'Product')])[2]/../../following-sibling::div"));
			System.out.println("Total number of items in cart page is: "+ list.size());
			for(int a=0;a<list.size();a++)
			{
				String itemName = list.get(a).getText();
				System.out.println("Product Details is:" +itemName);
				rai.VerifyElementsVisible(Vype_Cart.pgCart,itemName+ " is displayed in product Details page ");



			}




		}catch (Exception e){
			e.printStackTrace();
		}
	}


	//****************************************************************************************************************************************	

	//-----------------------------------------------------------------------------------------------------------
	//Author:-Divya Kumari
	//Date: 06/08/2020
	//Add cartridges for engraved device
	public void addCartridgesforEngravedDevice(String flavour, String num) throws Exception {
		try{



			rai.ScrollByxpath(Vype_CommonXpath.lnkpods);
			rai.clickbutton(Vype_CommonXpath.lnkpods, "Click on pods");

			rai.SwipeDownSmallerUnits(3);

			rai.clickLink(Vype_CommonXpath.lnkAllFlavoursePodPodsPage(flavour), "Flavour selected is: "+flavour);
			Thread.sleep(5000);

			//Verify that text "Nicotine Strength" is displayed on Modal.
			//  			rai.ScrollByxpath(Vype_CommonXpath.weTxtNicotineStrength);
			rai.VerifyElementVisible(Vype_CommonXpath.weTxtNicotineStrength,"Nicotine Strength");

			//Verify that text "Quantity" is displayed on Modal.
			rai.VerifyElementVisible(Vype_CommonXpath.weTxtQuantity,"Quantity");

			if(num.equals("3")){

				//Click on "Increment" button from the Nicotine Strength 3%
				rai.clickbutton(Vype_CommonXpath.btnIncrement3percent, "Increment button of Nicotine strength 3 Percentage");		
			}

			if(num.equals("1.6")){

				//Click on "Increment" button from the Nicotine Strength 1.6%
				rai.clickbutton(Vype_CommonXpath.btnIncrement1point6percent, "Increment button of Nicotine strength 1.6 Percentage");		
			}

			if(num.equals("5")){

				//Click on "Increment" button from the Nicotine Strength 5%
				rai.clickbutton(Vype_CommonXpath.btnIncrement5percent, "Increment button of Nicotine strength 5 Percentage");		
			}


			Thread.sleep(5000);

			rai.ScrollByxpath(Vype_CommonXpath.txtPack);


			//click on Add To Cart.

			//rai.clickbutton(Vype_CommonXpath.btnAddToCart, "Add To Cart");




		}catch (Exception e){
			e.printStackTrace();
		}
	}


	//-----------------------------------------------------------------------------------------------------------   

	//-----------------------------------------------------------------------------------------------------------
	//Author:-Divya Kumari
	//Date: 06/08/2020
	//ePod Device: select ePod skins
	public void selectePodSkins(String Skin) throws Exception {
		try{

			//Click on ePod skin add button
			/*rai.clickUsingJs(Vype_CommonXpath.btnAdd, "+Add button on ePod Skin ");
  			Thread.sleep(5000);
			 */
			rai.ScrollByxpath(Vype_CommonXpath.lnkskins);

			rai.clickbutton(Vype_CommonXpath.lnkskins, "click on skins");


			rai.clickbutton(Vype_CommonXpath.btnbuynow, "Click on buy now");

			//Select any Solstice skin colour
			rai.clickUsingJs(Vype_CommonXpath.skintype(Skin), "Skin selected is: "+Skin);


			rai.ScrollByxpath(Vype_CommonXpath.buynow);

			//Click on BuyNow button
			rai.clickbutton(Vype_CommonXpath.buynow, "click buynow");




			/*//Verify the price after adding skin
  			String str1 = rai.getText(Vype_CommonXpath.txtSkinColorPrice);
  			rai.VerifyElementVisible(Vype_CommonXpath.txtSkinColorPrice, "Total value is " + str1 +" after selecting skin colour");


  			//click on Add button
  			rai.clickbuttonUsingSelenium(Vype_CommonXpath.btnSkinColorAdd, "Add");
			 */

		}catch (Exception e){
			e.printStackTrace();
		}
	}

	//--------------------------------------------------------------------------------------------------------------------
	public void chooseFlavourInePodPodsPage(String flavour, String FlavourText) {
		try{
			String str="";
			//Click on Strawberry flavour link
			rai.clickLink(Vype_CommonXpath.lnkAllFlavoursePodPodsPage(flavour), "Flavour selected is: "+flavour);
			Thread.sleep(5000);

			//Verify strawberry page is displayed
			//rai.VerifyElementVisible(Vype_CommonXpath.txtFlavours(FlavourText), "Flavour Name is: "+ FlavourText);
			//rai.ScrollPageDown();

			//Verify that "Strawberry Smash ePen3 Cartridge" description is displayed
			str = rai.getText(Vype_CommonXpath.txtFlavoursDescription(FlavourText));
			rai.VerifyElementVisible(Vype_CommonXpath.txtFlavoursDescription(FlavourText),"Flavour description is: "+str);

		}catch (Exception e){
			e.printStackTrace();
		}

	}
	//---------------------------------------------------------------------------------------------------------------------
	public void addquantityforsucbscriptionpurchase() {
		try{

			rai.ScrollByxpath(Vype_CommonXpath.txtPack);
			Thread.sleep(3000);

			//click on plus button Nicotine strength 1.6%  3 times
			for(int i=0;i<3;i++)
			{
				rai.clickUsingJs(Vype_CommonXpath.btn1point6percent, "Add Button");
			}
			Thread.sleep(3000);


			rai.isEnabled(Vype_CommonXpath.btnSubscribeandSave, "Subscribe and Save");

			//click on subscribe and save
			rai.clickbutton(Vype_CommonXpath.btnSubscribeandSave, "Subscribe and save");

			Thread.sleep(5000);
			//Verify mini cart is updated
			String num1 = rai.getText(Vype_CommonXpath.txtnumber);
			rai.VerifyElementVisible(Vype_CommonXpath.txtnumber, "Cart is updated with "+ num1+ "items ");



		}catch (Exception e){
			e.printStackTrace();
		}

	}

	//------------------------------------------------------------------------------------------------------------
	public void navigateToMysubsription() {
		try{

			//Clicking on Menu and Verify My Account link

			rai.clickbutton(Vype_CommonXpath.btnmenu, "Menu");
			rai.VerifyTextUsingOCR("My Account","Account ");

			//Click on Shop link
			rai.clickLink(Vype_CommonXpath.btnmysubscription, "my subscription");


		}
		catch (Exception e){
			rai.fnCatchBlock(e);
		}

	}

	//------------------------------------------------------------------------------------------------------
	public void viewRewardspage()
	{

		try {
			//click on menu button
			rai.clickbutton(Vype_CommonXpath.btnmenu, "clicking on menu");

			//click on benefits
			rai.clickLink(Vype_CommonXpath.pgRewards, "Rewards Page");



		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//-------------------------------------------------------------------------------------------------------------
	public void navigateToeProgramSubscribeandsave()  throws Exception{
		try{

			rai.clickbutton(Vype_CommonXpath.btnmenu, "Click on Menu");
			//Hover the mouse on Products link
			//rai.clickLink(Vype_CommonXpath.lnkSave, "Saves link from the main menu navigation");
			rai.ClickUsingOCR("Save");
			//Verify the Submenu  Programs is loaded
			rai.VerifyPageObject(Vype_CommonXpath.lnkPrograms, "Programs ");

			//Click on Subscribe and Save link under Programs section
			rai.clickbutton(Vype_CommonXpath.lnkSubscribeandsave,"Subscribe and Save under Programs");

			//Verify Subscribe and Save page is displayed.
			rai.VerifyPageObject(Vype_CommonXpath.pgSubscribeandsave, "Subscribe and Save");
		}
		catch (Exception e){
			e.printStackTrace();
		}
	}
	//------------------------------------------------------------------------------------------------------------
	//Add Qauntity for subscribe and save
	public void addQuantityforsubscribeandSave(String flavor,String Strength)
	{
		try {
			//click on selected flavor
			rai.clickLink(Vype_CommonXpath.lnkAllFlavoursePodPodsPage(flavor), "Flavour selected is: "+flavor);
			Thread.sleep(5000);
			//scroll to text subscribe and save
			rai.ScrollByxpath(Vype_CommonXpath.pgsubscribandsave);
			//Verify text subscribe and save
			rai.VerifyElementsVisible(Vype_CommonXpath.pgsubscribandsave, "Subscribe and save");
			//click' +' button of desired nicotine strength 3 times
			for(int i=0;i<3;i++)
			{
				rai.clickUsingJs(Vype_CommonXpath.strength(Strength), Strength);

			}
			//verify the total before clicking on subscribe and save
			String total = rai.getText(Vype_CommonXpath.wetxtTotalvalue1);
			rai.VerifyElementVisible(Vype_CommonXpath.wetxtTotalvalue1, "Total value is " + total +" after adding nicotine strength");

			//Verify subscribe and Save button should enabled
			rai.isEnabled(Vype_CommonXpath.btnSubscribeandSave, "Subscribe and Save");

			//click on subscribe and save
			rai.clickbutton(Vype_CommonXpath.btnSubscribeandSave, "Subscribe and save");

			Thread.sleep(5000);

			//Verify Cart is updated
			String num = rai.getText(Vype_CommonXpath.quantity);

			//verify total after pitems add to cart
			rai.VerifyElementVisible(Vype_CommonXpath.wetxtTotalvalue1, "Total value is " + num +" after adding nicotine strength");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}
	//--------------------------------------------------------------------------------------------------------------------------------------
	//view cart
	public void navigateViewCart() throws Exception {
		try{

			//Hover on the Cart icon
			rai.clickbutton(Vype_CommonXpath.lnkCartIcon, "Cart Icon");


			//Verify that Shipping Cart page
			rai.VerifyElementVisible(Vype_CommonXpath.pgCart, "Shipping Cart");


		}catch (Exception e){
			e.printStackTrace();
		}
	}

	//-------------------------------------------------------------------------------------------------------------
	public void pagesubscription()  throws Exception{
		try{

			List<WebElement> list;
			String str="";
			Thread.sleep(5000);
			rai.VerifyPageObject(Vype_CommonXpath.txtActiveSubscription, "Active subscription");


			rai.ScrollByxpath(Vype_CommonXpath.txtDatePayment);

			//Verify the user is able to see the Active Subscriptions with date,payment,address,selection
			list = rdriver.findElements(Vype_CommonXpath.txtDatePayment);
			System.out.println("Subscription includes: "+list.size());
			for(int i=0;i<list.size();i++){
				str = list.get(i).getText();
				str = str.replaceAll("[\\n\\t]", " ");
				rai.VerifyElementVisible(Vype_CommonXpath.txtSubscription,str+ " ");
				//Verify the "Edit" link is present
				rai.VerifyElementVisible(Vype_CommonXpath.txtEditDetails, "Edit ");

			}

		}
		catch (Exception e){
			e.printStackTrace();
		}
	}

	//--------------------------------------------------------------------------------------------------------
	//Navigate to Rewards
	public void viewSubscriptionpage()
	{

		try {
			//click on menu button
			rai.clickbutton(Vype_CommonXpath.btnmenu, "clicking on menu");

			rai.clickLink(Vype_CommonXpath.pgsubscription, "Rewards Page");



		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	//---------------------------------------------------------------------------------------------------------------------

	public void Pickpods(String flavor) throws Exception
	{

		try {

			//click on flavor
			rai.clickbutton(Vype_CommonXpath.addflavor(flavor), flavor);

			//verify flavor
			rai.VerifyElementVisible(Vype_CommonXpath.Txtflavor(flavor), flavor);

			//verify flavor discription
			rai.VerifyElementVisible(Vype_CommonXpath.flavordisc(flavor), flavor+ "Discription");

			//click on nicotine strength
			rai.clickUsingJs(Vype_CommonXpath.btnstrength, "Nicotine Strength 1.6");

			//click on add button
			rai.clickUsingJs(Vype_CommonXpath.btnAdd1,"Add");



		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	//------------------------------------------------------------------------------------------------------------------
	public void navigateToMyAccountFromHome() {

		try {
			rai.clickbutton(Vype_CommonXpath.btnmenu, "Menu");

			rai.clickLink(Vype_CommonXpath.lnkAccount, "My Account ");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}





	}

	//-------------------------------------------------------------------------------------------------------------------------
	//add Quantity for one time purchase
	public void addQuantityForOneTimePurchaseforePodPods(String Strength) throws Exception {
		try{

			//click on One time purchase
			//rai.clickbutton(Vype_CommonXpath.lnkOneTimePurchase, "One Time Purchase");

			//Scroll to view quality
			rai.ScrollByxpath(Vype_CommonXpath.txtPack);
			Thread.sleep(5000);

			//click on plus button Nicotine strength 5%
			rai.clickUsingJs(Vype_CommonXpath.strength(Strength), Strength);
			Thread.sleep(5000);

			//click on Add To Cart.
			//rai.clickbutton(Vype_CommonXpath.btnAddToCart, "Add To Cart");
			Thread.sleep(5000);
			//Verify mini cart is updated
			String num1 = rai.getText(Vype_CommonXpath.txtnumber);
			rai.VerifyElementVisible(Vype_CommonXpath.txtnumber, "Cart is updated with "+ num1+ "items ");


		}catch (Exception e){
			e.printStackTrace();
		}
	}

	//-------------------------------------------------------------------------------------------------------------
	//To caluculate Tax break
	public void calulateTaxBreakdown(String Address) throws Exception {
		try{

			Float percentage;
			String per;
			float per1;
			String GST;
			float GSTvalue;
			String HST;
			float HSTvalue;
			String PST;
			float PSTvalue;

			//Verify the user is redirected to the "Delivery page"
			rai.VerifyElementsVisible(Vype_CommonXpath.txtCheckout, "Delivery ");



			String subtotal = rai.getText(Vype_CommonXpath.txtSubtotal);

			float value = (Float.parseFloat(subtotal.substring(1)));
			//float percent=percentage = (float) (0.4*value);
			//value=value-percent;
			System.out.println("Subtotal value is: "+ value);

			if(Address.contains("ON")){ 
				//Calculate HST-13%
				percentage = (float) (0.13*value);
				System.out.println("Calcuated percentage is:"+ percentage);

				per= String.valueOf(percentage);
				per = per.substring(0,3);

				per1 = Float.parseFloat(per);
				System.out.println(per1);

				HST = rai.getText(Vype_CommonXpath.txtHSTValue);
				HSTvalue = Float.parseFloat(HST.substring(1,4));
				System.out.println("HST Value is"+ HSTvalue);

				if(per1==HSTvalue){
					rai.VerifyElementsVisible(Vype_CommonXpath.txtHSTValue,"HST tax calculated is "+percentage);
					System.out.println(per1+" and " +HSTvalue + "are same ");
				}					
			}

			if(Address.contains("SK")){
				//Calculate GST-5%
				percentage = (float) (0.05*value);
				System.out.println("Calcuated percentage is:"+ percentage);

				per= String.valueOf(percentage);
				per = per.substring(0,3);

				per1 = Float.parseFloat(per);
				System.out.println(per1);

				GST = rai.getText(Vype_CommonXpath.txtGSTValue);
				GSTvalue = Float.parseFloat(GST.substring(1,4));
				System.out.println("GST Value is"+ GSTvalue);

				if(per1==GSTvalue){
					rai.VerifyElementsVisible(Vype_CommonXpath.txtGSTValue,"GST tax calculated is"+ percentage);
					System.out.println(per1+" and " +GSTvalue + "are same ");
				}	
				//Calculate PST-6%
				percentage = (float) (0.06*value);
				System.out.println("Calcuated percentage is:"+ percentage);

				per= String.valueOf(percentage);
				per = per.substring(0,3);

				per1 = Float.parseFloat(per);
				System.out.println(per1);

				PST = rai.getText(Vype_CommonXpath.txtPSTValue);
				PSTvalue = Float.parseFloat(PST.substring(1,4));
				System.out.println("PST Value is"+ PSTvalue);

				if(per1==PSTvalue){
					rai.VerifyElementsVisible(Vype_CommonXpath.txtPSTValue,"PST tax calculated is "+percentage);
					System.out.println(per1+" and " +PSTvalue + "are same ");
				}	
			}

			if(Address.contains("BC")){
				//Calculate GST-6%
				percentage = (float) (0.06*value);
				System.out.println("Calcuated percentage is:"+ percentage);

				per= String.valueOf(percentage);
				per = per.substring(0,3);

				per1 = Float.parseFloat(per);
				System.out.println(per1);

				GST = rai.getText(Vype_CommonXpath.txtGSTValue);
				GSTvalue = Float.parseFloat(GST.substring(1,4));
				System.out.println("GST Value is"+ GSTvalue);

				if(per1==GSTvalue){
					rai.VerifyElementsVisible(Vype_CommonXpath.txtGSTValue,"GST tax calculated is: "+percentage);
					System.out.println(per1+" and " +GSTvalue + "are same ");
				}	
				//Calculate PST-20%
				percentage = (float) (0.2*value);
				System.out.println("Calcuated percentage is:"+ percentage);

				per= String.valueOf(percentage);
				per = per.substring(0,3);

				per1 = Float.parseFloat(per);
				System.out.println(per1);

				PST = rai.getText(Vype_CommonXpath.txtPSTValue);
				PSTvalue = Float.parseFloat(PST.substring(1,4));
				System.out.println("PST Value is"+ PSTvalue);

				if(per1==PSTvalue){
					rai.VerifyElementsVisible(Vype_CommonXpath.txtPSTValue,"PST tax calculated is: "+ percentage);
					System.out.println(per1+" and " +PSTvalue + "are same ");
				}	
			}

			if(Address.contains("MB")){
				//Calculate GST-5%
				percentage = (float) (0.05*value);
				System.out.println("Calcuated percentage is:"+ percentage);

				per= String.valueOf(percentage);
				per = per.substring(0,3);

				per1 = Float.parseFloat(per);
				System.out.println(per1);

				GST = rai.getText(Vype_CommonXpath.txtGSTValue);
				GSTvalue = Float.parseFloat(GST.substring(1,4));
				System.out.println("GST Value is"+ GSTvalue);

				if(per1==GSTvalue){
					rai.VerifyElementsVisible(Vype_CommonXpath.txtGSTValue,"GST tax calculated is: "+percentage);
					System.out.println(per1+" and " +GSTvalue + "are same ");
				}	
				//Calculate PST-7%
				percentage = (float) (0.07*value);
				System.out.println("Calcuated percentage is:"+ percentage);

				per= String.valueOf(percentage);
				per = per.substring(0,3);

				per1 = Float.parseFloat(per);
				System.out.println(per1);

				PST = rai.getText(Vype_CommonXpath.txtPSTValue);
				PSTvalue = Float.parseFloat(PST.substring(1,4));
				System.out.println("PST Value is"+ PSTvalue);

				if(per1==PSTvalue){
					rai.VerifyElementsVisible(Vype_CommonXpath.txtPSTValue,"PST tax calculated is: "+percentage);
					System.out.println(per1+" and " +PSTvalue + "are same ");
				}	
			}

			if(Address.contains("NB") ||Address.contains("NL") || Address.contains("PE") ){
				//Calculate HST-15%
				percentage = (float) (0.15*value);
				System.out.println("Calcuated percentage is:"+ percentage);

				per= String.valueOf(percentage);
				per = per.substring(0,3);

				per1 = Float.parseFloat(per);
				System.out.println(per1);

				HST = rai.getText(Vype_CommonXpath.txtHSTValue);
				HSTvalue = Float.parseFloat(HST.substring(1,4));
				System.out.println("HST Value is"+ HSTvalue);

				if(per1==HSTvalue){
					rai.VerifyElementsVisible(Vype_CommonXpath.txtHSTValue,"HST tax calculated is: "+ percentage);
					System.out.println(per1+" and " +HSTvalue + "are same ");
				}	
			}

			if(Address.contains("AB")){
				//Calculate GST-5%
				percentage = (float) (0.05*value);
				System.out.println("Calcuated percentage is:"+ percentage);

				per= String.valueOf(percentage);
				per = per.substring(0,3);

				per1 = Float.parseFloat(per);
				System.out.println(per1);

				GST = rai.getText(Vype_CommonXpath.txtGSTValue);
				GSTvalue = Float.parseFloat(GST.substring(1,4));
				System.out.println("GST Value is"+ GSTvalue);

				if(per1==GSTvalue){
					rai.VerifyElementsVisible(Vype_CommonXpath.txtGSTValue,"GST tax calculated is: "+percentage);
					System.out.println(per1+" and " +GSTvalue + "are same ");
				}	

			}

		}catch (Exception e){
			e.printStackTrace();
		}
	}

	//--------------------------------------------------------------------------------------------------------------
	//add flavor with nicotine strength
	public void addpods(String flavor)
	{
		try {
			rai.VerifyElementsVisible(Vype_CommonXpath.flavor(flavor), flavor);

			rai.clickUsingJs(Vype_CommonXpath.flavor(flavor), flavor);

			rai.VerifyElementsVisible(Vype_CommonXpath.pgflavor(flavor), flavor);

			rai.VerifyElementsVisible(Vype_CommonXpath.txtNicotinestrength, "Nicotine Strength");

			//rai.clickUsingJs(Vype_CommonXpath.btnstrength,"+ " );

			rai.clickUsingJs(Vype_CommonXpath.add,"Add");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	public void CancelActiveSubscription() throws Exception {
		try {

			rai.ScrollByxpath(Vype_CommonXpath.lnkCancelSubscription);

			// Click on Cancel subscription link
			rai.clickLink(Vype_CommonXpath.lnkCancelSubscription, "Cancel");

			//For Feedback pop-up
			//rai.ClickUsingOCR("Not Now");


			// Verify cancel subscription pop up modal is displayed.
			rai.VerifyElementVisible(Vype_CommonXpath.txtCancelSubscription, "Cancel Subscription");

			// Verify text "are you sure you want to cancel your recurring
			// subscription".
			rai.VerifyElementVisible(Vype_CommonXpath.txtCancelMessage, "Are you sure want to cancel");

			// Verify yes cancel button.
			rai.VerifyElementVisible(Vype_CommonXpath.lnkYesCancel, "Yes Cancel");

			// Verify no return button.
			rai.VerifyElementVisible(Vype_CommonXpath.lnkNoreturn, "No return");

			// Click on 'x' or no return
			rai.clickbutton(Vype_CommonXpath.lnkNoreturn, "No return");

			// Verify cancel subscription pop up modal is closed.
			rai.VerifyElementVisible(Vype_CommonXpath.txtSubscription, "Subscription");

			// Click on cancel link.
			rai.clickbutton(Vype_CommonXpath.lnkCancel, "Cancel");

			//For Feedback pop-up
			//rai.ClickUsingOCR("Not Now");

			// Verify cancel subscription pop modal is displayed with the text
			// "Are you sure you want to cancel your recurring subscription?
			// This action cannot be undone."
			rai.VerifyElementVisible(Vype_CommonXpath.txtCancelMessage, "Are you sure want to cancel");

			// Verify yes cancel button.
			rai.VerifyElementVisible(Vype_CommonXpath.lnkYesCancel, "Yes Cancel");

			// Verify no return .
			rai.VerifyElementVisible(Vype_CommonXpath.lnkNoreturn, "No return");

			// Click on yes
			rai.clickbutton(Vype_CommonXpath.lnkYesCancel, "Yes Cancel");

			Thread.sleep(2000);

			// Confirmation of the subscription cancel is displayed
			rai.VerifyElementVisible(Vype_CommonXpath.txtSubscriptionCancelInfo, "You have no subscription plan yet");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void deletecard() throws Exception {
		try {

			// Click on yes
			rai.clickbutton(Vype_CommonXpath.btnmenu, "Menu ");

			rai.clickLink(Vype_CommonXpath.lnkAccount, "Account ");

			rai.ScrollByxpath(Vype_CommonXpath.deletecard);

			rai.clickLink(Vype_CommonXpath.deletecard,"delete ");

			rai.clickLink(Vype_CommonXpath.txtdelete," yes delete ");




		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// Added By Sandeepa

	public void ChooseSkin(String Skin)
	{
		try
		{

			Thread.sleep(10000);
			rai.SwipeDownSmallerUnits(6);

			String str1=rai.getText(Vype_CommonXpath.txtcorecollection);

			rai.VerifyElementsVisible(Vype_CommonXpath.txtcorecollection,"Core Collection");

			System.out.println(str1);

			rai.clickbutton(Vype_CommonXpath.txtcorecollection,"Core Collection");

			Thread.sleep(1000);
			rai.SwipeDownSmallerUnits(1);
			rai.clickUsingJs(Vype_CommonXpath.btnBuynow, "Click on buy now");

			// Select any skin colour
			rai.clickUsingJs(Vype_CommonXpath.skintype(Skin), "Skin selected is: " + Skin);

		}
		catch (Exception e){
			e.printStackTrace();
		}

	}

	public void SelectSkinAndVerify(String Skin)
	{

		try
		{
			String s=rai.getText(Vype_CommonXpath.txtskin);

			rai.VerifyElementsVisible(Vype_CommonXpath.txtskin,"Skin");

			System.out.println(s+" is highlighted ");


			String Skin1=Skin.substring(0,1).toUpperCase();
			Skin=Skin1.concat(Skin.substring(1));

			rai.VerifyElementsVisible(Vype_CommonXpath.imgpodSkin(Skin),Skin);

			String price=rai.getText(Vype_CommonXpath.txtprice);

			System.out.println("The Price of "+Skin+" is "+price);

			rai.VerifyElementVisible(Vype_CommonXpath.txtprice, price);

			rai.VerifyElementsVisible(Vype_CommonXpath.btnPlus, "+ ");

			rai.VerifyElementsVisible(Vype_CommonXpath.btnminus, "- ");

			rai.clickbutton(Vype_CommonXpath.btnminus, "- ");

			rai.VerifyElementsVisible(Vype_CommonXpath.btnBuynow1, "Buy now");

			rai.clickbutton(Vype_CommonXpath.btnPlus, "+ ");

			rai.clickbutton(Vype_CommonXpath.btnBuynow1, "Buy now");

		}
		catch (Exception e){
			e.printStackTrace();
		}
	}
	//-----------------------------------------------------------------------------------------------------------

	public void signup(String emailID, String pwd) {
		// TODO Auto-generated method stub
		// Enter User name in the user name text field
		//rai.inputText(Vype_CommonXpath.txtUsername, "Username", UN);

		Map<String, Object> params = new HashMap<>();
		params.put("label", "john.doe@mail.com");
		// params.put("text", "alva.white36@bat.com");
		params.put("text",emailID );
		params.put("operation", "sinraie");
		adriver.executeScript("mobile:edit-text:set", params);

		// Enter Password in the password text field
		//rai.fnPasswordEncryption(pwd, Vype_CommonXpath.txtPassword);

		Map<String, Object> params1 = new HashMap<>();
		params1.put("label", "Password");
		// params1.put("text", "TEST1234");
		params1.put("text", pwd);
		params1.put("label.direction", "above");
		params1.put("label.offset", "3%");
		adriver.executeScript("mobile:edit-text:set", params1);


	}


	public void EnterFirst_Last_Name(String fN, String lN) throws Exception {
		
		
		rai.inputTextjavaScriptSendkeys(adriver, Vype_CommonXpath.txtFirstName, fN);
		// TODO Auto-generated method stub
		
		
		
		rai.inputTextjavaScripfnPasswordencryption(adriver, Vype_CommonXpath.txtLastName, lN);

		// Enter Password in the password text field
		//rai.fnPasswordEncryption(pwd, Vype_CommonXpath.txtPassword);


	}



	//

	public void EnterDOB_ADD_Phno(String dOB, String aDD, String phNo) {
		// TODO Auto-generated method stub
		// Enter User name in the user name text field
		//rai.inputText(Vype_CommonXpath.txtUsername, "Username", UN);

		Map<String, Object> params = new HashMap<>();
		params.put("label", "YYYY/MM/DD");
		// params.put("text", "alva.white36@bat.com");
		params.put("text", dOB);
		params.put("operation", "sinraie");
		adriver.executeScript("mobile:edit-text:set", params);           

		// Enter Password in the password text field
		//rai.fnPasswordEncryption(pwd, Vype_CommonXpath.txtPassword);

		Map<String, Object> params1 = new HashMap<>();
		params1.put("label", "Start typing...");
		// params1.put("text", "TEST1234");
		params1.put("text", aDD);
		params1.put("label.direction", "above");
		params1.put("label.offset", "3%");
		adriver.executeScript("mobile:edit-text:set", params1);

		adriver.findElement(By.xpath("//input[@name='address']")).sendKeys(Keys.DOWN,Keys.RETURN);
		adriver.findElement(By.xpath("//input[@name='address']")).sendKeys(Keys.DOWN,Keys.RETURN);



		Map<String, Object> params3 = new HashMap<>();
		params1.put("label", "Phone Number");
		// params1.put("text", "TEST1234");
		params1.put("text", phNo);
		params1.put("label.direction", "above");
		params1.put("label.offset", "3%");
		adriver.executeScript("mobile:edit-text:set", params1);


	}

	public void selectDeviceColorforepod2Corecollections(String devicecolour) {
		// TODO Auto-generated method stub
		try {



			Thread.sleep(10000);
			rai.clickUsingJs(Vype_CommonXpath.lnkcorecollections, "epod2 core collections");

			Thread.sleep(10000);
			// Verify the "Choose your colour" page is displayed
			rai.VerifyElementVisible(Vype_CommonXpath.txtChooseyourClr, "Choose your Color");

			// Select any colour
			rai.clickUsingJs(Vype_CommonXpath.btnSelectDeviceColor(devicecolour), "colour selected is:" + devicecolour);

			// Verify Text Power on with the VUSE ePod2 section is displayed

			rai.VerifyElementVisible(Vype_CommonXpath.pgdevicecolour,"The Power on with the Vuse ePod2 Section");

			for(int i=0;i<4;i++)
			{
				rai.clickUsingJs(Vype_CommonXpath.rightarrow, "-> ");

				rai.VerifyElementVisible(Vype_CommonXpath.weProductImage,"product images ");
			}

			// Click on Add to Cart button
			rai.clickUsingJs(Vype_CommonXpath.btnAddToCART, "Add to Cart");

			// Verify mini cart is updated
			String str;
			str = rai.getText(Vype_CommonXpath.txtnumber);
			rai.VerifyElementVisible(Vype_CommonXpath.txtnumber, "Cart is updated with " + str + " number ");





		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	// ****************************************************************************

	public void navigateToePodSkinsPage() throws Exception {
		try {

			rai.Menubutton();
			//rai.clickbutton(Vype_CommonXpath.btnmenu, "Menu");

			rai.clickbutton(Vype_CommonXpath.lnkShop, "Shop");

			rai.clickbutton(Vype_Skinspage.txtpersonlizepod, "Shop link from the main menu navigation");

			rai.clickbutton(Vype_Skinspage.deviceshop, "shop skin device");

			// Click on Skins under ePod section
			//rai.clickbutton(Vype_CommonXpath.lnkSkinsEpod, "Skins link under epod section ");
			Thread.sleep(10000);

			// Verify that Choose your skin page is displayed.
			//rai.VerifyObjectDisplayed(Vype_CommonXpath.wetxtChooseSkin, "Choose your skin page is opened ");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	//*********************************************************************************

	public void add_skin(String Skin)
	{
		try
		{

			// rai.VerifyObjectDisplayed(Vype_CommonXpath.txtCalla);

			// rai.clickUsingJs(Vype_CommonXpath.btnBuyNow, "Buy now");

			// rai.clickbutton(Vype_CommonXpath.lnkcorecollectionsforShopEpod2skin,"core
			// collection");

			Thread.sleep(15000);
			// rai.fnScrollToView(Vype_CommonXpath.txtcorecollection);

			// String str1=rai.getText(Vype_CommonXpath.txtcorecollection);

			// rai.VerifyObjectDisplayed(Vype_CommonXpath.txtcorecollection,"Core
			// Collection");

			// System.out.println(str1);

			// click on shop now
			// rai.clickUsingJs(Vype_CommonXpath.btnshopNow, "Shop now");
			// Thread.sleep(5000);

			// rai.fnScrollToView(Vype_CommonXpath.btnbuynow);
			// rai.clickUsingJs(Vype_CommonXpath.buynow, "Click on buy now");

			// Thread.sleep(5000);

			// click on core collection
			// rai.clickbutton(Vype_CommonXpath.lnkcorecollectionsforShopEpod2skin,"core
			// collection");

			//rai.VerifyObjectDisplayed(Vype_CommonXpath.imgpodSkin(Skin), Skin);

			/*
			 * String Skin1 = Skin.substring(0, 1).toLowerCase(); Skin =
			 * Skin1.concat(Skin.substring(1));
			 */

			// Select any skin colour

			rai.fnclick_Selenium(Vype_Skinspage.skintype(Skin));
			//rai.clickbutton(Vype_CommonXpath.skintype(Skin), "Skin selected is: " + Skin);
			Thread.sleep(10000);

			String s = rai.getText(Vype_CommonXpath.txtskin);

			rai.VerifyElementVisible(Vype_CommonXpath.txtskin, "Skin");

			System.out.println(s + " is highlighted ");

			// rai.clickbutton(Vype_CommonXpath.podSkin(Skin),Skin );

			/*
			 * String str=Skin.substring(0,1).toUpperCase(); String Str1=Skin.substring(1);
			 * Skin=str.concat(Str1);
			 */

			String price = rai.getText(Vype_CommonXpath.txtprice);

			System.out.println("The Price of " + Skin + " is " + price);

			rai.VerifyElementVisible(Vype_CommonXpath.txtprice, price);

			rai.VerifyElementVisible(Vype_CommonXpath.btnPlus, "+ ");

			rai.VerifyElementVisible(Vype_CommonXpath.btnminus, "- ");

			rai.clickbutton(Vype_CommonXpath.btnminus, "- ");
			Thread.sleep(2000);

			//rai.isDisabled(Vype_CommonXpath.buynow, "Buy now");

			// rai.VerifyObjectDisplayed(Vype_CommonXpath.btnBuynow, "Buy now");

			rai.clickbutton(Vype_CommonXpath.btnPlus, "+ ");
			Thread.sleep(2000);

			rai.isEnabled(Vype_CommonXpath.buynow, "Buy now");

			rai.clickbutton(Vype_CommonXpath.buynow, "Buy now");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//********************************************************************************************************************8

	public void addpods(String flavor, String FlavourSection) throws Exception {

		/*rai.VerifyElementVisible(Vype_CommonXpath.flavor(flavor), flavor);

	rai.clickUsingJs(Vype_CommonXpath.flavor(flavor), flavor);

	rai.VerifyElementVisible(Vype_CommonXpath.pgflavor(flavor), flavor);

	rai.VerifyElementVisible(Vype_CommonXpath.txtNicotinestrength, "+");

	rai.clickUsingJs(Vype_CommonXpath.btnplusstrength, "+ ");

	rai.clickUsingJs(Vype_CommonXpath.add, "Add");


		 */

		// scroll to fruit section
		rai.ScrollByxpath(Vype_Skinspage.EpodflavorSection(FlavourSection));

		// click on right arrow
		//rai.clickbutton(Vype_CommonXpath.fruitRightArrow, "Fruit right arrow");		
		Thread.sleep(6000);
		// click on flavor image
		rai.ScrollByxpath(Vype_Skinspage.btnAddFlavor(flavor));
		Thread.sleep(6000);
		rai.clickUsingJs(Vype_Skinspage.imgflavor(flavor) , flavor);

		//add products
		Thread.sleep(6000);

		//	rai.ScrolltoTopofthepage();

		Thread.sleep(6000);
		// click on One time purchase
		//rai.ScrollByxpath(Vype_CommonXpath.lnkOneTimePurchase);
		//rai.clickbutton(Vype_CommonXpath.lnkOneTimePurchase, "One Time Purchase");

		// Scroll to view quality
		//rai.ScrollByxpath(Vype_CommonXpath.txtPack);

		// click on plus button Nicotine strength 1.6%
		rai.SwipeDownSmallerUnits(2);
		rai.clickbutton(Vype_Skinspage.btnQtyIncrement, "Quantity Increment");

		// click on Add To Cart.
		rai.clickbutton(Vype_Skinspage.btnAddToCart, "Add To Cart");

		// Verify mini cart is updated
		String num1 = rai.getText(Vype_CommonXpath.txtnumber);
		rai.VerifyElementVisible(Vype_CommonXpath.txtnumber, "Cart is updated with " + num1 + "items ");

	}

	// TODO Auto-generated method stub
	public void hoverCartAndClickViewCart() throws Exception {
		try {

			// Hover on the Cart icon
			rai.clickbutton(Vype_CommonXpath.lnkCartIcon, "Cart Icon");

			Thread.sleep(10000);

			// Click on "View Cart" button from Tiny Cart modal
			//rai.clickbutton(Vype_CommonXpath.btnViewCart, "View Cart button from Tiny Cart modal");
			//rai.clickbutton(Vype_CommonXpath.btnViewCart, "View Cart button from Tiny Cart modal");

			Thread.sleep(3000);

			rai.ScrollByxpath(Vype_Cart.pgCart);

			Thread.sleep(2000);

			// Verify that Shipping Cart page
			rai.VerifyElementVisible(Vype_Cart.pgCart, "Shipping Cart");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void ePodSkinsPage() throws Exception {
		try
		{

			//rai.Menubutton();
			// rai.clickbutton(Vype_CommonXpath.btnmenu, "Menu");

			rai.clickLink(Vype_CommonXpath.lnkShop, "Shop");

			rai.clickbutton(Vype_Skinspage.txtpersonlizepod, "Shop link from the main menu navigation");

			rai.clickbutton(Vype_Skinspage.deviceshop, "shop skin device");
			Thread.sleep(5000);
			rai.ScrollByxpath(Vype_Skinspage.lnkepod);
			Thread.sleep(5000);
			rai.clickUsingJs(Vype_Skinspage.lnkepod, "epod2");

			Thread.sleep(15000);

		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void launchApplication1(String url) throws Exception {



           rai.fnClearCache();
            
            if(Constants.PM_DEVICEType.equalsIgnoreCase("Android"))
            {
                rai.launchurl(url);
            }
            if(Constants.PM_DEVICEType.equalsIgnoreCase("IOS"))
            {
                rai.launchurl(url);
                rai.switchToContext(adriver, "NATIVE_APP");
                rdriver.findElement(By.xpath("//XCUIElementTypeTextField[contains(@value,'User Name')]")).sendKeys("vuse");
                rdriver.findElement(By.xpath("//XCUIElementTypeSecureTextField[@value='Password']")).sendKeys("VsU6Zc0m0x4d05LG");
                rdriver.findElement(By.id("Log In")).click();
                
                rai.switchToContext(adriver, "WEBVIEW");
            }
        }

	 public void AddflavorPLP(String flavor,String count) throws Exception
	    {



	       int flavorcount = Integer.parseInt(count);




	        /*boolean b=rai.verifyobjectisnotavailable(Vype_CommonXpath.Addflavor(flavor));
	        if(b==true)
	        {*/
	        
	        //Scroll to flavor name
	        rai.ScrollByxpath(Vype_CommonXpath.txtflavor(flavor));
	        
	        //Click on any flavours (ex: Watermelon Ice) "Add" button.
	        rai.clickUsingJs(Vype_CommonXpath.Addflavor(flavor),flavor);
	        
	        //Verify Flavour pop up is displayed
	        rai.VerifyElementsVisible(Vype_CommonXpath.FlavorPopUp, "Flavour pop up");
	        
	        
	        //rai.clickUsingJs(Vype_CommonXpath.btnAddToCart(flavor),  "Add to cart ");
	        
	        //Click on plus button in that flavour pop up
	        for(int i=0;i<flavorcount;i++)
	        {
	            rai.clickUsingJs(Vype_CommonXpath.Nicotinestrength(flavor),  "+");
	            Thread.sleep(1000);
	        }
	        
	        Thread.sleep(1000);
	        rai.clickUsingJs(Vype_CommonXpath.btnMinus,  "-");
	        Thread.sleep(1000);

	       //Click on "Add" button in that flavour pop up
	        rai.clickUsingJs(Vype_CommonXpath.btnadd$(flavor),  "Add to cart ");
	        
	       /*    if(b==false)
	        {
	            rai.ScrollByxpath(Vype_CommonXpath.txtflavor1(flavor));
	            rai.clickUsingJs(Vype_CommonXpath.Addflavor1(flavor),flavor);

	           for(int i=0;i<flavorcount;i++)
	            {
	                rai.clickUsingJs(Vype_CommonXpath.Nicotinestrength1(flavor),  "+");
	            }

	           rai.clickUsingJs(Vype_CommonXpath.btnAddToCart,  "Add to cart ");


	       }
	         */
	    }

	public void verifySubscriptionConfirmationPage() throws Exception {
		try {

		//	rai.VerifyElementVisible(Vype_CommonXpath.txtsubscriptioncreated, "Subscription created ");

			List<WebElement> list;
			String str="";
			String str1;
			//Verify that Active Subscription page displayed
			//rai.VerifyElementPresent(Vype_SubscriptionLanding.txtActiveSubscription, "Active Subscription ");

			//Verify the user is able to see the Active Subscriptions with date,payment,address,selection
			list = rai.findElementsList(Vype_CommonXpath.txtDatepayment);
			for(int i=0;i<list.size();i++){
				str = list.get(i).getText();
				str = str.replaceAll("[\\n\\t]", " ");
				rai.VerifyElementVisible(Vype_CommonXpath.txtDatepayment,str+ " ");
			}
			List<WebElement> list2;
			list2 = rai.findElementsList(Vype_CommonXpath.txtsubscribeditems);
			System.out.println("Subscription includes: "+list2.size());
			for(int i=0;i<list2.size();i++){
				str1 = list2.get(i).getText();
				str1 = str1.replaceAll("[\\n\\t]", " ");
				rai.VerifyElementVisible(Vype_CommonXpath.txtsubscribeditems,str1+ " ");
			}

			String total=rai.getText(Vype_CommonXpath.subscriptiontotal);
			rai.VerifyElementVisible(Vype_CommonXpath.subscriptiontotal, total);


		} catch (Exception e) {
			e.printStackTrace();
		}
	}


//added by sasikala
	public void flavourpdpscreen(String flavor) {
		// TODO Auto-generated method stub
		try
	    {

	// TODO Auto-generated method stub
	rai.ScrollByxpath(Vype_CommonXpath.lnkAllFlavoursePodPodsPage(flavor));
	String str = "";
	// Click on Strawberry flavour link
	rai.clickUsingJs(Vype_CommonXpath.lnkAllFlavoursePodPodsPage(flavor), "Flavor selected is: " + flavor);
	Thread.sleep(10000);	
	rai.VerifyElementVisible(Vype_CommonXpath.txtflavor2(flavor), flavor );


	// Verify flavor page is displayed
	
	//rai.ScrollByxpath(Vype_CommonXpath.txtFlavours(flavor));
	//rai.VerifyElementVisible(Vype_CommonXpath.txtFlavours(flavor), "Flavor Name is: " + flavor);
	rai.ScrollByxpath(Vype_CommonXpath.txtFlavoursDescription(flavor));

	Thread.sleep(2000);
	String str1 = "";

	//flavor description
	 str1 = rai.getText(Vype_CommonXpath.txtFlavoursDescription(flavor));
	rai.VerifyElementVisible(Vype_CommonXpath.txtFlavoursDescription(flavor),
			"Flavour description is: " + str1);
	
	 rai.ScrollByxpath(Vype_CommonXpath.txtPack);
	 rai.VerifyElementVisible(Vype_CommonXpath. btnnicotine, "Nicotine Strength");
	
	 rai.VerifyElementVisible(Vype_CommonXpath.Btnplus, "+ ");

	 rai.VerifyElementVisible(Vype_CommonXpath.btnMinus, "- ");
	 	
	 rai.VerifyElementVisible(Vype_CommonXpath. btnAddToCART, "Add to cart");
	 
	 
} catch (Exception e) {
    e.printStackTrace();
}

}

//epod2 core collection
	public void addskin(String Skin)
	{
	    try
	    {



	        




	        String Skin1 = Skin.substring(0, 1).toLowerCase();
	        Skin = Skin1.concat(Skin.substring(1));



	        // Select any skin colour
	        rai.clickUsingJs(Vype_Skin_mobile.skintype(Skin), "Skin selected is: " + Skin);
	        Thread.sleep(5000);



	        String s = rai.getText(Vype_CommonXpath.txtskin);



	        rai.VerifyElementVisible(Vype_CommonXpath.txtskin, "Skin");



	        System.out.println(s + " is highlighted ");



	        



	        String price = rai.getText(Vype_CommonXpath.txtprice);



	        System.out.println("The Price of " + Skin + " is " + price);







	        System.out.println("The Price of " + Skin + " is " + price);

	        rai.SwipeDownSmallerUnits(2);

	        rai.VerifyElementVisible(Vype_CommonXpath.txtprice, price);



	        rai.VerifyElementVisible(Vype_CommonXpath.btnPlus, "+ ");



	        rai.VerifyElementVisible(Vype_CommonXpath.btnminus, "- ");



	        rai.clickbutton(Vype_CommonXpath.btnminus, "- ");
	        Thread.sleep(2000);



	        
	        rai.clickbutton(Vype_CommonXpath.btnPlus, "+ ");
	        Thread.sleep(2000);



	        rai.isEnabled(Vype_CommonXpath.buynow, "Buy now");



	        rai.clickbutton(Vype_CommonXpath.buynow, "Buy now");



	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}

	//edop2 collection X

	public void Addskin(String Skin)
	{
	    try
	    {



	        
	        String Skin1 = Skin.substring(0, 1).toLowerCase();
	        Skin = Skin1.concat(Skin.substring(1));



	        // Select any skin colour
	        rai.clickUsingJs(Vype_Skin_mobile.Skintype(Skin), "Skin selected is: " + Skin);
	        Thread.sleep(5000);



	        String s = rai.getText(Vype_CommonXpath.txtskin);



	        rai.VerifyElementVisible(Vype_CommonXpath.txtskin, "Skin");



	        System.out.println(s + " is highlighted ");



	        



	        String price = rai.getText(Vype_CommonXpath.txtprice);



	        System.out.println("The Price of " + Skin + " is " + price);







	        System.out.println("The Price of " + Skin + " is " + price);

	        rai.SwipeDownSmallerUnits(2);

	        rai.VerifyElementVisible(Vype_CommonXpath.txtprice, price);



	        rai.VerifyElementVisible(Vype_CommonXpath.btnPlus, "+ ");



	        rai.VerifyElementVisible(Vype_CommonXpath.btnminus, "- ");



	        rai.clickbutton(Vype_CommonXpath.btnminus, "- ");
	        Thread.sleep(2000);



	        
	        rai.clickbutton(Vype_CommonXpath.btnPlus, "+ ");
	        Thread.sleep(2000);



	        rai.isEnabled(Vype_CommonXpath.buynow, "Buy now");



	        rai.clickbutton(Vype_CommonXpath.buynow, "Buy now");



	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}


	//edop2+ core collection

	public void addSkin(String Skin)
	{
	    try
	    {



	    

	        String Skin1 = Skin.substring(0, 1).toLowerCase();
	        Skin = Skin1.concat(Skin.substring(1));



	        // Select any skin colour
	        rai.clickUsingJs(Vype_Skin_mobile.skinTypCore(Skin), "Skin selected is: " + Skin);
	        Thread.sleep(5000);



	        String s = rai.getText(Vype_CommonXpath.txtskin);



	        rai.VerifyElementVisible(Vype_CommonXpath.txtskin, "Skin");



	        System.out.println(s + " is highlighted ");



	        



	        String price = rai.getText(Vype_CommonXpath.txtprice);



	        System.out.println("The Price of " + Skin + " is " + price);







	        System.out.println("The Price of " + Skin + " is " + price);



	        rai.VerifyElementVisible(Vype_CommonXpath.txtprice, price);
	        
	        rai.SwipeDownSmallerUnits(2);



	        rai.VerifyElementVisible(Vype_CommonXpath.btnPlus, "+ ");



	        rai.VerifyElementVisible(Vype_CommonXpath.btnminus, "- ");



	        rai.clickbutton(Vype_CommonXpath.btnminus, "- ");
	        Thread.sleep(2000);



	        
	        rai.clickbutton(Vype_CommonXpath.btnPlus, "+ ");
	        Thread.sleep(2000);



	        rai.isEnabled(Vype_CommonXpath.buynow, "Buy now");



	        rai.clickbutton(Vype_CommonXpath.buynow, "Buy now");



	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}

	//edop2+ collection X

	public void AddSkin(String Skin)
	{
	    try
	    {



	        


	        String Skin1 = Skin.substring(0, 1).toLowerCase();
	        Skin = Skin1.concat(Skin.substring(1));



	        // Select any skin colour
	        rai.clickUsingJs(Vype_Skin_mobile.skinType(Skin), "Skin selected is: " + Skin);
	        Thread.sleep(5000);



	        String s = rai.getText(Vype_CommonXpath.txtskin);



	        rai.VerifyElementVisible(Vype_CommonXpath.txtskin, "Skin");



	        System.out.println(s + " is highlighted ");



	        



	        String price = rai.getText(Vype_CommonXpath.txtprice);



	        System.out.println("The Price of " + Skin + " is " + price);







	        System.out.println("The Price of " + Skin + " is " + price);



	        rai.VerifyElementVisible(Vype_CommonXpath.txtprice, price);

            rai.SwipeDownSmallerUnits(2);

	        rai.VerifyElementVisible(Vype_CommonXpath.btnPlus, "+ ");



	        rai.VerifyElementVisible(Vype_CommonXpath.btnminus, "- ");



	        rai.clickbutton(Vype_CommonXpath.btnminus, "- ");
	        Thread.sleep(2000);



	        
	        rai.clickbutton(Vype_CommonXpath.btnPlus, "+ ");
	        Thread.sleep(2000);



	        rai.isEnabled(Vype_CommonXpath.buynow, "Buy now");



	        rai.clickbutton(Vype_CommonXpath.buynow, "Buy now");



	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}

public void addpodsflavor1(String flavor) throws Exception {
		
		// TODO Auto-generated method stub
		//scroll to flavor
		rai.ScrollByxpath(Vype_CommonXpath.lnkflavour(flavor));
		//adding flavor
		rai.clickUsingJs(Vype_CommonXpath.lnkflavour(flavor), flavor );
		Thread.sleep(2000);
		rai.clickUsingJs(Vype_CommonXpath.btnadd$(flavor),"Add to cart ");
		
		//Click on close icon for flavor pop up
         rai.clickbutton(Vype_CommonXpath.closeFlavor, "ePod Pods");
        
        
          
}


	
	
	
	





}
