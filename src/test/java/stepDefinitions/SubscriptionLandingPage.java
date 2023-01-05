package stepDefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.rai.framework.*;

import cucumber.api.java.en.*;
import goVype_Properties.*;


public class SubscriptionLandingPage {

	RAI_Desktop_Utility_Functions gl = new RAI_Desktop_Utility_Functions();
	CommonFunctions function = new CommonFunctions(gl);

	

//	@Then("^Verify offer on subscribe and save$")
//	public void verify_offer_on_subscribe_and_save() throws Throwable {
//		
//		String subscribe=gl.getText(Vype_CommonXpath.pgsubscribe);
//		
//		//Verify page subscribe and save
//		gl.VerifyElementPresent(Vype_CommonXpath.pgsubscribe,subscribe);
//		
//	}
//	
//	@Then("^Scroll to why subscribe and verify the offer$")
//	public void scroll_to_why_subscribe_and_verify_the_offer() throws Throwable {
//	    
//		//scroll to why subscribe
//		gl.fnScrollToView(Vype_CommonXpath.whysubscribe);
//		
//		System.out.println("<---Why subscribe---->");
//		List<WebElement> lst;
//		lst = gl.findElementsList(Vype_CommonXpath.whysubscribetxt);
//		for(int i =0;i<lst.size();i++){
//			String str = lst.get(i).getText();
//			System.out.println((i+1)+":"+str+"\n");
//			gl.VerifyElementPresent(Vype_CommonXpath.whysubscribetxt, "Subscription offers:  "+ str);
//			}
//		
//	}
//	
//	@Then("^Verify A plan for every subscriber$")
//	public void verify_A_plan_for_every_subscriber() throws Throwable {
//		
//		//scroll to subscription plan
//		gl.fnScrollToView(Vype_CommonXpath.txtsubscriptionplan);
//		
//		List<WebElement> lst;
//		lst = gl.findElementsList(Vype_Subscription.TxtSubscribeAndSave);
//		for(int i =0;i<lst.size();i++){
//			String str = lst.get(i).getText();
//			System.out.println(str);
//			gl.VerifyElementPresent(Vype_Subscription.TxtSubscribeAndSave, "Subscription options:  "+ str);
//		}	
//
//		//click on header link subscribe and save
//		//gl.clickUsingJs(Vype_CommonXpath.btnsubscribenow, "Subscibe now  ");
//
//		Thread.sleep(1000);
//		//gl.VerifyElementVisible(Vype_CommonXpath.pgsubscription, "Subscription page ");     
//		
//		//gl.browserBack();
//	   
//	}
//	@Then("^Verify how it works section$")
//	public void verify_how_it_works_section() throws Throwable {
//	    
//		//scroll to subscription plan
//		gl.fnScrollToView(Vype_CommonXpath.txthowitworks);
//		
//		List<WebElement> lst;
//		lst = gl.findElementsList(Vype_CommonXpath.txthowitworksicons);
//		for(int i =0;i<lst.size();i++){
//			String str = lst.get(i).getText();
//			System.out.println(str);
//			gl.VerifyElementPresent(Vype_CommonXpath.txthowitworksicons, "Subscription offer includes:  "+ str);
//		}	
//
//	}
//	
//	@Then("^Scroll to any question and type keywords to find a topic \"([^\"]*)\"$")
//	public void scroll_to_any_question_and_type_keywords_to_find_a_topic(String question) throws Throwable {
//	   
//		//Scroll to Any question?
//		gl.fnScrollToView(Vype_CommonXpath.questions);
//		
//		
//		//Entering question
//		gl.inputText(Vype_CommonXpath.questions, "Question ",question);
//		
//		//verify pop up
//		String popupans=gl.getText(Vype_CommonXpath.popupans);
//		gl.VerifyElementVisible(Vype_CommonXpath.popupans,popupans);
//		
//		//click on pop up
//		gl.clickUsingJs(Vype_CommonXpath.popupans,popupans);
//		
//		Thread.sleep(4000);
//		//verify result 
//		String str1="(//*[contains(text(),'"+question+"')])[1]";
//		
//		gl.VerifyElementVisible(By.xpath(str1),"Answer ");
//		
//		//click on pop up
//		gl.clickUsingJs(By.xpath(str1),"Answer ");
//		
//	}
//	
//	@Then("^Verify all frequently asked questions$")
//	public void verify_all_frequently_asked_questions() throws Throwable {
//	   
//		//Scroll tp faqs
//		gl.fnScrollToView(Vype_CommonXpath.txtfaq_pgsubscription);
//		System.out.println("-----------FAQS-------------");
//		//verifying all faqs
//		List<WebElement> list=gl.findElementsList(Vype_CommonXpath.pgsubscription_faqs);
//		System.out.println("Total Faqs: "+list.size());
//		for(int i=0;i<list.size();i++)
//		{
//			String str=list.get(i).getText();
//			str=str.substring(0,15);
//			String Qa="(//*[contains(text(),'"+str+"')])";
//			gl.clickUsingJs(By.xpath(Qa),Qa);
//			String str1="(//*[contains(text(),'"+str+"')])/../..";
//			gl.fnScrollToView(By.xpath(Qa));
//			// clicking on each faq
//			gl.clickUsingJs(By.xpath(str1),str);
//			
//			
//			String QAs=gl.getText(By.xpath(str1));
//			System.out.println((i+1)+":"+QAs+"\n");
//			gl.VerifyElementPresent(By.xpath(str1), QAs);
//		}
//	}
//	
//	@Then("^Verify all footer links$")
//	public void verify_all_footer_links() throws Throwable {
//	  
//		function.VerifyAllFooterLinks();
//	}
//	
//	@Then("^click and verify all footer links$")
//	public void click_and_verify_all_footer_links() throws Throwable {
//	     function.clickOnAllFooterLinks();
//	}
	// Modified by sireesha
	@Then("^Verify user redirected to the Subscription page and relevant content is displayed$")
	public void verify_user_redirected_to_the_Subscription_page_and_relevant_content_is_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		gl.VerifyElementVisible(Vype_CommonXpath.pgsubscribe,"Subscribe & Save page");
		
        String subscribe=gl.getText(Vype_CommonXpath.pgsubscribe);
		gl.VerifyElementPresent(Vype_CommonXpath.pgsubscribe,subscribe);
		System.out.println(subscribe);
		Thread.sleep(1000);
		gl.fnScrollToView(Vype_CommonXpath.txtwhysubscribe);
		String whysubscribe=gl.getText(Vype_CommonXpath.txtwhysubscribe);
		gl.VerifyElementPresent(Vype_CommonXpath.txtwhysubscribe,whysubscribe);
		System.out.println(whysubscribe);
		Thread.sleep(1000);
		gl.fnScrollToView(Vype_CommonXpath.txtpaln);
		String Plan=gl.getText(Vype_CommonXpath.txtpaln);
		gl.VerifyElementPresent(Vype_CommonXpath.txtpaln,Plan);
		System.out.println(Plan);
			
	}

	@When("^User scrolls down and click on subscribe now button$")
	public void user_scrolls_down_and_click_on_subscribe_now_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    gl.fnScrollToView(Vype_CommonXpath.btnsubscribenow1);
	    gl.clickUsingJs(Vype_CommonXpath.btnsubscribenow1,"Subscribe now");
	}

	@Then("^Verify ePod Vape Pod Subscription page is displayed$")
	public void verify_ePod_Vape_Pod_Subscription_page_is_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   gl.VerifyElementVisible(Vype_CommonXpath.pgsubscribeepod,"subscribe epod page");
	}

	@Then("^Click on browser back and verify the Suscription page displayed$")
	public void click_on_browser_back_and_verify_the_Suscription_page_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    gl.browserBack();
	    Thread.sleep(2000);
	    gl.VerifyElementVisible(Vype_CommonXpath.pgsubscribe,"Subscribe & Save page");
	    
	}

	@Then("^Scroll to How it works section and verify the content$")
	public void scroll_to_How_it_works_section_and_verify_the_content() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String Howit=gl.getText(Vype_CommonXpath.txthowit);
		gl.VerifyElementPresent(Vype_CommonXpath.txthowit,Howit);
		System.out.println(Howit);
	}

	@When("^User click on Subscribe now under how it works$")
	public void user_click_on_Subscribe_now_under_how_it_works() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 gl.fnScrollToView(Vype_CommonXpath.btnsubscribenow2);
		gl.clickUsingJs(Vype_CommonXpath.btnsubscribenow2,"Subscribe now");
	}
	@Then("^Verify redricted to the Subscription page is displayed$")
	public void verify_redricted_to_the_Subscription_page_is_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 gl.VerifyElementVisible(Vype_CommonXpath.pgsubscribe,"Subscribe & Save page");
	}

	@Then("^User scroll to Any questions section$")
	public void user_scroll_to_Any_questions_section() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		gl.fnScrollToView(Vype_CommonXpath.questions);
	}

	@When("^User type keywords to find a topic \"([^\"]*)\" and verify relevant pop displayed$")
	public void user_type_keywords_to_find_a_topic_and_verify_relevant_pop_displayed(String question) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
       gl.inputText(Vype_CommonXpath.questions, "Question ",question);
		
		//verify pop up
		String popupans=gl.getText(Vype_CommonXpath.popupans);
		gl.VerifyElementVisible(Vype_CommonXpath.popupans,popupans);
		
		//click on pop up
		gl.clickUsingJs(Vype_CommonXpath.popupans,popupans);
		
		Thread.sleep(4000);
		//verify result 
		String str1="(//*[contains(text(),'"+question+"')])[1]";
		
		gl.VerifyElementVisible(By.xpath(str1),"Answer ");
		
		//click on pop up
		gl.clickUsingJs(By.xpath(str1),"Answer ");
		
	}


	@Then("^User scroll down to Freuently Asked questions and verify no of faqs$")
	public void user_scroll_down_to_Freuently_Asked_questions_and_verify_no_of_faqs() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		gl.fnScrollToView(Vype_CommonXpath.txtfaq_pgsubscription);		//verifying all faqs
		List<WebElement> list=gl.findElementsList(Vype_CommonXpath.pgsubscription_faqs);
		System.out.println("Total Faqs: "+list.size());
	}

	@When("^User click on each question adjacent drop down and verify the related answer$")
	public void user_click_on_each_question_adjacent_drop_down_and_verify_the_related_answer() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		//verifying all faqs
		List<WebElement> list=gl.findElementsList(Vype_CommonXpath.pgsubscription_faqs);
		for(int i=0;i<list.size();i++)
		{
			String str=list.get(i).getText();
			str=str.substring(0,15);
			String Qa="(//*[contains(text(),'"+str+"')])";
			gl.clickUsingJs(By.xpath(Qa),Qa);
			String str1="(//*[contains(text(),'"+str+"')])/../..";
			gl.fnScrollToView(By.xpath(Qa));
			// clicking on each faq
			gl.clickUsingJs(By.xpath(str1),str);
			
			
			String QAs=gl.getText(By.xpath(str1));
			System.out.println((i+1)+":"+QAs+"\n");
			gl.VerifyElementPresent(By.xpath(str1), QAs);
		}
	}
	

	@When("^User scrolls down and click on Click here link$")
	public void user_scrolls_down_and_click_on_Click_here_link() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		gl.fnScrollToView(Vype_CommonXpath.lnkclickhere);
		gl.VerifyElementVisible(Vype_CommonXpath.lnkclickhere,"click here link");
		gl.clickUsingJs(Vype_CommonXpath.lnkclickhere,"click here link");
	   
	}

	@Then("^Verify the user redirects to the susbcription terms page$")
	public void verify_the_user_redirects_to_the_susbcription_terms_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		gl.VerifyElementVisible(Vype_CommonXpath.pgsubterms,"suscription terms");
		Thread.sleep(2000);
	   
	}

	
		

}
