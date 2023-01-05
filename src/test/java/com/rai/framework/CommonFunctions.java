package com.rai.framework;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import goVype_Properties.*;




public class CommonFunctions extends BaseClass {

	//public GenericLib gl;

	RAI_Desktop_Utility_Functions gl;
	
	

	public CommonFunctions(RAI_Desktop_Utility_Functions obj) {
		this.gl = obj;
	}

	public CommonFunctions(){

	}


	String OrderValue = "";

	// Author: Divya Kumari
	// Date: 28/07/2020
	// Launch application,select province and Age certify
	public void launchApplication() throws Exception {

		try {
			
				
	
			gl.launchApplication(Constants.QA_URL);
			
			
			/*Comment below 4 lines of codes once the certificate issue is resolved*/
			/*
			 * rdriver.findElement(By.xpath("(//*[contains(text(),'Advanced')])[1]")).click(
			 * );; Thread.sleep(2000); rdriver.findElement(By.id("proceed-link")).click();
			 * Thread.sleep(5000);
			 */
			gl.clickbutton(Vype_CommonXpath.AcceptAllCookies, "Cookies");
			gl.waitTillElementVisible(Vype_CommonXpath.weAgeCertify);

			// Verify that Age Certify Page is displayed.
			//gl.VerifyElementVisible(Vype_CommonXpath.weAgeCertify, "Age Certify");

			/*
			 * driver.findElement(By.xpath("(//*[@name='province'])[2]")).click(
			 * ); driver.findElement(By.xpath(
			 * "//option[contains(text(),'Ontario')]")).click();
			 */
			// Select "Ontario" from the drop down
			gl.SelectByOption(Vype_CommonXpath.weDropDownProvince, "Ontario");
			// Click on "I am 19 or over" button
			gl.clickUsingJs(Vype_CommonXpath.btnIam19orOver, " Iam 19 or Over");
			// Verify that Pre-Login home page displayed
			gl.VerifyElementVisible(Vype_CommonXpath.btnLoginorRegister, "Pre Login Home");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	// Author: Harsha Kumar
	// Date: 23/02/2022
	// Go to your account from home page
	public void navigatetoOrderspage() throws Exception
	{
	// Hover the mouse on account logged in
	Thread.sleep(5000);
	
	gl.ScrolltoTopofthepage();
	Thread.sleep(5000);
	gl.clickUsingJs(Vype_CommonXpath.btnAccount, "Post Login Vype Home");
	Thread.sleep(2000);




	gl.clickUsingJs(Vype_ClickandCollect.txtorder, "Order");




	}
	
	// -----------------------------------------------------------------------------------------------------------
	// Author: Divya Kumari
	// Date: 28/07/2020
	// Login application using valid credentials
	public void loginApplication(String UN, String pwd) {

		try {

			// Enter User name in the user name text field
            gl.inputText(Vype_CommonXpath.txtUsername, "Username textfield on Login Modal", UN);



           // Enter Password in the password text field
            gl.inputTextjavaScripfnPasswordencryption(rdriver,Vype_CommonXpath.txtPassword,  pwd);



           // Click on Login button
            gl.clickbutton(Vype_CommonXpath.btnLogin, "Login button");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// -----------------------------------------------------------------------------------------------------------
	// Author: Divya Kumari
	// Date: 29/07/2020
	// Go to your account from home page
	public void navigateToMyAccountFromHome() throws Exception {
		try {
			// Hover the mouse on account logged in
			gl.HowerMouse(Vype_CommonXpath.btnAccount, "Post Login Vype Home");

			// Click on my account.
			gl.clickbutton(Vype_Subscription.textMyAccount, "My account");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void addpodsflavor1(String flavor) throws Exception {
	    // TODO Auto-generated method stub

	     //scroll to flavor
	     gl.fnScrollToView(Vype_CommonXpath.lnkflavour(flavor));

	 

	     //adding flavor
	     gl.clickUsingJs(Vype_CommonXpath.lnkflavour(flavor), flavor );

	 

	     //verifying the flavor
	     //gl.VerifyElementPresent(Vype_CommonXpath.btnAddflavor(flavor), flavor);

	 

	     //adding flavor
	     //gl.clickUsingJs(Vype_CommonXpath.btnAddflavor(flavor), flavor );
	}
	// -----------------------------------------------------------------------------------------------------------
	// Author: Divya Kumari
	// Date: 29/07/2020
	// Navigate to ePen Pods from any page
	public void navigateToePenPods() throws Exception {
		try {
			// Hover the mouse on Products link
			gl.HowerMouse(Vype_CommonXpath.lnkShop, "Shop link from the main menu navigation");

			// Verify the Submenu with ePen3 and ePod is loaded
			gl.VerifyObjectDisplayed(Vype_CommonXpath.txtepen3Catridges, "ePen Catridges ");

			// Click on cartridges link under epen3 section
			gl.clickLink(Vype_CommonXpath.lnkCartridgesEpen3, "ePen Pods ");

			Thread.sleep(5000);
			gl.VerifyPageDisplayedUsingPagetitle("Vuse ePen pods");
			// String data= "ePen Pods";
			// gl.ElementShouldContainText(Vype_CommonXpath.weTxtePenPods, "epen
			// pods", data);

			// Verify that Vype ePen 3 Cartridges page is displayed
			// gl.VerifyPageDisplayed(Vype_CommonXpath.weTxtePenPods, "ePen
			// Pods");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// -----------------------------------------------------------------------------------------------------------
	// Author: Divya Kumari
	// Date: 29/07/2020
	// Navigate to ePen Device from any page
	public void navigateToePenDevice() throws Exception {
		try {
			// Hover the mouse on Products link
			gl.HowerMouse(Vype_CommonXpath.lnkProducts, "Products link from the main menu navigation");

			// Verify the Submenu with ePen3 and ePod is loaded
			gl.VerifyObjectDisplayed(Vype_CommonXpath.txtePenePod, "ePen ePod ");

			// Click on starter kit(device) under ePen3
			gl.clickbutton(Vype_CommonXpath.lnkDevice, "StarterKit from the Epen3 section");

			// Verify user is redirected to ePen device page
			gl.VerifyObjectDisplayed(Vype_CommonXpath.txtePenDeviceKit, "ePen Device Kits");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// -----------------------------------------------------------------------------------------------------------
	// Author: Divya Kumari
	// Date: 29/07/2020
	// Navigate to ePod Device
	public void navigateToePodDevice() throws Exception {
		try {

			Thread.sleep(4000);
			// Hover the mouse on Products link
			gl.HowerMouse(Vype_CommonXpath.lnkShop, "Shop link from the main menu navigation");

			// gl.clickLink(Vype_CommonXpath.lnkShop, "Shop link from the main
			// menu navigation");

			// Verify the Submenu with ePod is loaded
			gl.VerifyObjectDisplayed(Vype_CommonXpath.txtepod, "ePod page  ");
			
			Thread.sleep(5000);

			// Click on device link under the ePod section
			gl.clickUsingJs(Vype_CommonXpath.lnkDevices, "device");
			
			

			
			Thread.sleep(5000);
			
			//verify title
		
			String str1="ePod 2 | Vuse CA";
			String str2=rdriver.getTitle();
			Assert.assertEquals(str1,str2);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// -----------------------------------------------------------------------------------------------------------
	// Author: Divya Kumari
	// Date: 29/07/2020
	// Navigate to ePod Pods
	public void navigateToePodPods() throws Exception {
		try {

			Thread.sleep(4000);
			// Hover the mouse on Products link
			gl.HowerMouse(Vype_CommonXpath.lnkShop, "Shop link from the main menu navigation");

			Thread.sleep(3000);

			// Verify the Submenu ePod is loaded
			gl.VerifyElementVisible(Vype_CommonXpath.lnkEpodPods, "ePods");

			// Click on Pods link under the ePod section
			gl.clickUsingJs(Vype_CommonXpath.lnkEpodPods, "Pods from the Epod section");

			Thread.sleep(2000);

			gl.waitTillElementVisible(Vype_CommonXpath.pgEpodPods);

			// Verify that ePod's pods page is displayed.
			gl.VerifyElementVisible(Vype_CommonXpath.pgEpodPods, "ePod Pods");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// -----------------------------------------------------------------------------------------------------------

	// Author: Lakshmi S
	// Date: 02/04/2020
	// Navigate to ePod Pods
	public void navigateToeProgramSubscribeandsave() throws Exception {
		try {
			// Hover the mouse on Products link
			gl.HowerMouse(Vype_CommonXpath.lnkSave, "Shop link from the main menu navigation");

			// Verify the Submenu Programs is loaded
			gl.VerifyObjectDisplayed(Vype_CommonXpath.lnkPrograms, "Programs ");

			// Click on Subscribe and Save link under Programs section
			gl.clickbutton(Vype_CommonXpath.lnkSubscribeandsave, "Subscribe and Save under Programs");

			// Verify Subscribe and Save page is displayed.
			gl.VerifyPageDisplayed(Vype_CommonXpath.pgSubscribeandsave, "Subscribe and Save");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// -----------------------------------------------------------------------------------------------------------

	// Author: Divya Kumari
	// Date: 29/07/2020
	// All footer link including social media link and condition of sale till
	// cookie policy
	public void VerifyAllFooterLinks() throws Exception {
		try {
			// Verify Instagram text is displayed
			gl.VerifyObjectDisplayed(Vype_CommonXpath.lnkLogin, "Instagram text ");

			// Verify Facebook text is displayed
			gl.VerifyObjectDisplayed(Vype_CommonXpath.lnkFacebook, "Facebook text ");

			// Verify Twitter text is displayed
			gl.VerifyObjectDisplayed(Vype_CommonXpath.lnkTwitter, "Twitter text ");

			// Verify Youtube text is displayed
			gl.VerifyObjectDisplayed(Vype_CommonXpath.lnkYoutube, "Youtube text ");

			// Verify Contact Us text is displayed
			gl.VerifyObjectDisplayed(Vype_CommonXpath.lnkContactUs, "Contact Us text ");

			// Verify FAQs text is displayed
			gl.VerifyObjectDisplayed(Vype_CommonXpath.lnkFaqs, "FAQs text ");

			gl.VerifyObjectDisplayed(Vype_CommonXpath.lnkStoreLocator, "Store Locator Text ");

			gl.ScrollPageDown();

			// Verify Condition of Sale text is displayed
			gl.VerifyObjectDisplayed(Vype_CommonXpath.lnkConditionofSale, "Condition of Sale text ");

			// Verify Privacy Policy text is displayed
			gl.VerifyObjectDisplayed(Vype_CommonXpath.lnkPrivacyPolicy, "Privacy Policy text ");

			// Verify Terms and conditions text is displayed
			gl.VerifyObjectDisplayed(Vype_CommonXpath.lnkTermsandConditions, "Terms and conditions text ");

			// Verify Cookie Policy text is displayed
			gl.VerifyObjectDisplayed(Vype_CommonXpath.lnkCookiePolicy, "Cookie Policy text ");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// -----------------------------------------------------------------------------------------------------------
	// Author: Divya Kumari
	// Date: 29/07/2020
	// click on each footer link and verify the page navigation
	public void clickOnAllFooterLinks() throws Exception {
		try {
			// Click on Instagram text
			gl.clickLink(Vype_CommonXpath.lnkLogin, "Instagram ");

			gl.fnSwitchToSucceedingTab();

			// Verify Instagram page is displayed
			//gl.VerifyPageDisplayed(Vype_CommonXpath.txtInstagram, "Instagram ");

			gl.fnCloseCurrentTab();
			gl.fnSwitchToDefaultTab();

			// Click on Facebook text
			gl.clickLink(Vype_CommonXpath.lnkFacebook, "Facebook text ");

			gl.fnSwitchToSucceedingTab();

			// Verify Facebook page is displayed
			gl.VerifyElementVisible(Vype_CommonXpath.txtFacebook, "Facebook ");

			gl.fnCloseCurrentTab();
			gl.fnSwitchToDefaultTab();

			// Click on Twitter text
			gl.clickLink(Vype_CommonXpath.lnkTwitter, "Twitter text ");

			gl.fnSwitchToSucceedingTab();

			// Verify twitter page is displayed
			gl.VerifyElementVisible(Vype_CommonXpath.txtTwitter, "Twitter ");

			gl.fnCloseCurrentTab();
			gl.fnSwitchToDefaultTab();

			// Click on Youtube text
			gl.clickLink(Vype_CommonXpath.lnkYoutube, "Youtube text ");

			gl.fnSwitchToSucceedingTab();

			// Verify you tube page is displayed
			gl.VerifyElementVisible(Vype_CommonXpath.txtYoutube, "Youtube ");

			gl.fnCloseCurrentTab();
			gl.fnSwitchToDefaultTab();

			// Click on Contact Us text
			gl.clickLink(Vype_CommonXpath.lnkContactUs, "Contact Us text ");

			/*rdriver.findElement(By.xpath("(//*[contains(text(),'Advanced')])[1]")).click();;
			Thread.sleep(2000);
			rdriver.findElement(By.id("proceed-link")).click();
			Thread.sleep(5000);*/
			// Verify Contact us page is displayed
			gl.VerifyElementVisible(Vype_CommonXpath.txtContactUs, "Contact Us ");
			//gl.clickUsingJs(Vype_AgeCertify.btnIam18, "I am 18");
			gl.navigateBack();
			Thread.sleep(10000);


			//gl.clickUsingJs(Vype_AgeCertify.btnIam18, "I am 18");

			// Click on FAQs text
			gl.clickLink(Vype_CommonXpath.lnkFaqs, "FAQs text ");

			Thread.sleep(4000);
			//gl.clickUsingJs(Vype_AgeCertify.btnIam18, "I am 18");

			// Verify FAQs Page is displayed.
			gl.VerifyElementVisible(Vype_CommonXpath.weTxtGeneralQuestions, "FAQs ");
			gl.navigateBack();

			Thread.sleep(5000);

			//gl.clickUsingJs(Vype_AgeCertify.btnIam18, "I am 18");

			// click link store locator
			gl.clickLink(Vype_CommonXpath.lnkStoreLocator, "Store Locator Text ");

			//gl.clickUsingJs(Vype_AgeCertify.btnIam18, "I am 18");
			// Verify Page

			Thread.sleep(5000);
			gl.VerifyElementVisible(Vype_CommonXpath.pgStoreLocator, "Store Locator ");
			gl.navigateBack();

			gl.clickUsingJs(Vype_CommonXpath.lnksitemap, "sitemap");

			Thread.sleep(4000);

			gl.VerifyElementPresent(Vype_CommonXpath.pgsitemap,"site map");

			Thread.sleep(4000);
			gl.navigateBack();

			// Click on Condition of Sale text
			gl.clickLink(Vype_CommonXpath.lnkConditionofSale, "Condition of Sale link ");

			Thread.sleep(5000);
			// Verify Conditions on sale page is displayed
			gl.VerifyElementVisible(Vype_CommonXpath.txtConditionsofSale, "Condition of Sale ");
			gl.navigateBack();
			// Click on Privacy Policy text
			gl.clickLink(Vype_CommonXpath.lnkPrivacyPolicy, "Privacy Policy link ");

			Thread.sleep(5000);
			// Verify privacy policy page is displayed
			gl.VerifyElementVisible(Vype_CommonXpath.txtPrivacyPolicy, "Privacy Policy ");
			gl.navigateBack();

			// Click on Terms and conditions text
			gl.clickLink(Vype_CommonXpath.lnkTermsandConditions, "Terms and conditions link ");

			Thread.sleep(10000);
			// Verify Terms and conditions page is displayed
			//gl.VerifyElementVisible(Vype_CommonXpath.txtTermsConditions, "Terms and conditions ");
			gl.verifyTitle("Terms & Conditions | Vuse Canada");
			gl.navigateBack();

			// Click on Cookie Policy text
			gl.clickLink(Vype_CommonXpath.lnkCookiePolicy, "Cookie Policy link ");

			Thread.sleep(10000);
			// Verify Cookie Policy page is displayed
			//gl.VerifyElementVisible(Vype_CommonXpath.txtCookiePolicy, "Cookie Policy ");

			gl.verifyTitle("Cookie Policy | Vuse Canada");
			gl.navigateBack();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// -----------------------------------------------------------------------------------------------------------
	// Author: Divya Kumari
	// Date: 29/07/2020
	// Contents validation of subscribe and save section page
	public void contentofSubscribeAndSavePage() throws Exception {

		try {

			List<WebElement> list;
			String str = "";

			// verify the header of the page is displayed
			String Header = gl.getText(Vype_SubscriptionLanding.txtHeader);
			Header = Header.replaceAll("[\\n\\t]", ",");
			System.out.println(Header);
			if (Header.contains("Shop") && Header.contains("Save") && Header.contains("Help")) {
				gl.VerifyObjectDisplayed(Vype_SubscriptionLanding.txtHeader, "Header with links and shopping cart ");
			}

			// Subscribe & Save" HTML frame: contains basic info on the program
			// and "Get started" button.
			str = gl.getText(Vype_SubscriptionLanding.txtBasicInfo);
			gl.VerifyObjectDisplayed(Vype_SubscriptionLanding.txtBasicInfo, str + " ");

			gl.VerifyObjectDisplayed(Vype_SubscriptionLanding.btnGetStarted, "Get Started button ");

			gl.ScrollPageDown();
			gl.ScrollPageDown();

			// "Here's how it works" HTML frame: contains info on three steps
			list = driver.findElements(
					By.xpath("//*[text()='Subscribing is super easy']/../following-sibling::div//div//div"));
			System.out.println(list.size());
			for (int i = 0; i < list.size(); i++) {
				str = list.get(i).getText();
				gl.VerifyObjectDisplayed(Vype_SubscriptionLanding.txtSubscribingisEasy, str + " ");
			}

			gl.ScrollPageDown();
			gl.ScrollPageDown();

			// "Choose your plan" HTML frame: contains 2 information of the
			// subscription program types:
			list = driver.findElements(By.xpath(
					"//*[text()='Choose your plan']/../following-sibling::div//div//div[contains(@class,'Plans__Plan')]"));
			System.out.println(list.size());
			for (int i = 0; i < list.size(); i++) {
				str = list.get(i).getText();
				gl.VerifyObjectDisplayed(Vype_SubscriptionLanding.txtChooseyourPlan, str + " ");
			}

			gl.ScrollPageDown();
			gl.ScrollPageDown();
			gl.ScrollPageDown();
			gl.ScrollPageDown();
			// gl.fnScrollToView(Vype_SubscriptionLanding.txtAPlanThatSuitsYou);

			// A plan that suits you" HTML frame: contains 3 blocks of
			// information,
			list = driver.findElements(
					By.xpath("//*[text()='A plan that suits you']/../../following-sibling::div//div//div"));//// *[@class='Features__List-sc-1dfrs6n-1
			//// drkvZA']//div//h4
			System.out.println(list.size());
			for (int i = 0; i < list.size(); i++) {
				str = list.get(i).getText();
				gl.VerifyObjectDisplayed(Vype_SubscriptionLanding.txtAPlanThatSuitsYou, str + " ");
			}

			gl.fnScrollToView(Vype_SubscriptionLanding.txtVuseMembersGet);

			// Vuse+ members get extra benefits contains info
			str = gl.getText(Vype_SubscriptionLanding.txtVuseMembersGet);
			gl.VerifyObjectDisplayed(Vype_SubscriptionLanding.txtVuseMembersGet, str + " ");

			gl.fnScrollToView(Vype_SubscriptionLanding.txtThisSubscriptionPlan);

			// The fastest route to Vuse+ html frame info
			str = gl.getText(Vype_SubscriptionLanding.txtFastestRoute);
			gl.VerifyObjectDisplayed(Vype_SubscriptionLanding.txtFastestRoute, str + " ");

			gl.ScrollPageDown();
			gl.ScrollPageDown();
			gl.ScrollPageDown();
			gl.ScrollPageDown();

			// Questions? See answers below" HTML frame: contains following
			list = driver.findElements(
					By.xpath("//*[text()='Questions? See answers below']/../following-sibling::div//div//div"));
			System.out.println(list.size());
			for (int i = 0; i < list.size(); i++) {
				str = list.get(i).getText();
				gl.VerifyObjectDisplayed(Vype_SubscriptionLanding.txtSeeBelow, "Quections contains: " + str + " ");
			}

			gl.ScrollPageDown();
			gl.ScrollPageDown();

			// Click on each link of Questions? see below
			list = driver.findElements(
					By.xpath("//*[text()='Questions? See answers below']/../following-sibling::div//div//div"));
			System.out.println(list.size());
			for (int i = 0; i < list.size(); i++) {
				WebElement web = list.get(i);
				web.click();
				str = list.get(i).getText();
				gl.VerifyObjectDisplayed(Vype_SubscriptionLanding.txtSeeBelow, "clicked on: " + str + " link ");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// -----------------------------------------------------------------------------------------------------------
	// Author:-Divya Kumari
	// Date: 31/07/2020
	// Verify the Social Media Link/Logo Instagram
	public void clickAndVerifyInstagramLogo() throws Exception {
		try {
			// Click on the Instagram link
			gl.clickLink(Vype_CommonXpath.lnkInstagram, "lnkInstagram");

			// Switch to new window
			gl.fnSwitchToSucceedingTab();

			// Verify user is directed to "Instagram Page"
			gl.VerifyPageDisplayed(Vype_CommonXpath.txtInstagram, "Instagram Page");

			// Swtich to home page tab
			gl.fnSwitchToDefaultTab();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// -----------------------------------------------------------------------------------------------------------
	// Author:-Divya Kumari
	// Date: 31/07/2020
	// Verify the Social Media Link/Logo Instagram
	public void clickAndVerifyFacebookLogo() throws Exception {
		try {
			// Click on the Facebook link
			gl.clickLink(Vype_CommonXpath.lnkFacebook, "lnkFacebook");

			// Switch to new window
			gl.fnSwitchToSucceedingTab();

			// Verify user is directed to "Facebook Page"
			gl.VerifyPageDisplayed(Vype_CommonXpath.pgFacebook, "Facebook");

			// Swtich to home page tab
			gl.fnSwitchToDefaultTab();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// -----------------------------------------------------------------------------------------------------------
	// Author:-Divya Kumari
	// Date: 31/07/2020
	// Verify the Social Media Link/Logo Instagram
	public void clickAndVerifyYoutubeLogo() throws Exception {
		try {
			// Click on the Youtube link
			gl.clickLink(Vype_CommonXpath.lnkYoutube, "lnkYoutube");

			// Switch to new window
			gl.fnSwitchToSucceedingTab();

			// Verify user is directed to "Youtube Page"
			gl.VerifyPageDisplayed(Vype_CommonXpath.pgYoutube, "Youtube");

			// Swtich to home page tab
			gl.fnSwitchToDefaultTab();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// -----------------------------------------------------------------------------------------------------------
	// Author:-Divya Kumari
	// Date: 31/07/2020
	// Verify the Social Media Link/Logo Twitter
	public void clickAndVerifyTwitterLogo() throws Exception {
		try {
			// Click on the Twitter link
			gl.clickLink(Vype_CommonXpath.lnkTwitter, "Twitter");

			// Switch to new window
			gl.fnSwitchToSucceedingTab();

			// Verify user is directed to "Twitter Page"
			gl.VerifyPageDisplayed(Vype_CommonXpath.pgTwitter, "Twitter Page");

			// Swtich to home page tab
			gl.fnSwitchToDefaultTab();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// -----------------------------------------------------------------------------------------------------------
	// Author:-Divya Kumari
	// Date: 31/07/2020
	// Stop the active subscription
	public void stopActiveSubscription() throws Exception {
		try {
			// Click on Subscription
			gl.clickbutton(Vype_CommonXpath.lblSubscription, "Subscription");

			// Verify Active subscription is displayed
			gl.VerifyElementVisible(Vype_CommonXpath.txtActiveSubscription, "Active Subscription ");

			// Click on Edit
			// gl.clickbutton(Vype_CommonXpath.txtEdit, "Edit");

			// Click on Cancel subscription link
			gl.clickLink(Vype_CommonXpath.lnkCancelSubscription, "Cancel ");

			// Verify cancel subscription pop up modal is displayed.
			gl.VerifyObjectDisplayed(Vype_CommonXpath.txtCancelSubscription, "Cancel Subscription");

			// Verify text "are you sure you want to cancel your recurring
			// subscription".
			gl.VerifyElementPresent(Vype_CommonXpath.txtCancelMessage, "Are you sure want to cancel");

			// Verify yes cancel button.
			gl.VerifyElementVisible(Vype_CommonXpath.lnkYesCancel, "Yes Cancel");

			// Verify no return button.
			gl.VerifyElementVisible(Vype_CommonXpath.lnkNoreturn, "No return");

			// Click on 'x' or no return
			gl.clickbutton(Vype_CommonXpath.lnkNoreturn, "No return");

			// Verify cancel subscription pop up modal is closed.
			gl.VerifyElementVisible(Vype_CommonXpath.txtSubscription, "Subscription");

			// Click on cancel link.
			gl.clickbutton(Vype_CommonXpath.lnkCancel, "Cancel");

			// Verify cancel subscription pop modal is displayed with the text
			// "Are you sure you want to cancel your recurring subscription?
			// This action cannot be undone."
			gl.VerifyElementPresent(Vype_CommonXpath.txtCancelSubscriptionPopup, "Are you sure you want to cancel");

			// Verify yes cancel button.
			gl.VerifyElementPresent(Vype_CommonXpath.lnkYesCancel, "Yes Cancel");

			// Verify no return .
			gl.VerifyElementPresent(Vype_CommonXpath.lnkNoreturn, "No return");

			// Click on yes
			gl.clickbutton(Vype_CommonXpath.lnkYesCancel, "Yes Cancel");

			Thread.sleep(2000);

			// Confirmation of the subscription cancel is displayed
			gl.VerifyElementVisible(Vype_CommonXpath.txtSubscriptionCancelInfo, "You have no subscription plan yet");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// -----------------------------------------------------------------------------------------------------------
	// Author:-Divya Kumari
	// Date: 31/07/2020
	// Pause Active subscription
	public void pauseActiveSubscription() throws Exception {
		try {

			// Click on Subscription
			//gl.clickbutton(Vype_CommonXpath.lblSubscription, "Subscription");

			// Subscription page is opened.
			gl.VerifyPageDisplayed(Vype_CommonXpath.txtActiveSubscription, "Subscription");

			// Click on Edit
			// gl.clickbutton(Vype_CommonXpath.txtEdit, "Edit");

			// Click on Pause link
			gl.clickbutton(Vype_CommonXpath.lnkPause, "Pause");

			// Verify "Pause subscription" pop up modal with the text "Are you
			// sure you want to pause your recurring subscription? You will no
			// longer receive your items until you have unpaused it.
			gl.VerifyObjectDisplayed(Vype_CommonXpath.txtPauseMessage, "Are you sure you want to pause");

			// Verify yes pause subscription link.
			gl.VerifyElementPresent(Vype_CommonXpath.lnkYesPauseSubscription, "Yes Pause Subscription");

			// Verify no return link
			gl.VerifyElementVisible(Vype_CommonXpath.lnkNoReturn, "No Return");

			// click on 'x' or no return
			gl.clickbutton(Vype_CommonXpath.lnkNoReturn, "No return");

			// Verify the "Cancel subscription" pop up modal is closed
			// gl.VerifyElementPresent(Vype_CommonXpath.txtCancelSubscriptionPopup,
			// "Are you sure you want to pause");

			// Click on Pause link
			gl.clickbutton(Vype_CommonXpath.lnkPause, "Pause");

			// Verify the "Pause subscription" pop up modal with the text "Are
			// you sure you want to pause your recurring subscription? You will
			// no longer receive your items until you have unpaused it."
			gl.VerifyElementPresent(Vype_CommonXpath.txtPausePopupModal,
					"Are you sure you want to pause recurring subscription");

			// Verify yes pause subscription.
			gl.VerifyElementVisible(Vype_CommonXpath.lnkYesPauseSubscription, "Yes Pause Subscription");

			// Verify no, return.
			gl.VerifyElementPresent(Vype_CommonXpath.lnkNoReturn, "No Return");

			// Click on link YesPauseSubscription
			gl.clickbutton(Vype_CommonXpath.lnkYesPauseSubscription, "Yes Pause Subscription");

			// Confirmation of the subscription Pause displayed.
			gl.VerifyObjectDisplayed(Vype_CommonXpath.txtPauseConformation, "Paused subscription");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// -----------------------------------------------------------------------------------------------------------
	// Author:-Divya Kumari
	// Date: 31/07/2020
	// Add device and go to cart from ePen device page
	public void addItemsandGoToCartforEpenDevicePage() throws Exception {
		try {

			gl.ScrollPageUp();
			gl.ScrollPageUp();

			// Click on Add Items and go to cart
			gl.clickUsingJs(Vype_CommonXpath.txtAddItemsgotoCart, "Add Items and Go to Cart");

			gl.ScrollPageUp();
			gl.ScrollPageUp();
			gl.ScrollPageUp();
			gl.ScrollPageUp();
			gl.ScrollPageUp();

			// gl.ScrollPageUp();
			// gl.waitTillElementVisible(Vype_Cart.pgCart);
			Thread.sleep(5000);

			// Verify that Shipping Cart page
			gl.VerifyPageDisplayed(Vype_Cart.pgCart, "Your Cart");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// -----------------------------------------------------------------------------------------------------------
	// Author:-Divya Kumari
	// Date: 31/07/2020
	// Checkout from your cart page to submit order page
	public void checkoutAndSubmiOrder(String UserCardNumber, String UserCardExpiryDate, String UserCardCVV,
			String UserCardFullName) throws Exception {
		try {

			String PhoneNum = "9987786567";

			gl.fnScrollToView(Vype_Cart.btnCheckOut);

			Thread.sleep(1000);

			// Click on 'Check Out' button from the Cart Page.
			gl.clickUsingJs(Vype_Cart.btnCheckOut, "Cart Page - Check Out");

			// Verify that Check Out Page is displayed
			gl.VerifyElementVisible(Vype_CheckOut.pgCheckOut, "Check Out");

			Thread.sleep(2000);

			// Click on Home
			gl.clickLink(Vype_CommonXpath.weHomeAddress, "Home");
			// String
			// totalAmtPaid=gl.getText(Vype_PlatinumProfileTrigger.cartValueTotal);

			gl.ScrollPageDown();

			gl.inputText(Vype_CheckOut.txtPhonunum, "Phone num", PhoneNum);
			
			gl.fnScrollToView(Vype_CheckOut.btnGoToDelivery);
			// Click on 'Go to delivery' button
			gl.clickUsingJs(Vype_CheckOut.btnGoToDelivery, "Go to delivery");

			/*
			 * 
			 * gl.ScrollPageDown(); gl.ScrollPageDown();
			 * 
			 * String str = gl.getText(Vype_CheckOut.txtFedexNextDay);
			 * gl.VerifyObjectDisplayed(Vype_CheckOut.txtFedexNextDay, str+
			 * " ");
			 * 
			 */
			Thread.sleep(5000);
			gl.fnScrollToView(Vype_CheckOut.btnGoToBilling);
			// Click on 'Go to Billing' button
			gl.clickUsingJs(Vype_CheckOut.btnGoToBilling, "Go to billing");

			// Check if Card details are Not filled, Fill the card details
			if (gl.VerifyElementVisible(Vype_CheckOut.txtCardNumber, "NO")) {

				// Enter the Card Number
				gl.inputText(Vype_CheckOut.txtCardNumber, "Enter the Card Number", UserCardNumber);

				// Enter the Card Expire Date
				gl.inputText(Vype_CheckOut.txtCardExpiryDate, "Enter the Card Expiry Date", UserCardExpiryDate);

				// Enter the Card CVV
				gl.inputText(Vype_CheckOut.txtCVV, "Enter the Card CVV", UserCardCVV);

				// Enter the Card Name
				gl.inputText(Vype_CheckOut.txtNameOnCard, "Enter the Card Name", UserCardFullName);

				// Select the check box "Save credit card details for future
				// payments
				// gl.selectCheckbox(Vype_CheckOut.chkboxSaveCreditCardDetails,
				// "Select the checkbox 'Save credit card details for future
				// payments'");

			}

			// If check box Billing address is same as Shipping Address is not
			// selected then select
			if (!gl.IsCheckboxSelected(Vype_CheckOut.chkboxBillingAddressSameAsShippingAddress,
					"check box Billing address is same as Shipping Address ")) {

				// In some scenarios this check box will not be visible, so if
				// it is visible we are selecting it.
				if (gl.VerifyElementVisible(Vype_CheckOut.chkboxBillingAddressSameAsShippingAddress, "NO")) {
					gl.selectCheckbox(Vype_CheckOut.chkboxBillingAddressSameAsShippingAddress,
							"check box Billing address is same as Shipping Address");
				}

			}

			// Click the 'I have read the Terms & Conditions' check box
			gl.clickLink(Vype_CheckOut.weChkoxIhaveReadTandC, "I have read the Terms and conditions checkbox");

			// Click on "Submit Order" button
			gl.clickLink(Vype_CheckOut.btnSubmitOrder, "Submit Order");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// -----------------------------------------------------------------------------------------------------------
	// Verify order confirmation page details
	// Author:-Divya Kumari
	// Date: 31/07/2020
	public void verifyOrderConfirmationPage() throws Exception {
		try {
			// String OrderValue="";

			// Verify that Order Confirmation page is displayed
			gl.VerifyPageDisplayed(Vype_CheckOut.pgOrderCofirmation, "Order Cofirmation");

			// Verify the Text 'Thank you for your order!'
			gl.VerifyElementVisible(Vype_CheckOut.weTxtThankYouForYourOrder, "Text 'Thank You For Your Order'");

			// Verify the Text 'We are getting started on your order....'
			gl.VerifyElementVisible(Vype_CheckOut.weTxtWeAreGettingStarted,
					"Text 'We are getting started on your order....'");

			// Get the Order Value from the Order Confirmation Page
			OrderValue=gl.getText(Vype_CheckOut.weTxtOrderValue);


			gl.VerifyElementVisible(Vype_CheckOut.weTxtOrderValue, OrderValue);

			System.out.println(">>>>>>"+OrderValue+">>>>>>>>>");
			System.out.println(">>>>>>"+OrderValue.substring(1)+">>>>>>>>>");

			//updated
			gl.fnScrollToView(Vype_CheckOut.txtdelivarytype);
			String delivary=gl.getText(Vype_CheckOut.txtdelivarytype);

			gl.VerifyElementVisible(Vype_CheckOut.txtdelivarytype, delivary);

			String ordersummary=gl.getText(Vype_CheckOut.txtordersummary);

			gl.VerifyElementVisible(Vype_CheckOut.txtordersummary,ordersummary);	


		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// -----------------------------------------------------------------------------------------------------------
	// Author:-Divya Kumari
	// Date: 31/07/2020
	// Launch login and verify details in Shopify
	public void verifyOrderDetailsInShopify(String shopifyUrl, String shopifyUN, String shopifyPWD) throws Exception {
		try {

			// Launch Shopify Url
			gl.launchUrl(shopifyUrl);

			// Click on "Log in here" link from the Login page
			gl.clickLink(Vype_ShopifyLogin.lnkLoginHere, "Log in here link on shopify login page");

			// Verify that Input email text field is displayed
			gl.VerifyElementVisible(Vype_ShopifyLogin.txtEmail, "Email text field ");

			// Input User name in Shopify User name text field
			gl.inputText(Vype_ShopifyLogin.txtEmail, "Enter Username in Shopify email field", shopifyUN);

			// Click on 'Submit' button
			gl.clickbutton(Vype_ShopifyLogin.btnSubmit, "Submit");

			// Verify that Input Password text field is displayed
			gl.VerifyElementVisible(Vype_ShopifyLogin.txtPassword, "Password text field ");

			// Input Password in Shopify Password text field
			gl.inputPasswordEncrypted(Vype_ShopifyLogin.txtPassword, "Enter Password in Shopify Password field",
					shopifyPWD);

			// Click on Login button
			gl.clickbutton(Vype_ShopifyLogin.btnLogin, "Login on Shopify Login");

			// Verify that Shopify Home Page is displayed
			gl.VerifyPageDisplayed(Vype_ShopifyLogin.lnkOrders, "Shopify Home");

			// Click on "Order" link
			gl.clickbutton(Vype_ShopifyLogin.lnkOrders, "Shopify Orders");

			// Verify that Orders page is displayed
			gl.VerifyPageDisplayed(Vype_ShopifyLogin.txtSearchOrders, "Orders");

			// Input order number in the search field
			gl.inputText(Vype_ShopifyLogin.txtSearchOrders, "Search field shopify", OrderValue);

			// Click on the 'Order number'
			gl.clickLink(Vype_ShopifyLogin.weTxtOrderNumberN(OrderValue), OrderValue + " Link");

			gl.ScrollPageDown();
			gl.ScrollPageDown();

			// Verify that Order total value is displayed in the Order details
			String TotalAmountPaid = gl.getText(Vype_ShopifyLogin.wetxtTotal);
			gl.VerifyPageDisplayed(Vype_ShopifyLogin.wetxtTotal,
					"Total amount paid is" + TotalAmountPaid + " displayed ");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// -----------------------------------------------------------------------------------------------------------
	// Author:-Divya Kumari
	// Date: 03/08/2020
	// ePen Pods: select flavour and verify the flavour description
	public void chooseFlavourAndVerifyFlavourDetails(String FlavourColour, String FlavourText) throws Exception {
		try {
			String str = "";
			// Click on Strawberry flavour link
			gl.clickElement(Vype_CommonXpath.lnkAllFlavours(FlavourColour), FlavourColour);
			Thread.sleep(5000);

			// Verify strawberry page is displayed
			gl.VerifyObjectDisplayed(Vype_CommonXpath.txtFlavours(FlavourText), FlavourText);
			gl.ScrollPageDown();

			// Verify that "Strawberry Smash ePen3 Cartridge" description is
			// displayed
			str = gl.getText(Vype_CommonXpath.txtFlavoursDescription(FlavourText));
			gl.VerifyElementVisible(Vype_CommonXpath.txtFlavoursDescription(FlavourText),
					"Flavour description is: " + str);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// -----------------------------------------------------------------------------------------------------------
	// Author:-Divya Kumari
	// Date: 03/08/2020
	// ePen Pods: Verify elements in flavours page
	public void verifyElementsInFlavoursPage() throws Exception {
		try {
			// Verify that 'Add to Cart' button is displayed
			gl.VerifyElementVisible(Vype_CommonXpath.btnAddToCart, "Add to Cart button");

			// Verify the "Nicotine Strength" from the Flavor detail page
			gl.VerifyElementVisible(Vype_CommonXpath.weTxtNicotineStrength,
					"Text 'Nicotine Strength' from the Flavor detail pagel");

			// Verify the "Quantity" from the Flavor detail page
			gl.VerifyElementVisible(Vype_CommonXpath.weTxtQuantity, "Text 'Quantity'from the Flavor detail page");

			// Verify the "12mg/ml" from the Flavor detail page
			gl.VerifyElementVisible(Vype_CommonXpath.weTxt12mgperml, "Text '12mg/ml'from the Flavor detail page");

			// Verify the "30mg/ml" from the Flavor detail page
			gl.VerifyElementVisible(Vype_CommonXpath.weTxt30mgperml, "Text '30mg/ml' from the Flavor detail page");

			// Verify the "$0.00" from the Flavor detail page
			gl.VerifyElementVisible(Vype_CommonXpath.weTxtTotalValueN("0.00"),
					"Text 'Total Value - $0.00' from the Flavor detail page");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// -------------------------------------------------------------------------------------------------------------------------
	// Author:-Divya Kumari
	// Date: 03/08/2020
	// ePen Pods: select nicotine strength as 30mg/ml and add to cart
	public void select30NicotineStrengthAndAddtoCart() throws Exception {
		try {

			// Click on Increment '+' button of 30mg/ml
			gl.clickUsingJs(Vype_CommonXpath.btnIncrement30mgperml, "Increment '+' button of 30mg/ml");

			// Verify the "$12.00" from the Flavor detail page
			gl.VerifyElementVisible(Vype_CommonXpath.weTxtTotalValueN("12.00"),
					"Text 'Total Value - $12.00' from the Flavor detail page");

			// Click on "Add to Cart" button from the Flavor detail page
			gl.clickbutton(Vype_CommonXpath.btnAddToCart, "Add to Cart button from the Flavor detail page ");

			// Verify mini cart is updated
			String num1 = gl.getText(Vype_CommonXpath.txtnumber);
			gl.VerifyObjectDisplayed(Vype_CommonXpath.txtnumber, "Cart is updated with " + num1 + "items ");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// -------------------------------------------------------------------------------------------------------------------------
	// Author:-Divya Kumari
	// Date: 03/08/2020
	// ePen Pods: select nicotine strength as 12mg/ml and add to cart
	public void select12NicotineStrengthAndAddtoCart() throws Exception {
		try {

			// Click on Increment '+' button of 12mg/ml
			gl.clickUsingJs(Vype_CommonXpath.btn1point6percent, "Increment '+' button of 12mg/ml");

			// Verify the "$12.00" from the Flavor detail page
			// gl.VerifyElementVisible(Vype_CommonXpath.weTxtTotalValueN("12.00"),
			// "Text 'Total Value - $12.00' from the Flavor detail page");

			// Click on "Add to Cart" button from the Flavor detail page
			gl.clickbutton(Vype_CommonXpath.btnAddToCart, "Add to Cart button from the Flavor detail page");

			// Verify mini cart is updated
			String num1 = gl.getText(Vype_CommonXpath.txtnumber);
			gl.VerifyObjectDisplayed(Vype_CommonXpath.txtnumber, "Cart is updated with " + num1 + "items ");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// -------------------------------------------------------------------------------------------------------------------------
	// Author:-Divya Kumari
	// Date: 03/08/2020
	// ePen Pods: select nicotine strength as 0mg/ml and add to cart
	public void select0NicotineStrengthAndAddtoCart() throws Exception {
		try {

			// Click on Increment '+' button of 16mg/ml
			gl.clickUsingJs(Vype_CommonXpath.btn1point6percent, "Increment '+' button of 0mg/ml");

			// Verify the "$14.00" from the Flavor detail page
			gl.VerifyElementVisible(Vype_CommonXpath.weTxtTotalValueN("13.99"),
					"Text 'Total Value - $13.99' from the Flavor detail page");

			// Click on "Add to Cart" button from the Flavor detail page
			gl.clickbutton(Vype_CommonXpath.btnAddToCart, "Add to Cart button from the Flavor detail page");

			// Verify mini cart is updated
			String num1 = gl.getText(Vype_CommonXpath.txtnumber);
			gl.VerifyObjectDisplayed(Vype_CommonXpath.txtnumber, "Cart is updated with " + num1 + "items ");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// -----------------------------------------------------------------------------------------------------------
	// Author:-Divya Kumari
	// Date: 03/08/2020
	// Hover on cart and click on view cart
	public void hoverCartAndClickViewCart() throws Exception {
		try {

			// Hover on the Cart icon
			gl.HowerMouse(Vype_CommonXpath.lnkCartIcon, "Cart Icon");

			Thread.sleep(10000);

			// Click on "View Cart" button from Tiny Cart modal
			//gl.clickbutton(Vype_CommonXpath.btnViewCart, "View Cart button from Tiny Cart modal");
			gl.clickbuttonUsingSelenium(Vype_CommonXpath.btnViewCart, "View Cart button from Tiny Cart modal");

			Thread.sleep(10000);

			gl.fnScrollToView(Vype_Cart.pgCart);

			Thread.sleep(2000);

			// Verify that Shipping Cart page
			gl.VerifyElementVisible(Vype_Cart.pgCart, "Shipping Cart");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// -----------------------------------------------------------------------------------------------------------
	// Author:-Divya Kumari
	// Date: 03/08/2020
	// ePen Pods: Add quantity for subscribe and Save
	public void addQuantityForSubscribeAndSave() throws Exception {
		try {

			// click on subscribe & save
			gl.clickUsingJs(Vype_CommonXpath.pgeSubscribeAndSave, "SubSubscribe & Save");

			// Scroll to view quality
			gl.fnScrollToView(Vype_CommonXpath.txtPack);

			// click on plus button Nicotine strength 0mg/ml
			gl.clickbuttonTillElementValueReaches(Vype_CommonXpath.btnstrength, 5, "Add Button");

			// verify subscribe and save option is enabled.
			gl.VerifyElementPresent(Vype_CommonXpath.lnkSubscribeAndSave, "Subscribe & Save");

			Thread.sleep(3000);

			// click on subscribe & save.
			gl.clickbutton(Vype_CommonXpath.lnkSubscribeAndSave, "Subscribe & Save");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void addQuantityForSubscribeAndSave(String quantity) throws Exception {
		try {

			// click on subscribe & save
			//gl.clickUsingJs(Vype_CommonXpath.pgeSubscribeAndSave, "SubSubscribe & Save");

			// Scroll to view quality
			gl.fnScrollToView(Vype_CommonXpath.txtPack);

			int Count=Integer.parseInt(quantity);

			gl.clickUsingJs(Vype_CommonXpath.btndecrement, "- ");
			for(int i=0;i<Count;i++)
			{
				// click on plus button Nicotine strength 0mg/ml
				gl.clickUsingJs(Vype_CommonXpath.btnincrement, "+ ");

			}
			// verify subscribe and save option is enabled.
			gl.VerifyElementPresent(Vype_CommonXpath.lnkSubscribeAndSave, "Subscribe & Save");

			Thread.sleep(3000);

			// click on subscribe & save.
			gl.clickbutton(Vype_CommonXpath.lnkSubscribeAndSave, "Subscribe & Save");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// -----------------------------------------------------------------------------------------------------------
	// Author:-Divya Kumari
	// Date: 03/08/2020
	// ePen Pods: Add quantity for One Time Purchase
	public void addQuantityForOneTimePurchase() throws Exception {
		try {

			// click on One time purchase
			gl.clickUsingJs(Vype_CommonXpath.lnkOneTimePurchase, "One Time Purchase");

			// Scroll to view quality
			gl.fnScrollToView(Vype_CommonXpath.txtPack);

			// click on plus button Nicotine strength 0mg/ml
			gl.clickUsingJs(Vype_CommonXpath.btn1point6percent, "Add Button");

			// click on Add To Cart.
			gl.clickUsingJs(Vype_CommonXpath.btnAddToCart, "Add To Cart");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	// -----------------------------------------------------------------------------------------------------------
	// Author:-Divya Kumari
	// Date: 04/08/2020
	// ePod Pods: Add quantity for subscribe and Save for 1.6% strength
	public void addQuantityForSubscribeAndSaveforePodPods() throws Exception {
		try {

			// click on subscribe & save
			gl.clickUsingJs(Vype_CommonXpath.pgeSubscribeAndSave, "SubSubscribe & Save");

			// Scroll to view quality
			gl.fnScrollToView(Vype_CommonXpath.txtPack);

			// click on plus button Nicotine strength 1.6%
			gl.clickbuttonTillElementValueReaches(Vype_CommonXpath.btnIncrement1point6percent, 3, "Add Button");

			// verify subscribe and save option is enabled.
			gl.VerifyElementPresent(Vype_CommonXpath.lnkSubscribeAndSave, "Subscribe & Save");

			// click on subscribe & save.
			gl.clickbutton(Vype_CommonXpath.lnkSubscribeAndSave, "Subscribe & Save");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// -----------------------------------------------------------------------------------------------------------
	// Author:-Divya Kumari
	// Date: 04/08/2020
	// ePod Pods: Add quantity for subscribe and Save for 3% strength
	public void addQuantity3percntForSubscribeAndSaveforePodPods() throws Exception {
		try {

			// click on subscribe & save
			gl.clickUsingJs(Vype_CommonXpath.pgeSubscribeAndSave, "SubSubscribe & Save");

			// Scroll to view quality
			gl.fnScrollToView(Vype_CommonXpath.txtPack);

			// click on plus button Nicotine strength 3%
			gl.clickbuttonTillElementValueReaches(Vype_CommonXpath.btnIncrement5percent, 5, "Add Button");

			// verify subscribe and save option is enabled.
			gl.VerifyElementPresent(Vype_CommonXpath.lnkSubscribeAndSave, "Subscribe & Save");

			// click on subscribe & save.
			gl.clickbutton(Vype_CommonXpath.lnkSubscribeAndSave, "Subscribe & Save");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// -----------------------------------------------------------------------------------------------------------
	// Author:-Divya Kumari
	// Date: 04/08/2020
	// ePod Pods: Add quantity for subscribe and Save for 5% strength
	public void addQuantity5percntForSubscribeAndSaveforePodPods() throws Exception {
		try {

			// click on subscribe & save
			gl.clickUsingJs(Vype_CommonXpath.pgeSubscribeAndSave, "SubSubscribe & Save");

			// Scroll to view quality
			gl.fnScrollToView(Vype_CommonXpath.txtPack);

			// click on plus button Nicotine strength 5%
			gl.clickbuttonTillElementValueReaches(Vype_CommonXpath.btnIncrement5percent, 3, "Add Button");

			// verify subscribe and save option is enabled.
			gl.VerifyElementPresent(Vype_CommonXpath.lnkSubscribeAndSave, "Subscribe & Save");

			// click on subscribe & save.
			gl.clickbutton(Vype_CommonXpath.lnkSubscribeAndSave, "Subscribe & Save");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// -----------------------------------------------------------------------------------------------------------
	// Author:-Divya Kumari
	// Date: 04/08/2020
	// ePod Pods: Add quantity for One Time Purchase for 1.6% strength
	public void addQuantityForOneTimePurchaseforePodPods() throws Exception {
		try {
			gl.ScrolltoTopofthepage();
			Thread.sleep(3000);
			// click on One time purchase
			gl.clickbutton(Vype_CommonXpath.lnkOneTimePurchase, "One Time Purchase");
			Thread.sleep(3000);
			// Scroll to view quality
			gl.fnScrollToView(Vype_CommonXpath.txtPack);
			Thread.sleep(3000);

			// click on plus button Nicotine strength 1.6%
			gl.clickbutton(Vype_CommonXpath.btnQtyIncrement, "Quantity Increment");

			// click on Add To Cart.
			gl.clickbutton(Vype_CommonXpath.btnAddToCart, "Add To Cart");

			// Verify mini cart is updated
			String num1 = gl.getText(Vype_SubscriptionLanding.txtnumber);
			gl.VerifyObjectDisplayed(Vype_SubscriptionLanding.txtnumber, "Cart is updated with " + num1 + "items ");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// -----------------------------------------------------------------------------------------------------------
	// Author:-Divya Kumari
	// Date: 04/08/2020
	// ePod Pods: Add quantity for One Time Purchase for 3% strength
	public void addQuantity3percntForOneTimePurchaseforePodPods() throws Exception {
		try {

			// click on One time purchase
			gl.clickbutton(Vype_CommonXpath.lnkOneTimePurchase, "One Time Purchase");

			// Scroll to view quality
			gl.fnScrollToView(Vype_CommonXpath.txtPack);

			// click on plus button Nicotine strength 3%
			gl.clickbutton(Vype_CommonXpath.btnIncrement3percent, "Add Button");

			// click on Add To Cart.
			gl.clickbutton(Vype_CommonXpath.btnAddToCart, "Add To Cart");

			// Verify mini cart is updated
			String num1 = gl.getText(Vype_SubscriptionLanding.txtnumber);
			gl.VerifyObjectDisplayed(Vype_SubscriptionLanding.txtnumber, "Cart is updated with " + num1 + "items ");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// -----------------------------------------------------------------------------------------------------------
	// Author:-Divya Kumari
	// Date: 04/08/2020
	// ePod Pods: Add quantity for One Time Purchase for 5% strength
	public void addQuantity5percntForOneTimePurchaseforePodPods() throws Exception {
		try {

			// click on One time purchase
			gl.clickbutton(Vype_CommonXpath.lnkOneTimePurchase, "One Time Purchase");

			// Scroll to view quality
			gl.fnScrollToView(Vype_CommonXpath.txtPack);

			// click on plus button Nicotine strength 5%
			gl.clickbutton(Vype_CommonXpath.btnIncrement5percent, "Add Button");

			// click on Add To Cart.
			gl.clickbutton(Vype_CommonXpath.btnAddToCart, "Add To Cart");

			// Verify mini cart is updated
			String num1 = gl.getText(Vype_SubscriptionLanding.txtnumber);
			gl.VerifyObjectDisplayed(Vype_SubscriptionLanding.txtnumber, "Cart is updated with " + num1 + "items ");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// -----------------------------------------------------------------------------------------------------------
	// Author:-Divya Kumari
	// Date: 05/08/2020
	// ePod Charger/Accessories: navigate to epod charger page
	public void navigateToePodChargerPage() throws Exception {
		try {

			// Hover the mouse on Products link
			gl.HowerMouse(Vype_CommonXpath.lnkShop, "Shops link from the main menu navigation");

			// Click on ePod Charger link
			gl.clickbutton(Vype_CommonXpath.lnkAccessories, "Charger link ");

			// Verify the user is redirected to Vuse ePod Charger Page
			gl.VerifyObjectDisplayed(Vype_CommonXpath.txtePodAccessories, "ePod Accessories ");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// -----------------------------------------------------------------------------------------------------------
	// Author:-Divya Kumari
	// Date: 05/08/2020
	// ePod Skins: navigate to epod skins page
	public void navigateToePodSkinsPage() throws Exception {
		try {

			// Hover the mouse on Products link
			gl.HowerMouse(Vype_CommonXpath.lnkProducts, "Products link from the main menu navigation");

			// Click on Skins under ePod section
			gl.clickbutton(Vype_CommonXpath.lnkSkinsEpod, "Skins link under epod section ");
			Thread.sleep(6000);

			// Verify that Choose your skin page is displayed.
			//gl.VerifyObjectDisplayed(Vype_CommonXpath.wetxtChooseSkin, "Choose your skin page is opened ");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// -----------------------------------------------------------------------------------------------------------
	// Author:-Divya Kumari
	// Date: 05/08/2020
	// ePod Device: navigate to Solo device page
	public void clickAndVerifySoloDevice() throws Exception {
		try {

			// Click the buy now button solo device tile
			gl.clickbutton(Vype_CommonXpath.btnSoloDeviceBuyNow, "Buy Now - Solo Device");

			// Verify epod solo device page is displayed
			gl.VerifyPageDisplayed(Vype_CommonXpath.weTxtChooseYourColour, "Solo Device");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// -----------------------------------------------------------------------------------------------------------
	// Author:-Divya Kumari
	// Date: 05/08/2020
	// ePod Device: navigate to Solo device page
	public void clickAndVerifyEngravableDevice() throws Exception {
		try {

			gl.fnScrollToView(Vype_CommonXpath.btnEngravedDeviceBuyNow);
			// Click the buy now button of engravable device tile
			gl.clickbutton(Vype_CommonXpath.btnEngravedDeviceBuyNow, "Engraving");

			/*
			 * //Verify Engravable pods page is displayed
			 * gl.VerifyPageDisplayed(Vype_CommonXpath.pgEngravableEpod,
			 * "Engravable Epod");
			 */

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// -----------------------------------------------------------------------------------------------------------
	// Author:-Divya Kumari
	// Date: 05/08/2020
	// ePod Device: Overview Page
	public void validateePodOverviewPage() throws Exception {
		try {

			// Body element initialization
			WebElement epodStarterBody = driver.findElement(Vype_CommonXpath.pgEpodStarterKitBody);

			// Click Space bar
			epodStarterBody.sendKeys(Keys.SPACE);

			// Verify second overview page is displayed
			if (gl.VerifyElementVisible(Vype_CommonXpath.imgVypeStarterKit, "NO"))
				reportiumClient.reportiumAssert("Validate ePod Overview Page (overall product view) is Displayed", true);
			/*gl.LogResult_and_CaptureImage("PASS", "Validate ePod Overview Page (overall product view) is Displayed",
						"ePod Overview Page is Displayed", "YES");*/
			else
				reportiumClient.reportiumAssert("Validate ePod Overview Page (overall product view) is Displayed", false);
			/*gl.LogResult_and_CaptureImage("FAIL", "Validate ePod Overview Page (overall product view) is Displayed",
						"ePod Overview Page is Displayed", "YES");*/

			// Click Space bar
			epodStarterBody.sendKeys(Keys.SPACE);

			// Verify feature 1 page is displayed
			if (gl.VerifyElementVisible(Vype_CommonXpath.weTxtVypeStarterKitFeature1, "NO"))
				/*gl.LogResult_and_CaptureImage("PASS", "Validate ePod Overview Page (Feature 1) is Displayed",
						"ePod Overview Page is Displayed", "YES");*/
				reportiumClient.reportiumAssert("ePod Overview Page is Displayed", true);
			else
				reportiumClient.reportiumAssert("Validate ePod Overview Page (Feature 1) is Displayed", false);
			/*gl.LogResult_and_CaptureImage("FAIL", "Validate ePod Overview Page (Feature 1) is Displayed",
						"ePod Overview Page is Displayed", "YES");*/

			// Click Space bar
			epodStarterBody.sendKeys(Keys.SPACE);

			// Verify feature 2 page is displayed
			if (gl.VerifyElementVisible(Vype_CommonXpath.weTxtVypeStarterKitFeature2, "NO"))
				reportiumClient.reportiumAssert("Validate ePod Overview Page (Feature 2) is Displayed", true);
			/*gl.LogResult_and_CaptureImage("PASS", "Validate ePod Overview Page (Feature 2) is Displayed",
						"ePod Overview Page is Displayed", "YES");*/
			else
				reportiumClient.reportiumAssert("Validate ePod Overview Page (Feature 2) is Displayed", false);
			/*gl.LogResult_and_CaptureImage("FAIL", "Validate ePod Overview Page (Feature 2) is Displayed",
						"ePod Overview Page is Displayed", "YES");*/

			// Click Space bar
			epodStarterBody.sendKeys(Keys.SPACE);

			// Verify feature 3 page is displayed
			if (gl.VerifyElementVisible(Vype_CommonXpath.weTxtVypeStarterKitFeature3, "NO"))
				reportiumClient.reportiumAssert("Validate ePod Overview Page (Feature 3) is Displayed", true);
			/*gl.LogResult_and_CaptureImage("PASS", "Validate ePod Overview Page (Feature 3) is Displayed",
						"ePod Overview Page is Displayed", "YES");*/
			else
				reportiumClient.reportiumAssert("Validate ePod Overview Page (Feature 3) is Displayed", false);
			/*gl.LogResult_and_CaptureImage("FAIL", "Validate ePod Overview Page (Feature 3) is Displayed",
						"ePod Overview Page is Displayed", "YES");*/

			// CLick Space bar
			epodStarterBody.sendKeys(Keys.SPACE);

			// Verify Flavours overview page is displayed
			if (gl.VerifyElementVisible(Vype_CommonXpath.lnkShopFlavours, "NO"))
				reportiumClient.reportiumAssert("Validate ePod Flavors Overview Page is Displayed", true);
			/*gl.LogResult_and_CaptureImage("PASS", "Validate ePod Flavors Overview Page is Displayed",
						"ePod Flavors Overview Page is Displayed", "YES");*/
			else
				reportiumClient.reportiumAssert("Validate ePod Flavors Overview Page is Displayed", false);
			/*gl.LogResult_and_CaptureImage("FAIL", "Validate ePod Flavors Overview Page is Displayed",
						"ePod Flavors Overview Page is Displayed", "YES");
			 */
			// click the shop flavours link
			gl.clickLink(Vype_CommonXpath.lnkShopFlavours, "Shop Flavours");

			// Verify flavors page is displayed
			gl.VerifyPageDisplayed(Vype_CommonXpath.pgFlavourPod, "Flavours");

			// Navigate back
			gl.navigateBack();

			// Verify epod starter kit page is displayed
			gl.VerifyObjectDisplayed(Vype_CommonXpath.lnkShopFlavours, "Epod Starter Kit");

			// Click Space bar
			epodStarterBody.sendKeys(Keys.SPACE);

			// Verify Personalize Overview page is displayed
			if (gl.VerifyElementVisible(Vype_CommonXpath.weTxtVypeStarterKitPersonlize, "NO"))
				reportiumClient.reportiumAssert("Validate ePod Personalize Overview Page is Displayed", true);
			/*gl.LogResult_and_CaptureImage("PASS", "Validate ePod Personalize Overview Page is Displayed",
						"ePod Personalize Overview Page is Displayed", "YES");*/
			else
				reportiumClient.reportiumAssert("Validate ePod Personalize Overview Page is Displayed", false);
			/*gl.LogResult_and_CaptureImage("FAIL", "Validate ePod Personalize Overview Page is Displayed",
						"ePod Personalize Overview Page is Displayed", "YES");*/

			// Click the shop skins link
			gl.clickLink(Vype_CommonXpath.lnkShopSkins, "Shop Skins");

			// Verify epod skins page is displayed
			// gl.VerifyPageDisplayed(Vype_CommonXpath.pgEpodSkins, "Epod
			// Skins");

			// Navigate back
			gl.navigateBack();

			// Verify epod starter kit page is displayed
			gl.VerifyObjectDisplayed(Vype_CommonXpath.weTxtVypeStarterKitPersonlize, "Epod Starter Kit");

			// Click the engrave device link
			gl.clickLink(Vype_CommonXpath.lnkEnravableDevice, "Engravable Device");

			// Verify epod solo device page is displayed
			gl.VerifyObjectDisplayed(Vype_CommonXpath.weTxtChooseYourColour, "Solo Device");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// -----------------------------------------------------------------------------------------------------------
	// Author:-Divya Kumari
	// Date: 05/08/2020
	// ePod Device Engravable epod: select color and verify the color in device
	// image
	public void selectAndVerifyDeviceColor(String clr) throws Exception {
		try {

			// Choose your color
			gl.clickbuttonUsingSelenium(Vype_CommonXpath.btnColour(clr), clr + " colour selected ");

			/*
			 * //Verify device color changes
			 * gl.VerifyPageDisplayed(Vype_CommonXpath.weDeviceColour(color),
			 * color+ "colour device selected");
			 * 
			 * gl.ScrollPageDown();
			 * 
			 */
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// -----------------------------------------------------------------------------------------------------------
	/*
	 * //Author:-Divya Kumari //Date: 06/08/2020 //ePod Device Engravable epod:
	 * Engrave device by adding pattern, text public void engraveDevice(String
	 * pattern,String patternName,String TextDirection,String FontStyle,String
	 * Text,String FirstName) throws Exception { try{
	 * 
	 * List<WebElement> list;
	 * 
	 * //Click on "+Add" Button in the Engraved Device Section
	 * gl.clickUsingJs(Vype_CommonXpath.btnEngravedAdd, "+Add");
	 * Thread.sleep(3000);
	 * 
	 * gl.ScrollPageUp(); //gl.ScrollPageUp();
	 * 
	 * //Verify the setp 1 of customization i.e. customize the front page
	 * displayed gl.VerifyObjectDisplayed(Vype_CommonXpath.txtCustomizeFront,
	 * "01 | Customize the Front");
	 * 
	 * //CLick on Pattern
	 * gl.clickbuttonUsingSelenium(Vype_CommonXpath.btnPattern, "Pattern");
	 * 
	 * //Click on Solstice
	 * gl.clickUsingJs(Vype_CommonXpath.btnSolstice(pattern),
	 * "Pattern selected is: "+ pattern);
	 * 
	 * //Select pattern
	 * gl.clickbuttonUsingSelenium(Vype_CommonXpath.btnHoya(patternName),
	 * "Device pattern name is: "+ patternName); String Pattern =
	 * gl.getText(Vype_CommonXpath.btnHoya(patternName));
	 * System.out.println("Device pattern is: "+Pattern);
	 * 
	 * //CLick on Add Pattern button
	 * gl.clickbuttonUsingSelenium(Vype_CommonXpath.btnAddPattern,
	 * "Add Pattern");
	 * 
	 * //Verify the page Now customize the back displayed
	 * gl.VerifyPageDisplayed(Vype_CommonXpath.txtCustomizeBack,
	 * "02 | Now Customize the Back");
	 * 
	 * //Click on Text gl.clickbuttonUsingSelenium(Vype_CommonXpath.btnText,
	 * "Text");
	 * 
	 * //Select direction
	 * gl.clickbuttonUsingSelenium(Vype_CommonXpath.btnVertical(TextDirection),
	 * "Text direction selected is: "+ TextDirection); String Direction =
	 * gl.getText(Vype_CommonXpath.btnVertical(TextDirection));
	 * System.out.println("Text direction is: "+Direction);
	 * 
	 * //Select Font style
	 * gl.clickbuttonUsingSelenium(Vype_CommonXpath.btnFontStyle(FontStyle),
	 * "Font style is: "+ FontStyle); String FontStyle1 =
	 * gl.getText(Vype_CommonXpath.btnFontStyle(FontStyle));
	 * System.out.println("Font style is: "+FontStyle1);
	 * 
	 * //Enter your text gl.inputText(Vype_CommonXpath.txtEnterText,
	 * "Enter your text field", Text);
	 * 
	 * //Click on Add Text button
	 * gl.clickbuttonUsingSelenium(Vype_CommonXpath.btnAddText, "Add Text");
	 * 
	 * gl.ScrollPageUp();
	 * 
	 * //Verify Make it your page displayed
	 * gl.VerifyPageDisplayed(Vype_CommonXpath.txtMakeItYours,
	 * "03 | Make it yours");
	 * 
	 * //Enter the first name in the tell us your first name field
	 * gl.inputText(Vype_CommonXpath.txtFirstName, "Tell us your first name",
	 * FirstName);
	 * 
	 * //Click on Add your name button
	 * gl.clickbuttonUsingSelenium(Vype_CommonXpath.btnAddName,
	 * "Add your name");
	 * 
	 * //Verify Engraving Summary page displayed
	 * gl.VerifyPageDisplayed(Vype_CommonXpath.txtEngravingSummary,
	 * "Engraving Summary");
	 * 
	 * //Verify the engraving summary list = driver.findElements(By.xpath(
	 * "//h4[contains(text(),'Items')]//following-sibling::div//div//div//main")
	 * ); String itemName =""; // List<String> item=new ArrayList<String>();
	 * for(int i=0;i<list.size();i++){ itemName= list.get(i).getText(); itemName
	 * = itemName.replaceAll("[\\n\\t ]", " "); System.out.println(itemName);
	 * if( (itemName.contains(Pattern)) || (itemName.contains(FontStyle1)) || (
	 * (itemName.contains(FirstName)) ) ){
	 * gl.VerifyObjectDisplayed(Vype_CommonXpath.txtEngravingSummary,
	 * "The image is shown with customizations added: "+itemName); }
	 * 
	 * }
	 * 
	 * //Click on Add Engraving button
	 * gl.clickbuttonUsingSelenium(Vype_CommonXpath.btnAddEngraving,
	 * "Add Engraving ");
	 * 
	 * //Verify it redirects to Engravable ePod product details page
	 * gl.VerifyPageDisplayed(Vype_CommonXpath.wetxtEngravableePod,
	 * "Engravable ePod");
	 * 
	 * 
	 * }catch (Exception e){ e.printStackTrace(); } }
	 */

	public void engraveDevice(String devicecolour, String patternName, String TextDirection, String FontStyle,
			String Text, String FirstName) throws Exception {
		try {

			//List<WebElement> list;

			gl.fnScrollToView(Vype_CommonXpath.btnEngravedDeviceBuyNow);
			// Click the buy now button of engravable
			gl.clickbutton(Vype_CommonXpath.btnEngravedDeviceBuyNow, "Engraving");

			gl.VerifyObjectDisplayed(Vype_CommonXpath.pgengravingdevice, "engravable page is opened");

			gl.clickbutton(Vype_CommonXpath.btndevicecolour(devicecolour), "colour selected is:" + devicecolour);

			/*
			 * //Click on "+Add" Button in the Engraved Device Section
			 * gl.clickUsingJs(Vype_CommonXpath.btnEngravedAdd, "+Add");
			 * Thread.sleep(3000);
			 * 
			 * gl.ScrollPageUp(); //gl.ScrollPageUp();
			 */
			/*
			 * //Verify the setp 1 of customization i.e. customize the front
			 * page displayed
			 * gl.VerifyObjectDisplayed(Vype_CommonXpath.txtCustomizeFront,
			 * "01 | Customize the Front")
			 */;

			 // CLick on Pattern

			 gl.clickUsingJs(Vype_CommonXpath.btnPattern, "Pattern");

			 // Click on Solstice
			 // gl.clickUsingJs(Vype_CommonXpath.btnpattern(pattern), "Pattern
			 // selected is: "+ pattern);

			 // Select pattern
			 gl.clickUsingJs(Vype_CommonXpath.btpattern(patternName), "Device pattern name is: " + patternName);
			 String Pattern = gl.getText(Vype_CommonXpath.btpattern(patternName));
			 System.out.println("Device pattern is: " + Pattern);

			 // CLick on Add Pattern button
			 gl.clickbuttonUsingSelenium(Vype_CommonXpath.btnAddPattern, "Add Pattern");

			 // Verify the page Now customize the back displayed
			 gl.VerifyPageDisplayed(Vype_CommonXpath.txtCustomizeBack, "02 | Now Customize the Back");

			 // Click on Text
			 gl.clickUsingJs(Vype_CommonXpath.btnText, "Text");

			 // Select direction
			 gl.clickUsingJs(Vype_CommonXpath.btnVertical(TextDirection),
					 "Text direction selected is: " + TextDirection);
			 String Direction = gl.getText(Vype_CommonXpath.btnVertical(TextDirection));
			 System.out.println("Text direction is: " + Direction);

			 // Select Font style
			 gl.clickUsingJs(Vype_CommonXpath.btnFontStyle(FontStyle), "Font style is: " + FontStyle);
			 String FontStyle1 = gl.getText(Vype_CommonXpath.btnFontStyle(FontStyle));
			 System.out.println("Font style is: " + FontStyle1);

			 // Enter your text
			 gl.inputText(Vype_CommonXpath.txtEnterText, "Enter your text field", Text);

			 // Click on Add Text button
			 gl.clickbuttonUsingSelenium(Vype_CommonXpath.btnAddText, "Add Text");
			 /*
			  * gl.ScrollPageUp();
			  * 
			  * //Verify Make it your page displayed
			  * gl.VerifyPageDisplayed(Vype_CommonXpath.txtMakeItYours,
			  * "03 | Make it yours");
			  * 
			  * //Enter the first name in the tell us your first name field
			  * gl.inputText(Vype_CommonXpath.txtFirstName,
			  * "Tell us your first name", FirstName);
			  * 
			  * //Click on Add your name button
			  * gl.clickbuttonUsingSelenium(Vype_CommonXpath.btnAddName,
			  * "Add your name");
			  * 
			  * //Verify Engraving Summary page displayed
			  * gl.VerifyPageDisplayed(Vype_CommonXpath.txtEngravingSummary,
			  * "Engraving Summary");
			  * 
			  * //Verify the engraving summary list =
			  * driver.findElements(By.xpath(
			  * "//h4[contains(text(),'Items')]//following-sibling::div//div//div//main"
			  * )); String itemName =""; // List<String> item=new
			  * ArrayList<String>(); for(int i=0;i<list.size();i++){ itemName=
			  * list.get(i).getText(); itemName =
			  * itemName.replaceAll("[\\n\\t ]", " ");
			  * System.out.println(itemName); if( (itemName.contains(Pattern)) ||
			  * (itemName.contains(FontStyle1)) || (
			  * (itemName.contains(FirstName)) ) ){
			  * gl.VerifyObjectDisplayed(Vype_CommonXpath.txtEngravingSummary,
			  * "The image is shown with customizations added: "+itemName); }
			  * 
			  * }
			  */
			 // Click on Add Engraving button
			 gl.fnScrollToView(Vype_CommonXpath.btnAddEngraving);
			 gl.clickUsingJs(Vype_CommonXpath.btnAddEngraving, "Add Engraving ");

			 // Verify it redirects to Engravable ePod product details page
			 // gl.VerifyPageDisplayed(Vype_CommonXpath.wetxtEngravableePod,
			 // "Engravable ePod");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// -----------------------------------------------------------------------------------------------------------
	// Author:-Divya Kumari
	// Date: 06/08/2020
	// ePod Device: select ePod skins
	public void selectePodSkins(String Skin) throws Exception {
		try {

			// Click on ePod skin add button
			/*
			 * gl.clickUsingJs(Vype_CommonXpath.btnAdd,
			 * "+Add button on ePod Skin "); Thread.sleep(5000);
			 */
			gl.fnScrollToView(Vype_CommonXpath.lnkskins);

			gl.clickbutton(Vype_CommonXpath.lnkskins, "click on skins");
			// verify the choose your skin pop up is displayed
			// gl.waitTillElementVisible(Vype_CommonXpath.wetxtChooseSkin);

			// Verify the choose you skin page displayed
			// gl.VerifyPageDisplayed(Vype_CommonXpath.wetxtChooseSkin, "Choose
			// your skin");

			//gl.clickbutton(Vype_CommonXpath.btnbuynow, "Click on buy now");

			// Select any Solstice skin colour
			gl.clickbuttonUsingSelenium(Vype_CommonXpath.skintype(Skin), "Skin selected is: " + Skin);

			gl.clickUsingJs(Vype_CommonXpath.buynow, "click buynow");

			/*
			 * //Verify the price after adding skin String str1 =
			 * gl.getText(Vype_CommonXpath.txtSkinColorPrice);
			 * gl.VerifyElementVisible(Vype_CommonXpath.txtSkinColorPrice,
			 * "Total value is " + str1 +" after selecting skin colour");
			 * 
			 * 
			 * //click on Add button
			 * gl.clickbuttonUsingSelenium(Vype_CommonXpath.btnSkinColorAdd,
			 * "Add");
			 */

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// -----------------------------------------------------------------------------------------------------------
	// Author:-Divya Kumari
	// Date: 06/08/2020
	// Verify items in cart
	public void verifyItemsInCartPage() throws Exception {
		try {

			List<WebElement> list;

			// Verify all the product details in cart page
			list = driver.findElements(By.xpath("//*[contains(text(),'Product')]/following::div[contains(@class,'Product__Container')][1]//strong[contains(@class,'ProductName')]"));
			System.out.println("Total number of items in cart page is: " + list.size());
			for (int a = 0; a < list.size(); a++) {
				String itemName = list.get(a).getText();
				System.out.println("Product Details is:" + itemName);
				gl.VerifyObjectDisplayed(Vype_Cart.pgCart, itemName + " is displayed in product Details page ");

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// -----------------------------------------------------------------------------------------------------------
	// Author:-Divya Kumari
	// Date: 06/08/2020
	// Add cartridges for engraved device
	public void addCartridgesforEngravedDevice(String flavour, String num) throws Exception {
		try {

			// Click on Yes Please button
			// gl.clickbuttonUsingSelenium(Vype_CommonXpath.btnYesPlease, "Yes
			// please");

			// Verify that flavour cartridges is displayed
			/*
			 * gl.VerifyObjectDisplayed(Vype_CommonXpath.
			 * btnFlavour,"Flavour Cartridge displayed");
			 * 
			 * gl.ScrollPageDown();
			 * 
			 * gl.ScrollPageDown();
			 * 
			 * gl.ScrollPageDown();
			 * 
			 * gl.ScrollPageDown(); gl.ScrollPageDown(); gl.ScrollPageDown();
			 * gl.ScrollPageDown();
			 */

			gl.fnScrollToView(Vype_CommonXpath.lnkpods);
			gl.clickbutton(Vype_CommonXpath.lnkpods, "Click on pods");

			gl.clickLink(Vype_CommonXpath.lnkAllFlavoursePodPodsPage(flavour), "Flavour selected is: " + flavour);
			Thread.sleep(5000);

			// Click on flavour add button
			// gl.clickUsingJs(Vype_CommonXpath.btnPassionFruitAdd(flavour),
			// "+Add button on "+flavour+" flavour");

			// verify the Passion fruit fields POP up is displayed
			// gl.waitTillElementVisible(Vype_CommonXpath.weTxtNicotineStrength);

			// Verify Add dialouge box is invoked
			// gl.VerifyPageDisplayed(Vype_CommonXpath.wetxtlycheeOrchard,
			// "Dialouge box is invoked ");

			// Verify that text "Nicotine Strength" is displayed on Modal.
			gl.fnScrollToView(Vype_CommonXpath.weTxtNicotineStrength);
			gl.VerifyElementVisible(Vype_CommonXpath.weTxtNicotineStrength, "Nicotine Strength");

			// Verify that text "Quantity" is displayed on Modal.
			gl.VerifyElementVisible(Vype_CommonXpath.weTxtQuantity, "Quantity");

			if (num.equals("3")) {

				// Click on "Increment" button from the Nicotine Strength 3%
				gl.clickbutton(Vype_CommonXpath.btnIncrement3percent,
						"Increment button of Nicotine strength 3 Percentage");
			}

			if (num.equals("1.6")) {

				// Click on "Increment" button from the Nicotine Strength 1.6%
				gl.clickbutton(Vype_CommonXpath.btnIncrement1point6percent,
						"Increment button of Nicotine strength 1.6 Percentage");
			}

			if (num.equals("5")) {

				// Click on "Increment" button from the Nicotine Strength 5%
				gl.clickbutton(Vype_CommonXpath.btnIncrement5percent,
						"Increment button of Nicotine strength 5 Percentage");
			}

			Thread.sleep(5000);

			gl.fnScrollToView(Vype_CommonXpath.txtPack);

			// click on Add To Cart.

			gl.clickbutton(Vype_CommonXpath.btnAddToCart, "Add To Cart");

			/*
			 * //Verify the Text 'Total' is displayed. String str =
			 * gl.getText(Vype_CommonXpath.wetxtTotalValue);
			 * gl.VerifyElementVisible(Vype_CommonXpath.wetxtTotalValue,
			 * "Total value is " + str +" after adding nicotine strength");
			 */

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// -----------------------------------------------------------------------------------------------------------
	// Author:-Divya Kumari
	// Date: 10/08/2020
	/// verify one time purchase button and subscribe & save button
	public void verifyOneTimeAndSubscribeButtonforePenPodPage() throws Exception {
		try {

			List<WebElement> list;
			String str = "";

			gl.ScrollPageDown();

			// verify one time purchase button and subscribe & save button
			list = rdriver.findElements(By.xpath("//*[contains(text(),'Choose order type')]/../following-sibling::div[1]//div"));
			System.out.println("1.Number of buttons: " + list.size());
			for (int i = 0; i < list.size(); i++) {
				str = list.get(i).getText();
				gl.VerifyObjectDisplayed(Vype_CommonXpath.txtChooseOrderType, str + " ");
			}

			// Verify the "Nicotine Strength" is displayed
			gl.VerifyElementVisible(Vype_CommonXpath.weTxtNicotineStrength,
					"Text 'Nicotine Strength' from the Flavor detail pagel");

			// Verify the "Quantity" is displayed
			gl.VerifyElementVisible(Vype_CommonXpath.weTxtQuantity, "Text 'Quantity'from the Flavor detail page");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// -----------------------------------------------------------------------------------------------------------
	// Author:-Divya Kumari
	// Date: 11/08/2020
	/// ePen POds: add quantity for subscribe & save option and click subscribe
	// and save button
	public void addSubscribeAndSaveItemforePenPods(String num) throws Exception {
		try {

			String str = "";
			// click on subscribe & save button
			gl.clickUsingJs(Vype_CommonXpath.btnSubscribeSave, "Subscribe & Save ");

			gl.fnScrollToView(Vype_CommonXpath.weTxtQuantity);

			if (num.equals("12")) {
				// Click on Increment '+' button of 12mg/ml
				gl.clickbutton(Vype_CommonXpath.btnIncrement12mgperml, "Increment '+' button of 12mg/ml");
			}
			if (num.equals("0")) {
				// Click on Increment '+' button of 0mg/ml
				gl.clickbutton(Vype_CommonXpath.btnIncrement0mgperml, "Increment '+' button of 0mg/ml");
			}
			if (num.equals("30")) {
				// Click on Increment '+' button of 30mg/ml
				gl.clickbutton(Vype_CommonXpath.btnIncrement30mgperml, "Increment '+' button of 30mg/ml");
			}
			if (num.equals("1.6")) {
				// Click on Increment '+' button of 12mg/ml
				gl.clickbutton(Vype_CommonXpath.btnIncrement1point6percent, "Increment '+' button of 1.6%");
			}
			if (num.equals("3")) {
				// Click on Increment '+' button of 12mg/ml
				gl.clickbutton(Vype_CommonXpath.btnIncrement3percent, "Increment '+' button of 3%");
			}
			if (num.equals("5")) {
				// Click on Increment '+' button of 12mg/ml
				gl.clickbutton(Vype_CommonXpath.btnIncrement5percent, "Increment '+' button of 5%");
			}

			// Click on subscribe and save button
			gl.clickUsingJs(Vype_CommonXpath.btnSave, "Subscribe and save ");

			// Verify mini cart is updated
			str = gl.getText(Vype_CommonXpath.txtnumber);
			gl.VerifyObjectDisplayed(Vype_CommonXpath.txtnumber, "Cart is updated with " + str + " number ");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// -----------------------------------------------------------------------------------------------------------
	// Author:-Divya Kumari
	// Date: 11/08/2020
	//// Verify the "Subscriptions" and "One Time purchases" orders are shown
	// separately in the Cart's Order Summary.
	public void verifyOneTimeAndSubscribeSaveInCartPage() throws Exception {
		try {

			List<WebElement> list;
			String str = "";
			list = driver.findElements(By.xpath("//*[contains(@class,'Total__Section')]//strong//span"));
			for (int i = 0; i < list.size(); i++) {
				str = list.get(i).getText();
				gl.VerifyElementPresent(Vype_Cart.txtSubscription, str + " ");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// -----------------------------------------------------------------------------------------------------------
	// Author:-Divya Kumari
	// Date: 11/08/2020
	// Verify Under Subscriptions & One time purchase Product, Quantity and
	// price are displayed at the left side of the page
	public void verifyProductDetailsforOneTimeAndSubscribeSaveInCartPage() throws Exception {
		try {

			List<WebElement> list;
			list = driver.findElements(By.xpath(
					"(//*[contains(text(),'Not ready to checkout? ')])/../../following-sibling::div//main//div//h4/following-sibling::div[2]"));
			for (int a = 0; a < list.size(); a++) {
				String itemName = list.get(a).getText();
				System.out.println("Product Details is:" + itemName);
				gl.VerifyObjectDisplayed(Vype_Cart.txtSubscription, itemName + " is present in Your Cart ");

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// -----------------------------------------------------------------------------------------------------------

	// Author:-Harsha Kumar

	public void clickAndVerifyLimitedEditionEpoddevice() throws Exception {
		try {

			// Click the buy now button of engravable device tile
			gl.clickbutton(Vype_CommonXpath.btnLimitedEditionepodBuynow, "Buy Now - Limited edition");
			// gl.scrollToView(Vype_CommonXpath.pglimitededition);
			gl.fnScrollToView(Vype_CommonXpath.pglimitededition);

			// Verify Engravable pods page is displayed
			gl.VerifyPageDisplayed(Vype_CommonXpath.pglimitededition, "limited edition Epod");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// -----------------------------------------------------------------------------------------------------------
	// Author:-Divya Kumari
	// Date: 11/08/2020
	// Verify the cart summary section of Subscription orders and one time
	// purchase is displayed
	public void verifyCartSummaryforSubscriptionAndOneTimeOrders() throws Exception {
		try {

			List<WebElement> list;
			String str = "";

			// Verify the cart summary section of Subscription orders is
			// displayed
			list = driver.findElements(By.xpath("//*[contains(text(),'Subscription')]/../following-sibling::div"));
			System.out.println(list.size());
			for (int i = 0; i < list.size(); i++) {
				str = list.get(i).getText();
				gl.VerifyElementVisible(Vype_CommonXpath.txtShiping, "Subscription details: " + str + " ");
			}

			// Verify the cart summary section of one time purchase is displayed
			list = driver.findElements(
					By.xpath("(//*[contains(text(),'One time purchase')])[2]/../../following-sibling::div"));
			System.out.println(list.size());
			for (int i = 0; i < list.size(); i++) {
				str = list.get(i).getText();
				gl.VerifyElementVisible(Vype_CommonXpath.txtShiping, "one time purchase details: " + str + " ");
			}

			// VErify checkout button is displayed
			gl.VerifyObjectDisplayed(Vype_Cart.btnCheckOut, "Cart Page - Check Out");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// -----------------------------------------------------------------------------------------------------------
	// Author:-Divya Kumari
	// Date: 11/08/2020
	// Verify the cart summary section of Subscription orders is displayed
	public void verifyCartSummaryforSubscriptionOrder() throws Exception {
		try {

			List<WebElement> list;
			String str = "";

			// Verify the cart summary section of Subscription orders is
			// displayed
			list = driver.findElements(By.xpath("(//*[contains(text(),'Subscription')])[6]/../following-sibling::div"));
			System.out.println(list.size());
			for (int i = 0; i < list.size(); i++) {
				str = list.get(i).getText();
				gl.VerifyElementVisible(Vype_CommonXpath.txtShiping, "Subscription details: " + str + " ");
			}

			// VErify checkout button is displayed
			gl.VerifyObjectDisplayed(Vype_Cart.btnCheckOut, "Cart Page - Check Out");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// -----------------------------------------------------------------------------------------------------------
	// Author:-Divya Kumari
	// Date: 11/08/2020
	// Verify the order summary section of Subscription orders and one time
	// purchase is displayed in billing page
	public void verifyOrderSummaryInBillingPage() throws Exception {
		try {

			List<WebElement> list;
			String str = "";

			// gl.fnScrollToView(Vype_CheckOut.weChkoxIhaveReadTandC);

			gl.ScrollPageDown();
			gl.ScrollPageDown();
			gl.ScrollPageDown();
			gl.ScrollPageDown();

			// Verify the order summary section of Subscription orders is
			// displayed
			list = driver.findElements(By.xpath("(//*[contains(text(),'Subscription')])[4]/../following-sibling::div"));
			System.out.println(list.size());
			for (int i = 0; i < list.size(); i++) {
				str = list.get(i).getText();
				gl.VerifyElementVisible(Vype_CheckOut.weChkoxIhaveReadTandC, "Subscription details: " + str + " ");
			}

			// Verify the order summary section of one time purchase is
			// displayed
			list = driver.findElements(
					By.xpath("(//*[contains(text(),'One time purchase')])[1]/../../following-sibling::div"));
			System.out.println("One time purchase billing details size is: " + list.size());
			String str1 = Integer.toString(list.size());
			if (str1 != null) {
				for (int i = 0; i < list.size(); i++) {
					str = list.get(i).getText();
					gl.VerifyElementVisible(Vype_CheckOut.weChkoxIhaveReadTandC,
							"one time purchase details: " + str + " ");
				}

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// -----------------------------------------------------------------------------------------------------------
	// Author:-Divya Kumari
	// Date: 11/08/2020
	// Cancel active subscription
	public void cancelActiveSubscription() throws Exception {
		try {

			String str = "";
			List<WebElement> list;

			// Verify the user is redirected to the user account page, by
			// default in Rewards page
			gl.VerifyObjectDisplayed(Vype_SubscriptionLanding.txtRewards, "Rewards ");

			gl.VerifyElementVisible(Vype_SubscriptionLanding.txtOrders, "Orders ");
			gl.VerifyElementVisible(Vype_SubscriptionLanding.txtSubscription, "Subscription ");
			gl.VerifyElementVisible(Vype_SubscriptionLanding.txtProfile, "Profile ");

			// Click on the Subscriptions section
			gl.clickbuttonUsingSelenium(Vype_SubscriptionLanding.txtSubscription, "Subscription ");

			// Verify the user is able to see the Active Subscriptions with
			// date,payment,address,selection
			list = driver.findElements(By.xpath("//*[contains(@class,'Summary__Main-sc-16pa2df-2 zyPBr')]"));
			// "//*[contains(@class,'FieldsetItem__Container')]"));
			System.out.println("Subscription includes: " + list.size());
			for (int i = 0; i < list.size(); i++) {
				str = list.get(i).getText();
				str = str.replaceAll("[\\n\\t]", " ");
				gl.VerifyElementVisible(Vype_SubscriptionLanding.txtSubscription, str + " ");
			}

			/*
			 * list = driver.findElements(By.
			 * xpath("//*[@class='FieldsetItem__Container-jou4ig-0 fnyCsy u-1-1']"
			 * )); System.out.println("Subscription includes: "+list.size());
			 * for(int i=0;i<list.size();i++){ str = list.get(i).getText(); str
			 * = str.replaceAll("[\\n\\t]", " ");
			 * gl.VerifyElementVisible(Vype_SubscriptionLanding.txtSubscription,
			 * str+ " "); }
			 */
			// Verify the "Edit" link is present
			gl.VerifyElementVisible(Vype_SubscriptionLanding.txtEditDetails, "Edit ");

			// click on edit button
			gl.clickLink(Vype_SubscriptionLanding.txtEditDetails, "Edit ");

			// Click on address button to verify it is editable
			gl.clickbuttonUsingSelenium(Vype_SubscriptionLanding.txtShippingAddress,
					"Shipping address field is editable ");

			gl.clickLink(Vype_SubscriptionLanding.lnkBack, "Back Link ");

			gl.ScrollPageDown();
			gl.ScrollPageDown();
			// Click on +/- to add or remove quantity
			// gl.clickbuttonUsingSelenium(Vype_Cart.btnPlus, "+ ");

			// Verify the links for Pause or stop Subscription is displayed
			str = gl.getText(Vype_SubscriptionLanding.lnkPauseSubscription);
			gl.VerifyElementVisible(Vype_SubscriptionLanding.lnkPauseSubscription, str + " ");

			// Click on Pause link
			gl.clickLink(Vype_SubscriptionLanding.lnkPause, "Pause ");

			// Verify Pause subscription pop up is displayed
			str = gl.getText(Vype_SubscriptionLanding.txtPausePopUp);
			str = str.replaceAll("[\\n\\t]", " ");
			gl.VerifyObjectDisplayed(Vype_SubscriptionLanding.txtPausePopUp, "Pop Up " + str + " ");

			// click on no return button
			gl.clickbuttonUsingSelenium(Vype_SubscriptionLanding.txtNoReturn, "No, return ");

			// VErify main page is displayed
			gl.VerifyObjectDisplayed(Vype_SubscriptionLanding.btnDiscardChanges, "Discard changes ");

			// Click on Pause link
			gl.clickLink(Vype_SubscriptionLanding.lnkPause, "Pause ");

			// Verify Pause subscription pop up is displayed
			gl.VerifyObjectDisplayed(Vype_SubscriptionLanding.txtPausePopUp, "Pause subscription pop up ");

			// Click on "Yes, pause the subscription" button
			gl.clickbuttonUsingSelenium(Vype_SubscriptionLanding.btnYesPause, "Yes, pause subscription ");

			Thread.sleep(5000);

			// Verify your subscription has been successfully updated is
			// displayed
			gl.VerifyPageDisplayed(Vype_SubscriptionLanding.txtYourSubscriptionPaused, "Subscription ");

			// VErify paused subscription is displayed
			gl.VerifyElementVisible(Vype_SubscriptionLanding.txtPaused, "Paused Subscription");

			// Verify the paused Subscriptions is displayed with
			// date,payment,address,selection
			list = driver.findElements(By.xpath("//*[contains(@class,'Summary__Inner-sc-16pa2df-1 liDUyl')]"));
			// "//*[contains(@class,'FieldsetItem__Container')]"));
			System.out.println("Subscription includes: " + list.size());
			for (int i = 0; i < list.size(); i++) {
				str = list.get(i).getText();
				str = str.replaceAll("[\\n\\t]", " ");
				gl.VerifyElementVisible(Vype_SubscriptionLanding.txtPaused, str + " ");
			}

			/*
			 * list = driver.findElements(By.
			 * xpath("//*[@class='FieldsetItem__Container-jou4ig-0 fnyCsy u-1-1']"
			 * )); System.out.println("Subscription includes: "+list.size());
			 * for(int i=0;i<list.size();i++){ str = list.get(i).getText(); str
			 * = str.replaceAll("[\\n\\t]", " ");
			 * gl.VerifyElementVisible(Vype_SubscriptionLanding.txtPaused,str+
			 * " "); }
			 */

			// Verify the "Edit" link is present
			gl.VerifyElementVisible(Vype_SubscriptionLanding.txtEditDetails, "Edit ");

			// click on edit button
			gl.clickLink(Vype_SubscriptionLanding.txtEditDetails, "Edit ");

			gl.ScrollPageDown();

			// Click on address button to verify it is editable
			gl.clickbuttonUsingSelenium(Vype_SubscriptionLanding.txtShippingAddress,
					"Shipping address field is editable ");

			gl.clickLink(Vype_SubscriptionLanding.lnkBack, "Back ");

			gl.ScrollPageDown();
			gl.ScrollPageDown();

			// Click on +/- to add or remove quantity
			// gl.clickbuttonUsingSelenium(Vype_Cart.btnPlus, "+ ");

			// Verify the links cancel Subscription is displayed
			str = gl.getText(Vype_SubscriptionLanding.lnkCancelSubscription);
			gl.VerifyElementVisible(Vype_SubscriptionLanding.lnkCancelSubscription, str + " ");

			/*
			 * //Verify Unpause and save changes button displayed
			 * gl.VerifyObjectDisplayed(Vype_SubscriptionLanding.btnUnpauseSave,
			 * "Unpause save changes ");
			 * 
			 * //Click on discard changes
			 * gl.clickbuttonUsingSelenium(Vype_SubscriptionLanding.
			 * btnDiscardChanges,"Discard changes ");
			 * 
			 * gl.ScrollPageUp(); gl.ScrollPageUp();
			 * 
			 * //Verify the "Edit" link is present
			 * gl.VerifyElementVisible(Vype_SubscriptionLanding.txtEdit,
			 * "Edit ");
			 * 
			 * //click on edit button
			 * gl.clickLink(Vype_SubscriptionLanding.txtEdit, "Edit ");
			 * 
			 * //Click on address button to verify it is editable
			 * gl.clickbuttonUsingSelenium(Vype_SubscriptionLanding.
			 * txtShippingAddress, "Shipping address field is editable ");
			 * gl.ScrollPageDown(); gl.ScrollPageDown();
			 * 
			 * //Click on +/- to add or remove quantity
			 * gl.clickbuttonUsingSelenium(Vype_Cart.btnPlus, "+ ");
			 * 
			 * //Verify the links cancel Subscription is displayed str =
			 * gl.getText(Vype_SubscriptionLanding.lnkCancelSubscription);
			 * gl.VerifyElementVisible(Vype_SubscriptionLanding.
			 * lnkCancelSubscription, str + " ");
			 * 
			 * //Verify Unpause and save changes button displayed
			 * gl.VerifyObjectDisplayed(Vype_SubscriptionLanding.btnUnpauseSave,
			 * "Unpause save changes ");
			 * 
			 * //click on Unpause and save changes button
			 * gl.clickbuttonUsingSelenium(Vype_SubscriptionLanding.
			 * btnUnpauseSave, "Unpause save changes "); Thread.sleep(5000);
			 * 
			 * //Verify your subscription has been successfully updated is
			 * displayed gl.VerifyPageDisplayed(Vype_SubscriptionLanding.
			 * txtYourSubscriptionPaused, "Subscription ");
			 * 
			 * //Verify Active subscription is displayed
			 * 
			 * gl.VerifyElementVisible(Vype_SubscriptionLanding.
			 * txtActiveSubscription, "Active Subscription ");
			 * 
			 * //Verify the "Edit" link is present
			 * gl.VerifyElementVisible(Vype_SubscriptionLanding.txtEdit,
			 * "Edit ");
			 * 
			 * //click on edit button
			 * gl.clickLink(Vype_SubscriptionLanding.txtEdit, "Edit ");
			 * 
			 * //Click on address button to verify it is editable
			 * gl.clickbuttonUsingSelenium(Vype_SubscriptionLanding.
			 * txtShippingAddress, "Shipping address field is editable ");
			 * 
			 * gl.ScrollPageDown(); gl.ScrollPageDown();
			 * 
			 * //Click on +/- to add or remove quantity
			 * gl.clickbuttonUsingSelenium(Vype_Cart.btnPlus, "+ ");
			 * 
			 * //Verify the links for Pause or stop Subscription is displayed
			 * str = gl.getText(Vype_SubscriptionLanding.lnkPauseSubscription);
			 * gl.VerifyElementVisible(Vype_SubscriptionLanding.
			 * lnkPauseSubscription, str + " ");
			 */
			// Click on Cancel subscription link
			gl.clickLink(Vype_SubscriptionLanding.lnkCancelSubscription, "Cancel ");

			// Verify the "Cancel subscription" pop up modal is displayed with
			// the text
			str = gl.getText(Vype_SubscriptionLanding.txtCancelPopUp);
			str = str.replaceAll("[\\n\\t]", " ");
			gl.VerifyObjectDisplayed(Vype_SubscriptionLanding.txtCancelPopUp, str + "pop up ");

			// click on no return button
			gl.clickbuttonUsingSelenium(Vype_SubscriptionLanding.txtNoReturn, "No, return ");

			// VErify main page is displayed
			gl.VerifyObjectDisplayed(Vype_SubscriptionLanding.btnDiscardChanges, "Discard changes ");

			// Click on Cancel subscription link
			gl.clickLink(Vype_SubscriptionLanding.lnkCancelSubscription, "Cancel ");

			// Verify the "Cancel subscription" pop up modal is displayed with
			// the text
			str = gl.getText(Vype_SubscriptionLanding.txtCancelPopUp);
			str = str.replaceAll("[\\n\\t]", " ");
			gl.VerifyObjectDisplayed(Vype_SubscriptionLanding.txtCancelPopUp, str + "pop up ");

			// Click on " Cancel subscription" button
			gl.clickbuttonUsingSelenium(Vype_SubscriptionLanding.btnYesCancel, "Yes, Cancel ");

			// Verify the "Subscription" page will reflect the completion by
			// showing no subscriptions on the Subscription page.
			str = gl.getText(Vype_SubscriptionLanding.txtNoSubscription);
			gl.VerifyObjectDisplayed(Vype_SubscriptionLanding.txtNoSubscription, str + " ");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// -----------------------------------------------------------------------------------------------------------
	// Author:-Divya Kumari
	// Date: 25/08/2020
	// Checkout from your cart page to submit order page via direct to post
	// office
	public void checkoutAndSubmitOrderviaDirecttoPostOffice(String UserCardNumber, String UserCardExpiryDate,
			String UserCardCVV, String UserCardFullName, String PostCode) throws Exception {
		try {
			// Click on 'Check Out' button from the Cart Page.
			gl.clickUsingJs(Vype_Cart.btnCheckOut, "Cart Page - Check Out");

			// Verify that Check Out Page is displayed
			gl.VerifyPageDisplayed(Vype_CheckOut.pgCheckOut, "Check Out");

			// Click on Direct to Post Office
			gl.clickElement(Vype_CommonXpath.weDirectToPostOffice, "Direct to Post Office");

			gl.VerifyElementVisible(Vype_CommonXpath.txtPostalCode, "Postal Code");

			gl.VerifyElementVisible(Vype_CommonXpath.txtSearchBox, "Search Box");

			String PostalCode = gl.getAttributeValue(Vype_CommonXpath.txtPostalCode, "value");
			System.out.println("Postal code pre populated is: " + PostalCode);

			if (PostCode == "SK") {
				gl.inputText(Vype_CommonXpath.txtPostalCode, "Enter postal code", "S7K 1M1");
			}
			if (PostCode == "AB") {
				gl.inputText(Vype_CommonXpath.txtPostalCode, "Enter postal code", "T6A 0J1");
			}
			if (PostCode == "ON") {
				gl.inputText(Vype_CommonXpath.txtPostalCode, "Enter postal code", "M4L 3Y8");
			}
			if (PostCode == "PEI") {
				gl.inputText(Vype_CommonXpath.txtPostalCode, "Enter postal code", "C1A 2C6");
			}
			if (PostCode == "MB") {
				gl.inputText(Vype_CommonXpath.txtPostalCode, "Enter postal code", "R6W 2T3");
			}
			if (PostCode == "BC") {
				gl.inputText(Vype_CommonXpath.txtPostalCode, "Enter postal code", "V2R 4H2");
			}
			if (PostCode == "NB") {
				gl.inputText(Vype_CommonXpath.txtPostalCode, "Enter postal code", "E3B 1R4");
			}
			if (PostCode == "NFLD") {
				gl.inputText(Vype_CommonXpath.txtPostalCode, "Enter postal code", "A1V 1L7");
			}

			gl.clickElement(Vype_CommonXpath.txtSearchBox, "Search Box ");

			gl.VerifyElementVisible(Vype_CommonXpath.txtAddress, "Address ");

			gl.ScrollPageDown();
			gl.ScrollPageDown();

			// Click on 'Go to delivery' button
			gl.clickUsingJs(Vype_CheckOut.btnGoToDelivery, "Go to delivery");

			gl.VerifyElementVisible(Vype_CommonXpath.txtOrderSummary, "Order Summary");

			// Click on 'Go to Billing' button
			gl.clickUsingJs(Vype_CheckOut.btnGoToBilling, "Go to billing");

			// Check if Card details are Not filled, Fill the card details
			if (gl.VerifyElementVisible(Vype_CheckOut.txtCardNumber, "NO")) {

				// Enter the Card Number
				gl.inputText(Vype_CheckOut.txtCardNumber, "Enter the Card Number", UserCardNumber);

				// Enter the Card Expire Date
				gl.inputText(Vype_CheckOut.txtCardExpiryDate, "Enter the Card Expiry Date", UserCardExpiryDate);

				// Enter the Card CVV
				gl.inputText(Vype_CheckOut.txtCVV, "Enter the Card CVV", UserCardCVV);

				// Enter the Card Name
				gl.inputText(Vype_CheckOut.txtNameOnCard, "Enter the Card Name", UserCardFullName);

				// Select the check box "Save credit card details for future
				// payments
				// gl.selectCheckbox(Vype_CheckOut.chkboxSaveCreditCardDetails,
				// "Select the checkbox 'Save credit card details for future
				// payments'");

			}

			if (gl.getAttributeValue(Vype_CheckOut.txtAddress, "value").isEmpty()) {
				gl.inputText(Vype_CheckOut.txtAddress, "Address ", "123");
				String add = gl.getText(Vype_CheckOut.txtdropdownaddress);
				System.out.println("address selected is: " + add);
				gl.clickUsingJs(Vype_CheckOut.txtdropdownaddress, add);

			} else
				gl.VerifyPageDisplayed(Vype_CheckOut.txtAddress, "Address ");
			/*
			 * //If check box Billing address is same as Shipping Address is not
			 * selected then select if(!gl.IsCheckboxSelected(Vype_CheckOut.
			 * chkboxBillingAddressSameAsShippingAddress,
			 * "check box Billing address is same as Shipping Address ")){
			 * 
			 * //In some scenarios this check box will not be visible, so if it
			 * is visible we are selecting it.
			 * if(gl.VerifyElementVisible(Vype_CheckOut.
			 * chkboxBillingAddressSameAsShippingAddress, "NO")){
			 * gl.selectCheckbox(Vype_CheckOut.
			 * chkboxBillingAddressSameAsShippingAddress,
			 * "check box Billing address is same as Shipping Address"); }
			 * 
			 * }
			 */

			// Click the 'I have read the Terms & Conditions' check box
			gl.clickbutton(Vype_CheckOut.weChkoxIhaveReadTandC, "I have read the Terms and conditions checkbox");

			// Click on "Submit Order" button
			gl.clickbutton(Vype_CheckOut.btnSubmitOrder, "Submit Order");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// -----------------------------------------------------------------------------------------------------------
	// Author:-Divya Kumari
	// Date: 26/08/2020
	// ePen Pods: Add one time item to cart from ePen Pods home page
	public void chooseOrderTypefromePenPodsHomePage(String Flavour, String num) throws Exception {
		try {
			// Click on one time button------------Removed in new UI - 4th Sep
			// 2020
			// gl.clickbutton(Vype_CommonXpath.btnOneTime, "One time ");

			gl.ScrollPageDown();
			gl.ScrollPageDown();

			// Pass 0, 12 or 30 inplace of num in your script
			// gl.clickUsingJs(Vype_CommonXpath.btnNicotine(num), "Nicotine
			// strength selected is: "+ num);

			// click on + button
			gl.clickUsingJs(Vype_CommonXpath.btnforFlavourPlus(Flavour), Flavour + " + button is ");

			String Quantity = gl.getText(Vype_CommonXpath.txtQuantityAdded(Flavour, num));
			gl.VerifyObjectDisplayed(Vype_CommonXpath.txtQuantityAdded(Flavour, num), Quantity + " quantity is added ");

			// verify Add button is enabled
			gl.isEnabled(Vype_CommonXpath.btnAddePenPodsHomePage, "Add ");

			// click on add button
			gl.clickUsingJs(Vype_CommonXpath.btnAddePenPodsHomePage, "Add ");

			gl.waitTillElementVisible(Vype_CommonXpath.txtnumber);

			// Verify mini cart is updated
			String str = gl.getText(Vype_CommonXpath.txtnumber);
			gl.VerifyObjectDisplayed(Vype_CommonXpath.txtnumber, "Mini Cart is updated with: " + str);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// -----------------------------------------------------------------------------------------------------------
	// Author:-Divya Kumari
	// Date: 26/08/2020
	// ePod Pods: Subscribe and add item to cart from ePod Pods home page
	public void chooseSubscribefromePodPodsHomePage(String Flavour, String num) throws Exception {
		try {

			gl.fnScrollToView(Vype_CommonXpath.txtMixAndMatch3Pack);

			// Click on one time button --------removed in new ui---4th sep 2020
			// gl.clickbutton(Vype_CommonXpath.btnSubscribe, "Subscribe ");

			gl.ScrollPageDown();
			gl.ScrollPageDown();

			// Pass 1.6, 3 or 5 in place of num in your script
			// gl.clickUsingJs(Vype_CommonXpath.btnPercentNicotine(num),
			// "Nicotine strength selected is: "+ num);

			// click on + button
			gl.clickbuttonTillElementValueReaches(Vype_CommonXpath.btnforFlavourPlus(Flavour), 3, "+");

			String Quantity = gl.getText(Vype_CommonXpath.txtQuantityAdded(Flavour, num));
			gl.VerifyObjectDisplayed(Vype_CommonXpath.txtQuantityAdded(Flavour, num), Quantity + " quantity is added ");

			// verify Add button is enabled
			gl.isEnabled(Vype_CommonXpath.btnAddePenPodsHomePage, "Add ");

			// click on add button
			gl.clickUsingJs(Vype_CommonXpath.btnAddePenPodsHomePage, "Add ");

			gl.waitTillElementVisible(Vype_CommonXpath.txtnumber);

			// Verify mini cart is updated
			String str = gl.getText(Vype_CommonXpath.txtnumber);
			gl.VerifyObjectDisplayed(Vype_CommonXpath.txtnumber, "Mini Cart is updated with: " + str);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// -----------------------------------------------------------------------------------------------------------
	// Author:-Divya Kumari
	// Date: 27/08/2020
	// Vuse Pods: VUSE Pods page UI for subscribe and save link after clicking
	// on get started button
	public void verifyVusePodsUIforSubscribeAndSave(String name, String Flavour, String num) throws Exception {
		try {

			List<WebElement> list;
			String str = "";

			Thread.sleep(3000);

			// Click on Get started button
			gl.clickUsingJs(Vype_SubscriptionLanding.btnGetStarted2, "Get Started button ");

			// Verify the user is navigated to the new cartridge page i.e,, VUSE
			// PODS Page
			gl.VerifyObjectDisplayed(Vype_CommonXpath.txtVusePods, "Vuse Pods ");

			gl.ScrollPageDown();
			gl.ScrollPageDown();

			// Verify the "ePod" and "ePen" selection options are present under
			// the "Whats your Device?"
			// gl.scrollToView(Vype_CommonXpath.txtWhatsYourDevice);
			gl.VerifyElementVisible(Vype_CommonXpath.btnePod, "ePOD ");
			gl.VerifyElementVisible(Vype_CommonXpath.btnePen, "ePEN ");

			if (name.equals("ePOD")) {

				// Verify different flavours are displayed in seperate Icon
				// boxes in the Vuse pods page
				list = gl.findElementsList(Vype_CommonXpath.weePodFlavours);
				List<String> item = new ArrayList<String>();

				System.out.println("Total number of flavours present is: " + list.size());

				for (int i = 0; i < list.size(); i++) {
					str = list.get(i).getText();
					int a = str.indexOf("$0.00");

					if (a != -1) {
						str = str.substring(0, a);
					}
					item.add(str);
				}
				System.out.println(item);
				gl.VerifyObjectDisplayed(Vype_CommonXpath.btnePen, "Different flavours present are: " + item + " ");

				// Verify each flavour is displayed with the image Icon, flavour
				// name, see details link,Choose nicotine strength with the
				// options (1.6%, 3%, 5%) and ADD button
				list = gl.findElementsList(Vype_CommonXpath.weePodFlavoursDetails);
				List<String> item1 = new ArrayList<String>();

				System.out.println("Details of flavours are: " + list.size());

				for (int i = 0; i < list.size(); i++) {
					str = list.get(i).getText();
					str = new LinkedHashSet<String>(Arrays.asList(str.split("\\s+"))).toString().replaceAll("[\\[\\],]",
							"");
					item1.add(str);
				}
				System.out.println(item1);
				gl.VerifyObjectDisplayed(Vype_CommonXpath.btnePen, "All the links in flavours are: " + item1 + " ");

				// ."-" and "+" button to decrease and increase the quantity
				// gl.fnTotalNumberOfElements(Vype_CommonXpath.btnIncrementDecrement,
				// 20, "- and + button");

				// step 8 and 9

				// Pass 1.6, 3 or 5 in place of num in your script
				// gl.clickUsingJs(Vype_CommonXpath.btnPercentNicotine(num),
				// "Nicotine strength selected is: "+ num);

				// click on + button
				gl.clickbuttonTillElementValueReaches(Vype_CommonXpath.btnforFlavourPlus(Flavour), 3, "+");

				// Verify quantity added after pressing + button
				String Quantity = gl.getText(Vype_CommonXpath.txtQuantityAdded(Flavour, num));
				gl.VerifyObjectDisplayed(Vype_CommonXpath.txtQuantityAdded(Flavour, num),
						Quantity + " quantity is added ");

				// verify Add button is enabled
				gl.isEnabled(Vype_CommonXpath.btnAddVusePodsHomePage, "Add ");

				// click on add button
				gl.clickUsingJs(Vype_CommonXpath.btnAddVusePodsHomePage, "Add ");

				gl.waitTillElementVisible(Vype_CommonXpath.txtnumber);

				// Verify mini cart is updated
				str = gl.getText(Vype_CommonXpath.txtnumber);
				gl.VerifyObjectDisplayed(Vype_CommonXpath.txtnumber, "Mini Cart is updated with: " + str);

			}

			if (name.equals("ePEN")) {

				gl.clickUsingJs(Vype_CommonXpath.btnePen, "ePEN ");

				// Verify different flavours are displayed in seperate Icon
				// boxes in the Vuse pods page
				list = gl.findElementsList(Vype_CommonXpath.weePenFlavours);
				List<String> item = new ArrayList<String>();

				System.out.println("Total number of flavours are: " + list.size());

				for (int i = 0; i < list.size(); i++) {
					str = list.get(i).getText();
					int a = str.indexOf("See");

					if (a != -1) {
						str = str.substring(0, a);
					}
					item.add(str);
				}
				System.out.println(item);
				gl.VerifyObjectDisplayed(Vype_CommonXpath.btnePen, "Different flavours present are: " + item + " ");

				// Verify each flavour is displayed with the image Icon, flavour
				// name, see details link,Choose nicotine strength with the
				// options (0mg/ml, 12mg/ml, 30mg/ml) and ADD button
				list = gl.findElementsList(Vype_CommonXpath.weePenFlavoursDetails);
				List<String> item1 = new ArrayList<String>();

				System.out.println("Details of flavours are: " + list.size());

				for (int i = 0; i < list.size(); i++) {
					str = list.get(i).getText();
					str = new LinkedHashSet<String>(Arrays.asList(str.split("\\s+"))).toString().replaceAll("[\\[\\],]",
							"");
					item1.add(str);
				}
				System.out.println(item1);
				gl.VerifyObjectDisplayed(Vype_CommonXpath.btnePen, "All the links in flavours are: " + item1 + " ");

				// ."-" and "+" button to decrease and increase the quantity
				// gl.fnTotalNumberOfElements(Vype_CommonXpath.btnIncrementDecrementforePen,
				// 8, "- and + button");

				// Pass 0, 12 and 30 in place of num in your script
				// gl.clickUsingJs(Vype_CommonXpath.btnNicotine(num), "Nicotine
				// strength selected is: "+ num);

				// click on + button
				gl.clickbuttonTillElementValueReaches(Vype_CommonXpath.btnforFlavourPlus(Flavour), 3, "+");

				// Verify quantity added after pressing + button
				String Quantity = gl.getText(Vype_CommonXpath.txtQuantityAdded(Flavour, num));
				gl.VerifyObjectDisplayed(Vype_CommonXpath.txtQuantityAdded(Flavour, num),
						Quantity + " quantity is added ");

				gl.ScrollPageDown();
				gl.ScrollPageDown();

				// verify Add button is enabled
				gl.isEnabled(Vype_CommonXpath.btnAddePenPodsHomePage, "Add ");

				// click on add button
				gl.clickUsingJs(Vype_CommonXpath.btnAddePenPodsHomePage, "Add ");

				gl.waitTillElementVisible(Vype_CommonXpath.txtnumber);

				// Verify mini cart is updated
				str = gl.getText(Vype_CommonXpath.txtnumber);
				gl.VerifyObjectDisplayed(Vype_CommonXpath.txtnumber, "Mini Cart is updated with: " + str);

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// -----------------------------------------------------------------------------------------------------------
	// Author:-Divya Kumari
	// Date: 02/09/2020
	// Calculate tax breakdown
	public void calulateTaxBreakdown(String Address) throws Exception {
		try {

			Float percentage;
			String per;
			float per1;
			String GST;
			float GSTvalue;
			String HST;
			float HSTvalue;
			String PST;
			float PSTvalue;

			// Verify the user is redirected to the "Delivery page"
			gl.VerifyPageDisplayed(Vype_SubscriptionLanding.txtCheckout, "Delivery ");

			gl.ScrollPageDown();
			gl.ScrollPageDown();
			
			String ExciseTax;
			String Discount;String subtotal ;
			
			float value=0;
			String str="";
            List<WebElement> list=gl.findElementsList(Vype_CommonXpath.listlines);
            for(int i=0;i<list.size();i++){
            	String str1=gl.getText(Vype_CommonXpath.listlines(i));
            	str=str+str1;
            }
            
            
            if(str.contains("Discount"))
            {
            	subtotal = gl.getText(Vype_CommonXpath.txtSubtotal);
    		    ExciseTax=gl.getText(Vype_CommonXpath.txtExciseTax);
    		    Discount=gl.getText(Vype_CommonXpath.txtDiscount);
    			value = Float.parseFloat(subtotal.substring(1));
    			float value1= Float.parseFloat(ExciseTax.substring(1));
    			float value2=Float.parseFloat(Discount.substring(2));
    			value=value+value1-value2;
            }
            if(!str.contains("Discount"))
            {
            
            	subtotal = gl.getText(Vype_CommonXpath.txtSubtotal);
    		    ExciseTax=gl.getText(Vype_CommonXpath.txtExciseTax);
    			value = Float.parseFloat(subtotal.substring(1));
    			float value1= Float.parseFloat(ExciseTax.substring(1));
    			value=value+value1;
            }
			System.out.println("Subtotal value is: " + value);

			if (Address.contains("ON")) {
				// Calculate HST-13%
				percentage = (float) (0.13 * value);
				System.out.println("Calcuated percentage is:" + percentage);

				per = String.valueOf(percentage);
				per = per.substring(0, 3);

				per1 = Float.parseFloat(per);
				System.out.println(per1);

				HST = gl.getText(Vype_CommonXpath.txtHSTValue);
				HSTvalue = Float.parseFloat(HST.substring(1, 4));
				System.out.println("HST Value is" + HSTvalue);

				if (per1 == HSTvalue) {
					gl.VerifyObjectDisplayed(Vype_CommonXpath.txtHSTValue, "HST tax calculated is " + percentage);
					reportiumClient.reportiumAssert(Vype_CommonXpath.txtHSTValue+ "HST tax calculated is " + percentage,true);
					System.out.println(per1 + " and " + HSTvalue + "are same ");
				}
				else
				{
					reportiumClient.reportiumAssert(Vype_CommonXpath.txtHSTValue+ "HST tax calculated is " + percentage,false);
				}
			}

			if (Address.contains("SK")) {
				// Calculate GST-5%
				percentage = (float) (0.05 * value);
				System.out.println("Calcuated percentage is:" + percentage);

				per = String.valueOf(percentage);
				per = per.substring(0, 3);

				per1 = Float.parseFloat(per);
				System.out.println(per1);

				GST = gl.getText(Vype_CommonXpath.txtGSTValue);
				GSTvalue = Float.parseFloat(GST.substring(1, 4));
				System.out.println("GST Value is" + GSTvalue);

				if (per1 == GSTvalue) {
					gl.VerifyObjectDisplayed(Vype_CommonXpath.txtGSTValue, "GST tax calculated is" + percentage);
					System.out.println(per1 + " and " + GSTvalue + "are same ");
				}
				// Calculate PST-6%
				percentage = (float) (0.06 * value);
				System.out.println("Calcuated percentage is:" + percentage);

				per = String.valueOf(percentage);
				per = per.substring(0, 3);

				per1 = Float.parseFloat(per);
				System.out.println(per1);

				PST = gl.getText(Vype_CommonXpath.txtPSTValue);
				PSTvalue = Float.parseFloat(PST.substring(1, 4));
				System.out.println("PST Value is" + PSTvalue);

				if (per1 == PSTvalue) {
					gl.VerifyObjectDisplayed(Vype_CommonXpath.txtPSTValue, "PST tax calculated is " + percentage);
					System.out.println(per1 + " and " + PSTvalue + "are same ");
				}
			}

			if (Address.contains("BC")) {
				// Calculate GST-6%
				percentage = (float) (0.06 * value);
				System.out.println("Calcuated percentage is:" + percentage);

				per = String.valueOf(percentage);
				per = per.substring(0, 3);

				per1 = Float.parseFloat(per);
				System.out.println(per1);

				GST = gl.getText(Vype_CommonXpath.txtGSTValue);
				GSTvalue = Float.parseFloat(GST.substring(1, 4));
				System.out.println("GST Value is" + GSTvalue);

				if (per1 == GSTvalue) {
					gl.VerifyObjectDisplayed(Vype_CommonXpath.txtGSTValue, "GST tax calculated is: " + percentage);
					System.out.println(per1 + " and " + GSTvalue + "are same ");
				}
				// Calculate PST-20%
				percentage = (float) (0.2 * value);
				System.out.println("Calcuated percentage is:" + percentage);

				per = String.valueOf(percentage);
				per = per.substring(0, 3);

				per1 = Float.parseFloat(per);
				System.out.println(per1);

				PST = gl.getText(Vype_CommonXpath.txtPSTValue);
				PSTvalue = Float.parseFloat(PST.substring(1, 4));
				System.out.println("PST Value is" + PSTvalue);

				if (per1 == PSTvalue) {
					gl.VerifyObjectDisplayed(Vype_CommonXpath.txtPSTValue, "PST tax calculated is: " + percentage);
					System.out.println(per1 + " and " + PSTvalue + "are same ");
				}
			}

			if (Address.contains("MB")) {
				// Calculate GST-5%
				percentage = (float) (0.05 * value);
				System.out.println("Calcuated percentage is:" + percentage);

				per = String.valueOf(percentage);
				per = per.substring(0, 3);

				per1 = Float.parseFloat(per);
				System.out.println(per1);

				GST = gl.getText(Vype_CommonXpath.txtGSTValue);
				GSTvalue = Float.parseFloat(GST.substring(1, 4));
				System.out.println("GST Value is" + GSTvalue);

				if (per1 == GSTvalue) {
					gl.VerifyObjectDisplayed(Vype_CommonXpath.txtGSTValue, "GST tax calculated is: " + percentage);
					System.out.println(per1 + " and " + GSTvalue + "are same ");
				}
				// Calculate PST-7%
				percentage = (float) (0.07 * value);
				System.out.println("Calcuated percentage is:" + percentage);

				per = String.valueOf(percentage);
				per = per.substring(0, 3);

				per1 = Float.parseFloat(per);
				System.out.println(per1);

				PST = gl.getText(Vype_CommonXpath.txtPSTValue);
				PSTvalue = Float.parseFloat(PST.substring(1, 4));
				System.out.println("PST Value is" + PSTvalue);

				if (per1 == PSTvalue) {
					gl.VerifyObjectDisplayed(Vype_CommonXpath.txtPSTValue, "PST tax calculated is: " + percentage);
					System.out.println(per1 + " and " + PSTvalue + "are same ");
				}
			}

			if (Address.contains("NB") || Address.contains("NL") || Address.contains("PE")) {
				// Calculate HST-15%
				percentage = (float) (0.15 * value);
				System.out.println("Calcuated percentage is:" + percentage);

				per = String.valueOf(percentage);
				per = per.substring(0, 3);

				per1 = Float.parseFloat(per);
				System.out.println(per1);

				HST = gl.getText(Vype_CommonXpath.txtHSTValue);
				HSTvalue = Float.parseFloat(HST.substring(1, 4));
				System.out.println("HST Value is" + HSTvalue);

				if (per1 == HSTvalue) {
					gl.VerifyObjectDisplayed(Vype_CommonXpath.txtHSTValue, "HST tax calculated is: " + percentage);
					System.out.println(per1 + " and " + HSTvalue + "are same ");
				}
			}

			if (Address.contains("AB")) {
				// Calculate GST-5%
				percentage = (float) (0.05 * value);
				System.out.println("Calcuated percentage is:" + percentage);

				per = String.valueOf(percentage);
				per = per.substring(0, 3);

				per1 = Float.parseFloat(per);
				System.out.println(per1);

				GST = gl.getText(Vype_CommonXpath.txtGSTValue);
				GSTvalue = Float.parseFloat(GST.substring(1, 4));
				System.out.println("GST Value is" + GSTvalue);

				if (per1 == GSTvalue) {
					gl.VerifyObjectDisplayed(Vype_CommonXpath.txtGSTValue, "GST tax calculated is: " + percentage);
					System.out.println(per1 + " and " + GSTvalue + "are same ");
				}

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// ************************************************************************************************************************************************************
	// -----------------------------------------------------------------------------------------------------------
	// Author:-Sowmya
	// Date: Feb 2021
	// Verify items in Account section
	public void verifylinksInAccountSection() throws Exception {
		try {

			List<WebElement> list;

			// Verify all the product details in cart page
			list = rdriver.findElements(By.xpath("(//*[contains(@class,'AccountDropdown__Item')])"));
			System.out.println("Total number of links in Account section is: " + list.size());
			for (int a = 0; a < list.size(); a++) {
				String itemName = list.get(a).getText();
				Thread.sleep(2000);
				reportiumClient.reportiumAssert(itemName + "Account section item displayed :", true);

				// System.out.println(" Account section link is:" +itemName);

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// -----------------------------------------------------------------------------------------------------------
	// Author:-Sowmya
	// Date: Feb 2021
	// Navigate to specific page
	public void NavigateBackTo(String pageName) {
		try {
			rdriver.get(pageName);
			Thread.sleep(2000);
			// Verify whether desired page
			String desiredPage = gl.getCurrentUrl();
			gl.fnCompareText(pageName, desiredPage);
		}

		catch (Exception e) {
			e.printStackTrace();
		}
	}

	// ****************************************************************************************************************************************************************
	// Author:-Sowmya
	// Date: Feb 2021
	// Verify Savings Information

	public void verifySavingsInformationIcon() {
		try {
			List<WebElement> list;

			// Verify all the product details in cart page
			list = driver.findElements(By.xpath("//*[contains(@class,'Stats__Help')]"));
			System.out.println("Total number of information icons is: " + list.size());
			for (int a = 0; a < list.size(); a++) {

				String itemName = list.get(a).getAttribute("data-tip");
				reportiumClient.reportiumAssert(itemName + "Information icon" + a + "content displayed :", true);


				// System.out.println(" Account section link is:" +itemName);

			}

			// Verify Active credits and used credits
			List<WebElement> list2;

			list2 = driver.findElements(By.xpath("//*[contains(@class,'Credit__Container')]"));

			System.out.println("Total number of information icons is: " + list2.size());
			for (int a = 0; a < list2.size(); a++) {

				String itemName = list2.get(a).getText();

				reportiumClient.reportiumAssert(itemName + "Credits content content displayed :", true);

				// System.out.println(" Account section link is:" +itemName);

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// ***********************************************************************************************************************************
	//// Author:-Sowmya
	// Date: Feb 2021
	// New Launches function

	public void verifySubMenuLinks() throws Exception {
		try {

			List<WebElement> list;

			// Verify all the product details in cart page
			list = driver.findElements(By.xpath("(//*[contains(@class,'MegaMenu__Group')])"));
			System.out.println("Total number of Sub Menu links is: " + list.size());
			for (int a = 0; a < list.size(); a++) {
				String itemName = list.get(a).getText();
				reportiumClient.reportiumAssert(itemName + "Submenu item displayed :", true);
				//gl.LogResult_and_CaptureImage("Pass", "Shop Dropdrown", "Submenu item displayed :" + itemName, "No");
				// System.out.println(" Account section link is:" +itemName);

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifySkinsTypeMenu() throws Exception {
		try {

			List<WebElement> list;

			// Verify all the product details in cart page
			list = driver.findElements(By.xpath("//*[contains(@class,'Nav__Title')]"));
			System.out.println("Total number of Skins Type Menu links is: " + list.size());
			for (int a = 0; a < list.size(); a++) {
				String itemName = list.get(a).getText();
				reportiumClient.reportiumAssert(itemName + "Skins Type Menu item displayed :", true);
				/*gl.LogResult_and_CaptureImage("Pass", "Skins Type Menu", "Skins Type Menu item displayed :" + itemName,
						"No");*/
				// System.out.println(" Account section link is:" +itemName);

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyCorecollectionMenu() throws Exception {
		try {

			List<WebElement> list;

			list = driver.findElements(By.xpath("(//*[contains(@class,'Nav__Collection')])[2]"));
			System.out.println("Total number of Core collection Menu links is: " + list.size());
			for (int a = 0; a < list.size(); a++) {
				String itemName = list.get(a).getText();
				reportiumClient.reportiumAssert(itemName + "Core Collection Menu item displayed :", true);
				// System.out.println(" Account section link is:" +itemName);

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyDesginChallengeMenu() throws Exception {
		try {

			List<WebElement> list;

			list = driver.findElements(By.xpath("(//*[contains(@class,'Nav__Collection')])[3]"));
			System.out.println("Total number of Desgin Challenge Menu Menu links is: " + list.size());
			for (int a = 0; a < list.size(); a++) {
				String itemName = list.get(a).getText();
				reportiumClient.reportiumAssert(itemName + "Desgin Challenge Menu item displayed :", true);

				// System.out.println(" Account section link is:" +itemName);

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyNewLaunchesMenu(By by) throws Exception {
		try {

			List<WebElement> lists;

			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.visibilityOfElementLocated(by));
			lists = driver.findElements(by);
			System.out.println("Total number of Menu links is: " + lists.size());
			//JavascriptExecutor js = (JavascriptExecutor) driver;
			for (int a = 0; a < lists.size(); a++) {
				String itemName = lists.get(a).getText();

				reportiumClient.reportiumAssert(itemName + "Menu item displayed : :", true);
				//gl.LogResult_and_CaptureImage("Pass", "Menu item", " Menu item displayed :" + itemName, "No");
				// click on each menu item
				/*
				 * gl.clickUsingJs(By.
				 * xpath("(//a[contains(@class, 'Nav__ItemLabel')])['"+a+"']"),
				 * itemName); Thread.sleep(2000); gl.browserBack();
				 */
				// Respective Pod should be displayed and the price of the pod
				// should be displayed
				// gl.VerifyPageDisplayed(By.xpath("//h1[text()='"+itemName+"']"),
				// itemName+ "page is displayed");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyLimitedEditionMenu() throws Exception {
		try {

			List<WebElement> list;

			list = driver.findElements(By.xpath("(//*[contains(@class,'Nav__Collection')])[1]"));
			System.out.println("Total number of Limited Edition Menu links is: " + list.size());
			for (int a = 0; a < list.size(); a++) {
				String itemName = list.get(a).getText();
				reportiumClient.reportiumAssert(itemName + "Limited Edition Menu item displayed:", true);
				/*gl.LogResult_and_CaptureImage("Pass", "Limited Edition Menu",
						"Limited Edition Menu item displayed :" + itemName, "No");*/
				// System.out.println(" Account section link is:" +itemName);

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// -----------------------------------------------------------------------------------------------------------
	// Author:-Divya Kumari
	// Date: 28/05/2020
	// Shop Skins: navigate to Shop skins page in new launches
	public void navigateToShopSkinsPage() throws Exception {
		try {

			// Hover the mouse on Products link
			gl.HowerMouse(Vype_CommonXpath.lnkShop, "Shop");

			// Click on Skins under ePod section
			gl.clickbutton(Vype_CommonXpath.lnkSkinsEpod, "Skins link under New Launches section ");

			//VErify Skin page is displayed
			gl.VerifyPageDisplayedUsingPagetitle("Vape Skins for your ePod | Vuse Canada");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void navigateToskins()
	{
		try
		{
			gl.HowerMouse(Vype_CommonXpath.lnkShop, "Shop link from the main menu navigation");


			gl.clickLink(Vype_CommonXpath.lnkepodskins, "skins");

			gl.VerifyObjectDisplayed(Vype_CommonXpath.pgskins, "Skins page");

			gl.VerifyElementVisible(Vype_CommonXpath.btnleftarrow, "Left arrow ");

			gl.VerifyElementVisible(Vype_CommonXpath.btnrightarrow, "Right arrow ");

		}
		catch (Exception e){
			e.printStackTrace();
		}

	}

	//-------------------------

	public void addskin(String Skin)
	{
		try
		{

			  // gl.VerifyObjectDisplayed(Vype_CommonXpath.txtCalla);

            // gl.clickUsingJs(Vype_CommonXpath.btnBuyNow, "Buy now");

            // gl.clickbutton(Vype_CommonXpath.lnkcorecollectionsforShopEpod2skin,"core
            // collection");

            Thread.sleep(10000);
            // gl.fnScrollToView(Vype_CommonXpath.txtcorecollection);

            // String str1=gl.getText(Vype_CommonXpath.txtcorecollection);

            // gl.VerifyObjectDisplayed(Vype_CommonXpath.txtcorecollection,"Core
            // Collection");

            // System.out.println(str1);

            // click on shop now
            // gl.clickUsingJs(Vype_CommonXpath.btnshopNow, "Shop now");
            // Thread.sleep(5000);

            // gl.fnScrollToView(Vype_CommonXpath.btnbuynow);
            // gl.clickUsingJs(Vype_CommonXpath.buynow, "Click on buy now");

            // Thread.sleep(5000);

            // click on core collection
            // gl.clickbutton(Vype_CommonXpath.lnkcorecollectionsforShopEpod2skin,"core
            // collection");

            //gl.VerifyObjectDisplayed(Vype_CommonXpath.imgpodSkin(Skin), Skin);

            String Skin1 = Skin.substring(0, 1).toLowerCase();
            Skin = Skin1.concat(Skin.substring(1));

            // Select any skin colour
            gl.clickbuttonUsingSelenium(Vype_CommonXpath.skintype(Skin), "Skin selected is: " + Skin);
            Thread.sleep(5000);

            String s = gl.getText(Vype_CommonXpath.txtskin);

            gl.VerifyObjectDisplayed(Vype_CommonXpath.txtskin, "Skin");

            System.out.println(s + " is highlighted ");

            // gl.clickbutton(Vype_CommonXpath.podSkin(Skin),Skin );

            /*
             * String str=Skin.substring(0,1).toUpperCase(); String Str1=Skin.substring(1);
             * Skin=str.concat(Str1);
             */

            String price = gl.getText(Vype_CommonXpath.txtprice);

            System.out.println("The Price of " + Skin + " is " + price);

            gl.VerifyElementVisible(Vype_CommonXpath.txtprice, price);

            gl.VerifyElementPresent(Vype_CommonXpath.btnPlus, "+ ");

            gl.VerifyElementPresent(Vype_CommonXpath.btnminus, "- ");

            gl.clickbutton(Vype_CommonXpath.btnminus, "- ");
            Thread.sleep(2000);

            //gl.isDisabled(Vype_CommonXpath.buynow, "Buy now");

            // gl.VerifyObjectDisplayed(Vype_CommonXpath.btnBuynow, "Buy now");

            gl.clickbutton(Vype_CommonXpath.btnPlus, "+ ");
            Thread.sleep(2000);

            gl.isEnabled(Vype_CommonXpath.buynow, "Buy now");

            gl.clickbutton(Vype_CommonXpath.buynow, "Buy now");

        } catch (Exception e) {
			e.printStackTrace();
		}

	}


	public void navigateToePodPodsonepoint6()  throws Exception{
		try{
			//Hover the mouse on Products link
			gl.HowerMouse(Vype_CommonXpath.lnkShop, "Shop link from the main menu navigation");

			//Verify the Submenu  ePod is loaded
			gl.VerifyObjectDisplayed(Vype_CommonXpath.lnkonepoint6, "ePod ePod ");

			//Click on Pods link under the ePod section
			gl.clickbutton(Vype_CommonXpath.lnkonepoint6,"Pods from the Epod section");

			//Verify that ePod's pods page is displayed.
			gl.VerifyPageDisplayed(Vype_CommonXpath.pgEpodPods, "ePod Pods");
		}
		catch (Exception e){
			e.printStackTrace();
		}
	}


	public void navigateToePodPodsthreepoint5()  throws Exception{
		try{
			//Hover the mouse on Products link
			gl.HowerMouse(Vype_CommonXpath.lnkShop, "Shop link from the main menu navigation");

			//Verify the Submenu  ePod is loaded
			gl.VerifyObjectDisplayed(Vype_CommonXpath.lnkthreeandfive, "ePod ePod ");

			//Click on Pods link under the ePod section
			gl.clickbutton(Vype_CommonXpath.lnkthreeandfive,"Pods from the Epod section");

			//Verify that ePod's pods page is displayed.
			gl.VerifyPageDisplayed(Vype_CommonXpath.pgEpodPods, "ePod Pods");
		}
		catch (Exception e){
			e.printStackTrace();
		}
	}

	public void selectFlavorandQuantity(String flavor, int quantity)  throws Exception{
        try{


              //Scroll to the flavor
       // gl.fnScrollToView(Vype_CommonXpath.webAllFlavorsePodPage(flavor));

              Thread.sleep(3000);

              //Add required number of quantity for subscription

        gl.clickUsingJs(Vype_CommonXpath.btnqtydecrement(flavor), "Decrement Quantity");

              for (int i = 0; i < quantity; i++) {

              gl.clickUsingJs(Vype_CommonXpath.btnqtyincrement(flavor), "Increment Quantity");
                    Thread.sleep(1000);

              }

              Thread.sleep(2000);

              //Add to subscription Subscription option
        gl.clickbutton(Vype_CommonXpath.btnaddtoSubscription(flavor), "Toggle Subscribe");

              Thread.sleep(1000);

        /*gl.clickbutton(Vype_CommonXpath.webAllFlavorsePodPage(flavor), "Add Product");

              Thread.sleep(5000);*/

        }
        catch (Exception e){
              e.printStackTrace();
        }
  }


	public void CancelActiveSubscription() throws Exception {
		try {

			gl.fnScrollToView(Vype_CommonXpath.txtActiveSubscription);

			// Verify Active subscription is displayed
			gl.VerifyElementVisible(Vype_CommonXpath.txtActiveSubscription, "Active Subscription");

			// Click on Cancel subscription link
			gl.clickLink(Vype_CommonXpath.lnkCancelSubscription, "Cancel");
			Thread.sleep(2000);
			
			//for 1 and 2 test cases in subscription.feature and subscription business workflow and subscription epod business workflow(1,2,3,4)
	//		gl.clickElement(Vype_CommonXpath.lblSubscription,"Close popup");
			
			
			//for rest all subscriptions
			//gl.clickbutton(goVype_Properties.Vype_Common.popup, "Not Now");
			
			boolean b=gl.verifyobjectisnotavailable(Vype_Common.popup);
	        if(b==false)
	        {
	            gl.clickbutton(Vype_Common.popup, "Not now");
	        }

	        if(b==true)
	        {

	        }

	        
			gl.clickLink(Vype_CommonXpath.lnkCancelSubscription, "Cancel");  
			
			
			
			
			
			// Verify cancel subscription pop up modal is displayed.
			gl.VerifyElementVisible(Vype_CommonXpath.txtCancelSubscription, "Cancel Subscription");

			// Verify text "are you sure you want to cancel your recurring
			// subscription".
			gl.VerifyElementPresent(Vype_CommonXpath.txtCancelMessage, "Are you sure want to cancel");

			// Verify yes cancel button.
			gl.VerifyElementVisible(Vype_CommonXpath.lnkYesCancel, "Yes Cancel");
			//gl.clickbutton(goVype_Properties.Vype_Common.popup, "Not Now");

			// Verify no return button.
			gl.VerifyElementVisible(Vype_CommonXpath.lnkNoreturn, "No return");

			// Click on 'x' or no return
			gl.clickbutton(Vype_CommonXpath.lnkNoreturn, "No return");

			// Verify cancel subscription pop up modal is closed.
			gl.VerifyElementVisible(Vype_CommonXpath.txtSubscription, "Subscription");

			// Click on cancel link.
			gl.clickbutton(Vype_CommonXpath.lnkCancel, "Cancel");
			Thread.sleep(2000);
			
			
		    b=gl.verifyobjectisnotavailable(Vype_Common.popup);
	        if(b==false)
	        {
	            gl.clickbutton(Vype_Common.popup, "Not now");
	        }

	        if(b==true)
	        {

	        }
		

			// Verify cancel subscription pop modal is displayed with the text
			// "Are you sure you want to cancel your recurring subscription?
			// This action cannot be undone."
			gl.VerifyElementPresent(Vype_CommonXpath.txtCancelSubscriptionPopup, "Are you sure you want to cancel");

			// Verify yes cancel button.
			gl.VerifyElementPresent(Vype_CommonXpath.lnkYesCancel, "Yes Cancel");

			// Verify no return .
			gl.VerifyElementPresent(Vype_CommonXpath.lnkNoreturn, "No return");

			// Click on yes
			gl.clickbutton(Vype_CommonXpath.lnkYesCancel, "Yes Cancel");

			Thread.sleep(2000);

			// Confirmation of the subscription cancel is displayed
			//gl.VerifyElementVisible(Vype_CommonXpath.txtSubscriptionCancelInfo, "You have no subscription plan yet");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void deletecard() throws Exception {
		try {
			// Hover the mouse on account logged in
			gl.HowerMouse(Vype_CommonXpath.btnAccount, "Post Login Vype Home");

			// Click on my account.
			gl.clickbutton(Vype_Subscription.textMyAccount, "My account");

			//click on delete 
			gl.fnScrollToView(Vype_CommonXpath.deletecard);

			// Click on delete icon
			gl.clickUsingJs(Vype_CommonXpath.deletecard, "delete ");

			//click on delete text
			gl.clickUsingJs(Vype_CommonXpath.txtdelete, "Yes,delete ");

			Thread.sleep(3000);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void checkoutAndSubmitOrder(String UserCardNumber, String UserCardExpiryDate, String UserCardCVV,
			String UserCardFullName) throws Exception {
		try {

			//gl.waitTillElementVisible(Vype_Cart.pgCart);


			gl.fnScrollToView(Vype_Cart.btnCheckOut);
			gl.waitTillElementVisible(Vype_Cart.btnCheckOut);
			Thread.sleep(50000);
			// Click on 'Check Out' button from the Cart Page.
			gl.clickUsingJs(Vype_Cart.btnCheckOut, "Cart Page - Check Out");

			// Verify that Check Out Page is displayed
			//gl.VerifyElementVisible(Vype_CheckOut.pgCheckOut, "Check Out");

			Thread.sleep(2000);

			// Click on Home
			gl.clickLink(Vype_CommonXpath.weHomeAddress, "Home");
			// String
			// totalAmtPaid=gl.getText(Vype_PlatinumProfileTrigger.cartValueTotal);

			gl.ScrollPageDown();

			Thread.sleep(2000);

			// Click on 'Go to delivery' button
			gl.clickUsingJs(Vype_CheckOut.btnGoToDelivery, "Go to delivery");

			/*
			 * 
			 * gl.ScrollPageDown(); gl.ScrollPageDown();
			 * 
			 * String str = gl.getText(Vype_CheckOut.txtFedexNextDay);
			 * gl.VerifyObjectDisplayed(Vype_CheckOut.txtFedexNextDay, str+
			 * " ");
			 * 
			 */

			Thread.sleep(2000);

			//Validate Shipping Is Free
			/*String shippingTxt=gl.getText(Vype_PlatinumProfileTrigger.weShippingValueForSubscriptionInDeliveryPage);
			if(shippingTxt.equalsIgnoreCase("Free")){
				gl.VerifyObjectDisplayed(Vype_PlatinumProfileTrigger.weShippingValueForSubscriptionInDeliveryPage, "Shipping Is Free");
			}*/

			gl.ScrollPageDown();

			// Click on 'Go to Billing' button
			gl.clickUsingJs(Vype_CheckOut.btnGoToBilling, "Go to billing");


		/*	if(gl.isObjectPresent(Vype_CommonXpath.btnDropDownPayment, "DropDown Payment") == true) {

				gl.selectByText(Vype_CommonXpath.btnDropDownPayment, "+ Add new card");


				Thread.sleep(5000);
				//gl.clickUsingJs(By.xpath("(//div[text()='Not Now'])[1]"), "Not now");
				
			
				Thread.sleep(2000); 

				// Enter the Card Number
				gl.inputText(Vype_CheckOut.txtCardNumber, "Enter the Card Number",UserCardNumber);


				gl.ScrollPageDown();

				// Enter the Card Expire Date
				gl.inputText(Vype_CheckOut.txtCardExpiryDate,"Enter the Card Expiry Date", UserCardExpiryDate);

				// Enter the Card CVV 
				gl.inputText(Vype_CheckOut.txtCVV,"Enter the Card CVV", UserCardCVV);

				// Enter the Card Name
				gl.inputText(Vype_CheckOut.txtNameOnCard,"Enter the Card Name", UserCardFullName);

			}

			if(gl.isObjectPresent(Vype_CommonXpath.btnDropDownPayment, "DropDown Payment") == false) {
			
		*/	Thread.sleep(6000);
			
			boolean b=gl.verifyobjectisnotavailable(Vype_Common.popup);
	        if(b==false)
	        {
	            gl.clickbutton(Vype_Common.popup, "Not now");
	        }

	        if(b==true)
	        {

	        }

				gl.inputText(Vype_CheckOut.txtCardNumber, "Enter the Card Number",UserCardNumber);

				// Enter the Card Expire Date 
				gl.inputText(Vype_CheckOut.txtCardExpiryDate,"Enter the Card Expiry Date", UserCardExpiryDate);

				// Enter the Card CVV 
				gl.inputText(Vype_CheckOut.txtCVV,"Enter the Card CVV", UserCardCVV);

				// Enter the Card Name
				gl.inputText(Vype_CheckOut.txtNameOnCard,"Enter the Card Name", UserCardFullName);
				
				gl.clickUsingJs(Vype_CheckOut.chkboxBillingAddressSameAsShippingAddress, "Billing address same as Shipping address");
		//	}



			// If check box Billing address is same as Shipping Address is not
			// selected then select
			/*
			 * if (!gl.IsCheckboxSelected(Vype_CheckOut.
			 * chkboxBillingAddressSameAsShippingAddress,
			 * "check box Billing address is same as Shipping Address ")) {
			 * 
			 * // In some scenarios this check box will not be visible, so if // it is
			 * visible we are selecting it. if (gl.VerifyElementVisible(Vype_CheckOut.
			 * chkboxBillingAddressSameAsShippingAddress, "NO")) {
			 * gl.selectCheckbox(Vype_CheckOut.chkboxBillingAddressSameAsShippingAddress,
			 * "check box Billing address is same as Shipping Address"); }
			 * 
			 * }
			 */

			

			// Click the 'I have read the Terms & Conditions' check box
			gl.clickLink(Vype_CheckOut.weChkoxIhaveReadTandC, "I have read the Terms and conditions checkbox");

			gl.fnScrollToView(Vype_CheckOut.btnSubmitOrder);
			// Click on "Submit Order" button
			gl.clickLink(Vype_CheckOut.btnSubmitOrder, "Submit Order");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// -----------------------------------------------------------------------------------------------------------
	// Author:-Divya Kumari 
	// Date: 04/08/2020
	// 	Updated by Vinod on Sep 22, 2021 to include one argument
	// ePod Pods: select flavour and verify the flavour description
	public void chooseFlavourInePodPodsPage(String flavor) throws Exception {
		try {

			//gl.waitTillElementVisible(Vype_CommonXpath.lnkAllFlavoursePodPodsPage(flavor));
			
			gl.fnScrollToView(Vype_CommonXpath.lnkAllFlavoursePodPodsPage(flavor));
			String str = "";
			// Click on Strawberry flavour link
			gl.clickUsingJs(Vype_CommonXpath.lnkAllFlavoursePodPodsPage(flavor), "Flavor selected is: " + flavor);
			Thread.sleep(10000);			

			gl.VerifyElementVisible(Vype_CommonXpath.txtflavor2(flavor), flavor );


			// Verify strawberry page is displayed
			gl.VerifyElementVisible(Vype_CommonXpath.txtFlavours(flavor), "Flavor Name is: " + flavor);
			gl.fnScrollToView(Vype_CommonXpath.txtFlavoursDescription(flavor));

			Thread.sleep(2000);

			str = gl.getText(Vype_CommonXpath.txtFlavoursDescription(flavor));
			gl.VerifyElementVisible(Vype_CommonXpath.txtFlavoursDescription(flavor),
					"Flavour description is: " + str);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	//Updated by Harsha for BDD Script Development in Sep 2021
	//Adding Device color, Skin and flavor in to the cart
	public void selectDeviceColor_Skin_Flavor(String devicecolour, String skinindex, String flavour) throws Exception {
		try {

			int index = Integer.parseInt(skinindex);

			Thread.sleep(10000);

			// Verify BuyNow - $9.99 button is displayed
			gl.VerifyElementVisible(Vype_CommonXpath.btnbuyNow, " BuyNow - $9.99");

			// Click on BuyNow - $9.99 Button
			gl.clickbutton(Vype_CommonXpath.btnbuyNow, " BuyNow - $16.99");

			Thread.sleep(10000);
			// Verify the "Choose your colour" page is displayed
			gl.VerifyElementVisible(Vype_CommonXpath.txtChooseyourClr, "Choose your Color");

			// Select any colour
			gl.clickUsingJs(Vype_CommonXpath.btnSelectDeviceColor(devicecolour), "colour selected is:" + devicecolour);

			// Verify Text Power on with the VUSE ePod2 section is displayed

			gl.VerifyElementVisible(Vype_CommonXpath.txtPowerOntheVuseePod2,"The Power on with the Vuse ePod2 Section");

			// Click on Add to Cart button
			gl.clickbutton(Vype_CommonXpath.btnAddToCART, "Add to Cart");

			// Verify mini cart is updated
			String str;
			str = gl.getText(Vype_CommonXpath.txtnumber);
			gl.VerifyElementVisible(Vype_CommonXpath.txtnumber, "Cart is updated with " + str + " number ");

			// Scroll to skins
			gl.fnScrollToView(Vype_CommonXpath.LnkSkins);

			gl.clickbutton(Vype_CommonXpath.LnkSkins, "click on skins");

			List<WebElement> list =gl.findElementsList(Vype_CommonXpath.btnSkinSelect);
			list.get(index).click();

			// Click on Add to Cart button
			gl.clickbutton(Vype_CommonXpath.btnSkinsAddToCART, "Add to Cart");

			// Verify Mini cart is updated
			str = gl.getText(Vype_CommonXpath.txtnumber);
			gl.VerifyElementVisible(Vype_CommonXpath.txtnumber, "Cart is updated with " + str + " number ");

			// Click on Add to Cart button
			gl.clickbutton(Vype_CommonXpath.btnChargingCableAddToCART, "Add to Cart");

			// Verify Mini cart is updated
			str = gl.getText(Vype_CommonXpath.txtnumber);
			gl.VerifyElementVisible(Vype_CommonXpath.txtnumber, "Cart is updated with " + str + " number ");

			//Click on Explore button
			gl.clickbutton(Vype_CommonXpath.btnExplore, "Explore");

			// Verify that ePod's pods page is displayed.
			gl.VerifyElementVisible(Vype_CommonXpath.pgEpodPods, "ePod Pods");

			//Select any of the flavor
			gl.clickLink(Vype_CommonXpath.lnkAllFlavoursePodPodsPage(flavour), "Flavour selected is: " + flavour);
			Thread.sleep(5000);

			gl.fnScrollToView(Vype_CommonXpath.weTxtNicotineStrength);
			gl.VerifyElementVisible(Vype_CommonXpath.weTxtNicotineStrength, "Nicotine Strength");

			// Verify that text "Quantity" is displayed on Modal.
			gl.VerifyElementVisible(Vype_CommonXpath.weTxtQuantity, "Quantity");

			//Select 1.6%
			gl.clickUsingJs(Vype_CommonXpath.btn1point6percent1,"Increment button of Nicotine strength 1.6 Percentage");

			Thread.sleep(2000);

			// click on Add To Cart
			gl.clickUsingJs(Vype_CommonXpath.btnAddToCart, "Add To Cart");


		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	// Author:-Harsha Kumar
	// Date: 07/09/2021
	// Add device and go to cart from ePen device page
	public void checkoutanddelivarypage() throws Exception
	{
		String PhoneNum = "9987786567";

		//scroll to checkout page
		gl.fnScrollToView(Vype_Cart.txtsubTotal);

		Thread.sleep(10000);
		// Click on 'Check Out' button from the Cart Page.
		gl.clickUsingJs(Vype_Cart.btnCheckOut, "Cart Page - Check Out");

		Thread.sleep(5000);
		// Verify that Check Out Page is displayed
		gl.VerifyElementVisible(Vype_CheckOut.pgCheckOut, "Check Out");

		Thread.sleep(2000);

		// Click on Home
		gl.clickElement(Vype_CommonXpath.weHomeAddress, "Home");
		// String
		// totalAmtPaid=gl.getText(Vype_PlatinumProfileTrigger.cartValueTotal);

		gl.ScrollPageDown();

		gl.inputText(Vype_CheckOut.txtPhonunum, "Phone num", PhoneNum);

		// Click on 'Go to delivery' button
		gl.clickUsingJs(Vype_CheckOut.btnGoToDelivery, "Go to delivery");

		Thread.sleep(10000);

	}

	//Author:Harsha kumar 
	// Newly Added when migrating to BDD framework
	//Add or modify
	public void AddorModify(String flavour) throws Exception
	{
		//Verify the "Add or modify" link is present
		gl.VerifyElementVisible(Vype_CommonXpath.btnAddmodify, "Add or modify items ");

		gl.clickUsingJs(Vype_CommonXpath.btnAddmodify, "Add or modify items ");

		//Verify Pick your pods page is displayed
		gl.VerifyPageDisplayed(Vype_CommonXpath.txtPickyrPods, "Pick you pods");

		//Scroll to Add button to add pods
		gl.fnScrollToView(Vype_CommonXpath.btnflavor(flavour));

		//Click on Add button to add pods
		gl.clickbutton(Vype_CommonXpath.btnflavor(flavour),"Click on ADD 9$-14$ on ");

		//Verify add modal is displayed
		gl.VerifyElementVisible(Vype_CommonXpath.weTxtQuantity,"Quantity");

		//Click on "Increment" button from the Nicotine Strength 1.6%
		gl.clickbutton(Vype_CommonXpath.btn1point6percent, "Increment button of Nicotine strength 3 Percentage");

		//Click on 'Add' button from the modal
		gl.clickbutton(Vype_CommonXpath.btnAdd1, "Modal - Add");

		String count=gl.getText(Vype_CommonXpath.btnflavor(flavour));

		System.out.println("Quantity :"+count );

		//Verify Product is added under product summary
		gl.VerifyElementVisible(Vype_CommonXpath.btnflavor(flavour), count);

		//Verify Product is added under product summary
		gl.VerifyElementVisible(Vype_CommonXpath.weProdutAdded(flavour),"Product Added in Summary is "+flavour);
	}

	// Verify Subscription confirmation page details
	// Author:-Harsha Kumar
	// Date: 22/09/2021
	public void verifySubscriptionConfirmationPage() throws Exception {
		try {

		    gl.VerifyElementVisible(Vype_CommonXpath.txtsubscriptioncreated, "Subscription created ");

			List<WebElement> list;
			String str="";
			String str1;
			
			//Verify that Active Subscription page displayed
			gl.VerifyElementPresent(Vype_SubscriptionLanding.txtActiveSubscription, "Active Subscription ");

			//Verify the user is able to see the Active Subscriptions with date,payment,address,selection
			list = gl.findElementsList(Vype_SubscriptionLanding.txtDatePayment);
			for(int i=0;i<list.size();i++){
				str = list.get(i).getText();
				str = str.replaceAll("[\\n\\t]", " ");
				gl.VerifyElementVisible(Vype_SubscriptionLanding.txtDatePayment,str+ " ");
			}
			List<WebElement> list2;
			list2 = gl.findElementsList(Vype_CommonXpath.txtsubscribeditems);
			System.out.println("Subscription includes: "+list2.size());
			for(int i=0;i<list2.size();i++){
				str1 = list2.get(i).getText();
				str1 = str1.replaceAll("[\\n\\t]", " ");
				gl.VerifyElementVisible(Vype_CommonXpath.txtsubscribeditems,str1+ " ");
			}

			String total=gl.getText(Vype_CommonXpath.subscriptiontotal);
			gl.VerifyElementPresent(Vype_CommonXpath.subscriptiontotal, total);


		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//Author - Vinod
	//Designed on Oct 5, 2021 for BDD migration
	public void verifySubscriptionDiscount() throws Exception {

		try {

			String qtyValue = gl.getText(Vype_CommonXpath.txtQtyValue);

			String discount = gl.getText(Vype_CommonXpath.weSubscriptionDiscount);
			System.out.println("Quantity is "+qtyValue+ " & Discount is "+discount);


		}catch(Exception e) {
			e.printStackTrace();
		}

	}

	//Author - Vinod
	//Designed on Oct 5, 2021 for BDD migration
	public void verifyQuantityandSubDiscount(By by, int elementValue, String elementname) throws Exception {

		String qtyValue;
		String discount;
		String subDiscount = "";
		int qty = 0;
		try {

			WebDriverWait wait = new WebDriverWait(rdriver, 45);
			wait.until(ExpectedConditions.visibilityOfElementLocated(by));
			WebElement e1 = rdriver.findElement(by);
			if (e1.isDisplayed()) {
				Actions actions = new Actions(rdriver);
				for (int i = 5; i < elementValue; i++) {
					if(i>5) {
						actions.moveToElement(e1).click().build().perform();
						Thread.sleep(2000);
					}
					qtyValue = gl.getText(Vype_CommonXpath.txtQtyValue);
					qty = Integer.parseInt(qtyValue);
					discount = gl.getText(Vype_CommonXpath.weSubscriptionDiscount);
					String[] disc = discount.split(" ");
					subDiscount = disc[1].trim();

					if(qty == i && (qty>4 && qty<10)){

						if(subDiscount.equals("27%")) {
							System.out.println("Quantity is "+qty+ " and Subscription Discount is "+subDiscount);
							reportiumClient.reportiumAssert("Quantity is "+qty+ " and Subscription Discount is "+subDiscount, true);
						}

					}
					else if(qty == i && (qty>9 && qty<15)){

						if(subDiscount.equals("30%")) {
							System.out.println("Quantity is "+qty+ " and Subscription Discount is "+subDiscount);
							reportiumClient.reportiumAssert("Quantity is "+qty+ " and Subscription Discount is "+subDiscount, true);
						}

					}
					else if(qty == i && (qty>14 && qty<30)){

						if(subDiscount.equals("33%")) {
							System.out.println("Quantity is "+qty+ " and Subscription Discount is "+subDiscount);
							reportiumClient.reportiumAssert("Quantity is "+qty+ " and Subscription Discount is "+subDiscount, true);
						}

					}else {
						System.out.println("Quantity is "+qty+ " and Subscription Discount is "+subDiscount);
						reportiumClient.reportiumAssert("Quantity is "+qty+ " and Subscription Discount is "+subDiscount, false);
					}
				}


			}
		} catch (Exception e) {
			// TODO: handle exception
			reportiumClient.reportiumAssert("Quantity is "+qty+ " and Subscription Discount is "+subDiscount, false);

		}
	}


	//Adding device in epod2 core collections
	//Author:Harsha Kumar
	//Date:26/10/2021
	public void selectDeviceColorforepod2Corecollections(String devicecolour) throws Exception {
		try {



			Thread.sleep(10000);
			gl.clickUsingJs(Vype_CommonXpath.lnkcorecollections, "epod2 core collections");

			Thread.sleep(10000);
			// Verify the "Choose your colour" page is displayed
			gl.VerifyElementVisible(Vype_CommonXpath.txtChooseyourClr, "Choose your Color");

			// Select any colour
			gl.clickUsingJs(Vype_CommonXpath.btnSelectDeviceColor(devicecolour), "colour selected is:" + devicecolour);

			// Verify Text Power on with the VUSE ePod2 section is displayed

			gl.VerifyElementVisible(Vype_CommonXpath.pgdevicecolour,"The Power on with the Vuse ePod2 Section");

			for(int i=0;i<4;i++)
			{
				gl.clickUsingJs(Vype_CommonXpath.rightarrow, "-> ");

				gl.VerifyObjectDisplayed(Vype_CommonXpath.weProductImage,"product images ");
			}

			// Click on Add to Cart button
			gl.clickUsingJs(Vype_CommonXpath.btnAddToCART, "Add to Cart");

			// Verify mini cart is updated
			String str;
			str = gl.getText(Vype_CommonXpath.txtnumber);
			gl.VerifyElementVisible(Vype_CommonXpath.txtnumber, "Cart is updated with " + str + " number ");





		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	//Author:Harsha
	//Adding skins to core collections
	//Date:oct 26

	
	//Adding device in Anniversary Boxset
		//Author:Harika
		//Date:10/2/2022
		public void selectDeviceinAnniversaryBoxset() throws Exception {
			try {



				Thread.sleep(10000);
				gl.clickUsingJs(Vype_CommonXpath.lnkAnniversaryboxset, "Anniversary Boxset");

				Thread.sleep(10000);
		
				// Verify Text Power on with the VUSE ePod2 section is displayed

				gl.VerifyElementVisible(Vype_CommonXpath.pgboxset, "NEW LIMITED-EDITION ePod 2");

				for(int i=0;i<4;i++)
				{
					gl.clickUsingJs(Vype_CommonXpath.rightarrow, "-> ");

					gl.VerifyObjectDisplayed(Vype_CommonXpath.weProductImage,"product images ");
				}

				// Click on Add to Cart button
				gl.clickUsingJs(Vype_CommonXpath.btnAddToCART, "Add to Cart");

				// Verify mini cart is updated
				String str;
				str = gl.getText(Vype_CommonXpath.txtnumber);
				gl.VerifyElementVisible(Vype_CommonXpath.txtnumber, "Cart is updated with " + str + " number ");





			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		public void addchargingcase() throws Exception
		{
			String str;
			//Click on Add to Cart button
			gl.clickbutton(Vype_CommonXpath.btnChargingCaseAddToCART, "Add to Cart");

			// Verify Mini cart is updated
			str = gl.getText(Vype_CommonXpath.txtnumber);
			gl.VerifyElementVisible(Vype_CommonXpath.txtnumber, "Cart is updated with " + str + " number ");


		}
	//Author:Harsha
	//Adding flavor flavor epod 2 core collections
	//Date:26/10/2021

	public void addflavorincorecollections(String Flavor) throws Exception
	{

		//Click on Explore button
		gl.clickUsingJs(Vype_CommonXpath.btnExplore, "Explore");

		// Verify that ePod's pods page is displayed.
		gl.VerifyElementVisible(Vype_CommonXpath.pgEpodPods, "ePod Pods");

		//Add any catridge
		boolean b=gl.isObjectPresent(Vype_CommonXpath.btnaddflavor(Flavor), "Flavor");

		if(b==true)
		{

			gl.fnScrollToView(Vype_CommonXpath.Txtflavor(Flavor));

			gl.clickUsingJs(Vype_CommonXpath.addpod(Flavor), Flavor);

			gl.VerifyElementVisible(Vype_CommonXpath.btnaddflavor(Flavor), "Add");

			gl.clickUsingJs(Vype_CommonXpath.btnaddflavor(Flavor), "Add");

		}
		else
		{


			gl.fnScrollToView(Vype_CommonXpath.Txtflavor(Flavor));

			gl.clickUsingJs(Vype_CommonXpath.addpod1(Flavor), Flavor);

			gl.VerifyElementVisible(Vype_CommonXpath.btnaddflavor1(Flavor), "Add");

			gl.clickUsingJs(Vype_CommonXpath.btnaddflavor1(Flavor), "Add");

		}

	}	

	//clone of engrave device|
	public void engraveDeviceFromElementCollection(String devicecolour, String patternName, String TextDirection, String FontStyle,
			String Text, String FirstName) throws Exception {
		try {

			//List<WebElement> list;

			gl.fnScrollToView(Vype_CommonXpath.btnEngravedDeviceBuyNow);
			// Click the buy now button of engravable
			gl.clickbutton(Vype_CommonXpath.btnEngravedDeviceBuyNow, "Engraving");

			gl.VerifyObjectDisplayed(Vype_CommonXpath.pgengravingdevice, "engravable page is opened");

			//gl.clickUsingJs(Vype_CommonXpath.btnelementcollection," Elements Collection");

			gl.clickUsingJs(Vype_CommonXpath.btndevicecolour(devicecolour), "colour selected is:" + devicecolour);


			// CLick on Pattern

			gl.clickUsingJs(Vype_CommonXpath.btnPattern, "Pattern");

			// Click on Solstice
			// gl.clickUsingJs(Vype_CommonXpath.btnpattern(pattern), "Pattern
			// selected is: "+ pattern);

			// Select pattern
			gl.clickUsingJs(Vype_CommonXpath.btpattern(patternName), "Device pattern name is: " + patternName);
			String Pattern = gl.getText(Vype_CommonXpath.btpattern(patternName));
			System.out.println("Device pattern is: " + Pattern);

			// CLick on Add Pattern button
			gl.clickbuttonUsingSelenium(Vype_CommonXpath.btnAddPattern, "Add Pattern");

			// Verify the page Now customize the back displayed
			gl.VerifyPageDisplayed(Vype_CommonXpath.txtCustomizeBack, "02 | Now Customize the Back");

			// Click on Text
			gl.clickUsingJs(Vype_CommonXpath.btnText, "Text");

			// Select direction
			gl.clickUsingJs(Vype_CommonXpath.btnVertical(TextDirection),
					"Text direction selected is: " + TextDirection);
			String Direction = gl.getText(Vype_CommonXpath.btnVertical(TextDirection));
			System.out.println("Text direction is: " + Direction);

			// Select Font style
			gl.clickUsingJs(Vype_CommonXpath.btnFontStyle(FontStyle), "Font style is: " + FontStyle);
			String FontStyle1 = gl.getText(Vype_CommonXpath.btnFontStyle(FontStyle));
			System.out.println("Font style is: " + FontStyle1);



			// Enter your text
			gl.inputText(Vype_CommonXpath.txtEnterText, "Enter your text field", Text);

			// Click on Add Text button
			gl.clickbuttonUsingSelenium(Vype_CommonXpath.btnAddText, "Add Text");

			// Click on Add Engraving button
			gl.fnScrollToView(Vype_CommonXpath.btnAddEngraving);
			gl.clickUsingJs(Vype_CommonXpath.btnAddEngraving, "Add Engraving ");

			// Verify it redirects to Engravable ePod product details page
			// gl.VerifyPageDisplayed(Vype_CommonXpath.wetxtEngravableePod,
			// "Engravable ePod");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//Author: Harsha
	//Adding flavor in mix and match bundle
	//Date:07/10/2021
	public void addpods(String flavor) throws Exception {

		gl.VerifyElementVisible(Vype_CommonXpath.flavor(flavor), flavor);

		gl.clickUsingJs(Vype_CommonXpath.flavor(flavor), flavor);

		gl.VerifyElementVisible(Vype_CommonXpath.pgflavor(flavor), flavor);

		gl.VerifyElementVisible(Vype_CommonXpath.txtNicotinestrength, "+");

		gl.clickUsingJs(Vype_CommonXpath.btnplusstrength,"+ " );

		gl.clickUsingJs(Vype_CommonXpath.add,"Add");

	}
	public void addpodsflavor(String flavor) throws Exception {
        //scroll to flavor
        gl.fnScrollToView(Vype_CommonXpath.lnkflavour(flavor));

        //adding flavor
        gl.clickUsingJs(Vype_CommonXpath.lnkflavour(flavor), flavor );

        //verifying the flavor
        //gl.VerifyElementPresent(Vype_CommonXpath.btnAddflavor(flavor), flavor);

        //adding flavor
        //gl.clickUsingJs(Vype_CommonXpath.btnAddflavor(flavor), flavor );
    }

	//Author: Harsha
	//Date:08/10/2021
	public void addpods(String flavor, String FlavourSection) throws Exception {

		/*gl.VerifyElementVisible(Vype_CommonXpath.flavor(flavor), flavor);

		gl.clickUsingJs(Vype_CommonXpath.flavor(flavor), flavor);

		gl.VerifyElementVisible(Vype_CommonXpath.pgflavor(flavor), flavor);

		gl.VerifyElementVisible(Vype_CommonXpath.txtNicotinestrength, "+");

		gl.clickUsingJs(Vype_CommonXpath.btnplusstrength, "+ ");

		gl.clickUsingJs(Vype_CommonXpath.add, "Add");
		
		
		*/
		
		// scroll to fruit section
		gl.fnScrollToView(Vype_CommonXpath.EpodflavorSection(FlavourSection));

		// click on right arrow
		//gl.clickbutton(Vype_CommonXpath.fruitRightArrow, "Fruit right arrow");		
		Thread.sleep(6000);
		// click on flavor image
		gl.fnScrollToView(Vype_CommonXpath.btnAddFlavor(flavor));
		Thread.sleep(6000);
		gl.clickUsingJs(Vype_CommonXpath.imgflavor(flavor) , flavor);
		
		//add products
		Thread.sleep(6000);
		
	//	gl.ScrolltoTopofthepage();

		Thread.sleep(6000);
		// click on One time purchase
		gl.clickUsingJs(Vype_CommonXpath.lnkOneTimePurchase, "One Time Purchase");

		// Scroll to view quality
		gl.fnScrollToView(Vype_CommonXpath.txtPack);

		// click on plus button Nicotine strength 1.6%
		gl.clickbuttonUsingSelenium(Vype_CommonXpath.btnQtyIncrement, "Quantity Increment");

		// click on Add To Cart.
		gl.clickbutton(Vype_CommonXpath.btnAddToCart, "Add To Cart");

		// Verify mini cart is updated
		String num1 = gl.getText(Vype_SubscriptionLanding.txtnumber);
		gl.VerifyObjectDisplayed(Vype_SubscriptionLanding.txtnumber, "Cart is updated with " + num1 + "items ");



	}

	 public void navigateToaccessoriespage() throws Exception {
		try {

			// Hover the mouse on Products link
			gl.HowerMouse(Vype_CommonXpath.lnkShop, "Shops link from the main menu navigation");

			// Click on ePod Charger link
			gl.clickbutton(Vype_CommonXpath.lnkAccessories, "Accessories");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//Author: Sai Manaswini
//Date: 28/01/2022
// Navigate to Know your Vape

public void navigateToKnowYourVape() throws Exception{
try {
Thread.sleep(3000);
gl.HowerMouse(Vype_CommonXpath.lnkAbout, "About link from main menu navigation");
//Verifying the submenu is loaded
gl.VerifyObjectDisplayed(Vype_KnowyourVape.lnkVuseNews, "Vuse News");
//Clicking on Know your Vape Link
gl.clickbutton(Vype_KnowyourVape.lnkKnowYourVape, "Know your vape from About section");
//Verify know your page
gl.VerifyPageDisplayed("https://www.vuse-qa.ca/ca/en/know-your-vape/");
}
catch (Exception e) {
e.printStackTrace();
}
}

//BoostPlan LaunchApplication
public void launchApplicationBoost() throws Exception {



   try {
        
        gl.launchApplication(Constants.Boost_URL);
        
        gl.waitTillElementVisible(Vype_CommonXpath.weAgeCertify);



       // Select "Ontario" from the drop down
        gl.SelectByOption(Vype_CommonXpath.weDropDownProvince, "British Columbia");
        // Click on "I am 19 or over" button
        gl.clickUsingJs(Vype_CommonXpath.btnIam19orOver, " Iam 19 or Over");
        // Verify that Pre-Login home page displayed
        gl.VerifyElementVisible(Vype_CommonXpath.btnGetYourKit, "Get Your Kit");



   } catch (Exception e) {
        e.printStackTrace();
    }
}

public void Pickpods(String flavor,String quantity) throws Exception
	{

		try {

			//click on flavor
			gl.clickbutton(Vype_CommonXpath.addflavor(flavor), flavor);

			//verify flavor
			gl.VerifyElementVisible(Vype_CommonXpath.Txtflavor(flavor), flavor);

			//verify flavor discription
			gl.VerifyElementVisible(Vype_CommonXpath.flavordisc(flavor), flavor+ "Discription");

			int Count=Integer.parseInt(quantity);
			
			for(int i=0;i<Count;i++)
			{
				//click on nicotine strength
				gl.clickUsingJs(Vype_CommonXpath.btnstrength, "+ ");
			}
			

			//click on add button
			gl.clickUsingJs(Vype_CommonXpath.btnAdd1,"Add");



		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

public void addskinepodtwo(String Skin)
{

    try
    {



        


        //gl.VerifyObjectDisplayed(Vype_CommonXpath.imgpodSkin(Skin), Skin);



        String Skin1 = Skin.substring(0, 1).toLowerCase();
        Skin = Skin1.concat(Skin.substring(1));



        // Select any skin colour
        gl.clickbuttonUsingSelenium(Vype_CommonXpath.skintype(Skin), "Skin selected is: " + Skin);
        Thread.sleep(5000);



        String s = gl.getText(Vype_CommonXpath.txtskin);



        gl.VerifyObjectDisplayed(Vype_CommonXpath.txtskin, "Skin");



        System.out.println(s + " is highlighted ");



        // gl.clickbutton(Vype_CommonXpath.podSkin(Skin),Skin );



        /*
         * String str=Skin.substring(0,1).toUpperCase(); String Str1=Skin.substring(1);
         * Skin=str.concat(Str1);
         */



        String price = gl.getText(Vype_CommonXpath.txtprice);



        System.out.println("The Price of " + Skin + " is " + price);



        gl.VerifyElementVisible(Vype_CommonXpath.txtprice, price);



        gl.VerifyElementPresent(Vype_CommonXpath.btnPlus, "+ ");



        gl.VerifyElementPresent(Vype_CommonXpath.btnminus, "- ");



        gl.clickbutton(Vype_CommonXpath.btnminus, "- ");
        Thread.sleep(2000);



        //gl.isDisabled(Vype_CommonXpath.buynow, "Buy now");



        // gl.VerifyObjectDisplayed(Vype_CommonXpath.btnBuynow, "Buy now");



        gl.clickbutton(Vype_CommonXpath.btnPlus, "+ ");
        Thread.sleep(2000);



        gl.isEnabled(Vype_CommonXpath.buynow, "Buy now");



        gl.clickbutton(Vype_CommonXpath.buynow, "Buy now");

        gl.HowerMouse(Vype_CommonXpath.lnkCartIcon, "Cart Icon");
        Thread.sleep(10000);

        gl.VerifyObjectDisplayed(Vype_CommonXpath.btnViewCart,"add to cart");



    } catch (Exception e) {
        e.printStackTrace();
    }}
//collection X

public void Addskinepodtwocollx(String Skin)
{






    try
    {



        

        //gl.VerifyObjectDisplayed(Vype_CommonXpath.imgpodSkin(Skin), Skin);



        String Skin1 = Skin.substring(0, 1).toLowerCase();
        Skin = Skin1.concat(Skin.substring(1));



        // Select any skin colour
        gl.clickbuttonUsingSelenium(Vype_CommonXpath.Skintype(Skin), "Skin selected is: " + Skin);
        Thread.sleep(5000);



        String s = gl.getText(Vype_CommonXpath.txtskin);



        gl.VerifyObjectDisplayed(Vype_CommonXpath.txtskin, "Skin");



        System.out.println(s + " is highlighted ");



        // gl.clickbutton(Vype_CommonXpath.podSkin(Skin),Skin );



        /*
         * String str=Skin.substring(0,1).toUpperCase(); String Str1=Skin.substring(1);
         * Skin=str.concat(Str1);
         */



        String price = gl.getText(Vype_CommonXpath.txtprice);



        System.out.println("The Price of " + Skin + " is " + price);



        gl.VerifyElementVisible(Vype_CommonXpath.txtprice, price);



        gl.VerifyElementPresent(Vype_CommonXpath.btnPlus, "+ ");



        gl.VerifyElementPresent(Vype_CommonXpath.btnminus, "- ");



        gl.clickbutton(Vype_CommonXpath.btnminus, "- ");
        Thread.sleep(2000);



        //gl.isDisabled(Vype_CommonXpath.buynow, "Buy now");



        // gl.VerifyObjectDisplayed(Vype_CommonXpath.btnBuynow, "Buy now");



        
        gl.clickbutton(Vype_CommonXpath.btnPlus, "+ ");
        Thread.sleep(2000);



        gl.isEnabled(Vype_CommonXpath.buynow, "Buy now");



        gl.clickbutton(Vype_CommonXpath.buynow, "Buy now");



      gl.HowerMouse(Vype_CommonXpath.lnkCartIcon, "Cart Icon");

        gl.VerifyObjectDisplayed(Vype_CommonXpath.btnViewCart,"add to cart");



    } catch (Exception e) {
        e.printStackTrace();
    }



}



 //epod2+
        public void addskinepodpluscore(String Skin)
        {

            try
            {

     

                

                //gl.VerifyObjectDisplayed(Vype_CommonXpath.imgpodSkin(Skin), Skin);

     

                String Skin1 = Skin.substring(0, 1).toLowerCase();
                Skin = Skin1.concat(Skin.substring(1));

     

                // Select any skin colour
                gl.clickbuttonUsingSelenium(Vype_CommonXpath.skinTypCore(Skin), "Skin selected is: " + Skin);
                Thread.sleep(5000);

     

                String s = gl.getText(Vype_CommonXpath.txtskin);

     

                gl.VerifyObjectDisplayed(Vype_CommonXpath.txtskin, "Skin");

     

                System.out.println(s + " is highlighted ");

     

                // gl.clickbutton(Vype_CommonXpath.podSkin(Skin),Skin );

     

                /*
                 * String str=Skin.substring(0,1).toUpperCase(); String Str1=Skin.substring(1);
                 * Skin=str.concat(Str1);
                 */

     

                String price = gl.getText(Vype_CommonXpath.txtprice);

     

                System.out.println("The Price of " + Skin + " is " + price);

     

                gl.VerifyElementVisible(Vype_CommonXpath.txtprice, price);

     

                gl.VerifyElementPresent(Vype_CommonXpath.btnPlus, "+ ");

     

                gl.VerifyElementPresent(Vype_CommonXpath.btnminus, "- ");

     

                gl.clickbutton(Vype_CommonXpath.btnminus, "- ");
                Thread.sleep(2000);

     

                //gl.isDisabled(Vype_CommonXpath.buynow, "Buy now");

     

                // gl.VerifyObjectDisplayed(Vype_CommonXpath.btnBuynow, "Buy now");

     

                gl.clickbutton(Vype_CommonXpath.btnPlus, "+ ");
                Thread.sleep(2000);

     

                gl.isEnabled(Vype_CommonXpath.buynow, "Buy now");

     

                gl.clickbutton(Vype_CommonXpath.buynow, "Buy now");

                gl.HowerMouse(Vype_CommonXpath.lnkCartIcon, "Cart Icon");

                gl.VerifyObjectDisplayed(Vype_CommonXpath.btnViewCart,"add to cart");

     


            } catch (Exception e) {
                e.printStackTrace();
            }

     

        }








//epod2+ collection X

        public void AddSkinepodpluscollx(String Skin)
        {






            try
            {

 

                


                //gl.VerifyObjectDisplayed(Vype_CommonXpath.imgpodSkin(Skin), Skin);

 

                String Skin1 = Skin.substring(0, 1).toLowerCase();
                Skin = Skin1.concat(Skin.substring(1));

 

                // Select any skin colour
                gl.clickbuttonUsingSelenium(Vype_CommonXpath.skinType(Skin), "Skin selected is: " + Skin);
                Thread.sleep(5000);

 

                String s = gl.getText(Vype_CommonXpath.txtskin);

 

                gl.VerifyObjectDisplayed(Vype_CommonXpath.txtskin, "Skin");

 

                System.out.println(s + " is highlighted ");

 

                // gl.clickbutton(Vype_CommonXpath.podSkin(Skin),Skin );

 

                /*
                 * String str=Skin.substring(0,1).toUpperCase(); String Str1=Skin.substring(1);
                 * Skin=str.concat(Str1);
                 */

 

                String price = gl.getText(Vype_CommonXpath.txtprice);

 

                System.out.println("The Price of " + Skin + " is " + price);

 

                gl.VerifyElementVisible(Vype_CommonXpath.txtprice, price);

 

                gl.VerifyElementPresent(Vype_CommonXpath.btnPlus, "+ ");

 

                gl.VerifyElementPresent(Vype_CommonXpath.btnminus, "- ");

 

                gl.clickbutton(Vype_CommonXpath.btnminus, "- ");
                Thread.sleep(2000);

 

                //gl.isDisabled(Vype_CommonXpath.buynow, "Buy now");

 

                // gl.VerifyObjectDisplayed(Vype_CommonXpath.btnBuynow, "Buy now");

 

                gl.clickbutton(Vype_CommonXpath.btnPlus, "+ ");
                Thread.sleep(2000);

 

                gl.isEnabled(Vype_CommonXpath.buynow, "Buy now");

 

                gl.clickbutton(Vype_CommonXpath.buynow, "Buy now");

                gl.HowerMouse(Vype_CommonXpath.lnkCartIcon, "Cart Icon");

                gl.VerifyObjectDisplayed(Vype_CommonXpath.btnViewCart,"add to cart");

 


            } catch (Exception e) {
                e.printStackTrace();
            }

 

        }


public void flavourpdp(String flavor) {
	
	 try
	    {

	// TODO Auto-generated method stub
	gl.fnScrollToView(Vype_CommonXpath.lnkAllFlavoursePodPodsPage(flavor));
	String str = "";
	
	gl.clickUsingJs(Vype_CommonXpath.lnkAllFlavoursePodPodsPage(flavor), "Flavor selected is: " + flavor);
	Thread.sleep(10000);	
	gl.VerifyElementVisible(Vype_CommonXpath.txtflavor2(flavor), flavor );


	// Verify flavor page is displayed
	gl.VerifyElementVisible(Vype_CommonXpath.txtFlavours(flavor), "Flavor Name is: " + flavor);
	gl.fnScrollToView(Vype_CommonXpath.txtFlavoursDescription(flavor));

	Thread.sleep(2000);
	String str1 = "";

	//flavor description
	 str1 = gl.getText(Vype_CommonXpath.txtFlavoursDescription(flavor));
	gl.VerifyElementVisible(Vype_CommonXpath.txtFlavoursDescription(flavor),
			"Flavour description is: " + str1);
	
	 gl.fnScrollToView(Vype_CommonXpath.txtPack);
	 
	 gl.VerifyElementVisible(Vype_CommonXpath. lnkOneTimePurchase, "One time Purchase");
	 
	 gl.VerifyElementVisible(Vype_CommonXpath. pgeSubscribeAndSave, "Subscribe & save");
	 
	 gl.VerifyElementVisible(Vype_CommonXpath. btnnicotine, "Nicotine Strength");
	
	 gl.VerifyElementVisible(Vype_CommonXpath.Btnplus, "+ ");

	 gl.VerifyElementVisible(Vype_CommonXpath.btnMinus, "- ");
	 	
	 gl.VerifyElementVisible(Vype_CommonXpath. btnAddToCART, "Add to cart");
	 
	 
} catch (Exception e) {
    e.printStackTrace();
}
}

public void fnln(String FN, String LN) {
    try {
        gl.inputText(Vype_Registration.txtFirstName, "First name text field", FN);

 

        //Enter the Last Name
        gl.inputText(Vype_Registration.txtLastName, "Last name text field", LN);

 

        
    }
    catch (Exception e) {
    e.printStackTrace();
    }
    }
}
