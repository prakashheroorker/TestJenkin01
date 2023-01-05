package stepDefinitions_Mobile;


import com.rai.framework.CommonFunctions_Mobile;
import com.rai.framework.RAI_Mobile_Utility_Functions;

import cucumber.api.java.en.*;
import goVype_Properties_mobile.*;

public class accessories_discount {

	String couponCodeTxt =""; 
	int cnt=0; 
	boolean couponHit = false;


	RAI_Mobile_Utility_Functions rai = new RAI_Mobile_Utility_Functions();
	CommonFunctions_Mobile function = new CommonFunctions_Mobile(rai);
	
	
	@Then("^select \"([^\"]*)\" and click on buynow$")
	public void select_and_click_on_buynow(String Skin) throws Throwable {
		Thread.sleep(3000);
		rai.clickUsingJs(Vype_CommonXpath.skintype(Skin), "Skin selected is: " + Skin);

		Thread.sleep(3000);
		rai.SwipeDownSmallerUnits(2);
		String s=rai.getText(Vype_CommonXpath.txtskin);

		//rai.VerifyElementsVisible(Vype_CommonXpath.txtskin,"Skin");

		System.out.println(s+" is highlighted ");

		
		rai.clickUsingJs(Vype_accessories_discount.btnbuy," Buy now");
		
		rai.clickUsingJs(Vype_accessories_discount.btncart," cart");
		
			
	   
	}
	
	@Then("^click on go to delivary$")
	public void click_on_go_to_delivary() throws Throwable {

		// Click on 'Go to delivery' button
				rai.clickUsingJs(Vype_CheckOut.btnGoToDelivery, "Go to delivery");

				Thread.sleep(5000);

				rai.ScrollByxpath(Vype_CheckOut.txtdelivary);

		
	}
	
	@Then("^verify silver user status$")
	public void verify_silver_user_status() throws Throwable {
	   
		rai.VerifyElementVisible(Vype_accessories_discount.txtSilver1, "Silver status");
		
	}

	@Then("^Click on Add promotion dropdown and select discount on skin badge on Silver$")
	public void click_on_Add_promotion_dropdown_and_select_discount_on_skin_badge_on_Silver() throws Throwable {
	    
		/*rai.clickUsingJs(Vype_accessories_discount.btnpromotion," Add promotion");
		
		rai.ScrollByxpath(Vype_accessories_discount.btnredeem);
		
		//rai.clickUsingJs(Vype_accessories_discount.btnredeem," redeem");
*/		
        rai.ScrollByxpath(Vype_accessories_discount.txtbadgeS);
		
		rai.VerifyElementVisible(Vype_accessories_discount.txtbadgeS," 25% Discount on Skins");
		
		rai.clickUsingJs(Vype_accessories_discount.lnkbadgeS, " discount badge");
		
		
		Thread.sleep(5000);
		
        rai.ScrollByxpath(Vype_accessories_discount.pgcart);
        
		rai.VerifyElementsVisible(Vype_accessories_discount.pgcart, "cart details");
		
		
		
	}

	@Then("^verify the badge$")
	public void verify_the_badge() throws Throwable {
	  
       rai.ScrollByxpath(Vype_accessories_discount.pgperks);
		
		rai.VerifyElementVisible(Vype_accessories_discount.pgperks," badge is disable");
		
		
	}
	
//Gold
	
	
	@Then("^verify Gold user status$")
	public void verify_Gold_user_status() throws Throwable {
	   
		rai.VerifyElementVisible(Vype_accessories_discount.txtGold1, "Gold status");
		
	}

	@Then("^Click on Add promotion dropdown and select discount on skin badge on Gold$")
	public void click_on_Add_promotion_dropdown_and_select_discount_on_skin_badge_on_Gold() throws Throwable {
	    
		//rai.clickUsingJs(Vype_accessories_discount.btnpromotion," Add promotion");
		
		rai.ScrollByxpath(Vype_accessories_discount.btnredeem);
		
		rai.clickUsingJs(Vype_accessories_discount.btnredeem," redeem");
		
		Thread.sleep(3000);
        rai.ScrollByxpath(Vype_accessories_discount.txtbadgeG);
		
		rai.VerifyElementVisible(Vype_accessories_discount.txtbadgeG," 50% Discount on Skins");
		
		rai.clickUsingJs(Vype_accessories_discount.lnkbadgeG, " discount badge");
		
		
		Thread.sleep(5000);
		
        rai.ScrollByxpath(Vype_accessories_discount.pgcart);
        
		rai.VerifyElementsVisible(Vype_accessories_discount.pgcart, "cart details");
		
	}
	
	//platinum
	
	@Then("^verify platinum user status$")
	public void verify_platinum_user_status() throws Throwable {
	   
		rai.VerifyElementVisible(Vype_accessories_discount.txtPremium1, "platinum status");
		
	}

	@Then("^Click on Add promotion dropdown and select discount on skin badge on platinum$")
	public void click_on_Add_promotion_dropdown_and_select_discount_on_skin_badge_on_platinum() throws Throwable {
	    
		//rai.clickUsingJs(Vype_accessories_discount.btnpromotion," Add promotion");
		
		rai.ScrollByxpath(Vype_accessories_discount.btnredeem);
		
		rai.clickUsingJs(Vype_accessories_discount.btnredeem," redeem");
		
        rai.ScrollByxpath(Vype_accessories_discount.txtbadgeP);
		
		rai.VerifyElementVisible(Vype_accessories_discount.txtbadgeP," 75% Discount on Skins");
		
		rai.clickUsingJs(Vype_accessories_discount.lnkbadgeP, " discount badge");
		
		
		Thread.sleep(5000);
		
        rai.ScrollByxpath(Vype_accessories_discount.pgcart);
        
		rai.VerifyElementsVisible(Vype_accessories_discount.pgcart, "cart details");
		
	}
	
//Premium
	
	@Then("^verify Premium user status$")
	public void verify_Premium_user_status() throws Throwable {
	   
		rai.VerifyElementVisible(Vype_accessories_discount.txtPremium1, "Premium status");
		
	}

	@Then("^Click on Add promotion dropdown and select discount on skin badge on premium$")
	public void click_on_Add_promotion_dropdown_and_select_discount_on_skin_badge_on_premium() throws Throwable {
	    
		//rai.clickUsingJs(Vype_accessories_discount.btnpromotion," Add promotion");
		
		rai.ScrollByxpath(Vype_accessories_discount.btnredeem);
		
		rai.clickUsingJs(Vype_accessories_discount.btnredeem," redeem");
		
        rai.ScrollByxpath(Vype_accessories_discount.txtbadgeP);
		
		rai.VerifyElementVisible(Vype_accessories_discount.txtbadgeP," free skin");
		
		rai.clickUsingJs(Vype_accessories_discount.lnkbadgeP, " discount badge");
		
		
		Thread.sleep(5000);
		
        rai.ScrollByxpath(Vype_accessories_discount.pgcart);
        
		rai.VerifyElementsVisible(Vype_accessories_discount.pgcart, "cart details");
		
	}
	//Supreme
	
	@Then("^verify Supreme user status$")
	public void verify_Supreme_user_status() throws Throwable {
	   
		rai.VerifyElementVisible(Vype_accessories_discount.txtSupreme1, "Supreme status");
		
	}
	
	@Then("^Click on Add promotion dropdown and select discount on skin badge on supreme$")
	public void click_on_Add_promotion_dropdown_and_select_discount_on_skin_badge_on_supreme() throws Throwable {
	    
		//rai.clickUsingJs(Vype_accessories_discount.btnpromotion," Add promotion");
		
		rai.ScrollByxpath(Vype_accessories_discount.btnredeem);
		
		rai.clickUsingJs(Vype_accessories_discount.btnredeem," redeem");
		
        rai.ScrollByxpath(Vype_accessories_discount.txtbadgeP);
		
		rai.VerifyElementVisible(Vype_accessories_discount.txtbadgeP," free skin");
		
		rai.clickUsingJs(Vype_accessories_discount.lnkbadgeP, " discount badge");
		
		
		Thread.sleep(5000);
		
        rai.ScrollByxpath(Vype_accessories_discount.pgcart);
        
		rai.VerifyElementsVisible(Vype_accessories_discount.pgcart, "cart details");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}




