package stepDefinitions_Mobile;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.rai.framework.BaseClass;
import com.rai.framework.CommonFunctions_Mobile;
import com.rai.framework.RAI_Mobile_Utility_Functions;

import cucumber.api.java.en.Then;
import goVype_Properties_mobile.Vype_CommonXpath;
import goVype_Properties_mobile.Vype_PlatinumProfileTrigger;
import goVype_Properties_mobile.Vype_PlusContents_Mobile;

public class VypePlusContents extends BaseClass{

	RAI_Mobile_Utility_Functions rai = new RAI_Mobile_Utility_Functions();
	CommonFunctions_Mobile function = new CommonFunctions_Mobile(rai);
	
	@Then("^Verify vuse\\+ rewards page and verify joining is easy content$")
	public void verify_vuse_rewards_page_and_verify_joining_is_easy_content() throws Throwable {
		//Validate Whether Vuse + Page Is Displayed
		rai.VerifyElementsVisible(Vype_PlatinumProfileTrigger.pgVusePlus, "Vuse+ Page");

		//Verify text Joining easy
		rai.VerifyElementsVisible(Vype_PlusContents_Mobile.txtRewardProgram, "A reward program exclusively");

		String str=rai.getText(Vype_PlusContents_Mobile.txtRewardContent);
		//Verify text Just keep Shopping-----and more
		rai.VerifyElementsVisible(Vype_PlusContents_Mobile.txtRewardContent, str);
		//rai.ScrolltoBottomofthepage();

	}

	@Then("^Verify how to maintan your status content$")
	public void verify_how_to_maintan_your_status_content() throws Throwable {
		rai.ScrollByxpath(Vype_PlusContents_Mobile.txtHowmaintainStatus);
		//Verify Text "How to maintain your status?
		rai.VerifyElementsVisible(Vype_PlusContents_Mobile.txtHowmaintainStatus, "Hoe to maintain your status");

		String str=rai.getText(Vype_PlusContents_Mobile.txtStaySubscribe);
		//Verify Text "Stay subscribed to …..It's that easy" is displayed
		rai.VerifyElementsVisible(Vype_PlusContents_Mobile.txtStaySubscribe, str);
	}

	@Then("^Verify perks of vuseplus and benfits$")
	public void verify_perks_of_vuseplus_and_benfits() throws Throwable {
		rai.ScrollByxpath(Vype_PlusContents_Mobile.txtPerksVuse);
		List<WebElement> list;
		String str = "";

		//Verify the text the perks of vuse+
		rai.VerifyElementsVisible(Vype_PlusContents_Mobile.txtPerksVuse, "the perks of vuse+");

		//Verify the perks section
		rai.VerifyElementsVisible(Vype_PlusContents_Mobile.weBenifits, "the perks of vuse+ Section");

		//Verify Check your status button
		rai.VerifyElementsVisible(Vype_PlusContents_Mobile.btnCheckStatus, "Check your status");

		rai.VerifyElementsVisible(Vype_PlusContents_Mobile.txtSilverGold, "the perks of vuse+ ");
		//Verify 2 section Gold, Platinum
		list = rai.findElementsList(By.xpath("//*[contains(@class,'TierComparison___Sty')]"));
		System.out.println("The perks of vuse "+list.size()+1);
		for(int j=0; j<list.size();)
		{
			str = list.get(j).getText();
			System.out.println("The string is: " + str);
			if(str.contains("Gold") || str.contains("Platinum"))
			{
				//updated on oct1
				rai.VerifyElementsVisible(Vype_PlusContents_Mobile.txtSilverGold, str+ " section ");
				j=j+2;
			}

		}

		String benefits1=rai.getText(Vype_PlusContents_Mobile.txtbenfitssection);

		rai.VerifyElementsVisible(Vype_PlusContents_Mobile.txtbenfitssection, benefits1 );
	}

	@Then("^Verify video below rewards program$")
	public void verify_video_below_rewards_program() throws Throwable {
		rai.ScrollByxpath(Vype_PlusContents_Mobile.txtRewardsProgram);
		//Verify the text Rewards Program
		rai.VerifyElementsVisible(Vype_PlusContents_Mobile.txtRewardsProgram,"Rewards Program");

		//Verify youtube video is displayed
		rai.VerifyElementsVisible(Vype_PlusContents_Mobile.weVideo, "Youtube video");
	}

	@Then("^Verify faqs present in vuseplus rewards page$")
	public void verify_faqs_present_in_vuseplus_rewards_page() throws Throwable {
		rai.ScrollByxpath(Vype_PlusContents_Mobile.txtAnyQuestions);
		//Verify text Any Questions? is displayed
		rai.VerifyElementsVisible(Vype_PlusContents_Mobile.txtAnyQuestions, "Any Questions? ");

		//Verify Type keywords to find a topic text box is displayed
		rai.VerifyElementsVisible(Vype_PlusContents_Mobile.txtTypeKeywords, "Type keywords to find a topic textbox ");

		//Verify You can also browse the topics text is displayed
		rai.VerifyElementsVisible(Vype_PlusContents_Mobile.txtYouCanBrowse, "You can also browse text ");

		List<WebElement> list;
		list = rai.findElementsList(By.xpath("//*[contains(@id,'question')]"));
		System.out.println("No of Faqs :"+list.size());
			for(int k=0;k<list.size();k++)
			{
					String str = list.get(k).getText();
					System.out.println((k+1)+"."+str);
					rai.VerifyElementsVisible(Vype_PlusContents_Mobile.txtTrendingTopics, str );
			}
	}

	@Then("^Verify all footer links$")
	public void verify_all_footer_links() throws Throwable {
		function.VerifyAllFooterLinks();
	}

	@Then("^Verify footer content present in vuseplus rewards page$")
	public void verify_footer_content_present_in_vuseplus_rewards_page() throws Throwable {
		rai.ScrollByxpath(Vype_CommonXpath.lnkTermsandConditions);
		String footer1=rai.getText(Vype_PlusContents_Mobile.txtVuseProducts);
		rai.VerifyElementsVisible( Vype_PlusContents_Mobile.txtVuseProducts,footer1);
	}
	
	@Then("^Verify play and pause functionalities in the video$")
	public void Verify_play_and_pause_functionalities_in_the_video() throws Throwable {

		//Click On Video To Play
		rai.clickUsingJs(Vype_PlatinumProfileTrigger.lnkVideo, "Video Clicked To Play");

		//Wait for Few Seconds
		Thread.sleep(2000);

		//Validate Whether Video Is playing
		String zeroProgressValue = "00:00 of 00:29";
		//pause
		rai.clickUsingJs(Vype_PlatinumProfileTrigger.lnkVideo, "Video clicked to stop To fetch the progress time");

		rai.frameByelement(Vype_PlatinumProfileTrigger.lnkVideo);
		
		//rai.clickUsingJs(Vype_PlatinumProfileTrigger.maximize,"Maximize the Video");
		
		String progressValue = rai.fnGetAttributeValue(Vype_PlatinumProfileTrigger.weValueOfProgress,"aria-valuetext");
		System.out.println("Progress Value :"+progressValue);


		if((progressValue!=zeroProgressValue)){
			rai.VerifyElementsVisible(Vype_PlatinumProfileTrigger.weValueOfProgress, "Video Is Played");
		}


		rai.switchDefault();



		rai.clickUsingJs(Vype_PlatinumProfileTrigger.lnkVideo, "Video Play2");

		rai.frameByelement(Vype_PlatinumProfileTrigger.lnkVideo);
		//play
		String pausedValue = rai.fnGetAttributeValue(Vype_PlatinumProfileTrigger.weValueOfProgress,"aria-valuetext");
		System.out.println("Paused Value :"+pausedValue);

		rai.switchDefault();
		//pause
		rai.clickUsingJs(Vype_PlatinumProfileTrigger.lnkVideo, "Video Pause2");
		rai.frameByelement(Vype_PlatinumProfileTrigger.lnkVideo);
		String pauseTime = rai.fnGetAttributeValue(Vype_PlatinumProfileTrigger.weValueOfProgress,"aria-valuetext");
		System.out.println("pauseTime :"+pauseTime);

		pauseTime=pauseTime.substring(3,5);
		int pauseTimeInt = Integer.parseInt(pauseTime);
		System.out.println("pauseTimeInt :"+pauseTimeInt);

		Thread.sleep(2000);

	}
	
	@Then("^Verify all footer links in Vuse\\+ Rewards page$")
	public void verify_all_footer_links_in_Vuse_Rewards_page() throws Throwable {
		/*rai.ScrollByxpath(Vype_CommonXpath.lnkLogin);
		//rai.ClickUsingOCR("X");
		// Click on Instagram text
		//rai.clickLink(Vype_CommonXpath.lnkLogin, "Instagram ");
		rai.ClickUsingOCR("INSTAGRAM");
		// Verify Instagram page is displayed
		rai.VerifyElementsVisible(Vype_CommonXpath.txtInstagram, "Instagram ");
		//rai.switchDefault();
		rai.ClosetabAndroid();
		
		rai.ScrollByxpath(Vype_CommonXpath.lnkLogin);
		// Click on Facebook text
		//rai.clickLink(Vype_CommonXpath.lnkFacebook, "Facebook text ");
		rai.ClickUsingOCR("FACEBOOK");
		// Verify Facebook page is displayed
		rai.VerifyElementVisible(Vype_CommonXpath.txtFacebookMobile, "Facebook ");

		rai.ClosetabAndroid();

		//rai.ScrollByxpath(Vype_CommonXpath.lnkLogin);
		// Click on Twitter text
		rai.ClickUsingOCR("TWITTER");


		// Verify twitter page is displayed
		rai.VerifyElementVisible(Vype_CommonXpath.txtTwitter, "Twitter ");

		rai.ClosetabAndroid();*/

		rai.ScrollByxpath(Vype_CommonXpath.lnkLogin);
		// Click on Youtube text
		rai.ClickUsingOCR("YOUTUBE");

		// Verify you tube page is displayed
		//rai.VerifyElementVisible(Vype_CommonXpath.txtYoutube, "Youtube ");
		/*rai.clickUsingJs(Vype_CommonXpath.Youtubeback,"clicking back");
		rai.ClosetabAndroid();
		rai.switchDefault();*/
		//rai.ScrollByxpath(Vype_CommonXpath.lnkLogin);
		ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs2.get(1));
	    driver.close();
	    driver.switchTo().window(tabs2.get(0));
		// Click on Contact Us text
		rai.clickUsingJs(Vype_CommonXpath.lnkContactUs, "Contact Us text ");

		// Verify Contact us page is displayed
		rai.VerifyElementVisible(Vype_CommonXpath.txtContactUs, "Contact Us ");
		Thread.sleep(5000);
		rai.fnNavigateBack();
		//rai.switchDefault();
		rai.ScrollByxpath(Vype_CommonXpath.lnkLogin);
		// Click on FAQs text
		rai.clickUsingJs(Vype_CommonXpath.lnkFaqs, "FAQs text ");

		Thread.sleep(4000);
		
		// Verify FAQs Page is displayed.
		rai.VerifyElementVisible(Vype_CommonXpath.weTxtGeneralQuestions, "FAQs ");
		

		Thread.sleep(3000);
		rai.fnNavigateBack();
		rai.ScrollByxpath(Vype_CommonXpath.lnkFaqs);
		// click link store locator
		rai.clickUsingJs(Vype_CommonXpath.lnkStoreLocator, "Store Locator Text ");
		// Verify Page

		Thread.sleep(5000);
		rai.ClickUsingOCR("Allow");
		rai.VerifyElementVisible(Vype_CommonXpath.pgStoreLocator, "Store Locator ");
		rai.fnNavigateBack();
		
		rai.ScrollByxpath(Vype_CommonXpath.lnkFaqs);
		rai.clickUsingJs(Vype_CommonXpath.lnksitemap, "sitemap");

		Thread.sleep(4000);

		rai.VerifyElementVisible(Vype_CommonXpath.pgsitemap,"site map");

		Thread.sleep(4000);
		rai.fnNavigateBack();

		rai.ScrollByxpath(Vype_CommonXpath.lnkFaqs);
		// Click on Condition of Sale text
		rai.clickUsingJs(Vype_CommonXpath.lnkConditionofSale, "Condition of Sale link ");

		Thread.sleep(5000);
		// Verify Conditions on sale page is displayed
		rai.VerifyElementVisible(Vype_CommonXpath.txtConditionsofSale, "Condition of Sale ");
		rai.fnNavigateBack();
		
		rai.ScrollByxpath(Vype_CommonXpath.lnkFaqs);
	 // Click on Privacy Policy text
		rai.clickUsingJs(Vype_CommonXpath.lnkPrivacyPolicy, "Privacy Policy link ");

		Thread.sleep(5000);
		// Verify privacy policy page is displayed
		rai.VerifyElementVisible(Vype_CommonXpath.txtPrivacyPolicy, "Privacy Policy ");
		rai.fnNavigateBack();

		rai.ScrollByxpath(Vype_CommonXpath.lnkFaqs);
		// Click on Terms and conditions text
		rai.clickUsingJs(Vype_CommonXpath.lnkTermsandConditions, "Terms and conditions link ");

		Thread.sleep(10000);
		// Verify Terms and conditions page is displayed
		rai.VerifyElementVisible(Vype_CommonXpath.txtTermsConditions, "Terms and conditions ");
	
		rai.fnNavigateBack();

		rai.ScrollByxpath(Vype_CommonXpath.lnkFaqs);
		// Click on Cookie Policy text
		rai.clickUsingJs(Vype_CommonXpath.lnkCookiePolicy, "Cookie Policy link ");

		Thread.sleep(10000);
		// Verify Cookie Policy page is displayed
		rai.VerifyElementVisible(Vype_CommonXpath.txtCookiePolicy, "Cookie Policy ");
		rai.fnNavigateBack();
	}
	
	@Then("^Scroll to any question and type keywords to find a topic in vuseplus rewards page \"([^\"]*)\"$")
	public void scroll_to_any_question_and_type_keywords_to_find_a_topic_in_vuseplus_rewards_page(String question) throws Throwable {
		//Scroll to Any question?
		rai.ScrollByxpath(Vype_CommonXpath.questions);
		//Entering question
		rai.inputText(Vype_CommonXpath.questions, "Question ",question);

		//verify pop up
		String popupans=rai.getText(Vype_CommonXpath.eligibilitypopupans);
		rai.VerifyElementVisible(Vype_CommonXpath.eligibilitypopupans,popupans);

		//click on pop up
		rai.clickUsingJs(Vype_CommonXpath.eligibilitypopupans,popupans);

		Thread.sleep(4000);
		//verify result 
		String str1="(//*[contains(text(),'"+question+"')])[1]/../..";

		rai.VerifyElementVisible(By.xpath(str1),"Answer ");

    	//click on pop up
		rai.clickUsingJs(By.xpath("//*[contains(text(),'Does Vuse Plus have an exp')]/../div"),"Answer ");
	}

	@Then("^Click and verify all frequently asked questions$")
	public void click_and_verify_all_frequently_asked_questions() throws Throwable {
		//Scroll tp faqs
				rai.ScrollByxpath(Vype_CommonXpath.txtfaq_pgvuseplus);
				System.out.println("-----------FAQS-------------");
				//verifying all faqs
				List<WebElement> list=rai.findElementsList(Vype_CommonXpath.pgvuseplus_faqs);
				System.out.println("No of faqs:"+list.size());
				for(int i=0;i<list.size();i++)
				{
					String str=list.get(i).getText();
					str=str.substring(0,10);
					String Qa="(//*[contains(text(),'"+str+"')])";
					rai.clickUsingJs(By.xpath(Qa),Qa);
					String str1="(//*[contains(text(),'"+str+"')])/../..";
					rai.ScrollByxpath(By.xpath(Qa));
					// clicking on each faq
					rai.clickUsingJs(By.xpath(str1),str);


					String QAs=rai.getText(By.xpath(str1));
					System.out.println((i+1)+":"+QAs+"\n");
					rai.VerifyElementsVisible(By.xpath(str1), QAs);


				}
	}
}
