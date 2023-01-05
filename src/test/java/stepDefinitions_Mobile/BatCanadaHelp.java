package stepDefinitions_Mobile;

import java.util.List;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.rai.framework.*;
import cucumber.api.java.en.*;
import goVype_Properties.Vype_Help;
import goVype_Properties_mobile.*;


public class BatCanadaHelp extends BaseClass{

	RAI_Mobile_Utility_Functions rai = new RAI_Mobile_Utility_Functions();
	CommonFunctions_Mobile function = new CommonFunctions_Mobile(rai);

	@Then("^navigate back and verify homepage is displayed$")
	public void navigate_back_and_verify_homepage_is_displayed() throws Throwable {

		//Navigate back
		rai.fnNavigateBack();


		Thread.sleep(5000);

		//Verify user is navigated to home page
		String Expectedtitle="Vuse Canada : Vapes & Vape Juices Online Shop ";
		String Actualtitle=rdriver.getTitle();
		Assert.assertEquals(Expectedtitle,Actualtitle);

	}
	
	@When("^User clicks on Shipping and delivery link$")
	public void user_clicks_on_Shipping_and_delivery_link() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		rai.clickLink(Vype_CommonXpath.lnkShippingndDelivery, "Shipping & Delivery link");
	}

	@Then("^Verify Shipping and delivery page$")
	public void verify_Shipping_and_delivery_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		
		rai.ClickUsingOCR("Allow");
		//rai.ClickUsingOCR("Allow only while using the app");
		rai.SwipeDownSmallerUnits(4);
		rai.VerifyElementVisible(Vype_CommonXpath.txtinShippingndDelivery, "Shipping & Delivery page");
	}


	@When("^User click on Contact Us and verify Contact Us screen$")
	public void user_click_on_Contact_Us_and_verify_Contact_Us_screen() throws Throwable {

		//click on contactus link
		rai.clickLink(Vype_Help.lnkcontactUs, "Contact us");

		//verify contact us page
		rai.VerifyElementVisible(Vype_Help.txtcontactus, "Contact Us ");
	}

	@When("^User click on StoreLocator and verify StoreLocator screen$")
	public void user_click_on_StoreLocator_and_verify_StoreLocator_screen() throws Throwable {

		//clicking store locator
		rai.clickLink(Vype_Help.lnkStoreLocator, "Store Locator");

		//verify store locatore page
		rai.VerifyElementVisible(Vype_Help.pgstorelocator, "StoreLocator");		
	}
	@When("^User clicks on FAQs and verify FAQs screen$")
	public void User_clicks_on_FAQs_and_verify_FAQs_screen() throws Throwable {
		
		//click on faqs
		rai.clickLink(Vype_Help.lnksfaq, "Faq");
		// Verify FAQs Page is displayed.
		rai.VerifyElementVisible(Vype_CommonXpath.weTxtGeneralQuestions, "FAQs ");
		rai.fnBrowserBack();
	}

	@When("^User clicks on hamberger menu and clicks on Help and verify links under help$")
	public void user_clicks_on_hamberger_menu_and_clicks_on_Help_and_verify_links_under_help() throws Throwable {

		// Clicking on Menu and navigate to Help
		rai.clickUsingJs(Vype_CommonXpath.btnmenu, "Menu ");
		
		Thread.sleep(2000);

		//click on help
		rai.clickLink(Vype_CommonXpath.lnkHelp, "Help");

		//verify links under help
		List<WebElement> list=rai.findElementsList(Vype_Help.lnkhelp);
		System.out.println("No of links under Help :"+list.size());
		for(int i=0;i<list.size();i++)
		{
			String s=list.get(i).getText();
			System.out.println(s);
			rai.VerifyElementVisible(Vype_Help.lnkhelp, s);
		}
	}


	@And("^User clicks on Shipping and delivery and verify shipping and delivery screen$")
	public void user_clicks_on_Shipping_and_delivery_and_verify_shipping_and_delivery_screen() throws Throwable {

		//Click on Shipping & Delivery link under the Help section
		rai.clickbutton(Vype_CommonXpath.lnkShippingndDelivery, "Shipping & Delivery link");

		Thread.sleep(3000);

		rai.ClickUsingOCR("Allow");
		
		//rai.ClickUsingOCR("Allow only while using the app");

		//Verify Shipping & Delivery page is displayed
		rai.VerifyElementVisible(Vype_CommonXpath.txtinShippingndDelivery, "Shipping & Delivery page");
		
		rai.SwipeDownSmallerUnits(8);

		rai.ScrollByxpath(Vype_Help.shippingcards);
		List<WebElement> list1=rai.findElementsList(Vype_Help.shippingcards);
		System.out.println("Shipping options present :"+list1.size());
		 rai.VerifyElementVisible(Vype_Help.shippingcards, "No of delivery options: "+list1.size());
		for(int i=0;i<list1.size();i++)
		{
			
			rai.VerifyElementVisible(Vype_Help.shippingcards,"list of titles");
			rai.SwipeDownSmallerUnits(5);
			rai.ScrollByxpath(Vype_Help.shippingcards(i));
			Thread.sleep(3000);
			String title=rai.getText(Vype_Help.shippingcards(i));
			System.out.println((i+1)+":"+title);
			
		}
		
		rai.SwipeDownSmallerUnits(6);
		rai.ScrollByxpath(Vype_Help.lnkTermsandConditions);

		rai.VerifyElementVisible(Vype_Help.lnkTermsandConditions, "Terms & Conditions");
		
		rai.SwipeDownSmallerUnits(6);
		
		rai.ScrollByxpath(Vype_Help.txtreadytoshop);
		
		rai.VerifyElementVisible(Vype_Help.txtreadytoshop, "Shop Pods & Shop Devices");
		
		rai.SwipeDownSmallerUnits(8);
		
		rai.ScrollByxpath(Vype_Help.anyquestions);

		rai.VerifyElementVisible(Vype_Help.anyquestions, "Any Question");


	}

	@And("^Click on scroller icon and verify all shipping options$")
	public void click_on_scroller_icon_and_verify_all_shipping_options() throws Throwable {
		
		rai.SwipeUpSmallerUnits(9);
rai.ScrollByxpath(Vype_Help.scrollericon);
		//click on scroll icon
		rai.clickbutton(Vype_Help.scrollericon, "Scroll icon ");

		//verify all shipping cards
		List<WebElement> list1=rai.findElementsList(Vype_Help.shippingcards);
		System.out.println("Shipping options present :"+list1.size());
		for(int i=0;i<list1.size();i++)
		{
			String s1=rai.getText(Vype_Help.shippingcards);
			rai.VerifyElementVisible(Vype_Help.shippingcards, s1);

		}



	}

	@Then("^Validate content of all shipping options$")
	public void validate_content_of_all_shipping_options() throws Throwable {

		//validating content for express shipping
		String ExpressShipping="EXPRESSSHIPPINGAvailableinmostprovincesacrossCanadaSimplyselectExpressShippingatcheckoutandgetyourorderin1-2businessdaysExcludesfederalholidays";
		rai.fnContentValidation(ExpressShipping, Vype_Help.txtexpressshipping);

		rai.SwipeDown(1);

		//validating content for same day delivery
		String samedayshipping="AvailableinGreaterCalgary,TorontoandVancouverareasPlaceyourorderbefore11amforsame?daydeliveryOrdersplacedafter11amqualifyfornext?daydelivery";
		rai.VerifyElementVisible(Vype_Help.shippingcards, samedayshipping);

		rai.SwipeDown(2);

	/*	//validating content for click and collect
		String clickandcollect="AvailableinselectregionsacrossCanadaPlaceyourorderandselectyourpickuplocationatcheckoutYou’llbenotifiedbyemailwhenyourorderisreadyforpickup";
		rai.fnContentValidation(clickandcollect, Vype_Help.txtclickandcollect);*/

		rai.SwipeDown(2);

		//validating content for 
		String Standardshipping="AvailableacrossCanada.FreestandardshippingonallVuseordersover$50.";
		rai.fnContentValidation(Standardshipping, Vype_Help.txtfreestandardshipping);

		rai.RefreshPage();
		
		Thread.sleep(12000);

	}

	@And("^User enters \"([^\"]*)\" and clicks on submit$")
	public void user_enters_and_clicks_on_submit(String zipcode) throws Throwable {

            rai.SwipeDownSmallerUnits(15);
            rai.ScrollByxpath(Vype_Help.txtzipcode);
		//entering zipcode
		rai.inputText(Vype_Help.txtzipcode, "Zipcode", zipcode);

		//submit button
		//rai.clickUsingJs(Vype_Help.btnsubmit, "Submit");
		rai.ClickUsingOCR("Submit");

		//location icon
		rai.VerifyElementVisible(Vype_Help.locateicon, "Location ");
	}
	
	@Then("^Verify Tick Mark is displayed$")
	public void verify_Tick_mark_is_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    rai.VerifyElementVisible(Vype_Help.checkbox,"Click mark is displayed");
	}

	
	@When("^User swipe to ready to shop and clicks on shop devices$")
	public void user_swipe_to_ready_to_shop_and_clicks_on_shop_devices() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		rai.ScrollByxpath(Vype_Help.txtreadytoshop);
		
		rai.clickUsingJs(Vype_Help.lnkshopdevice, "Shop device ");
	}

	@Then("^Verify Epod(\\d+) Page is displayed$")
	public void verify_Epod_Page_is_displayed(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
		Thread.sleep(2000);
		//gl.verifyTitle("Epod 2 | Vuse Canada");
		
		
	}

	@Then("^Switch to default and verify shipping and delivery Page is displayed$")
	public void switch_to_default_and_verify_shipping_and_delivery_Page_is_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		rai.ClosetabAndroid();
		//close current tab
		rai.switchDefault();
		rai.verifyTitle("Shipping Options | Vuse Canada");
		
	}

	@When("^User swipe to ready to shop and clicks on shop pods$")
	public void user_swipe_to_ready_to_shop_and_clicks_on_shop_pods() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
		rai.ScrollByxpath(Vype_Help.txtreadytoshop);
		
		rai.clickUsingJs(Vype_Help.lnkshoppods, "Shop pods ");
		
		
	}

	@Then("^Verify ePod Vape Pods page is Displayed$")
	public void verify_ePod_Vape_Pods_page_is_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
		
		Thread.sleep(2000);
		//gl.verifyTitle("Vuse Pods for the ePod Vape | Vuse Canada");
	}
	
	
	
	@And("^User swipes to ready to shop and clicks on shop devices and pods and verify respective pages$")
	public void user_swipes_to_ready_to_shop_and_clicks_on_shop_devices_and_pods_and_verify_respective_pages() throws Throwable {

		//scroll to ready for shop
		rai.SwipeDown(2);

		//devices image
		rai.VerifyElementVisible(Vype_Help.proddeviceimg, "Devices image ");



		rai.SwipeDownSmallerUnits(2);

		//pods image
		rai.VerifyElementVisible(Vype_Help.podimage, "pods image ");

		/*rai.SwipeUpSmallerUnits(2);
		//click in shop devices
		rai.clickUsingJs(Vype_Help.lnkshopdevice, "Shop device ");




		//click on always show
        rai.ClickUsingOCR("Always show");

		//verify title in device 
				String str1="ePod 2 | Vuse CA";
				String str2=rdriver.getTitle();
				Assert.assertEquals(str1,str2);

        Thread.sleep(5000);
		rai.fnNavigateBack();


		rai.SwipeDownSmallerUnits(2);
		//click on shop pods
		rai.clickUsingJs(Vype_Help.lnkshoppods, "Shop pods ");

		//click on always show
        rai.ClickUsingOCR("Always show");

        Thread.sleep(4000);

		// Verify that ePod's pods page is displayed.
		//rai.VerifyElementVisible(Vype_CommonXpath.pgEpodPods, "ePod Pods");
		rai.fnNavigateBack();*/
	}

	@Then("^User enters question \"([^\"]*)\" and verifies the auto suggesion$")
	public void user_enters_question_and_verifies_the_auto_suggesion(String question) throws Throwable {


		//scroll to faqs
		rai.SwipeDownSmallerUnits(2);

		//enter question
		rai.inputText(Vype_Help.txtkeywords, "Type keywords to find a topic", question);

		//verify suggestion
		rai.VerifyElementVisible(Vype_Help.txtsuggession(question), question );


	}

	@Then("^Swipe to questions and validate content for all question$")
	public void swipe_to_questions_and_validate_content_for_all_question() throws Throwable {


		//scroll to questions
		rai.SwipeDownSmallerUnits(2);

		//verify all question and answers
		List<WebElement> list=rai.findElementsList(Vype_Help.txtallquestions);
		System.out.println("No of faqs :"+list.size());
		for(int i=0;i<list.size();i++)
		{
			String str=list.get(i).getText();
			int len=str.length();
			String str1=str.substring(0,((len/2)-5));
			String qa="(//*[contains(text(),'"+str1+"')])";
			rai.clickUsingJs(By.xpath(qa), str);
			String qa1="(//*[contains(text(),'"+str1+"')])/../..";
			String s=rai.getText(By.xpath(qa1));
			System.out.println((i+1)+":"+s+"\n");
			rai.ScrollByxpath(By.xpath(qa));
			rai.VerifyElementVisible(By.xpath(qa), s );
			rai.clickUsingJs(By.xpath(qa), str);


		}


	}

	@Then("^verify options under Contact Us$")
	public void verify_options_under_Contact_Us() throws Throwable {

		List<WebElement> list=rai.findElementsList(Vype_Help.txtoptionscontactuspage);
		for(int i=0;i<list.size();i++)
		{
			String str=list.get(i).getText();
			System.out.println((i+1)+":"+str);
			rai.VerifyElementVisible(Vype_Help.txtoptionscontactuspage, str);
		}
	}

	@Then("^Click on LIVE CHAT and verify bot is opened and close the bot$")
	public void click_on_LIVE_CHAT_and_verify_bot_is_opened_and_close_the_bot() throws Throwable {

		//click on live Chat
		rai.clickbutton(Vype_Help.lnklivechat, "Live Chat");

		//verify live chat content
		String s=rai.getText(Vype_Help.txtchat);
		rai.VerifyElementVisible(Vype_Help.txtchat,s );

		rdriver.switchTo().frame("webWidget");

		//popup
		rai.VerifyElementVisible(Vype_Help.popup, "pop up");

		//close popup
		rai.clickUsingJs(Vype_Help.btnminimize, "-");

		rdriver.switchTo().defaultContent();
	}

	@Then("^Click on cobrowse and verify model is opened and close the pop up$")
	public void click_on_cobrowse_and_verify_model_is_opened_and_close_the_pop_up() throws Throwable {

		rai.SwipeDown(3);


		//verify co browse text
		String str=rai.getText(Vype_Help.btncobrowse);
		rai.VerifyElementVisible(Vype_Help.btncobrowse, str);

		//click on cobrowse
		rai.clickbutton(Vype_Help.btncobrowse, "Cobrowse ");

		WebElement FrameElement=rdriver.findElement(By.xpath("(//iframe[@src='about:blank'])[2]"));

		rdriver.switchTo().frame(FrameElement);

		//verify cobrowse text
		String str1=rai.getText(Vype_Help.txtcobrowse);
		rai.VerifyElementVisible(Vype_Help.txtcobrowse,str1);

		//click on title co browse
		rai.ClickUsingOCR("Co-Browse with our support");

		


		//verify close icon
		rai.VerifyElementVisible(Vype_Help.btnclose, "x ");

		//click on close
		rai.clickUsingJs(Vype_Help.btnclose, "x ");
		
	

		rdriver.switchTo().defaultContent();
	}



}
