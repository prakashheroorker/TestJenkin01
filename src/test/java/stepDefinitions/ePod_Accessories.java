package stepDefinitions;
import java.util.List;

import org.openqa.selenium.WebElement;

import com.rai.framework.CommonFunctions;
import com.rai.framework.RAI_Desktop_Utility_Functions;

import cucumber.api.java.en.*;

import goVype_Properties.*;


public class ePod_Accessories {
	

	
		RAI_Desktop_Utility_Functions gl = new RAI_Desktop_Utility_Functions();
		CommonFunctions function = new CommonFunctions(gl);
		
		@Then("^user navigates to epod accessories page$")
		public void user_navigates_to_epod_accessories_page() throws Throwable {
			
			function.navigateToaccessoriespage();
			
		}
		/*@Then("^Verify Accessories page with relevent content is displayed$")
        public void verify_accessories_page_with_relevent_content_is_displayed() throws Throwable {
            // Write code here that turns the phrase above into concrete actions

            //accessories page
            gl.VerifyPageDisplayed(Vype_CommonXpath.pgaccessories, "accessories");

            //verify the accessories
            List<WebElement> list = gl.findElementsList(Vype_CommonXpath.weaccessoriesrList);
            System.out.println("No of device colours :"+list.size());
            for(int i=0; i<list.size();i++)
            {
                String str = list.get(i).getText();

 

                gl.VerifyElementVisible(Vype_CommonXpath.weaccessoriesrList, "Accessories Section"+ str);
            }
            //verify all accessories
            List<WebElement> list1 = gl.findElementsList(Vype_CommonXpath.weaccessoriesname);
            for(int i=0; i<list1.size();i++)
            {

 

                String str1 = list.get(i).getText();
                int len=str1.length();
                str1=str1.substring(0,len-6);
                System.out.println((i+1)+":"+str1 );
                gl.VerifyElementVisible(Vype_CommonXpath.weaccessoriesname, "Accessories colour :"+ str1);
            }    
            gl.VerifyObjectDisplayed(Vype_podcaps.plusbtn,"Verify the + button");

            gl.VerifyObjectDisplayed(Vype_podcaps.minusbtn,"Verify the - button");

 

        }*/
		@And("^user navigates to charging cable page$")
		public void user_navigates_to_charging_cable_page() throws Throwable {
			
			
			gl.VerifyElementPresent(Vype_CommonXpath.txtchargingcable, "ePod Accessories ");
			
			 gl.VerifyElementPresent(Vype_CommonXpath.txtcharingcableprice,"price");
			 
			// Verify the user is redirected to Vuse device Page
			gl.clickbutton(Vype_CommonXpath.txtchargingcable, "ePod Accessories ");
			Thread.sleep(5000);
			
            gl.VerifyElementPresent(Vype_CommonXpath.txtcharingcableprice,"price");
			 
		}
		
		@And("^user navigates to Phone Holder with Pod Cap Accessory page$")
		public void user_navigates_to_Phone_Holder_with_Pod_Cap_Accessory_page() throws Throwable {
			
			gl.fnScrollToView(Vype_CommonXpath.txtPhoneHolder);
		    gl.VerifyElementPresent(Vype_CommonXpath.txtphoneholderprice ,"price");
			// Verify the user is redirected to Vuse Phone Holder Page
			gl.clickbutton(Vype_CommonXpath.txtPhoneHolder, "ePod Accessories ");
			Thread.sleep(5000);
            gl.VerifyElementPresent(Vype_CommonXpath.txtphoneholderprice ,"price");
           
            gl.VerifyElementPresent(Vype_CommonXpath.btnproductsliderprev, "<");
			
            gl.VerifyElementPresent(Vype_CommonXpath.btnproductslidernext, ">");
		}
		
		
		@And("^user navigates to device case page$")
		public void user_navigates_to_device_case_page() throws Throwable {
			
			gl.fnScrollToView(Vype_CommonXpath.txtdevicecase);
			
			 gl.VerifyElementPresent(Vype_CommonXpath.txtdevicecase ,"price");
			 
			// Verify the user is redirected to Vuse device Page
			gl.clickbutton(Vype_CommonXpath.txtdevicecase, "ePod Accessories ");
			Thread.sleep(5000);
			
            gl.VerifyElementPresent(Vype_CommonXpath.txtdevicecase ,"price");
            
            gl.VerifyElementPresent(Vype_CommonXpath.btnproductsliderprev, "<");
			
            gl.VerifyElementPresent(Vype_CommonXpath.btnproductslidernext, ">");
			 
		}
		@And("^user navigates to travel case page$")
		public void user_navigates_to_travel_case_page() throws Throwable {
			
			gl.fnScrollToView(Vype_CommonXpath.txttravelcase);
			
			 gl.VerifyElementPresent(Vype_CommonXpath.txttravelcaseprice ,"price");
			 
			// Verify the user is redirected to Vuse travel case Page
			gl.clickbutton(Vype_CommonXpath.txttravelcase, "ePod Accessories ");
			Thread.sleep(5000);
            gl.VerifyElementPresent(Vype_CommonXpath.txttravelcaseprice ,"price");
            
            gl.VerifyElementPresent(Vype_CommonXpath.btnproductsliderprev, "<");
			
            gl.VerifyElementPresent(Vype_CommonXpath.btnproductslidernext, ">"); 
		}
		@And("^user verifies the content and adds product$")
		public void user_verifies_the_content_and_add_product() throws Throwable {
         
			
			
			gl.VerifyElementPresent(Vype_CommonXpath.Btnplus, "+ ");

			gl.VerifyElementPresent(Vype_CommonXpath.btnMinus, "- ");

			gl.VerifyObjectDisplayed(Vype_CommonXpath.btnAddToCart, "Add to cart");
			
			gl.clickbutton(Vype_CommonXpath.Btnplus, "+ ");

			gl.isEnabled(Vype_CommonXpath.btnAddToCart, "Add to cart");

			gl.clickbutton(Vype_CommonXpath.btnAddToCart, "Add to cart");
			//verify the confirmation message "Added to Cart"
			gl.VerifyObjectDisplayed(Vype_ePodWorkflows.txtFloatingMessage, "Added to Cart message ");
			
			//Verify the cart updated to quantity 2
			String Quantity = gl.getText(Vype_CommonXpath.txtnumber);
			gl.VerifyObjectDisplayed(Vype_CommonXpath.txtnumber, "Quantity added is: "+Quantity+" ");
			
			

		}

		@Then("^user navigate to ePodPods$")
		public void user_navigate_to_ePodPods() throws Throwable {
			function.navigateToePodPods();
			
			}	
		
		@And("^user verifies the Header Navigation links on the Vype ePod Charger page$")
		public void user_Verifies_the_Header_Navigation_links_on_the_Vype_ePod_Charger_page() throws Throwable {
			
			String Header = gl.getText(Vype_ePodWorkflows.txtHeader);
			Header = Header.replaceAll("[\\n\\t]", ",");
			if(Header.contains("Products") && Header.contains("Why Shop Online?") && Header.contains("Subscribe & Save"))
			{
				gl.VerifyObjectDisplayed(Vype_ePodWorkflows.txtHeader, "Header with links and shopping cart ");
			}
			
			gl.verifyTitle("Vuse ePod 2 Vape Accessories | Vuse Canada");
			
			//Verify that the Vype logo is available
			gl.VerifyObjectDisplayed(Vype_CommonXpath.txtVuse, "VUSE logo");
			
			//Verify the Profile Icon is available 
			//gl.VerifyObjectDisplayed(Vype_ePodWorkflows.weProfileIcon, "Profile Icon");
			
			//Verify the Cart Icon is available
			gl.VerifyObjectDisplayed(Vype_CommonXpath.lnkCartIcon, "Cart icon");
			
			
		}

	@Then("^user verifies the price and footer text should be displayed \"([^\"]*)\"and\"([^\"]*)\"$")
	public void user_verifies_the_price_and_footer_text_should_be_displayed(String txtTopFooter, String txtBottomFooter) throws Throwable {
		
		String str = gl.getText(Vype_ePodWorkflows.txtPrice);
		gl.VerifyElementVisible(Vype_ePodWorkflows.txtPrice, "Price: "+str+ " ");
		
		
		gl.ScrollPageDown();
		gl.ScrollPageDown();
		gl.ScrollPageDown();
		
		//Verify First Section should have theInstagram, Facebook, Twitter, Youtube,Contact Us, FAQs footerlinks
		gl.fnContentValidation(txtTopFooter, Vype_ePodWorkflows.weFooterTop);
		
		//Verify Second Section should display: Condition of Sale, Privacy Policy, Terms & Conditions and Cookie Policy
		gl.fnContentValidation(txtBottomFooter, Vype_ePodWorkflows.txtLinks);
		
		
		
	
		
	}
	
		
	@Then("^user verifies advisary text and all footer links$")
		public void user_verifies_advisary_text_and_all_footer_links() throws Throwable {
			//Verify advisry text
			String advisoryText =gl.getText(Vype_PlatinumProfileTrigger.txtAdvisoryEPodsPods);
			gl.VerifyObjectDisplayed(Vype_PlatinumProfileTrigger.txtAdvisoryEPodsPods,advisoryText );
			gl.ScrollPageDown();
			Thread.sleep(5000);
             //verify all footer links
			function.VerifyAllFooterLinks();
		}

		@Then("^Validate Legal Advisory and HeadQuarters$")
		public void validate_Legal_Advisory_and_HeadQuarters() throws Throwable {
			//Validate Legal Advisory And HeadQuarters
			String LegalAdvisory = gl.getText(Vype_PlatinumProfileTrigger.txtLegalAdvisoryHeadQuarters);
			if(LegalAdvisory.equals("© Imperial Tobacco Company Ltd., 3711 Saint-Antoine Street West, Montreal, QC H4C 3P6")){
				gl.VerifyObjectDisplayed(Vype_PlatinumProfileTrigger.txtLegalAdvisoryHeadQuarters,"Legal Advisory And Head Quarters Are Displayed");
			}	

		}
		
		@Then("^Verify all the flavours$")
		public void verify_all_the_flavours() throws Throwable {
			List<WebElement> list = gl.findElementsList(Vype_PlatinumProfileTrigger.weEPodPodsFlavour);
			System.out.println("No of Flaours "+list.size());
			for(int i=0;i<list.size();i++){
				String str= list.get(i).getText();
				System.out.println((i+1) +"."+str);
				gl.VerifyElementPresent(Vype_PlatinumProfileTrigger.weEPodPodsFlavour, str );
			}
		}

		@When("^Clicking on plus minus buttons$")
		public void clicking_on_plus_minus_buttons() throws Throwable {
			gl.VerifyElementVisible(Vype_CommonXpath.btn1point6percent, "Increment button of Nicotine strength 1.6 Percentage");		

			//Validate - and + are available for all Nicotine Strengths
			gl.fnTotalNumberOfElements(Vype_CommonXpath.btnsPlusMinusForicotineStrenghts, 3, "- and + are available for all the nicotine strengths");

			//Validate Total Amount Text Is Displayed
			gl.VerifyElementPresent(Vype_PlatinumProfileTrigger.weTotalAmountInCucumberFlavour, "Total Amount Is Present");

			//Validate Add to cart is available
			//gl.clickbutton(Vype_PlatinumProfileTrigger.btnAddToCartFlavour, "Add To Cart Button");
			String amtTxt=gl.getText(Vype_PlatinumProfileTrigger.weTotalAmountInCucumberFlavour);
			if(amtTxt.equals("$13.99")){
				gl.VerifyObjectDisplayed(Vype_PlatinumProfileTrigger.weTotalAmountInCucumberFlavour, "Amount Is $13.99");
			}

		}	

		@Then("^Adding one time purchase$")
		public void adding_one_time_purchase() throws Throwable {
			gl.fnScrollToView(Vype_CommonXpath.txtPack);

			//click on plus button Nicotine strength 1.6%
			gl.clickbutton(Vype_CommonXpath.btn1point6percent, "Add Button");

			//click on Add To Cart.
			gl.clickbutton(Vype_CommonXpath.btnAddToCart, "Add To Cart");

			//Verify mini cart is updated
			String num1 = gl.getText(Vype_SubscriptionLanding.txtnumber);
			gl.VerifyObjectDisplayed(Vype_SubscriptionLanding.txtnumber, "Cart is updated with "+ num1+"items ");

		}

		@Then("^verify price greater than zero$")
		public void verify_price_greater_than_zero() throws Throwable {
			gl.fnScrollToView(Vype_PlatinumProfileTrigger.PriceVal);

			String priceVal=gl.getText(Vype_PlatinumProfileTrigger.PriceVal);
			if(priceVal.equals("$13.99")){
				gl.VerifyElementPresent(Vype_PlatinumProfileTrigger.itemsinCart, "Value is >0");
			}

		}
		
		@When("^Clicking buttons plus and minus$")
		public void clicking_buttons_plus_and_minus() throws Throwable {
			gl.clickbutton(Vype_CommonXpath.btnIncrement1point6percent, "1.6% Nicotine Strength");			

			//Add 1.6% Nicotine Strengths
			gl.clickbutton(Vype_CommonXpath.btnIncrement1point6percent, "1.6% Nicotine Strength");

			//Validate The Cost
			String cost=gl.getText(Vype_PlatinumProfileTrigger.weTotalAmountInCucumberFlavour);
			if(cost.equals("$27.98")){
				gl.VerifyElementPresent(Vype_PlatinumProfileTrigger.weTotalAmountInCucumberFlavour, "Sub Total Value $26.00");
			}

			//Add 1.6% Nicotine Strengths
			gl.clickbutton(Vype_CommonXpath.btnIncrement1point6percent, "1.6% Nicotine Strength");

			//Validate The Cost - weTotalAmountInCucumberFlavour
			String cost1=gl.getText(Vype_PlatinumProfileTrigger.weTotalAmountInCucumberFlavour);
			if(cost1.equals("$41.97")){
				gl.VerifyElementPresent(Vype_PlatinumProfileTrigger.weTotalAmountInCucumberFlavour, "Sub Total Value $39.00 after adding Nicotine Strength");
			}

			//remove 1.6% Nicotine Strengths
			gl.clickbutton(Vype_CommonXpath.btnRIncrement1point6percent, "Removed 1.6% Nicotine Strength");

			//Validate The Cost 
			String subtotalCost=gl.getText(Vype_PlatinumProfileTrigger.weTotalAmountInCucumberFlavour);
			if(subtotalCost.equals("$27.98")){
				gl.VerifyElementPresent(Vype_PlatinumProfileTrigger.weTotalAmountInCucumberFlavour, "Sub Total Value $27.90 after removing 1.6% Nicotine Strength");
			}
			//subtotalCost=subtotalCost.substring(1);

			
		   	}

		@When("^Verifying the amount$")
		public void verifying_the_amount() throws Throwable {
			String subtotalCost=gl.getText(Vype_PlatinumProfileTrigger.weTotalAmountInCucumberFlavour);
			if(subtotalCost.equals("$27.98")){
				gl.VerifyElementPresent(Vype_PlatinumProfileTrigger.weTotalAmountInCucumberFlavour, "Sub Total Value $27.90 after removing 1.6% Nicotine Strength");
			}
		    
		}

		@Then("^verify price greater than previous price$")
		public void verify_price_greater_than_previous_price() throws Throwable {

			//Validate SubTotal is same as Cart Value

			//String priceVal=gl.getText(Vype_PlatinumProfileTrigger.ValPrice);

			//if(priceVal=="$35.98"){
				gl.VerifyElementPresent(Vype_PlatinumProfileTrigger.itemsInCart, "SubTotal and total Value are Same");
			//}
		    
		}
		
		@When("^navigate to epod charger page$")
		public void navigate_to_epod_charger_page() throws Throwable {
			gl.refresh();
			//Hover the mouse on Products link
			gl.HowerMouse(Vype_CommonXpath.lnkShop, "Shops link ");

			//Click on ePod Charger link
			gl.clickUsingJs(Vype_CommonXpath.lnkAccessories,"Accessories  ");

			//Verify the user is redirected to Vuse ePod Charger Page
			//gl.VerifyObjectDisplayed(Vype_CommonXpath.txtePodAccessories, "ePod Accessories ");

		}

		@Then("^Verify headers, top footers \"([^\"]*)\" and bottom \"([^\"]*)\"$")
		public void verify_headers_top_footers_and_bottom(String txtTopFooter, String txtBottomFooter) throws Throwable {
			
			String Header="";
			Thread.sleep(2000);
			Header = gl.getText(Vype_ePodWorkflows.txtHeader);
			Header = Header.replaceAll("[\\n\\t]", ",");
			if(Header.contains("Shop") && Header.contains("Save") && Header.contains("About") && Header.contains("Help") && Header.contains("Vuse Store"))
			{
			gl.VerifyObjectDisplayed(Vype_ePodWorkflows.txtHeader, "Header with links and shopping cart ");
			}

			gl.ScrollPageDown();
			gl.ScrollPageDown();

			//Verify First Section should have theInstagram, Facebook, Twitter, Youtube,Contact Us, FAQs footerlinks
			gl.fnContentValidation(txtTopFooter, Vype_ePodWorkflows.weFooterTop);
			Thread.sleep(2000);
			//Verify Second Section should display: Condition of Sale, Privacy Policy, Terms & Conditions and Cookie Policy
			gl.fnContentValidation(txtBottomFooter, Vype_ePodWorkflows.txtLinks);

		}
		@Then("^Verify headers, top footers \"([^\"]*)\"$")
		public void verify_headers_top_footers_and_bottom(String txtTopFooter) throws Throwable {
			
			String Header="";
			Thread.sleep(2000);
			Header = gl.getText(Vype_ePodWorkflows.txtHeader);
			Header = Header.replaceAll("[\\n\\t]", ",");
			if(Header.contains("Shop") && Header.contains("Save") && Header.contains("About") && Header.contains("Help") && Header.contains("Vuse Store"))
			{
			gl.VerifyObjectDisplayed(Vype_ePodWorkflows.txtHeader, "Header with links and shopping cart ");
			}
		}

		@Then("^navigate epod pod page$")
		public void navigate_epod_pod_page() throws Throwable {
			
			gl.refresh();
			//Hover the mouse on Products link
			gl.HowerMouse(Vype_CommonXpath.lnkShop, "Shop link from the main menu navigation");

			//Verify the Submenu ePod with NS is loaded
			gl.VerifyObjectDisplayed(Vype_CommonXpath.lnkEpodPods, "ePods with 1.6 NS");

			//Click on Pods link under the ePod section
			gl.clickbutton(Vype_CommonXpath.lnkEpodPods,"pods ");

			//Verify that ePod's pods page is displayed.
			gl.VerifyPageDisplayed(Vype_CommonXpath.pgEpodPods, "ePod Pods");
		}

		
		}