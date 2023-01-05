package stepDefinitions;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.rai.framework.BaseClass;
import com.rai.framework.CommonFunctions;
import com.rai.framework.RAI_Desktop_Utility_Functions;

import ch.qos.logback.core.net.SyslogOutputStream;
import cucumber.api.java.en.*;
import goVype_Properties.*;
import junit.framework.Assert;

public class ClickandCollect extends BaseClass {

	String OrderValue;
	String username;
	String str;
	String status;
	String timeremaining;
	int time;
	String Action;
	String S;

	RAI_Desktop_Utility_Functions gl = new RAI_Desktop_Utility_Functions();
	CommonFunctions function = new CommonFunctions(gl);

	@When("^User selects required flavor \"([^\"]*)\" with required quantity \"([^\"]*)\" add to the cart$")
	public void user_selects_required_flavor_with_required_quantity_add_to_the_cart(String flavor, String quantity) throws Throwable {

		//scroll to product image
		gl.fnScrollToView(Vype_ClickandCollect.imgflavor(flavor));
		int q=Integer.parseInt(quantity);

		gl.clickUsingJs(Vype_ClickandCollect.btnquantity1(flavor), " - ");
		//click on quantity picker
		for(int i=0;i<q;i++)
		{
			gl.clickUsingJs(Vype_ClickandCollect.btnquantity(flavor), " + ");
		}

		//add to cart
		gl.clickUsingJs(Vype_ClickandCollect.btnaddtocart(flavor), "Add ");
	}

	@When("^User selects required flavors \"([^\"]*)\" with required quantity \"([^\"]*)\" add to the cart$")
	public void user_selects_required_flavors_with_required_quantity_add_to_the_cart(String flavors, String quantity) throws Throwable {

		int q=Integer.parseInt(quantity);
		S = flavors;
		List<String> myList = new ArrayList<String>(Arrays.asList(S.split(","))); 
		for (String flavor : myList) {  
			Thread.sleep(2000);


			//scroll to product image
			gl.fnScrollToView(Vype_ClickandCollect.imgflavor(flavor));


			//click on quantity picker
			for(int i=0;i<q;i++)
			{
				gl.click(Vype_ClickandCollect.btnquantity(flavor), " + ");
			}


			//add to cart
			gl.clickUsingJs(Vype_ClickandCollect.btnaddtocart(flavor), "Add ");     

		}
	}


	@Then("^verify Order Number,Customer Name ,flavors \"([^\"]*)\"$")
	public void verify_Order_Number_Customer_Name_flavors(String flavors) throws Throwable {

		//status
		List<WebElement> list=gl.findElementsList(Vype_ClickandCollect.allstatus);
		for(int i=0;i<list.size();i++)
		{
			String allstatus=list.get(i).getText();
			gl.VerifyElementPresent(Vype_ClickandCollect.allstatus, allstatus);
		}

		//verify Reject button
		gl.VerifyElementPresent(Vype_ClickandCollect.btnreject, "reject button ");

		//verify Accept button
		gl.VerifyElementVisible(Vype_ClickandCollect.btnacceptorder, "Accept button");

		String Str = flavors;
		List<WebElement> lst=gl.findElementsList(Vype_ClickandCollect.allproducts);

		for(int i=0;i<lst.size();i++)

		{
			List<String> myList = new ArrayList<String>(Arrays.asList(Str.split(","))); 
			for (String flavor : myList) {  
				Thread.sleep(2000);
				String Xpath="//*[contains(text(),'"+flavor+"')]";
				gl.VerifyElementPresent(By.xpath(Xpath),flavor);

			}

		}


		//verify customer name correct
		gl.VerifyElementPresent(Vype_ClickandCollect.Customername(username), username);

	}


	@When("^select Accessory with type \"([^\"]*)\" and colour with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void select_Accessory_with_type_and_colour_with_and(String accessory, String colour, String count) throws Throwable {

		int q=Integer.parseInt(count);
		gl.clickUsingJs(Vype_ClickandCollect.Accessorytype(accessory), accessory);

		boolean b=gl.verifyobjectisnotavailable(Vype_ClickandCollect.lnkcolor(colour));

		if(b==false)
		{
			//click on colour
			gl.clickUsingJs(Vype_ClickandCollect.lnkcolor(colour),colour);
		}
		if(b==true)
		{

		}

		//click on minus
		gl.clickUsingJs(Vype_ClickandCollect.btnminus, "-");

		//add count
		for(int i=0;i<q;i++)
		{
			gl.clickUsingJs(Vype_ClickandCollect.btnplus, "+");
		}

		//add to cart
		gl.clickUsingJs(Vype_ClickandCollect.btnaddtocart, "Add to cart");



	}

	@When("^user selects device \"([^\"]*)\" from either Core Collections or elements and add to cart$")
	public void user_selects_device_from_either_Core_Collections_or_elements_and_add_to_cart(String devicecolour) throws Throwable {

		//click on core collections
		gl.clickUsingJs(Vype_ClickandCollect.lnkcorecollections, "Core collections");

		boolean b=gl.verifyobjectisnotavailable(Vype_ClickandCollect.btndevicecolour(devicecolour));

		if(b==false){

			//select device colour
			gl.clickUsingJs(Vype_ClickandCollect.btndevicecolour(devicecolour), devicecolour);

			//add to cart
			gl.clickUsingJs(Vype_ClickandCollect.btnaddtocart, "Add to cart");
		}
		if(b==true){

			gl.browserBack();

			//click on elements collection
			gl.clickUsingJs(Vype_ClickandCollect.lnkelementscollection, "Elements collections");

			//select device colour
			gl.clickUsingJs(Vype_ClickandCollect.btndevicecolour(devicecolour), devicecolour);

			//add to cart
			gl.clickUsingJs(Vype_ClickandCollect.btnaddtocart, "Add to cart");
		}

	}

	@Then("^Scroll to our core collections and click on Shopnow$")
	public void scroll_to_our_core_collections_and_click_on_Shopnow() throws Throwable {

		//scroll to core collections
		Thread.sleep(10000);
		gl.fnScrollToView(Vype_CommonXpath.txtcorecollection);

		//verify core collections text
		String str1=gl.getText(Vype_CommonXpath.txtcorecollection);

		//verify core collections text
		gl.VerifyObjectDisplayed(Vype_CommonXpath.txtcorecollection,"Core Collection");

		System.out.println(str1);

		//click on shop now
		gl.clickUsingJs(Vype_CommonXpath.btnshopNow, "Shop now");
	}

	@When("^click on Buynow in skins page and select desired \"([^\"]*)\"$")
	public void click_on_Buynow_in_skins_page_and_select_desired(String Skin) throws Throwable {

		//click on buy now
		gl.clickbutton(Vype_CommonXpath.btnbuynow, "buy now");

		//skin core collections
		gl.clickUsingJs(Vype_ClickandCollect.skincorecollections,"Core collections ");

		// Select any skin colour
		gl.clickbuttonUsingSelenium(Vype_CommonXpath.skintype(Skin), "Skin selected is: " + Skin);
	}

	@And("^select desired quantity \"([^\"]*)\" and click on add to cart$")
	public void select_desired_quantity_and_click_on_add_to_cart(String quantity) throws Throwable {

		int count=Integer.parseInt(quantity);

		Thread.sleep(5000);
		//click on minus button
		gl.clickUsingJs(Vype_CommonXpath.btnminus, "- ");

		for(int i=0;i<count;i++)
		{
			gl.clickbutton(Vype_CommonXpath.btnPlus, "+ ");
		}

		//click on buy now
		gl.clickbutton(Vype_CommonXpath.btnBuynow, "Buy now");

	}

	@SuppressWarnings("deprecation")
	@Then("^verify Order Number,Customer Name ,Products$")
	public void verify_Order_Number_Customer_Name_Products() throws Throwable {


		//status
		List<WebElement> list=gl.findElementsList(Vype_ClickandCollect.allstatus);
		for(int i=0;i<list.size();i++)
		{
			String allstatus=list.get(i).getText();
			gl.VerifyElementPresent(Vype_ClickandCollect.allstatus, allstatus);
		}

		//verify Reject button
		gl.VerifyElementPresent(Vype_ClickandCollect.btnreject, "reject button ");

		//verify Accept button
		gl.VerifyElementVisible(Vype_ClickandCollect.btnacceptorder, "Accept button");



		String flavorPresent=gl.getText(Vype_ClickandCollect.solodevice);
		boolean b=flavorPresent.contains("Solo Device");
		if(b==true)
		{
			System.out.println("product ordered is displayed correct");
			gl.VerifyElementVisible(Vype_ClickandCollect.solodevice, "Solo Device");
		}
		else
		{
			Assert.fail("product is incorrect");
		}


		//verify customer name correct
		gl.VerifyElementPresent(Vype_ClickandCollect.Customername(username), username);



	}


	@When("^Click on checkout and verify checkoutpage$")
	public void click_on_checkout_and_verify_checkoutpage() throws Throwable {

		Thread.sleep(6000);
		
		gl.fnScrollToView(Vype_Cart.btnCheckOut);
		//Click on 'Check Out' button from the Cart Page.
		gl.clickUsingJs(Vype_Cart.btnCheckOut, "Cart Page - Check Out");
		Thread.sleep(2000);
		//Verify that Check Out Page is displayed
		gl.VerifyPageDisplayed(Vype_CheckOut.pgCheckOut, "Check Out");
	}


	@When("^Click on click and Collect option$")
	public void click_on_click_and_Collect_option() throws Throwable {

		//click on click and collect
		gl.clickUsingJs(Vype_ClickandCollect.btnclickandcollect, "click and collect");
	}

	@Then("^Verify postal code text box is displayed$")
	public void verify_postal_code_text_box_is_displayed() throws Throwable {

		gl.fnScrollToView(Vype_ClickandCollect.postalcode);
		//verify postal code text box
		gl.VerifyElementVisible(Vype_ClickandCollect.postalcode, "postal code text box ");

		Thread.sleep(25000);
		//verify search button
		gl.VerifyElementVisible(Vype_ClickandCollect.txtsearch, "search");

		//clear default zipcode
		WebElement e= rdriver.findElement(Vype_ClickandCollect.postalcode);
		e.clear();

		//verify search button is disabled
		//gl.isDisabled(Vype_ClickandCollect.txtsearch,"search ");

	}


	@Then("^Enter postal code \"([^\"]*)\" and click on search button$")
	public void enter_postal_code_and_click_on_search_button(String postalcode) throws Throwable {

		//enter zipcode
		gl.inputText(Vype_ClickandCollect.postalcode, "Postal code", postalcode);
		Thread.sleep(6000);

		//verify search button is enabled
		gl.isEnabled(Vype_ClickandCollect.txtsearch,"search ");

		//click on search
		gl.clickbutton(Vype_ClickandCollect.txtsearch,"search ");


	}

	@Then("^Verify retail stores addresses and distances$")
	public void verify_retail_stores_addresses_and_distances() throws Throwable {

		//-------------verify storenames and store list----------//
		List<WebElement> list1=gl.findElementsList(Vype_ClickandCollect.storelist);
		List<WebElement> list2=gl.findElementsList(Vype_ClickandCollect.storesdistances);
		List<WebElement> list3=gl.findElementsList(Vype_ClickandCollect.storeindicator);
		for(int i=0;i<list1.size();i++)
		{
			String storename =list1.get(i).getText();
			String storedistance=list2.get(i).getText();
			int length=storename.length();
			String storepincode=storename.substring((length-7),(length));

			System.out.println((i+1)+" Store name "+storename);
			System.out.println("Store distance "+storedistance);
			gl.VerifyElementVisible(Vype_ClickandCollect.storelist, storename);
			gl.VerifyElementVisible(Vype_ClickandCollect.storesdistances, storedistance);
			if(storename.contains("CONSIGNMENT - VUSE TORONTO ? CLICK & COLLECT"));
			{
				list3.get(i).click();
			}
			String storepincodexpath="//*[contains(text(),'"+storepincode+"')]";
			gl.fnScrollToView(By.xpath(storepincodexpath));



		}



	}

	/*@Then("^verify retail store is selected$")
	public void verify_retail_store_is_selected() throws Throwable {

		List<WebElement> list1=gl.findElementsList(Vype_ClickandCollect.storeindicator);

		List<WebElement> list2=gl.findElementsList(Vype_ClickandCollect.storesdistances);

		for(int i=0;i<list1.size();i++)
		{

			if(list1.get(i).isSelected()==true)
			{
				str=list2.get(i).getText();
				System.out.println("Selected store is "+str);
				gl.VerifyElementVisible(Vype_ClickandCollect.storetext, str);
				break;
			}

		}


	}*/


	@Then("^Click on go to delivery and verify delivery option$")
	public void click_on_go_to_delivary_and_verify_delivary_option() throws Throwable {

		//go to delivary
		gl.clickUsingJs(Vype_CheckOut.btnGoToDelivery,"Go to delivery");


		//gl.fnScrollToView(Vype_ClickandCollect.txtclickandcollect);

		//verify click and collect delivary option
		gl.VerifyElementVisible(Vype_ClickandCollect.txtclickandcollect, "Click and collect delivary option ");

		//free shipping
		gl.VerifyElementVisible(Vype_ClickandCollect.txtfree, "Free ");
	}

	@Then("^Verify order confirmation page for click and collect$")
	public void verify_order_confirmation_page_for_click_and_collect() throws Throwable {
		// String OrderValue="";
		
		 gl.waitTillElementVisible(Vype_CommonXpath.weOrderConfirmation);

		// Verify that Order Confirmation page is displayed
		gl.VerifyPageDisplayed(Vype_CheckOut.pgOrderCofirmation, "Order Cofirmation");

		// Verify the Text 'Thank you for your order!'
		gl.VerifyElementVisible(Vype_CheckOut.weTxtThankYouForYourOrder, "Text 'Thank You For Your Order'");

		// Verify the Text 'We are getting started on your order....'
		//gl.VerifyElementVisible(Vype_CheckOut.weTxtWeAreGettingStarted,
				//"Text 'We are getting started on your order....'");

		// Get the Order Value from the Order Confirmation Page
		OrderValue=gl.getText(Vype_CheckOut.weTxtOrderValue);

		username=gl.getText(Vype_ClickandCollect.user);


		gl.VerifyElementVisible(Vype_CheckOut.weTxtOrderValue, OrderValue);

		System.out.println(">>>>>>"+OrderValue+">>>>>>>>>");
		System.out.println(">>>>>>"+OrderValue.substring(1)+">>>>>>>>>");
		OrderValue=OrderValue.substring(1);

		//updated
		gl.fnScrollToView(Vype_CheckOut.txtdelivarytype);
		String delivary=gl.getText(Vype_CheckOut.txtdelivarytype);
		System.out.println("Delivary type "+ delivary);

		gl.VerifyElementVisible(Vype_CheckOut.txtdelivarytype, delivary);

		String ordersummary=gl.getText(Vype_CheckOut.txtordersummary);

		gl.VerifyElementVisible(Vype_CheckOut.txtordersummary,ordersummary);



	}


	@When("^User launches click and collect url \"([^\"]*)\" in new tab$")
	public void user_launches_click_and_collect_url_in_new_tab(String url) throws Throwable {

		//open new tab
		((JavascriptExecutor) rdriver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(rdriver.getWindowHandles());
		rdriver.switchTo().window(tabs.get(1));

		//launch url
		rdriver.get(url);


	}

	@Then("^Switch to Vuse application$")
	public void switch_to_Vuse_application() throws Throwable {

		ArrayList<String> tabs = new ArrayList<String>(rdriver.getWindowHandles());
		rdriver.switchTo().window(tabs.get(0));
	}

	@Then("^Navigate to orders page and cancel the order that is placed$")
	public void navigate_to_orders_page_and_cancel_the_order_that_is_placed() throws Throwable {

		//Navigate to Account page
		function.navigatetoOrderspage();
		Thread.sleep(3000);

		//Cancel Order
		gl.clickUsingJs(Vype_ClickandCollect.btncancelorder, "Cancel order");

		Thread.sleep(3000);

		//Yes Cancel
		gl.clickUsingJs(Vype_ClickandCollect.yescancel, "Yes Cancel");

		//Click on X
		//gl.clickUsingJs(Vype_ClickandCollect.btnX, "X ");

	}

	@Then("^Switch to C&C application$")
	public void switch_to_C_C_application() throws Throwable {

		ArrayList<String> tabs = new ArrayList<String>(rdriver.getWindowHandles());
		rdriver.switchTo().window(tabs.get(1));
	}

	@SuppressWarnings("deprecation")
	@Then("^Verify Order No ,Status and Customer Name and cancelled status$")
	public void verify_Order_No_Status_and_Customer_Name_and_cancelled_status() throws Throwable {

		//order status
		String s=gl.getText(Vype_ClickandCollect.orderstatuscollected(OrderValue));
		gl.VerifyElementVisible(Vype_ClickandCollect.orderstatuscollected(OrderValue), "Orderstatus ");

		Assert.assertEquals(s,  "Cancelled");

		String Customername=gl.getText(Vype_ClickandCollect.Custmernamecollected(OrderValue));
		Assert.assertEquals(Customername,  username);

		//Customer name
		gl.VerifyElementVisible(Vype_ClickandCollect.Custmernamecollected(OrderValue), "Customer name status ");
	}


	@And("^Enters username \"([^\"]*)\" and password \"([^\"]*)\" and click on login in C&C retailer app$")
	public void enters_username_and_password_and_clicks_on_login(String UN, String pwd) throws Throwable {

		// Verify that user name text field is displayed
		gl.VerifyElementVisible(Vype_CommonXpath.txtUsername, "Password textfield on Login Modal");

		// Enter User name in the user name text field
		gl.inputText(Vype_CommonXpath.txtUsername, "Username textfield on Login Modal", UN);

		// Enter Password in the password text field
		gl.inputPasswordEncrypted(Vype_CommonXpath.txtPassword, "Password textfield on Login Modal", pwd);

		// Click on Login button
		gl.clickbutton(Vype_CommonXpath.btnLogin, "Login button");

	}

	@When("^Click on orders and verify orders screen$")
	public void click_on_orders_and_verify_order() throws Throwable {

		//click on orders tab
		gl.clickUsingJs(Vype_ClickandCollect.txtorder, "order");

		//orders screen
		gl.VerifyElementPresent(Vype_ClickandCollect.pgorders, "Orders ");


	}


	@Then("^Verify Order Number,Type,Customer,Status,Time Remaining,Status and Actions navigations$")
	public void verify_order_number_and_name_of_user() throws Throwable {

		//String customer=gl.getText(Vype_ClickandCollect.customer);


		//Assert.assertEquals("Customer name is matched ",customer, username);
	//	gl.VerifyElementPresent(Vype_ClickandCollect.customer, customer);

		String ordernum=gl.getText(Vype_ClickandCollect.ordernum);
		//Assert.assertEquals("order number is matched ",ordernum, OrderValue);

		gl.VerifyElementPresent(Vype_ClickandCollect.ordernum, ordernum);
		
		gl.VerifyElementPresent(Vype_ClickandCollect.typeofcourier, "type of courier");

		
		status=gl.getText(Vype_ClickandCollect.txtstatus);
		Assert.assertEquals(status,"Pending");
		gl.VerifyElementPresent(Vype_ClickandCollect.txtstatus, status);

		gl.VerifyElementPresent(Vype_ClickandCollect.timeremaining,"time remaining");

		/*timeremaining=gl.getText(Vype_ClickandCollect.timeremaining);

		timeremaining=timeremaining.substring(0, 2);
		time=Integer.parseInt(timeremaining);
		if(time>15)
		{
			System.out.println("Time greater than 15 min"+time);
			Assert.fail("Time greater than 15 min");

		}
		else
		{
			System.out.println("Time is "+time+"Min left ");
			gl.VerifyElementVisible(Vype_ClickandCollect.timeremaining, timeremaining);

		}*/

		Thread.sleep(10000);
		String timesinceorder=gl.getText(Vype_ClickandCollect.timesinceorder);
		gl.VerifyElementVisible(Vype_ClickandCollect.timesinceorder, timesinceorder);



		Action=gl.getText(Vype_ClickandCollect.Action);
		Assert.assertEquals(Action, "Accept order");



	}



	@And("^Click on Reject button$")
	public void click_on_Reject_button() throws Throwable {

		//click on Reject
		gl.clickbutton(Vype_ClickandCollect.btnreject, "Reject button");


	}


	@Then("^Verify Rejection confirmation popup is displayed and text box asking for a reason$")
	public void verify_confirmation_popup_is_displayed_with_warning_message_and_text_box_asking_for_a_reason() throws Throwable {

		//verify pop up label
		String s=gl.getText(Vype_ClickandCollect.rejectorderpopupmsg);
		gl.VerifyElementVisible(Vype_ClickandCollect.rejectorderpopupmsg, s);

		//verify textbox label
		String s1=gl.getText(Vype_ClickandCollect.lblrejecttext);
		gl.VerifyElementVisible(Vype_ClickandCollect.lblrejecttext, s1);

		//verify text box
		gl.VerifyElementVisible(Vype_ClickandCollect.inputtext, "Reason for cancel ");

		//verify cancel button
		gl.VerifyElementVisible(Vype_ClickandCollect.btncancel, "Cancel button ");

		//verify submit
		gl.VerifyElementVisible(Vype_ClickandCollect.btnsubmit, "Submit button ");

	}

	@Then("^Click on submit button without entering reason and verify error message is displayed$")
	public void click_on_submit_button_without_entering_reason_and_verify_error_messagem_displayed() throws Throwable {

		//verify cancel button
		gl.clickUsingJs(Vype_ClickandCollect.btncancel, "Cancel button ");


		//click on Reject
		gl.clickUsingJs(Vype_ClickandCollect.btnreject, "Reject button");

		//click submit
		gl.clickbutton(Vype_ClickandCollect.btnsubmit, "Submit button ");


		//verify error message
		String msg=gl.getText(Vype_ClickandCollect.txterror);
		gl.VerifyElementVisible(Vype_ClickandCollect.txterror, "error ");


	}


	@And("^Enter Reason \"([^\"]*)\" and click on submit button and verify rejected text$")
	public void enter_Reason_and_click_on_submit_button_and_verify_rejected_text(String reason) throws Throwable {


		//enter valid reason
		gl.inputText(Vype_ClickandCollect.inputtext, "Reason text", reason);

		//click submit
		gl.clickbutton(Vype_ClickandCollect.btnsubmit, "Submit button ");

		//verify status
		String rejected=gl.getText(Vype_ClickandCollect.txtStatusupdatedaftercollected(OrderValue));
		gl.VerifyElementPresent(Vype_ClickandCollect.txtStatusupdatedaftercollected(OrderValue),rejected);



	}

	@Then("^Click on Rejected tab$")
	public void click_on_Rejected_tab() throws Throwable {

		//click on rejected
		gl.clickUsingJs(Vype_ClickandCollect.lnkrejected, "Rejected");

	}



	@And("^Click on accept order to change the status to accepted$")
	public void click_on_accept_order() throws Throwable {

		//click on accepted
		gl.clickbutton(Vype_ClickandCollect.btnacceptorder, "Accept button");

		//Ready to pick option
		gl.VerifyElementPresent(Vype_ClickandCollect.btnreadytopickup, "Ready to pick up");

		//verify status
		gl.VerifyElementPresent(Vype_ClickandCollect.txtStatusupdated(OrderValue), " Accepted");



	}



	@Then("^Verify Order Number,Customer Name ,Products Quantity \"([^\"]*)\"$")
	public void click_on_arrow_button_and_verify_order_number_customer_name_product_and_quantity(String quantity) throws Throwable {



		//status
		List<WebElement> list=gl.findElementsList(Vype_ClickandCollect.allstatus);
		for(int i=0;i<list.size();i++)
		{
			String allstatus=list.get(i).getText();
			gl.VerifyElementPresent(Vype_ClickandCollect.allstatus, allstatus);
		}

		//verify Reject button
		gl.VerifyElementPresent(Vype_ClickandCollect.btnreject, "reject button ");

		//verify Accept button
		gl.VerifyElementVisible(Vype_ClickandCollect.btnacceptorder, "Accept button");



		/*String flavorPresent=gl.getText(Vype_ClickandCollect.flavorpresent);
		boolean b=flavorPresent.contains(flavor);
		if(b==true)
		{
			System.out.println("product ordered is displayed correct");
			gl.VerifyElementVisible(Vype_ClickandCollect.flavorpresent, flavor);
		}
		else
		{
			Assert.fail("product is incorrect");
		}*/

		List<WebElement> list1=gl.findElementsList(Vype_ClickandCollect.flavorpresent);
		System.out.println("Ordered Products are ");
		for(int i=0;i<list1.size();i++)
		{
			String str=list1.get(i).getText();
			System.out.println(str);
			gl.VerifyElementVisible(Vype_ClickandCollect.listlines(i), str);
		}
		
		
		
		//verify quantity displayed correct
		gl.VerifyElementPresent(Vype_ClickandCollect.productcount(quantity), quantity);

		//verify customer name correct
		//gl.VerifyElementPresent(Vype_ClickandCollect.Customername(username), username);




	}



	@Then("^Verify Order Number,Customer Name ,Products \"([^\"]*)\" and Flavor \"([^\"]*)\"$")
	public void verify_Order_Number_Customer_Name_Products_and_Flavor(String devicecolour, String flavor) throws Throwable {
		//status
		List<WebElement> list=gl.findElementsList(Vype_ClickandCollect.allstatus);
		for(int i=0;i<list.size();i++)
		{
			String allstatus=list.get(i).getText();
			gl.VerifyElementPresent(Vype_ClickandCollect.allstatus, allstatus);
		}

		//verify Reject button
		gl.VerifyElementPresent(Vype_ClickandCollect.btnreject, "reject button ");

		//verify Accept button
		gl.VerifyElementVisible(Vype_ClickandCollect.btnacceptorder, "Accept button");



		String flavorPresent=gl.getText(Vype_ClickandCollect.solodeviceflavor);
		boolean b=flavorPresent.contains(flavor);
		if(b==true)
		{
			System.out.println("Flavor ordered is displayed correct");
			gl.VerifyElementVisible(Vype_ClickandCollect.solodeviceflavor, flavor);
		}
		else
		{
			Assert.fail("Product is incorrect");
		}

		String device=gl.getText(Vype_ClickandCollect.solodevice);
		boolean b1=device.contains(devicecolour);
		if(b1==true)
		{
			System.out.println("Device ordered is displayed correct");
			gl.VerifyElementVisible(Vype_ClickandCollect.solodevice, flavor);
		}
		else
		{
			Assert.fail("Device is incorrect");
		}



		//verify customer name correct
		gl.VerifyElementPresent(Vype_ClickandCollect.Customername(username), username);

	}





	@And("^Click on close button and verify status changed to ready to pick and verify time remaining$")
	public void click_on_close_button_and_verify_status_changed_to_ready_to_pick_and_verify_time_remaining() throws Throwable {

		//click on close
		gl.clickUsingJs(Vype_ClickandCollect.btnclose(OrderValue)," X ");

		status=gl.getText(Vype_ClickandCollect.txtstatus);
		Assert.assertEquals(status,"Accepted");
		gl.VerifyElementPresent(Vype_ClickandCollect.txtstatus, status);

		/*timeremaining=gl.getText(Vype_ClickandCollect.timeremaining);
		Assert.assertEquals(timeremaining, "2 hours");
		 */
		Action=gl.getText(Vype_ClickandCollect.Action);
		Assert.assertEquals(Action, "Ready For Pickup");





	}



	@And("^Click on arrow button$")
	public void click_on_arrow_button() throws Throwable {

		//click on arrow button
		gl.clickbutton(Vype_ClickandCollect.arrowbtn, "-> ");
	}

	@And("^Click on Ready to pickup and verify status as Ready to pickup$")
	public void click_on_Ready_to_pickup_and_verify_status_as_Ready_to_pickup() throws Throwable {

		//ready to pick up
		gl.clickbutton(Vype_ClickandCollect.btnreadytopickup, "Ready to pick up");

		//verify status
		gl.VerifyElementPresent(Vype_ClickandCollect.txtStatusupdated(OrderValue), " Ready to pick up");

		//click on close
		gl.clickUsingJs(Vype_ClickandCollect.btnclose(OrderValue)," X ");


		/*String timeremaining1=gl.getText(Vype_ClickandCollect.timeremaining);
		Assert.assertEquals(timeremaining1, "3 days");*/

		Action=gl.getText(Vype_ClickandCollect.Action);
		Assert.assertEquals(Action, "Mark as collected");
	}

	@Then("^Click on Mark as Collected and verify status as Collected$")
	public void click_on_Mark_as_Collected_and_verify_status_as_Ready_to_pickup() throws Throwable {

		//click on collected button
		gl.clickbutton(Vype_ClickandCollect.btnmarkascollected(OrderValue), "mark as collected");


		Thread.sleep(5000);
		//verify status
		gl.VerifyElementPresent(Vype_ClickandCollect.txtStatusupdatedaftercollected(OrderValue), " Collected");
	}

	@When("^Click on close$")
	public void click_on_close() throws Throwable {

		//click on close
		gl.clickUsingJs(Vype_ClickandCollect.btnclosecollected(OrderValue)," X ");
	}

	@Then("^Verify order no is not displayed under under pending tab$")
	public void verify_order_no_is_not_displayed_under_under_pending_tab() throws Throwable {


		Thread.sleep(5000);
		//verify order in pending page
		gl.verifyobjectisnotavailable(Vype_ClickandCollect.orderstatus(OrderValue),OrderValue);

	}


	@And("^Click on collected tab$")
	public void click_on_collected_tab() throws Throwable {

		//collected tab
		gl.clickbutton(Vype_ClickandCollect.lnkcollected, "Collected");
	}

	@Then("^Verify Order No ,Status and Customer Name$")
	public void verify_order_no_status_and_customer_name() throws Throwable {

		//order status
		gl.VerifyElementVisible(Vype_ClickandCollect.orderstatuscollected(OrderValue), "Orderstatus ");


		String Customername=gl.getText(Vype_ClickandCollect.Custmernamecollected(OrderValue));
		Assert.assertEquals(Customername,  username);

		//Customer name
		gl.VerifyElementVisible(Vype_ClickandCollect.Custmernamecollected(OrderValue), "Customer name status ");


	}

	/*@When("^user engrave the device by selecting DeviceColour \"([^\"]*)\", PatternName \"([^\"]*)\",TextDirection\"([^\"]*)\",FontStyle \"([^\"]*)\",Text\"([^\"]*)\" from engraving$")
	public void user_engrave_the_device_by_selecting_DeviceColour_PatternName_TextDirection_FontStyle_Text_and_FirstName_from_engraving(String devicecolour, String patternName, String TextDirection, String FontStyle, String Text, String arg6) throws Throwable {

		gl.fnScrollToView(Vype_CommonXpath.btnEngravedDeviceBuyNow);
		// Click the buy now button of engravable
		gl.clickbutton(Vype_CommonXpath.btnEngravedDeviceBuyNow, "Engraving");

		gl.VerifyObjectDisplayed(Vype_CommonXpath.pgengravingdevice, "engravable page is opened");

		gl.clickUsingJs(Vype_CommonXpath.btnelementcollection," Elements Collection");

		boolean b=gl.verifyobjectisnotavailable(Vype_CommonXpath.btndevicecolour(devicecolour));

		if(b==false)
		{
			gl.clickUsingJs(Vype_CommonXpath.btndevicecolour(devicecolour), "colour selected is:" + devicecolour);

		}
		if(b==true)
		{
			gl.clickUsingJs(Vype_CommonXpath.txtelementcollection, "Elements collection");

			gl.clickUsingJs(Vype_CommonXpath.btndevicecolour(devicecolour), "colour selected is:" + devicecolour);
		}



		// CLick on Pattern

		gl.clickUsingJs(Vype_CommonXpath.btnPattern, "Pattern");



		// Select pattern
		gl.clickUsingJs(Vype_CommonXpath.btpattern(patternName), "Device pattern name is: " + patternName);
		String Pattern = gl.getText(Vype_CommonXpath.btpattern(patternName));
		System.out.println("Device pattern is: " + Pattern);

		// CLick on Add Pattern button
		gl.clickbuttonUsingSelenium(Vype_CommonXpath.btnAddPattern, "Add Pattern");


		// Click on Text
		gl.clickUsingJs(Vype_CommonXpath.btnText, "Text");

		// Select direction
		gl.clickUsingJs(Vype_CommonXpath.btnVertical(TextDirection),
				"Text direction selected is: " + TextDirection);
		String Direction = gl.getText(Vype_CommonXpath.btnVertical(TextDirection));
		System.out.println("Text direction is: " + Direction);

		// Select Font style
		gl.clickUsingJs(Vype_CommonXpath.btnFontStyle(FontStyle), "Font style is: " + FontStyle);
		String FontStyle1 = gl.getText(Vype_CommonXpath.btnFontStyle(FontStyle));
		System.out.println("Font style is: " + FontStyle1);



		// Enter your text
		gl.inputText(Vype_CommonXpath.txtEnterText, "Enter your text field", Text);

		// Click on Add Text button
		gl.clickbuttonUsingSelenium(Vype_CommonXpath.btnAddText, "Add Text");

		// Click on Add Engraving button
		gl.fnScrollToView(Vype_CommonXpath.btnAddEngraving);
		gl.clickUsingJs(Vype_CommonXpath.btnAddEngraving, "Add Engraving ");





	}

	 */

	@When("^User engrave the device by selecting DeviceColour \"([^\"]*)\", PatternName \"([^\"]*)\",TextDirection\"([^\"]*)\",FontStyle \"([^\"]*)\",Text\"([^\"]*)\" from engraving$")
	public void user_engrave_the_device_by_selecting_DeviceColour_PatternName_TextDirection_FontStyle_Text_from_engraving(String devicecolour, String patternName, String TextDirection, String FontStyle, String Text) throws Throwable {


		gl.fnScrollToView(Vype_CommonXpath.btnEngravedDeviceBuyNow);
		// Click the buy now button of engravable
		gl.clickbutton(Vype_CommonXpath.btnEngravedDeviceBuyNow, "Engraving");

		gl.VerifyObjectDisplayed(Vype_CommonXpath.pgengravingdevice, "engravable page is opened");

		//gl.clickUsingJs(Vype_CommonXpath.btnelementcollection," Elements Collection");

		boolean b=gl.verifyobjectisnotavailable(Vype_CommonXpath.btndevicecolour(devicecolour));

		if(b==false)
		{
			gl.clickUsingJs(Vype_CommonXpath.btndevicecolour(devicecolour), "colour selected is:" + devicecolour);

		}
		if(b==true)
		{
			gl.clickUsingJs(Vype_ClickandCollect.txtelementscollection, "Elements collection");

			gl.clickUsingJs(Vype_CommonXpath.btndevicecolour(devicecolour), "colour selected is:" + devicecolour);
		}

		gl.fnScrollToView(Vype_CommonXpath.btnPattern);

		// CLick on Pattern

		gl.clickUsingJs(Vype_CommonXpath.btnPattern, "Pattern");



		// Select pattern
		gl.clickUsingJs(Vype_CommonXpath.btpattern(patternName), "Device pattern name is: " + patternName);
		String Pattern = gl.getText(Vype_CommonXpath.btpattern(patternName));
		System.out.println("Device pattern is: " + Pattern);

		// CLick on Add Pattern button
		gl.clickbuttonUsingSelenium(Vype_CommonXpath.btnAddPattern, "Add Pattern");


		// Click on Text
		gl.clickUsingJs(Vype_CommonXpath.btnText, "Text");

		// Select direction
		gl.clickUsingJs(Vype_CommonXpath.btnVertical(TextDirection),
				"Text direction selected is: " + TextDirection);
		String Direction = gl.getText(Vype_CommonXpath.btnVertical(TextDirection));
		System.out.println("Text direction is: " + Direction);

		// Select Font style
		gl.fnScrollToView(Vype_CommonXpath.btnFontStyle(FontStyle));
		gl.clickUsingJs(Vype_CommonXpath.btnFontStyle(FontStyle), "Font style is: " + FontStyle);
		String FontStyle1 = gl.getText(Vype_CommonXpath.btnFontStyle(FontStyle));
		System.out.println("Font style is: " + FontStyle1);



		// Enter your text
		gl.inputText(Vype_CommonXpath.txtEnterText, "Enter your text field", Text);

		// Click on Add Text button
		gl.clickbuttonUsingSelenium(Vype_CommonXpath.btnAddText, "Add Text");

		// Click on Add Engraving button
		gl.fnScrollToView(Vype_CommonXpath.btnAddEngraving);
		gl.clickUsingJs(Vype_CommonXpath.btnAddEngraving, "Add Engraving ");

	}

	@And("^Click on Accept order and verify status updated to Accepted$")
	public void click_on_Accept_order_and_verify_status_updated_to_Accepted() throws Throwable {

		//click on Accept Order
		gl.clickUsingJs(Vype_ClickandCollect.btnaction, "Accept Order");
		Thread.sleep(3000);

		//verify status
		//String accepted=gl.getText(Vype_ClickandCollect.txtstatus);
		//Assert.assertEquals(accepted,"Accepted");
		//gl.VerifyElementVisible(Vype_ClickandCollect.txtstatus,status);

	}


	@And("^Click on Ready For Pickup and verify status updated to Ready For Pickup$")
	public void click_on_Ready_For_Pickup_and_verify_status_updated_to_Ready_For_Pickup() throws Throwable {

		//click on Ready for pick up
		gl.clickUsingJs(Vype_ClickandCollect.btnaction, "Ready for pick up");
		Thread.sleep(3000);

		//verify status
		//String status2=gl.getText(Vype_ClickandCollect.txtstatus);
		//Assert.assertEquals(status2,"Ready for Pickup");
		//gl.VerifyElementVisible(Vype_ClickandCollect.txtstatus,status);
	}

	@And("^Click on Mark as Collected$")
	public void click_on_Mark_as_Collected() throws Throwable {
		
		//click on Mark as Collected
		gl.clickUsingJs(Vype_ClickandCollect.btnaction, "Mark as collected");
		Thread.sleep(3000);
		
		//refresh
		//gl.refresh();

	}

//akhila new
	@When("^Click on Profile icon and then click on logout$")
	public void click_on_Profile_icon_and_then_click_on_logout() throws Throwable {
		gl.clickUsingJs(Vype_ClickandCollect.profileicon, "My profile");
		
		gl.VerifyElementVisible(Vype_ClickandCollect.pgprofile,"profile page");
		
		gl.clickUsingJs(Vype_ClickandCollect.txtlogout, "Logout");
		
	}

	@When("^Hover on profile and click on My Orders$")
	public void hover_on_profile_and_click_on_My_Orders() throws Throwable {
		
		gl.ScrolltoTopofthepage();
		gl.HowerMouse(goVype_Properties.Vype_Common.btnAccount, "Account Section");
		
		gl.clickUsingJs(Vype_CommonXpath.lnkMyOrders, "lnkMyOrders");
	}

	@When("^Click on Reorder button of above placed order to redirect to cart page$")
	public void click_on_Reorder_button_of_above_placed_order() throws Throwable {
		
		gl.VerifyElementVisible(Vype_ClickandCollect.btnreorder(OrderValue),"reorder button");
		
		gl.clickUsingJs(Vype_ClickandCollect.btnreorder(OrderValue),"reorder button");
		gl.VerifyElementVisible(Vype_Cart.pgCart, "Shipping Cart");
	}

}
