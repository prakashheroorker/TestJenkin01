package stepDefinitions_Mobile;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.WebElement;

import com.rai.framework.BaseClass;
import com.rai.framework.CommonFunctions_Mobile;
import com.rai.framework.RAI_Mobile_Utility_Functions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import goVype_Properties.Vype_CheckOut;
import goVype_Properties_mobile.Vype_CommonXpath;
import goVype_Properties.Vype_Redeem;
import goVype_Properties.Vype_VusePlus_Rewards;

public class mixandmatch extends BaseClass{
	
	RAI_Mobile_Utility_Functions rai = new RAI_Mobile_Utility_Functions();
	CommonFunctions_Mobile function = new CommonFunctions_Mobile(rai);

	
	
	@Then("^click on create on mix and match five pack bundle and verify page$")
	public void click_on_create_on_mix_and_match_five_pack_bundle_and_verify_page() throws Throwable {
	  
		
		//Scroll to view
		rai.ScrollByxpath(Vype_CommonXpath.txtSubsandSave);

		String str=rai.getText(Vype_CommonXpath.txtMixAndMatch2PackBundle);
		//Verify the "Mix & Match: 2 Pack Bundle" card with Image for $21.99 and text as "Select 2 packs of your choice and save 21%" with Create button is displayed.
		rai.VerifyElementVisible(Vype_CommonXpath.txtMixAndMatch2PackBundle, str);

		rai.VerifyElementVisible(Vype_CommonXpath.ImageMixAndMatch2PackBundle, "Mix and match 3pack bundle image");

		String str1=rai.getText(Vype_CommonXpath.txtMixAndMatch5PackBundle);
		//Verify the"Mix & Match:5 pack Bundle" card with the image for $53.99  and text as "Select 5 packs of your choice and save 23%" with the "Create" button is displayed
		rai.VerifyElementVisible(Vype_CommonXpath.txtMixAndMatch5PackBundle, str1);

		rai.VerifyElementVisible(Vype_CommonXpath.ImageMixAndMatch5PackBundle, "Mix and match 5pack bundle image");

		//Click on the "Create" button for "Mix & Match : 5Pack Bundle"
		rai.clickbutton(Vype_CommonXpath.lnkCreateMixAndMatch5PackBundle, "Create mix and match 5pack bundle");

		//Choose 5 packs to add to your bundle.
		rai.VerifyElementVisible(Vype_CommonXpath.txtChoose5Packs, "Choose 5 Packs");

		//Scroll to view
//		rai.ScrollByxpath(Vype_CommonXpath.txtPack2Pods);
		
//		rai.VerifyElementVisible(Vype_CommonXpath.imgmultipack5, "Choose 5 Packs image");

//		String str2=rai.getText(Vype_CommonXpath.txtmultipack5);
		
//		rai.VerifyElementVisible(Vype_CommonXpath.txtmultipack5,str2 );

		
		
		
	}
	@Then("^verify mix and match bundles present in pods page$")
	public void verify_mix_and_match_bundles_present_in_pods_page() throws Throwable {

		rai.ScrollByxpath(Vype_CommonXpath.txtSubsandSave);

		//Verify the "Mix & Match: 3 Pack Bundle" card with Image for $30.00 and text as "Select 3 packs of your choice and save 17%" with Create button is displayed.
		rai.VerifyElementVisible(Vype_CommonXpath.txtMixAndMatch2PackBundle, "Mix & match 3 pack bundle");

		//verify image of 2pack bundle
		rai.VerifyElementVisible(Vype_CommonXpath.ImageMixAndMatch2PackBundle, "Mix and match 3pack bundle image");

		//Verify the"Mix & Match:5 pack Bundle" card with the image for $45.00  and text as "Select 5 packs of your choice and save 25%" with the "Create" button is displayed
		rai.VerifyElementVisible(Vype_CommonXpath.txtMixAndMatch5PackBundle, "Mix and match 5 pack bundle");

		//verify image of 5 pack bundle
		rai.VerifyElementVisible(Vype_CommonXpath.ImageMixAndMatch5PackBundle, "Mix and match 5pack bundle image");



	}
	
	
	@When("^user selects any five flavors \"([^\"]*)\" and add to cart$")
	public void user_selects_any_five_flavors_and_add_to_cart(String Flavor) throws Throwable {
		//clicking on 5 different flavors------------
				String S = Flavor;

				List<String> myList = new ArrayList<String>(Arrays.asList(S.split(","))); 

				for (String flavor : myList) {  

					Thread.sleep(2000);

					function.addpods(flavor);
				}
				
				Thread.sleep(4000);
				//Click on add to cart button.
				//rai.clickUsingJs(Vype_CommonXpath.BtnAddToCartMixMatch, "Add to cart");
				//rai.ClickUsingOCR("Add to cart");
	}
	@Then("^click on create on mix and match two pack bundle and verify page$")
	public void click_on_create_on_mix_and_match_two_pack_bundle_and_verify_page() throws Throwable {
		rai.ScrollByxpath(Vype_CommonXpath.txtSubsandSave);

		String str=rai.getText(Vype_CommonXpath.txtMixAndMatch2PackBundle);
		//Verify the "Mix & Match: 2 Pack Bundle" card with Image for $21.99 and text as "Select 2 packs of your choice and save 21%" with Create button is displayed.
		rai.VerifyElementVisible(Vype_CommonXpath.txtMixAndMatch2PackBundle, str);

		rai.VerifyElementVisible(Vype_CommonXpath.ImageMixAndMatch2PackBundle, "Mix and match 2pack bundle image");

		String str1=rai.getText(Vype_CommonXpath.txtMixAndMatch5PackBundle);
		//Verify the"Mix & Match:5 pack Bundle" card with the image for $53.99  and text as "Select 5 packs of your choice and save 23%" with the "Create" button is displayed
		rai.VerifyElementVisible(Vype_CommonXpath.txtMixAndMatch5PackBundle, str1);

		rai.VerifyElementVisible(Vype_CommonXpath.ImageMixAndMatch5PackBundle, "Mix and match 5pack bundle image");

		//Click on the "Create" button for "Mix & Match : 2Pack Bundle"
		rai.clickbutton(Vype_CommonXpath.lnkCreateMixAndMatch2PackBundle, "Create mix and match 2pack bundle");

		//Choose 2 packs to add to your bundle.
		rai.VerifyElementVisible(Vype_CommonXpath.txtChoose2Packs, "Choose 2 Packs");

		//Scroll to view
//		rai.ScrollByxpath(Vype_CommonXpath.txtPack2Pods);
		
//		rai.VerifyElementVisible(Vype_CommonXpath.imgmultipack5, "Choose 2Packs image");

//		String str2=rai.getText(Vype_CommonXpath.txtmultipack2);
		
//		rai.VerifyElementVisible(Vype_CommonXpath.txtmultipack2,str2 );
	}

	
	@When("^user selects any two flavors \"([^\"]*)\" and add to cart$")
	public void user_selects_any_two_flavors_and_add_to_cart(String Flavor) throws Throwable {
		//clicking on 2 different flavors------------
				String S = Flavor;

				List<String> myList = new ArrayList<String>(Arrays.asList(S.split(","))); 

				for (String flavor : myList) {  

					Thread.sleep(2000);

					function.addpods(flavor);
				}
				
				Thread.sleep(4000);
				//Click on add to cart button.
				//rai.clickUsingJs(Vype_CommonXpath.BtnAddToCartMixMatch, "Add to cart");
				//rai.ClickUsingOCR("Add to cart");
	}
	@And("^navigate to cart page and verify Discount$")
	public void navigate_to_cart_page_and_verify_Discount() throws Throwable {
		//Click on Mini cart.
		//Hower and view cart
		function.navigatetoViewCart();
		
		String promotion=rai.getText(Vype_CommonXpath.txtpromotion);
		System.out.println(promotion);
		
		rai.VerifyElementVisible(Vype_CommonXpath.txtpromotion,promotion);

		//Verify the prod=uct is added in cart page
		String products=rai.getText(Vype_CommonXpath.pgcart);
		System.out.println(products);
		rai.VerifyElementVisible(Vype_CommonXpath.pgcart,products);

		String discount=rai.getText(Vype_CommonXpath.wetxtDiscount);
		//Verify the Cart summary section has the default discount code "MULTIPACK 5" is applied with the discount of 25%
		rai.VerifyElementVisible(Vype_CommonXpath.wetxtDiscount,"Discount code" +discount);
		//checkout and submit order


	}
	//akhila
	@When("^Click on Multipack two$")
	public void Click_on_Multipack_two() throws Throwable {
	   
		
		rai.clickUsingJs(Vype_CommonXpath.multipack2, "Multipack 2");
	}
	
	@Then("^Verify the ePod Vape pods page is displayed in mobile$")
	public void verify_the_ePod_Vape_pods_page() throws Throwable {
	    
		rai.VerifyElementVisible(Vype_CommonXpath.epodpodpage, "epodpodpage");
	}

	
	
	@Then("^Verify the MultiPack2 and LEP MultiPack2  discount is applied in mobile$")
	public void verify_the_discount_is_applied() throws Throwable {
		
		//Verify the product is added in cart page
		String products=rai.getText(Vype_CommonXpath.pgcart);
		System.out.println(products);
		rai.VerifyElementVisible(Vype_CommonXpath.pgcart,products);
				
		
		rai.VerifyElementVisible(Vype_CommonXpath.combineddiscount, "combineddiscount");
		
		//Verify MultiPack2 text is applied 
		rai.VerifyElementVisible(Vype_CommonXpath.Multipack2discount, "Multipack2discount");
		
		//Verify LEP MultiPack2 text is applied 
		rai.VerifyElementVisible(Vype_CommonXpath.wetxtDiscount, "LED Multipack2discount");
		
		//Getting the subtotal amount and converting to Float
		String subtotal=rai.getText(Vype_VusePlus_Rewards.txtsubtotal);
		float sub=Float.parseFloat(subtotal.substring(1));
		
		//Calculating the 18% of subtotal
		Float OrgDiscount = (Float) Math.abs((sub * 18)/100);
		
		//Taking the above result for 1 decimal points
		final DecimalFormat df= new DecimalFormat("0.0");
		String deci = df.format(OrgDiscount);
		//converting to float
		float finalDiscount=Float.parseFloat(deci);
		
		System.out.println("18% MultiPack2 & LEP MultiPack2 of subtotal is "+finalDiscount);
		
		//Taking the MultiPack2 discounted price and converting to float
		String discount = rai.getText(Vype_CommonXpath.Multipack2discountprize);
		String DiscountNum = discount.substring(2);
		float DiscountPrice=Float.parseFloat(DiscountNum);
		
		System.out.println("18 % MultiPack2 discounted price is" +DiscountPrice);
		
		
		//Taking the LEP MultiPack2 discounted price and converting to float
		String discount1=rai.getText(Vype_CommonXpath.LEDMultipack2discountprize);
		String DiscountNum1 = discount1.substring(2);
		float DiscountPrice1=Float.parseFloat(DiscountNum1);
		
		System.out.println("18 % LEP MultiPack2 discounted price is" +DiscountPrice1);
		
		//Adding both MultiPack2 & LEP MultiPack2 discounts for comparing with original 18% discount
		float DiscountPrice2 = DiscountPrice + DiscountPrice1;
		
		//Taking the above result for 1 decimal points
		final DecimalFormat df1= new DecimalFormat("0.0");
		String deci1 = df1.format(DiscountPrice2);
		//converting to float
		float BothDiscount=Float.parseFloat(deci1);
		System.out.println("Added up prize of individuals: 18% MultiPack2 & LEP MultiPack2 is "+BothDiscount);
		
		//Comparing the calculated discount and total discount applied
			if(finalDiscount==BothDiscount) {
				System.out.println("18% MultiPack2 DISCOUNT is applied successfully");
				reportiumClient.reportiumAssert("18% MultiPack2 & LEP MultiPack2 DISCOUNT is applied successfully", true);
			}
			else {
				System.out.println("18% MultiPack2 DISCOUNT is not applied");
				reportiumClient.reportiumAssert("18% MultiPack2 & LEP MultiPack2 DISCOUNT is not applied", false);
			}
			//==========

	    //Verify LEP MultiPack2 is applied 
		/*rai.VerifyElementVisible(Vype_CommonXpath.wetxtDiscount, "LED Multipack2discount");
	
		//Calculating the 18% of subtotal
				Float OrgDiscount1 = (Float) Math.abs((sub * 18)/100);
				
				//Taking the above result for 2 decimal points
				final DecimalFormat df1= new DecimalFormat("0.00");
				String deci1 = df1.format(OrgDiscount);
				//converting to float
				float finalDiscount1=Float.parseFloat(deci1);
				
				System.out.println("18% LEP MultiPack2 of  subtotal "+finalDiscount1);
				
				//Taking the MultiPack2 discounted price and converting to float
				String discount1=rai.getText(Vype_CommonXpath.LEDMultipack2discountprize);
				String DiscountNum1 = discount1.substring(2);
				double DiscountPrice1=Double.parseDouble(DiscountNum1);
				
				//Comparing the calculated discount and discount applied
					if(finalDiscount1==DiscountPrice1) {
						System.out.println("18% LED MultiPack2 DISCOUNT is applied successfully");
						reportiumClient.reportiumAssert("18% LED MultiPack2 DISCOUNT is applied successfully", true);
					}
					else {
						System.out.println("18% LED MultiPack2 DISCOUNT is not applied");
						reportiumClient.reportiumAssert("18% LED MultiPack2 DISCOUNT is not applied", false);
					}*/
	}
	
	
	
	@Then("^Verify the MultiPackFive and LEP MultiPackFive discount is applied in mobile$")
	public void verify_the_MultiPackFive_and_LEP_MultiPackFive_discount_is_applied() throws Throwable {
		rai.VerifyElementVisible(Vype_CommonXpath.combineddiscount, "combineddiscount");

		//Verify the product is added in cart page
		String products=rai.getText(Vype_CommonXpath.pgcart);
		System.out.println(products);
		rai.VerifyElementVisible(Vype_CommonXpath.pgcart,products);

		rai.VerifyElementVisible(Vype_CommonXpath.combineddiscount, "combineddiscount");
		
		//Verify MultiPack5 text is applied 
		rai.VerifyElementVisible(Vype_CommonXpath.Multipack5discount, "Multipack5discount");
		
		//Verify LEP MultiPack5 text is applied 
		rai.VerifyElementVisible(Vype_CommonXpath.LEPMultipack5discount, "LED Multipack5discount");
		
		//Getting the subtotal amount and converting to Float
		String subtotal=rai.getText(Vype_VusePlus_Rewards.txtsubtotal);
		float sub=Float.parseFloat(subtotal.substring(1));
		
		//Calculating the 21% of subtotal
		Float OrgDiscount = (Float) Math.abs((sub * 21)/100);
		
		//Taking the above result for 1 decimal points
		final DecimalFormat df= new DecimalFormat("0.0");
		String deci = df.format(OrgDiscount);
		//converting to float
		float finalDiscount=Float.parseFloat(deci);
		
		System.out.println("21% MultiPack5 & LEP MultiPack5 of subtotal is "+finalDiscount);
		
		//Taking the MultiPack2 discounted price and converting to float
		String discount = rai.getText(Vype_CommonXpath.Multipack5discountprize);
		String DiscountNum = discount.substring(2);
		float DiscountPrice=Float.parseFloat(DiscountNum);
		
		System.out.println("21% MultiPack5 discounted price is" +DiscountPrice);
		
		
		//Taking the LEP MultiPack2 discounted price and converting to float
		String discount1=rai.getText(Vype_CommonXpath.LEDMultipack2discountprize);
		String DiscountNum1 = discount1.substring(2);
		float DiscountPrice1=Float.parseFloat(DiscountNum1);
		
		System.out.println("21% LEP MultiPack5 discounted price is" +DiscountPrice1);
		
		//Adding both MultiPack5 & LEP MultiPack5 discounts for comparing with original 18% discount
		float DiscountPrice2 = DiscountPrice + DiscountPrice1;
		
		//Taking the above result for 1 decimal points
		final DecimalFormat df1= new DecimalFormat("0.0");
		String deci1 = df1.format(DiscountPrice2);
		//converting to float
		float BothDiscount=Float.parseFloat(deci1);
		System.out.println("Added up prize of individuals: 21% MultiPack5 & LEP MultiPack5 is "+BothDiscount);
		
		//Comparing the calculated discount and total discount applied
			if(finalDiscount==BothDiscount) {
				System.out.println("21% MultiPack2 DISCOUNT is applied successfully");
				reportiumClient.reportiumAssert("21% MultiPack5 & LEP MultiPack5 DISCOUNT is applied successfully", true);
			}
			else {
				System.out.println("21% MultiPack2 DISCOUNT is not applied");
				reportiumClient.reportiumAssert("21% MultiPack5 & LEP MultiPack5 DISCOUNT is not applied", false);
			}
	}

	@Then("^Verify Shipping page is and One time Purchase details are dispalyed in mobile$")
	public void verify_Shipping_page_is_displayed() throws Throwable {
		Thread.sleep(2000);

		// Click on Home
		rai.clickbutton(Vype_CommonXpath.weHomeAddress, "Home");
		

		// Click on 'Go to delivery' button
		rai.VerifyElementVisible(Vype_CheckOut.btnGoToDelivery, "Go to delivery");
		
		List<WebElement> list=rai.findElementsList(Vype_CommonXpath.listlines);
		System.out.println("----------------One time purchase in shipping  page------------------");
		for(int i=0;i<list.size();i++)
		{
			String str=list.get(i).getText();
			System.out.println(str);
			rai.VerifyElementVisible(Vype_CommonXpath.listlines(i), str);
		}

	}

@Then("^Verify Congratulations pop up will get and close it in mobile$")
public void verify_Congratulations_pop_up_will_get_and_close_it() throws Throwable {
	 rai.VerifyElementVisible(Vype_Redeem.CongratesPopUp, "Congratulations Pop up");
     
     rai.clickbutton(Vype_Redeem.NoThanks,"No Thanks pop-up");
}

@When("^Add any two LEP flavors \"([^\"]*)\" from epod vape pods page in mobile$")
public void add_any_two_flavors_from_epod_pods_page_in_mobile(String  Flavor) throws Throwable {

	//clicking on 3 different flavors------------
	String S = Flavor;

	List<String> myList = new ArrayList<String>(Arrays.asList(S.split(","))); 

	for (String flavor : myList) {  

		Thread.sleep(2000);

		function.addpodsflavor1(flavor);
	}
	
	
}


@And("^Add any two Non LEP Flavors \"([^\"]*)\" from epod vape pods page in mobile$")
public void add_any_two_Non_LEP_Flavors_from_epod_vape_pods_page_in_mobile(String Flavors) throws Throwable {
    
	//clicking on 3 different flavors------------
	
	String S = Flavors;

	List<String> myList = new ArrayList<String>(Arrays.asList(S.split(","))); 

	for (String flavor : myList) {  

		Thread.sleep(2000);

				function.addpodsflavor1(flavor);
			}
	
	// scroll to flavor image
   // gl.fnScrollToView(Vype_ClickandCollect.imgflavor(Flavors));
    

   // click on add button for flavor
    //gl.clickUsingJs(Vype_CommonXpath.flavorAddButtonInePodVapePodsPage(Flavors), "Flavor selected is: " + Flavors);
}

@Then("^Add any five LEP flavors \"([^\"]*)\" from epod vape pods page in mobile$")
public void add_any_five_LEP_flavors_from_epod_vape_pods_page_in_mobile(String Flavor) throws Throwable {
   
	//clicking on 3 different flavors------------
			String S = Flavor;

			List<String> myList = new ArrayList<String>(Arrays.asList(S.split(","))); 

			for (String flavor : myList) {  

				Thread.sleep(2000);

				function.addpodsflavor1(flavor);
			}
}

@When("^Add any five Non LEP Flavors \"([^\"]*)\" from epod vape pods page in mobile$")
public void add_any_five_Non_LEP_Flavors_from_epod_vape_pods_page_in_mobile(String Flavors) throws Throwable {
    
	String S = Flavors;

	List<String> myList = new ArrayList<String>(Arrays.asList(S.split(","))); 

	for (String flavor : myList) {  

		Thread.sleep(2000);

				function.addpodsflavor1(flavor);
			}
	
}
	
}
