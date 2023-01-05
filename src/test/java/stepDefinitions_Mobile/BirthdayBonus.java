package stepDefinitions_Mobile;

import com.rai.framework.BaseClass;
import com.rai.framework.CommonFunctions_Mobile;
import com.rai.framework.RAI_Mobile_Utility_Functions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import goVype_Properties_mobile.Vype_Rewards;
import goVype_Properties_mobile.Vype_CommonXpath;

public class BirthdayBonus extends BaseClass{

	RAI_Mobile_Utility_Functions rai = new RAI_Mobile_Utility_Functions();
	CommonFunctions_Mobile function = new CommonFunctions_Mobile(rai);
	
	
	@Then("^Verify Birthday Badge in Your Perks section in mobile$")
	public void hower_on_Profile_icon_and_Verify_Birthday_Badge_in_Your_Perks_section() throws Throwable {

	rai.ScrollByxpath(Vype_Rewards.Yourperks1);
	
	Thread.sleep(2000);
		
	if(rai.isObjectPresent(Vype_Rewards.BadgeBirthday1,"BirthdayBadge") == true)
	{
		System.out.println("***Birthday Badge is Visible***");
	}
	
	if(rai.isObjectPresent(Vype_Rewards.BadgeBirthday1,"BirthdayBadge") == false)
	{
		System.out.println("***Birthday Badge is Not Visible***");
		
		BaseClass.driver.quit();
	}
}

@And("^Verify Birthday bonus in cart summary for silver user in mobile$")
	public void verify_Birthday_bonus_in_cart_summary_for_silver_user() throws Throwable {
	
		Thread.sleep(2000);
		
		String birthdaybonus=rai.getText(Vype_CommonXpath.txtBonus);
		System.out.println("Points earned "+birthdaybonus);
		
		String discount = rai.getText(Vype_CommonXpath.BirthadayDiscount);
		String discountpoints = discount.substring(1);
	
		int finalDiscount=Integer.parseInt(discountpoints);
		
		System.out.println("Birthday bonus points for silver user are "+finalDiscount);
		
		if(finalDiscount==500) {
			reportiumClient.reportiumAssert("500 bonus points are added for silver user", true);
		}
		else {
			reportiumClient.reportiumAssert("500 bonus points are not added for silver user", false);
		}
			
		
		rai.VerifyElementVisible(Vype_CommonXpath.txtBonus,birthdaybonus);
		
		}

@Then("^Verify birthday perk is disabled and points are added in your history section in mobile$")
public void verify_birthday_points_are_added_in_your_history_section() throws Throwable {
	
	rai.ScrollByxpath(Vype_Rewards.Yourperks1);
	rai.VerifyElementVisible(Vype_CommonXpath.BirthadayBadgeDisabled, "Birthday badge disabled");
	
	Thread.sleep(2000);
	
	rai.ScrollByxpath(Vype_Rewards.Yourhistory1);
	/*String yourbirthday=rai.getText(Vype_Rewards.txtBirthdaypoints);
	System.out.println(""+yourbirthday);
	
	rai.VerifyElementVisible(Vype_Rewards.txtBirthdaypoints,yourbirthday);*/
	

	
	String purchasePoints=rai.getText(Vype_Rewards.txtPurchase);
	System.out.println(""+purchasePoints);
	
	rai.VerifyElementVisible(Vype_Rewards.txtPurchase,purchasePoints);
	
	}
@And("^Verify Birthday bonus in cart summary for Gold user in mobile$")
public void verify_Birthday_bonus_in_cart_summary_for_Gold_user() throws Throwable {

	Thread.sleep(2000);
	
	String birthdaybonus=rai.getText(Vype_CommonXpath.txtBonus);
	System.out.println("Points earned "+birthdaybonus);
	
	
	String discount = rai.getText(Vype_CommonXpath.BirthadayDiscount);
	String discountpoints = discount.substring(1);
	
	int finalDiscount=Integer.parseInt(discountpoints);
	
	System.out.println("Birthday bonus points for Gold user are "+finalDiscount);
	
	if(finalDiscount==1000) {
		reportiumClient.reportiumAssert("1000 bonus points are added for Gold user", true);
	}
	else {
		reportiumClient.reportiumAssert("1000 bonus points are not added for Gold user", false);
	}
		
	
	rai.VerifyElementVisible(Vype_CommonXpath.txtBonus,birthdaybonus);
	
	}

@And("^Verify Birthday bonus in cart summary for Platinum user in mobile$")
public void verify_Birthday_bonus_in_cart_summary_for_Platinum_user() throws Throwable {

	Thread.sleep(2000);
	
	String birthdaybonus=rai.getText(Vype_CommonXpath.txtBonus);
	System.out.println("Points earned "+birthdaybonus);
	
	
	String discount = rai.getText(Vype_CommonXpath.BirthadayDiscount);
	String discountpoints = discount.substring(1);
	
	int finalDiscount=Integer.parseInt(discountpoints);
	
	System.out.println("Birthday bonus points for Platinum user are "+finalDiscount);
	
	if(finalDiscount==2000) {
		reportiumClient.reportiumAssert("2000 bonus points are added for Platinum user", true);
	}
	else {
		reportiumClient.reportiumAssert("2000 bonus points are not added for Platinum user", false);
	}
		
	rai.VerifyElementVisible(Vype_CommonXpath.txtBonus,birthdaybonus);
	
	}

@And("^Verify Birthday bonus in cart summary for Premium user in mobile$")
public void verify_Birthday_bonus_in_cart_summary_for_Premium_user() throws Throwable {

	Thread.sleep(2000);
	
	String birthdaybonus=rai.getText(Vype_CommonXpath.txtBonus);
	System.out.println("Points earned "+birthdaybonus);
	
	
	String discount = rai.getText(Vype_CommonXpath.BirthadayDiscount);
	String discountpoints = discount.substring(1);
	
	int finalDiscount=Integer.parseInt(discountpoints);
	
	System.out.println("Birthday bonus points for Premium user are "+finalDiscount);
	
	if(finalDiscount==3000) {
		reportiumClient.reportiumAssert("3000 bonus points are added for Premium user", true);
	}
	else {
		reportiumClient.reportiumAssert("3000 bonus points are not added for Premium user", false);
	}
		
	rai.VerifyElementVisible(Vype_CommonXpath.txtBonus,birthdaybonus);
	
	}

@And("^Verify Birthday bonus in cart summary for Supreme user in mobile$")
public void verify_Birthday_bonus_in_cart_summary_for_Supreme_user() throws Throwable {

	Thread.sleep(2000);
	
	String birthdaybonus=rai.getText(Vype_CommonXpath.txtBonus);
	System.out.println("Points earned "+birthdaybonus);
	
	
	String discount = rai.getText(Vype_CommonXpath.BirthadayDiscount);
	String discountpoints = discount.substring(1);
	
	int finalDiscount=Integer.parseInt(discountpoints);
	
	System.out.println("Birthday bonus points for Supreme user are "+finalDiscount);
	
	if(finalDiscount==5000) {
		reportiumClient.reportiumAssert("5000 bonus points are added for Supreme user", true);
	}
	else {
		reportiumClient.reportiumAssert("5000 bonus points are not added for Supreme user", false);
	}
		
	rai.VerifyElementVisible(Vype_CommonXpath.txtBonus,birthdaybonus);
	
	}

/*	@Then("^User click on hamberger menu and Verify Birthday Badge in My Rewards page$")
	public void user_click_on_hamberger_menu_and_Verify_Birthday_Badge_in_My_Rewards_page() throws Throwable {
		
		function.viewRewardspage();
		
		Thread.sleep(2000);
		
		rai.ScrollByxpath(Vype_Rewards.Yourperks1);
		
		Thread.sleep(2000);
		
		if(rai.isObjectPresent(Vype_Rewards.BadgeBirthday1,"BirthdayBadge") == true)
		{
			System.out.println("***Birthday Badge is Visible***");
		}
		
		if(rai.isObjectPresent(Vype_Rewards.BadgeBirthday1,"BirthdayBadge") == false)
		{
			System.out.println("***Birthday Badge is Not Visible***");
			
			BaseClass.driver.quit();
		}
	    
}

	@Then("^Hower on cart icon and click on view cart and verify Birthday bonus in cart summary$")
	public void hower_on_cart_icon_and_click_on_view_cart_and_verify_Birthday_bonus_in_cart_summary() throws Throwable {
		
		try {

			// Click on the Cart icon
			rai.clickLink(Vype_CommonXpath.lnkCartIcon, "Cart Icon");
			
			Thread.sleep(5000);

			// Verify that Shipping Cart page
			
			String birthdaybonus=rai.getText(Vype_Rewards.txtBonus1);
			System.out.println("Points earned "+birthdaybonus);
			
			rai.VerifyElementVisible(Vype_Rewards.txtBonus1,birthdaybonus);
			Thread.sleep(2000);
			
			rai.VerifyElementVisible(Vype_CommonXpath.pgCart, "Shipping Cart");

			String products=rai.getText(Vype_CommonXpath.productdetails);
			System.out.println(products);

			rai.VerifyElementVisible(Vype_CommonXpath.productdetails,products);
			
			rai.ScrollByxpath(Vype_CommonXpath.cartsummary);
			rai.VerifyElementVisible(Vype_CommonXpath.cartsummary,"Cart summary");


		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	@Then("^User click on hamberger menu and verify birthday point in your history section$")
	public void user_click_on_hamberger_menu_and_verify_birthday_point_in_your_history_section() throws Throwable {
		
		function.viewRewardspage();
		
		Thread.sleep(2000);
		
		rai.ScrollByxpath(Vype_Rewards.Yourhistory1);
		
		Thread.sleep(2000);
		
		String yourbirthday=rai.getText(Vype_Rewards.txtBirthdaypoints);
		System.out.println(""+yourbirthday);
		
		rai.VerifyElementVisible(Vype_Rewards.txtBirthdaypoints,yourbirthday);
		
		
		String purchasePoints=rai.getText(Vype_Rewards.txtPurchase);
		System.out.println(""+purchasePoints);
		
		rai.VerifyElementVisible(Vype_Rewards.txtPurchase,purchasePoints);
		
	}*/

}
