package stepDefinitions_Mobile;

import java.util.List;


import org.openqa.selenium.WebElement;

import com.rai.framework.CommonFunctions_Mobile;
import com.rai.framework.RAI_Mobile_Utility_Functions;

import cucumber.api.java.en.*;
import goVype_Properties_mobile.Vype_CommonXpath;

public class epodpods {

	RAI_Mobile_Utility_Functions rai = new RAI_Mobile_Utility_Functions();
	CommonFunctions_Mobile function = new CommonFunctions_Mobile(rai);


	@Then("^verify pods page and subscribe option$")
	public void verify_pods_page_and_subscribe_option() throws Throwable {

		// Verify that ePod's pods page is displayed.
		rai.VerifyElementsVisible(Vype_CommonXpath.pgEpodPods, "ePod Pods");

		rai.ScrollByxpath(Vype_CommonXpath.iconsubscribe);

		//subscribe and save
		rai.clickUsingJs(Vype_CommonXpath.iconsubscribe, "subscribe & save");

		//verify all tiles
		List<WebElement> list=rai.findElementsList(Vype_CommonXpath.subscribetiles);
		for(int i=0;i<list.size();i++)
		{
			String str=list.get(i).getText();
			rai.VerifyElementsVisible(Vype_CommonXpath.subscribetiles, str);
		}

		//subscribe and save
		rai.clickUsingJs(Vype_CommonXpath.iconsubscribe, "subscribe & save");


	}

	@Then("^verify filter by option and verify count$")
	public void verify_filter_by_option_and_verify_count() throws Throwable {

		//scroll to icon subscribe ans save
		rai.ScrollByxpath(Vype_CommonXpath.iconsubscribe);

		//verify results
		String all=rai.getText(Vype_CommonXpath.txtresults);

		rai.VerifyElementsVisible(Vype_CommonXpath.txtresults, all);

		//clicking on ALL
		rai.ClickUsingOCR("All");

		//click on NEW check box
		rai.ClickUsingOCR("New");

		String New=rai.getText(Vype_CommonXpath.txtresults);

		//verify results
		rai.VerifyElementsVisible(Vype_CommonXpath.txtresults, New);
		
		//click on new 
		rai.ClickUsingOCR("New");

		//click on best sellers check box
		rai.ClickUsingOCR("Bestsellers");

		//verify results
		String Bestsellers=rai.getText(Vype_CommonXpath.txtresults);
		//verify results
		rai.VerifyElementsVisible(Vype_CommonXpath.txtresults, Bestsellers);
		
		//click on best sellers
		rai.ClickUsingOCR("Bestsellers");

		//click on  Nicotine Free Flavours 
		rai.ClickUsingOCR("Nicotine Free Flavours");

		String NFS=rai.getText(Vype_CommonXpath.txtresults);

		rai.VerifyElementsVisible(Vype_CommonXpath.txtresults, NFS);
		
		rai.ClickUsingOCR("Nicotine Free Flavours");

		rai.ClickUsingOCR("Tobacco & Mints");

		String TM=rai.getText(Vype_CommonXpath.txtresults);

		rai.VerifyElementsVisible(Vype_CommonXpath.txtresults, TM);

		

	}
	

@Then("^verify Advisory EPods Pod at the top of the page$")
public void verify_Advisory_EPods_Pod_at_the_top_of_the_page() throws Throwable {
    
	String txtAdvisoryEPodPods="Discoveraworldofsensationalflavouroptionsin1.6%strength.Fromfruitandcoolmint,toclassictobaccoandflavour-free,Vuseoffersthelargestselectionofpodflavourswithtotaltastesatisfactiontodiscover.Andaswechargebeyondinnovation,ourgoalistogiveyouthebestandmostreliableproductspossiblebyconductingstate-of-the-arttestingforourpodsbeforeyourfirstpuff.Wantmoregoodnews?We'veintroducedevenmorewaystosaveupto33%onyourvapepods.";
	rai.ScrollByxpath(Vype_CommonXpath.txtAdvisoryEPodsPods);
	//Validation Advisory text at top of the page
	rai.fnContentValidation(txtAdvisoryEPodPods, Vype_CommonXpath.txtAdvisoryEPodsPods);

}

@Then("^verify all footer links and Legal Advisory HeadQuarters text$")
public void verify_all_footer_links_and_Legal_Advisory_HeadQuarters_text() throws Throwable {
    
	function.VerifyAllFooterLinks();
	
    rai.ScrollByxpath(Vype_CommonXpath.txtLegalAdvisoryHeadQuarters);
	//Validate Legal Advisory And HeadQuarters
	String LegalAdvisory = rai.getText(Vype_CommonXpath.txtLegalAdvisoryHeadQuarters);
	if(LegalAdvisory.equals("© Imperial Tobacco Company Ltd., 3711 Saint-Antoine Street West, Montreal, QC H4C 3P6")){
		rai.VerifyElementsVisible(Vype_CommonXpath.txtLegalAdvisoryHeadQuarters,"Legal Advisory And Head Quarters Are Displayed");
	}
}

@Then("^user engrave the device by selecting DeviceColour \"([^\"]*)\" and add to cart in mobile$")
public void user_engrave_the_device_by_selecting_DeviceColour_and_add_to_cart_in_mobile(String devicecolour) throws Throwable {
		try {
			Thread.sleep(10000);
			rai.ScrollByxpath(Vype_CommonXpath.lnkcorecollections);
			rai.clickUsingJs(Vype_CommonXpath.lnkcorecollections, "epod2 core collections");

			Thread.sleep(10000);
			// Verify the "Choose your colour" page is displayed
			rai.VerifyElementVisible(Vype_CommonXpath.txtChooseyourClr, "Choose your Color");

			// Select any colour
			rai.clickUsingJs(Vype_CommonXpath.btnSelectDeviceColor(devicecolour), "colour selected is:" + devicecolour);

			// Verify Text Power on with the VUSE ePod2 section is displayed

			rai.VerifyElementVisible(Vype_CommonXpath.pgdevicecolour,"The Power on with the Vuse ePod2 Section");

			for(int i=0;i<4;i++)
			{
				rai.clickUsingJs(Vype_CommonXpath.rightarrow, "-> ");

				rai.VerifyElementVisible(Vype_CommonXpath.weProductImage,"product images ");
			}

			// Click on Add to Cart button
			rai.clickUsingJs(Vype_CommonXpath.btnAddToCART, "Add to Cart");

			// Verify mini cart is updated
			String str;
			str = rai.getText(Vype_CommonXpath.txtnumber);
			rai.VerifyElementVisible(Vype_CommonXpath.txtnumber, "Cart is updated with " + str + " number ");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}



}
