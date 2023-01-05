package stepDefinitions_Mobile;




import com.rai.framework.CommonFunctions_Mobile;

import com.rai.framework.RAI_Mobile_Utility_Functions;

import cucumber.api.java.en.And;

import goVype_Properties.Vype_CommonXpath;


public class BatCanadaAnniversaryBoxset{
	
	RAI_Mobile_Utility_Functions rai = new RAI_Mobile_Utility_Functions();
	CommonFunctions_Mobile function = new CommonFunctions_Mobile(rai);

	
	@And("^navigate to device and select boxset")
	public void navigate_to_device_and_select_boxset() throws Throwable {
		Thread.sleep(10000);
		rai.clickUsingJs(Vype_CommonXpath.lnkAnniversaryboxset, "Anniversary Boxset");

		Thread.sleep(10000);

		// Verify Text Power on with the VUSE ePod2 section is displayed

		rai.VerifyElementVisible(Vype_CommonXpath.pgboxset, "NEW LIMITED-EDITION ePod 2");

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



		

	
	}
	@And("^Add charging cable and charging case and add to cart$")
		public void navigate_to_device_and_select_boxset_with() throws Throwable { 
		String str;
		
		// Click on Add to Cart button
				rai.clickbutton(Vype_CommonXpath.btnChargingCableAddToCART, "Add to Cart");

				// Verify Mini cart is updated
				str = rai.getText(Vype_CommonXpath.txtnumber);
				rai.VerifyElementVisible(Vype_CommonXpath.txtnumber, "Cart is updated with " + str + " number ");
				//Click on Add to Cart button
				rai.clickbutton(Vype_CommonXpath.btnChargingCaseAddToCART, "Add to Cart");

				// Verify Mini cart is updated
				str = rai.getText(Vype_CommonXpath.txtnumber);
				rai.VerifyElementVisible(Vype_CommonXpath.txtnumber, "Cart is updated with " + str + " number ");

		
	}
	@And("^click on explore and select epod \"([^\"]*)\" and add to cart$")
	public void click_on_explore_and_select_epod_and_add_to_cart(String Flavor) throws Throwable {

		//Click on Explore button
		rai.clickUsingJs(Vype_CommonXpath.btnExplore, "Explore");

		// Verify that ePod's pods page is displayed.
		rai.VerifyElementVisible(Vype_CommonXpath.pgEpodPods, "ePod Pods");

		//Add any catridge
		boolean b=rai.isObjectPresent(Vype_CommonXpath.btnaddflavor(Flavor), "Flavor");

				if(b==true)
				{

					rai.ScrollByxpath(Vype_CommonXpath.Txtflavor(Flavor));

					rai.clickUsingJs(Vype_CommonXpath.addpod(Flavor), Flavor);

				    rai.VerifyPageObject(Vype_CommonXpath.btnaddflavor(Flavor), "Add");

					rai.clickUsingJs(Vype_CommonXpath.btnaddflavor(Flavor), "Add");

				}
				else
				{


					rai.ScrollByxpath(Vype_CommonXpath.Txtflavor(Flavor));

					rai.clickUsingJs(Vype_CommonXpath.addpod1(Flavor), Flavor);

					rai.VerifyElementVisible(Vype_CommonXpath.btnaddflavor1(Flavor), "Add");

					rai.clickUsingJs(Vype_CommonXpath.btnaddflavor1(Flavor), "Add");

				}
		
	}
	
}