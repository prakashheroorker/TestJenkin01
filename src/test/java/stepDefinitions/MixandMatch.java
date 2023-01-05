package stepDefinitions;



import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.rai.framework.*;

import cucumber.api.java.en.*;
import goVype_Properties.*;

public class MixandMatch extends BaseClass {
	RAI_Desktop_Utility_Functions gl = new RAI_Desktop_Utility_Functions();
	CommonFunctions function = new CommonFunctions(gl);


	@Then("^verify mix and match bundles present in pods page$")
	public void verify_mix_and_match_bundles_present_in_pods_page() throws Throwable {

		//gl.fnScrollToView(Vype_CommonXpath.txtSubsandSave);

		//Verify the "Mix & Match: 3 Pack Bundle" card with Image for $30.00 and text as "Select 3 packs of your choice and save 17%" with Create button is displayed.
		gl.VerifyElementVisible(Vype_CommonXpath.txtMixAndMatch2PackBundle, "Mix & match 3 pack bundle");

		//verify image of 2pack bundle
		gl.VerifyElementVisible(Vype_CommonXpath.ImageMixAndMatch2PackBundle, "Mix and match 3pack bundle image");

		//Verify the"Mix & Match:5 pack Bundle" card with the image for $45.00  and text as "Select 5 packs of your choice and save 25%" with the "Create" button is displayed
		gl.VerifyElementVisible(Vype_CommonXpath.txtMixAndMatch5PackBundle, "Mix and match 5 pack bundle");

		//verify image of 5 pack bundle
		gl.VerifyElementVisible(Vype_CommonXpath.ImageMixAndMatch5PackBundle, "Mix and match 5pack bundle image");



	}

	@Then("^click on create on Mix and Match five Pack Bundle$")
	public void click_on_create_on_Mix_and_Match_five_Pack_Bundle() throws Throwable {

		//Click on the "Create" button for "Mix & Match : 5Pack Bundle"
		gl.clickUsingJs(Vype_CommonXpath.lnkCreateMixAndMatch5PackBundle, "Create mix and match 5pack bundle");

		//Choose 5 packs to add to your bundle.
		gl.VerifyElementVisible(Vype_CommonXpath.txtChoose5Packs, "Choose 5 Packs");


	}

	@Then("^click on create on Mix and Match two Pack Bundle$")
	public void click_on_create_on_Mix_and_Match_two_Pack_Bundle() throws Throwable {

		//Click on the "Create" button for "Mix & Match : 5Pack Bundle"
		gl.clickUsingJs(Vype_CommonXpath.lnkCreateMixAndMatch2PackBundle, "Create mix and match 5pack bundle");

		//Choose 5 packs to add to your bundle.
		gl.VerifyElementVisible(Vype_CommonXpath.txtChoose2Packs, "Choose 5 Packs");

	}
	
	@Then("^Then verify left and right half of two pack bundle page$")
	public void verify_left_and_right_half_of_two_pack_bundle_page() throws Throwable {
	   
		//Verify the page is divided vertically in two halfs
		gl.VerifyElementPresent(Vype_ePodWorkflows.ImageDividedMixMatch, "Image divided mix match vertically");
		
		//Verify the left side of the page contains the Image of Mix & Match : 2 pack bundle with the text at the bottom "YOUR MULTIPACK" 
		gl.VerifyElementPresent(Vype_ePodWorkflows.txtrightimgmultipack2, "Mix match image with your multipack");
		
		String str=gl.getText(Vype_ePodWorkflows.txtHeaderMixAndMatch2PackBundle);
		//Verify the right side of the page contains the Heading "Mix & Match :2 pack bundle" with the text Select 2 packs of your choice and save 21%" and Pack (2 pods).
		gl.VerifyElementPresent(Vype_ePodWorkflows.txtHeaderMixAndMatch2PackBundle, str);
		
	}
	
	@Then("^verify left and right half of five pack bundle page$")
	public void verify_left_and_right_half_of_five_pack_bundle_page() throws Throwable {
	    
		//Verify the page is divided vertically in two halfs
	   gl.VerifyElementPresent(Vype_ePodWorkflows.ImageDividedMixMatch, "Image divided mix match vertically");
	   
	    //Verify the left side of the page contains the Image of Mix & Match : 5 pack bundle with the text at the bottom "YOUR MULTIPACK" 
	    gl.VerifyElementPresent(Vype_ePodWorkflows.txtrightimgmultipack5, "Mix match image with your multipack");
		

		String str=gl.getText(Vype_ePodWorkflows.txtHeaderMixAndMatch5PackBundle);
		//Verify the right side of the page contains the Heading "Mix & Match :5 pack bundle" with the text Select 5 packs of your choice and save 23%" and Pack (2 pods).
		gl.VerifyElementPresent(Vype_ePodWorkflows.txtHeaderMixAndMatch5PackBundle, str);
	    
	}

	@Then("^verify flavors present in multi pack bundle page$")
	public void verify_flavors_present_in_multi_pack_bundle_page() throws Throwable {
	  
		List<WebElement> list=gl.findElementsList(Vype_CommonXpath.lnknoflavors);
		
		System.out.println("No of flavors present :"+list.size());
		for(int i=0;i<list.size();i++)
		{
			String str=list.get(i).getText();
			str=str.substring(0,(str.length()-6));
			String str1="(//*[text()='"+str+"'])[1]";
			System.out.println((i+1)+":"+str);
			gl.fnScrollToView(By.xpath(str1));
			gl.VerifyElementPresent(By.xpath(str1), str);
		}
		
		
		
		
	}

	@Then("^remove and add product and verify discount respectively$")
	public void remove_and_add_product_and_verify_discount_respectively() throws Throwable {
	  
		String discount=gl.getText(Vype_CommonXpath.txtdiscount);
		
		
		
		String Discount=gl.getText(Vype_CommonXpath.wetxtDiscount);
		
		gl.clickUsingJs(Vype_CommonXpath.btnremove, "X ");
		
		String removeingdiscount=gl.getText(Vype_CommonXpath.txtdiscount);
		
		boolean b=(discount.equalsIgnoreCase(removeingdiscount));
		
		if(b==false)
		{
			gl.VerifyElementVisible(Vype_CommonXpath.txtdiscount, Discount+"is removed");
			
			System.out.println(Discount+" is removed");
		}
		else
		{
			gl.VerifyElementVisible(Vype_CommonXpath.txtdiscount, Discount+" is not removed");
			 System.out.println(Discount+" is not  removed");
		}
		
		
	}

	@Then("^add any five flavors \"([^\"]*)\" in Mix and Match five Pack Bundle and click on add to cart$")
	public void add_any_five_flavors_in_Mix_and_Match_five_Pack_Bundle_and_click_on_add_to_cart(String Flavor) throws Throwable {

		//clicking on 5 different flavors------------
		String S = Flavor;

		List<String> myList = new ArrayList<String>(Arrays.asList(S.split(","))); 

		for (String flavor : myList) {  

			Thread.sleep(2000);

			function.addpods(flavor);
		}

		//Click on add to cart button.
		gl.clickbutton(Vype_CommonXpath.BtnAddToCartMixMatch, "Add to cart");
	}


	@Then("^add any two flavors \"([^\"]*)\" in Mix and Match two Pack Bundle and click on add to cart$")
	public void add_any_two_flavors_in_Mix_and_Match_Two_Pack_Bundle_and_click_on_add_to_cart(String Flavor) throws Throwable {

		//clicking on two different flavors------------
		String S = Flavor;

		List<String> myList = new ArrayList<String>(Arrays.asList(S.split(","))); 

		for (String flavor : myList) {  

			Thread.sleep(2000);

			function.addpods(flavor);
		}

		//Click on add to cart button.
		gl.clickbutton(Vype_CommonXpath.BtnAddToCartMixMatch, "Add to cart");
	}

	@When("^Add any two LEP flavors \"([^\"]*)\" from epod vape pods page$")
	public void add_any_two_flavors_from_epod_pods_page(String  Flavor) throws Throwable {

		//clicking on 3 different flavors------------
		String S = Flavor;

		List<String> myList = new ArrayList<String>(Arrays.asList(S.split(","))); 

		for (String flavor : myList) {  

			Thread.sleep(2000);

			function.addpodsflavor(flavor);
		}
		
		
	}
	
	
	@And("^Add any two Non LEP Flavors \"([^\"]*)\" from epod vape pods page$")
	public void add_any_two_Non_LEP_Flavors_from_epod_vape_pods_page(String Flavors) throws Throwable {
	    
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

	@Then("^Add any five LEP flavors \"([^\"]*)\" from epod vape pods page$")
	public void add_any_five_LEP_flavors_from_epod_vape_pods_page(String Flavor) throws Throwable {
	   
		//clicking on 3 different flavors------------
				String S = Flavor;

				List<String> myList = new ArrayList<String>(Arrays.asList(S.split(","))); 

				for (String flavor : myList) {  

					Thread.sleep(2000);

					function.addpodsflavor(flavor);
				}
	}

	@When("^Add any five Non LEP Flavors \"([^\"]*)\" from epod vape pods page$")
	public void add_any_five_Non_LEP_Flavors_from_epod_vape_pods_page(String Flavors) throws Throwable {
	    
		String S = Flavors;

		List<String> myList = new ArrayList<String>(Arrays.asList(S.split(","))); 

		for (String flavor : myList) {  

			Thread.sleep(2000);

					function.addpodsflavor1(flavor);
				}
		
	}
	
	/*@Then("^Add any five flavors \"([^\"]*)\" from epod pods page$")
	public void add_any_five_flavors_from_epod_pods_page(String Flavor) throws Throwable {

		//clicking on 3 different flavors------------
		String S = Flavor;

		List<String> myList = new ArrayList<String>(Arrays.asList(S.split(","))); 

		for (String flavor : myList) {  

			Thread.sleep(2000);

			function.addpodsflavor(flavor);
		}
	}*/
	
	
	

	@And("^navigate to cart page and verify Discount$")
	public void navigate_to_cart_page_and_verify_Discount() throws Throwable {
		//Click on Mini cart.
		//Hower and view cart
		function.hoverCartAndClickViewCart();
		
		String promotion=gl.getText(Vype_CommonXpath.txtpromotion);
		System.out.println(promotion);
		
		gl.VerifyElementVisible(Vype_CommonXpath.txtpromotion,promotion);

		//Verify the prod=uct is added in cart page
		String products=gl.getText(Vype_CommonXpath.pgcart);
		System.out.println(products);
		gl.VerifyElementVisible(Vype_CommonXpath.pgcart,products);

		String discount=gl.getText(Vype_CommonXpath.wetxtDiscount);
		//Verify the Cart summary section has the default discount code "MULTIPACK 5" is applied with the discount of 25%
		gl.VerifyElementVisible(Vype_CommonXpath.wetxtDiscount,"Discount code" +discount);
		//checkout and submit order

//vishnu
	}
	
	@When("^Hower on Save and click on multipack(\\d+)$")
	public void hower_on_Save_and_click_on_multipack(int arg1) throws Throwable {
	   
		gl.HowerMouse(Vype_CommonXpath.lnkSave, "Save ");
		gl.clickUsingJs(Vype_CommonXpath.multipack2, "Multipack 2");
	}

	@Then("^Verify the ePod Vape pods page is displayed$")
	public void verify_the_ePod_Vape_pods_page() throws Throwable {
	    
		gl.VerifyElementVisible(Vype_CommonXpath.epodpodpage, "epodpodpage");
	}

	
	
	@Then("^Verify the MultiPack2 and LEP MultiPack2  discount is applied$")
	public void verify_the_discount_is_applied() throws Throwable {
		
		//Verify the product is added in cart page
		String products=gl.getText(Vype_CommonXpath.pgcart);
		System.out.println(products);
		gl.VerifyElementVisible(Vype_CommonXpath.pgcart,products);
				
		
		gl.VerifyElementVisible(Vype_CommonXpath.combineddiscount, "combineddiscount");
		
		//Verify MultiPack2 text is applied 
		gl.VerifyElementVisible(Vype_CommonXpath.Multipack2discount, "Multipack2discount");
		
		//Verify LEP MultiPack2 text is applied 
		gl.VerifyElementVisible(Vype_CommonXpath.wetxtDiscount, "LED Multipack2discount");
		
		//Getting the subtotal amount and converting to Float
		String subtotal=gl.getText(Vype_VusePlus_Rewards.txtsubtotal);
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
		String discount = gl.getText(Vype_CommonXpath.Multipack2discountprize);
		String DiscountNum = discount.substring(2);
		float DiscountPrice=Float.parseFloat(DiscountNum);
		
		System.out.println("18 % MultiPack2 discounted price is" +DiscountPrice);
		
		
		//Taking the LEP MultiPack2 discounted price and converting to float
		String discount1=gl.getText(Vype_CommonXpath.LEDMultipack2discountprize);
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
		/*gl.VerifyElementVisible(Vype_CommonXpath.wetxtDiscount, "LED Multipack2discount");
	
		//Calculating the 18% of subtotal
				Float OrgDiscount1 = (Float) Math.abs((sub * 18)/100);
				
				//Taking the above result for 2 decimal points
				final DecimalFormat df1= new DecimalFormat("0.00");
				String deci1 = df1.format(OrgDiscount);
				//converting to float
				float finalDiscount1=Float.parseFloat(deci1);
				
				System.out.println("18% LEP MultiPack2 of  subtotal "+finalDiscount1);
				
				//Taking the MultiPack2 discounted price and converting to float
				String discount1=gl.getText(Vype_CommonXpath.LEDMultipack2discountprize);
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
	
	
	
	@Then("^Verify the MultiPackFive and LEP MultiPackFive discount is applied$")
	public void verify_the_MultiPackFive_and_LEP_MultiPackFive_discount_is_applied() throws Throwable {
		gl.VerifyElementVisible(Vype_CommonXpath.combineddiscount, "combineddiscount");

		//Verify the product is added in cart page
		String products=gl.getText(Vype_CommonXpath.pgcart);
		System.out.println(products);
		gl.VerifyElementVisible(Vype_CommonXpath.pgcart,products);

		gl.VerifyElementVisible(Vype_CommonXpath.combineddiscount, "combineddiscount");
		
		//Verify MultiPack5 text is applied 
		gl.VerifyElementVisible(Vype_CommonXpath.Multipack5discount, "Multipack5discount");
		
		//Verify LEP MultiPack5 text is applied 
		gl.VerifyElementVisible(Vype_CommonXpath.LEPMultipack5discount, "LED Multipack5discount");
		
		//Getting the subtotal amount and converting to Float
		String subtotal=gl.getText(Vype_VusePlus_Rewards.txtsubtotal);
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
		String discount = gl.getText(Vype_CommonXpath.Multipack5discountprize);
		String DiscountNum = discount.substring(2);
		float DiscountPrice=Float.parseFloat(DiscountNum);
		
		System.out.println("21% MultiPack5 discounted price is" +DiscountPrice);
		
		
		//Taking the LEP MultiPack2 discounted price and converting to float
		String discount1=gl.getText(Vype_CommonXpath.LEDMultipack2discountprize);
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

	@Then("^Verify Shipping page is and One time Purchase details are dispalyed$")
	public void verify_Shipping_page_is_displayed() throws Throwable {
		Thread.sleep(2000);

		// Click on Home
		gl.clickElement(Vype_CommonXpath.weHomeAddress, "Home");
		

		// Click on 'Go to delivery' button
		gl.VerifyElementPresent(Vype_CheckOut.btnGoToDelivery, "Go to delivery");
		
		List<WebElement> list=gl.findElementsList(Vype_CommonXpath.listlines);
		System.out.println("----------------One time purchase in shipping  page------------------");
		for(int i=0;i<list.size();i++)
		{
			String str=list.get(i).getText();
			System.out.println(str);
			gl.VerifyElementVisible(Vype_CommonXpath.listlines(i), str);
		}

	}


}
