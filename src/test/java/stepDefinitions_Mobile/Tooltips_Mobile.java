package stepDefinitions_Mobile;


import com.rai.framework.CommonFunctions_Mobile;
import com.rai.framework.RAI_Mobile_Utility_Functions;

import cucumber.api.java.en.*;
import goVype_Properties_mobile.*;

public class Tooltips_Mobile {


	RAI_Mobile_Utility_Functions rai = new RAI_Mobile_Utility_Functions();
	CommonFunctions_Mobile function = new CommonFunctions_Mobile(rai);
	@Then("^user navigates to checkout page to verify tooltips present$")
	public void user_navigates_to_checkout_page_to_verify_tooltips_present() throws Throwable {


		rai.ScrollByxpath(Vype_Cart.btnCheckOut);

		Thread.sleep(10000);

		// Click on 'Check Out' button from the Cart Page.
		rai.clickUsingJs(Vype_Cart.btnCheckOut, "Cart Page - Check Out");

		// Verify that Check Out Page is displayed
		rai.VerifyElementsVisible(Vype_CheckOut.pgCheckOut, "Check Out");
		String PhoneNum = "9987786567";

		//click on home
		rai.clickUsingJs(Vype_CommonXpath.weHomeAddress, "Home");
		//swipe down to tooltips
		rai.ScrollByxpath(Vype_CommonXpath.weQuestionMark);
		//Verify the tooltips text

		rai.VerifyElementVisible(Vype_CommonXpath.weQuestionMark,"? ");

		//click on tooltips
		rai.clickUsingJs(Vype_CommonXpath.weQuestionMark, "? ");
		String str ="Add delivery details (such as buzzer code) to help us deliver your order. 35 characters max.";
		//gl.fnContentValidation(str,Vype_CommonXpath.Tooltipscontent);
		String datatip=rai.fnGetAttributeValue(Vype_CommonXpath.Tooltipscontent, "data-tip");

		//System.out.println(datatip);
		if(datatip==str)
		{
			System.out.println(datatip);
		}
		else
		{
			
			System.out.println(str);
		}


		//String t = l.getAttribute("data-tips");System.out.println("Retrieved tooltip text as :" +t);
		rai.VerifyElementVisible(Vype_CommonXpath.weQuestionMark2,"? ");
		//scroll to tooltip
		rai.ScrollByxpath(Vype_CommonXpath.weQuestionMark2);
		//click the tooltip
		rai.clickUsingJs(Vype_CommonXpath.weQuestionMark2, "(?) ");
		/*String text1 = gl.getAttributeValue(Vype_CommonXpath.weQuestionMark2, "data-tip");
		gl.VerifyElementVisible(Vype_CommonXpath.weQuestionMark2,text1);*/		
		String str2 =" We require this information to get in touch with you about your order or vype account. We will also use this information to follow-up on your purchase.";

		String datatip2=rai.fnGetAttributeValue(Vype_CommonXpath.Tooltipscontent, "data-tip");

		//System.out.println(datatip);
		if(datatip2==str2)
		{
			System.out.println(datatip2);
		}
		else
		{
			System.out.println(str2);
			//System.out.println("Not matching");
		}
		//swipedown to phone number
		rai.ScrollByxpath(Vype_CheckOut.txtPhonunum);
		//entering phnum
		rai.inputText(Vype_CheckOut.txtPhonunum, "Phone num", PhoneNum);
		String text2 = rai.fnGetAttributeValue(Vype_CommonXpath.weQuestionMark2, "data-tip");	
		rai.VerifyElementVisible(Vype_CommonXpath.weQuestionMark2,text2);
		//click on tooltips
		rai.clickUsingJs(Vype_CommonXpath.weQuestionMark2, "? ");


	}

}