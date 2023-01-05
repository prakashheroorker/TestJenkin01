package stepDefinitions_Mobile;

import java.text.DecimalFormat;

import com.rai.framework.BaseClass;
import com.rai.framework.CommonFunctions_Mobile;
import com.rai.framework.RAI_Mobile_Utility_Functions;

import cucumber.api.java.en.*;
import goVype_Properties.Vype_VusePlus_Rewards;
import goVype_Properties_mobile.Vype_Cart;
import goVype_Properties_mobile.Vype_CommonXpath;
import goVype_Properties_mobile.*;
import junit.framework.Assert;


public class Trailbusinessworkflow extends BaseClass {

	RAI_Mobile_Utility_Functions rai = new RAI_Mobile_Utility_Functions();
	CommonFunctions_Mobile function = new CommonFunctions_Mobile(rai);

	String Discount;
	String promocode;
	int price;
	String applied;
	float DiscountPrice;




	@Then("^Click on Starter bundle and verify start cutomizing screen$")
	public void click_on_Starter_bundle_and_verify_start_cutomizing_screen() throws Throwable {

		//Click the buy now button Starterbundle tile
		rai.clickbutton(Vype_CommonXpath.btnStarterBundleBuyNow, "Starter bundle ");

		// Scroll to view the start customising button
		rai.ScrollByxpath(Vype_CommonXpath.btnstartcustomising);

		Thread.sleep(2000);

				

		rai.SwipeDown(1);

		//Scroll to view the start customising button
		rai.VerifyElementVisible(Vype_CommonXpath.btnstartcustomising," Start customizing ");

		Thread.sleep(2000);




	}
	
	
	@When("^User clicks on start customizing and verify the choose your device colour page$")
	public void user_clicks_on_start_customizing_and_verify_the_choose_your_device_colour_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  
		// click on start customizing
		rai.clickbutton(Vype_CommonXpath.btnstartcustomising, "Start Customising");
		
		rai.VerifyElementVisible(Vype_CommonXpath.btndevicecolor, "Choose your device colour");
		
		rai.VerifyElementVisible(Vype_CommonXpath.btndevicecolorsel, "Choose your device colour slection");
		
		//click on choose color
		rai.VerifyElementVisible(Vype_CommonXpath.btnchoosecolour, "Choose this colour");
		
	}
	
	
	
	
	
	@When("^Click on device color \"([^\"]*)\" and verify the image displayed$")
	public void click_on_device_color_and_verify_the_image_displayed(String devicecolour) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  
		//Verify "Choose your device colour" page is displayed
		rai.clickbutton(Vype_CommonXpath.btnChoosecolour(devicecolour), "Choose your device colour page");

		rai.VerifyElementVisible(Vype_CommonXpath.btnchosseimage,"image ");
//				
		Thread.sleep(2000);
	    
	    
		
		
	}
	
	
	@When("^Click on choose this color and verify choose your Pods page$")
	public void click_on_choose_this_color_and_verify_choose_your_pods_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
		
		//click on choose color
		rai.clickbutton(Vype_CommonXpath.btnchoosecolour, "Choose this colour");
		
		//Verify "Choose your pack of pods" page is displayed
		rai.VerifyElementVisible(Vype_CommonXpath.btnchooseflavour, "Choose your pack of pods page");
		
		rai.VerifyElementVisible(Vype_CommonXpath.btnflavour, "flavours");
		
		rai.SwipeDownSmallerUnits(3);
		
		rai.VerifyElementVisible(Vype_CommonXpath.btnnicstr,"Choose Nicotine Strength");
		
		//choose pod pack
		rai.VerifyElementVisible(Vype_CommonXpath.btnchoosepodpack,"Choose pod flavor");
		
		


	}
	
	
	@When("^Click on any of the flavor \"([^\"]*)\" with \"([^\"]*)\"$")
	public void click_on_any_of_the_flavor_with(String flavor, String Strength) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		//rai.ScrollByxpath(Vype_CommonXpath.imgflvor(flavor));
		
		//click on choose flavor
		//rai.clickUsingJs(Vype_CommonXpath.imgflvor(flavor),flavor);
		rai.clickLink(Vype_CommonXpath.imgflvorbundle(flavor),"flavor");
		//rai.SwipeDownSmallerUnits(3);
		//rai.ClickUsingImage("Golden Tobacco");
		//choose Nicotine strength
		rai.clickbutton(Vype_CommonXpath.btnstrength(Strength),Strength);


	}

	@Then("^Verify the Flavour \"([^\"]*)\" image$")
	public void verify_the_flavour_image(String flavor) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		rai.SwipeUpSmallerUnits(3);
		//rai.ScrolltoTopofthepage();
	  Thread.sleep(2000);
		rai.VerifyElementVisible(Vype_CommonXpath.btnflavorimage(flavor),"Choose pod flavor image");
		rai.SwipeDownSmallerUnits(3);
		Thread.sleep(2000);
	}
	
	@When("^User click on choose pod pack and verify starter kit page$")
	public void user_click_on_choose_pod_pack_and_verify_starter_kit_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

		// choose pod pack
		rai.clickbutton(Vype_CommonXpath.btnchoosepodpack, "Choose pod flavor");

		// Verify "View your bundle" page is displayed
		rai.VerifyElementVisible(Vype_CommonXpath.btnproceed, "View your bundle page");

		//  Proceed to checkout button
		rai.VerifyElementVisible(Vype_CommonXpath.btnproceed, "Cliked on Proceed to checkout");

	}
	
	@When("^Click on Proceed to checkout and verify your cart page is displayed$")
	public void click_on_proceed_to_checkout_and_verify_your_cart_page_is_displayed() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

		// Click on Proceed to checkout button
		rai.clickUsingJs(Vype_CommonXpath.btnproceed, "Cliked on Proceed to checkout");

		Thread.sleep(5000);
		// Verify Cart page is displayed
		rai.VerifyElementVisible(Vype_Cart.pgCart, "Your cart page is displayed");

	}
	
	
	@And("^Verify the discount applied$")
	public void verify_the_discount_applied() throws Throwable {
	
		//rai.ScrollPageDown();
		rai.ScrollByxpath(Vype_CommonXpath.lnkOneTimePurchase);
		Thread.sleep(4000);

		Discount=rai.getText(Vype_CommonXpath.weDiscountcode);
	
		if(rai.isObjectPresent(Vype_CommonXpath.weDiscountcode,"EPOD STARTER BUNDLE") == true)
			{
			rai.VerifyElementVisible(Vype_CommonXpath.weDiscountcode, "Discount"+Discount+"is applied");
			System.out.println("***Starter bundle discount is Visible***");
			}
			
			if(rai.isObjectPresent(Vype_CommonXpath.weDiscountcode,"EPOD STARTER BUNDLE") == false)
			{
				System.out.println("***Starter bundle discount is Not Visible***");
				
				BaseClass.driver.quit();
			}

			

			//Getting the subtotal amount and converting to Float
			String subtotal=rai.getText(Vype_VusePlus_Rewards.txtsubtotal);
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
			String discount = rai.getText(Vype_VusePlus_Rewards.txtdiscount);
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
	
	@Then("^User swipe down and selects the flavor \"([^\"]*)\" with desired count \"([^\"]*)\" and add to cart$")
    public void User_swipe_down_and_selects_the_flavor_with_desired_count_and_add_to_cart(String Podflavour, String count) throws Throwable {

 

        // Verify that ePod's pods page is displayed.
        rai.VerifyElementsVisible(Vype_CommonXpath.pgEpodPods, "ePod Pods");

 

        //add flavor and count to cart
       // function.AddflavorPLP(Podflavour, count);
        int flavorcount = Integer.parseInt(count);

        


        /*boolean b=rai.verifyobjectisnotavailable(Vype_CommonXpath.Addflavor(flavor));
        if(b==true)
        {*/

        //Scroll to flavor name
        rai.ScrollByxpath(Vype_CommonXpath.txtflavor(Podflavour));

        //Click on any flavours (ex: Watermelon Ice) "Add" button.
        rai.clickUsingJs(Vype_CommonXpath.Addflavor(Podflavour),Podflavour);

        //Verify Flavour pop up is displayed
        rai.VerifyElementsVisible(Vype_CommonXpath.FlavorPopUp, "Flavour pop up");


        //rai.clickUsingJs(Vype_CommonXpath.btnAddToCart(flavor),  "Add to cart ");

        //Click on plus button in that flavour pop up
        for(int i=1;i<flavorcount;i++)
        {
            rai.clickUsingJs(Vype_CommonXpath.Nicotinestrength(Podflavour),  "+");
            Thread.sleep(1000);
        }

        Thread.sleep(1000);


        //Click on close icon for flavor pop up
        rai.clickbutton(Vype_CommonXpath.closeFlavor, "ePod Pods");

 

    }
	
	@And("^Verify the cart page check whether any extra discount is applied or not$")
	public void verify_cart_page_check_whether_any_extra_discount_is_applied_or_not() throws Throwable {

		rai.ScrollByxpath(Vype_CommonXpath.lnkOneTimePurchase);
		Thread.sleep(4000);
		Thread.sleep(2000);
		
		
		//Applied discount Price
		//Discount applied after adding pod
        String discountpod = rai.getText(Vype_CommonXpath.txtdiscount);
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
	
	
	
	



	@Then("^verify whether discount is still there after removing product$")
	public void verify_whether_discount_is_still_there_after_removing_product() throws Throwable {

		//Click on Remove button for ePod Solo device
		rai.clickbutton(Vype_CommonXpath.btnremove, "Device is removed");

		Thread.sleep(2000);

		rai.ScrollByxpath(Vype_CommonXpath.lnkOneTimePurchase);
		Thread.sleep(4000);


		//Verify the EPOD STARTER BUNDLE Discount code is not displayed
		rai.verifyobjectisnotavailable(Vype_CommonXpath.weDiscountcode, "Discount code "+Discount);

	}



}
