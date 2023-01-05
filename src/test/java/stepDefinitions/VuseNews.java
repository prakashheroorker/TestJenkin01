package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;


import com.rai.framework.BaseClass;
import com.rai.framework.CommonFunctions;
import com.rai.framework.GenericLib;
import com.rai.framework.RAI_Desktop_Utility_Functions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import goVype_Properties.Vype_Cart;

import goVype_Properties.Vype_Common;
import goVype_Properties.Vype_CommonXpath;
import goVype_Properties.Vype_OrderConfirmation;
import goVype_Properties.Vype_PlatinumProfileTrigger;
import goVype_Properties.Vype_Rewards;
import goVype_Properties.Vype_SilverProfileTrigger;
import goVype_Properties.Vype_StatusOfBenefits;
import goVype_Properties.Vype_VuseNews;
import goVype_Properties.Vype_ePodWorkflows;

public class VuseNews{
	
	RAI_Desktop_Utility_Functions gl = new RAI_Desktop_Utility_Functions();
	CommonFunctions function = new CommonFunctions(gl);
		
	@Then("^User Hovers on About and clicks Vuse news$")
	public void user_hovers_on_About_and_clicks_Vuse_news() throws Throwable {

		Thread.sleep(4000);
		// Hover the mouse on About link
		gl.HowerMouse(Vype_CommonXpath.lnkAbout, "About link from the main menu navigation");
		//Click on Vuse News
		gl.clickLink(Vype_VuseNews.txtVuseNews, "Vuse news link from the About navigation");

	}

	@Then("^Verify tiles in vuse news landing page$")
	public void verify_tiles_in_vuse_news_landing_page() throws Throwable {

		// Verify the Vuse News page is displayed
		gl.VerifyElementVisible(Vype_VuseNews.newstitle, "Vuse News");

		List<WebElement> list4 = gl.findElementsList(Vype_VuseNews.wenewstiles);
		System.out.println("Total no of vuse news tiles: "+list4.size());
		for(int i=0; i<list4.size();i++)
		{

			gl.fnScrollToView(Vype_VuseNews.wenewstiles(i));
			gl.ScrollPageUp();
			String str = list4.get(i).getText();
			System.out.println((i+1)+":" + str);

			String str1 =gl.getText(Vype_VuseNews.weDescription(i));
			gl.VerifyObjectDisplayed(Vype_VuseNews.weDescription(i), str1);
			System.out.println("Content :" + str1);

			gl.VerifyObjectDisplayed(Vype_VuseNews.weReadMore(i),"Read More");

		}
		gl.fnScrollToView(Vype_VuseNews.wefooterLinks);
		String str =gl.getText(Vype_VuseNews.wefooterLinks);
		gl.VerifyElementVisible(Vype_VuseNews.wefooterLinks, "Footer Links");
		System.out.println("Footer Links:" + str);

	}
	@Then("^Click on Read More link on any of the Blog Post$")
	public void click_on_read_more_link_on_any_of_the_blog_post() throws Throwable {

		gl.clickLink(Vype_VuseNews.weReadMore, "Read More");
	}

	@Then("^Verify the user is redirected to the corresponding Blog post to read the content$")
	public void verify_the_user_is_redirected_to_the_corresponding_blog_post_to_read_the_content() throws Throwable {
		
		gl.fnScrollToView(Vype_VuseNews.weContent);
		String str =gl.getText(Vype_VuseNews.weContent);
		gl.VerifyElementVisible(Vype_VuseNews.weContent, "Page Content");
		System.out.println(str);
	}
	}

		
	
	