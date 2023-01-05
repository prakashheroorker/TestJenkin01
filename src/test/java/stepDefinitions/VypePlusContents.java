package stepDefinitions;

import java.util.List;


import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;


import com.rai.framework.*;



import cucumber.api.java.en.*;
import goVype_Properties.*;

public class VypePlusContents {

	RAI_Desktop_Utility_Functions gl = new RAI_Desktop_Utility_Functions();
	CommonFunctions function = new CommonFunctions(gl);


	@When("^hower on save and click on vuseplus rewards$")
	public void hower_on_save_and_click_on_vuseplus_rewards() throws Throwable {

		//Hower on save
		gl.HowerMouse(Vype_Common.lnkSave, "Save");


		//Click on Vuse+ Rewards under Programs
		gl.clickUsingJs(Vype_PlatinumProfileTrigger.lnkVusePlus, "Vuse+ Link ");

	}

	@Then("^verify vuseplus rewards page and verify joining is easy content$")
	public void verify_vuseplus_rewards_page_and_verify_joining_is_easy_content() throws Throwable {

		//Validate Whether Vuse + Page Is Displayed
		gl.VerifyElementPresent(Vype_PlatinumProfileTrigger.pgVusePlus, "Vuse+ Page");

		//Verify text Joining easy
		gl.VerifyElementPresent(Vype_PlusContents.txtRewardProgram, "A reward program exclusively");

		String str=gl.getText(Vype_PlusContents.txtRewardContent);
		//Verify text Just keep Shopping-----and more
		gl.VerifyElementPresent(Vype_PlusContents.txtRewardContent, str);

		gl.ScrollPageDown();

	}

	@Then("^verify how to maintan your status content$")
	public void verify_how_to_maintan_your_status_content() throws Throwable {

		//Verify Text "How to maintain your status?
		gl.VerifyElementPresent(Vype_PlusContents.txtHowmaintainStatus, "Hoe to maintain your status");

		String str=gl.getText(Vype_PlusContents.txtStaySubscribe);
		//Verify Text "Stay subscribed to …..It's that easy" is displayed
		gl.VerifyElementPresent(Vype_PlusContents.txtStaySubscribe, str);

		gl.ScrollPageDown();

	}






	@Then("^verify perks of vuseplus and benfits$")
	public void verify_perks_of_vuseplus_and_benfits() throws Throwable {

		List<WebElement> list;
		String str = "";

		//Verify the text the perks of vuse+
		gl.VerifyElementPresent(Vype_PlusContents.txtPerksVuse, "the perks of vuse+");

		//Verify the perks section
		gl.VerifyElementPresent(Vype_PlusContents.weBenifits, "the perks of vuse+ Section");

		//Verify Check your status button
		gl.VerifyElementPresent(Vype_PlusContents.btnCheckStatus, "Check your status");

		gl.VerifyElementPresent(Vype_PlusContents.txtSilverGold, "the perks of vuse+ ");
		//Verify 2 section Gold, Platinum
		list = gl.findElementsList(By.xpath("//*[contains(@class,'TierComparison___Sty')]"));
		System.out.println("The perks of vuse "+list.size()+1);
		for(int j=0; j<list.size();)
		{
			str = list.get(j).getText();
			System.out.println("The string is: " + str);
			if(str.contains("Gold") || str.contains("Platinum"))
			{
				//updated on oct1
				gl.VerifyElementPresent(Vype_PlusContents.txtSilverGold, str+ " section ");
				j=j+2;
			}

		}

		String benefits1=gl.getText(Vype_PlusContents.txtbenfitssection);


		//oct1
		gl.VerifyElementPresent(Vype_PlusContents.txtbenfitssection, benefits1 );

	}

	@And("^verify footer content present in vuseplus rewards page$")
	public void verify_footer_content_present_in_vuseplus_rewards_page() throws Throwable {

		//oct1
		String footer1=gl.getText(Vype_PlusContents.txtVuseProducts);
		gl.VerifyElementPresent( Vype_PlusContents.txtVuseProducts,footer1);

	}

	@And("^verify video below rewards program$")
	public void verify_video_below_rewards_program() throws Throwable {

		//Verify the text Rewards Program
		gl.VerifyElementPresent(Vype_PlusContents.txtRewardsProgram,"Rewards Program");

		//Verify youtube video is displayed
		gl.VerifyElementPresent(Vype_PlusContents.weVideo, "Youtube video");

	}

	@Then("^verify faqs present in vuseplus rewards page$")
	public void verify_faqs_present_in_vuseplus_rewards_page() throws Throwable {

		//Verify text Any Questions? is displayed
		gl.VerifyElementPresent(Vype_PlusContents.txtAnyQuestions, "Any Questions? ");

		//Verify Type keywords to find a topic text box is displayed
		gl.VerifyElementPresent(Vype_PlusContents.txtTypeKeywords, "Type keywords to find a topic textbox ");

		//Verify You can also browse the topics text is displayed
		gl.VerifyElementPresent(Vype_PlusContents.txtYouCanBrowse, "You can also browse text ");

		List<WebElement> list;
		list = gl.findElementsList(By.xpath("//*[contains(@id,'question')]"));
		System.out.println("No of Faqs :"+list.size());
		for(int k=0;k<list.size();k++)
		{
			String str = list.get(k).getText();
			System.out.println((k+1)+"."+str);
			gl.VerifyElementPresent(Vype_PlusContents.txtTrendingTopics, str );
		}
	}


	@Then("^verify play and pause functionalities in the video$")
	public void verify_play_and_pause_functionalities_in_the_video() throws Throwable {

		//Click On Video To Play
		gl.clickbutton(Vype_PlatinumProfileTrigger.lnkVideo, "Video Clicked To Play");

		//Wait for Few Seconds
		Thread.sleep(2000);

		//Validate Whether Video Is playing
		String zeroProgressValue = "00:00 of 00:29";
		//pause
		gl.clickLink(Vype_PlatinumProfileTrigger.lnkVideo, "Video clicked to stop To fetch the progress time");




		gl.frameByelement(Vype_PlatinumProfileTrigger.lnkVideo);

		//gl.clickElement(Vype_PlatinumProfileTrigger.weValueOfProgress, "Element In Frame");
		String progressValue = gl.getAttributeValue(Vype_PlatinumProfileTrigger.weValueOfProgress,"aria-valuetext");
		System.out.println("Progress Value :"+progressValue);


		if((progressValue!=zeroProgressValue)){
			gl.VerifyObjectDisplayed(Vype_PlatinumProfileTrigger.weValueOfProgress, "Video Is Played");
		}


		gl.switchDefault();



		gl.clickLink(Vype_PlatinumProfileTrigger.lnkVideo, "Video Play2");

		gl.frameByelement(Vype_PlatinumProfileTrigger.lnkVideo);
		//play
		String pausedValue = gl.getAttributeValue(Vype_PlatinumProfileTrigger.weValueOfProgress,"aria-valuetext");
		System.out.println("Paused Value :"+pausedValue);

		gl.switchDefault();
		//pause
		gl.clickLink(Vype_PlatinumProfileTrigger.lnkVideo, "Video Pause2");
		gl.frameByelement(Vype_PlatinumProfileTrigger.lnkVideo);
		String pauseTime = gl.getAttributeValue(Vype_PlatinumProfileTrigger.weValueOfProgress,"aria-valuetext");
		System.out.println("pauseTime :"+pauseTime);

		pauseTime=pauseTime.substring(3,5);
		int pauseTimeInt = Integer.parseInt(pauseTime);
		System.out.println("pauseTimeInt :"+pauseTimeInt);

		Thread.sleep(2000);

	}
	
		


	@Then("^scroll to any question and type keywords to find a topic in vuseplus rewards page \"([^\"]*)\"$")
	public void scroll_to_any_question_and_type_keywords_to_find_a_topic_in_vuseplus_rewards_page(String question) throws Throwable {

		//Scroll to Any question?
		gl.fnScrollToView(Vype_CommonXpath.questions);


		//Entering question
		gl.inputText(Vype_CommonXpath.questions, "Question ",question);

		//verify pop up
		String popupans=gl.getText(Vype_CommonXpath.eligibilitypopupans);
		gl.VerifyElementVisible(Vype_CommonXpath.eligibilitypopupans,popupans);

		//click on pop up
		gl.clickUsingJs(Vype_CommonXpath.eligibilitypopupans,popupans);

		Thread.sleep(4000);
		//verify result 
		String str1="(//*[contains(text(),'"+question+"')])[1]/../..";

		gl.VerifyElementVisible(By.xpath(str1),"Answer ");

		//click on pop up
		gl.clickUsingJs(By.xpath("//*[contains(text(),'Does Vuse Plus have an exp')]/../div"),"Answer ");

	}

	@Then("^click and verify all frequently asked questions$")
	public void click_and_verify_all_frequently_asked_questions() throws Throwable {

		//Scroll tp faqs
		gl.fnScrollToView(Vype_CommonXpath.txtfaq_pgvuseplus);
		System.out.println("-----------FAQS-------------");
		//verifying all faqs
		List<WebElement> list=gl.findElementsList(Vype_CommonXpath.pgvuseplus_faqs);
		System.out.println("No of faqs:"+list.size());
		for(int i=0;i<list.size();i++)
		{
			String str=list.get(i).getText();
			str=str.substring(0,10);
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
}



