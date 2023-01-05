package stepDefinitions;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.rai.framework.BaseClass;
import com.rai.framework.CommonFunctions;
import com.rai.framework.RAI_Desktop_Utility_Functions;


import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import goVype_Properties.Vype_KnowyourVape;

public class knowyourvape extends BaseClass{	

	RAI_Desktop_Utility_Functions gl = new RAI_Desktop_Utility_Functions();
	CommonFunctions function = new CommonFunctions(gl);



//	@When("^Hover on About and click on Know your vape$")
//	public void hover_on_About_and_click_on_Know_your_vape() throws Throwable {
//		function.navigateToKnowYourVape();
//
//
//	}
//
//	@Then("^Verify the Banner and buttons Watch Video and Learn More are available$")
//	public void verify_the_Banner_and_buttons_Watch_Video_and_Learn_More_are_available() throws Throwable {
//
//		gl.VerifyElementVisible(Vype_KnowyourVape.ImgKnowYourVape, "Quality image");
//
//		gl.VerifyElementVisible(Vype_KnowyourVape.btnWatchVideo, "Watch Video Button");
//
//		gl.VerifyElementVisible(Vype_KnowyourVape.btnlearnMore, "Learn More Button");
//
//	}

//	@Then("^Click on Watch the video button$")
//	public void click_on_Watch_the_video_button() throws Throwable {
//
//		gl.clickbutton(Vype_KnowyourVape.btnWatchVideo, "Watch Video Button");
//	}
//
//	@Then("^Verify the video model pop up contents$")
//	public void verify_the_video_model_pop_up_contents() throws Throwable {
//		
//		/*int size = driver.findElements(By.tagName("iframe")).size();
//		System.out.println(size);
//
//		
//		driver.switchTo().frame(0);*/
//
//		gl.VerifyElementVisible(Vype_KnowyourVape.VideoPlayer, "Video");
//
//		//gl.VerifyElementVisible(Vype_KnowyourVape.btnWatchLater, "Watch later");
//
//		gl.VerifyElementVisible(Vype_KnowyourVape.btnShare, "Share");
//
//		gl.VerifyElementVisible(Vype_KnowyourVape.btnVideoModalClose, "Close");
//
//		gl.VerifyElementVisible(Vype_KnowyourVape.lnkWatchonYouTube, "Watch on Youtube");
//
//		gl.switchDefault();
//
//	}
//
//	@Then("^Click on play and pause buttons$")
//	public void click_on_play_and_pause_buttons() throws Throwable {
//
//		//Click On Video To Play
//		gl.clickbutton(Vype_KnowyourVape.VideoPlayer, "Video Clicked To Play");
//		//Wait for Few Seconds
//		Thread.sleep(4000);
//		//pause
//		gl.clickLink(Vype_KnowyourVape.VideoPlayer, "Video clicked to Pause");
//
//		
//	}
//
//	@Then("^Close the video model pop up$")
//	public void close_the_video_model_pop_up() throws Throwable {
//
//		gl.clickbutton(Vype_KnowyourVape.btnVideoModalClose, "Close");
//
//	}

//	@Then("^Click on Learn more button$")
//	public void click_on_Learn_more_button() throws Throwable {
//		gl.clickbutton(Vype_KnowyourVape.btnlearnMore, "Learn More Button");  
//	}
//
//
////	
//	@When("^Clicked on watch video of learn more page$")
//	public void clicked_on_watch_video_of_learn_more_page() throws Throwable {
//		gl.clickbutton(Vype_KnowyourVape.btnWatchVideo1, "Watch Video Button");
//	}
//	
//	@When("^Click on raw material and verify the UI contents$")
//	public void click_on_raw_material_and_verify_the_UI_contents() throws Throwable {
//		gl.ScrollPageUp();
//		gl.HowerMouse(Vype_KnowyourVape.lnkrawmat, "Raw material");
//		gl.clickElement(Vype_KnowyourVape.lnkrawmat, "Raw material");
//		gl.VerifyElementVisible(Vype_KnowyourVape.txt2by6, "2/6");
//		gl.VerifyElementVisible(Vype_KnowyourVape.txthvques, "Have a question");
//		gl.VerifyElementVisible(Vype_KnowyourVape.lnkcontactus, "Contact us");
//	}
//	@Then("^Click on testing and verify the UI contents$")
//	public void click_on_testing_and_verify_the_UI_contents() throws Throwable {
//		gl.ScrollPageUp();
//		gl.HowerMouse(Vype_KnowyourVape.lnktesting, "Testing");
//		gl.clickElement(Vype_KnowyourVape.lnktesting, "Testing");
//		gl.VerifyElementVisible(Vype_KnowyourVape.txt3by6, "3/6");
//		gl.VerifyElementVisible(Vype_KnowyourVape.txthvques, "Have a question");
//		gl.VerifyElementVisible(Vype_KnowyourVape.lnkcontactus, "Contact us");
//	}
//
//	@Then("^Click on manufacturing process and verify the UI contents$")
//	public void click_on_manufacturing_process_and_verify_the_UI_contents() throws Throwable {
//		gl.ScrollPageUp();
//		gl.HowerMouse(Vype_KnowyourVape.lnkmanufacturingprocess, "Manufacturing process");
//		gl.clickElement(Vype_KnowyourVape.lnkmanufacturingprocess, "Manufacturing process");
//		gl.VerifyElementVisible(Vype_KnowyourVape.txt4by6, "4/6");
//		gl.VerifyElementVisible(Vype_KnowyourVape.txthvques, "Have a question");
//		gl.VerifyElementVisible(Vype_KnowyourVape.lnkcontactus, "Contact us");
//	}
//
//	@Then("^Click on supply chain and verify the UI contents$")
//	public void click_on_supply_chain_and_verify_the_UI_contents() throws Throwable {
//		gl.ScrollPageUp();
//		gl.HowerMouse(Vype_KnowyourVape.lnksuppchain, "Supply chain");
//		gl.clickElement(Vype_KnowyourVape.lnksuppchain, "Supply chain");
//		gl.VerifyElementVisible(Vype_KnowyourVape.txt5by6, "5/6");
//		gl.VerifyElementVisible(Vype_KnowyourVape.txthvques, "Have a question");
//		gl.VerifyElementVisible(Vype_KnowyourVape.lnkcontactus, "Contact us");
//	}
//
//	@Then("^Click on brand in hand and verify the UI contents$")
//	public void click_on_brand_in_hand_and_verify_the_UI_contents() throws Throwable {
//		gl.ScrollPageUp();
//		gl.HowerMouse(Vype_KnowyourVape.lnkbrandinhand, "Brand in hand");
//		gl.clickElement(Vype_KnowyourVape.lnkbrandinhand, "Brand in hand");
//		gl.VerifyElementVisible(Vype_KnowyourVape.txt6by6, "6/6");
//		gl.VerifyElementVisible(Vype_KnowyourVape.txthvques, "Have a question");
//		gl.VerifyElementVisible(Vype_KnowyourVape.lnkcontactus, "Contact us");
//	}
//	@When("^Clicked on contact us and verify contact page$")
//	public void clicked_on_contact_us_and_verify_contact_page() throws Throwable {
//		gl.clickElement(Vype_KnowyourVape.lnkcontactus, "Contact us");
//		gl.VerifyElementVisible(Vype_KnowyourVape.txtgetintouch, "Get in touch");
//	}
	
	@When("^Hover on About and click on Know your vape$")
	public void hover_on_About_and_click_on_Know_your_vape() throws Throwable {
		function.navigateToKnowYourVape();


	}

	@Then("^Verify the Banner and buttons Watch Video and Learn More are available$")
	public void verify_the_Banner_and_buttons_Watch_Video_and_Learn_More_are_available() throws Throwable {

		gl.VerifyElementVisible(Vype_KnowyourVape.ImgKnowYourVape, "Quality image");

		gl.VerifyElementVisible(Vype_KnowyourVape.btnWatchVideo, "Watch Video Button");

		gl.VerifyElementVisible(Vype_KnowyourVape.btnlearnMore, "Learn More Button");

	}
	
	@Then("^Click on Learn more button$")
	public void Click_on_Learn_more_button() throws Throwable {
		gl.clickbutton(Vype_KnowyourVape.btnlearnMore, "Learn More Button");  
	}


//	
	@When("^Clicked on watch video of learn more page$")
	public void clicked_on_watch_video_of_learn_more_page() throws Throwable {
		gl.clickbutton(Vype_KnowyourVape.btnWatchVideo1, "Watch Video Button");
	}
	@Then("^Verify video model is displayed$")
	public void verify_video_model_is_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		gl.VerifyElementVisible(Vype_KnowyourVape.btnVideoModalClose, "Close");
	}
//
	@Then("^Close the video model pop up and verify learn more page displayed$")
	public void Close_the_video_model_pop_up_and_verify_learn_more_page_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		gl.clickUsingJs(Vype_KnowyourVape.btnVideoModalClose, "Close");
		gl.VerifyElementVisible(Vype_KnowyourVape.txtSuppilerSourcing, "Suppiler Sourcing");
		
	}
	@Then("^Verify the Contents of Learn more page$")
	public void Verify_the_Contents_of_Learn_more_page() throws Throwable {
		gl.VerifyElementVisible(Vype_KnowyourVape.txtSuppilerSourcing, "Suppiler Sourcing");
		gl.VerifyElementVisible(Vype_KnowyourVape.btnWatchVideo1, "Watch Video Button");
		gl.VerifyElementVisible(Vype_KnowyourVape.txt1by6, "1/6");
		gl.VerifyElementVisible(Vype_KnowyourVape.txthvques, "Have a question");
		gl.VerifyElementVisible(Vype_KnowyourVape.lnkcontactus, "Contact us");
	}

	@Then("^Scroll down to next tile and verify the contents$")
	public void Scroll_down_to_next_tile_and_verify_the_contents() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		gl.ScrollPageDown();
		gl.VerifyElementVisible(Vype_KnowyourVape.title, "title");
		String str = gl.getText(Vype_KnowyourVape.qnslist);
		gl.VerifyObjectDisplayed(Vype_KnowyourVape.qnslist, str);
		System.out.println(str);
	}

	@When("^User Click on each question and verify related answers is displayed$")
	public void User_Click_on_each_question_and_verify_related_answers_is_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		gl.ScrollPageDown();
		gl.VerifyElementVisible(Vype_KnowyourVape.qnscontent,"questions");
		List<WebElement> list3 = gl.findElementsList(Vype_KnowyourVape.qnscontent);
		System.out.println("Total no of qns: "+list3.size());
		for(int i=0; i<list3.size();i++)
		{
			gl.clickUsingJs(Vype_KnowyourVape.dropdown(i),"Down arrow");
			String qns=gl.getText(Vype_KnowyourVape.cntanswer(i));
			System.out.println((i+1)+":"+qns);
			gl.VerifyElementVisible(Vype_KnowyourVape.cntanswer(i),qns );
			
			
		}
	}

	@When("^User scrolled up and  Clicked on raw material sourcing button in clock wise$")
	public void User_scrolled_up_and_Clicked_on_raw_material_sourcing_button_in_clock_wise() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		gl.ScrollPageUp();
		gl.HowerMouse(Vype_KnowyourVape.lnkrawmat, "Raw material");
		gl.clickElement(Vype_KnowyourVape.lnkrawmat, "Raw material");
	}
	@Then("^Verify the Contents of raw material sourcing page$")
	public void Verify_the_Contents_of_raw_material_sourcing_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		gl.VerifyElementVisible(Vype_KnowyourVape.txtrawmaterialSourcing, "Suppiler Sourcing");
		gl.VerifyElementVisible(Vype_KnowyourVape.btnWatchVideo1, "Watch Video Button");
		gl.VerifyElementVisible(Vype_KnowyourVape.txt2by6, "2/6");
		gl.VerifyElementVisible(Vype_KnowyourVape.txthvques, "Have a question");
		gl.VerifyElementVisible(Vype_KnowyourVape.lnkcontactus, "Contact us");
	}
	@When("^Clicked on watch video of raw material sourcing page$")
	public void Clicked_on_watch_video_of_raw_material_sourcing_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		gl.clickbutton(Vype_KnowyourVape.btnWatchVideo1, "Watch Video Button");
	}
	@Then("^Close the video model pop up and verify raw material sourcing displayed$")
	public void Close_the_video_model_pop_up_and_verify_raw_material_sourcing_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		gl.clickbutton(Vype_KnowyourVape.btnVideoModalClose, "Close");
		gl.VerifyElementVisible(Vype_KnowyourVape.txtrawmaterialSourcing, "Suppiler Sourcing");
	}

	
	@Then("^Scroll down to next tile of raw material sourching page and verify the contents$")
	public void Scroll_down_to_next_tile_of_raw_material_sourching_page_and_verify_the_contents() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		gl.ScrollPageDown();
		gl.VerifyElementVisible(Vype_KnowyourVape.title, "title");
		String str = gl.getText(Vype_KnowyourVape.qnslist);
		gl.VerifyObjectDisplayed(Vype_KnowyourVape.qnslist, str);
		System.out.println(str);
	}
	@When("^User scrolled up and  Clicked on Testing button in clock wise$")
	public void User_scrolled_up_and_Clicked_on_Testing_button_in_clock_wise() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		gl.HowerMouse(Vype_KnowyourVape.lnktesting, "Testing");
		gl.clickElement(Vype_KnowyourVape.lnktesting, "Testing");
	}
	@When("^Clicked on watch video of Testing page$")
	public void Clicked_on_watch_video_of_Testing_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		gl.clickbutton(Vype_KnowyourVape.btnWatchVideo1, "Watch Video Button");
	}

	@Then("^Close the video model pop up and verify Testing page displayed$")
	public void Close_the_video_model_pop_up_and_verify_Testing_page_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		gl.clickbutton(Vype_KnowyourVape.btnVideoModalClose, "Close");
		gl.VerifyElementVisible(Vype_KnowyourVape.txttestingprocess, "testing");
	}

	@Then("^Scroll down to next tile of testing and verify the contents$")
	public void Scroll_down_to_next_tile_of_testing_and_verify_the_contents() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		gl.ScrollPageDown();
		gl.VerifyElementVisible(Vype_KnowyourVape.title, "title");
		String str = gl.getText(Vype_KnowyourVape.qnslist);
		gl.VerifyObjectDisplayed(Vype_KnowyourVape.qnslist, str);
		System.out.println(str);
	}
	@When("^User scrolled up and  Clicked on Manufacturing process button in clock wise$")
	public void User_scrolled_up_and_Clicked_on_Manufacturing_process_button_in_clock_wise() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		gl.ScrollPageUp();
		gl.HowerMouse(Vype_KnowyourVape.lnkmanufacturingprocess, "Manufacturing process");
		gl.clickElement(Vype_KnowyourVape.lnkmanufacturingprocess, "Manufacturing process");
	}

	@When("^Clicked on watch video of Manufacturing process page$")
	public void clicked_on_watch_video_of_Manufacturing_process_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		gl.clickbutton(Vype_KnowyourVape.btnWatchVideo1, "Watch Video Button");
	    
	}
	@Then("^Close the video model pop up and verify Manufacturing process page displayed$")
	public void close_the_video_model_pop_up_and_verify_Manufacturing_process_page_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		gl.clickbutton(Vype_KnowyourVape.btnVideoModalClose, "Close");
		gl.VerifyElementVisible(Vype_KnowyourVape.txtmanufacturing, "manufacturing");
	}
	@Then("^Scroll down to next tile of Manufacturing process and verify the contents$")
	public void scroll_down_to_next_tile_of_Manufacturing_process_and_verify_the_contents() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		gl.ScrollPageDown();
		gl.VerifyElementVisible(Vype_KnowyourVape.title, "title");
		String str = gl.getText(Vype_KnowyourVape.qnslist);
		gl.VerifyObjectDisplayed(Vype_KnowyourVape.qnslist, str);
		System.out.println(str);
	}

	@When("^User scrolled up and  Clicked on supply chain button in clock wise$")
	public void user_scrolled_up_and_Clicked_on_supply_chain_button_in_clock_wise() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		gl.ScrollPageUp();
		gl.HowerMouse(Vype_KnowyourVape.lnksuppchain, "Supply chain");
		gl.clickElement(Vype_KnowyourVape.lnksuppchain, "Supply chain");
	}
	@When("^Clicked on watch video of supply chain  page$")
	public void clicked_on_watch_video_of_supply_chain_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		gl.clickbutton(Vype_KnowyourVape.btnWatchVideo1, "Watch Video Button");
	}
	@Then("^Close the video model pop up and verify supply chain  page displayed$")
	public void close_the_video_model_pop_up_and_verify_supply_chain_page_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		gl.clickbutton(Vype_KnowyourVape.btnVideoModalClose, "Close");
		gl.VerifyElementVisible(Vype_KnowyourVape.txtrsupplychain, "Supply chain");
	}
	@Then("^Scroll down to next tile of supply chain and verify the contents$")
	public void scroll_down_to_next_tile_of_supply_chain_and_verify_the_contents() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		gl.ScrollPageDown();
		gl.VerifyElementVisible(Vype_KnowyourVape.title, "title");
		String str = gl.getText(Vype_KnowyourVape.qnslist);
		gl.VerifyObjectDisplayed(Vype_KnowyourVape.qnslist, str);
		System.out.println(str);
	}
	
	@When("^User scrolled up and  Clicked on Brand in hand button in clock wise$")
	public void user_scrolled_up_and_Clicked_on_Brand_in_hand_button_in_clock_wise() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		gl.ScrollPageUp();
		gl.HowerMouse(Vype_KnowyourVape.lnkbrandinhand, "Brand in hand");
		gl.clickElement(Vype_KnowyourVape.lnkbrandinhand, "Brand in hand");
	}
	@When("^Clicked on watch video of Brand in hand button page$")
	public void clicked_on_watch_video_of_Brand_in_hand_button_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		gl.clickbutton(Vype_KnowyourVape.btnWatchVideo1, "Watch Video Button");
	}
	@Then("^Close the video model pop up and verify Brand in hand button displayed$")
	public void close_the_video_model_pop_up_and_verify_Brand_in_hand_button_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		gl.clickbutton(Vype_KnowyourVape.btnVideoModalClose, "Close");
		gl.VerifyElementVisible(Vype_KnowyourVape.txtrbrandin, "brand in");
	}
	@Then("^Scroll down to next tile of Brand in hand and verify the contents$")
	public void scroll_down_to_next_tile_of_Brand_in_hand_and_verify_the_contents() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		gl.ScrollPageDown();
		gl.VerifyElementVisible(Vype_KnowyourVape.title, "title");
		String str = gl.getText(Vype_KnowyourVape.qnslist);
		gl.VerifyObjectDisplayed(Vype_KnowyourVape.qnslist, str);
		System.out.println(str);
	}

@Then("^Verify the Contents of Testing process page$")
public void verify_the_Contents_of_Testing_process_page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	gl.VerifyElementVisible(Vype_KnowyourVape.txttestingprocess, "testing");
	gl.VerifyElementVisible(Vype_KnowyourVape.btnWatchVideo1, "Watch Video Button");
	gl.VerifyElementVisible(Vype_KnowyourVape.txt3by6, "3/6");
	gl.VerifyElementVisible(Vype_KnowyourVape.txthvques, "Have a question");
	gl.VerifyElementVisible(Vype_KnowyourVape.lnkcontactus, "Contact us");
}

@Then("^Verify the Contents of  Manufacturing process page$")
public void verify_the_Contents_of_Manufacturing_process_page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	gl.VerifyElementVisible(Vype_KnowyourVape.txtmanufacturing, "manufacturing");
	gl.VerifyElementVisible(Vype_KnowyourVape.btnWatchVideo1, "Watch Video Button");
	gl.VerifyElementVisible(Vype_KnowyourVape.txt4by6, "4/6");
	gl.VerifyElementVisible(Vype_KnowyourVape.txthvques, "Have a question");
	gl.VerifyElementVisible(Vype_KnowyourVape.lnkcontactus, "Contact us");
}

@Then("^Verify the Contents of  supply chain process page$")
public void verify_the_Contents_of_supply_chain_process_page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	gl.VerifyElementVisible(Vype_KnowyourVape.txtrsupplychain, "Supply chain");
	gl.VerifyElementVisible(Vype_KnowyourVape.btnWatchVideo1, "Watch Video Button");
	gl.VerifyElementVisible(Vype_KnowyourVape.txt5by6, "5/6");
	gl.VerifyElementVisible(Vype_KnowyourVape.txthvques, "Have a question");
	gl.VerifyElementVisible(Vype_KnowyourVape.lnkcontactus, "Contact us");
}

@Then("^Verify the Contents of  Brand in process page$")
public void verify_the_Contents_of_Brand_in_process_page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	gl.VerifyElementVisible(Vype_KnowyourVape.txtrbrandin, "brand in");
	gl.VerifyElementVisible(Vype_KnowyourVape.btnWatchVideo1, "Watch Video Button");
	gl.VerifyElementVisible(Vype_KnowyourVape.txt6by6, "6/6");
	gl.VerifyElementVisible(Vype_KnowyourVape.txthvques, "Have a question");
	gl.VerifyElementVisible(Vype_KnowyourVape.lnkcontactus, "Contact us");
}
	
	



	
}