package stepDefinitions_Mobile;





import java.util.List;

import org.openqa.selenium.WebElement;

import com.rai.framework.CommonFunctions_Mobile;
import com.rai.framework.RAI_Mobile_Utility_Functions;

import cucumber.api.java.en.*;
import goVype_Properties_mobile.Vype_CommonXpath;
import goVype_Properties_mobile.Vype_KnowyourVape;

public class knowyourvape{

	RAI_Mobile_Utility_Functions rai = new RAI_Mobile_Utility_Functions();
	CommonFunctions_Mobile function = new CommonFunctions_Mobile(rai);

	/*	@Then("^User clicks on hamberger menu and clicks on About$")
	public void user_clicks_on_hamberger_menu_and_clicks_on_Shop() throws Throwable {

		// Clicking on Menu and navigate to Shop
		rai.clickUsingJs(Vype_CommonXpath.btnmenu, "Menu ");

		rai.ClickUsingOCR("About");
	}*/
	@Then("^Clicks on Know your vape and verifies the watch and Learn more$")
	public void clicks_on_Know_your_vape_and_verifies_the_watch_and_Learn_more() throws Throwable {
		//Clicking on know your vape 
		rai.ClickUsingOCR("Know your Vape");
		//rai.clickUsingJs(Vype_CommonXpath.lnkKnowYourVape, "Know your vape from About section");

		Thread.sleep(2000);

		//Verifying the UI page

		rai.VerifyElementVisible(Vype_KnowyourVape.ImgKnowYourVape, "Quality image");

		rai.VerifyElementVisible(Vype_KnowyourVape.btnWatchVideo, "Watch Video Button");

		rai.VerifyElementVisible(Vype_KnowyourVape.btnlearnMore, "Learn More Button");
	}

//	@Then("^Click on Learn more button$")
//	public void click_on_Learn_more_button() throws Throwable {
//		rai.clickbutton(Vype_KnowyourVape.btnlearnMore, "Learn More Button");
//	}

//	@Then("^Verify the Contents of Learn more page$")
//	public void verify_the_Contents_of_Learn_more_page() throws Throwable {
//		rai.VerifyElementVisible(Vype_KnowyourVape.txtSuppilerSourcing, "Suppiler Sourcing");
//		rai.VerifyElementVisible(Vype_KnowyourVape.btnWatchVideo1, "Watch Video Button");
//		rai.VerifyElementVisible(Vype_KnowyourVape.txt1by6, "1/6");
//		rai.VerifyElementVisible(Vype_KnowyourVape.txthvques, "Have a question");
//		rai.VerifyElementVisible(Vype_KnowyourVape.lnkcontactus, "Contact us");
//	}

//	@When("^Clicked on watch video of learn more page$")
//	public void clicked_on_watch_video_of_learn_more_page() throws Throwable {
//		rai.clickbutton(Vype_KnowyourVape.btnWatchVideo1, "Watch Video Button");
//		rai.VerifyElementVisible(Vype_KnowyourVape.btnVideoModalClose, "Close");
//	}

	@Then("^Close the video model pop up$")
	public void close_the_video_model_pop_up() throws Throwable {
		rai.clickbutton(Vype_KnowyourVape.btnVideoModalClose, "Close");
	}

	@Then("^Scroll down and verify the UI contents$")
	public void scroll_down_to_Vape_manufacturing_and_verify_the_UI_contents() throws Throwable {
		rai.SwipeDownSmallerUnits(4);
		rai.clickUsingJs(Vype_KnowyourVape.content, "Contents");
	}

	@When("^Click on raw material and verify the UI contents$")
	public void click_on_raw_material_and_verify_the_UI_contents() throws Throwable {
		rai.SwipeUpSmallerUnits(4);
		rai.clickUsingJs(Vype_KnowyourVape.lnkrawmat, "Raw material");
		rai.VerifyElementVisible(Vype_KnowyourVape.txt2by6, "2/6");
		rai.VerifyElementVisible(Vype_KnowyourVape.txthvques, "Have a question");
		rai.VerifyElementVisible(Vype_KnowyourVape.lnkcontactus, "Contact us");
	}

	@Then("^Click on testing and verify the UI contents$")
	public void click_on_testing_and_verify_the_UI_contents() throws Throwable {
		rai.SwipeUpSmallerUnits(4);
		rai.clickUsingJs(Vype_KnowyourVape.lnktesting, "Raw material");
		rai.VerifyElementVisible(Vype_KnowyourVape.txt3by6, "2/6");
		rai.VerifyElementVisible(Vype_KnowyourVape.txthvques, "Have a question");
		rai.VerifyElementVisible(Vype_KnowyourVape.lnkcontactus, "Contact us");
	}

	@Then("^Click on manufacturing process and verify the UI contents$")
	public void click_on_manufacturing_process_and_verify_the_UI_contents() throws Throwable {
		rai.SwipeUpSmallerUnits(4);
		rai.clickUsingJs(Vype_KnowyourVape.lnkmanufacturingprocess, "Raw material");
		rai.VerifyElementVisible(Vype_KnowyourVape.txt4by6, "2/6");
		rai.VerifyElementVisible(Vype_KnowyourVape.txthvques, "Have a question");
		rai.VerifyElementVisible(Vype_KnowyourVape.lnkcontactus, "Contact us");
	}


	@Then("^Click on supply chain and verify the UI contents$")
	public void click_on_supply_chain_and_verify_the_UI_contents() throws Throwable {
		rai.SwipeUpSmallerUnits(4);
		rai.clickUsingJs(Vype_KnowyourVape.lnksuppchain, "Raw material");
		rai.VerifyElementVisible(Vype_KnowyourVape.txt5by6, "2/6");
		rai.VerifyElementVisible(Vype_KnowyourVape.txthvques, "Have a question");
		rai.VerifyElementVisible(Vype_KnowyourVape.lnkcontactus, "Contact us");
	}

	@Then("^Click on brand in hand and verify the UI contents$")
	public void click_on_brand_in_hand_and_verify_the_UI_contents() throws Throwable {
		rai.SwipeUpSmallerUnits(4);
		rai.clickUsingJs(Vype_KnowyourVape.lnkbrandinhand, "Raw material");
		rai.VerifyElementVisible(Vype_KnowyourVape.txt6by6, "2/6");
		rai.VerifyElementVisible(Vype_KnowyourVape.txthvques, "Have a question");
		rai.VerifyElementVisible(Vype_KnowyourVape.lnkcontactus, "Contact us");
	}
	// Modified by sireesha
	
	@Then("^Click on Learn more button$")
	public void click_on_Learn_more_button() throws Throwable {
		rai.clickbutton(Vype_KnowyourVape.btnlearnMore, "Learn More Button");
	}
	@When("^User clicks on hamberger menu and verify the links$")
	public void user_clicks_on_hamberger_menu_and_verify_the_links() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		rai.clickLink(Vype_CommonXpath.btnmenu, "Menu");

		// Verify all the links present in Account section
		List<WebElement> list=rai.findElementsList(Vype_CommonXpath.lnksmenusection);
		System.out.println("Total number of links in menu section is:"+list.size());
		for(int i=0;i<list.size();i++)
		{
			String str=list.get(i).getText();
			System.out.println((i+1)+":"+str);
			rai.VerifyElementsVisible(Vype_CommonXpath.lnksmenusection, str);
		}
	}
	    

	@When("^Click on About and verify the links$")
	public void click_on_About_and_verify_the_links() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		rai.ClickUsingOCR("About");
		List<WebElement> list=rai.findElementsList(Vype_CommonXpath.lnksmenusection);
		System.out.println("Total number of links in menu section is:"+list.size());
		for(int i=0;i<list.size();i++)
		{
			String str=list.get(i).getText();
			System.out.println((i+1)+":"+str);
			rai.VerifyElementsVisible(Vype_CommonXpath.lnksmenusection, str);
		}
	}

	@When("^Clicks on Know your vape page and verify the relevant content is displayed$")
	public void clicks_on_Know_your_vape_page_and_verify_the_relevant_content_is_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		rai.ClickUsingOCR("Know your Vape");
		Thread.sleep(1000);
		rai.VerifyElementVisible(Vype_KnowyourVape.ImgKnowYourVape, "Quality image");

		rai.VerifyElementVisible(Vype_KnowyourVape.btnWatchVideo, "Watch Video Button");

		rai.VerifyElementVisible(Vype_KnowyourVape.btnlearnMore, "Learn More Button");
	}

	@Then("^Verify the Contents of Learn more page$")
	public void verify_the_Contents_of_Learn_more_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		rai.VerifyElementVisible(Vype_KnowyourVape.txtSuppilerSourcing, "Suppiler Sourcing");
		rai.VerifyElementVisible(Vype_KnowyourVape.btnWatchVideo1, "Watch Video Button");
		rai.VerifyElementVisible(Vype_KnowyourVape.txt1by6, "1/6");
		rai.VerifyElementVisible(Vype_KnowyourVape.txthvques, "Have a question");
		rai.VerifyElementVisible(Vype_KnowyourVape.lnkcontactus, "Contact us");
	}

	@When("^Clicked on watch video of learn more page$")
	public void clicked_on_watch_video_of_learn_more_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		rai.clickbutton(Vype_KnowyourVape.btnWatchVideo1, "Watch Video Button");
		rai.VerifyElementVisible(Vype_KnowyourVape.btnVideoModalClose, "Close");
	}

	@When("^Close the video model pop up and verify the learn more page$")
	public void close_the_video_model_pop_up_and_verify_the_learn_more_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		rai.clickbutton(Vype_KnowyourVape.btnVideoModalClose, "Close");
		rai.VerifyElementVisible(Vype_KnowyourVape.txtSuppilerSourcing, "Suppiler Sourcing");
	}

	@Then("^Swipe down to next tile and verify the content$")
	public void swipe_down_to_next_tile_and_verify_the_content() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		rai.SwipeDownSmallerUnits(3);
		rai.isEnabled(Vype_KnowyourVape.title1, "Supplier sourching");
		rai.VerifyElementVisible(Vype_KnowyourVape.title, "title");
		String str = rai.getText(Vype_KnowyourVape.qnslist);
		rai.VerifyElementsVisible(Vype_KnowyourVape.qnslist, str);
		System.out.println(str);
	    
	}

	@Then("^User swipe down clicks on each question and verify related answer is displayed$")
	public void user_swipe_down_clicks_on_each_question_and_verify_related_answer_is_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		rai.SwipeDownSmallerUnits(2);
		rai.VerifyElementVisible(Vype_KnowyourVape.qnscontent,"questions");
		List<WebElement> list3 = rai.findElementsList(Vype_KnowyourVape.qnscontent);
		System.out.println("Total no of qns: "+list3.size());
		for(int i=0; i<list3.size();i++)
		{
			rai.ScrollByxpath(Vype_KnowyourVape.dropdown(i));
			rai.clickUsingJs(Vype_KnowyourVape.dropdown(i),"Down arrow");
			String qns=rai.getText(Vype_KnowyourVape.cntanswer(i));
			System.out.println((i+1)+":"+qns);
			rai.VerifyElementVisible(Vype_KnowyourVape.cntanswer(i),qns );
			
			
		}
	}

	@When("^User swipe up and clicks on raw material in clock wise$")
	public void user_swipe_up_and_clicks_on_raw_material_in_clock_wise() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		rai.ScrollByxpath(Vype_KnowyourVape.lnkrawmat);
		rai.clickUsingJs(Vype_KnowyourVape.lnkrawmat, "Raw material");
		
	}

	@Then("^Verify the content of raw material$")
	public void verify_the_content_of_raw_material() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		rai.VerifyElementVisible(Vype_KnowyourVape.txtrawmaterialSourcing, "Suppiler Sourcing");
		rai.VerifyElementVisible(Vype_KnowyourVape.btnWatchVideo1, "Watch Video Button");
		rai.VerifyElementVisible(Vype_KnowyourVape.txt2by6, "2/6");
		rai.VerifyElementVisible(Vype_KnowyourVape.txthvques, "Have a question");
		rai.VerifyElementVisible(Vype_KnowyourVape.lnkcontactus, "Contact us");
	}

	@When("^Clicked on watch video of raw material page$")
	public void clicked_on_watch_video_of_raw_material_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		rai.clickbutton(Vype_KnowyourVape.btnWatchVideo1, "Watch Video Button");
		rai.VerifyElementVisible(Vype_KnowyourVape.btnVideoModalClose, "Close");
	}

	@When("^Close the video model pop up and verify the raw material page$")
	public void close_the_video_model_pop_up_and_verify_the_raw_material_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		rai.clickbutton(Vype_KnowyourVape.btnVideoModalClose, "Close");
		rai.VerifyElementVisible(Vype_KnowyourVape.txtrawmaterialSourcing, "Suppiler Sourcing");
	}

	@Then("^Swipe down to next tile and verify the content of raw material$")
	public void swipe_down_to_next_tile_and_verify_the_content_of_raw_material() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		rai.SwipeDownSmallerUnits(3);
		rai.isEnabled(Vype_KnowyourVape.title2, "raw material");
		rai.VerifyElementVisible(Vype_KnowyourVape.title, "title");
		String str = rai.getText(Vype_KnowyourVape.qnslist);
		rai.VerifyElementsVisible(Vype_KnowyourVape.qnslist, str);
		System.out.println(str);
	    
	}

	@When("^User swipe up and clicks on Testing in clock wise$")
	public void user_swipe_up_and_clicks_on_Testing_in_clock_wise() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		rai.ScrollByxpath(Vype_KnowyourVape.lnktesting);
		rai.clickUsingJs(Vype_KnowyourVape.lnktesting, "Testing");
	}

	@Then("^Verify the content of Testing$")
	public void verify_the_content_of_Testing() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		rai.SwipeUpSmallerUnits(2);
		Thread.sleep(3000);
		rai.VerifyElementVisible(Vype_KnowyourVape.txttestingprocess, "testing");
		rai.VerifyElementVisible(Vype_KnowyourVape.btnWatchVideo1, "Watch Video Button");
		rai.VerifyElementVisible(Vype_KnowyourVape.txt3by6, "3/6");
		rai.VerifyElementVisible(Vype_KnowyourVape.txthvques, "Have a question");
		rai.VerifyElementVisible(Vype_KnowyourVape.lnkcontactus, "Contact us");
	}

	@When("^Clicked on watch video of Testing page$")
	public void clicked_on_watch_video_of_Testing_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		rai.clickbutton(Vype_KnowyourVape.btnWatchVideo1, "Watch Video Button");
		rai.VerifyElementVisible(Vype_KnowyourVape.btnVideoModalClose, "Close");
	}

	@When("^Close the video model pop up and verify the Testing page$")
	public void close_the_video_model_pop_up_and_verify_the_Testing_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		rai.clickbutton(Vype_KnowyourVape.btnVideoModalClose, "Close");
		rai.VerifyElementVisible(Vype_KnowyourVape.txttestingprocess, "testing");
	}

	@Then("^Swipe down to next tile and verify the content of Testing$")
	public void swipe_down_to_next_tile_and_verify_the_content_of_Testing() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		rai.SwipeDownSmallerUnits(4);
		rai.isEnabled(Vype_KnowyourVape.title3, "Testing");
		rai.VerifyElementVisible(Vype_KnowyourVape.qnscontent,"questions");
		String str = rai.getText(Vype_KnowyourVape.qnslist);
		rai.VerifyElementsVisible(Vype_KnowyourVape.qnslist, str);
		System.out.println(str);
	}

	@When("^User swipe up and clicks on Manufacturing in clock wise$")
	public void user_swipe_up_and_clicks_on_Manufacturing_in_clock_wise() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		rai.ScrollByxpath(Vype_KnowyourVape.lnkmanufacturingprocess);
		rai.clickUsingJs(Vype_KnowyourVape.lnkmanufacturingprocess, "Manufacturing");
	}
	@Then("^Verify the content of Manufacturing$")
	public void verify_the_content_of_Manufacturing() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		rai.SwipeUpSmallerUnits(2);
		rai.VerifyElementVisible(Vype_KnowyourVape.txtmanufacturing, "Manufacturing");
		rai.VerifyElementVisible(Vype_KnowyourVape.btnWatchVideo1, "Watch Video Button");
		rai.VerifyElementVisible(Vype_KnowyourVape.txt4by6, "4/6");
		rai.VerifyElementVisible(Vype_KnowyourVape.txthvques, "Have a question");
		rai.VerifyElementVisible(Vype_KnowyourVape.lnkcontactus, "Contact us");
	}

	@When("^Clicked on watch video of Manufacturing page$")
	public void clicked_on_watch_video_of_Manufacturing_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		rai.clickbutton(Vype_KnowyourVape.btnWatchVideo1, "Watch Video Button");
		rai.VerifyElementVisible(Vype_KnowyourVape.btnVideoModalClose, "Close");
	}

	@When("^Close the video model pop up and verify the Manufacturing page$")
	public void close_the_video_model_pop_up_and_verify_the_Manufacturing_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		rai.clickbutton(Vype_KnowyourVape.btnVideoModalClose, "Close");
		rai.VerifyElementVisible(Vype_KnowyourVape.txtmanufacturing, "manufacturing");
	}

	@Then("^Swipe down to next tile and verify the content of Manufacturing$")
	public void swipe_down_to_next_tile_and_verify_the_content_of_Manufacturing() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		rai.SwipeDownSmallerUnits(4);
		rai.isEnabled(Vype_KnowyourVape.title4, "Manufacturing");
		rai.VerifyElementVisible(Vype_KnowyourVape.qnscontent,"questions");
		String str = rai.getText(Vype_KnowyourVape.qnslist);
		rai.VerifyElementsVisible(Vype_KnowyourVape.qnslist, str);
		System.out.println(str);
	}

	@When("^User swipe up and clicks on supply chain in clock wise$")
	public void user_swipe_up_and_clicks_on_supply_chain_in_clock_wise() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		rai.ScrollByxpath(Vype_KnowyourVape.lnksuppchain);
		rai.clickUsingJs(Vype_KnowyourVape.lnksuppchain, "Supply chain");
	}

	@Then("^Verify the content of Supply chain$")
	public void verify_the_content_of_Supply_chain() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		rai.SwipeUpSmallerUnits(2);
		rai.VerifyElementVisible(Vype_KnowyourVape.txtrsupplychain, "Supply chain");
		rai.VerifyElementVisible(Vype_KnowyourVape.btnWatchVideo1, "Watch Video Button");
		rai.VerifyElementVisible(Vype_KnowyourVape.txt5by6, "5/6");
		rai.VerifyElementVisible(Vype_KnowyourVape.txthvques, "Have a question");
		rai.VerifyElementVisible(Vype_KnowyourVape.lnkcontactus, "Contact us");
	}

	@When("^Clicked on watch video of Supply chain page$")
	public void clicked_on_watch_video_of_Supply_chain_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		rai.clickbutton(Vype_KnowyourVape.btnWatchVideo1, "Watch Video Button");
		rai.VerifyElementVisible(Vype_KnowyourVape.btnVideoModalClose, "Close");
	}

	@When("^Close the video model pop up and verify the Supply chain page$")
	public void close_the_video_model_pop_up_and_verify_the_Supply_chain_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		rai.clickbutton(Vype_KnowyourVape.btnVideoModalClose, "Close");
		rai.VerifyElementVisible(Vype_KnowyourVape.txtrsupplychain, "Supply chain");
	}

	@Then("^Swipe down to next tile and verify the content of Supply chain$")
	public void swipe_down_to_next_tile_and_verify_the_content_of_Supply_chain() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		rai.SwipeDownSmallerUnits(3);
		rai.isEnabled(Vype_KnowyourVape.title5, "Supplychain");
		rai.VerifyElementVisible(Vype_KnowyourVape.qnscontent,"questions");
		String str = rai.getText(Vype_KnowyourVape.qnslist);
		rai.VerifyElementsVisible(Vype_KnowyourVape.qnslist, str);
		System.out.println(str);
	}

	@When("^User swipe up and clicks on Brand in hand in clock wise$")
	public void user_swipe_up_and_clicks_on_Brand_in_hand_in_clock_wise() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		rai.ScrollByxpath(Vype_KnowyourVape.lnkbrandinhand);
		rai.clickUsingJs(Vype_KnowyourVape.lnkbrandinhand, "Brand in hand");
	}

	@Then("^Verify the content of Brand in hand$")
	public void verify_the_content_of_Brand_in_hand() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		rai.SwipeUpSmallerUnits(2);
		rai.VerifyElementVisible(Vype_KnowyourVape.txtrbrandin, "brand in");
		rai.VerifyElementVisible(Vype_KnowyourVape.btnWatchVideo1, "Watch Video Button");
		rai.VerifyElementVisible(Vype_KnowyourVape.txt6by6, "6/6");
		rai.VerifyElementVisible(Vype_KnowyourVape.txthvques, "Have a question");
		rai.VerifyElementVisible(Vype_KnowyourVape.lnkcontactus, "Contact us");  
	}

	@When("^Clicked on watch video of Brand in hand page$")
	public void clicked_on_watch_video_of_Brand_in_hand_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		rai.clickbutton(Vype_KnowyourVape.btnWatchVideo1, "Watch Video Button");
		rai.VerifyElementVisible(Vype_KnowyourVape.btnVideoModalClose, "Close");
	}

	@When("^Close the video model pop up and verify the Brand in hand page$")
	public void close_the_video_model_pop_up_and_verify_the_Brand_in_hand_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		rai.clickbutton(Vype_KnowyourVape.btnVideoModalClose, "Close");
		rai.VerifyElementVisible(Vype_KnowyourVape.txtrbrandin, "Brand in");
	}

	@Then("^Swipe down to next tile and verify the content of Brand in hand$")
	public void swipe_down_to_next_tile_and_verify_the_content_of_Brand_in_hand() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		rai.SwipeDownSmallerUnits(3);
		rai.isEnabled(Vype_KnowyourVape.title6, "Brand in Hand");
		rai.VerifyElementVisible(Vype_KnowyourVape.qnscontent,"questions");
		String str = rai.getText(Vype_KnowyourVape.qnslist);
		rai.VerifyElementsVisible(Vype_KnowyourVape.qnslist, str);
		System.out.println(str);
	}



}