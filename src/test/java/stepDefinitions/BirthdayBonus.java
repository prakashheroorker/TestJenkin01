package stepDefinitions;

import com.rai.framework.BaseClass;
import com.rai.framework.CommonFunctions;
import com.rai.framework.RAI_Desktop_Utility_Functions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import goVype_Properties.Vype_Common;
import goVype_Properties.Vype_CommonXpath;
import goVype_Properties.Vype_Rewards;
import goVype_Properties.Vype_VusePlus_Rewards;

public class BirthdayBonus extends BaseClass{

	RAI_Desktop_Utility_Functions gl = new RAI_Desktop_Utility_Functions();
	CommonFunctions function = new CommonFunctions(gl);
	
	
	
@Then("^Verify Birthday Badge in Your Perks section$")
	public void hower_on_Profile_icon_and_Verify_Birthday_Badge_in_Your_Perks_section() throws Throwable {

	gl.fnScrollToView(Vype_Rewards.Yourperks);
	
	Thread.sleep(2000);
		
	if(gl.isObjectPresent(Vype_Rewards.BadgeBirthday,"BirthdayBadge") == true)
	{
		System.out.println("***Birthday Badge is Visible***");
	}
	
	if(gl.isObjectPresent(Vype_Rewards.BadgeBirthday,"BirthdayBadge") == false)
	{
		System.out.println("***Birthday Badge is Not Visible***");
		
		BaseClass.driver.quit();
	}
}

@And("^Verify Birthday bonus in cart summary for silver user$")
	public void verify_Birthday_bonus_in_cart_summary_for_silver_user() throws Throwable {
	
		Thread.sleep(2000);
		
		String birthdaybonus=gl.getText(Vype_CommonXpath.txtBonus);
		System.out.println("Points earned "+birthdaybonus);
		
		String discount = gl.getText(Vype_CommonXpath.BirthadayDiscount);
		String discountpoints = discount.substring(1);
	
		int finalDiscount=Integer.parseInt(discountpoints);
		
		System.out.println("Birthday bonus points for Gold user are "+finalDiscount);
		
		if(finalDiscount==500) {
			reportiumClient.reportiumAssert("500 bonus points are added for silver user", true);
		}
		else {
			reportiumClient.reportiumAssert("500 bonus points are not added for silver user", false);
		}
			
		
		gl.VerifyElementVisible(Vype_CommonXpath.txtBonus,birthdaybonus);
		
		}

@Then("^Verify birthday perk is disabled and points are added in your history section$")
public void verify_birthday_points_are_added_in_your_history_section() throws Throwable {
	
	gl.fnScrollToView(Vype_Rewards.Yourperks);
	gl.VerifyElementVisible(Vype_CommonXpath.BirthadayBadgeDisabled, "Birthday badge disabled");
	
	Thread.sleep(2000);
	
	/*gl.fnScrollToView(Vype_Rewards.Yourhistory);
	String yourbirthday=gl.getText(Vype_Rewards.txtBirthdaypoints);
	System.out.println(""+yourbirthday);
	
	gl.VerifyElementVisible(Vype_Rewards.txtBirthdaypoints,yourbirthday);*/
	
	
	
	String purchasePoints=gl.getText(Vype_Rewards.txtPurchase);
	System.out.println(""+purchasePoints);
	
	gl.VerifyElementVisible(Vype_Rewards.txtPurchase,purchasePoints);
	
	}
@And("^Verify Birthday bonus in cart summary for Gold user$")
public void verify_Birthday_bonus_in_cart_summary_for_Gold_user() throws Throwable {

	Thread.sleep(2000);
	
	String birthdaybonus=gl.getText(Vype_CommonXpath.txtBonus);
	System.out.println("Points earned "+birthdaybonus);
	
	
	String discount = gl.getText(Vype_CommonXpath.BirthadayDiscount);
	String discountpoints = discount.substring(1);
	
	int finalDiscount=Integer.parseInt(discountpoints);
	
	System.out.println("Birthday bonus points for Gold user are "+finalDiscount);
	
	if(finalDiscount==1000) {
		reportiumClient.reportiumAssert("1000 bonus points are added for silver user", true);
	}
	else {
		reportiumClient.reportiumAssert("1000 bonus points are not added for silver user", false);
	}
		
	
	gl.VerifyElementVisible(Vype_CommonXpath.txtBonus,birthdaybonus);
	
	}

@And("^Verify Birthday bonus in cart summary for Platinum user$")
public void verify_Birthday_bonus_in_cart_summary_for_Platinum_user() throws Throwable {

	Thread.sleep(2000);
	
	String birthdaybonus=gl.getText(Vype_CommonXpath.txtBonus);
	System.out.println("Points earned "+birthdaybonus);
	
	
	String discount = gl.getText(Vype_CommonXpath.BirthadayDiscount);
	String discountpoints = discount.substring(1);
	
	int finalDiscount=Integer.parseInt(discountpoints);
	
	System.out.println("Birthday bonus points for Platinum user are "+finalDiscount);
	
	if(finalDiscount==2000) {
		reportiumClient.reportiumAssert("2000 bonus points are added for Platinum user", true);
	}
	else {
		reportiumClient.reportiumAssert("2000 bonus points are not added for Platinum user", false);
	}
		
	gl.VerifyElementVisible(Vype_CommonXpath.txtBonus,birthdaybonus);
	
	}

@And("^Verify Birthday bonus in cart summary for Premium user$")
public void verify_Birthday_bonus_in_cart_summary_for_Premium_user() throws Throwable {

	Thread.sleep(2000);
	
	String birthdaybonus=gl.getText(Vype_CommonXpath.txtBonus);
	System.out.println("Points earned "+birthdaybonus);
	
	
	String discount = gl.getText(Vype_CommonXpath.BirthadayDiscount);
	String discountpoints = discount.substring(1);
	
	int finalDiscount=Integer.parseInt(discountpoints);
	
	System.out.println("Birthday bonus points for Premium user are "+finalDiscount);
	
	if(finalDiscount==3000) {
		reportiumClient.reportiumAssert("3000 bonus points are added for Premium user", true);
	}
	else {
		reportiumClient.reportiumAssert("3000 bonus points are not added for Premium user", false);
	}
		
	gl.VerifyElementVisible(Vype_CommonXpath.txtBonus,birthdaybonus);
	
	}

@And("^Verify Birthday bonus in cart summary for Supreme user$")
public void verify_Birthday_bonus_in_cart_summary_for_Supreme_user() throws Throwable {

	Thread.sleep(2000);
	
	String birthdaybonus=gl.getText(Vype_CommonXpath.txtBonus);
	System.out.println("Points earned "+birthdaybonus);
	
	
	String discount = gl.getText(Vype_CommonXpath.BirthadayDiscount);
	String discountpoints = discount.substring(1);
	
	int finalDiscount=Integer.parseInt(discountpoints);
	
	System.out.println("Birthday bonus points for Supreme user are "+finalDiscount);
	
	if(finalDiscount==5000) {
		reportiumClient.reportiumAssert("5000 bonus points are added for Supreme user", true);
	}
	else {
		reportiumClient.reportiumAssert("5000 bonus points are not added for Supreme user", false);
	}
		
	gl.VerifyElementVisible(Vype_CommonXpath.txtBonus,birthdaybonus);
	
	}
}



