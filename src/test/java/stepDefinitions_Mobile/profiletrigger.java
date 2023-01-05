package stepDefinitions_Mobile;

import com.rai.framework.CommonFunctions_Mobile;
import com.rai.framework.RAI_Mobile_Utility_Functions;

import cucumber.api.java.en.*;
import goVype_Properties_mobile.*;

public class profiletrigger {

	String SpendAmount = "";
	float i;
	String Amount;

	RAI_Mobile_Utility_Functions rai = new RAI_Mobile_Utility_Functions();
	CommonFunctions_Mobile function = new CommonFunctions_Mobile(rai);

	@And("^verify amount needs to be spend to be upgraded to gold status$")
	public void verify_amount_needs_to_be_spend_to_be_upgraded_to_gold_status() throws Throwable {

		// Other benefits
		rai.ScrollByxpath(Vype_PlatinumProfileTrigger.txtBenifits);
		rai.VerifyElementsVisible(Vype_PlatinumProfileTrigger.txtBenifits, "Your Other benefits ");

		SpendAmount = rai.getText(Vype_ePodStarterKit.txtspendamount);
		System.out.println(SpendAmount);
		Amount = SpendAmount.substring(7, 13);
		System.out.println(Amount);
		i = Float.parseFloat(Amount);
		System.out.println("Amount needs to spend is: " + i);
	}

	@Then("^user verifies status is upgraded and verifies status bar for gold status$")
	public void user_verifies_status_is_upgraded_and_verifies_status_bar_for_gold_status() throws Throwable {

		rai.ScrollByxpath(Vype_PlatinumProfileTrigger.txtBenifits);
		rai.VerifyElementsVisible(Vype_PlatinumProfileTrigger.txtBenifits, "Your Other benefits ");

		// verify bar progress
		String barProgressStatus = rai.fnGetAttributeValue(Vype_GoldProfileTrigger.barProgressStatus, "style");
		System.out.println(barProgressStatus);
		barProgressStatus = barProgressStatus.substring(7);
		barProgressStatus.trim();
		barProgressStatus = barProgressStatus.substring(0, barProgressStatus.length() - 2);
		Float progressBarValue = Float.parseFloat(barProgressStatus);
		System.out.println(barProgressStatus);

		if (progressBarValue >= 60.5) {
			rai.VerifyElementsVisible(Vype_GoldProfileTrigger.barProgressStatus, "Progress Bar Reached  Level");
		}

	}

	@Then("^verify you are almost banner and click on benefits$")
	public void verify_you_are_almost_banner_and_click_on_benefits() throws Throwable {

		rai.VerifyElementVisible(Vype_CommonXpath.txtVuse, "VUSE ");

		String text = rai.getText(Vype_CommonXpath.txtYouAreAlmost);
		rai.VerifyElementVisible(Vype_CommonXpath.txtYouAreAlmost, text);

		rai.VerifyElementVisible(Vype_CommonXpath.txtSeeHowYouWillBenefit, "See how you will benefit");

		// click on text see how you benefit
		rai.clickUsingJs(Vype_CommonXpath.txtSeeHowYouWillBenefit, "See how you will benefit");

		// verify text see how you benefit
		String str = rai.getText(Vype_CommonXpath.lnkSeeHowYouWillBenefit);
		rai.VerifyElementVisible(Vype_CommonXpath.lnkSeeHowYouWillBenefit, str);

		// click on close
		rai.clickUsingJs(Vype_CommonXpath.btnClose, "Click on X button ");

	}

	@Then("^click add quantity untill it reaches to desired quantity$")
	public void click_add_quantity_untill_it_reaches_to_desired_quantity() throws Throwable {

		// Get the total amount added
		String TotalAmount = rai.getText(Vype_Cart.weTxtTotal);
		float TotalAmountFlo = Float.parseFloat(TotalAmount.substring(1));
		float FinalFloatPriceValue = TotalAmountFlo;

		for (int n = 1; n > 0;) {
			if (FinalFloatPriceValue < i) {

				// Add quantity
				rai.clickbutton(Vype_Cart.btnAdd, "+");
				Thread.sleep(5000);
				String TotalAmount1 = rai.getText(Vype_Cart.weTxtTotal);
				FinalFloatPriceValue = Float.parseFloat(TotalAmount1.substring(1));
				n++;
			} else {
				System.out.println("No need to add more quantity");
				break;
			}

		}

		String products = rai.getText(Vype_CommonXpath.productdetails);
		System.out.println(products);

		rai.VerifyElementVisible(Vype_CommonXpath.productdetails, products);
	}

	@Then("^user clicks on hamberger menu and clicks on My orders and cancel the order$")
	public void user_clicks_on_hamberger_menu_and_clicks_on_My_orders_and_cancel_the_order() throws Throwable {

		// Clicking on Menu
		rai.clickLink(Vype_CommonXpath.btnmenu, "Menu");

		// click on my orders
		rai.clickbutton(Vype_CommonXpath.lnkMyOrders, "My orders ");

		// cancel order
		rai.clickUsingJs(Vype_CommonXpath.lnkcancelorder, "Cancel order");

		// yes cancel
		rai.clickUsingJs(Vype_CommonXpath.txtyescancel, "Yes cancel ");

		Thread.sleep(4000);

		// verify confirmation text
		/*String str = rai.getText(Vype_CommonXpath.txtcancelconfirmation);
		rai.VerifyElementVisible(Vype_CommonXpath.txtcancelconfirmation, str);*/

		// close
		//rai.clickUsingJs(Vype_CommonXpath.btncancelclose, "X ");
	}

	@And("^verify amount needs to be spend to be upgraded to silver status$")
	public void verify_amount_needs_to_be_spend_to_be_upgraded_to_silver_status() throws Throwable {

		// Other benefits
		rai.ScrollByxpath(Vype_PlatinumProfileTrigger.txtBenifits);
		rai.VerifyElementsVisible(Vype_PlatinumProfileTrigger.txtBenifits, "Your Other benefits ");

		SpendAmount = rai.getText(Vype_ePodStarterKit.txtspendamount);
		System.out.println(SpendAmount);
		Amount = SpendAmount.substring(7, 12);
		System.out.println(Amount);
		i = Float.parseFloat(Amount);
		System.out.println("Amount needs to spend is: " + i);

	}

	@And("^user verifies status is upgraded and verifies status bar for silver status$")
	public void user_verifies_status_is_upgraded_and_verifies_status_bar_for_silver_status() throws Throwable {

		rai.ScrollByxpath(Vype_PlatinumProfileTrigger.txtBenifits);
		rai.VerifyElementsVisible(Vype_PlatinumProfileTrigger.txtBenifits, "Your Other benefits ");

		// verify bar progress
		String barProgressStatus = rai.fnGetAttributeValue(Vype_GoldProfileTrigger.barProgressStatus, "style");
		System.out.println(barProgressStatus);
		barProgressStatus = barProgressStatus.substring(7);
		barProgressStatus.trim();
		barProgressStatus = barProgressStatus.substring(0, barProgressStatus.length() - 2);
		Float progressBarValue = Float.parseFloat(barProgressStatus);
		System.out.println(barProgressStatus);

		if (progressBarValue >= 23.5) {
			rai.VerifyElementsVisible(Vype_GoldProfileTrigger.barProgressStatus, "Progress Bar Reached silver Level");
		}
	}

	@When("^User clicks on Hamburger menu then Logout link$")
	public void User_clicks_on_Hamburger_menu_then_Logout_link() throws Throwable {

		rai.SwipeUpSmallerUnits(3);
		// rai.ScrolltoTopofthepage();
		Thread.sleep(2000);

		// Clicking on Menu and click on logout
		// rai.clickUsingJs(Vype_CommonXpath.btnmenu, "Menu ");

		// Clicking on Menu
		rai.Menubutton();
		
		//rai.ClickUsingOCR("Shop");
		rai.SwipeDownSmallerUnits(1);
		rai.ClickUsingOCR("Logout");

	}

	@Then("^User should be Logged out$")
	public void user_should_be_Logged_out() throws Throwable {

		// rai.clickUsingJs(Vype_CommonXpath.btnmenu, "Menu ");
		// Clicking on Menu
		rai.Menubutton();

		rai.VerifyElementsVisible(Vype_CommonXpath.lnkLoginOrRgstr, "Login/Register");

		// rai.clickUsingJs(Vype_CommonXpath.btnmenu, "Menu ");
		// Clicking on Menu
		rai.Menubutton();
		

	}

}
