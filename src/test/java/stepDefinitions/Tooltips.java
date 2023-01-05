package stepDefinitions;



import com.rai.framework.CommonFunctions;
import com.rai.framework.RAI_Desktop_Utility_Functions;

import cucumber.api.java.en.*;
import goVype_Properties.*;

public class Tooltips {


	RAI_Desktop_Utility_Functions gl = new RAI_Desktop_Utility_Functions();
	CommonFunctions function = new CommonFunctions(gl);

	@And("^user hover the account and verify the links present$")
	public void user_hover_the_account_and_verify_the_links_present() throws Throwable {
		//Hover the mouse on account logged in
		gl.HowerMouse(Vype_CommonXpath.btnAccount, "Post Login Vype Home");

		//view My Account link
		gl.VerifyObjectDisplayed(Vype_CommonXpath.lnkMyAccount, "My account");

		//view My Rewards link
		gl.VerifyObjectDisplayed(Vype_CommonXpath.lnkMyRewards, "My Rewards");

		//view My Savings link
		gl.VerifyObjectDisplayed(Vype_CommonXpath.lnkMySavings, "My Savings");

		//view My Orders link
		gl.VerifyObjectDisplayed(Vype_CommonXpath.lnkMyOrders, "My Orders");

		//view My Subscription link
		gl.VerifyObjectDisplayed(Vype_CommonXpath.lnkMySubscription, "My Subscription");

		//View logout link displayed
		gl.VerifyElementVisible(Vype_CommonXpath.lnkLogout, "Logout");
	}

	@When("^user hover the cart icon and click on view cart from the mini cart$")
	public void user_hover_the_cart_icon_and_click_on_view_cart_from_the_mini_cart() throws Throwable {
		

		//Hover on the Cart icon
		gl.HowerMouse(Vype_CommonXpath.lnkCartIcon, "Cart Icon");

		//Verify purchase message is displayed
		gl.VerifyObjectDisplayed(Vype_CommonXpath.txtPurchases, "Purchase");


		//Click on "View Cart" button from Tiny Cart modal
		gl.clickbutton(Vype_CommonXpath.btnViewCart, "View Cart button from Tiny Cart modal");


	    
	}

	@Then("^user navigates to checkout page to verify tooltips present there$")
	public void user_navigates_to_checkout_page_to_verify_tooltips_present_there() throws Throwable {
		
		gl.ScrollPageDown();
		gl.ScrollPageDown();

		//Click on 'Check Out' button from the Cart Page.
		gl.clickUsingJs(Vype_Cart.btnCheckOut, "Cart Page - Check Out");

		//Verify that Check Out Page is displayed
		gl.VerifyPageDisplayed(Vype_CheckOut.pgCheckOut, "Check Out");

		//Click on Home
		gl.clickElement(Vype_CommonXpath.weHomeAddress, "Home");

		gl.ScrollPageDown();
		gl.ScrollPageDown();

		gl.VerifyObjectDisplayed(Vype_CommonXpath.weQuestionMark, "(?) ");

		gl.HowerMouse(Vype_CommonXpath.weQuestionMark, "(?) ");

		String text = gl.getAttributeValue(Vype_CommonXpath.weQuestionMark, "data-tip");
		gl.VerifyElementVisible(Vype_CommonXpath.weQuestionMark,text);

		//Click on 'Go to delivery' button
		gl.clickUsingJs(Vype_CheckOut.btnGoToDelivery,"Go to delivery");

	    
	}


}
