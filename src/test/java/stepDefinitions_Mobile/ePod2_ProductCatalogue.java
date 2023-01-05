package stepDefinitions_Mobile;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.rai.framework.CommonFunctions_Mobile;
import com.rai.framework.RAI_Mobile_Utility_Functions;

import cucumber.api.java.en.*;
import goVype_Properties.*;

public class ePod2_ProductCatalogue {

	RAI_Mobile_Utility_Functions rai = new RAI_Mobile_Utility_Functions();
	CommonFunctions_Mobile function = new CommonFunctions_Mobile(rai);

	@When("^User howers on shop and click on epodtwo device and verify device page$")
	public void user_howers_on_shop_and_click_on_epodtwo_device_and_verify_device_page() throws Throwable {

		// Navigate to ePODdevives
		function.navigateToePodDevice();
		

	}

	@Then("^Click on epodtwo elements collections and verify all device colours present$")
	public void click_on_epodtwo_elements_collections_and_verify_all_device_colours_present() throws Throwable {

		
		//click on epod2 elements collections
		rai.clickUsingJs(Vype_CommonXpath.epodelements, "epod2 elememts collections");
		
		Thread.sleep(5000);

		// Verify the "Choose your colour" page is displayed
		rai.VerifyElementVisible(Vype_CommonXpath.txtChooseyourClr, "Choose your Color");

		//Verify Exit is displayed
		rai.VerifyElementVisible(Vype_CommonXpath.btnExit, "Exit");

		//Verify the "Citrine", "Emerald", "Glacier", "Pink salt", "Sandstone" ePods are displayed with the "Select" button
		List<WebElement> list = rai.findElementsList(Vype_CommonXpath.weDeviceColorList);
		System.out.println("No of device colours :"+list.size());
		for(int i=0; i<list.size();i++)
		{
			String str = list.get(i).getText();

			rai.VerifyElementVisible(Vype_CommonXpath.weDeviceColorList, "Device color Section"+ str);
		}
		//verify all colours
		List<WebElement> list1 = rai.findElementsList(Vype_CommonXpath.weDeviceColors);
		for(int i=0; i<list1.size();i++)
		{

			String str1 = list.get(i).getText();
			int len=str1.length();
			str1=str1.substring(0,len-6);
			System.out.println((i+1)+":"+str1 );
			rai.VerifyElementVisible(Vype_CommonXpath.weDeviceColors, "Device colour :"+ str1);
		}	



	}

	
	@And("^Check navigation dots and check next is disabled or not$")
	public void check_navigation_dots_and_check_next_is_disabled_or_not() throws Throwable {

		rai.ScrollByxpath(Vype_CommonXpath.weNavigationDots);

		//Verify the 2 Carousel dots are displayed. Verify By default 1st carousel dot is highlighted
		rai.VerifyElementVisible(Vype_CommonXpath.weNavigationDots, "Navigation Dots");


		//Verify the ‘Next’ button below ‘Choose Your Boxset Color’ card is disabled, when no color selection is made at the 1st step of the buyflow.
		rai.clickUsingJs(Vype_CommonXpath.btnnext, "Next");
		
		//verify popup
		//rai.VerifyElementVisible(Vype_CommonXpath.txtselectpopup, "Make a selection to continue pop up");


	}

	@Then("^Scroll to compare and contrast and verify all markercontainers$")
	public void scroll_to_compare_and_contrast_and_verify_all_markercontainers() throws Throwable {

		String str;
		//Scroll page dowmn
		rai.ScrollByxpath(Vype_CommonXpath.txtCompareandContrast);

		//Verify the "Compare and Contrast" section is displayed
		List<WebElement> list1 = rai.findElementsList(Vype_CommonXpath.weDeviceContainer);
		System.out.println("Device types: "+list1.size());

		for(int i=0; i<list1.size(); i++)
		{
			str = list1.get(i).getText();

			if(str.equals("ePod"))
			{

				/* list = driver.findElements(Vype_CommonXpath.weMarkerContainer);
				   System.out.println("Total number of Markers in Compare and Contrast Section: " + list.size());
			       for (int a = 0; a < list.size(); a++)
			       {
				       gl.HowerMouse(Vype_CommonXpath.weMarkerContainer, "Marker");
				       str = gl.getText(Vype_CommonXpath.weMarkerText);
				       gl.VerifyObjectDisplayed(Vype_CommonXpath.text1Marker,str );

				   }*/

				rai.clickUsingJs(Vype_CommonXpath.weMarkerContainer1, "Marker");
				str = rai.getText(Vype_CommonXpath.text1Marker);
				rai.VerifyElementVisible(Vype_CommonXpath.text1Marker,str );

				rai.clickUsingJs(Vype_CommonXpath.weMarkerContainer2, "Marker");
				str = rai.getText(Vype_CommonXpath.text2Marker);
				rai.VerifyElementVisible(Vype_CommonXpath.text2Marker,str );




				rai.clickUsingJs(Vype_CommonXpath.weMarkerContainer3, "Marker");
				str = rai.getText(Vype_CommonXpath.text3Marker);
				rai.VerifyElementVisible(Vype_CommonXpath.text3Marker,str );

				rai.clickUsingJs(Vype_CommonXpath.weMarkerContainer4, "Marker");
				str = rai.getText(Vype_CommonXpath.text4Marker);
				rai.VerifyElementVisible(Vype_CommonXpath.text4Marker,str );

			}



			if(str.equals("ePod 2"))
			{
				rai.clickUsingJs(Vype_CommonXpath.weMarkerContainer5, "Marker");
				str = rai.getText(Vype_CommonXpath.text5Marker);
				rai.VerifyElementVisible(Vype_CommonXpath.text5Marker,str );

				rai.clickUsingJs(Vype_CommonXpath.weMarkerContainer6, "Marker");
				str = rai.getText(Vype_CommonXpath.text6Marker);
				rai.VerifyElementVisible(Vype_CommonXpath.text6Marker,str );

				rai.clickUsingJs(Vype_CommonXpath.weMarkerContainer7, "Marker");
				str = rai.getText(Vype_CommonXpath.text7Marker);
				rai.VerifyElementVisible(Vype_CommonXpath.text7Marker,str );

				rai.clickUsingJs(Vype_CommonXpath.weMarkerContainer8, "Marker");
				str = rai.getText(Vype_CommonXpath.text8Marker);
				rai.VerifyElementVisible(Vype_CommonXpath.text8Marker,str );

				rai.clickUsingJs(Vype_CommonXpath.weMarkerContainer9, "Marker");
				str = rai.getText(Vype_CommonXpath.text9Marker);
				rai.VerifyElementVisible(Vype_CommonXpath.text9Marker,str );

				rai.clickUsingJs(Vype_CommonXpath.weMarkerContainer10, "Marker");
				str = rai.getText(Vype_CommonXpath.text10Marker);
				rai.VerifyElementVisible(Vype_CommonXpath.text10Marker,str );

				rai.clickUsingJs(Vype_CommonXpath.weMarkerContainer11, "Marker");
				str = rai.getText(Vype_CommonXpath.text11Marker);
				rai.VerifyElementVisible(Vype_CommonXpath.text11Marker,str );


			}
		}

	}

	@Then("^scroll to faqs and verify all faqs$")
	public void scroll_to_faqs_and_verify_all_faqs() throws Throwable {

		String str;
		//Scroll to FAQ Section
		rai.ScrollByxpath(Vype_CommonXpath.weFAQ);

		//verify faqs
		List<WebElement> list3 = rai.findElementsList(Vype_CommonXpath.weFAQList);
		System.out.println("Total no of Faqs: "+list3.size());

		for(int i=0; i<list3.size();i++)
		{
			str = list3.get(i).getText();
			System.out.println((i+1)+":"+str+"\n");
			rai.VerifyElementsVisible(Vype_CommonXpath.weFAQList, str+" is displayed");
		}

	}

	@And("^scroll to choose your colour and choose device colour \"([^\"]*)\"$")
	public void scroll_to_choose_your_colour_and_choose_device_colour(String devicecolour) throws Throwable {


		//Scroll to choose your colour
		rai.ScrollByxpath(Vype_CommonXpath.txtChooseyourClr);  

		//Verify the Device image is displayed with left and right arrows 
		rai.clickUsingJs(Vype_CommonXpath.btnselectdevice(devicecolour),devicecolour);


	}

	@Then("^Verify device images and elements present in the page$")
	public void verify_device_images_and_elements_present_in_the_page() throws Throwable {

		for(int i=0;i<4;i++)
		{
			//Click right arrow
			rai.clickbutton(Vype_CommonXpath.rightarrow, "-> ");
			//Verify the Device image is displayed with left and right arrows 
			rai.VerifyElementsVisible(Vype_CommonXpath.weProductImage, "Product Image" );
		}


		//Verify "POWER ON WITH THE New VUSE ePod 2
		rai.VerifyElementsVisible(Vype_CommonXpath.txtPowerOntheVuseePod2, "Power On the Vuse Text" );

	}
	@Then("^Scroll to back button and verify back button$")
	public void scroll_to_back_button_and_verify_back_button() throws Throwable {

		rai.ScrollByxpath(Vype_CommonXpath.btnback);

		//Verify Back button is displayed
		rai.VerifyElementVisible(Vype_CommonXpath.btnback, "Back" );
	}

	@And("^verify next button is enabled or not and click on Exit$")
	public void verify_next_button_is_enabled_or_not_and_click_on_Exit() throws Throwable {

		//Scroll down the page

		rai.ScrollByxpath(Vype_CommonXpath.weCompareandContrast);

		//Verify the "Compare and Contrast" section is displayed
		rai.VerifyElementVisible(Vype_CommonXpath.weCompareandContrast, "Compare and Contrast Section");

		//Scroll
		rai.ScrollByxpath(Vype_CommonXpath.weFAQ);

		//Verify FAQ List
		rai.VerifyElementVisible(Vype_CommonXpath.weFAQContainer, "FAQ's");

		rai.ScrollByxpath(Vype_CommonXpath.btnback);

		//Click on Back Button
		rai.clickbutton(Vype_CommonXpath.btnback, "back");

		// Verify the "Choose your colour" page is displayed
		rai.VerifyElementVisible(Vype_CommonXpath.txtChooseyourClr, "Choose your Color");

		//Verify the ‘Next’ button below ‘Choose Your Boxset Color’ card is Enabled, 
		rai.isEnabled(Vype_CommonXpath.btnnext, "Next");

		//Click on Exit
		rai.clickbutton(Vype_CommonXpath.btnExit, "Exit");

	}

	@Then("^Verify all product slides and verify respective pages$")
	public void Verify_all_product_slides_and_verify_respective_pages() throws Throwable {

		rai.SwipeDownSmallerUnits(2);
		rai.clickUsingJs(Vype_CommonXpath.lnkepod, "epod2");
		//Verify Product slides
		List<WebElement> list4 = rai.findElementsList(Vype_CommonXpath.weProductSlides);
		System.out.println("No of product types "+list4.size());
		for(int i=0; i<list4.size();i++)
		{
			String str = list4.get(i).getText();
			System.out.println((i+1)+":" + str);
		}

		//Click on stripcollections
		rai.clickbutton(Vype_CommonXpath.txtelementcollection, "Elements epod2 collections ");
		
		//rai.RefreshPage();

		Thread.sleep(10000);
		// Verify the "Choose your colour" page is displayed
		rai.VerifyElementVisible(Vype_CommonXpath.txtChooseyourClr, "Choose your Color");
		
		
		

		rai.fnNavigateBack();
		Thread.sleep(2000);
		//Click on stripcollections
		rai.clickbutton(Vype_CommonXpath.lnkcorecollections, "Stripe collections ");

		//Thread.sleep(10000);
		// Verify the "Choose your colour" page is displayed
		rai.VerifyElementVisible(Vype_CommonXpath.txtChooseyourClr, "Choose your Color");

		rai.fnNavigateBack();
		Thread.sleep(2000);
		//Click on Pods
		rai.clickUsingJs(Vype_CommonXpath.lnkPods, "Pods");

		// Verify that ePod's pods page is displayed.
		rai.VerifyElementVisible(Vype_CommonXpath.pgEpodPods, "ePod Pods");

		rai.fnNavigateBack();
		Thread.sleep(2000);
		//Click on skins
		
		rai.clickUsingJs(Vype_CommonXpath.lnkSkin, "Skins");

		//Verify Skins page is displayed
		rai.verifyTitle("Vape Skins for your ePod | Vuse Canada");

		rai.fnNavigateBack();
		Thread.sleep(2000);

		// Click the buy now button of engravable
		rai.clickUsingJs(Vype_CommonXpath.btnEngravedDeviceBuyNow, "Engraving");

		//Verify Engraving Device page is displayed
		rai.VerifyElementVisible(Vype_CommonXpath.pgengravingdevice, "engravable page is opened");

		rai.fnNavigateBack();
		Thread.sleep(2000);

		// Click All Accesseries
		rai.clickUsingJs(Vype_CommonXpath.lnkAccesories, "Accesseries");

		//Verify Accesseries page is displayed
		rai.verifyTitle("Vuse ePod 2 Vape Accessories | Vuse Canada");



	}

	@Then("^scroll to faqs and click and verify all faqs$")
	public void scroll_to_faqs_and_click_and_verify_all_faqs() throws Throwable {

		String str;
		//Scroll to FAQ Section
		rai.ScrollByxpath(Vype_CommonXpath.weFAQ);

		//verify faqs
		List<WebElement> list3 = rai.findElementsList(Vype_CommonXpath.weFAQList);
		System.out.println("Total no of Faqs: "+list3.size());
		// List<WebElement> list4 = rai.findElementsList(Vype_CommonXpath.weFAQListAns);
		for(int i=0; i<list3.size();i++)
		{
			str = list3.get(i).getText();
			String str1=str.substring(0,(str.length()-10));
			String Faqs = "//*[contains(text(),'"+str1+"')]";

			rai.clickUsingJs(By.xpath(Faqs), str+" is displayed");
			str = list3.get(i).getText();
			System.out.println((i+1)+":"+str+"\n");
			rai.VerifyElementsVisible(Vype_CommonXpath.weFAQList, str+" is displayed");

		}

	}

	@Then("^verify all type of products present in site in device page$")
	public void verify_all_type_of_products_present_in_site_in_device_page() throws Throwable {

		//Verify Product slides
		List<WebElement> list4 = rai.findElementsList(Vype_CommonXpath.weProductSlides);
		System.out.println("No of product types "+list4.size());
		for(int i=0; i<list4.size();i++)
		{
			String str = list4.get(i).getText();
			System.out.println((i+1)+":" + str);
		}

	}

	@And("^verify why choose epodtwo content present in device page$")
	public void verify_why_choose_epodtwo_content_present_in_device_page() throws Throwable {

		//Scroll to image device
		rai.ScrollByxpath(Vype_CommonXpath.imgdevice);

		//verify Image
		rai.VerifyElementsVisible(Vype_CommonXpath.imgdevice, "Device Image");

		String str2=rai.getText(Vype_CommonXpath.txtchooseepod2);

		System.out.println(str2);

		rai.VerifyElementsVisible(Vype_CommonXpath.txtchooseepod2,str2);

	}

}
