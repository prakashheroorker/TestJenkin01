package stepDefinitions_Mobile;

import java.util.List;

import org.openqa.selenium.*;


import com.rai.framework.CommonFunctions_Mobile;
import com.rai.framework.RAI_Mobile_Utility_Functions;

import cucumber.api.java.en.*;
import goVype_Properties_mobile.Vype_CommonXpath;
import goVype_Properties_mobile.Vype_PlatinumProfileTrigger;
import goVype_Properties_mobile.*;


public class ePodAccessories {

	RAI_Mobile_Utility_Functions rai = new RAI_Mobile_Utility_Functions();
	CommonFunctions_Mobile function = new CommonFunctions_Mobile(rai);


	@And("^user clicks on Device, Pods and Accessories and clicks on Accessories$")
	public void user_clicks_on_Device_Pods_and_Accessories_and_clicks_on_Accessories() throws Throwable {

		//click on Device, Pods & Accessories
		rai.clickbutton(Vype_CommonXpath.lnkdeviceandpods, "Device, Pods & Accessories ");
		
		// Click on Accessories Link
		rai.clickbutton(Vype_CommonXpath.lnkAccessories, "Accessories from epod navigation ");

	}
	@And("^user navigates to phone holder with pod cap accessory page$")
	public void user_navigates_to_phone_holder_with_pod_cap_accessory_page() throws Throwable {
		
		rai.ScrollByxpath(Vype_CommonXpath.txtPhoneHolder);
		 rai.VerifyElementsVisible(Vype_CommonXpath.txtphoneholderprice ,"price");
		// Verify the user is redirected to Vuse Phone Holder Page
		rai.clickbutton(Vype_CommonXpath.txtPhoneHolder, "ePod Accessories ");
		Thread.sleep(5000);
        rai.VerifyElementsVisible(Vype_CommonXpath.txtphoneholderprice ,"price");
		
	}
	@And("^user navigates to travel case page$")
	public void user_navigates_to_travel_case_page() throws Throwable {
		
		rai.ScrollByxpath(Vype_CommonXpath.txttravelcase);
		rai.VerifyElementsVisible(Vype_CommonXpath.txttravelcaseprice ,"price");
		// Verify the user is redirected to Vuse travel case Page
		rai.clickbutton(Vype_CommonXpath.txttravelcase, "ePod Accessories ");
		Thread.sleep(5000);
        rai.VerifyElementsVisible(Vype_CommonXpath.txttravelcaseprice ,"price");
       
	}
	@And("^user navigates to device case page$")
	public void user_navigates_to_device_case_page() throws Throwable {
		
		rai.ScrollByxpath(Vype_CommonXpath.txtdevicecase);
		rai.VerifyElementsVisible(Vype_CommonXpath.txtdevicecaseprice ,"price");
		// Verify the user is redirected to Vuse device case Page
		rai.clickbutton(Vype_CommonXpath.txtdevicecase, "ePod Accessories ");
		Thread.sleep(5000);
        rai.VerifyElementsVisible(Vype_CommonXpath.txtdevicecaseprice ,"price");
	}
	
	@And("^user verifies the content and adds product$")
	public void user_verifies_the_content_and_adds_product() throws Throwable {
      
		Thread.sleep(5000);
		//rai.VerifyElementsVisible(Vype_CommonXpath.btnproductsliderprev, "<");
		
        //rai.VerifyElementsVisible(Vype_CommonXpath.btnproductslidernext, ">");
		//<ul class="slick-dots
		//rai.isDisabled(Vype_CommonXpath.btnBuynow, "Buy now");
		rai.VerifyElementsVisible(Vype_CommonXpath.Btnplus, "+ ");

		rai.VerifyElementsVisible(Vype_CommonXpath.btnMinus, "- ");
		
		rai.VerifyElementsVisible(Vype_CommonXpath. btnAddToCART, "Add to cart");
		
		rai.clickbutton(Vype_CommonXpath.Btnplus, "+ ");

		rai.isEnabled(Vype_CommonXpath. btnAddToCART, "Add to cart");

		rai.clickbutton(Vype_CommonXpath. btnAddToCART, "Add to cart");
		//verify the confirmation message "Added to Cart"
		//rai.VerifyElementsVisible(Vype_ePodWorkflows.txtFloatingMessage, "Added to Cart message ");
		
		//Verify the cart updated to quantity 1
		String Quantity = rai.getText(Vype_CommonXpath.txtnumber);
		rai.VerifyElementsVisible(Vype_CommonXpath.txtnumber, "Quantity added is: "+Quantity+" ");
		
		

	}

	
	@Then("^verify Vuse logo and cart icon in accessories page$")
	public void verify_Vuse_logo_and_cart_icon_in_accessories_page() throws Throwable {
		
		//Verify that the Vype logo is available
		rai.VerifyElementsVisible(Vype_CommonXpath.txtVuse, "VUSE logo ");
		
		
		
		//Verify the Cart Icon is available
		rai.VerifyElementsVisible(Vype_CommonXpath.lnkCartIcon, "Cart icon ");
	   
	}
	

@Then("^verify all Accessories present in Accessories page$")
public void verify_all_Accessories_present_in_Accessories_page() throws Throwable {
    
	List<WebElement> list=rai.findElementsList(Vype_CommonXpath.lnkAllAccessories);
	System.out.println("Total no of Accessories :" +list.size());
	for(int i=0;i<list.size();i++)
	{
		String str=list.get(i).getText();
		
		String str1=str.substring(0,5);
		
		System.out.println((i+1)+":"+str);
		System.out.println("\n");
		String str2="//*[contains(text(),'"+str1+"')]";
		rai.ScrollByxpath(By.xpath(str2));
		
		
		
		rai.VerifyElementsVisible(Vype_CommonXpath.lnkAllAccessories, str);
	}
	
	
}


@Then("^verify Top footer and bottom footer$")
public void verify_Top_footer_and_bottom_footer() throws Throwable {
   
	rai.ScrollByxpath(Vype_ePodWorkflows.weFooterTop);
	
	String txtTopFooter="CONTACTUSFAQSSTORELOCATORSITEMAPINSTAGRAMFACEBOOKTWITTERYOUTUBE";
	//Verify First Section should have theInstagram, Facebook, Twitter, Youtube,Contact Us, FAQs footerlinks
	rai.fnContentValidation(txtTopFooter, Vype_ePodWorkflows.weFooterTop);
	rai.ScrollByxpath(Vype_ePodWorkflows.txtLinks);
	
	String txtBottomFooter="CONDITIONSOFSALEPRIVACYPOLICYTERMS&CONDITIONSCOOKIEPOLICY";
	//Verify Second Section should display: Condition of Sale, Privacy Policy, Terms & Conditions and Cookie Policy
	rai.fnContentValidation(txtBottomFooter, Vype_ePodWorkflows.txtLinks);
}

@Then("^user navigates to charging cable page in mobile$")
	public void user_navigates_to_charging_cable_page_in_mobile() throws Throwable {
	rai.VerifyElementsVisible(Vype_CommonXpath.txtchargingcable, "ePod Accessories ");
	
	 rai.VerifyElementsVisible(Vype_CommonXpath.txtcharingcableprice,"price");
	 
	// Verify the user is redirected to Vuse device Page
	rai.clickbutton(Vype_CommonXpath.txtchargingcable, "ePod Accessories ");
	Thread.sleep(5000);
	
   rai.VerifyElementsVisible(Vype_CommonXpath.txtcharingcableprice,"price");
	
    }
@Then("^Verify Headers, Top footers \"([^\"]*)\" and bottom \"([^\"]*)\" in mobile$")
	public void verify_Headers_Top_footers_and_bottom_in_mobile(String txtTopFooter, String txtBottomFooter) throws Throwable {
	String Header="";
	Thread.sleep(2000);
	Header = rai.getText(Vype_ePodWorkflows.txtHeader);
	Header = Header.replaceAll("[\\n\\t]", ",");
	if(Header.contains("Shop") && Header.contains("Save") && Header.contains("About") && Header.contains("Help") && Header.contains("Vuse Store"))
	{
	rai.VerifyElementsVisible(Vype_ePodWorkflows.txtHeader, "Header with links and shopping cart ");
	}

	rai.ScrolltoBottomofthepage();
	rai.ScrolltoBottomofthepage();

	//Verify First Section should have theInstagram, Facebook, Twitter, Youtube,Contact Us, FAQs footerlinks
	rai.fnContentValidation(txtTopFooter, Vype_ePodWorkflows.weFooterTop);
	Thread.sleep(2000);
	//Verify Second Section should display: Condition of Sale, Privacy Policy, Terms & Conditions and Cookie Policy
	rai.fnContentValidation(txtBottomFooter, Vype_ePodWorkflows.txtLinks);
}


@Then("^verify price greater than previous price in mobile$")
	public void verify_price_greater_than_previous_price_in_mobile() throws Throwable {
	rai.VerifyElementsVisible(Vype_PlatinumProfileTrigger.itemsInCart, "SubTotal and total Value are Same");
		
	}
	@When("^Clicking buttons plus and minus in mobile$")
	public void clicking_buttons_plus_and_minus_in_mobile() throws Throwable {
		rai.clickbutton(Vype_CommonXpath.btnIncrement1point6percent, "1.6% Nicotine Strength");			

		//Add 1.6% Nicotine Strengths
		rai.clickbutton(Vype_CommonXpath.btnIncrement1point6percent, "1.6% Nicotine Strength");

		//Validate The Cost
		String cost=rai.getText(Vype_PlatinumProfileTrigger.weTotalAmountInCucumberFlavour);
		if(cost.equals("$27.98")){
			rai.VerifyElementsVisible(Vype_PlatinumProfileTrigger.weTotalAmountInCucumberFlavour, "Sub Total Value $26.00");
		}

		//Add 1.6% Nicotine Strengths
		rai.clickbutton(Vype_CommonXpath.btnIncrement1point6percent, "1.6% Nicotine Strength");

		//Validate The Cost - weTotalAmountInCucumberFlavour
		String cost1=rai.getText(Vype_PlatinumProfileTrigger.weTotalAmountInCucumberFlavour);
		if(cost1.equals("$41.97")){
			rai.VerifyElementsVisible(Vype_PlatinumProfileTrigger.weTotalAmountInCucumberFlavour, "Sub Total Value $39.00 after adding Nicotine Strength");
		}

		//remove 1.6% Nicotine Strengths
		rai.clickbutton(Vype_CommonXpath.btnIncrement1point6percent, "Removed 1.6% Nicotine Strength");

		//Validate The Cost 
		String subtotalCost=rai.getText(Vype_PlatinumProfileTrigger.weTotalAmountInCucumberFlavour);
		if(subtotalCost.equals("$27.98")){
			rai.VerifyElementsVisible(Vype_PlatinumProfileTrigger.weTotalAmountInCucumberFlavour, "Sub Total Value $27.90 after removing 1.6% Nicotine Strength");
		}
		//subtotalCost=subtotalCost.substring(1);

}

	@When("^Verifying the amount in mobile$")
	public void verifying_the_amount_in_mobile() throws Throwable {
		String subtotalCost=rai.getText(Vype_PlatinumProfileTrigger.weTotalAmountInCucumberFlavour);
		if(subtotalCost.equals("$27.98")){
			rai.VerifyElementsVisible(Vype_PlatinumProfileTrigger.weTotalAmountInCucumberFlavour, "Sub Total Value $27.90 after removing 1.6% Nicotine Strength");
		}
}
}



