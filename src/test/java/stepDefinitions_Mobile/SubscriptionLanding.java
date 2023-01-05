package stepDefinitions_Mobile;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.rai.framework.CommonFunctions_Mobile;
import com.rai.framework.RAI_Mobile_Utility_Functions;

import cucumber.api.java.en.Then;
import goVype_Properties.Vype_CommonXpath;
import goVype_Properties_mobile.*;

public class SubscriptionLanding {

	RAI_Mobile_Utility_Functions rai = new RAI_Mobile_Utility_Functions();
	CommonFunctions_Mobile function = new CommonFunctions_Mobile(rai);

//	@Then("^Verify Subscribe and Save page is displayed")
//	public void Verify_Subscribe_and_Save_Page_Is_Displayed() throws Throwable{
//
//		//verify page displayed.
//		rai.VerifyElementsVisible(Vype_CommonXpath.pgSubscribeAndSave, "Subscribe & Save ");
//	}
//
//	@Then("^verify offer in subscribe and save$")
//	public void verify_offer_on_subscribe_and_save() throws Throwable {
//
//		String subscribe=rai.getText(Vype_CommonXpath.pgsubscribe);
//
//		//Verify page subscribe and save
//		rai.VerifyElementsVisible(Vype_CommonXpath.pgsubscribe,subscribe);
//	}
//
//	@Then("^scroll to Why subscribe and verify the offer$")
//	public void scroll_to_why_subscribe_and_verify_the_offer() throws Throwable {
//
//		//scroll to why subscribe
//		rai.ScrollByxpath(Vype_CommonXpath.whysubscribe);
//		rai.SwipeDownSmallerUnits(4);
//		System.out.println("<---Why subscribe---->");
//		List<WebElement> lst;
//		lst = rai.findElementsList(Vype_CommonXpath.whysubscribeOffers);
//		for(int i =0;i<lst.size();i++){
//			String str = lst.get(i).getText();
//			System.out.println((i+1)+":"+str+"\n");
//			//rai.VerifyElementsVisible(Vype_CommonXpath.whysubscribeOffers, "Subscription offers:  "+ str);
//			rai.verifyPageByObject(Vype_CommonXpath.whysubscribeOffers,"Subscription offers","Subscription offers");
//
//		}
//	}
//
//
//	@Then("^verify A plan for every subscriber$")
//	public void verify_A_plan_for_every_subscriber() throws Throwable {
//
//		//scroll to subscription plan
//		rai.ScrollByxpath(Vype_CommonXpath.txtsubscriptionplan);
//		rai.SwipeDownSmallerUnits(4);
//		List<WebElement> lst;
//		lst = rai.findElementsList(Vype_CommonXpath.TxtSubscribeAndSave);
//		for(int i =0;i<lst.size();i++){
//			String str = lst.get(i).getText();
//			System.out.println(str);
//			//rai.VerifyElementsVisible(Vype_CommonXpath.TxtSubscribeAndSave, "Subscription options:  "+ str);
//			rai.verifyPageByObject(Vype_CommonXpath.TxtSubscribeAndSave, "Subscription options", "Subscription options");
//		}
//	}
//	@Then("^verify how it works section$")
//	public void verify_how_it_works_section() throws Throwable {
//
//		//scroll to subscription plan
//		rai.ScrollByxpath(Vype_CommonXpath.txthowitworks);
//		rai.SwipeDownSmallerUnits(7);
//		List<WebElement> lst;
//		lst = rai.findElementsList(Vype_CommonXpath.txthowitworksicons);
//		for(int i =0;i<lst.size();i++){
//			String str = lst.get(i).getText();
//			System.out.println(str);
//			//rai.VerifyElementsVisible(Vype_CommonXpath.txthowitworksicons, "Subscription offer includes:  "+ str);
//			rai.verifyPageByObject(Vype_CommonXpath.txthowitworksicons,"Subscription offer includes","Subscription offer includes");
//		}	
//	}
//
//	@Then("^scroll to any question and type keywords to find a topic \"([^\"]*)\"$")
//	public void scroll_to_any_question_and_type_keywords_to_find_a_topic(String question) throws Throwable {
//
//		//Scroll to Any question?
//		rai.ScrollByxpath(Vype_CommonXpath.questions);
//		rai.SwipeDownSmallerUnits(4);
//
//		//Entering question
//		rai.inputText(Vype_CommonXpath.questions, "Question ",question);
//
//		//verify pop up
//		String popupans=rai.getText(Vype_CommonXpath.popupans);
//		rai.VerifyElementVisible(Vype_CommonXpath.popupans,popupans);
//
//		//click on pop up
//		rai.clickUsingJs(Vype_CommonXpath.popupans,popupans);
//
//		Thread.sleep(4000);
//		//verify result 
//		String str1="(//*[contains(text(),'"+question+"')])[1]";
//
//		rai.VerifyElementVisible(By.xpath(str1),"Answer ");
//
//		//click on pop up
//		rai.clickUsingJs(By.xpath(str1),"Answer ");
//	}
//
//	@Then("^verify all frequently asked questions$")
//	public void verify_all_frequently_asked_questions() throws Throwable {
//
//		//Scroll tp faqs
//		rai.ScrollByxpath(Vype_CommonXpath.txtfaq_pgsubscription);
//		rai.SwipeDownSmallerUnits(4);
//		System.out.println("-----------FAQS-------------");
//		//verifying all faqs
//		List<WebElement> list=rai.findElementsList(Vype_CommonXpath.pgsubscription_faqs);
//		System.out.println("Total Faqs: "+list.size());
//		for(int i=0;i<list.size();i++)
//		{
//			String str=list.get(i).getText();
//			str=str.substring(0,15);
//			String Qa="(//*[contains(text(),'"+str+"')])";
//			rai.clickUsingJs(By.xpath(Qa),Qa);
//			String str1="(//*[contains(text(),'"+str+"')])/../..";
//			rai.ScrollByxpath(By.xpath(Qa));
//			// clicking on each faq
//			rai.clickUsingJs(By.xpath(str1),str);
//
//
//			String QAs=rai.getText(By.xpath(str1));
//			System.out.println((i+1)+":"+QAs+"\n");
//			rai.VerifyElementVisible(By.xpath(str1), QAs);
//		}
//	}

	/*@Then("^verify all footer links$")
	public void verify_all_footer_links() throws Throwable {
		rai.SwipeDownSmallerUnits(3);
		function.VerifyAllFooterLinks();
	}*/

//Modified by sireesha
	@Then("^Verify Subscribe and Save page and with relevant content is displayed$")
	public void verify_Subscribe_and_Save_page_and_with_relevant_content_is_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
rai.VerifyElementVisible(Vype_CommonXpath.pgsubscribe,"Subscribe & Save page");
		
        String subscribe=rai.getText(Vype_CommonXpath.pgsubscribe);
		rai.VerifyElementsVisible(Vype_CommonXpath.pgsubscribe,subscribe);
		System.out.println(subscribe);
		Thread.sleep(1000);
		rai.ScrollByxpath(Vype_CommonXpath.txtwhysubscribe);
		String whysubscribe=rai.getText(Vype_CommonXpath.txtwhysubscribe);
		rai.VerifyElementsVisible(Vype_CommonXpath.txtwhysubscribe,whysubscribe);
		System.out.println(whysubscribe);
		Thread.sleep(1000);
		rai.ScrollByxpath(Vype_CommonXpath.txtpaln);
		String Plan=rai.getText(Vype_CommonXpath.txtpaln);
		rai.VerifyElementsVisible(Vype_CommonXpath.txtpaln,Plan);
		System.out.println(Plan);
			
	}

	@Then("^User swipe down and click on subscribe now under subscription plans$")
	public void user_swipe_down_and_click_on_subscribe_now_under_subscription_plans() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		rai.ScrollByxpath(Vype_CommonXpath.btnsubscribenow1);
	    rai.clickUsingJs(Vype_CommonXpath.btnsubscribenow1,"Subscribe now");
	}

	@Then("^Verify ePod Vape Pod Subscription page is displayed$")
	public void verify_ePod_Vape_Pod_Subscription_page_is_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 rai.VerifyElementVisible(Vype_CommonXpath.pgsubscribeepod,"subscribe epod page");
	}

	@Then("^User click on browse back and verify Subscribe and Save page is displayed$")
	public void user_click_on_browse_back_and_verify_Subscribe_and_Save_page_is_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		rai.fnBrowserBack();
	    Thread.sleep(2000);
	    rai.VerifyElementVisible(Vype_CommonXpath.pgsubscribe,"Subscribe & Save page");
	}

	@Then("^User swipe to How it works and verify content$")
	public void user_swipe_to_How_it_works_and_verify_content() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String Howit=rai.getText(Vype_CommonXpath.txthowit);
		rai.VerifyElementVisible(Vype_CommonXpath.txthowit,Howit);
		System.out.println(Howit);
	   
	}

	@Then("^User swipe down and click on subscribe now under how it works$")
	public void user_swipe_down_and_click_on_subscribe_now_under_how_it_works() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 rai.ScrollByxpath(Vype_CommonXpath.btnsubscribenow2);
			rai.clickUsingJs(Vype_CommonXpath.btnsubscribenow2,"Subscribe now");
	}
	@Then("^User scroll to Any Questions section$")
	public void user_scroll_to_Any_Questions_section() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		rai.ScrollByxpath(Vype_CommonXpath.questions);
	}

	@Then("^Verify Subscribe and Save page is displayed$")
	public void verify_Subscribe_and_Save_page_is_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		rai.VerifyElementVisible(Vype_CommonXpath.pgsubscribe,"Subscribe & Save page");
	}

	@Then("^User type keywords to find a topic \"([^\"]*)\" and verify relevant pop displayed$")
	public void user_type_keywords_to_find_a_topic_and_verify_relevant_pop_displayed(String question) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 rai.inputText(Vype_CommonXpath.questions, "Question ",question);
			
			//verify pop up
			String popupans=rai.getText(Vype_CommonXpath.popupans);
			rai.VerifyElementVisible(Vype_CommonXpath.popupans,popupans);
			
			//click on pop up
			rai.clickUsingJs(Vype_CommonXpath.popupans,popupans);
			
			Thread.sleep(4000);
			//verify result 
			String str1="(//*[contains(text(),'"+question+"')])[1]";
			
			rai.VerifyElementVisible(By.xpath(str1),"Answer ");
			
			//click on pop up
			rai.clickUsingJs(By.xpath(str1),"Answer ");
			
		}
	    

	@Then("^User swipe down to frequently asked questions and verify no of faqs$")
	public void user_swipe_down_to_frequently_asked_questions_and_verify_no_of_faqs() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		rai.ScrollByxpath(Vype_CommonXpath.txtfaq_pgsubscription);		//verifying all faqs
		List<WebElement> list=rai.findElementsList(Vype_CommonXpath.pgsubscription_faqs);
		System.out.println("Total Faqs: "+list.size());
	}

	@Then("^User click on each question adjacent drop down and verify the Related answer$")
	public void user_click_on_each_question_adjacent_drop_down_and_verify_the_Related_answer() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		List<WebElement> list=rai.findElementsList(Vype_CommonXpath.pgsubscription_faqs);
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

	@Then("^User swipe down and click on Click here link$")
	public void user_swipe_down_and_click_on_Click_here_link() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		rai.ScrollByxpath(Vype_CommonXpath.lnkclickhere);
		rai.VerifyElementVisible(Vype_CommonXpath.lnkclickhere,"click here link");
		rai.clickUsingJs(Vype_CommonXpath.lnkclickhere,"click here link");
	}

	@Then("^Verify the user redirects to the Susbcription terms page$")
	public void verify_the_user_redirects_to_the_Susbcription_terms_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		rai.VerifyElementVisible(Vype_CommonXpath.pgsubterms,"suscription terms");
		Thread.sleep(2000);
	}





}


