package stepDefinitions_Mobile;



import com.rai.framework.CommonFunctions_Mobile;
import com.rai.framework.RAI_Mobile_Utility_Functions;

import cucumber.api.java.en.When;
import goVype_Properties_mobile.Vype_CommonXpath;
import goVype_Properties_mobile.*;

public class ElectricStripeCollection {

	
	RAI_Mobile_Utility_Functions rai = new RAI_Mobile_Utility_Functions();
	CommonFunctions_Mobile function = new CommonFunctions_Mobile(rai);
	
	@When("^Click on Electric Stripe Collection and select the\"([^\"]*)\"$")
	public void click_on_Electric_Stripe_Collection_and_Select_the(String Strip) throws Throwable {
	    
		rai.clickbutton(Vype_ElectricStripeCollection.EelectricStrip, "EelectricStrip");
		Thread.sleep(2000);
		
		
	rai.VerifyElementVisible(Vype_CommonXpath.BoltGreyStripe, "Bolt Grey Stripe");
		rai.VerifyElementVisible(Vype_CommonXpath.CharcoakxStripe, "Charcoak-x Stripe");
		rai.VerifyElementVisible(Vype_CommonXpath.GalacticBlueStripe, "Galactic Blue Stripe");
		
		rai.VerifyElementsVisible(Vype_ElectricStripeCollection.EelectricStripPge, "EelectricStrip Page");
		
		rai.clickbutton(Vype_ElectricStripeCollection.Strip(Strip), "Eelectric Strip");
		Thread.sleep(3000);
		
		rai.VerifyElementsVisible(Vype_ElectricStripeCollection.StripPge, "Strip Page");
		
		rai.VerifyElementsVisible(Vype_ElectricStripeCollection.AddtoCart, "AddtoCart");
		
		rai.VerifyElementsVisible(Vype_ElectricStripeCollection.Widget, "Widget");
		
		rai.clickbutton(Vype_ElectricStripeCollection.AddtoCart, "AddtoCart");
		
	}
}
