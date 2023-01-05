package stepDefinitions;

import java.util.List;

import org.openqa.selenium.WebElement;

import com.rai.framework.CommonFunctions;
import com.rai.framework.RAI_Desktop_Utility_Functions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import goVype_Properties.Vype_CheckOut;
import goVype_Properties.Vype_CommonXpath;
import goVype_Properties.Vype_Subscription;

public class CreateSubscription {

	RAI_Desktop_Utility_Functions gl = new RAI_Desktop_Utility_Functions();
	CommonFunctions function = new CommonFunctions(gl);

	@When("^Hower on Shop and click on ePodtwo pods$")
	public void hower_on_Shop_and_click_on_ePodtwo_pods() throws Throwable {

		//Navigate to pod epods
		function.navigateToePodPods();
	}

	@Then("^verify subscribe and save option$")
	public void verify_subscribe_and_save_option() throws Throwable {

		//Verify subscribe and save option is available.
		//gl.VerifyElementPresent(Vype_Subscription.txtSubscribeAndSave, "Subscribe & Save");

		//Click on subscribe & save.
		//gl.clickbutton(Vype_Subscription.lnkSubscribeAndSave, "Subscribe & Save");


		List<WebElement> lst;
		lst = gl.findElementsList(Vype_Subscription.TxtSubscribeAndSave);
		for(int i =0;i<lst.size();i++){
			String str = lst.get(i).getText();
			System.out.println(str);
			gl.VerifyElementPresent(Vype_Subscription.TxtSubscribeAndSave, "Subscription options:  "+ str);
		}

		//Click on subscribe & save.
		//gl.clickbutton(Vype_Subscription.lnkSubscribeAndSave, "Subscribe & Save");
	}

	
	@Then("^choose Flavour \"([^\"]*)\" in Pod Pods Page and verify flavortext$")
	public void choose_Flavour_in_Pod_Pods_Page_and_verify_flavortext(String flavour) throws Throwable {
	    
		//choose flavor
		function.chooseFlavourInePodPodsPage(flavour);
	}
	@Then("^verify subscribe page and click on Subscribe now$")
	public void verify_subscribe_page_and_click_on_Subscribe_now() throws Throwable {

		//Subscribe and save page
		gl.VerifyElementPresent(Vype_CommonXpath.pgsubscribesave, "Subscribe & Save page ");

		gl.fnScrollToView(Vype_Subscription.TxtSubscribeAndSave);

		List<WebElement> lst;
		lst = gl.findElementsList(Vype_Subscription.TxtSubscribeAndSave);
		for(int i =0;i<lst.size();i++){
			String str = lst.get(i).getText();
			System.out.println(str);
			gl.VerifyElementPresent(Vype_Subscription.TxtSubscribeAndSave, "Subscription options:  "+ str);
		}	

		//click on header link subscribe and save
		gl.clickUsingJs(Vype_CommonXpath.btnsubscribenow, "Subscibe now  ");

		
		Thread.sleep(1000);
		//verify page in subscription     
		gl.VerifyElementVisible(Vype_CommonXpath.pgsubscription, "Subscription page ");     
	}



	@Then("^Add quantity for onetime purchase and click on add to cart$")
	public void add_quantity_for_onetime_purchase_and_click_on_add_to_cart() throws Throwable {

		//One time purchase
		function.addQuantityForOneTimePurchase();

	}

	@When("^Hower on save and click on subscribe and save under offers$")
	public void hower_on_save_and_click_on_subscribe_and_save_under_offers() throws Throwable {


	//Hower on save
	gl.HowerMouse(Vype_CommonXpath.lnkSave, "Save ");

	 //click on header link subscribe and save
	gl.clickUsingJs(Vype_CommonXpath.lnksubscribesave, "Subscibe and save(upto 33%) ");

	Thread.sleep(5000);
	}
	
	
	@Then("^Click on subscribe and save and add quantity and click on add to cart$")
	public void click_on_subscribe_and_save_and_add_quantity_and_click_on_add_to_cart() throws Throwable {


	//Subscribe and save
	function.addQuantityForSubscribeAndSave();
	}
	
	//Updated Bhavitha
	
	String Flavorname="",DeliveryCharge="";
	
	@Then("^Verify Delivery page and One time Purchase details and subscription details are dispalyed$")
	public void verify_Delivery_and_One_time_Purchase_details_and_subscription_details_are_dispalyed() throws Throwable {

		//billing 
		gl.VerifyElementVisible(Vype_CheckOut.btnGoToBilling, "Go to billing");

		System.out.println("-------------------One time purchase and subscription details in delivery page-------------------");
		List<WebElement> list=gl.findElementsList(Vype_CommonXpath.listlines);
		for(int i=0;i<list.size();i++)
		{
			String str=list.get(i).getText();
			System.out.println(str);
			gl.VerifyElementVisible(Vype_CommonXpath.listlines(i), str);
		}
	}
	@Then("^Verify Delivery page and subscription details are dispalyed$")
	public void verify_Delivery_and__subscription_details_are_dispalyed() throws Throwable {

		//billing 
		gl.VerifyElementVisible(Vype_CheckOut.btnGoToBilling, "Go to billing");

		System.out.println("------------------- subscription details in delivery page-------------------");
		List<WebElement> list=gl.findElementsList(Vype_CommonXpath.listlines);
		for(int i=0;i<list.size();i++)
		{
			String str=list.get(i).getText();
			System.out.println(str);
			gl.VerifyElementVisible(Vype_CommonXpath.listlines(i), str);
		}
	}


@When("^Select \"([^\"]*)\" option for one time purchase and \"([^\"]*)\" and Click on Go To Billing button$")
	public void select_option_for_one_time_purchase_and_and_Click_on_Go_To_Billing_button(String delivery1, String delivery2) throws Throwable {

		gl.clickUsingJs(Vype_CommonXpath.txtdelivery1(delivery1), delivery1);

		DeliveryCharge=gl.getText(Vype_CheckOut.txtdeliverycharges(delivery1));
		
		gl.fnScrollToView(Vype_CommonXpath.txtdelivery1(delivery2));
		
		gl.clickUsingJs(Vype_CommonXpath.txtdelivery1(delivery2), delivery2);
		
		gl.clickUsingJs(Vype_CheckOut.btnGoToBilling, "Go To Billing");

	}


@When("^Hower on Save and click on Subscribe and Save$")
public void hower_on_Save_and_click_on_Subscribe_and_Save() throws Throwable {
	//Hower on save
	gl.HowerMouse(Vype_CommonXpath.txtsave, "Save");
	
	//subscribe and save
	gl.clickbutton(Vype_CommonXpath.lnksubscribesaveunderprograms, "Subscribe & Save");
	
	
}

@Then("^Verify ePod Vape Pod Subscription page$")
public void verify_ePod_Vape_Pod_Subscription_page() throws Throwable {
	
	
	gl.VerifyElementVisible(Vype_CommonXpath.pgsubscription, "subscription");
}

@When("^Click on Subscribe now button from subscription landing page$")
public void click_on_Subscribe_now_button_from_subscription_landing_page() throws Throwable {
    
	gl.fnScrollToView(Vype_CommonXpath.btnsubscribenow1);
	
	gl.clickbutton(Vype_CommonXpath.btnsubscribenow1, "subscribe now");
}


@And("^Scroll to choose Flavour \"([^\"]*)\" and click on flavor image$")
	public void scroll_to_choose_Flavour_and_click_on_flavor_image(String flavor) throws Throwable {

		gl.fnScrollToView(Vype_CommonXpath.lnkAllFlavoursePodPodsPage(flavor));

		Flavorname=flavor;

		// Click on Strawberry flavour link
		gl.clickUsingJs(Vype_CommonXpath.lnkAllFlavoursePodPodsPage(flavor), "Flavor selected is: " + flavor);
		Thread.sleep(10000);	

	}
	@Then("^Verify respective flavor PDP is opened$")
	public void verify_respective_flavor_PDP_is_opened() throws Throwable {
		gl.VerifyElementVisible(Vype_CommonXpath.txtflavor2(Flavorname), Flavorname );


		// Verify strawberry page is displayed
		gl.VerifyElementVisible(Vype_CommonXpath.txtFlavours(Flavorname), "Flavor Name is: " + Flavorname);

		String str = gl.getText(Vype_CommonXpath.txtFlavoursDescription(Flavorname));
		gl.VerifyElementVisible(Vype_CommonXpath.txtFlavoursDescription(Flavorname),
				"Flavour description is: " + str);
	}

	@And("^Add required quantity \"([^\"]*)\" and click on add to cart$")
	public void add_required_quantity_and_click_on_add_to_cart(String count) throws Throwable {

		int Count=Integer.parseInt(count);

		gl.clickUsingJs(Vype_CommonXpath.btndecrement, "- ");
		for(int i=0;i<Count;i++)
		{
			// click on plus button Nicotine strength 0mg/ml
			gl.clickUsingJs(Vype_CommonXpath.btnincrement, "+ ");

		}


		// click on Add To Cart.
		gl.clickUsingJs(Vype_CommonXpath.btnAddToCart, "Add To Cart");
	}

	@Then("^Add required quantity \"([^\"]*)\" and click on Subscribe and save$")
	public void add_required_quantity_and_click_on_Subscribe_and_save(String count) throws Throwable {

		int Count=Integer.parseInt(count);

		gl.clickUsingJs(Vype_CommonXpath.btndecrement, "- ");
		for(int i=0;i<5;i++)
		{
			// click on plus button Nicotine strength 0mg/ml
			gl.clickUsingJs(Vype_CommonXpath.btnincrement, "+ ");

		}
       // click on Add To Cart.
		gl.clickUsingJs(Vype_CommonXpath.btnSubscribeandSave, "Subscribe and save");


}

	@Then("^Verify shipping page and One time Purchase details and subscription details are dispalyed$")
	public void verify_shipping_page_and_One_time_Purchase_details_and_subscription_details_are_dispalyed() throws Throwable {

		gl.VerifyElementVisible(Vype_CheckOut.pgCheckOut, "Check Out");

		Thread.sleep(2000);

		// Click on Home
		gl.clickElement(Vype_CommonXpath.weHomeAddress, "Home");


		// Click on 'Go to delivery' button
		gl.VerifyElementPresent(Vype_CheckOut.btnGoToDelivery, "Go to delivery");


		List<WebElement> list=gl.findElementsList(Vype_CommonXpath.listlines);
		System.out.println("----------------One time purchase and subscription details  in shipping  page------------------");
		for(int i=0;i<list.size();i++)
		{
			String str=list.get(i).getText();
			System.out.println(str);
			gl.VerifyElementVisible(Vype_CommonXpath.listlines(i), str);
		}
	}
	
	@Then("^Verify shipping page and subscription details are dispalyed$")
	public void verify_shipping_page_and_subscription_details_are_dispalyed() throws Throwable {

		gl.VerifyElementVisible(Vype_CheckOut.pgCheckOut, "Check Out");

		Thread.sleep(2000);

		// Click on Home
		gl.clickElement(Vype_CommonXpath.weHomeAddress, "Home");


		// Click on 'Go to delivery' button
		gl.VerifyElementPresent(Vype_CheckOut.btnGoToDelivery, "Go to delivery");


		List<WebElement> list=gl.findElementsList(Vype_CommonXpath.listlines);
		System.out.println("----------------subscription details  in shipping  page------------------");
		for(int i=0;i<list.size();i++)
		{
			String str=list.get(i).getText();
			System.out.println(str);
			gl.VerifyElementVisible(Vype_CommonXpath.listlines(i), str);
		}
	}
	
	@When("^Click on subscribe and save and add quantity \"([^\"]*)\" and click on add to cart$")
	public void click_on_subscribe_and_save_and_add_quantity_and_click_on_add_to_cart(String  quantity) throws Throwable {
		function.addQuantityForSubscribeAndSave(quantity);  
	}
	
	@Then("^Verify subscription confirmation page and subscription details like subscription date,subscribed items and subscription total$")
	public void verify_subscription_confirmation_page_and_subscription_details() throws Throwable {
	    function.verifySubscriptionConfirmationPage();
	}
	
	

}
