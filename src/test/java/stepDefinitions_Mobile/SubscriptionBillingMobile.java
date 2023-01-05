package stepDefinitions_Mobile;

import com.rai.framework.CommonFunctions_Mobile;
import com.rai.framework.RAI_Mobile_Utility_Functions;

import cucumber.api.java.en.Then;


import goVype_Properties_mobile.Vype_CommonXpath;

public class SubscriptionBillingMobile {
	
	RAI_Mobile_Utility_Functions rai = new RAI_Mobile_Utility_Functions();
	CommonFunctions_Mobile function = new CommonFunctions_Mobile(rai);

	@Then("^creating subscription$")
	public void createing_subscription() throws Throwable {
		rai.ScrollByxpath(Vype_CommonXpath.pgsubscribandsave);

		for(int i=0;i<2;i++)
		{
			
			//click on 
			rai.clickUsingJs(Vype_CommonXpath.btnstrength, "+ ");
		}

	/*	boolean b1=rai.verifyobjectisnotavailable(Vype_CommonXpath.txtSubsandSave);

		if(b1==false)
		{
			
			rai.clickUsingJs(Vype_CommonXpath.txtSubsandSave,"Subscribe and save");
		}

		if(b1==true)
		{ */
			rai.clickbutton(Vype_CommonXpath.txtSubsandSave1,"Subscribe and save");
		//}
		
		
		//click on subscribe and save
	  rai.clickbutton(Vype_CommonXpath.btnSubscribeandSave, "Subscribe and save");

	}

}
