package stepDefinitions;


import com.rai.framework.*;

import cucumber.api.java.en.*;
import goVype_Properties.*;


public class Accessories_discount {

	RAI_Desktop_Utility_Functions gl = new RAI_Desktop_Utility_Functions();
	CommonFunctions function = new CommonFunctions(gl);
	
	
	
	
	@When("^Click Rewards Page Is and verify silver user status$")
	public void click_Rewards_Page_Is_and_verify_silver_user_status() throws Throwable {
		gl.HowerMouse(Vype_Common.btnProfile, "profile Icon");
		gl.clickbutton(Vype_Common.btnAccount, "My account");
		gl.clickLink(Vype_PlatinumProfileTrigger.pgRewards, "Rewards Page");
		Thread.sleep(3000);
		gl.VerifyElementVisible(Vype_NewRewards.txtSilver1, "Silver status");
	    
	}

	@When("^Hower on shop and click on All_ePod and click on skins$")
	public void hower_on_shop_and_click_on_All_ePod_and_click_on_skins() throws Throwable {
		Thread.sleep(4000);
		// Hover the mouse on Products link
		gl.HowerMouse(Vype_CommonXpath.lnkShop, "Shop link from the main menu navigation");

		Thread.sleep(3000);

		// Verify the Submenu ePod is loaded
		gl.VerifyElementVisible(Vype_NewRewards.lnkAllepod, "all ePods");

		// Click on Pods link under the ePod section
		gl.clickUsingJs(Vype_NewRewards.lnkAllepod, " all ePods");

		Thread.sleep(2000);
		gl.fnScrollToView(Vype_NewRewards.pgepodPods);
		
		gl.VerifyElementVisible(Vype_NewRewards.pgepodPods,"epod2 page");

		// Verify that ePod's pods page is displayed.
		gl.clickUsingJs(Vype_NewRewards.btnepod2," ePod selection");
		
		
		gl.fnScrollToView(Vype_NewRewards.lnkskins);
		
		
		gl.clickUsingJs(Vype_NewRewards.lnkskins," Vuse x U Skins");
		
		Thread.sleep(10000);
			
    }

	@Then("^select \"([^\"]*)\" and click on buy now$")
	public void select_and_click_on_buy_now(String Skin) throws Throwable {
		
		Thread.sleep(10000);
		
		gl.clickbuttonUsingSelenium(Vype_CommonXpath.skintype(Skin), "Skin selected is: " + Skin);
		Thread.sleep(5000);
		
		String s=gl.getText(Vype_CommonXpath.txtskin);

		gl.VerifyObjectDisplayed(Vype_CommonXpath.txtskin,"Skin");

		System.out.println(s+" is highlighted ");

		
		gl.clickUsingJs(Vype_NewRewards.btnbuy," Buy now");
		
		gl.clickUsingJs(Vype_NewRewards.btncart," cart");
		
			
	   
	}

	/*@Then("^Navigate to Cart and verify the items in Cart$")
	public void navigate_to_Cart_and_verify_the_items_in_Cart() throws Throwable {
		
		gl.clickUsingJs(Vype_NewRewards.lnkcart," view cart");
		
		gl.VerifyElementVisible(Vype_NewRewards.pgcart," cart page");
		
		Thread.sleep(2000); 
	}
*/
	@Then("^Click on Add promotion dropdown and select discount on skin badge on silver$")
	public void click_on_Add_promotion_dropdown_and_select_discount_on_skin_badge_on_silver() throws Throwable {
	 
		gl.clickUsingJs(Vype_NewRewards.btnpromotion," Add promotion");
		
		gl.clickUsingJs(Vype_NewRewards.btnredeem," redeem");
		
		gl.fnScrollToView(Vype_NewRewards.txtbadgeS);
		
		gl.VerifyElementVisible(Vype_NewRewards.txtbadgeS," 25% Discount on Skins");
		
		gl.clickUsingJs(Vype_NewRewards.lnkbadgeS, " discount badge");
		
		
		Thread.sleep(5000);
		
	}

	@Then("^Verify the cart summary and click on checkout$")
	public void verify_the_cart_summary_and_click_on_checkout() throws Throwable {
		
		gl.VerifyElementVisible(Vype_NewRewards.txtdiscount," Discount on Skins");
		
		gl.fnScrollToView(Vype_NewRewards.btncheckout);
		
		gl.clickUsingJs(Vype_NewRewards.btncheckout, " checkout");
		
		Thread.sleep(2000);
		
		//gl.VerifyElementVisible(Vype_NewRewards.btncheckout," checkout page");
		
		
	    
	}

	@Then("^Click on go to delivary and verify shipping options$")
	public void click_on_go_to_delivary_and_verify_shipping_options() throws Throwable {
	   
		gl.clickUsingJs(Vype_NewRewards.pgcheckout, " checkout pagr");
		
		gl.fnScrollToView(Vype_NewRewards.lnkdelivery);
		
		gl.clickUsingJs(Vype_NewRewards.lnkdelivery, " Go to delivery");
		
		gl.fnScrollToView(Vype_NewRewards.lnkbill);
		
		//gl.clickUsingJs(Vype_NewRewards.lnkbill, " Go to billing");
		
		
	}
		
		
	@Then("^verify the badge$")
	public void verify_the_badge() throws Throwable {
		
		gl.fnScrollToView(Vype_NewRewards.pgperks);
		
		gl.VerifyElementVisible(Vype_NewRewards.pgperks," badge is disable");
		
		
	}

		//golduser
		@When("^Click Rewards Page Is and verify Gold user status$")
		public void click_Rewards_Page_Is_and_verify_Gold_user_status() throws Throwable {
		
			gl.HowerMouse(Vype_Common.btnProfile, "profile Icon");
			gl.clickbutton(Vype_Common.btnAccount, "My account");
			gl.clickLink(Vype_PlatinumProfileTrigger.pgRewards, "Rewards Page");
			Thread.sleep(3000);
			gl.VerifyElementVisible(Vype_NewRewards.txtGold1, "Gold status");
		
	}

		@Then("^Click on Add promotion dropdown and select discount on skin badge on Gold$")
		public void click_on_Add_promotion_dropdown_and_select_discount_on_skin_badge_on_Gold() throws Throwable {
		 
			gl.clickUsingJs(Vype_NewRewards.btnpromotion," Add promotion");
			
			gl.clickUsingJs(Vype_NewRewards.btnredeem," redeem");
			
			gl.VerifyElementVisible(Vype_NewRewards.txtbadgeG," 50% Discount on Skins");
			
			gl.clickUsingJs(Vype_NewRewards.lnkbadgeG, " discount badge");
			
			Thread.sleep(2000);
			
		}
	
	
	
	//platinum
		
		@When("^Click Rewards Page Is and verify platinum user status$")
		public void click_Rewards_Page_Is_and_verify_platinum_user_status() throws Throwable {
		   
			gl.HowerMouse(Vype_Common.btnProfile, "profile Icon");
			gl.clickbutton(Vype_Common.btnAccount, "My account");
			gl.clickLink(Vype_PlatinumProfileTrigger.pgRewards, "Rewards Page");
			Thread.sleep(3000);
			gl.VerifyElementVisible(Vype_NewRewards.txtplatinum1, "platinum status");
			
		}

		@Then("^Click on Add promotion dropdown and select discount on skin badge on platinum$")
		public void click_on_Add_promotion_dropdown_and_select_discount_on_skin_badge_on_platinum() throws Throwable {
		   
			
            gl.clickUsingJs(Vype_NewRewards.btnpromotion," Add promotion");
			
			gl.clickUsingJs(Vype_NewRewards.btnredeem," redeem");
			
			gl.VerifyElementVisible(Vype_NewRewards.txtbadgeP," 75% Discount on Skins");
			
			gl.clickUsingJs(Vype_NewRewards.lnkbadgeP, " discount badge");
			
			Thread.sleep(2000);
			
		}

		//Premium
		
				@When("^Click Rewards Page Is and verify Premium user status$")
				public void click_Rewards_Page_Is_and_verify_Premium_user_status() throws Throwable {
				   
					gl.HowerMouse(Vype_Common.btnProfile, "profile Icon");
					gl.clickbutton(Vype_Common.btnAccount, "My account");
					gl.clickLink(Vype_PlatinumProfileTrigger.pgRewards, "Rewards Page");
					Thread.sleep(3000);
					gl.VerifyElementVisible(Vype_NewRewards.txtPremium1, "Premium status");
					
				}

				@Then("^Click on Add promotion dropdown and select discount on skin badge on Premium$")
				public void click_on_Add_promotion_dropdown_and_select_discount_on_skin_badge_on_Premium() throws Throwable {
				   
					
		            gl.clickUsingJs(Vype_NewRewards.btnpromotion," Add promotion");
					
					gl.clickUsingJs(Vype_NewRewards.btnredeem," redeem");
					
					gl.VerifyElementVisible(Vype_NewRewards.txtbadgeP," Free Skins");
					
					gl.clickUsingJs(Vype_NewRewards.lnkbadgeP, " discount badge");
					
					Thread.sleep(2000);
					
				}	
	
	//Supreme
	
				@When("^Click Rewards Page Is and verify Supreme user status$")
				public void click_Rewards_Page_Is_and_verify_Supreme_user_status() throws Throwable {
				   
					gl.HowerMouse(Vype_Common.btnProfile, "profile Icon");
					gl.clickbutton(Vype_Common.btnAccount, "My account");
					gl.clickLink(Vype_PlatinumProfileTrigger.pgRewards, "Rewards Page");
					Thread.sleep(3000);
					gl.VerifyElementVisible(Vype_NewRewards.txtSupreme1, "Supreme status");
					
				}

				@Then("^Click on Add promotion dropdown and select discount on skin badge on Supreme$")
				public void click_on_Add_promotion_dropdown_and_select_discount_on_skin_badge_on_Supreme() throws Throwable {
				   
					
		            gl.clickUsingJs(Vype_NewRewards.btnpromotion," Add promotion");
					
					gl.clickUsingJs(Vype_NewRewards.btnredeem," redeem");
					
					gl.VerifyElementVisible(Vype_NewRewards.txtbadgeP," Free Skins");
					
					gl.clickUsingJs(Vype_NewRewards.lnkbadgeP, " discount badge");
					
					Thread.sleep(2000);
					
				}	
	
	
	
	
	
}