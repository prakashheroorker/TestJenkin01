package stepDefinitions_Mobile;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.rai.framework.CommonFunctions_Mobile;
import com.rai.framework.RAI_Mobile_Utility_Functions;

import cucumber.api.java.en.*;

import goVype_Properties_mobile.Vype_CheckOut;
import goVype_Properties_mobile.Vype_CommonXpath;

public class OneTimePurchase_BusinessWorkflows {


	RAI_Mobile_Utility_Functions rai = new RAI_Mobile_Utility_Functions();
	CommonFunctions_Mobile function = new CommonFunctions_Mobile(rai);
	RemoteWebDriver rdriver;

	@Then("^User verifies pods page and selects flavor \"([^\"]*)\"$")
	public void user_verifies_pods_page_and_selects_flavor(String flavor) throws Throwable {



		//click on flavor
		rai.clickbutton(Vype_CommonXpath.txtFlavor(flavor), flavor );


		//rai.clickbutton(Vype_CommonXpath.closeFlavor, "close flavor");


		//Thread.sleep(3000);
	//rai.VerifyElementsVisible(Vype_CommonXpath.txtflavor2(flavor), flavor );
		
	}



	@Then("^Click on one time purchase add quantity \"([^\"]*)\" and add to cart$")
	public void click_on_one_time_purchase_add_quantity_and_add_to_cart(String count) throws Throwable {

		/*boolean b1=rai.verifyobjectisnotavailable(Vype_CommonXpath.btnonetimepurchase);

		if(b1==true)
		{
			rai.SwipeDownSmallerUnits(4);
			//rai.ScrollByxpath(Vype_CommonXpath.btnstrength);
			int flavorcount = Integer.parseInt(count);
			for(int i=0;i<flavorcount;i++)
			{
				rai.clickbutton(Vype_CommonXpath.btnstrength, "+ ");
			}


			//rai.clickbutton(Vype_CommonXpath.btnAddToCART, "Add to cart ");
			rai.clickbutton(Vype_CommonXpath.btnonetimepurchase, "One time purchase ");
		}*/
		/*if(b1==false)
		{*/
			rai.SwipeDownSmallerUnits(4);
			//one time purchase
			//rai.clickbutton(Vype_CommonXpath.btnonetimepurchase, "One time purchase ");

			//rai.ScrollByxpath(Vype_CommonXpath.btnstrength);
			int flavorcount = Integer.parseInt(count);
			for(int i=0;i<flavorcount;i++)
			{
				rai.clickbutton(Vype_CommonXpath.btnstrength, "+ ");
			}


			rai.clickbutton(Vype_CommonXpath.btnAddToCART, "Add to cart ");
		//}

	}



	@Then("^click on go to delivary and verify shipping options$")
	public void click_on_go_to_delivary_and_verify_shipping_options() throws Throwable {
		// Click on 'Go to delivery' button
		rai.clickbutton(Vype_CheckOut.btnGoToDelivery, "Go to delivery");


		String str=rai.getText(Vype_CommonXpath.txtshippingoptions);
		rai.VerifyElementsVisible(Vype_CommonXpath.txtshippingoptions, str);

		List<WebElement> lst =rai.findElementsList(Vype_CommonXpath.shippingoptions);
		System.out.println("No of delivary options :"+lst.size());
		for(int i=0;i<lst.size();i++)
		{
			String s=lst.get(i).getText();
			System.out.println((i+1)+":"+s);
			rai.VerifyElementsVisible(Vype_CommonXpath.shippingoptions, s);
		}





	}









}
