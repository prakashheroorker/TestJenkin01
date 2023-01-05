package stepDefinitions;

import java.text.DecimalFormat;

import com.rai.framework.BaseClass;
import com.rai.framework.CommonFunctions;
import com.rai.framework.RAI_Desktop_Utility_Functions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import goVype_Properties.Vype_CancelOrder;
import goVype_Properties.Vype_Cart;
import goVype_Properties.Vype_ClickandCollect;
import goVype_Properties.Vype_CommonXpath;
import goVype_Properties.Vype_Rewards;
import goVype_Properties.Vype_VusePlus_Rewards;

public class TrailBusinessWorkflow extends BaseClass {

	RAI_Desktop_Utility_Functions gl = new RAI_Desktop_Utility_Functions();
	CommonFunctions function = new CommonFunctions(gl);

	String Discount;
	String onetime;
	int price;
	String applied;
	float DiscountPrice;
	

	@When("^User hover on save and click on starter bundle under offers$")
	public void user_hover_on_save_and_click_on_starter_bundle_under_offers() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// Hower on save
		gl.HowerMouse(Vype_CommonXpath.txtsave, "Save");

		// Click the buy now button Starterbundle tile
		gl.clickbutton(Vype_CommonXpath.btnStarterBundleBuyNow, "Starter Bundle from $19.99");

	}

	
	
	@Then("^Verify choose your device colour page is displayed$")
	public void verify_choose_your_device_colour_page_is_displayed() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

		// Verify Starter Bundle customize page is displayed
		gl.VerifyElementVisible(Vype_CommonXpath.txtYourcolours, "Starter bundle customize page is displayed");

		// Scroll to view the start customising button
		gl.fnScrollToView(Vype_CommonXpath.btnstartcustomising);

		Thread.sleep(2000);

		// click on start customizing
		gl.VerifyElementVisible(Vype_CommonXpath.btnstartcustomising, "Start Customising");
	}
	
	
	
	
	
	@When("^User click on start customizing and verify the choose your device colour page$")
	public void user_click_on_start_customizing_and_verify_the_choose_your_device_colour_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  
		// click on start customizing
		gl.clickbutton(Vype_CommonXpath.btnstartcustomising, "Start Customising");
		
		gl.VerifyElementVisible(Vype_CommonXpath.btndevicecolor, "Choose your device colour");
		
		gl.VerifyElementVisible(Vype_CommonXpath.btndevicecolorsel, "Choose your device colour slection");
		
		//click on choose color
		gl.VerifyElementVisible(Vype_CommonXpath.btnchoosecolour, "Choose this colour");
		
	}
	
	
	@When("^Click on device color \"([^\"]*)\" and verify the image displayed$")
	public void click_on_device_color_and_verify_the_image_displayed(String devicecolour) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  
		//Verify "Choose your device colour" page is displayed
				gl.clickbutton(Vype_CommonXpath.btnChoosecolour(devicecolour), "Choose your device colour page");

				gl.VerifyElementVisible(Vype_CommonXpath.btnchosseimage,"image ");
//				
				Thread.sleep(2000);
	    
	    
		
		
	}

	@When("^Click on choose this color and verify choose your pods page$")
	public void click_on_choose_this_color_and_verify_choose_your_pods_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
		
		//click on choose color
		gl.clickbutton(Vype_CommonXpath.btnchoosecolour, "Choose this colour");
		
		//Verify "Choose your pack of pods" page is displayed
		gl.VerifyElementVisible(Vype_CommonXpath.btnchooseflavour, "Choose your pack of pods page");
		
		gl.VerifyElementVisible(Vype_CommonXpath.btnflavour, "flavours");
		
		gl.VerifyElementVisible(Vype_CommonXpath.btnnicstr,"Choose Nicotine Strength");
		
		//choose pod pack
		gl.VerifyElementVisible(Vype_CommonXpath.btnchoosepodpack,"Choose pod flavor");
		
		


	}
	
	
	@When("^Click on any flavor \"([^\"]*)\" with \"([^\"]*)\"$")
	public void click_on_any_flavor_with(String flavor, String Strength) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  
		//click on choose flavor
		gl.clickbutton(Vype_CommonXpath.imgflvor(flavor),flavor);
		
		//choose Nicotine strength
		gl.clickbutton(Vype_CommonXpath.btnstrength(Strength),Strength);


	}

	@Then("^Verify the flavour \"([^\"]*)\" image$")
	public void verify_the_flavour_image(String flavor) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  
		gl.VerifyElementVisible(Vype_CommonXpath.btnflavorimage(flavor),"Choose pod flavor image");
	}
	
	@When("^User click on choose pod pack and verify starter kit page$")
	public void user_click_on_choose_pod_pack_and_verify_starter_kit_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

		// choose pod pack
		gl.clickbutton(Vype_CommonXpath.btnchoosepodpack, "Choose pod flavor");

		// Verify "View your bundle" page is displayed
		gl.VerifyElementVisible(Vype_CommonXpath.btnproceed, "View your bundle page");

		//  Proceed to checkout button
		gl.VerifyElementVisible(Vype_CommonXpath.btnproceed, "Cliked on Proceed to checkout");

	}
	
	@When("^Click on proceed to checkout and verify your cart page is displayed$")
	public void click_on_proceed_to_checkout_and_verify_your_cart_page_is_displayed() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

		// Click on Proceed to checkout button
		gl.clickUsingJs(Vype_CommonXpath.btnproceed, "Cliked on Proceed to checkout");

		Thread.sleep(5000);
		// Verify Cart page is displayed
		gl.VerifyElementVisible(Vype_Cart.pgCart, "Your cart page is displayed");

	}
	
	
	@And("^Verify discount applied$")
	public void verify_discount_applied() throws Throwable {
	
		//gl.ScrollPageDown();
		gl.fnScrollToView(Vype_CommonXpath.lnkOneTimePurchase);
		Thread.sleep(4000);

		Discount=gl.getText(Vype_CommonXpath.weDiscountcode);
	
		if(gl.isObjectPresent(Vype_CommonXpath.weDiscountcode,"EPOD STARTER BUNDLE") == true)
			{
			gl.VerifyElementVisible(Vype_CommonXpath.weDiscountcode, "Discount"+Discount+"is applied");
			System.out.println("***Starter bundle discount is Visible***");
			}
			
			if(gl.isObjectPresent(Vype_CommonXpath.weDiscountcode,"EPOD STARTER BUNDLE") == false)
			{
				System.out.println("***Starter bundle discount is Not Visible***");
				
				BaseClass.driver.quit();
			}

			

			//Getting the subtotal amount and converting to Float
			String subtotal=gl.getText(Vype_VusePlus_Rewards.txtsubtotal);
			float sub=Float.parseFloat(subtotal.substring(1));
			
				//Calculating the 30% of subtotal
			Float OrgDiscount = (Float) Math.abs((sub * 30)/100);
			
			System.out.println("30% DISCOUNT ON ePod starter bundle"+OrgDiscount+"");
			
			//Taking the above result for 2 decimal points
				final DecimalFormat df= new DecimalFormat("0.00");
				String deci = df.format(OrgDiscount);
				//converting to float
				float finalDiscount=Float.parseFloat(deci);
				System.out.println("30% DISCOUNT ON ePod starter bundle"+finalDiscount+"");
			
			//Taking the discounted price and converting to float
			String discount = gl.getText(Vype_VusePlus_Rewards.txtdiscount);
			String DiscountNum = discount.substring(2);
			//double DiscountPrice=Double.parseDouble(DiscountNum);
			float DiscountPrice=Float.parseFloat(DiscountNum);
			System.out.println("30% DISCOUNT ON ePod starter bundle"+DiscountPrice+"");
			
			//Comparing the calculated discount and discount applied
				if(finalDiscount==DiscountPrice) {
					System.out.println("30% DISCOUNT ON ePod starter bundle is applied successfully");
					reportiumClient.reportiumAssert("30% DISCOUNT ON ePod starter bundle is applied successfully", true);
				}
				else {
					System.out.println("30% DISCOUNT ON ePod starter bundle is not applied");
					reportiumClient.reportiumAssert("30% DISCOUNT ON ePod starter bundle is not applied", false);
					BaseClass.driver.quit();
				}
			
			
			
			
			
			
	}
	
	@And("^Verify cart page check whether any extra discount is applied or not$")
	public void verify_cart_page_check_whether_any_extra_discount_is_applied_or_not() throws Throwable {

		gl.fnScrollToView(Vype_CommonXpath.lnkOneTimePurchase);
		Thread.sleep(4000);
		Thread.sleep(2000);
		
		
		//Applied discount Price
		//Discount applied after adding pod
        String discountpod = gl.getText(Vype_CommonXpath.txtdiscount);
        String Discountaddpod = discountpod.substring(2);
		//double DiscountPrice=Double.parseDouble(DiscountNum);
		float DiscountPriceaddpod=Float.parseFloat(Discountaddpod);
		System.out.println("30% DISCOUNT ON ePod starter bundle after adding the pod"+DiscountPriceaddpod+"");
		
		
		//Verify the EPOD STARTER BUNDLE Discount code is displayed
			if(DiscountPrice==DiscountPriceaddpod)
			{
			//Verify only $9.00 discount is applied in cart summary section
			reportiumClient.reportiumAssert("Only starter bundle discount is applied", true);
			System.out.println("Only starter bundle discount is applied");
			
		}
			
		else
		{
			
			System.out.println("Different discount is applied");
			
			reportiumClient.reportiumAssert("Discount  is not apllicable", false);
		
			BaseClass.driver.quit();
			
		}
	}
	
	
	@Then("^Click on add button for any flavor \"([^\"]*)\" with required quantity \"([^\"]*)\"$")
	public void click_on_add_button_for_any_flavor_with_required_quantity(String Podflavour, String quantity) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
		gl.fnScrollToView(Vype_CommonXpath.webAllFlavorsePodPage(Podflavour));
		 int q = Integer.parseInt(quantity);

		Thread.sleep(3000);

		gl.clickUsingJs(Vype_ClickandCollect.btnquantity1(Podflavour), " - ");
	      // click on quantity picker
	      for (int i = 0; i < q; i++) {
	          gl.clickUsingJs(Vype_ClickandCollect.btnquantity(Podflavour), " + ");
	      }
		Thread.sleep(1000);

		Thread.sleep(2000);


		// Add to subscription Subscription option
		gl.clickbutton(Vype_CommonXpath.btnadd(Podflavour), "Add ");
	}
	
	@Then("^Verify discount is not there after removing product$")
	public void verify_discount_is_not_there_after_removing_product() throws Throwable {
		Thread.sleep(2000);

		//Click on Remove button for ePod Solo device
		gl.clickbutton(Vype_CommonXpath.btnremove, "Device is removed");

		Thread.sleep(10000);
		
		gl.fnScrollToView(Vype_CommonXpath.lnkOneTimePurchase);
		Thread.sleep(4000);
		
		//Verify the EPOD STARTER BUNDLE Discount code is not displayed
		gl.verifyobjectisnotavailable(Vype_CommonXpath.weDiscountcode, "Discount code "+Discount+"is not available");



	}
	
	
	
	
	
	
	
}
