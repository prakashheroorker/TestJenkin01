package stepDefinitions;

import java.util.List;

import org.openqa.selenium.WebElement;

import com.rai.framework.CommonFunctions;
import com.rai.framework.RAI_Desktop_Utility_Functions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import goVype_Properties.Vype_Cart;
import goVype_Properties.Vype_CheckOut;
import goVype_Properties.Vype_CommonXpath;
import goVype_Properties.Vype_SubscriptionLanding;
import goVype_Properties.Vype_delivaryOptions;
import goVype_Properties.Vype_ePodStarterKit;

public class delivaryOptions{
	RAI_Desktop_Utility_Functions gl = new RAI_Desktop_Utility_Functions();
	CommonFunctions function = new CommonFunctions(gl);
	
	
	@When("^User login with valid email address \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void user_login_with_valid_email_address_and_password(String UN, String pwd) throws Throwable {
		

			try {

				// Click on "Login/Register" button
				gl.clickbutton(Vype_CommonXpath.btnLoginorRegister, "Login or Register");

				// Verify that Login modal is displayed.
				gl.VerifyElementVisible(Vype_CommonXpath.btnLoginRegisterModal, "Login button on registration Modal");


				// Verify that user name text field is displayed
				gl.VerifyElementVisible(Vype_CommonXpath.txtUsername, "Password textfield on Login Modal");


				// Verify log in button in login model
				gl.VerifyElementVisible(Vype_CommonXpath.btnLogin, "Login button ");

				// Enter User name in the user name text field
				gl.inputText(Vype_CommonXpath.txtUsername, "Username textfield on Login Modal", UN);

				// Enter Password in the password text field
				gl.inputPasswordEncrypted(Vype_CommonXpath.txtPassword, "Password textfield on Login Modal", pwd);

				// Click on Login button
				gl.clickUsingJs(Vype_CommonXpath.btnLogin, "Login button");
				
				//Click on No Thanks Button 
	            gl.clickbutton(Vype_delivaryOptions.btnNotnow,"NOT NOW");

				// Verify that Post Login home page is displayed
				gl.VerifyPageDisplayed(Vype_CommonXpath.btnAccount, "Post Login Vype Home");

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	

	@Then("^Verifying shipping options when subtotal is less than \\$ Twenty five$")
	public void verifying_shipping_options_when_subtotal_is_less_than_$_Twenty_five() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
    gl.VerifyElementVisible(Vype_delivaryOptions.subtotl,"Sub Total");
	String TotalAmount = gl.getText(Vype_delivaryOptions.subtotl);
	float f=Float.parseFloat(TotalAmount.substring(1));
	
//	for(int i=1;i>0;){
		if(f < 25)
		{
	
				gl.fnScrollToView(Vype_Cart.btnCheckOut);
				Thread.sleep(5000);
				gl.waitTillElementVisible(Vype_Cart.btnCheckOut);
				Thread.sleep(5000);
				// Click on 'Check Out' button from the Cart Page.
				gl.clickUsingJs(Vype_Cart.btnCheckOut, "Cart Page - Check Out");
				Thread.sleep(5000);
				// Verify that Check Out Page is displayed
				gl.VerifyElementVisible(Vype_CheckOut.pgCheckOut, "Check Out");
				
				Thread.sleep(2000);

				// Click on Home
				gl.VerifyElementVisible(Vype_CommonXpath.weHomeAddress, "Home");
				// String
				// totalAmtPaid=gl.getText(Vype_PlatinumProfileTrigger.cartValueTotal);

				gl.ScrollPageDown();

				Thread.sleep(2000);
			
				// Click on 'Go to delivery' button
				gl.clickUsingJs(Vype_CheckOut.btnGoToDelivery, "Go to delivery");
				
				// shipping subtotal
				{
		         gl.VerifyObjectDisplayed(Vype_delivaryOptions.subtotl, ">>>>>>>>Subtotal value is: " + f + ">>>>>>>>>>>>");
				    Thread.sleep(2000);
			  
				    System.out.println(">>>>>> Subtotal value is "+ f +" >>>>>>>>>");
				
				}
			
				String str=gl.getText(Vype_delivaryOptions.txtshippingoptions);
				gl.VerifyElementVisible(Vype_delivaryOptions.txtshippingoptions, str);
				
				gl.fnScrollToView(Vype_delivaryOptions.ShipOptions);
                gl.VerifyElementVisible(Vype_delivaryOptions.ShipOptions,"Shipping Options Aviliable");
                
				List<WebElement> lst =gl.findElementsList(Vype_delivaryOptions.shippingoptions);
				System.out.println("No of delivary options :"+lst.size());
				for(int j=0;j<lst.size();j++)
				{
				String s=lst.get(j).getText();
				System.out.println((j+1)+":"+s);
				gl.VerifyElementVisible(Vype_delivaryOptions.shippingoptions, s);
				}
			}
			

	}




@Then("^Verifying shipping options when subtotal is in between \\$ Twenty Five && \\$ Fourty Nine$")
public void verifying_shipping_options_when_subtotal_is_in_between_$_Twenty_Five_$_Fourty_Nine() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	gl.VerifyElementVisible(Vype_delivaryOptions.subtotl,"Sub Total");
	String TotalAmount = gl.getText(Vype_delivaryOptions.subtotl);
	float f=Float.parseFloat(TotalAmount.substring(1));
	
	for(int i=1;i>0;){
		if(f < 25 ){

			//Add quantity 
			gl.clickbutton(Vype_Cart.btnAdd, "+");
			Thread.sleep(2000);
			String TotalAmount1 = gl.getText(Vype_delivaryOptions.subtotl);
			f = Float.parseFloat(TotalAmount1.substring(1));
			i++;
			
			
				{
				gl.fnScrollToView(Vype_Cart.btnCheckOut);
				Thread.sleep(5000);
				gl.waitTillElementVisible(Vype_Cart.btnCheckOut);
				Thread.sleep(5000);
				// Click on 'Check Out' button from the Cart Page.
				gl.clickUsingJs(Vype_Cart.btnCheckOut, "Cart Page - Check Out");
				Thread.sleep(5000);
				// Verify that Check Out Page is displayed
				gl.VerifyElementVisible(Vype_CheckOut.pgCheckOut, "Check Out");
				
				Thread.sleep(2000);

				// Click on Home
				gl.VerifyElementVisible(Vype_CommonXpath.weHomeAddress, "Home");
				

				gl.ScrollPageDown();

				Thread.sleep(2000);
			
				// Click on 'Go to delivery' button
				gl.clickUsingJs(Vype_CheckOut.btnGoToDelivery, "Go to delivery");
				
				// shipping subtotal
				{
		         gl.VerifyObjectDisplayed(Vype_delivaryOptions.subtotl, ">>>>>>>>Subtotal value is: " + f + ">>>>>>>>>>>>");
				    Thread.sleep(2000);
			  
				    System.out.println(">>>>>> Subtotal value is "+ f +" >>>>>>>>>");
				
				}
			
				String str=gl.getText(Vype_delivaryOptions.txtshippingoptions);
				gl.VerifyElementVisible(Vype_delivaryOptions.txtshippingoptions, str);
				
				gl.fnScrollToView(Vype_delivaryOptions.ShipOptions);
                gl.VerifyElementVisible(Vype_delivaryOptions.ShipOptions,"Shipping Options Aviliable");

				List<WebElement> lst =gl.findElementsList(Vype_delivaryOptions.shippingoptions);
				System.out.println("No of delivary options :"+lst.size());
				for(int j=0;j<lst.size();j++)
				{
				String s=lst.get(j).getText();
				System.out.println((j+1)+":"+s);
				gl.VerifyElementVisible(Vype_delivaryOptions.shippingoptions, s);
				}
			}
			}
		else{
			System.out.println("No need to add more quantity");
			break;
		}

		gl.fnScrollToView(Vype_CommonXpath.lnkCartIcon);
	}  

	
   }


@Then("^Verifying shipping options when subtotal in between \\$ fifty &&  \\$ Seventy Five \"$")
public void verifying_shipping_options_when_subtotal_in_between_$_fifty_$_Seventy_Five() throws Throwable {
    // Write code here that turns the phrase above into concrete actions

	gl.VerifyElementVisible(Vype_delivaryOptions.subtotl,"Sub Total");
	String TotalAmount = gl.getText(Vype_delivaryOptions.subtotl);
	float f=Float.parseFloat(TotalAmount.substring(1));
	
	
	
	do {
		
		
		gl.clickbutton(Vype_Cart.btnAdd, "+");
		Thread.sleep(2000);
		String TotalAmount1 = gl.getText(Vype_delivaryOptions.subtotl);
		f = Float.parseFloat(TotalAmount1.substring(1));
		

		
	}while(f < 50);
		
			
			
			
			{
				gl.fnScrollToView(Vype_Cart.btnCheckOut);
				Thread.sleep(5000);
				gl.waitTillElementVisible(Vype_Cart.btnCheckOut);
				Thread.sleep(5000);
				// Click on 'Check Out' button from the Cart Page.
				gl.clickUsingJs(Vype_Cart.btnCheckOut, "Cart Page - Check Out");
				Thread.sleep(5000);
				// Verify that Check Out Page is displayed
				gl.VerifyElementVisible(Vype_CheckOut.pgCheckOut, "Check Out");
				
				Thread.sleep(2000);

				// Click on Home
				gl.VerifyElementVisible(Vype_CommonXpath.weHomeAddress, "Home");
				// String
				// totalAmtPaid=gl.getText(Vype_PlatinumProfileTrigger.cartValueTotal);

				gl.ScrollPageDown();

				Thread.sleep(2000);
			
				// Click on 'Go to delivery' button
				gl.clickUsingJs(Vype_CheckOut.btnGoToDelivery, "Go to delivery");
			
				// shipping subtotal
				{
		         gl.VerifyObjectDisplayed(Vype_delivaryOptions.subtotl, ">>>>>>>>Subtotal value is: " + f + ">>>>>>>>>>>>");
				    Thread.sleep(2000);
			  
				    System.out.println(">>>>>> Subtotal value is "+ f +" >>>>>>>>>");
				
				}
			    
				String str=gl.getText(Vype_delivaryOptions.txtshippingoptions);
				gl.VerifyElementVisible(Vype_delivaryOptions.txtshippingoptions, str);
				
				gl.fnScrollToView(Vype_delivaryOptions.ShipOptions);
                gl.VerifyElementVisible(Vype_delivaryOptions.ShipOptions,"Shipping Options Aviliable");

				List<WebElement> lst =gl.findElementsList(Vype_delivaryOptions.shippingoptions);
				System.out.println("No of delivary options :"+lst.size());
				for(int j=0;j<lst.size();j++)
				{
				String s=lst.get(j).getText();
				System.out.println((j+1)+":"+s);
				gl.VerifyElementVisible(Vype_delivaryOptions.shippingoptions, s);
				
				}
			}
			gl.ScrollPageUp();
			gl.fnScrollToView(Vype_CommonXpath.lnkCartIcon);
	}
	


@Then("^Verifying shipping options when subtotal is above \\$ Seventy Five$")
public void verifying_shipping_options_when_subtotal_is_above_$_Seventy_Five() throws Throwable {
    // Write code here that turns the phrase above into concrete actions

	String TotalAmount = gl.getText(Vype_delivaryOptions.subtotl);
	float f=Float.parseFloat(TotalAmount.substring(1));
	
//	for(int i=1;i>0;){
	do {

		
		gl.clickbutton(Vype_Cart.btnAdd, "+");
		Thread.sleep(2000);
		String TotalAmount1 = gl.getText(Vype_delivaryOptions.subtotl);
		f = Float.parseFloat(TotalAmount1.substring(1));
		
	}while(f < 75);
			
			
			{
				gl.fnScrollToView(Vype_Cart.btnCheckOut);
				Thread.sleep(5000);
				gl.waitTillElementVisible(Vype_Cart.btnCheckOut);
				Thread.sleep(5000);
				// Click on 'Check Out' button from the Cart Page.
				gl.clickUsingJs(Vype_Cart.btnCheckOut, "Cart Page - Check Out");
				Thread.sleep(5000);
				// Verify that Check Out Page is displayed
				gl.VerifyElementVisible(Vype_CheckOut.pgCheckOut, "Check Out");
				
				Thread.sleep(2000);

				// Click on Home
				gl.VerifyElementVisible(Vype_CommonXpath.weHomeAddress, "Home");
				// String
				// totalAmtPaid=gl.getText(Vype_PlatinumProfileTrigger.cartValueTotal);

				gl.ScrollPageDown();

				Thread.sleep(2000);
			
				// Click on 'Go to delivery' button
				gl.clickUsingJs(Vype_CheckOut.btnGoToDelivery, "Go to delivery");
			
				// shipping subtotal
				{
		         gl.VerifyObjectDisplayed(Vype_delivaryOptions.subtotl, ">>>>>>>>Subtotal value is: " + f + ">>>>>>>>>>>>");
				    Thread.sleep(2000);
			  
				    System.out.println(">>>>>> Subtotal value is "+ f +" >>>>>>>>>");
				
				}
				String str=gl.getText(Vype_delivaryOptions.txtshippingoptions);
				gl.VerifyElementVisible(Vype_delivaryOptions.txtshippingoptions, str);
				
				gl.fnScrollToView(Vype_delivaryOptions.ShipOptions);
                gl.VerifyElementVisible(Vype_delivaryOptions.ShipOptions,"Shipping Options Aviliable");

				List<WebElement> lst =gl.findElementsList(Vype_delivaryOptions.shippingoptions);
				System.out.println("No of delivary options :"+lst.size());
				for(int j=0;j<lst.size();j++)
				{
				String s=lst.get(j).getText();
				System.out.println((j+1)+":"+s);
				gl.VerifyElementVisible(Vype_delivaryOptions.shippingoptions, s);
				}
			}
			}
}
//	    else 
//	    {
//			System.out.println("No need to add more quantity");
//			break;
		

	
	
	/*
	@Then("^Verify the price in cart$")
	public void verify_the_price_in_cart() throws Throwable {

		function.hoverCartAndClickViewCart();
		//Verify the product is added in cart page
		String products=gl.getText(Vype_CommonXpath.pgcart);
		System.out.println(products);
		gl.VerifyElementVisible(Vype_CommonXpath.pgcart,products);

		//verify the purchase
		String Subtotal=gl.getText(Vype_delivaryOptions.subtotl);
		float f = Float.parseFloat(Subtotal.substring(1));
		Thread.sleep(2000);
		
		if(f<25) {	
			gl.VerifyObjectDisplayed(Vype_delivaryOptions.subtotl, ">>>>>>>>Subtotal value is: " + f + ">>>>>>>>>>>>");
		Thread.sleep(2000);
	    }
		
		else if(f>25 && f<49){
			gl.VerifyObjectDisplayed(Vype_delivaryOptions.subtotl, ">>>>>>>>Subtotal value is: " + f + ">>>>>>>>>>>>");
		}
		else if(f>50 && f<75) {
			gl.VerifyObjectDisplayed(Vype_delivaryOptions.subtotl, ">>>>>>>>Subtotal value is: " + f + ">>>>>>>>>>>>");
        }
		else
		{
			gl.VerifyObjectDisplayed(Vype_delivaryOptions.subtotl, ">>>>>>>>Subtotal value is: " + f + ">>>>>>>>>>>>");
        }
	
	}
	
	
	*/
	

/*
@Then("^Click on CheckOut button and Verify Delivery Option$")
	public void click_on_CheckOut_button_and_Verify_Delivery_Option() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
		gl.fnScrollToView(Vype_Cart.btnCheckOut);
		Thread.sleep(50000);
		gl.waitTillElementVisible(Vype_Cart.btnCheckOut);
		Thread.sleep(50000);
		// Click on 'Check Out' button from the Cart Page.
		gl.clickUsingJs(Vype_Cart.btnCheckOut, "Cart Page - Check Out");
		Thread.sleep(50000);
		// Verify that Check Out Page is displayed
		gl.VerifyElementVisible(Vype_CheckOut.pgCheckOut, "Check Out");

		Thread.sleep(2000);

		// Click on Home
		gl.VerifyElementVisible(Vype_CommonXpath.weHomeAddress, "Home");
		// String
		// totalAmtPaid=gl.getText(Vype_PlatinumProfileTrigger.cartValueTotal);

		gl.ScrollPageDown();

		Thread.sleep(2000);
		
		// Click on 'Go to delivery' button
		gl.clickUsingJs(Vype_CheckOut.btnGoToDelivery, "Go to delivery");
		
		String str=gl.getText(Vype_delivaryOptions.txtshippingoptions);
		gl.VerifyElementVisible(Vype_delivaryOptions.txtshippingoptions, str);

		List<WebElement> lst =gl.findElementsList(Vype_delivaryOptions.shippingoptions);
		System.out.println("No of delivary options :"+lst.size());
		for(int i=0;i<lst.size();i++)
		{
			String s=lst.get(i).getText();
			System.out.println((i+1)+":"+s);
			gl.VerifyElementVisible(Vype_delivaryOptions.shippingoptions, s);
		}
}

	@Then("^Increase Quantity\"([^\"]*)\" for the product in the cart$")
	public void increase_quantity_and_the_price_for_the_product_in_the_cart(int quantity) throws Throwable {
	// Write code here that turns the phrase above into concrete actions
  String subtotal=gl.getText(Vype_delivaryOptions.subtotl);
  String subtotalNum = subtotal.substring(1,6); //  Ex :14.99
		
 		
  float sub=Float.parseFloat(subtotalNum); //     Ex: 14.99
//	for (int i = 0; i< quantity; i++)
//	{
//	gl.clickUsingJs(Vype_CommonXpath.btnQtyIncrement, "Add Product");
		
//	}
	
	do {
		quantity++;
		
		gl.clickUsingJs(Vype_CommonXpath.btnQtyIncrement, "Add Product");
		
	}while(sub > 50 && sub < 75);
	
	
	}



@Then("^Increase Quantity\"([^\"]*)\" for the Product in the cart$")
public void increase_quantity_and_the_price_for_the_Product_in_the_cart(int quantity) throws Throwable {
// Write code here that turns the phrase above into concrete actions
String subtotal=gl.getText(Vype_delivaryOptions.subtotl);
String subtotalNum = subtotal.substring(1,6); //  Ex :14.99
	
	
float sub=Float.parseFloat(subtotalNum); //     Ex: 14.99

do {
	quantity++;
	
	gl.clickUsingJs(Vype_CommonXpath.btnQtyIncrement, "Add Product");
	
}while(sub > 75 && sub < 100);


}
}
*/




