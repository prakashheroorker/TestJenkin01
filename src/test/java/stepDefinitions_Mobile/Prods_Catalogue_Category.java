package stepDefinitions_Mobile;

import java.util.List;

import org.openqa.selenium.WebElement;

import com.rai.framework.BaseClass;
import com.rai.framework.CommonFunctions_Mobile;
import com.rai.framework.RAI_Mobile_Utility_Functions;

import cucumber.api.java.en.*;
import goVype_Properties_mobile.*;



public class Prods_Catalogue_Category extends BaseClass {

	RAI_Mobile_Utility_Functions rai = new RAI_Mobile_Utility_Functions();
	CommonFunctions_Mobile function = new CommonFunctions_Mobile(rai);

	String beforesort="";
	
	@Then("^Verify user navigates to ePod Vape page and with all categories is displayed$")
	public void verify_user_navigates_to_ePod_Vape_page_and_with_all_categories_is_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		List<WebElement> list=rai.findElementsList(Vype_ProductCatalogue.allCatagories);
		System.out.println("no of catagories :"+list.size());
		
		rai.VerifyElementVisible(Vype_ProductCatalogue.MyVuseIQ, "MyVuseIQ");

	}
	
	
	//Added by sireesha
	
		@When("^User click on Filter and Sort Option$")
		public void user_click_on_Filter_and_Sort_Option() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		   
			rai.clickbutton(Vype_ProductCatalogue.Sortfilter, "Sort & Filter");
		}

		@Then("^Verify Filter and Sort menu is opened with relevant test$")
		public void verify_Filter_and_Sort_menu_is_opened_with_relevant_test() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			
			rai.VerifyElementVisible(Vype_ProductCatalogue.txtfliter, "heading of filter");
		  
			List<WebElement> list4 = rai.findElementsList(Vype_ProductCatalogue.wesections);
			
			rai.VerifyElementVisible(Vype_ProductCatalogue.wesections, "No of sections: "+list4.size());
			System.out.println("Total no of sections: "+list4.size());
			
			for(int i=0; i<list4.size();i++)
			{

				rai.VerifyElementVisible(Vype_ProductCatalogue.wesections,"list of titles");
				rai.SwipeDownSmallerUnits(1);
				String s=list4.get(i).getText();
				System.out.println((i+1)+":"+s);

			}
		}
		
		
		@When("^User clicks on any option from Sort by$")
		public void user_clicks_on_any_option_from_sort_by() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			
			rai.SwipeUpSmallerUnits(2);
			rai.clickbutton(Vype_ProductCatalogue.AtoZ, "A to Z");
		}

		@Then("^Verify the Hyperlinks is available beside the sort$")
		public void verify_the_Hyperlinks_is_available_beside_the_sort() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			
			rai.SwipeUpSmallerUnits(1);
		    rai.VerifyElementVisible(Vype_ProductCatalogue.txtclear,"Clear hyperlink");
		    
		    rai.SwipeDownSmallerUnits(2);
		    
		    rai.verifyTextContent("Clear All Filters");
		}
		
		@Then("^Verify the Hyperlinks is available beside the Nictoine strength$")
		public void verify_the_Hyperlinks_is_available_beside_the_Nictoine_strength() throws Throwable {
			rai.SwipeUpSmallerUnits(1);
		    rai.VerifyElementVisible(Vype_ProductCatalogue.txtclear1,"Clear hyperlink");
		    rai.SwipeDownSmallerUnits(2);
		    
			 rai.verifyTextContent("Clear All Filters");
		}

		@When("^User clicks on Clear hyperlink beside the sort$")
		public void user_clicks_on_Clear_hyperlink_beside_the_sort() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			rai.SwipeUpSmallerUnits(2);
			rai.ScrollByxpath(Vype_ProductCatalogue.txtclear);
			 rai.clickUsingJs(Vype_ProductCatalogue.txtclear,"Clear hyperlink");
		}

		
		@When("^User clicks on Clear hyperlink beside the nictoine strength$")
		public void user_clicks_on_Clear_hyperlink_beside_the_nictoine_strength() throws Throwable {
			
			rai.SwipeUpSmallerUnits(2);
			rai.ScrollByxpath(Vype_ProductCatalogue.txtclear1);
			 rai.clickUsingJs(Vype_ProductCatalogue.txtclear1,"Clear hyperlink");
			 
			 
		}
		@Then("^Verify the Filter is cleared$")
		public void verify_the_filter_is_cleared() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			rai.SwipeDownSmallerUnits(3);
		   rai.verifyobjectisnotavailable(Vype_ProductCatalogue.txtclearfilter,"Clear hyperlink");
		   
		   rai.SwipeUpSmallerUnits(2);
		   rai.clickUsingJs(Vype_ProductCatalogue.btnclfilter, "close the filter");
		}
	


		//rai.RotateDeviceLandscape();

		//rai.SwipeDownSmallerUnits(1);
		@When("^User clicks on Limited edition tile$")
		public void user_clicks_on_Limited_edition_tile() throws Throwable {
		
		rai.SwipeLeftToRight(2);

       rai.SwipeDownSmallerUnits(2);
		//Limited Edition tile
		rai.clickbutton(Vype_ProductCatalogue.LimitedEditiontile, "Limited Edition tile");

		//verify Limited edition page
		rai.VerifyElementVisible(Vype_ProductCatalogue.pgLimitedEdition, "Limited Edition tile ");
		}
		@Then("^verifies all limited edition flavors in pods page$")
		public void verifies_all_limited_edition_flavors_in_pods_page() throws Throwable {

		int c=0;
		//verify all flavors Under Limited Edition
		List<WebElement> list=rai.findElementsList(Vype_ProductCatalogue.txtLimitedEditionflavors);
		System.out.println("No of Limited Edition flavors: "+list.size());
		rai.VerifyElementVisible(Vype_ProductCatalogue.txtLimitedEditionflavors, "No of Limited Edition flavors: "+list.size());
		for(int i=0;i<list.size();i++)
		{
			String str=list.get(i).getText();
			System.out.println((i+1)+":"+str);
			rai.VerifyElementVisible(Vype_ProductCatalogue.txtlimitedflavor(i), str);
			c=c+1;
			if(c==2)
			{
				rai.SwipeDownSmallerUnits(4);
				c=0;
			}
		}
	}




		@Then("^User clicks on Mint tile in pods page$")
		public void user_clicks_on_Mint_tile_in_pods_page() throws Throwable {
		//click on Mint tile
		rai.clickbutton(Vype_ProductCatalogue.MintTile, "Mint tile ");

		
		}
		@Then("^verifies all mint flavors in pods page$")
		public void verifies_all_mint_flavors_in_pods_page() throws Throwable {
			
			int c=0;
			//verify Mint page
			rai.VerifyElementVisible(Vype_ProductCatalogue.pgMint, "Mint ");
		//verify all flavors Under Mint
		List<WebElement> list=rai.findElementsList(Vype_ProductCatalogue.txtMintFlavors);
		System.out.println("No of Mint flavors: "+list.size());
		rai.VerifyElementVisible(Vype_ProductCatalogue.txtMintFlavors, "No of Mint flavors: "+list.size());
		for(int i=0;i<list.size();i++)
		{
			String str=list.get(i).getText();
			System.out.println((i+1)+":"+str);
			rai.VerifyElementVisible(Vype_ProductCatalogue.txtMintFlavor(i), str);
			c=c+1;
			if(c==2)
			{
				rai.SwipeDownSmallerUnits(2);
				c=0;
			}
		}

		rai.clickbutton(Vype_ProductCatalogue.btnbacktotop, "^");
	}

		
		@When("^User clicks on Tobacco tile in pods page$")
		public void user_clicks_on_Tobacco_tile_in_pods_page() throws Throwable {

		rai.SwipeRightToLeft(1);

		//click on Mint tile
		rai.clickbutton(Vype_ProductCatalogue.Tobaccotile, "Tobacco tile ");
		}
		



		@Then("^verifies all Tobacco flavors in pods page$")
		public void verifies_all_Tobacco_flavors_in_pods_page() throws Throwable {
		//verify Tobacco page
		rai.VerifyElementVisible(Vype_ProductCatalogue.pgTobacco, "Tobacco ");

		int c=0;

		//verify all flavors Under Tobbaco
		List<WebElement> list=rai.findElementsList(Vype_ProductCatalogue.txtTobaccoFlavors);
		System.out.println("No of tobacco flavors: "+list.size());
		rai.VerifyElementVisible(Vype_ProductCatalogue.txtTobaccoFlavors, "No of tobacco flavors: "+list.size());
		for(int i=0;i<list.size();i++)
		{
			String str=list.get(i).getText();
			System.out.println((i+1)+":"+str);
			rai.VerifyElementVisible(Vype_ProductCatalogue.txttobaccoFlavor(i), str);
			c=c+1;
			if(c==2)
			{
				rai.SwipeDownSmallerUnits(2);
				c=0;
			}
		}


		rai.clickbutton(Vype_ProductCatalogue.btnbacktotop, "^");
	}

		@When("^User clicks on fruit tile in pods page$")
		public void user_clicks_on_fruit_tile_in_pods_page() throws Throwable {



		//click on fruit tile
		rai.clickbutton(Vype_ProductCatalogue.fruittile, "fruit tile ");
		}
		

		@Then("^verifies all fruit flavors in pods page$")
		public void verifies_all_fruit_flavors_in_pods_page() throws Throwable {

		//verify Tobacco page
		rai.VerifyElementVisible(Vype_ProductCatalogue.pgFruit, "Fruit ");

		int c=0;

		//verify all flavors Under Fruit
		List<WebElement> list=rai.findElementsList(Vype_ProductCatalogue.txtFruitFlavors);
		System.out.println("No of fruit flavors: "+list.size());
		rai.VerifyElementVisible(Vype_ProductCatalogue.txtFruitFlavors, "No of fruit flavors: "+list.size());
		for(int i=0;i<list.size();i++)
		{
			String str=list.get(i).getText();
			System.out.println((i+1)+":"+str);
			rai.VerifyElementVisible(Vype_ProductCatalogue.txtfruitFlavor(i), str);
			c=c+1;
			if(c==2)
			{
				rai.SwipeDownSmallerUnits(2);
				c=0;
			}
		}
	}

		@When("^User clicks on berry tile in pods page$")
		public void user_clicks_on_berry_tile_in_pods_page() throws Throwable {
		//click on berry tile
		rai.clickbutton(Vype_ProductCatalogue.Berrytile, "Berry tile ");
		}
		
		@Then("^verifies all berry flavors in pods page$")
		public void verifies_all_berry_flavors_in_pods_page() throws Throwable {

		//verify Berry page
		rai.VerifyElementVisible(Vype_ProductCatalogue.pgBerry, "Berry ");

		int c=0;

		//verify all flavors Under berry
		List<WebElement> list=rai.findElementsList(Vype_ProductCatalogue.txtBerryFlavors);
		System.out.println("No of Berry flavors: "+list.size());
		rai.VerifyElementVisible(Vype_ProductCatalogue.txtBerryFlavors, "No of Berry flavors: "+list.size());
		for(int i=0;i<list.size();i++)
		{
			String str=list.get(i).getText();
			System.out.println((i+1)+":"+str);
			rai.VerifyElementVisible(Vype_ProductCatalogue.txtberryFlavor(i), str);
			c=c+1;
			if(c==2)
			{
				rai.SwipeDownSmallerUnits(2);
				c=0;
			}
		}

		rai.clickbutton(Vype_ProductCatalogue.btnbacktotop, "^");

	}

		@When("^User clicks on Clear and Vanilla tile$")
		public void user_clicks_on_Clear_and_Vanilla_tile() throws Throwable {

		rai.SwipeRightToLeft(1);

		//clear and  vanilla tile
		rai.clickbutton(Vype_ProductCatalogue.Clearvanillatile, "Clear and vanilla ");
		}


		@Then("^User verifies all clear and vanilla flavors in pods page$")
		public void user_verifies_all_clear_and_vanilla_flavors_in_pods_page() throws Throwable {

		//verify Clear and vanilla page
		rai.VerifyElementVisible(Vype_ProductCatalogue.pgClearVanilla, "Clear and vanilla ");

		int c=0;

		//verify all flavors Under Clear and vanilla
		List<WebElement> list=rai.findElementsList(Vype_ProductCatalogue.txtClearVanillaFlavors);
		System.out.println("No of Clear and vanilla flavors: "+list.size());
		rai.VerifyElementVisible(Vype_ProductCatalogue.txtClearVanillaFlavors, "No of Clear and vanilla flavors: "+list.size());
		for(int i=0;i<list.size();i++)
		{
			String str=list.get(i).getText();
			System.out.println((i+1)+":"+str);
			rai.VerifyElementVisible(Vype_ProductCatalogue.txtClearVanillaFlavor(i), str);
			c=c+1;
			if(c==2)
			{
				rai.SwipeDownSmallerUnits(2);
				c=0;
			}
		}
	}

		@When("^User clicks on Nicotine Free tile$")
		public void user_clicks_on_Nicotine_Free_tile() throws Throwable {


		//Nicotine free flavor
		rai.clickbutton(Vype_ProductCatalogue.Nicotinefreetile, "Nicotine free tile");
		}

		
		@Then("^User verifies on Nicotine free flavors in pods page$")
		public void user_verifies_on_Nicotine_free_flavors_in_pods_page() throws Throwable {	
		//verify Nicotine free
		rai.VerifyElementVisible(Vype_ProductCatalogue.pgNicotinefree, "Nicotine free ");

		int c=0;

		//verify all flavors Under Clear and vanilla
		List<WebElement> list=rai.findElementsList(Vype_ProductCatalogue.txtNicotinefreeFlavors);
		System.out.println("No of Nicotine free flavors: "+list.size());
		rai.VerifyElementVisible(Vype_ProductCatalogue.txtNicotinefreeFlavors, "No of Nicotine free flavors: "+list.size());
		for(int i=0;i<list.size();i++)
		{
			String str=list.get(i).getText();
			System.out.println((i+1)+":"+str);
			rai.VerifyElementVisible(Vype_ProductCatalogue.txtNicotinefreeFlavor(i), str);
			c=c+1;
			if(c==2)
			{
				rai.SwipeDownSmallerUnits(2);
				c=0;
			}
		}
	}

	@Then("^Verify all categories Limited Edition, Mint, Tobacco, Fruit, Berry,Clear & vanilla,Nicotine Free are present in Pods screen$")
	public void verify_all_categories_Limited_Edition_Mint_Tobacco_Fruit_Berry_Clear_vanilla_Nicotine_Free_are_present_in_Pods_screen() throws Throwable {

		//Verify all flavors
		List<WebElement> list=rai.findElementsList(Vype_ProductCatalogue.allCatagories);
		System.out.println("no of catagories :"+list.size());
		String s="";
		for(int i=0;i<list.size();i++)
		{
			String str=list.get(i).getText();
			s=s+str;
		}

		String Expected=s.trim().replace(" ", "");
		String Actual="LimitedEditionMintTobaccoFruitBerryClear&VanillaNicotineFree";

		if(Expected.equals(Actual))
		{
			reportiumClient.reportiumAssert("All flavors are present", true);
		}
		else
		{
			reportiumClient.reportiumAssert("All flavors are not present", false);
		}


		rai.VerifyElementVisible(Vype_ProductCatalogue.MyVuseIQ, "MyVuseIQ");
	}

	@Then("^Select A to Z and verify Flavors are in Assending order from A to Z$")
	public void select_A_to_Z_and_verify_Flavors_are_in_Assending_order_from_A_to_Z() throws Throwable {

		List<WebElement> list=rai.findElementsList(Vype_ProductCatalogue.flavors);

		rai.SwipeDownSmallerUnits(2);

		for(int i=0;i<5;i++)
		{
			String str=list.get(i).getText();
			beforesort=beforesort+str;
		}
		beforesort=beforesort.trim().replace(" ", "");
		System.out.println(beforesort);
		//click on sort and filter
		rai.clickbutton(Vype_ProductCatalogue.Sortfilter, "Sort & Filter");
		

		//click on A to Z
		rai.clickbutton(Vype_ProductCatalogue.AtoZ, "A to Z");
		
		rai.SwipeDownSmallerUnits(1);
		
		rai.ScrollByxpath(Vype_ProductCatalogue.btndone);

		//done
		rai.clickUsingJs(Vype_ProductCatalogue.btndone, "Done ");

		//verify A to Z
		rai.VerifyElementVisible(Vype_ProductCatalogue.AtoZ, "A to Z");

		//list after sorting A to Z
		List<WebElement> list1=rai.findElementsList(Vype_ProductCatalogue.flavors);
		String AftersortAtoZ="";
		for(int i=0;i<5;i++)
		{
			String str=list1.get(i).getText();
			AftersortAtoZ=AftersortAtoZ+str;
		}

		AftersortAtoZ=AftersortAtoZ.trim().replaceAll(" ", "").replace("-", "");
		System.out.println(AftersortAtoZ);

		if(beforesort.equals(AftersortAtoZ))
		{
			reportiumClient.reportiumAssert(" not in accesnding order", false);
		}
		if(!beforesort.equals(AftersortAtoZ))
		{
			reportiumClient.reportiumAssert("sorted is in accesnding order", true);

		}
		String str=rai.getText(Vype_ProductCatalogue.filterBy);
		rai.VerifyElementVisible(Vype_ProductCatalogue.filterBy, str);


		rai.clickbutton(Vype_ProductCatalogue.filterBy, str);
	}
	
	@When("^User clicks on any option from Nicotine Strength$")
	public void user_clicks_on_any_option_from_Nicotine_strength() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		rai.SwipeDownSmallerUnits(1);
		rai.ScrollByxpath(Vype_ProductCatalogue.btnNS);
		rai.clickUsingJs(Vype_ProductCatalogue.btnNS, "1.8");
	}

	@When("^click on Filter and sort and select Z to A and verify flavors are in Decending order from Z to A in Pods screen$")
	public void click_on_Filter_and_sort_and_select_Z_to_A_and_verify_flavors_are_in_Decending_order_from_Z_to_A_in_Pods_screen() throws Throwable {

		System.out.println(beforesort);
		//click on sort and filter
		rai.clickbutton(Vype_ProductCatalogue.Sortfilter, "Sort & Filter");

		//click on A to Z
		rai.clickbutton(Vype_ProductCatalogue.ZtoA, "Z to A");

		//done
		rai.clickbutton(Vype_ProductCatalogue.btndone, "Done ");

		//verify A to Z
		rai.VerifyElementVisible(Vype_ProductCatalogue.ZtoA, "Z to A");

		//list after sorting A to Z
		List<WebElement> list1=rai.findElementsList(Vype_ProductCatalogue.flavors);
		String AftersortZtoA="";
		for(int i=0;i<5;i++)
		{
			String str=list1.get(i).getText();
			AftersortZtoA=AftersortZtoA+str;
		}

		AftersortZtoA=AftersortZtoA.trim().replaceAll(" ", "").replace("-", "");
		System.out.println(AftersortZtoA);

		if(beforesort.equals(AftersortZtoA))
		{
			reportiumClient.reportiumAssert("not in decending order", false);
		}
		if(!beforesort.equals(AftersortZtoA))
		{
			reportiumClient.reportiumAssert("sorted is in decending order", true);


		}
		String str=rai.getText(Vype_ProductCatalogue.filterBy);
		rai.VerifyElementVisible(Vype_ProductCatalogue.filterBy, str);


		rai.clickbutton(Vype_ProductCatalogue.filterBy, str);
	}

	@And("^User clicks on search and verify search is enabled$")
	public void user_clicks_on_search_and_verify_search_is_enabled() throws Throwable {

		//search
		rai.clickbutton(Vype_ProductCatalogue.txtsearch, "Search ");

		//verify search place holder
		rai.VerifyElementVisible(Vype_ProductCatalogue.txtsearch, "Search ");

		//close
		rai.clickbutton(Vype_ProductCatalogue.btnclose, "Close X ");





		//search
		rai.clickbutton(Vype_ProductCatalogue.txtsearch, "Search ");


	}

	@When("^User enters required flavor \"([^\"]*)\" and verify flavor is displayed after clicking on search link$")
	public void user_enters_required_flavor_and_verify_flavor_is_displayed_after_clicking_on_search_link(String flavor) throws Throwable {

		//entering flavor
		rai.inputTextjavaScriptSendkeys(adriver, Vype_ProductCatalogue.entertext, flavor);


		//suggestions
		rai.VerifyElementVisible(Vype_ProductCatalogue.txtsuggestions, "Suggestions");

		//search
		rai.clickbutton(Vype_ProductCatalogue.btnsearch, "Search ");

		List<WebElement> list=rai.findElementsList(Vype_ProductCatalogue.flavors);

		String dup="";
		for(int i=0;i<list.size();i++)
		{
			for(int j=i+1;j<list.size();j++)
			{
				if(list.get(i).getText().equals(list.get(j).getText()))
				{
					String s=rai.getText(Vype_ProductCatalogue.flavordesc(i));
					String s1=rai.getText(Vype_ProductCatalogue.flavordesc(j));
					System.out.println(s);
					System.out.println(s1);
					if(s.equals(s1))
					{
						dup=dup+list.get(j).getText()+" ";
					}


				}
			}


		}
		if(dup.isEmpty())
		{
			reportiumClient.reportiumAssert("There are no duplucate flavors ", true);
		}
		if(!dup.isEmpty())
		{
			System.out.printf(dup);
			reportiumClient.reportiumAssert("There are  duplucate flavors :"+dup, false);
		}


		//verifying flavor
		rai.VerifyElementVisible(Vype_ProductCatalogue.flavor(flavor), flavor);

		String str=rai.getText(Vype_ProductCatalogue.filterBy);
		rai.VerifyElementVisible(Vype_ProductCatalogue.filterBy, str);

		rai.clickbutton(Vype_ProductCatalogue.filterBy, str);
	}

	@Then("^User select any NS and verify Flavors displayed$")
	public void user_select_any_NS_and_verify_Flavors_displayed() throws Throwable {

		//click on sort and filter
		rai.clickbutton(Vype_ProductCatalogue.Sortfilter, "Sort & Filter");
		
		rai.SwipeDownSmallerUnits(1);
		
		rai.ScrollByxpath(Vype_ProductCatalogue.btnNS);

		rai.clickUsingJs(Vype_ProductCatalogue.btnNS, "1.8 NS");

		//done
        rai.SwipeDownSmallerUnits(1);
		
		rai.ScrollByxpath(Vype_ProductCatalogue.btndone);

		//done
		rai.clickUsingJs(Vype_ProductCatalogue.btndone, "Done ");


List<WebElement> list=rai.findElementsList(Vype_ProductCatalogue.flavors);
		
		String dup="";
		for(int i=0;i<list.size();i++)
		{
			for(int j=i+1;j<list.size();j++)
			{
				if(list.get(i).getText().equals(list.get(j).getText()))
				{
					String s=rai.getText(Vype_ProductCatalogue.flavordesc(i));
					String s1=rai.getText(Vype_ProductCatalogue.flavordesc(j));
					System.out.println(s);
					System.out.println(s1);
					if(s.equals(s1))
					{
						dup=dup+list.get(j).getText()+" ";
					}
					
					
				}
			}


		}
		if(dup.isEmpty())
		{
			reportiumClient.reportiumAssert("There are no duplucate flavors ", true);
		}
		if(!dup.isEmpty())
		{
			System.out.printf(dup);
			reportiumClient.reportiumAssert("There are  duplucate flavors :"+dup, false);
		}

		String str=rai.getText(Vype_ProductCatalogue.filterBy);
		rai.VerifyElementVisible(Vype_ProductCatalogue.filterBy, str);

		rai.clickbutton(Vype_ProductCatalogue.filterBy, str);

	}
	
	@When("^click on Filter and Sort and select Z to A and select nictoine strength$")
	public void click_on_Filter_and_sort_and_select_Z_to_A_and_select_nictoine_strength() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		rai.clickbutton(Vype_ProductCatalogue.Sortfilter, "Sort & Filter");
		
		rai.clickUsingJs(Vype_ProductCatalogue.ZtoA, "Z to A");
		
		rai.ScrollByxpath(Vype_ProductCatalogue.btnNS);
		
		rai.clickUsingJs(Vype_ProductCatalogue.btnNS, "1.8");
		
        rai.SwipeDownSmallerUnits(1);
		
		rai.ScrollByxpath(Vype_ProductCatalogue.btndone);

		//done
		rai.clickUsingJs(Vype_ProductCatalogue.btndone, "Done ");

		
		//rai.clickbutton(Vype_ProductCatalogue.btndone, "Done ");
	
		
	}
	
	
	@Then("^verify flavors are in Decending Order from Z to A are with corresponding nictoine strength$")
	public void verify_flavors_are_in_Decending_order_from_Z_to_A_are_with_corresponding_nictoine_strength() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		rai.VerifyElementVisible(Vype_ProductCatalogue.ZtoA, "Z to A");
		
				//list after sorting Z to A
		
				List<WebElement> list1=rai.findElementsList(Vype_ProductCatalogue.flavors);
				String AftersortZtoA="";
				for(int i=0;i<5;i++)
			{
				String str=list1.get(i).getText();
				AftersortZtoA=AftersortZtoA+str;
			}
					AftersortZtoA=AftersortZtoA.trim().replaceAll(" ", "").replace("-", "");
				System.out.println(AftersortZtoA);
		
			if(beforesort.equals(AftersortZtoA))
			{
					reportiumClient.reportiumAssert("not in decending order", false);
				}
				if(!beforesort.equals(AftersortZtoA))				
				{
					reportiumClient.reportiumAssert("sorted is in decending order", true);				}
				
				String str=rai.getText(Vype_ProductCatalogue.filterBy);
				rai.VerifyElementVisible(Vype_ProductCatalogue.filterBy, str);
		
			rai.clickbutton(Vype_ProductCatalogue.filterBy, str);
		
	List<WebElement> list=rai.findElementsList(Vype_ProductCatalogue.flavors);
	
	String dup="";
	for(int i=0;i<list.size();i++)
	{
		for(int j=i+1;j<list.size();j++)
		{
			if(list.get(i).getText().equals(list.get(j).getText()))
			{
				String s=rai.getText(Vype_ProductCatalogue.flavordesc(i));
				String s1=rai.getText(Vype_ProductCatalogue.flavordesc(j));
				System.out.println(s);
				System.out.println(s1);
				if(s.equals(s1))
				{
					dup=dup+list.get(j).getText()+" ";
				}
				
				
			}
		}


	}
	if(dup.isEmpty())
	{
		reportiumClient.reportiumAssert("There are no duplucate flavors ", true);
	}
	if(!dup.isEmpty())
	{
		System.out.printf(dup);
		reportiumClient.reportiumAssert("There are  duplucate flavors :"+dup, false);
	}

	String str1=rai.getText(Vype_ProductCatalogue.filterBy);
	rai.VerifyElementVisible(Vype_ProductCatalogue.filterBy, str);

	rai.clickbutton(Vype_ProductCatalogue.filterBy, str);
		
	}

	@And("^User enters flavor \"([^\"]*)\" that is not present and verify no results is displayed in pods screen$")
	public void user_enters_flavor_that_is_not_present_and_verify_no_results_is_displayed_in_pods_screen(String flavor) throws Throwable {

		//search
		rai.clickbutton(Vype_ProductCatalogue.txtsearch, "Search ");
		//entering flavor
		rai.inputTextjavaScriptSendkeys(rdriver, Vype_ProductCatalogue.entertext, flavor);

		//search
		rai.clickbutton(Vype_ProductCatalogue.btnsearch, "Search ");

		//No results
		rai.VerifyElementVisible(Vype_ProductCatalogue.txtnoresults, "No Results");



	}



}
