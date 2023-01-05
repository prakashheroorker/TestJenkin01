package stepDefinitions_Mobile;

import java.util.List;

import org.openqa.selenium.*;


import com.rai.framework.CommonFunctions_Mobile;
import com.rai.framework.RAI_Mobile_Utility_Functions;

import cucumber.api.java.en.*;
import goVype_Properties_mobile.Vype_CommonXpath;
import goVype_Properties_mobile.Vype_PlatinumProfileTrigger;
import goVype_Properties_mobile.*;


public class ePodAccessories_Mobile {

	RAI_Mobile_Utility_Functions rai = new RAI_Mobile_Utility_Functions();
	CommonFunctions_Mobile function = new CommonFunctions_Mobile(rai);







@Then("^Verify accessories page with relevent content is displayed$")
public void verify_accessories_page_with_relevent_content_is_displayed() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	
	//accessories page
	rai.VerifyElementsVisible(Vype_CommonXpath.pgaccessories, "ePod Pods");
	
	//verify the accessories
	List<WebElement> list = rai.findElementsList(Vype_CommonXpath.weaccessoriesrList);
	System.out.println("No of device colours :"+list.size());
	for(int i=0; i<list.size();i++)
	{
		String str = list.get(i).getText();

		rai.VerifyElementVisible(Vype_CommonXpath.weaccessoriesrList, "Accessories Section"+ str);
	}
	//verify all accessories
	List<WebElement> list1 = rai.findElementsList(Vype_CommonXpath.weaccessoriesname);
	for(int i=0; i<list1.size();i++)
	{

		String str1 = list.get(i).getText();
		int len=str1.length();
		str1=str1.substring(0,len-6);
		System.out.println((i+1)+":"+str1 );
		rai.VerifyElementVisible(Vype_CommonXpath.weaccessoriesname, "Accessories colour :"+ str1);
	}	
	

}


@When("^User click on travel case$")
public void user_click_on_travel_case() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	rai.ScrollByxpath(Vype_CommonXpath.txttravelcase);
	rai.clickbutton(Vype_CommonXpath.txttravelcase, "Travel Case");
}

@Then("^Verify User is navigated to Product Details Page of travel case$")
public void verify_User_is_navigated_to_Product_Details_Page_of_travel_case() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	
	
	 
	// Verify the user is redirected to Vuse travel case Page
//		 rai.VerifyElementVisible(Vype_CommonXpath.txtcontent ,"price");
	 rai.VerifyElementsVisible(Vype_CommonXpath.txttravelcase ,"Travel Case");
	
   rai.VerifyElementVisible(Vype_CommonXpath.txttravelcaseprice ,"price");
   
   rai.VerifyElementVisible(Vype_CommonXpath.btnphoneholdertext, "text");
   String text=rai.getText(Vype_CommonXpath. btnphoneholdertext);
	 rai.VerifyElementVisible(Vype_CommonXpath. btnphoneholdertext, "quantity");
	 System.out.println("Text displayed is :"+ text);
   
   
   rai.VerifyElementVisible(Vype_CommonXpath.btnproductsliderprev, "<");
	
   rai.VerifyElementVisible(Vype_CommonXpath.btnproductslidernext, ">"); 
   rai.VerifyElementVisible(Vype_CommonXpath.Btnplus, "+ ");

   rai.VerifyElementVisible(Vype_CommonXpath.btnMinus, "- ");
	
   rai.VerifyElementVisible(Vype_CommonXpath. btnAddToCART, "Add to cart");
}

@Then("^Click in right carousel and verify the image$")
public void click_in_right_carousel_and_verify_the_image() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	//click on right carousel
	 rai.clickUsingJs(Vype_CommonXpath.btnproductslidernext, ">"); 
	 
	 //image
	 rai.VerifyElementVisible(Vype_CommonXpath.Btnimage, "image ");
	 
}

@When("^User click on plus button and verify quantity is increased$")
public void user_click_on_plus_button_and_verify_quantity_is_increased() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	rai.ScrollByxpath(Vype_CommonXpath.Btnplus);
	 rai.clickbutton(Vype_CommonXpath.Btnplus, "+ ");
	 String quantity=rai.getText(Vype_CommonXpath. btnquantityinc);
	 rai.VerifyElementVisible(Vype_CommonXpath. btnquantityinc, "quantity");
	 System.out.println("quantity is:"+ quantity);
}



@When("^User click on add to cart and  Verify the mini cart is updated$")
public void user_click_on_add_to_cart_and_Verify_the_mini_cart_is_updated() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	rai.clickbutton(Vype_CommonXpath. btnAddToCART, "Add to cart");
	String str;
	str = rai.getText(Vype_CommonXpath.txtnumber);
	rai.VerifyElementVisible(Vype_CommonXpath.txtnumber, "Cart is updated with " + str + " number ");
	 
	System.out.println("quantity in cart is:"+str);
}




@Then("^Verify user navigates to Accessories page$")
public void Verify_user_navigates_to_Accessories_page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	
	//accessories page
	rai.VerifyElementsVisible(Vype_CommonXpath.pgaccessories, "Accessories");
}



@When("^User click on Phone holder with pod cap$")
public void user_click_on_Phone_holder_with_pod_cap() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	rai.ScrollByxpath(Vype_CommonXpath.txtPhoneHolder);
	
	rai.clickbutton(Vype_CommonXpath.txtPhoneHolder, "Phone holder with pod");
}

@Then("^Verify User is navigated to Product Details Page of Phone holder with pod cap$")
public void verify_User_is_navigated_to_Product_Details_Page_of_Phone_holder_with_pod_cap() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
 
	// Verify the user is redirected to Vuse Phone Holder Page
	rai.VerifyElementsVisible(Vype_CommonXpath.txtPhoneHolder, "Phone holder with pod");
	
    rai.VerifyElementVisible(Vype_CommonXpath.txtphoneholderprice ,"price");
    
    rai.VerifyElementVisible(Vype_CommonXpath.btnphoneholdertext, "text");
    String text=rai.getText(Vype_CommonXpath. btnphoneholdertext);
	 rai.VerifyElementVisible(Vype_CommonXpath. btnphoneholdertext, "quantity");
	 System.out.println("Text displayed is :"+ text);
    
   
    rai.VerifyElementVisible(Vype_CommonXpath.btnproductsliderprev, "<");
	
    rai.VerifyElementVisible(Vype_CommonXpath.btnproductslidernext, ">");
    
    rai.VerifyElementVisible(Vype_CommonXpath.Btnplus, "+ ");

    rai.VerifyElementVisible(Vype_CommonXpath.btnMinus, "- ");
	
    rai.VerifyElementVisible(Vype_CommonXpath. btnAddToCART, "Add to cart");
    
    
}

@When("^User click on device case$")
public void user_click_on_device_case() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	rai.ScrollByxpath(Vype_CommonXpath.txtdevicecase);
	rai.clickbutton(Vype_CommonXpath.txtdevicecase, "device case");
	Thread.sleep(5000);
}

@Then("^Verify User is navigated to Product Details Page of device case$")
public void verify_User_is_navigated_to_Product_Details_Page_of_device_case() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   

	 
		// Verify the user is redirected to Vuse device Page
		rai.VerifyElementsVisible(Vype_CommonXpath.txtdevicecase, "device case ");
		Thread.sleep(5000);
		
        rai.VerifyElementVisible(Vype_CommonXpath.txtdevicecase ,"price");
        
        rai.VerifyElementVisible(Vype_CommonXpath.btnphoneholdertext, "text");
        String text=rai.getText(Vype_CommonXpath. btnphoneholdertext);
		 rai.VerifyElementVisible(Vype_CommonXpath. btnphoneholdertext, "quantity");
		 System.out.println("Text displayed is :"+ text);
        
        rai.VerifyElementVisible(Vype_CommonXpath.btnproductsliderprev, "<");
		
        rai.VerifyElementVisible(Vype_CommonXpath.btnproductslidernext, ">");
		 
        rai.VerifyElementVisible(Vype_CommonXpath.Btnplus, "+ ");

        rai.VerifyElementVisible(Vype_CommonXpath.btnMinus, "- ");
		
        rai.VerifyElementVisible(Vype_CommonXpath. btnAddToCART, "Add to cart");
        
}	

@When("^User clicks on ePod Vaping Products and clicks on Accessories$")
public void user_clicks_on_ePod_Vaping_Products_and_clicks_on_Accessories() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	//click on Device, Pods & Accessories
	rai.clickbutton(Vype_CommonXpath.lnkePodVapingProducts, "epod vaping products");
	
	// Click on Accessories Link
	rai.clickbutton(Vype_CommonXpath.lnkAccessories, "Accessories from epod navigation ");
}


@Then("^User click on right and left corousal and verify the different images are displayed$")
public void User_click_on_right_and_left_corose_and_verify_the_different_images_are_displayed() throws Throwable {
    // Write code here that turns the phrase above into concrete actions



	for(int i=0;i<4;i++)
	{
		rai.clickUsingJs(Vype_CommonXpath.rightarrow, "-> ");

		rai.VerifyElementVisible(Vype_CommonXpath.weProductImage,"product images ");
	}

}


@When("^Click on mini cart icon and verify checkout page$")
public void click_on_mini_cart_icon_and_verify_checkout_page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    
	function.navigatetoViewCart();
}


















}