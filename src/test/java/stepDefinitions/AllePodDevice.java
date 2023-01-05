package stepDefinitions;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.rai.framework.*;

import cucumber.api.java.en.*;
import goVype_Properties.*;


public class AllePodDevice {

	RAI_Desktop_Utility_Functions gl = new RAI_Desktop_Utility_Functions();
	CommonFunctions function = new CommonFunctions(gl);
	
	
	@When("^User hover on shop and click on AllePodDevice$")
	public void user_hover_on_shop_and_click_on_AllePodDevice() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 function.navigateToePodDevice();
	}

	@Then("^Verify AllePodDevice page is displayed$")
	public void verify_AllePodDevice_page_is_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		
		gl.VerifyPageDisplayedUsingPagetitle("Epod 2 | Vuse Canada");
		
		String Banner=gl.getText(Vype_AllePodDevice.txtbbanner);
		gl.VerifyElementPresent(Vype_AllePodDevice.txtbbanner,Banner);
		System.out.println(Banner); 
	}

	@Then("^User scrolls down to faq and verify the no of faqs$")
	public void user_scrolls_down_to_faq_and_verify_the_no_of_faqs() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 
		//verifying all faqs
		
		gl.fnScrollToView(Vype_CommonXpath.weFAQList);		
		List<WebElement> list=gl.findElementsList(Vype_CommonXpath.weFAQList);
		System.out.println("Total Faqs: "+list.size());
		gl.VerifyElementVisible(Vype_CommonXpath.weFAQList, "No of faqs " + list + " number ");
	
	}

	@When("^User click on each question and verify the answer displayed$")
	public void user_click_on_each_question_and_verify_the_answer_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		List<WebElement> list3 = gl.findElementsList(Vype_CommonXpath.weFAQList);
		for(int i=0; i<list3.size();i++)
		{
			
			gl.clickUsingJs(Vype_AllePodDevice.dropdown(i),"Down arrow");
			gl.fnScrollToView(Vype_AllePodDevice.txtfaq(i));
			String FAQ=gl.getText(Vype_AllePodDevice.txtfaq(i));
			System.out.println((i+1)+":"+FAQ);
			gl.VerifyElementVisible(Vype_AllePodDevice.txtfaq(i), FAQ);
			
			
		}
	   
	}

	@When("^Click on SEE ALL FAQS$")
	public void click_on_SEE_ALL_FAQS() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		gl.VerifyElementVisible(Vype_AllePodDevice.lnkallfqs,"Link all faqs");
	   gl.clickUsingJs(Vype_AllePodDevice.lnkallfqs, "Link all faqs"); 
	}

	@Then("^Verify the bat support page and with some sections are displayed$")
	public void verify_the_bat_support_page_and_with_some_sections_are_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		
		List<WebElement> list3 = gl.findElementsList(Vype_AllePodDevice.txttitles);
		System.out.println("Total titles: "+list3.size());
		for(int i=0; i<list3.size();i++)
		{
			gl.VerifyElementPresent(Vype_AllePodDevice.txttitles,"list of titles");
			gl.fnScrollToView(Vype_AllePodDevice.txttitles(i));
			String title=gl.getText(Vype_AllePodDevice.txttitles(i));
			System.out.println((i+1)+":"+title);
			
			
			
		}

	}

	@When("^User click on browse back and verify the all epod device page displayed$")
	public void user_click_on_browse_back_and_verify_the_all_epod_device_page_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		gl.browserBack();
		gl.VerifyPageDisplayedUsingPagetitle("Epod 2 | Vuse Canada");
	}
	
	@When("^User click on Learn more link$")
	public void user_click_on_Learn_more_link() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		gl.clickUsingJs(Vype_AllePodDevice.lnklearnmore, "learn more");
		Thread.sleep(5000);
	}

	@Then("^Verify New Era page is displayed$")
	public void verify_New_Era_page_is_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		gl.verifyTitle("Vuse Epod 2+ Connected Vape Device | Vuse Canada");
		Thread.sleep(3000);
		
	}
	
	@When("^Click on ePod(\\d+) tab and verify ePod(\\d+) device tiles are displayed$")
	public void click_on_ePod_tab_and_verify_ePod_device_tiles_are_displayed(int arg1, int arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        gl.fnScrollToView(Vype_AllePodDevice.weepoddevices);
        gl.clickbutton(Vype_AllePodDevice.txtepod2, "ePod 2  ");

        String devices = gl.getText(Vype_AllePodDevice.weepoddevices);
        gl.VerifyElementVisible(Vype_AllePodDevice.weepoddevices, "devices");
        System.out.println("ePod 2 devices are:"+devices);

    }
	
	@When("^Click on ePod(\\d+)Plus tab and verify ePod(\\d+)\\+ device tiles are displayed$")
	public void click_on_ePod_Plus_tab_and_verify_ePod_device_tiles_are_displayed(int arg1, int arg2) throws Throwable { 
		// Write code here that turns the phrase above into concrete actions
		gl.fnScrollToView(Vype_AllePodDevice.weepoddevices);
		 gl.clickbutton(Vype_AllePodDevice.txtepod2plus, "ePod 2  ");

	        String devices = gl.getText(Vype_AllePodDevice.weepoddevices);
	        gl.VerifyElementVisible(Vype_AllePodDevice.weepoddevices, "devices");
	        System.out.println("ePod 2 devices are:"+devices);
		
	}

	@Then("^Verify the AllePodDevice page and with content is displayed$")
	public void verify_the_AllePodDevice_page_and_with_content_is_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		gl.VerifyPageDisplayedUsingPagetitle("Epod 2 | Vuse Canada");
		// contnet in allepodpage
		String Banner=gl.getText(Vype_AllePodDevice.txtbbanner);
		gl.VerifyElementPresent(Vype_AllePodDevice.txtbbanner,Banner);
		System.out.println(Banner); 
		
		Thread.sleep(2000);
		
		gl.fnScrollToView(Vype_AllePodDevice.txtcompare);
		
		String compare=gl.getText(Vype_AllePodDevice.tabcompare);
		gl.VerifyElementPresent(Vype_AllePodDevice.tabcompare,compare);
		System.out.println(compare); 
		Thread.sleep(2000);
		
		gl.fnScrollToView(Vype_AllePodDevice.txtfeatureacces);
		
		List<WebElement> list3 = gl.findElementsList(Vype_AllePodDevice.tilesfeature);
		System.out.println("Total  no of feature titles: "+list3.size());
		
		for(int i=0; i<list3.size();i++)
		{
			gl.VerifyElementPresent(Vype_AllePodDevice.tilesfeature,"list of titles");
			gl.fnScrollToView(Vype_AllePodDevice.tilesfeature(i));
			String title=gl.getText(Vype_AllePodDevice.tilesfeature(i));
			System.out.println((i+1)+":"+title);
			
			
			
		}
		gl.fnScrollToView(Vype_AllePodDevice.txtXU);
		
		
		
	}

	@When("^User scrolls down and click on ONE FOR ALL under featured Accessories$")
	public void user_scrolls_down_and_click_on_ONE_FOR_ALL_under_featured_Accessories() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		Thread.sleep(2000);
		gl.fnScrollToView(Vype_AllePodDevice.txtfeatureacces);
		
		gl.clickUsingJs(Vype_AllePodDevice.txtone,"one for all"); 
		Thread.sleep(4000);
	}

	@Then("^Verify Travel case PDP page is displayed$")
	public void verify_Travel_case_PDP_page_is_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
	   gl.VerifyPageDisplayedUsingPagetitle("Vape Pod Case 'Travel Case' | Vuse Canada");
	   Thread.sleep(4000);
	}

	@When("^User scrolls down and click on JUST IN CASE under featured Accessories$")
	public void user_scrolls_down_and_click_on_JUST_IN_CASE_under_featured_Accessories() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
       gl.fnScrollToView(Vype_AllePodDevice.txtfeatureacces);
		
		gl.clickUsingJs(Vype_AllePodDevice.txtjust,"just in case");
		Thread.sleep(5000);
	    
	}

	@Then("^Verify Device case PDP page is displayed$")
	public void verify_Device_case_PDP_page_is_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
		gl.VerifyPageDisplayedUsingPagetitle("Vape Pod Case 'Device Case' | Vuse Canada");
		Thread.sleep(4000);
	}

	@When("^User scrolls down and click on redmeans go under featured Accessories$")
	public void user_scrolls_down_and_click_on_redmeans_go_under_featured_Accessories() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
        gl.fnScrollToView(Vype_AllePodDevice.txtfeatureacces);
		
		gl.clickUsingJs(Vype_AllePodDevice.txtred,"red on go");
		Thread.sleep(2000);
	}
	
	@Then("^Verify charging cable PDP page is displayed$")
	public void verify_charging_cable_PDP_page_is_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
		gl.VerifyPageDisplayedUsingPagetitle("Vuse ePod 2 Charging Cable | Vuse Canada");
		Thread.sleep(2000);
	}
	
	@When("^User scrolls down and click on power on and keep charging under featured Accessories$")
	public void user_scrolls_down_and_click_on_power_on_and_keep_charging_under_featured_Accessories() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
		gl.fnScrollToView(Vype_AllePodDevice.txtfeatureacces);
		
		gl.clickUsingJs(Vype_AllePodDevice.txtpower,"power charger");
		Thread.sleep(4000);
	}

	@Then("^Verify charging case PDP page is displayed$")
	public void verify_charging_case_PDP_page_is_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		gl.VerifyPageDisplayedUsingPagetitle("Vape Pod Case 'Charging Case' | Vuse Canada");
		Thread.sleep(4000);
	}

	@When("^User scrolls down and Click on PUT A RING ON IT Under  Vuse personalisation$")
	public void user_scrolls_down_and_Click_on_PUT_A_RING_ON_IT_Under_Vuse_personalisation() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		gl.fnScrollToView(Vype_AllePodDevice.txtXU);
		
		gl.clickUsingJs(Vype_AllePodDevice.txtring,"rings");
		Thread.sleep(2000);
	}

	@Then("^Verify ePodrings  PDP page is displayed$")
	public void verify_ePodrings_PDP_page_is_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		gl.VerifyPageDisplayedUsingPagetitle("Vape - Shop Online | Vuse Canada");
		Thread.sleep(2000);
	}

	@When("^User scrolls down and Click on Engravings Under  Vuse personalisation$")
	public void user_scrolls_down_and_Click_on_Engravings_Under_Vuse_personalisation() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		gl.fnScrollToView(Vype_AllePodDevice.txtXU);
	   gl.clickUsingJs(Vype_AllePodDevice.txtengravings,"engravings");
	   Thread.sleep(2000);
	}

	@Then("^Verify Engravings  PDP page is displayed$")
	public void verify_Engravings_PDP_page_is_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		gl.VerifyPageDisplayedUsingPagetitle("Vape - Shop Online | Vuse Canada");
		Thread.sleep(2000);
	}

	@When("^User scrolls down and Click on SkinCollection Under  Vuse personalisation$")
	public void user_scrolls_down_and_Click_on_SkinCollection_Under_Vuse_personalisation() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		gl.fnScrollToView(Vype_AllePodDevice.txtXU);
		   gl.clickUsingJs(Vype_AllePodDevice.txtskin,"skins");
		   Thread.sleep(2000);
	    
	}

	@Then("^Verify skin PDP page is displayed$")
	public void verify_skin_PDP_page_is_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		gl.VerifyPageDisplayedUsingPagetitle("Vape - Shop Online | Vuse Canada");
	}
	
}
