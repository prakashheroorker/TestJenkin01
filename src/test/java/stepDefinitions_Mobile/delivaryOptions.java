package stepDefinitions_Mobile;



import java.util.List;

import org.openqa.selenium.WebElement;

import com.rai.framework.CommonFunctions_Mobile;
import com.rai.framework.RAI_Mobile_Utility_Functions;

import cucumber.api.java.en.*;
import goVype_Properties.Vype_Cart;
import goVype_Properties.Vype_CheckOut;
import goVype_Properties.Vype_delivaryOptions;
import goVype_Properties_mobile.Vype_CommonXpath;
import goVype_Properties_mobile.Vype_deliveryoptions;


public class delivaryOptions {

	RAI_Mobile_Utility_Functions rai = new RAI_Mobile_Utility_Functions();
	CommonFunctions_Mobile function = new CommonFunctions_Mobile(rai);

	
	
	@Then("^User clicks on hamberger menu and clicks on Shop for NonVuse\\+member$")
	public void user_clicks_on_hamberger_menu_and_clicks_on_Shop_for_NonVuse_member() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	
		//rai.ClickUsingOCR("NO THANKS");
		
		rai.SwipeUpSmallerUnits(1);
		// Clicking on Menu and navigate to Shop
		rai.clickUsingJs(Vype_CommonXpath.btnmenu, "Menu ");

		// Click on Shop link
		//rai.clickUsingJs(Vype_CommonXpath.lnkShop, "Shop ");

		rai.ClickUsingOCR("Shop");
	}

	
	@Then("^verifying shipping options when subtotal is less than \\$ Twenty five$")
	public void verifying_shipping_options_when_subtotal_is_less_than_$_Twenty_five() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
    rai.VerifyElementVisible(Vype_deliveryoptions.Subtotl,"Sub Total");
	String TotalAmount = rai.getText(Vype_deliveryoptions.Subtotl);
	float f=Float.parseFloat(TotalAmount.substring(1));
	
		if(f < 25)
		{
			rai.ScrollByxpath(Vype_Cart.btnCheckOut);

			Thread.sleep(2000);

			// Click on 'Check Out' button from the Cart Page.
			rai.clickUsingJs(Vype_Cart.btnCheckOut, "Cart Page - Check Out");

			// Verify that Check Out Page is displayed
			rai.VerifyElementsVisible(Vype_CheckOut.pgCheckOut, "Check Out");
//			String PhoneNum = "9987786567";

		// Shouiab //click on home
			rai.VerifyElementsVisible(Vype_CommonXpath.weHomeAddress, "Home");
       
			rai.ScrolltoBottomofthepage();

				Thread.sleep(1000);
			
				// Click on 'Go to delivery' button
				rai.clickUsingJs(Vype_deliveryoptions.BtnGoToDelivery, "Go to delivery");

				Thread.sleep(3000);
				
				
//				 shipping subtotal
				
//				rai.ScrollByxpath(Vype_deliveryoptions.Subtotl);
				
//					rai.VerifyElementVisible(Vype_deliveryoptions.Subtotl, ">>>>>>>>Subtotal value is: " + f + ">>>>>>>>>>>>");

			  
				    System.out.println(">>>>>> Subtotal value is "+ f +" >>>>>>>>>");
				    
				    
				    rai.VerifyElementsVisible(Vype_deliveryoptions.Dilvryoptions,"Delivery Shipping options");
					
				
			
				String str=rai.getText(Vype_deliveryoptions.Txtshippingoptions);
				rai.VerifyElementVisible(Vype_deliveryoptions.Txtshippingoptions, str);
				
				rai.ScrollByxpath(Vype_deliveryoptions.shipOptions);
                rai.VerifyElementVisible(Vype_deliveryoptions.shipOptions,"Shipping Options Aviliable");
                
				List<WebElement> lst =rai.findElementsList(Vype_deliveryoptions.ShippingOptions);
				System.out.println("No of delivary options :"+lst.size());
				for(int j=0;j<lst.size();j++)
				{
				String s=lst.get(j).getText();
				System.out.println((j+1)+":"+s);
				rai.VerifyElementVisible(Vype_deliveryoptions.ShippingOptions, s);
				
				rai.ScrolltoTopofthepage();
				rai.ScrollByxpath(Vype_CommonXpath.lnkCartIcon);
				}
		}
	}
	
	@Then("^verifying shipping options when subtotal is in between \\$ Twenty Five && \\$ Fourty Nine$")
	public void verifying_shipping_options_when_subtotal_is_in_between_$_Twenty_Five_$_Fourty_Nine() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		rai.VerifyElementVisible(Vype_deliveryoptions.Subtotl,"Sub Total");
		String TotalAmount = rai.getText(Vype_deliveryoptions.Subtotl);
		float f=Float.parseFloat(TotalAmount.substring(1));
		
		for(int i=1;i>0;){
			if(f < 25 ){

				//Add quantity 
				rai.clickbutton(Vype_deliveryoptions.BtnAdd, "+");
				Thread.sleep(2000);
				String TotalAmount1 = rai.getText(Vype_delivaryOptions.subtotl);
				f = Float.parseFloat(TotalAmount1.substring(1));
				i++;
				
				  rai.ScrollByxpath(Vype_Cart.btnCheckOut);
//				    rai.fnScrollToView(Vype_Cart.btnCheckOut);
					Thread.sleep(5000);
					rai.waitTillElementEnable(Vype_Cart.btnCheckOut);
					Thread.sleep(5000);
					// Click on 'Check Out' button from the Cart Page.
					rai.clickUsingJs(Vype_Cart.btnCheckOut, "Cart Page - Check Out");
					Thread.sleep(5000);
					// Verify that Check Out Page is displayed
					rai.VerifyElementVisible(Vype_CheckOut.pgCheckOut, "Check Out");
					
					Thread.sleep(2000);

					// Click on Home
					rai.VerifyElementVisible(Vype_CommonXpath.weHomeAddress, "Home");
					// String
					// totalAmtPaid=gl.getText(Vype_PlatinumProfileTrigger.cartValueTotal);

					rai.ScrolltoBottomofthepage();

					Thread.sleep(2000);
				
					// Click on 'Go to delivery' button
					rai.clickUsingJs(Vype_deliveryoptions.BtnGoToDelivery, "Go to delivery");
					
					// shipping subtotal
				
						
//						rai.ScrollByxpath(Vype_deliveryoptions.Subtotl);
						
//						rai.VerifyElementVisible(Vype_deliveryoptions.Subtotl, ">>>>>>>>Subtotal value is: " + f + ">>>>>>>>>>>>");
//					    Thread.sleep(2000);
//				  
					    System.out.println(">>>>>> Subtotal value is "+ f +" >>>>>>>>>");
					
			
				
					String str=rai.getText(Vype_deliveryoptions.Txtshippingoptions);
					rai.VerifyElementVisible(Vype_deliveryoptions.Txtshippingoptions, str);
					
					rai.ScrollByxpath(Vype_deliveryoptions.shipOptions);
	                rai.VerifyElementVisible(Vype_deliveryoptions.shipOptions,"Shipping Options Aviliable");
	                
					List<WebElement> lst =rai.findElementsList(Vype_deliveryoptions.ShippingOptions);
					System.out.println("No of delivary options :"+lst.size());
					for(int j=0;j<lst.size();j++)
					   {
					     String s=lst.get(j).getText();
					     System.out.println((j+1)+":"+s);
					     rai.VerifyElementVisible(Vype_deliveryoptions.ShippingOptions, s);
					
					   }
			         }
	  
		   else {
			     System.out.println("No need to add more quantity");
			     break;
		         }

		rai.ScrolltoTopofthepage();
		rai.ScrollByxpath(Vype_CommonXpath.lnkCartIcon);
	}  
	}
	
	@Then("^verifying shipping options when subtotal in between \\$ fifty &&  \\$ Seventy Five \"$")
	public void verifying_shipping_options_when_subtotal_in_between_$_fifty_$_Seventy_Five() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions

		rai.VerifyElementVisible(Vype_deliveryoptions.Subtotl,"Sub Total");
		String TotalAmount = rai.getText(Vype_deliveryoptions.Subtotl);
		float f=Float.parseFloat(TotalAmount.substring(1));
		
		
		
		do {
			
			
			rai.clickbutton(Vype_deliveryoptions.BtnAdd, "+");
			Thread.sleep(2000);
			String TotalAmount1 = rai.getText(Vype_deliveryoptions.Subtotl);
			f = Float.parseFloat(TotalAmount1.substring(1));
			

			
		}while(f < 50);
			
		{
		  rai.ScrollByxpath(Vype_Cart.btnCheckOut);
//		    rai.fnScrollToView(Vype_Cart.btnCheckOut);
			Thread.sleep(5000);
			rai.waitTillElementEnable(Vype_Cart.btnCheckOut);
			Thread.sleep(5000);
			// Click on 'Check Out' button from the Cart Page.
			rai.clickUsingJs(Vype_Cart.btnCheckOut, "Cart Page - Check Out");
			Thread.sleep(5000);
			// Verify that Check Out Page is displayed
			rai.VerifyElementVisible(Vype_CheckOut.pgCheckOut, "Check Out");
			
			Thread.sleep(2000);

			// Click on Home
			rai.VerifyElementVisible(Vype_CommonXpath.weHomeAddress, "Home");
			// String
			// totalAmtPaid=gl.getText(Vype_PlatinumProfileTrigger.cartValueTotal);

			rai.ScrolltoBottomofthepage();

			Thread.sleep(2000);
		
			// Click on 'Go to delivery' button
			rai.clickUsingJs(Vype_deliveryoptions.BtnGoToDelivery, "Go to delivery");
			
			// shipping subtotal
			
//			rai.ScrollByxpath(Vype_deliveryoptions.Subtotl);
//				rai.VerifyElementVisible(Vype_deliveryoptions.Subtotl, ">>>>>>>>Subtotal value is: " + f + ">>>>>>>>>>>>");
//			    Thread.sleep(2000);
		  
			    System.out.println(">>>>>> Subtotal value is "+ f +" >>>>>>>>>");
			
			
		
			String str=rai.getText(Vype_deliveryoptions.Txtshippingoptions);
			rai.VerifyElementVisible(Vype_deliveryoptions.Txtshippingoptions, str);
			
			rai.ScrollByxpath(Vype_deliveryoptions.shipOptions);
          rai.VerifyElementVisible(Vype_deliveryoptions.shipOptions,"Shipping Options Aviliable");
          
			List<WebElement> lst =rai.findElementsList(Vype_deliveryoptions.ShippingOptions);
			System.out.println("No of delivary options :"+lst.size());
			for(int j=0;j<lst.size();j++)
			{
			String s=lst.get(j).getText();
			System.out.println((j+1)+":"+s);
			rai.VerifyElementVisible(Vype_deliveryoptions.ShippingOptions, s);
			}
	}
	
		rai.ScrolltoTopofthepage();
		rai.ScrollByxpath(Vype_CommonXpath.lnkCartIcon);
	}
				
	@Then("^verifying shipping options when subtotal is above \\$ Seventy Five$")
	public void verifying_shipping_options_when_subtotal_is_above_$_Seventy_Five() throws Throwable {
    // Write code here that turns the phrase above into concrete actions

		rai.VerifyElementVisible(Vype_deliveryoptions.Subtotl,"Sub Total");
		String TotalAmount = rai.getText(Vype_deliveryoptions.Subtotl);
		float f=Float.parseFloat(TotalAmount.substring(1));
		
		
		
		do {
			
			
			rai.clickbutton(Vype_deliveryoptions.BtnAdd, "+");
			Thread.sleep(2000);
			String TotalAmount1 = rai.getText(Vype_deliveryoptions.Subtotl);
			f = Float.parseFloat(TotalAmount1.substring(1));
			

			
		}while(f < 75);
			
				{		
					rai.ScrollByxpath(Vype_Cart.btnCheckOut);
//				    rai.fnScrollToView(Vype_Cart.btnCheckOut);
					Thread.sleep(5000);
					rai.waitTillElementEnable(Vype_Cart.btnCheckOut);
					Thread.sleep(5000);
					// Click on 'Check Out' button from the Cart Page.
					rai.clickUsingJs(Vype_Cart.btnCheckOut, "Cart Page - Check Out");
					Thread.sleep(5000);
					// Verify that Check Out Page is displayed
					rai.VerifyElementVisible(Vype_CheckOut.pgCheckOut, "Check Out");
					
					Thread.sleep(2000);

					// Click on Home
					rai.VerifyElementVisible(Vype_CommonXpath.weHomeAddress, "Home");
					// String
					// totalAmtPaid=gl.getText(Vype_PlatinumProfileTrigger.cartValueTotal);

					rai.ScrolltoBottomofthepage();

					Thread.sleep(2000);
				
					// Click on 'Go to delivery' button
					rai.clickUsingJs(Vype_deliveryoptions.BtnGoToDelivery, "Go to delivery");
					
					// shipping subtotal
					
//					rai.ScrollByxpath(Vype_deliveryoptions.Subtotl);
					
//						rai.VerifyElementVisible(Vype_deliveryoptions.Subtotl, ">>>>>>>>Subtotal value is: " + f + ">>>>>>>>>>>>");
//					    Thread.sleep(2000);
				  
					    System.out.println(">>>>>> Subtotal value is "+ f +" >>>>>>>>>");
					
					
				
					String str=rai.getText(Vype_deliveryoptions.Txtshippingoptions);
					rai.VerifyElementVisible(Vype_deliveryoptions.Txtshippingoptions, str);
					
					rai.ScrollByxpath(Vype_deliveryoptions.shipOptions);
		          rai.VerifyElementVisible(Vype_deliveryoptions.shipOptions,"Shipping Options Aviliable");
		          
					List<WebElement> lst =rai.findElementsList(Vype_deliveryoptions.ShippingOptions);
					System.out.println("No of delivary options :"+lst.size());
					for(int j=0;j<lst.size();j++)
					{
					String s=lst.get(j).getText();
					System.out.println((j+1)+":"+s);
					rai.VerifyElementVisible(Vype_deliveryoptions.ShippingOptions, s);
					}
			}
			
			
			}

	
	
	
	
	
	
	
	
	@Then("^User Verifies pods page and selects flavor \"([^\"]*)\" with desired count \"([^\"]*)\" and add to cart$")
	public void User_Verifies_pods_page_and_selects_flavor_with_desired_count_and_add_to_cart(String flavor, String count) throws Throwable {

		// Verify that ePod's pods page is displayed.
		rai.VerifyElementsVisible(Vype_CommonXpath.pgEpodPods, "ePod Pods");

		//Select flavor and count
		function.Addflavor(flavor, count);

	}
	
}
	
	

		
		
		
			
		
	
			