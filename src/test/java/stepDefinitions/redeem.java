package stepDefinitions;


import com.rai.framework.BaseClass;
import com.rai.framework.CommonFunctions;
import com.rai.framework.RAI_Desktop_Utility_Functions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import goVype_Properties.Vype_CommonXpath;
import goVype_Properties.Vype_Redeem;
import goVype_Properties.Vype_VuseRewards_firsttimePurchase;

public class redeem extends BaseClass{
	
	RAI_Desktop_Utility_Functions gl = new RAI_Desktop_Utility_Functions();
	CommonFunctions function = new CommonFunctions(gl);
	
	String points="",pointsNum="",DisPrice="",SubTotal,TotalAmount,TaxAmount;
	float MaxPoints,Price,SubTotalPrice,Discount,OTPTotal,i,MultipackDis;
	
	@Then("^choose Flavour \"([^\"]*)\" and quantity \"([^\"]*)\" in Pod Pods Page$")
	public void choose_Flavour_and_quantity_in_Pod_Pods_Page(String Flavor, int Quentity) throws Throwable {
		gl.fnScrollToView(Vype_Redeem.webAllFlavorsePodPage(Flavor));

		Thread.sleep(3000);

		for(int i=0; i < (Quentity-1); i++)
		gl.clickUsingJs(Vype_Redeem.btnqtyincrement(Flavor), "Increment Quantity");
		Thread.sleep(1000);

		//Add to the cart
		gl.clickbutton(Vype_Redeem.btnadd(Flavor), "Add ");

		Thread.sleep(3000);
	}

	@Then("^Navigate to cart page and Verify the cart page$")
	public void navigate_to_cart_page_and_Verify_the_cart_page() throws Throwable {
		function.hoverCartAndClickViewCart();
		
		Thread.sleep(3000);
		
		gl.VerifyElementPresent(Vype_Redeem.Products, "products in cart");
	}

	@When("^Click on Promotion Drop down in Cart summary page$")
	public void click_on_Promotion_Drop_down_in_Cart_summary_page() throws Throwable {
		gl.clickUsingJs(Vype_Redeem.PromotionDropdown, "Promotion Dropdown");
	}

	@Then("^Verify the Rewards points$")
	public void verify_the_Rewards_points() throws Throwable {
		Thread.sleep(2000);
		gl.VerifyElementPresent(Vype_Redeem.lnkRedeem,"Redeem button");
		Thread.sleep(3000);
	}

	@When("^Click on the REDEEM button and Redeem the points\"([^\"]*)\"$")
	public void click_on_the_REDEEM_button_and_Redeem_the_points(String points) throws Throwable {
		Thread.sleep(2000);
		gl.clickUsingJs(Vype_Redeem.lnkRedeem,"Redeem nutton");
		
		gl.ClearText(Vype_Redeem.Points, "clearing Points");
		Thread.sleep(1000);
		gl.inputText(Vype_Redeem.Points, "Points", points);
		
		//Points to be redeem
		i = Float.parseFloat(points);
		i = i/200;
		Thread.sleep(2000);
		gl.clickUsingJs(Vype_Redeem.Redeembtn,"Redeem nutton");
		
		System.out.println("Redeemed Discount : "+i);
	}

	

	@When("^Click on  CHECKOUT button$")
	public void click_on_CHECKOUT_button() throws Throwable {
		Thread.sleep(2000);
	    gl.clickUsingJs(Vype_Redeem.btnCheckOut, "Checkout");
	}

	@When("^Hower on the Profile icon and click on My Rewards$")
	public void hower_on_the_Profile_icon_and_click_on_My_Rewards() throws Throwable {
		gl.HowerMouse(Vype_Redeem.btnAccount, "Post Login Vype Home");
		
		gl.clickbuttonUsingSelenium(Vype_Redeem.MyRewards, "Post Login Vype Home");
		Thread.sleep(2000);
	}
	

	@Then("^Scroll down to Your History and Verify the Reward Redemption points are deducted$")
	public void scroll_down_to_Your_History_and_Verify_the_Reward_Redemption_points_are_deducted() throws Throwable {
	    gl.fnScrollToView(Vype_Redeem.History);
	    
	    gl.VerifyElementVisible(Vype_Redeem.RewardsRedemption, "RewardsRedemption");
	}
	
	@When("^Verify the worning message desplayed when redeem grater than fifty thousand points\"([^\"]*)\"$")
	public void verify_the_worning_message_desplayed_when_redeem_grater_than_fifty_thousand_points(String points) throws Throwable {
		Thread.sleep(2000);
		gl.clickUsingJs(Vype_Redeem.lnkRedeem,"Redeem nutton");
		
		gl.ClearText(Vype_Redeem.Points, "clearing Points");
		Thread.sleep(1000);
		gl.inputText(Vype_Redeem.Points, "Points", points);
		
		Thread.sleep(1000);
		gl.VerifyElementVisible(Vype_Redeem.WorngMsg, "Worng Message");
	}
	
	//Updated - Bhavitha
	float RPoints,FindDis;
	String pnt;
	@When("^Redeem the points to get discount\"([^\"]*)\"$")
	public void redeem_the_points_to_get_discount(int Points) throws Throwable {
		gl.ClearText(Vype_Redeem.Points, "clearing Points");
		
		for(int i=200; i<=Points+200;) {
			gl.clickbutton(Vype_Redeem.incrementbttn,"increase the points");
			System.out.println("Print the points to redeem: "+i);
			i = i + 200;
			
		}
		
		gl.clickbutton(Vype_Redeem.decrementbttn,"Decrease the points");
		
		gl.VerifyElementPresent(Vype_Redeem.Points, "Points to redeem");
		
		
		RPoints = Points/200;
		
		System.out.println("Discount caluculation through points: "+RPoints);
		
	}

	@Then("^Verify the Cart page is updated with the redeemed points$")
	public void verify_the_Cart_page_is_updated_with_the_redeemed_points() throws Throwable {
		
		gl.clickUsingJs(Vype_Redeem.lnkRedeem,"Redeem button");

		//Discoun is Added
		DisPrice = gl.getText(Vype_Redeem.DiscountPrice);
		DisPrice = DisPrice.substring(2);
		Price = Float.parseFloat(DisPrice);
		
		if(RPoints==Price)
		{
			System.out.println("Discount Price getting correct : $" +Price);
			 reportiumClient.reportiumAssert("Discount from checkout and Calculated discount both are same", true);
		}
		else {
			reportiumClient.reportiumAssert("Discount from checkout and Calculated discount both are same", false);
		}
		
		
		//SubTotal Amount
		SubTotal = gl.getText(Vype_Redeem.SubTotal);
		SubTotal = SubTotal.substring(1);
		SubTotalPrice = Float.parseFloat(SubTotal);
		
		
		if(gl.VerifyElementPresent(Vype_Redeem.ExciseTax, "Excise Tax")) {
			
			TaxAmount = gl.getText(Vype_Redeem.ExciseTaxAmount);
			TaxAmount = TaxAmount.substring(1);
			Discount = SubTotalPrice + Float.parseFloat(TaxAmount) - RPoints;
			
		}
		else {
		
		//Total Cart Price
		TotalAmount = gl.getText(Vype_Redeem.TotalAmount);
		TotalAmount = TotalAmount.substring(1);
		OTPTotal = Float.parseFloat(TotalAmount);
		
		Discount = SubTotalPrice - RPoints;
		
		}
		System.out.println("Discount price calculation : $" +Discount);
		
		
	}
	
	@When("^Click on view cart button$")
	public void click_on_view_cart_button() throws Throwable {
		function.hoverCartAndClickViewCart();
	}
	
	@When("^Redeem the points upto max points to get discount\"([^\"]*)\"$")
	public void redeem_the_points_upto_max_points_to_get_discount(String points) throws Throwable {
		gl.ClearText(Vype_Redeem.Points, "clearing Points");
		
		Thread.sleep(1000);
		gl.inputText(Vype_Redeem.Points, "Points", points);
		
		//Points to be redeem
		MaxPoints = Float.parseFloat(points);
		MaxPoints = MaxPoints/200;
		Thread.sleep(2000);
		gl.clickUsingJs(Vype_Redeem.lnkRedeem,"Redeem button");
	}

	@Then("^Verify the Cart page is updated with the Max redeemed points$")
	public void verify_the_Cart_page_is_updated_with_the_Max_redeemed_points() throws Throwable {
		//Discoun is Added
				DisPrice = gl.getText(Vype_Redeem.DiscountPrice);
				DisPrice = DisPrice.substring(2);
				Price = Float.parseFloat(DisPrice);
				
				if(MaxPoints==Price)
				{
					System.out.println("Discount Price getting correct : $" +Price);
					 reportiumClient.reportiumAssert("Discount from checkout and Calculated discount both are same", true);
				}
				else {
					reportiumClient.reportiumAssert("Discount from checkout and Calculated discount both are same", false);
				}
				//SubTotal Amount
				SubTotal = gl.getText(Vype_Redeem.SubTotal);
				SubTotal = SubTotal.substring(1);
				SubTotalPrice = Float.parseFloat(SubTotal);
				
				
				if(gl.VerifyElementPresent(Vype_Redeem.ExciseTax, "Excise Tax")) {
					
					TaxAmount = gl.getText(Vype_Redeem.ExciseTaxAmount);
					TaxAmount = TaxAmount.substring(1);
					Discount = SubTotalPrice + Float.parseFloat(TaxAmount);
					
					System.out.println("Total price before Multipack Discount: $" +Discount);	 
				}
				
				
				String MultiDis = gl.getText(Vype_Redeem.MultipackDiscount);
				MultiDis = MultiDis.substring(2);
				MultipackDis = Float.parseFloat(MultiDis);
				Discount = Discount - MultipackDis;
				System.out.println("Multipack Discount price calculation : $" +Discount);
				
	}
	
	@When("^Redeem the \"([^\"]*)\"$")
	public void redeem_the(String GratesPoints) throws Throwable {
		gl.ClearText(Vype_Redeem.Points, "clearing Points");
		
		Thread.sleep(1000);
		gl.inputText(Vype_Redeem.Points, "Points", GratesPoints);
	}

	@Then("^Verify the warning message for grater points$")
	public void verify_the_warning_message_for_grater_points() throws Throwable {
	    gl.VerifyElementPresent(Vype_Redeem.WarningMesg,"Warning message");
	}
	
	@Then("^Verify Congratulations pop up will get and close it$")
	public void verify_Congratulations_pop_up_will_get_and_close_it() throws Throwable {
		
		gl.VerifyElementPresent(Vype_Redeem.CongratesPopUp, "Congratulations Pop up");
		
		gl.clickbutton(Vype_Redeem.NoThanks,"No Thanks pop-up");
	}
	
	@Then("^Verify points got redeemed$")
	public void verify_points_got_redeemed() throws Throwable {
	    gl.VerifyElementPresent(Vype_Redeem.RedeemedPoints, "Redeemed points");
	    
	    gl.VerifyElementPresent(Vype_Redeem.PurchasePoints, "Points got for the Purchase");
	}
	
	
}
