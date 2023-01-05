package stepDefinitions_Mobile;

import java.text.DecimalFormat;

import com.rai.framework.BaseClass;

import com.rai.framework.CommonFunctions_Mobile;
import com.rai.framework.RAI_Mobile_Utility_Functions;

import cucumber.api.java.en.Then;

import goVype_Properties.Vype_VusePlus_Rewards;
import goVype_Properties_mobile.Vype_CommonXpath;

public class PlusRewardsDevicesDiscount extends BaseClass{

	RAI_Mobile_Utility_Functions rai = new RAI_Mobile_Utility_Functions();
	CommonFunctions_Mobile function = new CommonFunctions_Mobile(rai);
	
	//golden user
	@Then("^verify MyRewards page is displyed with golden user in mobile$")
	public void verify_MyRewards_page_is_displyed_with_golden_user_in_mobile() throws Throwable {
		//Verify rewards page is displyed
		rai.VerifyElementsVisible(Vype_VusePlus_Rewards.pgRewards, "Rewards Page");
		//Verify the user is golden user
		rai.VerifyElementsVisible(Vype_VusePlus_Rewards.txtUser, "Golden User");
	
	}

	@Then("^click on hamburger menu and click shop and click on all epod devices$")
	public void click_on_hamburger_menu_and_click_shop_and_click_on_all_epod_devices() throws Throwable {		//Hower on shop
		//click on menu
		rai.clickbutton(Vype_CommonXpath.btnmenu, "clicking on menu");
		
		rai.clickUsingJs(Vype_CommonXpath.lnkShop, "Shop link from the main menu navigation");
		//click on epod vaping products
		rai.clickUsingJs(Vype_CommonXpath.lnkdeviceandpods, "ePod Vaping Products");
		//click on all ePod Device link
		rai.clickUsingJs(Vype_CommonXpath.txtePodDevice, "All ePod Devices");
		
		//Verify the epod Device page is displyed
		rai.VerifyElementsVisible(Vype_CommonXpath.pgePodDevice, "All ePod Devices page  ");
	
		
	}

	@Then("^add device discount badge for add promotions option in checkout page in mobile$")
	public void add_device_discount_badge_for_add_promotions_option_in_checkout_page_in_mobile() throws Throwable {
		//Click on add promotion option
		//rai.clickUsingJs(Vype_VusePlus_Rewards.txtAddPromotion, "Add Promotion");
		//click on redeem link
		//rai.clickUsingJs(Vype_VusePlus_Rewards.lnkredeem, "redeem");
		//Verify device discount badge is displayed
		rai.VerifyElementsVisible(Vype_VusePlus_Rewards.imgDeviceDiscount, "15% Discount on Device");
		//click on device discount badge is displayed
		rai.clickbutton(Vype_VusePlus_Rewards.imgDeviceDiscount, "15% Discount on Device");
		//Verify the promotion is applied
		//rai.VerifyElementsVisible(Vype_VusePlus_Rewards.txtPromotionApplied, "Promotion Applied");
		
	//Getting the subtotal amount and converting to Float
	String subtotal=rai.getText(Vype_VusePlus_Rewards.txtsubtotal);
	float sub=Float.parseFloat(subtotal.substring(1));
	
		//Calculating the 15% of subtotal
	Float OrgDiscount = (Float) Math.abs((sub * 15)/100);
	
	//Taking the above result for 2 decimal points
		final DecimalFormat df= new DecimalFormat("0.00");
		String deci = df.format(OrgDiscount);
		//converting to float
		float finalDiscount=Float.parseFloat(deci);
		System.out.println("finalDiscount: "+finalDiscount);
	
	
	//Taking the discounted price and converting to float
	String discount = rai.getText(Vype_VusePlus_Rewards.txtdiscount);
	String DiscountNum = discount.substring(2);
	double DiscountPrice=Double.parseDouble(DiscountNum);
	System.out.println("Discount prise: "+DiscountPrice);
	
	//Comparing the calculated discount and discount applied
		if(finalDiscount==DiscountPrice) {
			System.out.println("15% DISCOUNT ON DEVICE is applied successfully");
			//reportiumClient.reportiumAssert("15% DISCOUNT ON DEVICE is applied successfully", true);
		}
		else {
			System.out.println("15% DISCOUNT ON DEVICE is not applied");
			//reportiumClient.reportiumAssert("15% DISCOUNT ON DEVICE is not applied", false);
		}
		
	}
//platinum user


	@Then("^add device discount badge for add promotions option in checkout page for platinum user in mobile$")
	public void add_device_discount_badge_for_add_promotions_option_in_checkout_page_for_platinum_user_in_mobile() throws Throwable {
	 	//Click on add promotion option
				//rai.clickUsingJs(Vype_VusePlus_Rewards.txtAddPromotion, "Add Promotion");
				//click on redeem link
				//rai.clickUsingJs(Vype_VusePlus_Rewards.lnkredeem, "redeem");
				//Verify device discount badge is displayed
				rai.VerifyElementsVisible(Vype_VusePlus_Rewards.imgDeviceDiscount, "25% Discount on Device");
				//click on device discount badge is displayed
				rai.clickbutton(Vype_VusePlus_Rewards.imgDeviceDiscount, "25% Discount on Device");
				//Verify the promotion is applied
				//rai.VerifyElementsVisible(Vype_VusePlus_Rewards.txtPromotionApplied, "Promotion Applied");
				
			//Getting the subtotal amount and converting to Float
			String subtotal=rai.getText(Vype_VusePlus_Rewards.txtsubtotal);
			float sub=Float.parseFloat(subtotal.substring(1));
			
			//Calculating the 25% of subtotal
			Float OrgDiscount = (Float) Math.abs((sub * 25)/100);
			
			//Taking the above result for 2 decimal points
			final DecimalFormat df= new DecimalFormat("0.00");
			String deci = df.format(OrgDiscount);
			//converting to float
			float finalDiscount=Float.parseFloat(deci);
			//System.out.println(finalDiscount);
			//Taking the discounted price and converting to float
			String discount = rai.getText(Vype_VusePlus_Rewards.txtdiscount);
			String DiscountNum = discount.substring(2);
			double DiscountPrice=Double.parseDouble(DiscountNum);
			//System.out.println(DiscountPrice);
			
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
	
	@Then("^add device discount badge for add promotions option in checkout page for premium user in mobile$")
	public void add_device_discount_badge_for_add_promotions_option_in_checkout_page_for_premium_user_in_mobile() throws Throwable {
		//Click on add promotion option
		//rai.clickUsingJs(Vype_VusePlus_Rewards.txtAddPromotion, "Add Promotion");
		//click on redeem link
		//rai.clickUsingJs(Vype_VusePlus_Rewards.lnkredeem, "redeem");
		//Verify device discount badge is displayed
		rai.VerifyElementsVisible(Vype_VusePlus_Rewards.imgDeviceDiscount, "50% Discount on Device");
		//click on device discount badge is displayed
		rai.clickbutton(Vype_VusePlus_Rewards.imgDeviceDiscount, "50% Discount on Device");
		//Verify the promotion is applied
		//rai.VerifyElementsVisible(Vype_VusePlus_Rewards.txtPromotionApplied, "Promotion Applied");
		
	//Getting the subtotal amount and converting to Float
	String subtotal=rai.getText(Vype_VusePlus_Rewards.txtsubtotal);
	float sub=Float.parseFloat(subtotal.substring(1));
	
	//Calculating the 50% of subtotal
	Double OrgDiscount = (Double) Math.abs(((sub * 50)/100)+0.01);
	
	//Taking the above result for 2 decimal points
	final DecimalFormat df= new DecimalFormat("0.00");
	String deci = df.format(OrgDiscount);
	//converting to float
	float finalDiscount=Float.parseFloat(deci);

	//Taking the discounted price and converting to float
	String discount = rai.getText(Vype_VusePlus_Rewards.txtdiscount);
	String DiscountNum = discount.substring(2);
	double DiscountPrice=Double.parseDouble(DiscountNum);
	
	//Comparing the calculated discount and discount applied
		if(finalDiscount==DiscountPrice) {
			System.out.println("50% DISCOUNT ON DEVICE is applied successfully");
			reportiumClient.reportiumAssert("50% DISCOUNT ON DEVICE is applied successfully", true);
		}
		else {
			System.out.println("50% DISCOUNT ON DEVICE is not applied");
			reportiumClient.reportiumAssert("50% DISCOUNT ON DEVICE is not applied", false);
		}
	}
	
	//silver user

	@Then("^verify discount on device badge is not displayed in mobile$")
	public void verify_discount_on_device_badge_is_not_displayed_in_mobile() throws Throwable {
		//Click on add promotion option
				//rai.clickUsingJs(Vype_VusePlus_Rewards.txtAddPromotion, "Add Promotion");
				//click on redeem link
				//rai.clickUsingJs(Vype_VusePlus_Rewards.lnkredeem, "redeem");
				
			   //Verify the badge is not displayed
			   rai.verifyobjectisnotavailable(Vype_VusePlus_Rewards.imgDeviceDiscount);
			   
	}
}



