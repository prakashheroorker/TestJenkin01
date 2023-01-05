package stepDefinitions_Mobile;

import java.util.List;

import org.openqa.selenium.WebElement;

import com.rai.framework.CommonFunctions_Mobile;
import com.rai.framework.Constants;
import com.rai.framework.RAI_Mobile_Utility_Functions;

import cucumber.api.java.en.*;
import goVype_Properties_mobile.Vype_CommonXpath;
import goVype_Properties_mobile.Vype_rewardsUiAndFunctionality;

public class BatCanada_Profile {

	RAI_Mobile_Utility_Functions rai = new RAI_Mobile_Utility_Functions();
	CommonFunctions_Mobile function = new CommonFunctions_Mobile(rai);

//	@Then("^user Clicks on hamberger menu and verify links in Account section$")
//	public void user_Clicks_on_hamberger_menu_and_verify_links_in_Account_section() throws Throwable {
//
//		// Clicking on Menu
//		rai.clickLink(Vype_CommonXpath.btnmenu, "Menu");
//
//		// Verify all the links present in Account section
//		List<WebElement> list=rai.findElementsList(Vype_CommonXpath.lnksprofilesection);
//		System.out.println("Total number of links in Account section is:"+list.size());
//		for(int i=0;i<list.size();i++)
//		{
//			String str=list.get(i).getText();
//			System.out.println((i+1)+":"+str);
//			rai.VerifyElementsVisible(Vype_CommonXpath.lnksprofilesection, str);
//		}
//	}
////	@When("^user clicks on My Account link$")
////	public void user_clicks_on_My_Account_link() throws Throwable {
////
////
////	rai.clickUsingJs(goVype_Properties.Vype_CommonXpath.lnkMyAccount, "My Account");
////	//commented
//////	//rai.VerifyElementsVisible(Vype_CommonXpath.pgMyAccount, "Orders page");
//////	rai.ScrollByxpath(goVype_Properties.Vype_Common.weMyacctContetnt);
//////	String str = rai.getText(goVype_Properties.Vype_Common.weMyacctContetnt);
//////	rai.VerifyElementsVisible(goVype_Properties.Vype_Common.weMyacctContetnt, str);
////
////	}
//
//	@And("^user clicks on My Orders and verify Orders Section is displayed with relavent Content$")
//	public void user_clicks_on_My_Orders_and_verify_Orders_Section_is_displayed_with_relavent_Content() throws Throwable {
//
//		//click on my orders
//		rai.clickUsingJs(Vype_CommonXpath.lnkMyOrders, "My orders ");
//
//		//Verify Orders page
//		rai.VerifyElementsVisible(Vype_CommonXpath.pgMyOrders, "Orders page");
//
//		//Verify all the orders present in orders page
//		/*List<WebElement> list=rai.findElementsList(Vype_CommonXpath.allorders);
//		System.out.println("Total number of orders :"+list.size());
//		for(int i=0;i<list.size();i++)
//		{
//			String str=list.get(i).getText();
//			rai.VerifyElementsVisible(Vype_CommonXpath.allorders, str);
//		}*/
//
//
//	}@And("^Navigate back to Home page$")
//	public void navigate_back_to_Home_page() throws Throwable {
//
//		rai.fnNavigateBack();
//		Thread.sleep(2000);
//
//	}
//	@Then("^user clicks on My Reward and verify Rewards Section is displayed with relavent Content$")
//	public void user_clicks_on_My_Reward_and_verify_Rewards_Section_is_displayed_with_relavent_Content() throws Throwable {
//		rai.clickUsingJs(goVype_Properties.Vype_CommonXpath.lnkMyRewards, "My Rewards");
//		Thread.sleep(2000);
		
//		//Verify Rewards page
//		rai.VerifyElementsVisible(Vype_CommonXpath.pgMyRewards, "Rewards page");
//
//		String str = rai.getText(goVype_Properties.Vype_Common.weMyacctContetnt);
//		rai.VerifyElementsVisible(goVype_Properties.Vype_Common.weMyacctContetnt, str);
//	}
//	@Then("^user clicks on My Savings and verify Savings Section is displayed with relavent Content$")
//	public void user_clicks_on_My_Savings_and_verify_Savings_Section_is_displayed_with_relavent_Content() throws Throwable {
//		rai.clickUsingJs(goVype_Properties.Vype_CommonXpath.lnkMySavings, "My Savings");
//
//		
//		// Verify user is navigated to "Rewards" Tab of My Account page
//		rai.VerifyElementsVisible(Vype_CommonXpath.pgMySavings, "Savings page");
//		
//		
//		rai.ScrollByxpath(goVype_Properties.Vype_Common.weMyacctContetnt);
//		String str = rai.getText(goVype_Properties.Vype_Common.weMyacctContetnt);
//		rai.VerifyElementsVisible(goVype_Properties.Vype_Common.weMyacctContetnt, str);
//	}
//	@Then("^User click on Terms and Condition link$")
//		public void user_Click_on_Terms_and_Condition_link() throws Throwable {
//		  
//		//Click on "Terms and Condition " link
//		rai.clickUsingJs(goVype_Properties.Vype_Common.lnkTermsConditions, "Terms and Conditions");
//		Thread.sleep(2000);
//		rai.verifyTextOnThePage(Constants.VUSE_TermsAndConditions,"Terms and Conditions");
//		 
//		}
//		@When("^User clicks on Learn More link$")
//		public void user_clicks_on_Learn_More_link() throws Throwable {
//			
//		
//		rai.clickUsingJs(goVype_Properties.Vype_Common.lnkLearnMore, "Learn More");
//		Thread.sleep(5000);
//		// Verify the link is navigated to "Terms and condition " page which
//		// is opened in the same tab
//		rai.VerifyElementsVisible(goVype_Properties.Vype_Common.pgPassonSavings, "Pass on the savings");
//	
//		}
//		@And("^copy the invite link should be displayed$")
//		public void copy_the_invite_link_should_be_displayed() throws Throwable {
//			rai.ScrollByxpath(goVype_Properties.Vype_Common.btnCopy);
//		// Click on Copy button to copy the invite link
//			rai.VerifyElementsVisible(goVype_Properties.Vype_Common.btnCopy, "Copy");
//			Thread.sleep(2000);
//			function.verifySavingsInformationIcon();	 
//			
//	}
//	@Then("^user clicks on My Subscription and verify Subscription Section is displayed with relavent Content$")
//	public void user_clicks_on_My_Subscription_and_verify_Subscription_Section_is_displayed_with_relavent_Content() throws Throwable {
//		rai.clickUsingJs(goVype_Properties.Vype_CommonXpath.lnkMySubscription, "My Savings");
//		// Verify user is navigated to "Subscription" Tab of My Account page
//		rai.VerifyElementsVisible(Vype_CommonXpath.pgMySubscription, "subscription page");
//	
//
//		rai.ScrollByxpath(goVype_Properties.Vype_Common.weSubscriptionDetails);
//		String str = rai.getText(goVype_Properties.Vype_Common.weSubscriptionDetails);
//		rai.VerifyElementsVisible(goVype_Properties.Vype_Common.weSubscriptionDetails, str);
//	
//		
//	}
//	@When("^user clicks on Edit button in the User Name$")
//	public void user_clicks_on_Edit_button_in_the_User_Name() throws Throwable {
//		
//		rai.clickUsingJs(goVype_Properties.Vype_Common.btnProfileEdit, "My Account");
//		Thread.sleep(2000);
//		
//		//deleted the steps used in the step definition
//		
//	}
//	@When("^user clicks on Edit details button for Shipping$")
//	public void user_clicks_on_Edit_details_button_for_Shipping() throws Throwable {
//		
//			// Click on "Edit Details" button
//			rai.clickUsingJs(goVype_Properties.Vype_Common.btnEditDetails, "Edit Details button");
//
//			// Verify the user is navigated to the details page
//			rai.VerifyElementsVisible(goVype_Properties.Vype_Common.pgEditDetails, "Edit details page");
//
//			// Click on the back button
//			rai.fnNavigateBack();
//			Thread.sleep(2000);
//
//			// Verify user is navigated to "Subscription" Tab of My Account page
//			rai.VerifyElementsVisible(goVype_Properties.Vype_Common.btnEditDetails, "Subscription page");
//
//	}
//			@When("^user clicks on Cancel Subscription link$")
//			
//			public void user_clicks_on_Cancel_Subscription_link() throws Throwable {
//				
//
//			// Click on cancel link
//			rai.clickUsingJs(goVype_Properties.Vype_Common.btnCancel, "Cancel link");
//
//			// Verify the Cancel subscription modal must be displayed
//			rai.VerifyElementsVisible(goVype_Properties.Vype_Common.weCancelSubModal, "Cancel subscription modal");
//
//			// Click on close button
//			rai.clickUsingJs(goVype_Properties.Vype_Common.btnCancelModalClose, "Close Modal");
//			}

		

//			@When("^user clicks on Add Payment Method link$")
//			public void user_clicks_on_Add_Payment_Method_link() throws Throwable {
//				rai.SwipeDownSmallerUnits(4);
//				
//				rai.VerifyElementsVisible(goVype_Properties.Vype_Common.btnAddPayment, "Add Payment Method");
//				
//				rai.clickUsingJs(goVype_Properties.Vype_Common.btnAddPayment, "Add Payment Method");
//				
//				Thread.sleep(2000);
//				rai.VerifyElementsVisible(goVype_Properties.Vype_Common.weAddPayemntModal, "Add Payment Method Modal");
//
//				rai.clickUsingJs(goVype_Properties.Vype_Common.btnclosePayModal, "Close Modal");
//				Thread.sleep(2000);
//				
//				//rai.clickUsingJs(goVype_Properties.Vype_Common.btnDeletecard, "Delete saved card button");
//				//Thread.sleep(2000);
//				
//				//rai.VerifyElementsVisible(goVype_Properties.Vype_Common.weDeletePaymentMethod,"Delete Payment Method Modal");
//				//Thread.sleep(2000);
//			}
			
		
//
//			@When("^User clicks on No return button in Delete payment method modal$")
//			public void user_clicks_on_No_return_button_in_Delete_payment_method_modal() throws Throwable {
//				
//				rai.clickUsingJs(goVype_Properties.Vype_Common.btnNoReturn, "No Return button");
//				Thread.sleep(2000);
//				
//			}
			
// modified by me
	@Then("^User Clicks on hamberger menu and verify links in Account section$")
	public void user_Clicks_on_hamberger_menu_and_verify_links_in_Account_section() throws Throwable {

		// Clicking on Menu
		rai.clickLink(Vype_CommonXpath.btnmenu, "Menu");

		// Verify all the links present in Account section
		List<WebElement> list=rai.findElementsList(Vype_CommonXpath.lnksprofilesection);
		System.out.println("Total number of links in Account section is:"+list.size());
		for(int i=0;i<list.size();i++)
		{
			String str=list.get(i).getText();
			System.out.println((i+1)+":"+str);
			rai.VerifyElementsVisible(Vype_CommonXpath.lnksprofilesection, str);
		}
	}
			@When("^Clicks on hamberger menu and verify links in Account section$")
			public void clicks_on_hamberger_menu_and_verify_links_in_Account_section() throws Throwable {
			    // Write code here that turns the phrase above into concrete actions
				// Clicking on Menu
				rai.clickLink(Vype_CommonXpath.btnmenu, "Menu");

				// Verify all the links present in Account section
				List<WebElement> list=rai.findElementsList(Vype_CommonXpath.lnksprofilesection);
				System.out.println("Total number of links in Account section is:"+list.size());
				for(int i=0;i<list.size();i++)
				{
					String str=list.get(i).getText();
					System.out.println((i+1)+":"+str);
					rai.VerifyElementsVisible(Vype_CommonXpath.lnksprofilesection, str);
				}
			    
			}
			
			@When("^User clicks on My Account link$")
			public void user_clicks_on_My_Account_link() throws Throwable {


			rai.clickUsingJs(goVype_Properties.Vype_CommonXpath.lnkMyAccount, "My Account");
			}


			@Then("^Verify account section with relevant content is displayed$")
			public void verify_account_section_with_relevant_content_is_displayed() throws Throwable {
			    // Write code here that turns the phrase above into concrete actions
				
				rai.VerifyElementsVisible(Vype_CommonXpath.pgMyAccount, "My Account page");
				rai.VerifyElementVisible(goVype_Properties.Vype_Common.btnProfileEdit,"Edit icon");
				rai.VerifyElementVisible(goVype_Properties.Vype_Common.btnAddPayment,"Add payment");
				List<WebElement> list3 = rai.findElementsList(Vype_CommonXpath.lsttiles);
				System.out.println("Total no of tiles: "+list3.size());
				for(int i=0; i<list3.size();i++)
				{
					rai.ScrollByxpath(Vype_CommonXpath.lsttiles(i));
					String str = list3.get(i).getText();
					System.out.println(str);
					rai.VerifyElementVisible(Vype_CommonXpath.lsttiles(i), "content: "+ str);
				}
//				rai.ScrollByxpath(goVype_Properties.Vype_Common.weMyacctContetnt);
//				String str = rai.getText(goVype_Properties.Vype_Common.weMyacctContetnt);
//				rai.VerifyElementsVisible(goVype_Properties.Vype_Common.weMyacctContetnt, str);
//				System.out.println(str);
				
			}

			@Then("^Verify account section should be displayed$")
			public void verify_account_section_should_be_displayed() throws Throwable {
			    // Write code here that turns the phrase above into concrete actions
				rai.VerifyElementsVisible(Vype_CommonXpath.pgMyAccount, "My Account page");
				Thread.sleep(2000);
			}

			@Then("^Verify the  Edit your information pop up modal is displayed$")
			public void verify_the_Edit_your_information_pop_up_modal_is_displayed() throws Throwable {
			    // Write code here that turns the phrase above into concrete actions
				rai.VerifyElementsVisible(goVype_Properties.Vype_Common.btnProfileEdit, "Edit User Information Modal");
				Thread.sleep(2000);
			}

			@Then("^User clicks on close button of the information pop up$")
			public void user_clicks_on_close_button_of_the_information_pop_up() throws Throwable {
			    // Write code here that turns the phrase above into concrete actions
				rai.clickUsingJs(goVype_Properties.Vype_Common.btnCloseUserModal, "Close Modal");
				Thread.sleep(2000);  
			}

			@Then("^Verify the Add payment pop model displays$")
			public void verify_the_Add_payment_pop_model_displays() throws Throwable {
			    // Write code here that turns the phrase above into concrete actions
				rai.VerifyElementsVisible(goVype_Properties.Vype_Common.weAddPayemntModal, "Add Payment Method Modal");
				Thread.sleep(2000);
				
			}

			@Then("^User clicks on close button of the add payment menthod$")
			public void user_clicks_on_close_button_of_the_add_payment_menthod() throws Throwable {
			    // Write code here that turns the phrase above into concrete actions
				rai.clickUsingJs(goVype_Properties.Vype_Common.btnclosePayModal, "Close Modal");
				Thread.sleep(2000);
			}

			@When("^User swipe down and click on delete button of one of the saved cards$")
			public void user_swipe_down_and_click_on_delete_button_of_one_of_the_saved_cards() throws Throwable {
			    // Write code here that turns the phrase above into concrete actions
				rai.clickUsingJs(goVype_Properties.Vype_Common.btnDeletecard, "Delete saved card button");
				Thread.sleep(2000);
				
			}

			@Then("^Verify delete payment model should be displayed$")
			public void verify_delete_payment_model_should_be_displayed() throws Throwable {
			    // Write code here that turns the phrase above into concrete actions
				rai.VerifyElementsVisible(goVype_Properties.Vype_Common.weDeletePaymentMethod,"Delete Payment Method Modal");
				Thread.sleep(2000);
			}

			@When("^User clicks on hamberger menu and click on logout link$")
			public void user_clicks_on_hamberger_menu_and_click_on_logout_link() throws Throwable {
			    // Write code here that turns the phrase above into concrete actions
				rai.clickLink(Vype_CommonXpath.btnmenu, "Menu");
				rai.clickUsingJs(goVype_Properties.Vype_Common.lnklogout, "logout");
				
			}

			@Then("^Verify the pre login home page displayed\\.$")
			public void verify_the_pre_login_home_page_displayed() throws Throwable {
			    // Write code here that turns the phrase above into concrete actions
				rai.VerifyElementsVisible(Vype_CommonXpath.btnmenu, "Menu");
			    
			}
			@When("^User clicks on hamberger menu swipe down and click on My rewards link$")
			public void user_clicks_on_hamberger_menu_swipe_down_and_click_on_My_rewards_link() throws Throwable {
			    // Write code here that turns the phrase above into concrete actions
				rai.clickLink(Vype_CommonXpath.btnmenu, "Menu");
				rai.clickUsingJs(goVype_Properties.Vype_CommonXpath.lnkMyRewards, "My Rewards");
				Thread.sleep(2000);
			   
			}

			@Then("^Verify rewards section is displayed$")
			public void verify_rewards_section_is_displayed() throws Throwable {
			    // Write code here that turns the phrase above into concrete actions
				rai.VerifyElementsVisible(Vype_CommonXpath.pgMyRewards, "Rewards page");
			}

			@When("^User clicks on hamberger menu swipe down and click on My savings link$")
			public void user_clicks_on_hamberger_menu__swipe_down_and_click_on_My_savings_link() throws Throwable {
			    // Write code here that turns the phrase above into concrete actions
				rai.clickLink(Vype_CommonXpath.btnmenu, "Menu");
				rai.clickUsingJs(goVype_Properties.Vype_CommonXpath.lnkMySavings, "My Savings");
			}

			@Then("^Verify Savings Section  is displayed$")
			public void verify_Savings_Section_is_displayed() throws Throwable {
			    // Write code here that turns the phrase above into concrete actions
				rai.VerifyElementsVisible(Vype_CommonXpath.pgMySavings, "Savings page");
			}

			@When("^User clicks on hamberger menu swipe down and click on My Orders link$")
			public void user_clicks_on_hamberger_menu__swipe_down_and_click_on_My_Orders_link() throws Throwable {
			    // Write code here that turns the phrase above into concrete actions
				rai.clickLink(Vype_CommonXpath.btnmenu, "Menu");
				rai.clickUsingJs(Vype_CommonXpath.lnkMyOrders, "My orders ");
			   
			}

			@Then("^Verify Orders Section  is displayed$")
			public void verify_Orders_Section_is_displayed() throws Throwable {
			    // Write code here that turns the phrase above into concrete actions
				rai.VerifyElementsVisible(Vype_CommonXpath.pgMyOrders, "Orders page");
			   
			}

			@When("^User clicks on hamberger menu swipe down and click on My Subscription link$")
			public void user_clicks_on_hamberger_menu_swipe_down_and_click_on_My_Subscription_link() throws Throwable {
			    // Write code here that turns the phrase above into concrete actions
				rai.clickLink(Vype_CommonXpath.btnmenu, "Menu");
				rai.clickUsingJs(goVype_Properties.Vype_CommonXpath.lnkMySubscription, "My Subscription");
			}

			@Then("^Verify Subscription Section is displayed$")
			public void verify_Subscription_Section_is_displayed() throws Throwable {
			    // Write code here that turns the phrase above into concrete actions
				rai.VerifyElementsVisible(Vype_CommonXpath.pgMySubscription, "subscription page");
			}
			@When("^User clicks on Edit button in the User Name$")
			public void user_clicks_on_Edit_button_in_the_User_Name() throws Throwable {
				
				rai.clickUsingJs(goVype_Properties.Vype_Common.btnProfileEdit, "My Account");
				Thread.sleep(2000);
				
				//deleted the steps used in the step definition
				
			}
			@When("^User swipe down and clicks on Add Payment Method link$")
			public void user_swipe_down_and_clicks_on_Add_Payment_Method_link() throws Throwable {
				rai.SwipeDownSmallerUnits(1);
				
				rai.VerifyElementsVisible(goVype_Properties.Vype_Common.btnAddPayment, "Add Payment Method");
				
				rai.clickUsingJs(goVype_Properties.Vype_Common.btnAddPayment, "Add Payment Method");
			
			
		
	}
			@Then("^Verify my order with relevant content is displayed$")
			public void verify_my_order_with_relevant_content_is_displayed() throws Throwable {
			    // Write code here that turns the phrase above into concrete actions
				rai.VerifyElementsVisible(Vype_CommonXpath.pgMyOrders, "Rewards page");
				rai.SwipeDown(4);
				String str = rai.getText(goVype_Properties.Vype_Common.weOrderContent);
				rai.VerifyElementsVisible(goVype_Properties.Vype_Common.weOrderContent, str);
				System.out.println(str);
			   
			}
			@Then("^Verify rewards page with relevant content is displayed$")
			public void verify_rewards_page_with_relevant_content_is_displayed() throws Throwable {
			    // Write code here that turns the phrase above into concrete actions
				
				rai.VerifyElementsVisible(Vype_CommonXpath.pgMyRewards, "Rewards page");
				rai.VerifyElementVisible(goVype_Properties.Vype_Common.pgrewards, "page rewards");
				List<WebElement> list3 = rai.findElementsList(Vype_CommonXpath.lsttiles);
				System.out.println("Total no of tiles: "+list3.size());
				for(int i=0; i<list3.size();i++)
				{
					rai.ScrollByxpath(Vype_CommonXpath.lsttiles(i));
					String str = list3.get(i).getText();
					System.out.println(str);
					rai.VerifyElementVisible(Vype_CommonXpath.lsttiles(i), "content: "+ str);
				}
//				String str = rai.getText(goVype_Properties.Vype_Common.weMyacctContetnt);
//				rai.VerifyElementsVisible(goVype_Properties.Vype_Common.weMyacctContetnt, str);
//				System.out.println(str);
			}
			@Then("^Verify the savings page with relevant content is displayed$")
			public void verify_the_savings_page_with_relevant_content_is_displayed() throws Throwable {
			    // Write code here that turns the phrase above into concrete actions
				
				// Verify user is navigated to "Rewards" Tab of My Account page
				rai.VerifyElementsVisible(Vype_CommonXpath.pgMySavings, "Savings page");
				rai.VerifyElementVisible(goVype_Properties.Vype_Common.lnkTermsConditions,"Terms and conditions");
				rai.VerifyElementVisible(goVype_Properties.Vype_Common.lnkLearnMore,"Learn more link");
				
				rai.ScrollByxpath(goVype_Properties.Vype_Common.weMyacctContetnt);
				String str = rai.getText(goVype_Properties.Vype_Common.weMyacctContetnt);
				rai.VerifyElementsVisible(goVype_Properties.Vype_Common.weMyacctContetnt, str);
				System.out.println(str);
				
			}

			@When("^User swipe down and  click on Terms and Condition link$")
			public void user_swipe_down_and_click_on_Terms_and_Condition_link() throws Throwable {
			    // Write code here that turns the phrase above into concrete actions
			    rai.ScrollByxpath(goVype_Properties.Vype_Common.lnkTermsConditions);
			    rai.clickUsingJs(goVype_Properties.Vype_Common.lnkTermsConditions, "Terms and Conditions");
				Thread.sleep(2000);
				rai.verifyTextOnThePage(Constants.VUSE_TermsAndConditions,"Terms and Conditions");
			}

			@Then("^Verify  user navigated to terms and condition page$")
			public void verify_user_navigated_to_terms_and_condition_page() throws Throwable {
			    // Write code here that turns the phrase above into concrete actions
				rai.verifyTextOnThePage(Constants.VUSE_TermsAndConditions,"Terms and Conditions");
			}

			@Then("^User navigate back and verify my savings page is displayed$")
			public void user_navigate_back_and_verify_my_savings_page_is_displayed() throws Throwable {
			    // Write code here that turns the phrase above into concrete actions
				rai.fnNavigateBack();
				Thread.sleep(2000);
				rai.VerifyElementsVisible(Vype_CommonXpath.pgMySavings, "Savings page");
			   
			}

			@When("^User  swipe down and clicks on Learn More link$")
			public void user_swipe_down_and_clicks_on_Learn_More_link() throws Throwable {
			    // Write code here that turns the phrase above into concrete actions
				rai.ScrollByxpath(goVype_Properties.Vype_Common.lnkLearnMore);
				rai.clickUsingJs(goVype_Properties.Vype_Common.lnkLearnMore, "Learn More");
				Thread.sleep(5000);
				// Verify the link is navigated to "Terms and condition " page which
				// is opened in the same tab
				rai.VerifyElementsVisible(goVype_Properties.Vype_Common.pgPassonSavings, "Pass on the savings");
			
			}

			@Then("^Verify user navigated to the pass on savings page$")
			public void verify_user_navigated_to_the_pass_on_savings_page() throws Throwable {
			    // Write code here that turns the phrase above into concrete actions
				rai.VerifyElementsVisible(goVype_Properties.Vype_Common.pgPassonSavings, "Pass on the savings"); 
			}
			@Then("^Verify subscription page with relevant content is displayed$")
			public void verify_subscription_page_with_relevant_content_is_displayed() throws Throwable {
			    // Write code here that turns the phrase above into concrete actions
				rai.VerifyElementsVisible(Vype_CommonXpath.pgMySubscription, "subscription page");
				rai.VerifyElementsVisible(goVype_Properties.Vype_Common.btnEditDetails, "Edit Details button");
				 rai.VerifyElementVisible(goVype_Properties.Vype_Common.lnkpause,"Pause");
				 rai.VerifyElementVisible(goVype_Properties.Vype_Common.btnCancel,"cancel");

				rai.ScrollByxpath(goVype_Properties.Vype_Common.weSubscriptionDetails);
				String str = rai.getText(goVype_Properties.Vype_Common.weSubscriptionDetails);
				rai.VerifyElementsVisible(goVype_Properties.Vype_Common.weSubscriptionDetails, str);
				System.out.println(str);
			
			}

			@When("^User swipe down and clicks on editdetails button$")
			public void user_swipe_down_and_clicks_on_editdetails_button() throws Throwable {
			    // Write code here that turns the phrase above into concrete actions
				rai.ScrollByxpath(goVype_Properties.Vype_Common.btnEditDetails);
				rai.clickUsingJs(goVype_Properties.Vype_Common.btnEditDetails, "Edit Details button");

				// Verify the user is navigated to the details page
				rai.VerifyElementsVisible(goVype_Properties.Vype_Common.pgEditDetails, "Edit details page");
			}

			@Then("^Verify user navigates to the edit details page is displayed$")
			public void verify_user_navigates_to_the_edit_details_page_is_displayed() throws Throwable {
			    // Write code here that turns the phrase above into concrete actions
				rai.VerifyElementsVisible(goVype_Properties.Vype_Common.pgEditDetails, "Edit details page");
			}

			@When("^User click on back button and verify the subscription page is displayed$")
			public void user_click_on_back_button_and_verify_the_subscription_page_is_displayed() throws Throwable {
			    // Write code here that turns the phrase above into concrete actions
				rai.clickUsingJs(goVype_Properties.Vype_Common.btnback, "back button");
				rai.VerifyElementsVisible(Vype_CommonXpath.pgMySubscription, "Savings page");
			}

			@When("^User swipe down and clicks on pause link$")
			public void user_swipe_down_and_clicks_on_pause_link() throws Throwable {
			    // Write code here that turns the phrase above into concrete actions
				rai.ScrollByxpath(goVype_Properties.Vype_Common.lnkpause);
				rai.clickUsingJs(goVype_Properties.Vype_Common.lnkpause, "pause link");
				
			}
	

			@Then("^Verify pause subscription model is displayed$")
			public void verify_pause_subscription_model_is_displayed() throws Throwable {
			    // Write code here that turns the phrase above into concrete actions
				rai.VerifyElementsVisible(goVype_Properties.Vype_Common.wepauseSubModal, "pause subscription modal");
			}

			@When("^User cliks on no return from the model and verify the subscription page displayed$")
			public void user_cliks_on_no_return_from_the_model_and_verify_the_subscription_page_displayed() throws Throwable {
			    // Write code here that turns the phrase above into concrete actions
				rai.clickUsingJs(goVype_Properties.Vype_Common.btnnoreturn, "no return");
				rai.VerifyElementsVisible(Vype_CommonXpath.pgMySubscription, "Subscription page");
			}

			@When("^User swipe down and clicks on cancel link$")
			public void user_swipe_down_and_clicks_on_cancel_link() throws Throwable {
			    // Write code here that turns the phrase above into concrete actions
				rai.ScrollByxpath(goVype_Properties.Vype_Common.btnCancel);
				rai.clickUsingJs(goVype_Properties.Vype_Common.btnCancel, "Cancel link");
			}

			@Then("^Verify cancel subscription model is displayed$")
			public void verify_cancel_subscription_model_is_displayed() throws Throwable {
			    // Write code here that turns the phrase above into concrete actions
				rai.VerifyElementsVisible(goVype_Properties.Vype_Common.weCancelSubModal, "Cancel subscription modal");
			}
			@Then("^User clicks on No return button in Delete payment method modal$")
			public void user_clicks_on_No_return_button_in_Delete_payment_method_modal() throws Throwable {
			    // Write code here that turns the phrase above into concrete actions
				rai.clickUsingJs(goVype_Properties.Vype_Common.btnnoreturn, "Close Modal");
				Thread.sleep(2000);
			}

			
			
			
}


	

