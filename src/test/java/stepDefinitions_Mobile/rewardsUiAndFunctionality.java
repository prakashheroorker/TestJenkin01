package stepDefinitions_Mobile;


import java.util.List;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.rai.framework.CommonFunctions_Mobile;
import com.rai.framework.RAI_Mobile_Utility_Functions;

import cucumber.api.java.en.*;

import goVype_Properties_mobile.*;


public class rewardsUiAndFunctionality {

	RAI_Mobile_Utility_Functions rai = new RAI_Mobile_Utility_Functions();
	CommonFunctions_Mobile function = new CommonFunctions_Mobile(rai);
	RemoteWebDriver rdriver;
	
	String PurchasePoints;
	String EpodPurchase;
	int points;
	
	@When("^user clicks on Vuse Rewards$")
	public void user_clicks_on_Vuse_Rewards() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		rai.clickUsingJs(Vype_CommonXpath.lnkVuseRewards, "Cliked on Vuse Rewards link");
		Thread.sleep(3000); 
	}

	@Then("^Verify the Vuse rewards page$")
	public void verify_the_Vuse_rewards_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		rai.VerifyElementsVisible(Vype_CommonXpath.txtinVuseRewards, "Vuse Rewards page is displayed");
		Thread.sleep(2000);
		
	}

	@Then("^scrolls to faqs and verify all the faqs$")
	public void scrolls_to_faqs_and_verify_all_the_faqs() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
		//Scroll to FAQ Section
	   rai.ScrollByxpath(Vype_CommonXpath.weFAQList);

		//verify faqs
		List<WebElement> list3 = rai.findElementsList(Vype_CommonXpath.weFAQList);
		System.out.println("Total no of Faqs: "+list3.size());
		for(int i=0; i<list3.size();i++)
		{
			rai.clickUsingJs(Vype_rewardsUiAndFunctionality.DropDown(i), "Down arrow");
			String FAQ=rai.getText(Vype_rewardsUiAndFunctionality.txtfaqs(i));
			System.out.println((i+1)+":"+FAQ);
			rai.VerifyElementVisible(Vype_rewardsUiAndFunctionality.txtfaqs(i), FAQ);
		}
			
	}

	@Then("^click on click here link under fqas$")
	public void click_on_click_here_link_under_fqas() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		rai.ScrollByxpath(Vype_rewardsUiAndFunctionality.clickhere);
		rai.clickLink(Vype_rewardsUiAndFunctionality.clickhere, "terms and condition link");
		Thread.sleep(2000);
	   
	    
	}

	@Then("^verify the terms and conditions as per the production site$")
	public void verify_the_terms_and_conditions_as_per_the_production_site() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		rai.VerifyPageObject(Vype_rewardsUiAndFunctionality.termspage, "Vuse Rewards Terms and Conditions");
		   rai.ScrolltoBottomofthepage();
		   Thread.sleep(2000);
		}
	
	@Then("^Verify the contents in the vuse rewards page$")
	public void verify_the_contents_in_the_vuse_rewards_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		rai.ScrollByxpath(Vype_rewardsUiAndFunctionality.txtcontents);
		
		String txtcontents = rai.getText(Vype_rewardsUiAndFunctionality.txtcontents);

		rai.VerifyElementVisible(Vype_rewardsUiAndFunctionality.txtcontents,txtcontents);
		System.out.println(txtcontents);
		
		rai.ScrollByxpath(Vype_rewardsUiAndFunctionality.txtcontents1);
		String txtcontents1 = rai.getText(Vype_rewardsUiAndFunctionality.txtcontents1);

		rai.VerifyElementVisible(Vype_rewardsUiAndFunctionality.txtcontents,txtcontents1);
		System.out.println(txtcontents1);
		
	   rai.ScrollByxpath(Vype_rewardsUiAndFunctionality.btnJoinNow1); 
	
	}

	@When("^user clicks on join now in the vuse rewards page$")
	public void user_clicks_on_join_now_in_the_vuse_rewards_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		rai.clickUsingJs(Vype_rewardsUiAndFunctionality.btnJoinNow1, "Click on join now");
		Thread.sleep(5000);
	    
	    
	}

	@Then("^verify the user redirects to the rewards section in the profile page$")
	public void verify_the_user_redirects_to_the_rewards_section_in_the_profile_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 rai.VerifyPageObject(Vype_rewardsUiAndFunctionality.pgrewards,"Your Vuse rewards summary");
		    Thread.sleep(5000);
	    
	}
	@Then("^verify the vuse rewards benefits content rewards page$")
	public void verify_the_vuse_rewards_benefits_content_rewards_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		rai.ScrollByxpath(Vype_rewardsUiAndFunctionality.txtbenefits);
		List<WebElement> lst2;
		lst2 = rai.findElementsList(Vype_rewardsUiAndFunctionality.txtbenefits);
		for(int i =0;i<lst2.size();i++){
		String str = lst2.get(i).getText();
		System.out.println(str);
		rai.VerifyElementsVisible(Vype_rewardsUiAndFunctionality.txtbenefits, "content: "+ str);
		}
	   
	}

	@Then("^verify the unlock your vuse badges content rewards page$")
	public void verify_the_unlock_your_vuse_badges_content_rewards_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String txtunlock = rai.getText(Vype_rewardsUiAndFunctionality.txtunlock);

		rai.VerifyElementVisible(Vype_rewardsUiAndFunctionality.txtunlock,txtunlock);
		System.out.println(txtunlock);
	}

	@Then("^verify the page break down content in rewards page$")
	public void verify_the_page_break_down_content_in_rewards_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		rai.ScrollByxpath(Vype_rewardsUiAndFunctionality.txtPointsBD);
		List<WebElement> lst1;
		lst1 = rai.findElementsList(Vype_rewardsUiAndFunctionality.txtPointsBD);
		for(int i =0;i<lst1.size();i++){
		String str = lst1.get(i).getText();
		System.out.println(str);
		rai.VerifyElementsVisible(Vype_rewardsUiAndFunctionality.txtPointsBD, "content: "+ str);
		}
		rai.ScrollByxpath(Vype_rewardsUiAndFunctionality.txtStartcollecting);
		String txtStartcollecting = rai.getText(Vype_rewardsUiAndFunctionality.txtStartcollecting);

		rai.VerifyElementVisible(Vype_rewardsUiAndFunctionality.txtStartcollecting,txtStartcollecting);
		System.out.println(txtStartcollecting);
	}
	@When("^user clicks on join now button in the vuse rewards page$")
	public void user_clicks_on_join_now_button_in_the_vuse_rewards_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		rai.ScrollByxpath(Vype_rewardsUiAndFunctionality.btnJoinNow2);
		rai.clickUsingJs(Vype_rewardsUiAndFunctionality.btnJoinNow2, "Click on join now");
		Thread.sleep(2000);
	    
	}
	
	@Then("^user verify the Rewards page with relevent information$")
	public void user_verify_the_Rewards_page_with_relevent_information() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
		//verify the reward page is displayed
			rai.VerifyElementsVisible(Vype_rewardsUiAndFunctionality.lnkrewardspage, "Vuse+ Vuse Reward Summary");
				
				
			
				//verify the current user
		        String Currentuser = rai.getText(Vype_rewardsUiAndFunctionality.lnkCurrentuser);
				
				rai.VerifyElementVisible(Vype_rewardsUiAndFunctionality.lnkCurrentuser, Currentuser);

				System.out.println(">>>>>>"+Currentuser+">>>>>>>>>");
				
				
				//points displayed
				rai.ScrollByxpath(Vype_rewardsUiAndFunctionality.lnkpoints);
				rai.VerifyElementVisible(Vype_rewardsUiAndFunctionality.lnkpoints, "Current points chart");
				
				String Currentpoints = rai.getText(Vype_rewardsUiAndFunctionality.lnkCurrentpoints);
				
				rai.VerifyElementVisible(Vype_rewardsUiAndFunctionality.lnkCurrentpoints, Currentpoints);

				System.out.println(">>>>>>"+Currentpoints+">>>>>>>>>");
				

				
				//Benefits section is visible
				rai.VerifyElementVisible(Vype_rewardsUiAndFunctionality.lnkbenefits, "Your benefits"); 
				
				List<WebElement> lst;
				lst = rai.findElementsList(Vype_rewardsUiAndFunctionality.lnkbenefitsdet);
				for(int i =0;i<lst.size();i++){
					String str = lst.get(i).getText();
					System.out.println(str);
					rai.VerifyElementVisible(Vype_rewardsUiAndFunctionality.lnkbenefitsdet, "Your Benefits:  "+ str +" ");
				}	
				
				
				
				//your perks
				
			rai.ScrollByxpath(Vype_rewardsUiAndFunctionality.lnperks);
				rai.VerifyElementVisible(Vype_rewardsUiAndFunctionality.lnperks, "Your Perks");
				
				List<WebElement> lst1;
				lst1 = rai.findElementsList(Vype_rewardsUiAndFunctionality.lnkperksdet);
				for(int i =0;i<lst1.size();i++){
					String str = lst1.get(i).getText();
					System.out.println(str);
					rai.VerifyElementsVisible(Vype_rewardsUiAndFunctionality.lnkperksdet, "Your Perks:  "+ str);
				}	
				
			

			    
				
				
				
				
				//Your Achievements
				rai.ScrollByxpath(Vype_rewardsUiAndFunctionality.lnkachieve);
				
				rai.VerifyElementVisible(Vype_rewardsUiAndFunctionality.lnkachieve, "Your Achievements");
			
				List<WebElement> lst2;
				lst2 = rai.findElementsList(Vype_rewardsUiAndFunctionality.lnkachievedet);
				for(int i =0;i<lst2.size();i++){
					String str = lst2.get(i).getText();
					System.out.println(str);
					rai.VerifyElementsVisible(Vype_rewardsUiAndFunctionality.lnkachievedet, "Your Achievements:  "+ str);
				}	
				
				
				
				
			    //Your history
				rai.ScrollByxpath(Vype_rewardsUiAndFunctionality.lnkhistory);
				rai.VerifyElementVisible(Vype_rewardsUiAndFunctionality.lnkhistorydet, "Your history");
				
		      	List<WebElement> lste;
				lste = rai.findElementsList(Vype_rewardsUiAndFunctionality.lnkhistorydet);
				for(int i =0;i<lste.size();i++){
					String str = lste.get(i).getText();
					System.out.println(str);
					rai.VerifyElementsVisible(Vype_rewardsUiAndFunctionality.lnkhistorydet, "Your history  "+ str);
				}	
		
	}
	
	
	
	
	
	

	@Then("^verify the content  displayed and toggle button in the rewards page$")
	public void verify_the_content_displayed_and_toggle_button_in_the_rewards_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
		rai.ScrollByxpath(Vype_rewardsUiAndFunctionality.lnkcontent);
		List<WebElement> lst2;
		lst2 = rai.findElementsList(Vype_rewardsUiAndFunctionality.lnkcontent);
		for(int i =0;i<lst2.size();i++){
			String str = lst2.get(i).getText();
			System.out.println(str);
			rai.VerifyElementVisible(Vype_rewardsUiAndFunctionality.lnkcontent, "  "+ str);
		}	
		
		//toggle button in green colour
		rai.VerifyElementVisible(Vype_rewardsUiAndFunctionality.lnktoggle, "Toggle button is On "); 
		
		
		
		
	}
	
	
	
	@Then("^user clicks on epod(\\d+) vaping products and clicks on ePod(\\d+)\\+ devices$")
	public void user_clicks_on_epod_vaping_products_and_clicks_on_ePod_devices(int arg1, int arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		//click on edop2 vaping products
		rai.clickUsingJs(Vype_CommonXpath.lnkdeviceandpods, "Device, Pods & Accessories ");
		
		//epod2+ devices
		rai.clickUsingJs(Vype_rewardsUiAndFunctionality.lnkepod2plus,"epod2+ device");
		
	}
	
	
	
	
	@Then("^verify epod(\\d+)\\+ device page and click on BUY NOW$")
	public void verify_epod_device_page_and_click_on_BUY_NOW(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		//verify epod2+ device page is displaayed
				rai.VerifyElementVisible(Vype_rewardsUiAndFunctionality.lnkepodpage, "ePod2+ page");
				
				//click on BUY NOW $14.99
				
				rai.ScrollByxpath(Vype_rewardsUiAndFunctionality.lnkbuynow);
				rai.clickbutton(Vype_rewardsUiAndFunctionality.lnkbuynow, "BUY NOW $14.99");
				
				//verify choose color page
				rai.VerifyElementVisible(Vype_rewardsUiAndFunctionality.lnkchoose, "Choose Colour");
				
	}
	
	
	
	
	
	@Then("^Verify the newly added points in the history for epod purchase and epod(\\d+)\\+ badges under Your Achievements$")
	public void verify_the_newly_added_points_in_the_history_for_epod_purchase_and_epod_badges_under_Your_Achievements(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
	
       rai.VerifyElementVisible(Vype_rewardsUiAndFunctionality.lnkachieve, "Your Achievements");
		
		rai.VerifyElementVisible(Vype_rewardsUiAndFunctionality.lnkbadge, "epod2+ badge");
		
		
		rai.ScrollByxpath(Vype_rewardsUiAndFunctionality.lnkhistory);
		
		rai.ScrollByxpath(Vype_rewardsUiAndFunctionality.lnkEpod2purchasepoints);
		
		
		

			
     		EpodPurchase=rai.getText(Vype_rewardsUiAndFunctionality.lnkEpodPurchase);
			PurchasePoints = rai.getText(Vype_rewardsUiAndFunctionality.lnkEpod2purchasepoints);
			
			System.out.println(">>>>>>"+PurchasePoints+">>>>>>>>>");
			System.out.println(">>>>>>"+EpodPurchase+">>>>>>>>>");
			
			PurchasePoints = PurchasePoints.replace("+", "");
			int EpodPoints = Integer.parseInt(PurchasePoints);
			
 
    
			if(EpodPoints == 500) {
				
				System.out.println("The Epod2+ Purchase Points are added to the history");
			}
			
	
			else
			{
				System.out.println("The Epod2+ Points are not added");
			}
			

		
}
	
	@Then("^Verify the rewards Page wih current points$")
	public void verify_the_rewards_Page_wih_current_points() throws Throwable {
	
	rai.VerifyElementVisible(Vype_rewardsUiAndFunctionality.lnkrewardspage, "Vuse+ Vuse Reward Summary");
	
	//Progression bar
	rai.VerifyElementVisible(Vype_rewardsUiAndFunctionality.lnkprogression, "Progresion bar");
	
	//Lifetime earned points
	String EarnedPoints = rai.getText(Vype_rewardsUiAndFunctionality.lnkearnedPoints);
	
	rai.VerifyElementVisible(Vype_rewardsUiAndFunctionality.lnkearnedPoints, EarnedPoints);

	System.out.println(">>>>>>"+EarnedPoints+">>>>>>>>>");
	

	
	//Current Points Graph
	rai.VerifyElementVisible(Vype_rewardsUiAndFunctionality.lnkpoints, "Current points chart");
	
	
	}
	
	@Then("^Verify the Vuse\\+ Rewards banner with earned points and balance points in order confirmation page$")
	public void verify_the_Vuse_Rewards_banner_with_earned_points_and_balance_points_in_order_confirmation_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
       String Banner = rai.getText(Vype_rewardsUiAndFunctionality.lnkbanner);
		
		rai.VerifyElementVisible(Vype_rewardsUiAndFunctionality.lnkbanner, Banner);

		System.out.println(">>>>>>"+Banner+">>>>>>>>>");
	}
	
	
	
	
	
	
	

	    
	}