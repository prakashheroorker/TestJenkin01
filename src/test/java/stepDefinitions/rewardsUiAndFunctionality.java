package stepDefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.rai.framework.CommonFunctions;
import com.rai.framework.RAI_Desktop_Utility_Functions;
import cucumber.api.java.en.*;
import goVype_Properties.*;

public class rewardsUiAndFunctionality

 {
	RAI_Desktop_Utility_Functions gl = new RAI_Desktop_Utility_Functions();
	CommonFunctions function = new CommonFunctions(gl);

@When("^User Hower on save and click on Vuse\\+ rewards link$")
public void user_Hower_on_save_and_click_on_Vuse_rewards_link() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	//click on save
	gl.HowerMouse(Vype_CommonXpath.lnkSave, "Save ");
	//click on vuse +rewards
	gl.clickUsingJs(Vype_CommonXpath.lnkVuseRewards, "vuse reward");
	Thread.sleep(3000);
    
}

@Then("^Verify  VUSE REWARDS  Page should be displayed$")
public void verify_VUSE_REWARDS_Page_should_be_displayed() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	gl.fnVerifyPageDisplayed(Vype_rewardsUiAndFunctionality.page, "Vuse reward page displays");
    //gl.VerifyPageDisplayedUsingPageTitle("Vuse Rewards");
    Thread.sleep(2000);
}


@Then("^scrolls to faqs and verify all faqs$")
public void scrolls_to_faqs_and_verify_all_faqs() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    
	String str;
	//Scroll to FAQ Section
	gl.fnScrollToView(Vype_CommonXpath.weFAQ);

	//verify faqs
	List<WebElement> list3 = gl.findElementsList(Vype_CommonXpath.weFAQList);
	System.out.println("Total no of Faqs: "+list3.size());
	for(int i=0; i<list3.size();i++)
	{
		gl.clickUsingJs(Vype_rewardsUiAndFunctionality.dropdown(i),"Down arrow");
		String FAQ=gl.getText(Vype_rewardsUiAndFunctionality.txtfaq(i));
		System.out.println((i+1)+":"+FAQ);
		gl.VerifyElementVisible(Vype_rewardsUiAndFunctionality.txtfaq(i), FAQ);
		
		
	}
	
	}

	
	
@Then("^click on click here link under faqs list$")
public void click_on_click_here_link_under_faqs_list() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	gl.ScrollPageDown();
	gl.clickLink(Vype_rewardsUiAndFunctionality.clickhere, "terms and condition link");
	Thread.sleep(2000);
   
}

@Then("^Verify the  Vuse\\+ Terms and Conditions Page is displayed as per the Production Site$")
public void verify_the_Vuse_Terms_and_Conditions_Page_is_displayed_as_per_the_Production_Site() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	//gl.VerifyPageDisplayedUsingPagetitle("Vuse Rewards Terms and Conditions");
	gl.VerifyPageDisplayed(Vype_rewardsUiAndFunctionality.termspage, "Vuse Rewards Terms and Conditions");
   gl.ScrolltoBottomofthepage();
   Thread.sleep(2000);
}


    

@Then("^verify the contents in the reward page$")
public void verify_the_contents_in_the_reward_page() throws Throwable {
   
	gl.fnScrollToView(Vype_rewardsUiAndFunctionality.txtcontents);
	
	String txtcontents = gl.getText(Vype_rewardsUiAndFunctionality.txtcontents);

	gl.VerifyElementVisible(Vype_rewardsUiAndFunctionality.txtcontents,txtcontents);
	System.out.println(txtcontents);
	
	gl.fnScrollToView(Vype_rewardsUiAndFunctionality.txtcontents1);
	String txtcontents1 = gl.getText(Vype_rewardsUiAndFunctionality.txtcontents1);

	gl.VerifyElementVisible(Vype_rewardsUiAndFunctionality.txtcontents,txtcontents1);
	System.out.println(txtcontents1);
	
   gl.ScrollPageUp(); 
}

@When("^user click on join button$")
public void user_click_on_join_button() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	gl.clickUsingJs(Vype_rewardsUiAndFunctionality.btnJoinNow1, "Click on join now");
	Thread.sleep(5000);
    
}

@Then("^verify the user redirects to the rewards page in the profile section$")
public void verify_the_user_redirects_to_the_rewards_page_in_the_profile_section() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    gl.VerifyPageDisplayedUsingPagetitle("Rewards | Vuse Canada");
    Thread.sleep(5000);
}

@Then("^verify the contents of rewards benfits in the reward page$")
public void verify_the_contents_of_rewards_benfits_in_the_reward_page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	gl.fnScrollToView(Vype_rewardsUiAndFunctionality.txtbenefits);
	List<WebElement> lst2;
	lst2 = gl.findElementsList(Vype_rewardsUiAndFunctionality.txtbenefits);
	for(int i =0;i<lst2.size();i++){
	String str = lst2.get(i).getText();
	System.out.println(str);
	gl.VerifyElementPresent(Vype_rewardsUiAndFunctionality.txtbenefits, "content: "+ str);
	}
}

@Then("^verify the contents of unlock badges in the reward page$")
public void verify_the_contents_of_unlock_badges_in_the_reward_page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	String txtunlock = gl.getText(Vype_rewardsUiAndFunctionality.txtunlock);

	gl.VerifyElementVisible(Vype_rewardsUiAndFunctionality.txtunlock,txtunlock);
	System.out.println(txtunlock);
}

@Then("^verify the contents of the page reak down  in the reward page$")
public void verify_the_contents_of_the_page_reak_down_in_the_reward_page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	gl.fnScrollToView(Vype_rewardsUiAndFunctionality.txtPointsBD);
	List<WebElement> lst1;
	lst1 = gl.findElementsList(Vype_rewardsUiAndFunctionality.txtPointsBD);
	for(int i =0;i<lst1.size();i++){
	String str = lst1.get(i).getText();
	System.out.println(str);
	gl.VerifyElementPresent(Vype_rewardsUiAndFunctionality.txtPointsBD, "content: "+ str);
	}
	gl.fnScrollToView(Vype_rewardsUiAndFunctionality.txtStartcollecting);
	String txtStartcollecting = gl.getText(Vype_rewardsUiAndFunctionality.txtStartcollecting);

	gl.VerifyElementVisible(Vype_rewardsUiAndFunctionality.txtStartcollecting,txtStartcollecting);
	System.out.println(txtStartcollecting);
	}
	
	
@When("^user click on join now  button$")
public void user_click_on_join_now_button() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	gl.fnScrollToView(Vype_rewardsUiAndFunctionality.btnJoinNow2);
	gl.clickUsingJs(Vype_rewardsUiAndFunctionality.btnJoinNow2, "Click on join now");
	Thread.sleep(2000);
    

    
}
String PurchasePoints;
String EpodPurchase;
int points;



@Then("^Verify the Rewards page is displayed with relevant information$")
public void verify_the_Rewards_page_is_displayed_with_relevant_information() throws Throwable {
	
	//verify the reward page is displayed
	gl.VerifyObjectDisplayed(Vype_rewardsUiAndFunctionality.werewardspage, "Vuse+ Vuse Reward Summary");
	
	
	//verify the current user
    String Currentuser = gl.getText(Vype_rewardsUiAndFunctionality.weCurrentuser);
	
	gl.VerifyElementVisible(Vype_rewardsUiAndFunctionality.weCurrentuser, Currentuser);

	System.out.println(">>>>>>"+Currentuser+">>>>>>>>>");
	
	
	//points displayed
	gl.fnScrollToView(Vype_rewardsUiAndFunctionality.wepoints);
	gl.VerifyElementVisible(Vype_rewardsUiAndFunctionality.wepoints, "Current points chart");
	
	String Currentpoints = gl.getText(Vype_rewardsUiAndFunctionality.weCurrentpoints);
	
	gl.VerifyElementVisible(Vype_rewardsUiAndFunctionality.weCurrentpoints, Currentpoints);

	System.out.println(">>>>>>"+Currentpoints+">>>>>>>>>");
	

	
	//Benefits section is visible
	gl.VerifyElementVisible(Vype_rewardsUiAndFunctionality.webenefits, "Your benefits"); 
	
	List<WebElement> lst;
	lst = gl.findElementsList(Vype_rewardsUiAndFunctionality.webenefitsdet);
	for(int i =0;i<lst.size();i++){
		String str = lst.get(i).getText();
		System.out.println(str);
		gl.VerifyElementPresent(Vype_rewardsUiAndFunctionality.webenefitsdet, "Your Benefits:  "+ str +" ");
	}	
	
	
	
	//your perks
	
	gl.fnScrollToView(Vype_rewardsUiAndFunctionality.weperks);
	gl.VerifyElementVisible(Vype_rewardsUiAndFunctionality.weperks, "Your Perks");
	
	List<WebElement> lst1;
	lst1 = gl.findElementsList(Vype_rewardsUiAndFunctionality.weperksdet);
	for(int i =0;i<lst1.size();i++){
		String str = lst1.get(i).getText();
		System.out.println(str);
		gl.VerifyElementPresent(Vype_rewardsUiAndFunctionality.weperksdet, "Your Perks:  "+ str);
	}	
	


    
	
	
	
	
	//Your Achievements
	gl.fnScrollToView(Vype_rewardsUiAndFunctionality.weachieve);
	
	gl.VerifyElementVisible(Vype_rewardsUiAndFunctionality.weachieve, "Your Achievements");

	List<WebElement> lst2;
	lst2 = gl.findElementsList(Vype_rewardsUiAndFunctionality.weachievedet);
	for(int i =0;i<lst2.size();i++){
		String str = lst2.get(i).getText();
		System.out.println(str);
		gl.VerifyElementPresent(Vype_rewardsUiAndFunctionality.weachievedet, "Your Achievements:  "+ str);
	}	
	
	
	
	
    //Your history
	gl.fnScrollToView(Vype_rewardsUiAndFunctionality.wehistory);
	gl.VerifyElementVisible(Vype_rewardsUiAndFunctionality.wehistorydet, "Your history");
	
  	List<WebElement> lste;
	lste = gl.findElementsList(Vype_rewardsUiAndFunctionality.wehistorydet);
	for(int i =0;i<lste.size();i++){
		String str = lste.get(i).getText();
		System.out.println(str);
		gl.VerifyElementPresent(Vype_rewardsUiAndFunctionality.wehistorydet, "Your history  "+ str);
	}	
	
}






@Then("^verify the content and toggle in the rewards page$")
public void verify_the_content_and_toggle_in_the_rewards_page() throws Throwable {
	
	
    
	
	gl.fnScrollToView(Vype_rewardsUiAndFunctionality.wecontent);
	List<WebElement> lst2;
	lst2 = gl.findElementsList(Vype_rewardsUiAndFunctionality.wecontent);
	for(int i =0;i<lst2.size();i++){
		String str = lst2.get(i).getText();
		System.out.println(str);
		gl.VerifyElementPresent(Vype_rewardsUiAndFunctionality.wecontent, "  "+ str);
	}	
	
	//toggle button in green colour
	gl.VerifyElementVisible(Vype_rewardsUiAndFunctionality.wetoggle, "Toggle button is On "); 
	
	
}



@When("^User hower on shop and click on epod2 plus Devices$")
public void user_hower_on_shop_and_click_on_epod_Devices() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    Thread.sleep(4000);
	//Hower on shop
	gl.HowerMouse(Vype_CommonXpath.lnkShop, "Shop link from the main menu navigation");
	
	// Verify the Submenu with ePod is loaded
	gl.VerifyObjectDisplayed(Vype_CommonXpath.txtepod, "ePod page");
	
	//click on epod2+ devices
	gl.clickUsingJs(Vype_rewardsUiAndFunctionality.weepod2plus,"epod2+ device");			
	
	}






@Then("^verify the epod(\\d+)\\+ device page and click on BUY NOW$")
public void verify_the_epod_device_page_and_click_on_BUY_NOW(int arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   
	//verify epod2+ device page is displaayed
	gl.VerifyObjectDisplayed(Vype_rewardsUiAndFunctionality.weepodpage, "ePod2+ page");
	
	//click on BUY NOW $14.99
	gl.clickbutton(Vype_rewardsUiAndFunctionality.webuynow, "BUY NOW $14.99");
	
	//verify choose color page
	gl.VerifyElementVisible(Vype_rewardsUiAndFunctionality.wechoose, "Choose Colour");
	
	
}





@Then("^user select device colour \"([^\"]*)\" and add to cart$")
public void user_select_device_colour_and_add_to_cart(String color) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   
	// Select any colour
    gl.clickUsingJs(Vype_CommonXpath.btnSelectDeviceColor(color), "colour selected is:" + color);
    
    Thread.sleep(3000);

    gl.VerifyElementVisible(Vype_CommonXpath.pgdevicecolour,"The Power on with the Vuse ePod2 Section");
    

	for(int i=0;i<4;i++)
	{
		gl.clickUsingJs(Vype_CommonXpath.rightarrow, "-> ");

		gl.VerifyObjectDisplayed(Vype_CommonXpath.weProductImage,"product images ");
	}

	
	// Click on Add to Cart button
	gl.clickUsingJs(Vype_CommonXpath.btnAddToCART, "Add to Cart");

	// Verify mini cart is updated
	String str;
	str = gl.getText(Vype_CommonXpath.txtnumber);
	gl.VerifyElementVisible(Vype_CommonXpath.txtnumber, "Cart is updated with " + str + " number ");

}
@Then("^Verify the newly added points in the history and epod(\\d+)\\+ badges under Your Achievements$")
public void verify_the_newly_added_points_in_the_history_and_epod_badges_under_Your_Achievements(int arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions

	gl.VerifyElementVisible(Vype_rewardsUiAndFunctionality.weachieve, "Your Achievements");
	
	gl.VerifyElementVisible(Vype_rewardsUiAndFunctionality.webadge, "epod2+ badge");
	
	
	gl.fnScrollToView(Vype_rewardsUiAndFunctionality.wehistory);
	
	gl.fnScrollToView(Vype_rewardsUiAndFunctionality.weEpod2purchasepoints);
	
	
	

		
 		EpodPurchase=gl.getText(Vype_rewardsUiAndFunctionality.weEpodPurchase);
		PurchasePoints = gl.getText(Vype_rewardsUiAndFunctionality.weEpod2purchasepoints);
		
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





@Then("^Verify the rewards Page$")
public void verify_the_rewards_Page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    
	gl.VerifyObjectDisplayed(Vype_rewardsUiAndFunctionality.werewardspage, "Vuse+ Vuse Reward Summary");
	
	//Progression bar
	gl.VerifyElementVisible(Vype_rewardsUiAndFunctionality.weprogression, "Progresion bar");
	
	//Lifetime earned points
	String EarnedPoints = gl.getText(Vype_rewardsUiAndFunctionality.weearnedPoints);
	
	gl.VerifyElementVisible(Vype_rewardsUiAndFunctionality.weearnedPoints, EarnedPoints);

	System.out.println(">>>>>>"+EarnedPoints+">>>>>>>>>");
	

	
	//Current Points Graph
	gl.VerifyElementVisible(Vype_rewardsUiAndFunctionality.wepoints, "Current points chart");
	
	
}

@Then("^Verify the Vuse\\+ Rewards banner with earned points and balance points$")
public void verify_the_Vuse_Rewards_banner_with_earned_points_and_balance_points() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	
	String Banner = gl.getText(Vype_rewardsUiAndFunctionality.webanner);
	
	gl.VerifyElementVisible(Vype_rewardsUiAndFunctionality.webanner, Banner);

	System.out.println(">>>>>>"+Banner+">>>>>>>>>");
	
	}
}