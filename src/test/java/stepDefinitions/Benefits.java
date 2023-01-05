package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;


import com.rai.framework.BaseClass;
import com.rai.framework.CommonFunctions;

import com.rai.framework.RAI_Desktop_Utility_Functions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import goVype_Properties.Vype_Cart;

import goVype_Properties.Vype_Common;

import goVype_Properties.Vype_OrderConfirmation;
import goVype_Properties.Vype_PlatinumProfileTrigger;
import goVype_Properties.Vype_Rewards;
import goVype_Properties.Vype_SilverProfileTrigger;
import goVype_Properties.Vype_StatusOfBenefits;

public class Benefits extends BaseClass{
	
	RAI_Desktop_Utility_Functions gl = new RAI_Desktop_Utility_Functions();
	CommonFunctions function = new CommonFunctions(gl);
	
	

	String copyCode=""; String couponCode="";
	String OrderValue=""; String couponCodeTxt =""; int cnt=0; boolean couponHit = false;
	
	@When("^Click Rewards Page Is$")
	public void validate_Rewards_Page_Is() throws Throwable {
		gl.HowerMouse(Vype_Common.btnProfile, "profile Icon");
		gl.clickbutton(Vype_Common.btnAccount, "My account");
		gl.clickLink(Vype_PlatinumProfileTrigger.pgRewards, "Rewards Page");
		Thread.sleep(3000);
		gl.clickbutton(By.xpath("(.//*[text()='Rewards'])"), "Rewards");
		Thread.sleep(3000);
	}

	@Then("^Verify Whether Gold Card Is Displayed$")
	public void verify_Whether_Gold_Card_Is_Displayed() throws Throwable {
		gl.VerifyObjectDisplayed(Vype_PlatinumProfileTrigger.weGoldCard, "Gold Card Is Displayed");
	}



	@Then("^Verify Whether Shipping Is Free$")
	public void verify_Delivery_Page_Is_Displayed_and_Verify_Whether_Shipping_Is_Free() throws Throwable {
		gl.fnScrollToView(Vype_PlatinumProfileTrigger.shippingValue);
		//Verify Whether Shipping Is Free
		gl.VerifyObjectDisplayed(Vype_PlatinumProfileTrigger.shippingValue, "Shipping Is Free");
	}

	@Then("^Verify Whether Benifits Are Displayed \"([^\"]*)\"$")
	public void verify_Whether_Benifits_Are_Displayed(String Benifits) throws Throwable {
		gl.fnContentValidation(Benifits,Vype_PlatinumProfileTrigger.txtPlatinumBenifitsPoints);
		gl.fnScrollToView(Vype_PlatinumProfileTrigger.txtPlatinumBenifitsPoints);
		gl.VerifyObjectDisplayed(Vype_PlatinumProfileTrigger.txtPlatinumBenifitsPoints, "Gold Benifits Are Displayed");
	}

	@Then("^Verify Whether Platinum Card Is Displayed$")
	public void verify_Whether_Platinum_Card_Is_Displayed() throws Throwable {
		String platinumText = gl.getText(Vype_PlatinumProfileTrigger.wePlatinumCard);
		if(platinumText.equalsIgnoreCase("platinum")){
			gl.VerifyObjectDisplayed(Vype_PlatinumProfileTrigger.wePlatinumCard, "Platinum Card Is Displayed");
		}
	}
	
	@Then("^Verify Silver tier card and couponCode is displayed$")
	public void verify_Silver_tier_card_and_couponCode_is_displayed() throws Throwable{
		gl.VerifyElementVisible(Vype_Rewards.txtSilver, "Silver tier Card");
		List<WebElement> copyCode = rdriver.findElements(Vype_Rewards.lnkCopyCode);
		List<WebElement> couponCode = rdriver.findElements(Vype_Rewards.txtCoupon15);
		
		for (WebElement cc : copyCode)
		{
			if (cc.isEnabled())
			{
				//Copy the coupon text
				couponCodeTxt = couponCode.get(cnt).getText();
				couponHit = true;
				break;
			}
			cnt++;
		}
		
		if(!couponHit)
		{
			
			throw new NullPointerException("No Valid Coupons");
		}
		
	}

	@Then("^Navigate to cart page$")
	public void navigate_to_cart_page_and_click_on_checkout_and_navigate_to_delivary_page() throws Throwable {
		
		function.hoverCartAndClickViewCart();
		Thread.sleep(3000);
	}

	@When("^click on promotion and Enter discount code \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void click_on_promotion_and_Enter_discount_code(String UserCardNumber, String UserCardExpiryDate, String UserCardCVV, String UserCardFullName) throws Throwable {
		//click on promotion
        gl.clickbutton(Vype_Cart.btnAddpromotion, "Add Promotion");
        //Click the Add button
        gl.clickbutton(Vype_Cart.btnAdddiscount, "Add");
		//Enter discount code
		gl.inputText(Vype_Cart.edtDiscountCode, "Discount", couponCodeTxt);
		//Click the Add button to apply discount
	    gl.clickbutton(Vype_Cart.btnAddingDiscount, "Add discount");
	    gl.fnScrollToView(Vype_Cart.weScrollToCheckout);
        function.checkoutAndSubmiOrder(UserCardNumber, UserCardExpiryDate, UserCardCVV, UserCardFullName);
        Thread.sleep(3000);
		function.verifyOrderConfirmationPage();
	}

	@Then("^Verify applied discount is displayed$")
	public void verify_applied_discount_is_displayed() throws Throwable {
		gl.VerifyElementVisible(Vype_OrderConfirmation.weTxtDiscount, "Order Summary's Discount Row");
	}
	
	@Then("^Verify Green tick is displayed in front of birthday gift$")
	public void verify_Green_tick_is_displayed_in_front_of_birthday_gift() throws Throwable {
		gl.VerifyElementVisible(Vype_Rewards.weGreenTickBirthdayGift, "Green tick in front of Birthday gift text");
	}

	@Then("^Verify statues$")
	public void verify_statues() throws Throwable {
		//gl.fnScrollToView(Vype_SilverProfileTrigger.labelYourStatus);
		//gl.ScrollPageDown();
		gl.VerifyPageDisplayed(Vype_SilverProfileTrigger.labelYourStatus, "Rewards Page");
	}

	@When("^Hower on Save and Click on Vuse\\+ Rewards under Programs$")
	public void hower_on_Save_and_Click_on_Vuse_Rewards_under_Programs() throws Throwable {
		gl.HowerMouse(Vype_Common.lnkSave, "Hower on Save");
		gl.clickbutton(Vype_PlatinumProfileTrigger.lnkVusePlus, "Vuse+ Link Is Clicked");
	}

	@Then("^Validate Whether Vuse \\+ Page Is Displayed$")
	public void validate_Whether_Vuse_Page_Is_Displayed() throws Throwable {
		gl.VerifyObjectDisplayed(Vype_PlatinumProfileTrigger.pgVusePlus, "Vuse+ Page");
	}

	@When("^Click on find your status button$")
	public void click_on_find_your_status_button() throws Throwable {
		gl.fnScrollToView(Vype_SilverProfileTrigger.lnkFindYourStatus);
		gl.clickbutton(Vype_SilverProfileTrigger.lnkFindYourStatus, "Find Your Status");
	}

	@Then("^Verify Reward page is displayed with relevent content$")
	public void verify_Reward_page_is_displayed_with_relevent_content() throws Throwable {
		gl.fnScrollToView(Vype_SilverProfileTrigger.labelYourStatus);
		gl.VerifyPageDisplayed(Vype_SilverProfileTrigger.labelYourStatus, "Rewards Page");	
	}
	
	@Then("^Verify the Content is dispalyed on Rewards Section$")
	public void verify_the_Content_is_dispalyed_on_Rewards_Section() throws Throwable {
		gl.VerifyElementVisible(Vype_StatusOfBenefits.txtHiTrudie, "Hi Trudie, you've peaked at Platinum!");
		gl.VerifyElementVisible(Vype_StatusOfBenefits.txtCongratulation, "Congratulations! Platinum status gives you the most offers.");
		gl.VerifyElementVisible(Vype_StatusOfBenefits.txtYourPlatinumBenefits, "Your other Platinum benefits");
		gl.VerifyElementVisible(Vype_StatusOfBenefits.txtYourStatusProgress, "Your status progress");
		gl.VerifyElementVisible(Vype_StatusOfBenefits.txtSyncYourStatus, "Sync Your Status");
		
	}

	@When("^Click on orders$")
	public void click_on_orders() throws Throwable {
		gl.fnScrollToView(Vype_StatusOfBenefits.lnkOrders);
		gl.clickbutton(Vype_StatusOfBenefits.lnkOrders, "Click on Orders");
	}

	@Then("^Verify order Page Content$")
	public void verify_order_Page_Content() throws Throwable {
		gl.VerifyElementVisible(Vype_StatusOfBenefits.txtOrderNumber, "Order Page");
		gl.VerifyElementVisible(Vype_StatusOfBenefits.txtOrderNumber, "Order Number");
		gl.VerifyElementVisible(Vype_StatusOfBenefits.txtOrderDate, "Order Date");
		gl.VerifyElementVisible(Vype_StatusOfBenefits.txtTotalDollarValue, "Total $ Value");
		gl.VerifyElementVisible(Vype_StatusOfBenefits.lnkReOrder, "Re-Order");
	}

	@Then("^Click on profile and enter details and verify unsubscribe text$")
	public void click_on_profile_and_enter_details_and_verify_unsubscribe_text() throws Throwable {
		gl.clickbutton(Vype_SilverProfileTrigger.textProfile, "Profiles Page");
		gl.fnTextContains("trudie.lueilwitz2@bat.com", Vype_StatusOfBenefits.txtEmailAddress);
		gl.fnTextContains("•••••••••••••", Vype_StatusOfBenefits.txtPassword);
		gl.VerifyElementPresent(Vype_StatusOfBenefits.txtIfYouUnsubscribe, "If You UnSubscribe");
		
	}
	
	@Then("^Verify Silver tier card is displayed$")
	public void verify_Silver_tier_card_is_displayed() throws Throwable {
	gl.VerifyElementVisible(Vype_Rewards.txtSilver, "Silver tier Card");

	}
}
