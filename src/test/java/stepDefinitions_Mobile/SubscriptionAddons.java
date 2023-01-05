package stepDefinitions_Mobile;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.WebElement;

import com.rai.framework.CommonFunctions_Mobile;
import com.rai.framework.RAI_Mobile_Utility_Functions;

import cucumber.api.java.en.*;
import goVype_Properties_mobile.Vype_CheckOut;
import goVype_Properties_mobile.Vype_CommonXpath;

public class SubscriptionAddons {

	RAI_Mobile_Utility_Functions rai = new RAI_Mobile_Utility_Functions();
	CommonFunctions_Mobile function = new CommonFunctions_Mobile(rai);


	@Then("^add quantity click on Subscribe and save and add to cart$")
	public void add_quantity_click_on_Subscribe_and_save_and_add_to_cart() throws Throwable {


		//rai.ScrollByxpath(Vype_CommonXpath.pgsubscribandsave);
		rai.SwipeDownSmallerUnits(3);
		rai.clickbutton(Vype_CommonXpath.txtSubsandSave1,"Subscribe and save");
		Thread.sleep(2000);
		for(int i=0;i<5;i++)
		{
			
			//click on 
			rai.clickbutton(Vype_CommonXpath.btnstrength, "+ ");
		}

	/*	boolean b1=rai.verifyobjectisnotavailable(Vype_CommonXpath.txtSubsandSave);

		if(b1==false)
		{
			
			rai.clickUsingJs(Vype_CommonXpath.txtSubsandSave,"Subscribe and save");
		}

		if(b1==true)
		{   */
			//rai.clickbutton(Vype_CommonXpath.txtSubsandSave1,"Subscribe and save");
		//}
		
		
		//click on subscribe and save
	  rai.clickbutton(Vype_CommonXpath.btnSubscribeandSave, "Subscribe and save");

	}

	@Then("^click on Add or modify and add more flavors \"([^\"]*)\" and submit update$")
	public void click_on_Add_or_modify_and_add_more_flavors_and_submit_update(String Flavors) throws Throwable {

		//Scroll to Add/Modify items button
		rai.ScrollByxpath(Vype_CommonXpath.btnAddorModify);

		//Click Add/Modify button
		rai.clickbutton(Vype_CommonXpath.btnAddorModify, "Add/Modify");

		//clicking on 3 different flavors------------
		String S = Flavors;

		List<String> myList = new ArrayList<String>(Arrays.asList(S.split(","))); 

		for (String flavor : myList) {  

			Thread.sleep(2000);

			function.Pickpods(flavor);
		}

		//Scroll to order summary
		rai.ScrollByxpath(Vype_CommonXpath.ordersummary);

		rai.VerifyElementVisible(Vype_CommonXpath.ordersummary, "Order summary");


		//Scroll to Submit Update
		rai.ScrollByxpath(Vype_CommonXpath.btnSubmitUpadate);

		//Click Submit update button
		rai.clickbutton(Vype_CommonXpath.btnSubmitUpadate, "Submit Update");

		Thread.sleep(2000);

		//Verify Subscription is successfully updated msg is displayed
		rai.VerifyElementVisible(Vype_CommonXpath.weSubscriptionUpdated,"Subscription updated");

        //your subscribed items
		rai.ScrollByxpath(Vype_CommonXpath.txtsubscribeditems);
		String s=rai.getText(Vype_CommonXpath.txtsubscribeditems);
		rai.VerifyElementsVisible(Vype_CommonXpath.txtsubscribeditems, s);

		//subscription total
		String s1=rai.getText(Vype_CommonXpath.subscriptiontotal);
		rai.VerifyElementsVisible(Vype_CommonXpath.subscriptiontotal, s1);



	}
	
	
	//Updated Bhavitha
	
	String DeliveryCharge;
	@Then("^add quantity click on Subscribe and Save and add to cart$")
	public void add_quantity_click_on_Subscribe_and_Save_and_add_to_cart() throws Throwable {


		//rai.ScrollByxpath(Vype_CommonXpath.pgsubscribandsave);
		rai.SwipeDownSmallerUnits(4);
		Thread.sleep(2000);
		for(int i=0;i<5;i++)
		{
			
			//click on 
			rai.clickbutton(Vype_CommonXpath.btnstrength, "+ ");
		}

		boolean b1=rai.verifyobjectisnotavailable(Vype_CommonXpath.txtSubsandSave1);

		if(b1==true)
		{
			
			rai.clickbutton(Vype_CommonXpath.txtSubsandSave,"Subscribe and save");
		}

		if(b1==false)
		{   
			rai.clickbutton(Vype_CommonXpath.txtSubsandSave1,"Subscribe and save");
			 rai.clickbutton(Vype_CommonXpath.btnSubscribeandSave, "Subscribe and save");
		}
		
		
		//click on subscribe and save
	  //rai.clickbutton(Vype_CommonXpath.btnSubscribeandSave, "Subscribe and save");

	}
	
	@Then("^Verify shipping page and One time Purchase details and subscription details are dispalyed$")
	public void verify_shipping_page_and_One_time_Purchase_details_and_subscription_details_are_dispalyed() throws Throwable {

		rai.VerifyElementVisible(Vype_CheckOut.pgCheckOut, "Check Out");

		Thread.sleep(2000);

		// Click on Home
		rai.clickbutton(Vype_CommonXpath.weHomeAddress, "Home");
		//rai.SwipeDownSmallerUnits(2);

		// 'Go to delivery' button
		rai.VerifyElementVisible(Vype_CheckOut.btnGoToDelivery, "Go to delivery");


		List<WebElement> list=rai.findElementsList(Vype_CommonXpath.listlines);
		System.out.println("----------------One time purchase and subscription details  in shipping  page------------------");
		for(int i=0;i<list.size();i++)
		{
			String str=list.get(i).getText();
			System.out.println(str);
			rai.VerifyElementVisible(Vype_CommonXpath.listlines(i), str);
		}
	}
	
	
	@When("^Select \"([^\"]*)\" option for One Time Purchase and \"([^\"]*)\" and Click on Go To Billing button$")
	public void select_option_for_One_Time_Purchase_and_and_Click_on_Go_To_Billing_button(String delivery1, String delivery2) throws Throwable {

		rai.clickbutton(Vype_CommonXpath.txtdelivery1(delivery1), delivery1);

		DeliveryCharge=rai.getText(Vype_CheckOut.txtdeliverycharges(delivery1));
		
		//rai.fnScrollToView(Vype_CommonXpath.txtdelivery1(delivery2));
		
		
		
		rai.clickbutton(Vype_CommonXpath.txtdelivery1(delivery2), delivery2);
		
		rai.clickbutton(Vype_CheckOut.btnGoToBilling, "Go To Billing");

	}
	
	@Then("^Verify Delivery page and One Time Purchase details and subscription details are dispalyed$")
	public void verify_Delivery_and_One_Time_Purchase_details_and_subscription_details_are_dispalyed() throws Throwable {

		//billing 
		rai.VerifyElementVisible(Vype_CheckOut.btnGoToBilling, "Go to billing");

		System.out.println("-------------------One time purchase and subscription details in delivery page-------------------");
		List<WebElement> list=rai.findElementsList(Vype_CommonXpath.listlines);
		for(int i=0;i<list.size();i++)
		{
			String str=list.get(i).getText();
			System.out.println(str);
			rai.VerifyElementVisible(Vype_CommonXpath.listlines(i), str);
		}
	}
	
	@Then("^Add quantity\"([^\"]*)\" click on Subscribe and Save and add to cart$")
	public void add_quantity_click_on_Subscribe_and_Save_and_add_to_cart(String count) throws Throwable {

		int flavorcount = Integer.parseInt(count);
		//rai.ScrollByxpath(Vype_CommonXpath.pgsubscribandsave);
		rai.SwipeDownSmallerUnits(4);
		Thread.sleep(2000);
		for(int i=0;i<flavorcount;i++)
		{
			
			//click on 
			rai.clickbutton(Vype_CommonXpath.btnstrength, "+ ");
		}

		boolean b1=rai.verifyobjectisnotavailable(Vype_CommonXpath.txtSubsandSave1);

		if(b1==true)
		{
			
			rai.clickbutton(Vype_CommonXpath.txtSubsandSave,"Subscribe and save");
		}

		if(b1==false)
		{   
			rai.clickbutton(Vype_CommonXpath.txtSubsandSave1,"Subscribe and save");
			 rai.clickbutton(Vype_CommonXpath.btnSubscribeandSave, "Subscribe and save");
		}
		
		
		//click on subscribe and save
	  //rai.clickbutton(Vype_CommonXpath.btnSubscribeandSave, "Subscribe and save");

	}
	
	

}
