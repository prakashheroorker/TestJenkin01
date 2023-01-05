package stepDefinitions_Mobile;


import org.openqa.selenium.WebElement;
import java.util.List;


import com.rai.framework.CommonFunctions_Mobile;

import com.rai.framework.RAI_Mobile_Utility_Functions;

import cucumber.api.java.en.Then;

import goVype_Properties.Vype_CommonXpath;
import goVype_Properties.Vype_VuseNews;

public class VuseNews {

	RAI_Mobile_Utility_Functions rai = new RAI_Mobile_Utility_Functions();
	CommonFunctions_Mobile function = new CommonFunctions_Mobile(rai);

	@Then("^User clicks on Vuse news and verify respective page is displayed$")
	public void user_clicks_on_Vuse_news_and_verify_respective_page_is_displayed() throws Throwable {

		rai.ClickUsingOCR("Vuse News");
		rai.VerifyElementsVisible(Vype_VuseNews.txtVuseNews,"Vuse News");
	}

	@Then("^Verify tiles in vuse news landing page$")
	public void verify_tiles_in_vuse_news_landing_page() throws Throwable {
		// Verify the Vuse News page is displayed
		rai.VerifyElementVisible(Vype_VuseNews.newstitle, "Vuse News");

		List<WebElement> list4 = rai.findElementsList(Vype_VuseNews.wenewstiles);
		System.out.println("Total no of vuse news tiles: "+list4.size());
		for(int i=0; i<list4.size();i++)
		{

			rai.ScrollByxpath(Vype_VuseNews.wenewstiles(i));
			rai.SwipeUpSmallerUnits(1);
			String str = list4.get(i).getText();
			System.out.println((i+1)+":" + str);

			String str1 =rai.getText(Vype_VuseNews.weDescription(i));
			rai.VerifyElementVisible(Vype_VuseNews.weDescription(i), str1);
			System.out.println("Content :" + str1);

			rai.VerifyElementVisible(Vype_VuseNews.weReadMore(i),"Read More");
		
		}
		
		rai.ScrollByxpath(Vype_VuseNews.wefooterLinks);
		String str =rai.getText(Vype_VuseNews.wefooterLinks);
		rai.VerifyElementVisible(Vype_VuseNews.wefooterLinks, "Footer Links");
		System.out.println("Footer Links:" + str);
	}
	@Then("^Click on Read More Link on any of the Blog Post$")
	public void click_on_read_more_link_on_any_of_the_blog_post() throws Throwable {

		rai.clickLink(Vype_VuseNews.weReadMore, "Read More");
	}

	@Then("^Verify the user is redirected to the corresponding Blog Post to read the content$")
	public void verify_the_user_is_redirected_to_the_corresponding_blog_post_to_read_the_content() throws Throwable {
		
		rai.ScrollByxpath(Vype_VuseNews.weContent);
		String str =rai.getText(Vype_VuseNews.weContent);
		rai.VerifyElementVisible(Vype_VuseNews.weContent, "Page Content");
		System.out.println(str);
	}
}