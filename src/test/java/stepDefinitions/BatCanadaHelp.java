package stepDefinitions;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.rai.framework.*;
import cucumber.api.java.en.*;
import goVype_Properties.*;


public class BatCanadaHelp extends BaseClass {

	RAI_Desktop_Utility_Functions gl = new RAI_Desktop_Utility_Functions();
	CommonFunctions function = new CommonFunctions(gl);


	@Then("^browse back$")
	public void browse_back() throws Throwable {

		gl.navigateBack();
		Thread.sleep(5000);

	}

	@And("^User Hover on Help and click on Contact us and verify Contact Us page$")
	public void user_Hover_on_Help_and_click_on_Contact_us_and_verify_Contact_Us_page() throws Throwable {

		//Hower on Help link
		gl.HowerMouse(Vype_CommonXpath.lnkHelp, "Help link");

		//click on contactus link
		gl.clickLink(Vype_Help.lnkcontactUs, "Contact us");

		//verify contact us page
		gl.VerifyElementVisible(Vype_Help.txtcontactus, "Contact Us ");

	}

	
	@And("^User Hover on Help and click on Faq and verify Faq page$")
	public void user_Hover_on_Help_and_click_on_Faq_and_verify_Faq_page() throws Throwable {

		//Hower on Help link
		gl.HowerMouse(Vype_CommonXpath.lnkHelp, "Help link");

		//click on faqs
		gl.clickLink(Vype_Help.lnkfaq, "Faq");

		// Verify FAQs Page is displayed.
		gl.VerifyElementVisible(Vype_CommonXpath.weTxtGeneralQuestions, "FAQs ");
		
		gl.browserBack();
		Thread.sleep(5000);
		
		

	}

	@And("^User Hover on Help and click on StoreLocator and verify StoreLocator page$")
	public void user_Hover_on_Help_and_click_on_StoreLocator_and_verify_StoreLocator_page() throws Throwable {

		//Hower on Help link
		gl.HowerMouse(Vype_CommonXpath.lnkHelp, "Help link");

		//clicking store locator
		gl.clickLink(Vype_Help.lnkStoreLocator, "Store Locator");

		//verify store locatore page
		gl.VerifyElementVisible(Vype_Help.pgstorelocator, "StoreLocator");				

	}

	@And("^User Hover on Help and verify links under help$")
	public void user_Hover_on_Help_and_verify_links_under_help() throws Throwable {

		//Hower on Help link
		gl.HowerMouse(Vype_CommonXpath.lnkHelp, "Help link");

		//verify links under help
		List<WebElement> list=gl.findElementsList(Vype_Help.lnkshelp);
		System.out.println("No of links under Help :"+list.size());
		for(int i=0;i<list.size();i++)
		{
			gl.VerifyElementPresent(Vype_Help.lnkshelp,"list of titles");
			String s=list.get(i).getText();
			System.out.println((i+1)+":"+s);
		}

//		gl.VerifyElementPresent(Vype_Help.lnkshelp,"list of titles");
//		gl.fnScrollToView(Vype_Help.lnkshelp(i));
//		String title=gl.getText(Vype_AllePodDevice.txttitles(i));
//		System.out.println((i+1)+":"+title);
	}

	@And("^User clicks on Shipping and delivery$")
	public void User_clicks_on_shipping_and_delivery() throws Throwable {

		//Click on Shipping & Delivery link under the Help section
		gl.clickbutton(Vype_CommonXpath.lnkShippingndDelivery, "Shipping & Delivery link");

		Thread.sleep(3000);
		gl.verifyTitle("Shipping Options | Vuse Canada");
		//Verify Shipping & Delivery page is displayed
		//gl.VerifyObjectDisplayed(Vype_CommonXpath.txtinShippingndDelivery, "Shipping & Delivery page");


	}

	@And("^verify shipping and delivery page is displayed$")
	public void verify_shipping_and_delivery_page_is_displayed() throws Throwable {

		gl.verifyTitle("Shipping Options | Vuse Canada");

		gl.VerifyObjectDisplayed(Vype_Help.txtinShippingndDelivery, "Shipping & Delivery page");

		gl.VerifyElementVisible(Vype_Help.txtfindshippingoptions, "Find Shipping options");

		//verify all shipping cards
		
		gl.fnScrollToView(Vype_Help.shippingcards);
		List<WebElement> list1=gl.findElementsList(Vype_Help.shippingcards);
		System.out.println("Shipping options present :"+list1.size());
		 gl.VerifyElementVisible(Vype_Help.shippingcards, "No of delivery options: "+list1.size());
		for(int i=0;i<list1.size();i++)
		{
			gl.VerifyElementPresent(Vype_Help.shippingcards,"list of titles");
			gl.fnScrollToView(Vype_Help.shippingcards(i));
			String title=gl.getText(Vype_Help.shippingcards(i));
			System.out.println((i+1)+":"+title);
			
		}
		gl.fnScrollToView(Vype_Help.lnkTermsandConditions);

		gl.VerifyElementVisible(Vype_Help.lnkTermsandConditions, "Terms & Conditions");
		
		gl.fnScrollToView(Vype_Help.txtreadytoshop);
		
		gl.VerifyElementVisible(Vype_Help.txtreadytoshop, "Shop Pods & Shop Devices");
		
		gl.fnScrollToView(Vype_Help.anyquestions);

		gl.VerifyElementVisible(Vype_Help.anyquestions, "Any Question");

	}

	@And("^User clicks on Shipping and delivery and verify shipping and delivery page$")
	public void user_clicks_on_Shipping_and_delivery_and_verify_shipping_and_delivery_page() throws Throwable {

		//Click on Shipping & Delivery link under the Help section
		gl.clickbutton(Vype_CommonXpath.lnkShippingndDelivery, "Shipping & Delivery link");

		Thread.sleep(3000);
		gl.VerifyPageDisplayedUsingPagetitle("Shipping Options | Vuse Canada");
		//Verify Shipping & Delivery page is displayed
		//gl.VerifyObjectDisplayed(Vype_CommonXpath.txtinShippingndDelivery, "Shipping & Delivery page");



	}

	@When("^click on scroller icon and verify shipping options$")
	public void click_on_scroller_icon_and_verify_shipping_options() throws Throwable {

		//click on scroll icon
		gl.clickbutton(Vype_Help.scrollericon, "Scroll icon ");

		gl.VerifyElementVisible(Vype_Help.weExpShipping, "EXPRESS SHIPPING");
		
		String txtcontents = gl.getText(Vype_Help.txtExpShipping);

		gl.VerifyElementVisible(Vype_Help.txtExpShipping,txtcontents);
		System.out.println(txtcontents);

		gl.VerifyElementVisible(Vype_Help.weSDD, "SAME-DAY DELIVERY");
		
		String txtcontent = gl.getText(Vype_Help.txtweSDD);

		gl.VerifyElementVisible(Vype_Help.txtweSDD,txtcontent);
		System.out.println(txtcontent);
		
		gl.refresh();
		
		Thread.sleep(15000);

	}

	@And("^User enters \"([^\"]*)\" and click on submit$")
	public void user_enters_and_click_on_submit(String zipcode) throws Throwable {

       gl.fnScrollToView(Vype_Help.txtclick);
		//entering zipcode
		gl.inputText(Vype_Help.txtzipcode, "Zipcode", zipcode);

		//submit button
		gl.clickUsingJs(Vype_Help.btnsubmit, "Submit");

		//location icon
		//gl.VerifyElementVisible(Vype_Help.locateicon, "Location ");
		Thread.sleep(2000);
		


	}

	@Then("^User scrolls to ready to shop and clicks on shop devices and pods and verify respective pages$")
	public void user_scrolls_to_ready_to_shop_and_clicks_on_shop_devices_and_pods_and_verify_respective_pages() throws Throwable {

		//scroll to ready for shop
		gl.fnScrollToView(Vype_Help.txtreadytoshop);

		//devices image
		gl.VerifyElementVisible(Vype_Help.proddeviceimg, "Devices image ");

		//pods image
		gl.VerifyElementVisible(Vype_Help.podimage, "pods image ");

		//click in shop devices
		gl.clickUsingJs(Vype_Help.lnkshopdevice, "Shop device ");

		//switch to next tab
		gl.fnSwitchToSucceedingTab();

		/*//verify title in device 
		String str1="ePod 2 | Vuse CA";
		String str2=rdriver.getTitle();
		Assert.assertEquals(str1,str2);*/


		//close current tab
		gl.fnCloseCurrentTab();
		gl.fnSwitchToDefaultTab();
		//click on shop pods
		gl.clickUsingJs(Vype_Help.lnkshoppods, "Shop pods ");

		//switch to next tab
		gl.fnSwitchToSucceedingTab();

		// Verify that ePod's pods page is displayed.
		//gl.VerifyElementVisible(Vype_CommonXpath.pgEpodPods, "ePod Pods");
		gl.fnCloseCurrentTab();
		//close current tab
		gl.fnSwitchToDefaultTab();



	}


	@And("^user enter question \"([^\"]*)\" and verifies the auto suggesion$")
	public void user_enter_question_and_verifies_the_auto_suggesion(String question) throws Throwable {

		//scroll to faqs
		gl.fnScrollToView(Vype_Help.txtfaqs);

		//enter question
		gl.inputText(Vype_Help.txtkeywords, "Type keywords to find a topic", question);

		//verify suggestion
		gl.VerifyObjectDisplayed(Vype_Help.txtsuggession(question), question );

		//clear text
		gl.ClearText(Vype_Help.txtkeywords, question);


	}

	@Then("^scroll to questions and validate content for all question$")
	public void scroll_to_questions_and_validate_content_for_all_question() throws Throwable {

		//scroll to questions
		gl.fnScrollToView(Vype_Help.txtquestions);

		//verify all question and answers
		List<WebElement> list=gl.findElementsList(Vype_Help.txtallquestions);
		System.out.println("No of faqs :"+list.size());
		for(int i=0;i<list.size();i++)
		{
			String str=list.get(i).getText();
			int len=str.length();
			String str1=str.substring(0,((len/2)-5));
			String qa="(//*[contains(text(),'"+str1+"')])";
			gl.clickUsingJs(By.xpath(qa), str);
			String qa1="(//*[contains(text(),'"+str1+"')])/../..";
			String s=gl.getText(By.xpath(qa1));
			System.out.println((i+1)+":"+s+"\n");
			gl.fnScrollToView(By.xpath(qa));
			gl.VerifyElementVisible(By.xpath(qa), s );
			gl.clickUsingJs(By.xpath(qa), str);


		}

	}
	
	//Added by sireesha
	
	@Then("^Verify click mark is displayed$")
	public void verify_click_mark_is_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    gl.VerifyElementVisible(Vype_Help.checkbox,"Click mark is displayed");
	}

	@When("^User scrolls to ready to shop and clicks on shop devices$")
	public void user_scrolls_to_ready_to_shop_and_clicks_on_shop_devices() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		gl.fnScrollToView(Vype_Help.txtreadytoshop);
		
		gl.clickUsingJs(Vype_Help.lnkshopdevice, "Shop device ");
	}

	@Then("^Verify Epod(\\d+) page is displayed$")
	public void verify_Epod_page_is_displayed(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
		gl.fnSwitchToSucceedingTab();
		Thread.sleep(4000);
		gl.VerifyPageDisplayedUsingPagetitle("Epod 2 | Vuse Canada");
		
		
	}

	@Then("^Switch to default and verify shipping and delivery page is displayed$")
	public void switch_to_default_and_verify_shipping_and_delivery_page_is_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		gl.fnCloseCurrentTab();
		//close current tab
		gl.fnSwitchToDefaultTab();
		gl.VerifyPageDisplayedUsingPagetitle("Shipping Options | Vuse Canada");
		
	}

	@When("^User scrolls to ready to shop and clicks on shop pods$")
	public void user_scrolls_to_ready_to_shop_and_clicks_on_shop_pods() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
		gl.fnScrollToView(Vype_Help.txtreadytoshop);
		
		gl.clickUsingJs(Vype_Help.lnkshoppods, "Shop pods ");
		
		
	}

	@Then("^Verify ePod Vape Pods page is displayed$")
	public void verify_ePod_Vape_Pods_page_is_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
		gl.fnSwitchToSucceedingTab();
		Thread.sleep(4000);
		gl.VerifyPageDisplayedUsingPagetitle("Vuse Pods for the ePod Vape | Vuse Canada");
	}

	@When("^User clicks on each question and verify the answer displayed$")
	public void user_clicks_on_each_question_and_verify_the_answer_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	 
		
		//scroll to questions
				gl.fnScrollToView(Vype_Help.txtquestions);

				//verify all question and answers
				List<WebElement> list=gl.findElementsList(Vype_Help.txtallquestions);
				System.out.println("No of faqs :"+list.size());
				for(int i=0;i<list.size();i++)
				{
					String str=list.get(i).getText();
					int len=str.length();
					String str1=str.substring(0,((len/2)-5));
					String qa="(//*[contains(text(),'"+str1+"')])";
					gl.clickUsingJs(By.xpath(qa), str);
					String qa1="(//*[contains(text(),'"+str1+"')])/../..";
					String s=gl.getText(By.xpath(qa1));
					System.out.println((i+1)+":"+s+"\n");
					gl.fnScrollToView(By.xpath(qa));
					gl.VerifyElementVisible(By.xpath(qa), s );
					gl.clickUsingJs(By.xpath(qa), str);


				}
	}


}
