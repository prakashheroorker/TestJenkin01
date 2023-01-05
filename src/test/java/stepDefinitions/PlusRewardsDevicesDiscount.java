package stepDefinitions;

import java.text.DecimalFormat;

import com.rai.framework.BaseClass;
import com.rai.framework.CommonFunctions;
import com.rai.framework.RAI_Desktop_Utility_Functions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import goVype_Properties.Vype_CommonXpath;
import goVype_Properties.Vype_VusePlus_Rewards;

public class PlusRewardsDevicesDiscount extends BaseClass{

	RAI_Desktop_Utility_Functions gl = new RAI_Desktop_Utility_Functions();
	CommonFunctions function = new CommonFunctions(gl);
	
	@Then("^verify MyRewards page is displyed with golden user$")
	public void verify_MyRewards_page_is_displyed_with_golden_user() throws Throwable {
		//Verify rewards page is displyed
		gl.VerifyObjectDisplayed(Vype_VusePlus_Rewards.pgRewards, "Rewards Page");
		//Verify the user is golden user
		gl.VerifyObjectDisplayed(Vype_VusePlus_Rewards.txtUser, "Golden User");
	
	}

	@Then("^hower on shop and click on all epod devices$")
	public void hower_on_shop_and_click_on_all_epod_devices() throws Throwable {
		//Hower on shop
		gl.HowerMouse(Vype_CommonXpath.lnkShop, "Shop link from the main menu navigation");
		//click on all ePod Device link
		gl.clickUsingJs(Vype_CommonXpath.txtePodDevice, "All ePod Devices");
		//Verify the epod Device page is displyed
		gl.VerifyObjectDisplayed(Vype_CommonXpath.pgePodDevice, "All ePod Devices page  ");
		//gl.ScrollPageDown();
		
	}

	@Then("^add device discount badge for add promotions option in checkout page$")
	public void add_device_discount_badge_for_add_promotions_option_in_checkout_page() throws Throwable {
		//Click on add promotion option
		gl.clickUsingJs(Vype_VusePlus_Rewards.txtAddPromotion, "Add Promotion");
		//click on redeem link
		gl.clickUsingJs(Vype_VusePlus_Rewards.lnkredeem, "redeem");
		//Verify device discount badge is displayed
		gl.VerifyObjectDisplayed(Vype_VusePlus_Rewards.imgDeviceDiscount, "15% Discount on Device");
		//click on device discount badge is displayed
		gl.clickUsingJs(Vype_VusePlus_Rewards.imgDeviceDiscount, "15% Discount on Device");
		//Verify the promotion is applied
		gl.VerifyObjectDisplayed(Vype_VusePlus_Rewards.txtPromotionApplied, "Promotion Applied");
		
	//Getting the subtotal amount and converting to Float
	String subtotal=gl.getText(Vype_VusePlus_Rewards.txtsubtotal);
	float sub=Float.parseFloat(subtotal.substring(1));
	
		//Calculating the 15% of subtotal
	Float OrgDiscount = (Float) Math.abs((sub * 15)/100);
	
	//Taking the above result for 2 decimal points
		final DecimalFormat df= new DecimalFormat("0.00");
		String deci = df.format(OrgDiscount);
		//converting to float
		float finalDiscount=Float.parseFloat(deci);
	
	//Taking the discounted price and converting to float
	String discount = gl.getText(Vype_VusePlus_Rewards.txtdiscount);
	String DiscountNum = discount.substring(2);
	double DiscountPrice=Double.parseDouble(DiscountNum);
	
	//Comparing the calculated discount and discount applied
		if(finalDiscount==DiscountPrice) {
			System.out.println("15% DISCOUNT ON DEVICE is applied successfully");
			reportiumClient.reportiumAssert("15% DISCOUNT ON DEVICE is applied successfully", true);
		}
		else {
			System.out.println("15% DISCOUNT ON DEVICE is not applied");
			reportiumClient.reportiumAssert("15% DISCOUNT ON DEVICE is not applied", false);
		}
		
	}
//platinum user
	@Then("^rewards page should be displyed with platinum user$")
	public void rewards_page_should_be_displyed_with_platinum_user() throws Throwable {
			//Verify rewards page is displyed
		gl.VerifyObjectDisplayed(Vype_VusePlus_Rewards.pgRewards, "Rewards Page");
		//Verify the user is platinum user
		gl.VerifyObjectDisplayed(Vype_VusePlus_Rewards.txtUser, "Platinum User");
	}

	@Then("^add device discount badge in checkout page for platinum user$")
	public void add_device_discount_badge_in_checkout_page_for_platinum_user() throws Throwable {
	 	//Click on add promotion option
				gl.clickUsingJs(Vype_VusePlus_Rewards.txtAddPromotion, "Add Promotion");
				//click on redeem link
				gl.clickUsingJs(Vype_VusePlus_Rewards.lnkredeem, "redeem");
				//Verify device discount badge is displayed
				gl.VerifyObjectDisplayed(Vype_VusePlus_Rewards.imgDeviceDiscount, "25% Discount on Device");
				//click on device discount badge is displayed
				gl.clickUsingJs(Vype_VusePlus_Rewards.imgDeviceDiscount, "25% Discount on Device");
				//Verify the promotion is applied
				gl.VerifyObjectDisplayed(Vype_VusePlus_Rewards.txtPromotionApplied, "Promotion Applied");
				
			//Getting the subtotal amount and converting to Float
			String subtotal=gl.getText(Vype_VusePlus_Rewards.txtsubtotal);
			float sub=Float.parseFloat(subtotal.substring(1));
			
			//Calculating the 25% of subtotal
			Float OrgDiscount = (Float) Math.abs((sub * 25)/100);
			
			//Taking the above result for 2 decimal points
			final DecimalFormat df= new DecimalFormat("0.00");
			String deci = df.format(OrgDiscount);
			//converting to float
			float finalDiscount=Float.parseFloat(deci);
			System.out.println(finalDiscount);
			//Taking the discounted price and converting to float
			String discount = gl.getText(Vype_VusePlus_Rewards.txtdiscount);
			String DiscountNum = discount.substring(2);
			double DiscountPrice=Double.parseDouble(DiscountNum);
			System.out.println(DiscountPrice);
			
			//Comparing the calculated discount and discount applied
				if(finalDiscount==DiscountPrice) {
					System.out.println("25% DISCOUNT ON DEVICE is applied successfully");
					reportiumClient.reportiumAssert("25% DISCOUNT ON DEVICE is applied successfully", true);
				}
				else {
					System.out.println("15% DISCOUNT ON DEVICE is not applied");
					reportiumClient.reportiumAssert("25% DISCOUNT ON DEVICE is not applied", false);
				}
				
			}
	
//premium user
	@Then("^rewards page should be displyed with premium user$")
	public void rewards_page_should_be_displyed_with_premium_user() throws Throwable {
		//Verify rewards page is displyed
				gl.VerifyObjectDisplayed(Vype_VusePlus_Rewards.pgRewards, "Rewards Page");
				//Verify the user is premium user
				gl.VerifyObjectDisplayed(Vype_VusePlus_Rewards.txtUser, "Premium User");
	}

	@Then("^add device discount badge in checkout page for premium user$")
	public void add_device_discount_badge_in_checkout_page_for_premium_user() throws Throwable {
		//Click on add promotion option
		gl.clickUsingJs(Vype_VusePlus_Rewards.txtAddPromotion, "Add Promotion");
		//click on redeem link
		gl.clickUsingJs(Vype_VusePlus_Rewards.lnkredeem, "redeem");
		//Verify device discount badge is displayed
		gl.VerifyObjectDisplayed(Vype_VusePlus_Rewards.imgDeviceDiscount, "50% Discount on Device");
		//click on device discount badge is displayed
		gl.clickUsingJs(Vype_VusePlus_Rewards.imgDeviceDiscount, "50% Discount on Device");
		//Verify the promotion is applied
		gl.VerifyObjectDisplayed(Vype_VusePlus_Rewards.txtPromotionApplied, "Promotion Applied");
		
	//Getting the subtotal amount and converting to Float
	String subtotal=gl.getText(Vype_VusePlus_Rewards.txtsubtotal);
	float sub=Float.parseFloat(subtotal.substring(1));
	
	//Calculating the 50% of subtotal
	Float OrgDiscount = (Float) Math.abs((sub * 50)/100);
	
	//Taking the above result for 2 decimal points
	final DecimalFormat df= new DecimalFormat("0.00");
	String deci = df.format(OrgDiscount);
	//converting to float
	float finalDiscount=Float.parseFloat(deci);

	//Taking the discounted price and converting to float
	String discount = gl.getText(Vype_VusePlus_Rewards.txtdiscount);
	String DiscountNum = discount.substring(2);
	double DiscountPrice=Double.parseDouble(DiscountNum);
	
	//Comparing the calculated discount and discount applied
		if(finalDiscount==DiscountPrice) {
			System.out.println("50% DISCOUNT ON DEVICE is applied successfully");
			//reportiumClient.reportiumAssert("50% DISCOUNT ON DEVICE is applied successfully", true);
		}
		else {
			System.out.println("50% DISCOUNT ON DEVICE is not applied");
			//reportiumClient.reportiumAssert("50% DISCOUNT ON DEVICE is not applied", false);
		}
	}
	
	//silver user
	@Then("^verify discount on device badge is not displayed$")
	public void verify_discount_on_device_badge_is_not_displayed() throws Throwable {
		//Click on add promotion option
				gl.clickUsingJs(Vype_VusePlus_Rewards.txtAddPromotion, "Add Promotion");
				//click on redeem link
				gl.clickUsingJs(Vype_VusePlus_Rewards.lnkredeem, "redeem");
				
			   //Verify the badge is not displayed
			   gl.verifyobjectisnotavailable(Vype_VusePlus_Rewards.imgDeviceDiscount);
			   
	}
}



