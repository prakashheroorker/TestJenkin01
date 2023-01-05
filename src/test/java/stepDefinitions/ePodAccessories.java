package stepDefinitions;
import java.util.List;

import org.openqa.selenium.WebElement;

import com.rai.framework.CommonFunctions;
import com.rai.framework.RAI_Desktop_Utility_Functions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import goVype_Properties.Vype_CommonXpath;
import goVype_Properties.Vype_PlatinumProfileTrigger;
import goVype_Properties.Vype_SubscriptionLanding;
import goVype_Properties.Vype_ePodWorkflows;
import goVype_Properties.Vype_podcaps;

public class ePodAccessories {
	

	
		RAI_Desktop_Utility_Functions gl = new RAI_Desktop_Utility_Functions();
		CommonFunctions function = new CommonFunctions(gl);
		

	  
		
		@When("^User hover on shop and clicks on accessories$")
		public void user_hover_on_shop_and_clicks_on_accessories() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			function.navigateToaccessoriespage();
		}

		@Then("^Verify Accessories page with relevent content is displayed$")
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

		}
		
		
		@When("^User click on travel case$")
		public void user_click_on_travel_case() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			gl.fnScrollToView(Vype_CommonXpath.txttravelcase);
			gl.clickbutton(Vype_CommonXpath.txttravelcase, "Travel Case");
		}

		@Then("^Verify User is navigated to Product Details Page of travel case$")
		public void verify_User_is_navigated_to_Product_Details_Page_of_travel_case() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			
			
			 
			// Verify the user is redirected to Vuse travel case Page
	//		 gl.VerifyElementPresent(Vype_CommonXpath.txtcontent ,"price");
			 gl.fnVerifyPageDisplayed(Vype_CommonXpath.txttravelcase ,"Travel Case");
			
           gl.VerifyElementPresent(Vype_CommonXpath.txttravelcaseprice ,"price");
           
           gl.VerifyElementPresent(Vype_CommonXpath.btnphoneholdertext, "text");
           String text=gl.getText(Vype_CommonXpath. btnphoneholdertext);
			 gl.VerifyElementVisible(Vype_CommonXpath. btnphoneholdertext, "quantity");
			 System.out.println("Text displayed is :"+ text);
           
           
           gl.VerifyElementPresent(Vype_CommonXpath.btnproductsliderprev, "<");
			
           gl.VerifyElementPresent(Vype_CommonXpath.btnproductslidernext, ">"); 
           gl.VerifyElementVisible(Vype_CommonXpath.Btnplus, "+ ");

           gl.VerifyElementVisible(Vype_CommonXpath.btnMinus, "- ");
   		
           gl.VerifyElementVisible(Vype_CommonXpath. btnAddToCART, "Add to cart");
		}

		@Then("^Click on right carousel and verify the image$")
		public void click_on_right_carousel_and_verify_the_image() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			//click on right carousel
			 gl.clickUsingJs(Vype_CommonXpath.btnproductslidernext, ">"); 
			 
			 //image
			 gl.VerifyElementVisible(Vype_CommonXpath.Btnimage, "image ");
			 
		}
		
		@When("^User clicks on plus button and verify quantity is increased$")
		public void user_clicks_on_plus_button_and_verify_quantity_is_increased() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			
			
			
			 gl.clickbutton(Vype_CommonXpath.Btnplus, "+ ");
			 
			 String quantity=gl.getText(Vype_CommonXpath. btnquantityinc);
			 gl.VerifyElementVisible(Vype_CommonXpath. btnquantityinc, "quantity is:" +quantity+" in number");
			 System.out.println("quantity is:"+ quantity);
		}



		

		
		@Then("^Verify user navigated to accessories page$")
		public void Verify_user_navigated_to_dccessories_page() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			
			//accessories page
			gl.VerifyPageDisplayed(Vype_CommonXpath.pgaccessories, "ePod Pods");
		}
		
		
		
		@When("^User click on Phone holder with pod cap$")
		public void user_click_on_Phone_holder_with_pod_cap() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			gl.fnScrollToView(Vype_CommonXpath.txtPhoneHolder);
			
			gl.clickbutton(Vype_CommonXpath.txtPhoneHolder, "Phone holder with pod");
		}

		@Then("^Verify User is navigated to Product Details Page of Phone Holder with pod cap$")
		public void verify_User_is_navigated_to_Product_Details_Page_of_Phone_Holder_with_pod_cap() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		 
			// Verify the user is redirected to Vuse Phone Holder Page
			gl.fnVerifyPageDisplayed(Vype_CommonXpath.txtPhoneHolder, "Phone holder with pod");
			
            gl.VerifyElementPresent(Vype_CommonXpath.txtphoneholderprice ,"price");
            
            gl.VerifyElementPresent(Vype_CommonXpath.btnphoneholdertext, "text");
            String text=gl.getText(Vype_CommonXpath. btnphoneholdertext);
			 gl.VerifyElementVisible(Vype_CommonXpath. btnphoneholdertext, "quantity");
			 System.out.println("Text displayed is :"+ text);
            
           
            gl.VerifyElementPresent(Vype_CommonXpath.btnproductsliderprev, "<");
			
            gl.VerifyElementPresent(Vype_CommonXpath.btnproductslidernext, ">");
            
            gl.VerifyElementVisible(Vype_CommonXpath.Btnplus, "+ ");

            gl.VerifyElementVisible(Vype_CommonXpath.btnMinus, "- ");
    		
            gl.VerifyElementVisible(Vype_CommonXpath. btnAddToCART, "Add to cart");
            
            
		}
		
		@When("^User click on Device Case$")
		public void user_click_on_Device_Case() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			gl.fnScrollToView(Vype_CommonXpath.txtdevicecase);
			gl.clickbutton(Vype_CommonXpath.txtdevicecase, "device case");
			Thread.sleep(5000);
		}

		@Then("^Verify User is navigated to Product Details Page of device case$")
		public void verify_User_is_navigated_to_Product_Details_Page_of_device_case() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		   
		
			 
				// Verify the user is redirected to Vuse device Page
				gl.fnVerifyPageDisplayed(Vype_CommonXpath.txtdevicecase, "device case ");
				Thread.sleep(5000);
				
	            gl.VerifyElementPresent(Vype_CommonXpath.txtdevicecase ,"price");
	            
	            gl.VerifyElementPresent(Vype_CommonXpath.btnphoneholdertext, "text");
	            String text=gl.getText(Vype_CommonXpath. btnphoneholdertext);
				 gl.VerifyElementVisible(Vype_CommonXpath. btnphoneholdertext, "quantity");
				 System.out.println("Text displayed is :"+ text);
	            
	            gl.VerifyElementPresent(Vype_CommonXpath.btnproductsliderprev, "<");
				
	            gl.VerifyElementPresent(Vype_CommonXpath.btnproductslidernext, ">");
				 
	            gl.VerifyElementVisible(Vype_CommonXpath.Btnplus, "+ ");

	            gl.VerifyElementVisible(Vype_CommonXpath.btnMinus, "- ");
	    		
	            gl.VerifyElementVisible(Vype_CommonXpath. btnAddToCART, "Add to cart");
	            
		}	
		
		
		
		

		}
		
		
		
		
		
		
		
		
		
		
