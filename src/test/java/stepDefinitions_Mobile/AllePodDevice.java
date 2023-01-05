package stepDefinitions_Mobile;





import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.rai.framework.CommonFunctions_Mobile;
import com.rai.framework.RAI_Mobile_Utility_Functions;

import cucumber.api.java.en.*;
import goVype_Properties_mobile.*;


public class AllePodDevice{

	RAI_Mobile_Utility_Functions rai = new RAI_Mobile_Utility_Functions();
	CommonFunctions_Mobile function = new CommonFunctions_Mobile(rai);
	
	
	@Then("^user clicks on ePod Vaping Products and clicks on All ePod devices$")
	public void user_clicks_on_ePod_Vaping_Products_and_clicks_on_All_ePod_devices() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		//click on Device, Pods & Accessories
        rai.clickUsingJs(Vype_CommonXpath.lnkdeviceandpods, "epod vaping products ");
        
        //click on Device, Pods & Accessories
        rai.clickUsingJs(Vype_CommonXpath.lnkdevice, " all epod Devices ");
	    
	}
	

	@Then("^Verify AllePoddevice page is displayed$")
	public void verify_AllePoddevice_page_is_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 rai.verifyTitle("Epod 2 | Vuse Canada");
			
			String Banner=rai.getText(Vype_AllePodDevice.txtbbanner);
			rai.VerifyElementVisible(Vype_AllePodDevice.txtbbanner,Banner);
			System.out.println(Banner); 
	}

	@Then("^User swipe down to faq and verify the no of faqs$")
	public void user_swipe_down_to_faq_and_verify_the_no_of_faqs() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		rai.ScrollByxpath(Vype_CommonXpath.weFAQList);		
		List<WebElement> list=rai.findElementsList(Vype_CommonXpath.weFAQList);
		System.out.println("Total Faqs: "+list.size());
	   
	}

	@When("^User click on Each question and verify the answer displayed$")
	public void user_click_on_Each_question_and_verify_the_answer_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		
		
		List<WebElement> list=rai.findElementsList(Vype_CommonXpath.weFAQList);
		for(int i=0;i<list.size();i++)
		{
			String str=list.get(i).getText();
			str=str.substring(0,15);
			String Qa="(//*[contains(text(),'"+str+"')])";
			rai.clickUsingJs(By.xpath(Qa),Qa);
			String str1="(//*[contains(text(),'"+str+"')])/../..";
			rai.ScrollByxpath(By.xpath(Qa));
			// clicking on each faq
			rai.clickUsingJs(By.xpath(str1),str);
			
			
			String QAs=rai.getText(By.xpath(str1));
			System.out.println((i+1)+":"+QAs+"\n");
			rai.VerifyElementVisible(By.xpath(str1), QAs);
		}
		

	   
	}

	@When("^Click on SEE ALL Faqs$")
	public void click_on_SEE_ALL_Faqs() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		rai.VerifyElementVisible(Vype_AllePodDevice.lnkallfqs,"Link all faqs");
		   rai.clickUsingJs(Vype_AllePodDevice.lnkallfqs, "Link all faqs"); 
	    
	}

	@Then("^Verify the Bat support page and with some sections are displayed$")
	public void verify_the_Bat_support_page_and_with_some_sections_are_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		List<WebElement> list3 = rai.findElementsList(Vype_AllePodDevice.txttitles);
		System.out.println("Total titles: "+list3.size());
		for(int i=0; i<list3.size();i++)
		{
			rai.VerifyElementVisible(Vype_AllePodDevice.txttitles,"list of titles");
			rai.ScrollByxpath(Vype_AllePodDevice.txttitles(i));
			String title=rai.getText(Vype_AllePodDevice.txttitles(i));
			System.out.println((i+1)+":"+title);
			
			
			
		}
	
	}

	@When("^User click on browse back and verify the all ePod device page displayed$")
	public void user_click_on_browse_back_and_verify_the_all_ePod_device_page_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		rai.fnBrowserBack();
		rai.verifyTitle("Epod 2 | Vuse Canada");
	}

	@When("^User click on Learn More link$")
	public void user_click_on_Learn_More_link() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		rai.clickUsingJs(Vype_AllePodDevice.lnklearnmore, "learn more");
		Thread.sleep(2000);
	}

	@Then("^Verify New Era Page is displayed$")
	public void verify_New_Era_Page_is_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		rai.verifyTitle("Vuse Epod 2+ Connected Vape Device | Vuse CanadaS");
		Thread.sleep(3000);
	   
	}

	@When("^Click on ePod(\\d+) Tab and verify ePod(\\d+) device tiles are displayed$")
	public void click_on_ePod_Tab_and_verify_ePod_device_tiles_are_displayed(int arg1, int arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		rai.ScrollByxpath(Vype_AllePodDevice.txtepod2);
		rai.clickbutton(Vype_AllePodDevice.txtepod2, "ePod 2  ");
		
		rai.ScrollByxpath(Vype_AllePodDevice.weepoddevices);
        String devices = rai.getText(Vype_AllePodDevice.weepoddevices);
        rai.VerifyElementVisible(Vype_AllePodDevice.weepoddevices, "devices");
        System.out.println("ePod 2 devices are:"+devices);
	}

	@When("^Click on ePod(\\d+)Plus Tab and verify ePod(\\d+)\\+ device tiles are displayed$")
	public void click_on_ePod_Plus_Tab_and_verify_ePod_device_tiles_are_displayed(int arg1, int arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		rai.ScrollByxpath(Vype_AllePodDevice.txtepod2plus);
		rai.clickbutton(Vype_AllePodDevice.txtepod2plus, "ePod 2  ");

        String devices = rai.getText(Vype_AllePodDevice.weepoddevices);
        rai.VerifyElementVisible(Vype_AllePodDevice.weepoddevices, "devices");
        System.out.println("ePod 2 devices are:"+devices);
	
	    
	}

	@Then("^Verify the AllePoddevice page and with content is displayed$")
	public void verify_the_AllePoddevice_page_and_with_content_is_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		rai.verifyTitle("Epod 2 | Vuse Canada");
		// contnet in allepodpage
		String Banner=rai.getText(Vype_AllePodDevice.txtbbanner);
		rai.VerifyElementVisible(Vype_AllePodDevice.txtbbanner,Banner);
		System.out.println(Banner); 
		
		Thread.sleep(2000);
		
		rai.ScrollByxpath(Vype_AllePodDevice.txtcompare);
		
		String compare=rai.getText(Vype_AllePodDevice.tabcompare);
		rai.VerifyElementVisible(Vype_AllePodDevice.tabcompare,compare);
		System.out.println(compare); 
		Thread.sleep(2000);
		
		rai.ScrollByxpath(Vype_AllePodDevice.txtfeatureacces);
		
		List<WebElement> list3 = rai.findElementsList(Vype_AllePodDevice.tilesfeature);
		System.out.println("Total  no of feature titles: "+list3.size());
		for(int i=0; i<list3.size();i++)
		{
			rai.VerifyElementVisible(Vype_AllePodDevice.tilesfeature,"list of titles");
			rai.ScrollByxpath(Vype_AllePodDevice.tilesfeature(i));
			String title=rai.getText(Vype_AllePodDevice.tilesfeature(i));
			System.out.println((i+1)+":"+title);
			
			
			
		}
		rai.ScrollByxpath(Vype_AllePodDevice.txtXU);
		
		
	}

	@When("^User Swipe down and click on ONE FOR ALL under featured Accessories$")
	public void user_Swipe_down_and_click_on_ONE_FOR_ALL_under_featured_Accessories() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
		Thread.sleep(2000);
		rai.ScrollByxpath(Vype_AllePodDevice.txtfeatureacces);
		
		rai.clickUsingJs(Vype_AllePodDevice.txtone,"one for all"); 
		Thread.sleep(4000);
	}

	@Then("^Verify Travel Case PDP page is displayed$")
	public void verify_Travel_Case_PDP_page_is_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 rai.verifyTitle("Vape Pod Case 'Travel Case' | Vuse Canada");
		   Thread.sleep(2000);
	}

	@When("^User swipe down and click on JUST IN CASE under featured Accessories$")
	public void user_swipe_down_and_click_on_JUST_IN_CASE_under_featured_Accessories() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		 rai.ScrollByxpath(Vype_AllePodDevice.txtfeatureacces);
			
			rai.clickUsingJs(Vype_AllePodDevice.txtjust,"just in case");
			Thread.sleep(4000);
	   
	}

	@Then("^Verify Device Case PDP page is displayed$")
	public void verify_Device_Case_PDP_page_is_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		rai.verifyTitle("Vape Pod Case 'Device Case' | Vuse Canada");
		Thread.sleep(2000);
	}

	@When("^User Swipe down and click on redmeans go under featured Accessories$")
	public void user_Swipe_down_and_click_on_redmeans_go_under_featured_Accessories() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		 rai.ScrollByxpath(Vype_AllePodDevice.txtfeatureacces);
			
			rai.clickUsingJs(Vype_AllePodDevice.txtred,"red on go");
			Thread.sleep(2000);
	   
	}

	@Then("^Verify charging Cable PDP page is displayed$")
	public void verify_charging_Cable_PDP_page_is_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions

		rai.verifyTitle("Vuse ePod 2 Charging Cable | Vuse Canada");
		Thread.sleep(2000);
	}

	@When("^User swipe down and click on power on and keep charging under featured Accessories$")
	public void user_swipe_down_and_click_on_power_on_and_keep_charging_under_featured_Accessories() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
         rai.ScrollByxpath(Vype_AllePodDevice.txtfeatureacces);
		
		rai.clickUsingJs(Vype_AllePodDevice.txtpower,"power charger");
		Thread.sleep(4000);
	}

	@Then("^Verify charging Case PDP page is displayed$")
	public void verify_charging_Case_PDP_page_is_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		rai.verifyTitle("Vape Pod Case 'Charging Case' | Vuse Canada");
		Thread.sleep(2000);
	}

	@When("^User swipe down and Click on PUT A RING ON IT Under  Vuse personalisation$")
	public void user_swipe_down_and_Click_on_PUT_A_RING_ON_IT_Under_Vuse_personalisation() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
      rai.ScrollByxpath(Vype_AllePodDevice.txtXU);
		
		rai.clickUsingJs(Vype_AllePodDevice.txtring,"rings");
		Thread.sleep(2000);
	}

	@Then("^Verify ePodRings  PDP page is displayed$")
	public void verify_ePodRings_PDP_page_is_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		rai.verifyTitle("Vape - Shop Online | Vuse Canada");
		Thread.sleep(2000);
	}

	@When("^User swipe down and Click on Engravings Under  Vuse personalisation$")
	public void user_swipe_down_and_Click_on_Engravings_Under_Vuse_personalisation() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		rai.ScrollByxpath(Vype_AllePodDevice.txtXU);
		   rai.clickUsingJs(Vype_AllePodDevice.txtengravings,"engravings");
		   Thread.sleep(2000);
	    
	}

	@Then("^Verify Engraving  PDP page is displayed$")
	public void verify_Engraving_PDP_page_is_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		rai.verifyTitle("Vape - Shop Online | Vuse Canada");
		Thread.sleep(2000);
	    
	}

	@When("^User swipe down and Click on SkinCollection Under  Vuse personalisation$")
	public void user_swipe_down_and_Click_on_SkinCollection_Under_Vuse_personalisation() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		rai.ScrollByxpath(Vype_AllePodDevice.txtXU);
		   rai.clickUsingJs(Vype_AllePodDevice.txtskin,"skins");
		   Thread.sleep(2000);
	}

	@Then("^Verify Skin PDP page is displayed$")
	public void verify_Skin_PDP_page_is_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		rai.verifyTitle("Vape - Shop Online | Vuse Canada");
	    
	}
	
}
	
	
