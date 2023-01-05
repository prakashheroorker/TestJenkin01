package stepDefinitions;

import java.util.List;

import org.openqa.selenium.WebElement;

import com.rai.framework.BaseClass;
import com.rai.framework.CommonFunctions;
import com.rai.framework.RAI_Desktop_Utility_Functions;

import cucumber.api.java.en.*;
import goVype_Properties.Vype_Help;
import goVype_Properties.Vype_ProductCatalogue;
import goVype_Properties.Vype_VuseNews;

public class ProductCalaogue extends BaseClass{

	RAI_Desktop_Utility_Functions gl = new RAI_Desktop_Utility_Functions();
	CommonFunctions function = new CommonFunctions(gl);

	
	@Then("^Verify user navigates to ePod vape page and with all categories is displayed$")
	public void verify_user_navigates_to_ePod_vape_page_and_with_all_categories_is_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		//Verify all flavors
				List<WebElement> list=gl.findElementsList(Vype_ProductCatalogue.allCatagories);
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


				gl.VerifyElementPresent(Vype_ProductCatalogue.MyVuseIQ, "MyVuseIQ");

			}


	
	String beforesort="";

	@And("^User clicks on Limited edition tile$")
	public void user_clicks_on_Limited_edition_tile() throws Throwable {

		//Limited Edition tile
		gl.clickbutton(Vype_ProductCatalogue.LimitedEditiontile, "Limited Edition tile");
	}

	@Then("^Verify all limited edition flavors$")
	public void verify_all_limited_edition_flavors() throws Throwable {

		//verify Limited edition page
		gl.VerifyElementVisible(Vype_ProductCatalogue.pgLimitedEdition, "Limited Edition tile ");

		int c=0;
		//verify all flavors Under Limited Edition
		List<WebElement> list=gl.findElementsList(Vype_ProductCatalogue.txtLimitedEditionflavors);
		System.out.println("No of Limited Edition flavors: "+list.size());
		gl.VerifyElementVisible(Vype_ProductCatalogue.txtLimitedEditionflavors, "No of Limited Edition flavors: "+list.size());
		for(int i=0;i<list.size();i++)
		{
			String str=list.get(i).getText();
			System.out.println((i+1)+":"+str);
			gl.VerifyElementPresent(Vype_ProductCatalogue.txtlimitedflavor(i), str);
			c=c+1;
			if(c==4)
			{
				gl.clickUsingJs(Vype_ProductCatalogue.btnLimitedEditionswipe, "->");
				c=0;
			}
		}



	}
	
	@Then("^Click on left and right corousels for limited edition and verify tiles moved accordingly$")
	public void click_on_left_and_right_corosels_for_limited_edition_and_verify_tiles_moved_accordingly() throws Throwable {
		
		gl.clickUsingJs(Vype_ProductCatalogue.btnLimitedEditionswipeleft, "-<");
		Thread.sleep(2000);
		
				gl.clickUsingJs(Vype_ProductCatalogue.btnLimitedEditionswipe, "->");
	}


	@When("^User clicks on Mint tile$")
	public void user_clicks_on_Mint_tile() throws Throwable {

		//click on Mint tile
		gl.clickbutton(Vype_ProductCatalogue.MintTile, "Mint tile ");
	}

	@Then("^Verify all mint flavors$")
	public void verifies_all_mint_flavors() throws Throwable {

		//verify Mint page
		gl.VerifyElementVisible(Vype_ProductCatalogue.pgMint, "Mint ");

		int c=0;

		//verify all flavors Under Mint
		List<WebElement> list=gl.findElementsList(Vype_ProductCatalogue.txtMintFlavors);
		System.out.println("No of Mint flavors: "+list.size());
		gl.VerifyElementVisible(Vype_ProductCatalogue.txtMintFlavors, "No of Mint flavors: "+list.size());
		for(int i=0;i<list.size();i++)
		{
			String str=list.get(i).getText();
			System.out.println((i+1)+":"+str);
			gl.VerifyElementPresent(Vype_ProductCatalogue.txtMintFlavor(i), str);
			c=c+1;
			if(c==4)
			{
				gl.clickUsingJs(Vype_ProductCatalogue.btnMintswipe, "->");
				c=0;
			}
		}


	}
	@Then("^Click on left and right corousels for mint and verify tiles moved accordingly$")
	public void click_on_left_and_right_corosels_for_mint_and_verify_tiles_moved_accordingly() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		gl.clickUsingJs(Vype_ProductCatalogue.btnMintswipeleft, "-<");
		Thread.sleep(2000);
		gl.clickUsingJs(Vype_ProductCatalogue.btnMintswipe, "->");
	}

	@When("^User clicks on Tobacco tile$")
	public void user_clicks_on_Tobacco_tile() throws Throwable {

		//click on Mint tile
		gl.clickbutton(Vype_ProductCatalogue.Tobaccotile, "Tobacco tile ");

	}

	@Then("^Verify all Tobacco flavors$")
	public void verifies_all_Tobacco_flavors() throws Throwable {

		//verify Tobacco page
		gl.VerifyElementVisible(Vype_ProductCatalogue.pgTobacco, "Tobacco ");

		int c=0;

		//verify all flavors Under Tobbaco
		List<WebElement> list=gl.findElementsList(Vype_ProductCatalogue.txtTobaccoFlavors);
		System.out.println("No of tobacco flavors: "+list.size());
		gl.VerifyElementVisible(Vype_ProductCatalogue.txtTobaccoFlavors, "No of tobacco flavors: "+list.size());
		for(int i=0;i<list.size();i++)
		{
			String str=list.get(i).getText();
			System.out.println((i+1)+":"+str);
			gl.VerifyElementPresent(Vype_ProductCatalogue.txttobaccoFlavor(i), str);
			c=c+1;
			if(c==4)
			{
				gl.clickUsingJs(Vype_ProductCatalogue.btntobaccoswipe, "->");
				c=0;
			}
		}

	}
	@Then("^Click on left and right corousels for Tobacoo and verify tiles moved accordingly$")
	public void click_on_left_and_right_corosels_for_Tobacoo_and_verify_tiles_moved_accordingly() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		gl.clickUsingJs(Vype_ProductCatalogue.btntobaccoswipeleft, "-<");
		
		Thread.sleep(2000);
		gl.clickUsingJs(Vype_ProductCatalogue.btntobaccoswipe, "->");

	}

	@When("^User clicks on fruit tile$")
	public void user_clicks_on_fruit_tile() throws Throwable {

		//click on fruit tile
		gl.clickbutton(Vype_ProductCatalogue.fruittile, "fruit tile ");

	}

	@Then("^Verify all fruit flavors$")
	public void verifies_all_fruit_flavors() throws Throwable {

		//verify Tobacco page
		gl.VerifyElementVisible(Vype_ProductCatalogue.pgFruit, "Fruit ");

		int c=0;

		//verify all flavors Under Fruit
		List<WebElement> list=gl.findElementsList(Vype_ProductCatalogue.txtFruitFlavors);
		System.out.println("No of fruit flavors: "+list.size());
		gl.VerifyElementVisible(Vype_ProductCatalogue.txtFruitFlavors, "No of fruit flavors: "+list.size());
		for(int i=0;i<list.size();i++)
		{
			String str=list.get(i).getText();
			System.out.println((i+1)+":"+str);
			gl.VerifyElementPresent(Vype_ProductCatalogue.txtfruitFlavor(i), str);
			c=c+1;
			if(c==4)
			{
				gl.clickUsingJs(Vype_ProductCatalogue.btnfruitswipe, "->");
				c=0;
			}
		}

	}
	@Then("^Click on left and right corousels for fruit and verify tiles moved accordingly$")
	public void click_on_left_and_right_corosels_for_fruit_and_verify_tiles_moved_accordingly() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		gl.clickUsingJs(Vype_ProductCatalogue.btnfruitswipeleft, "-<");
		Thread.sleep(2000);
		gl.clickUsingJs(Vype_ProductCatalogue.btnfruitswipe, "->");
	    
	}

	@When("^User clicks on berry tile$")
	public void user_clicks_on_berry_tile() throws Throwable {

		//click on berry tile
		gl.clickbutton(Vype_ProductCatalogue.Berrytile, "Berry tile ");
	}

	@Then("^Verify all berry flavors$")
	public void verifies_all_berry_flavors() throws Throwable {

		//verify Berry page
		gl.VerifyElementVisible(Vype_ProductCatalogue.pgBerry, "Berry ");

		int c=0;

		//verify all flavors Under berry
		List<WebElement> list=gl.findElementsList(Vype_ProductCatalogue.txtBerryFlavors);
		System.out.println("No of Berry flavors: "+list.size());
		gl.VerifyElementVisible(Vype_ProductCatalogue.txtBerryFlavors, "No of Berry flavors: "+list.size());
		for(int i=0;i<list.size();i++)
		{
			String str=list.get(i).getText();
			System.out.println((i+1)+":"+str);
			gl.VerifyElementPresent(Vype_ProductCatalogue.txtberryFlavor(i), str);
			c=c+1;
			if(c==4)
			{
				gl.clickUsingJs(Vype_ProductCatalogue.btnberryswipe, "->");
				c=0;
			}
		}

	}
	@Then("^Click on left and right corousels for berry and verify tiles moved accordingly$")
	public void click_on_left_and_right_corosels_for_berry_and_verify_tiles_moved_accordingly() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		gl.clickUsingJs(Vype_ProductCatalogue.btnberryswipeleft, "-<");
		Thread.sleep(2000);
		gl.clickUsingJs(Vype_ProductCatalogue.btnberryswipe, "->");
	}


	@When("^User clicks on clear and Vanilla tile$")
	public void user_clicks_on_clear_and_Vanilla_tile() throws Throwable {

		//clear and  vanilla tile
		gl.clickbutton(Vype_ProductCatalogue.Clearvanillatile, "Clear and vanilla ");
	}

	@Then("^User Verify all clear and vanilla flavors$")
	public void user_verifies_all_clear_and_vanilla_flavors() throws Throwable {

		//verify Clear and vanilla page
		gl.VerifyElementVisible(Vype_ProductCatalogue.pgClearVanilla, "Clear and vanilla ");

		int c=0;

		//verify all flavors Under Clear and vanilla
		List<WebElement> list=gl.findElementsList(Vype_ProductCatalogue.txtClearVanillaFlavors);
		System.out.println("No of Clear and vanilla flavors: "+list.size());
		gl.VerifyElementVisible(Vype_ProductCatalogue.txtClearVanillaFlavors, "No of Clear and vanilla flavors: "+list.size());
		for(int i=0;i<list.size();i++)
		{
			String str=list.get(i).getText();
			System.out.println((i+1)+":"+str);
			gl.VerifyElementPresent(Vype_ProductCatalogue.txtClearVanillaFlavor(i), str);
			c=c+1;
			if(c==4)
			{
				gl.clickUsingJs(Vype_ProductCatalogue.btnClearVanillaswipe, "->");
				c=0;
			}
		}

	}
	@Then("^Click on left and right corousels for clear and verify tiles moved accordingly$")
	public void click_on_left_and_right_corosels_for_clear_and_verify_tiles_moved_accordingly() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		gl.clickUsingJs(Vype_ProductCatalogue.btnClearVanillaswipeleft, "-<");
		
		gl.clickUsingJs(Vype_ProductCatalogue.btnClearVanillaswipe, "->");
	    
	}

	@When("^User clicks on Nicotine free tile$")
	public void user_clicks_on_Nicotine_free_tile() throws Throwable {

		//Nicotine free flavor
		gl.clickbutton(Vype_ProductCatalogue.Nicotinefreetile, "Nicotine free tile");
	}

	@Then("^User Verify all Nicotine free flavors$")
	public void user_verifies_on_Nicotine_free_flavors() throws Throwable {

		//verify Nicotine free
		gl.VerifyElementVisible(Vype_ProductCatalogue.pgNicotinefree, "Nicotine free ");

		int c=0;

		//verify all flavors Under Clear and vanilla
		List<WebElement> list=gl.findElementsList(Vype_ProductCatalogue.txtNicotinefreeFlavors);
		System.out.println("No of Nicotine free flavors: "+list.size());
		gl.VerifyElementVisible(Vype_ProductCatalogue.txtNicotinefreeFlavors, "No of Nicotine free flavors: "+list.size());
		for(int i=0;i<list.size();i++)
		{
			String str=list.get(i).getText();
			System.out.println((i+1)+":"+str);
			gl.VerifyElementPresent(Vype_ProductCatalogue.txtNicotinefreeFlavor(i), str);
			c=c+1;
			if(c==4)
			{
				gl.clickUsingJs(Vype_ProductCatalogue.btnNicotineswipe, "->");
				c=0;
			}
		}



	}
	@Then("^Click on left and right corousels for Nictoine free and verify tiles moved accordingly$")
	public void click_on_left_and_right_corousels_for_Nictoine_free_and_verify_tiles_moved_accordingly() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		gl.clickUsingJs(Vype_ProductCatalogue.btnNicotineswipeleft, "-");
		
		gl.clickUsingJs(Vype_ProductCatalogue.btnNicotineswipe, "->");
	}
	

	@Then("^Verify all categories Limited Edition, Mint, Tobacco, Fruit, Berry,Clear & vanilla,Nicotine Free are present$")
	public void verify_all_categories_Limited_Edition_Mint_Tobacco_Fruit_Berry_Clear_vanilla_Nicotine_Free_are_present() throws Throwable {

		//Verify all flavors
		List<WebElement> list=gl.findElementsList(Vype_ProductCatalogue.allCatagories);
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


		gl.VerifyElementPresent(Vype_ProductCatalogue.MyVuseIQ, "MyVuseIQ");

	}


	@Then("^Select A to Z and verify flavors are in Assending order from A to Z$")
	public void select_A_to_Z_and_verify_flavors_are_in_Assending_order_from_A_to_Z() throws Throwable {


		List<WebElement> list=gl.findElementsList(Vype_ProductCatalogue.flavors);

		for(int i=0;i<5;i++)
		{
			String str=list.get(i).getText();
			beforesort=beforesort+str;
		}
		beforesort=beforesort.trim().replace(" ", "");
		System.out.println(beforesort);
		//click on sort and filter
		//gl.clickbutton(Vype_ProductCatalogue.Sortfilter, "Sort & Filter");

		//click on A to Z
		gl.clickbutton(Vype_ProductCatalogue.AtoZ, "A to Z");

		//done
		gl.clickbutton(Vype_ProductCatalogue.btndone, "Done ");

		//verify A to Z
		gl.VerifyElementPresent(Vype_ProductCatalogue.AtoZ, "A to Z");

		//list after sorting A to Z
		List<WebElement> list1=gl.findElementsList(Vype_ProductCatalogue.flavors);
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
		
		String str=gl.getText(Vype_ProductCatalogue.filterBy);
		gl.VerifyElementPresent(Vype_ProductCatalogue.filterBy, str);

		gl.clickbutton(Vype_ProductCatalogue.filterBy, str);


	}


//	@When("^click on Filter and sort and select Z to A and verify flavors are in Decending order from Z to A$")
//	public void click_on_Filter_and_sort_and_select_A_to_Z_and_verify_flavors_are_in_Decending_order_from_Z_to_A() throws Throwable {
//
//
//		System.out.println(beforesort);
//		//click on sort and filter
//		gl.clickbutton(Vype_ProductCatalogue.Sortfilter, "Sort & Filter");
//
//		//click on A to Z
//		gl.clickbutton(Vype_ProductCatalogue.ZtoA, "Z to A");
//
//		//done
//		gl.clickbutton(Vype_ProductCatalogue.btndone, "Done ");
//
//		//verify A to Z
//		gl.VerifyElementPresent(Vype_ProductCatalogue.ZtoA, "Z to A");
//
//		//list after sorting A to Z
//		List<WebElement> list1=gl.findElementsList(Vype_ProductCatalogue.flavors);
//		String AftersortZtoA="";
//		for(int i=0;i<5;i++)
//		{
//			String str=list1.get(i).getText();
//			AftersortZtoA=AftersortZtoA+str;
//		}
//
//		AftersortZtoA=AftersortZtoA.trim().replaceAll(" ", "").replace("-", "");
//		System.out.println(AftersortZtoA);
//
//		if(beforesort.equals(AftersortZtoA))
//		{
//			reportiumClient.reportiumAssert("not in decending order", false);
//		}
//		if(!beforesort.equals(AftersortZtoA))
//		{
//			reportiumClient.reportiumAssert("sorted is in decending order", true);
//		}
//		
//		String str=gl.getText(Vype_ProductCatalogue.filterBy);
//		gl.VerifyElementPresent(Vype_ProductCatalogue.filterBy, str);
//
//		gl.clickbutton(Vype_ProductCatalogue.filterBy, str);
//
//	}


	@And("^click on search and verify search is enabled$")
	public void click_on_search_and_verify_search_is_enabled() throws Throwable {

		//search
		gl.clickbutton(Vype_ProductCatalogue.txtsearch, "Search ");

		//verify search place holder
		gl.VerifyElementPresent(Vype_ProductCatalogue.txtsearch, "Search ");

		//close
		gl.clickbutton(Vype_ProductCatalogue.btnclose, "Close X ");

		//search
		gl.clickbutton(Vype_ProductCatalogue.txtsearch, "Search ");
	}


	@When("^User enters required flavor \"([^\"]*)\" and verify flavor is displayed after clicking on search$")
	public void user_enters_required_flavor_and_verify_flavor_is_dsiplayed_after_clicking_on_search(String flavor) throws Throwable {
		//entering flavor
		gl.inputText(Vype_ProductCatalogue.entertext, flavor, flavor);


		//suggestions
		gl.VerifyElementPresent(Vype_ProductCatalogue.txtsuggestions, "Suggestions");

		//search
		gl.clickbutton(Vype_ProductCatalogue.btnsearch, "Search ");


		List<WebElement> list=gl.findElementsList(Vype_ProductCatalogue.flavors);
		String dup="";
		for(int i=0;i<list.size();i++)
		{
			for(int j=i+1;j<list.size();j++)
			{
				String s=gl.getText(Vype_ProductCatalogue.flavordesc(i));
				String s1=gl.getText(Vype_ProductCatalogue.flavordesc(j));
				System.out.println(s);
				System.out.println(s1);
				if(s.equals(s1))
				{
					dup=dup+list.get(j).getText()+" ";
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
		gl.VerifyElementPresent(Vype_ProductCatalogue.flavor(flavor), flavor);

		String str=gl.getText(Vype_ProductCatalogue.filterBy);
		gl.VerifyElementPresent(Vype_ProductCatalogue.filterBy, str);

		gl.clickbutton(Vype_ProductCatalogue.filterBy, str);
	}

	@Then("^User select any NS and verify flavors displayed$")
	public void user_select_any_NS_and_verify_flavors_displayed() throws Throwable {

		//click on sort and filter
		//gl.clickbutton(Vype_ProductCatalogue.Sortfilter, "Sort & Filter");

		gl.clickbutton(Vype_ProductCatalogue.btnNS, "1.8");

		//done
		gl.clickbutton(Vype_ProductCatalogue.btndone, "Done ");

       
		List<WebElement> list=gl.findElementsList(Vype_ProductCatalogue.flavors);
		
		String dup="";
		for(int i=0;i<list.size();i++)
		{
			for(int j=i+1;j<list.size();j++)
			{
				if(list.get(i).getText().equals(list.get(j).getText()))
				{
					String s=gl.getText(Vype_ProductCatalogue.flavordesc(i));
					String s1=gl.getText(Vype_ProductCatalogue.flavordesc(j));
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

		String str=gl.getText(Vype_ProductCatalogue.filterBy);
		gl.VerifyElementPresent(Vype_ProductCatalogue.filterBy, str);

		gl.clickbutton(Vype_ProductCatalogue.filterBy, str);
	}

	@And("^User enters flavor \"([^\"]*)\" that is not present and verify no results is displayed$")
	public void user_enters_flavor_that_is_not_present_and_verify_no_results_is_displayed(String flavor) throws Throwable {

		//search
		gl.clickbutton(Vype_ProductCatalogue.txtsearch, "Search ");
		//entering flavor
		gl.inputText(Vype_ProductCatalogue.entertext, flavor, flavor);

		//search
		gl.clickbutton(Vype_ProductCatalogue.btnsearch, "Search ");

		//No results
		gl.VerifyElementPresent(Vype_ProductCatalogue.txtnoresults, "No Results");

		String str=gl.getText(Vype_ProductCatalogue.filterBy);
		gl.VerifyElementPresent(Vype_ProductCatalogue.filterBy, str);

		gl.clickbutton(Vype_ProductCatalogue.filterBy, str);


	}
	
	//Added by sireesha
	@When("^User click on Filter and Sort option$")
	public void user_click_on_Filter_and_Sort_option() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
		gl.clickbutton(Vype_ProductCatalogue.Sortfilter, "Sort & Filter");
	}

	@Then("^Verify Filter and sort menu is opened with relevant text$")
	public void verify_Filter_and_sort_menu_is_opened_with_relevant_test() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		gl.VerifyElementVisible(Vype_ProductCatalogue.txtfliter, "heading of filter");
	  
		List<WebElement> list4 = gl.findElementsList(Vype_ProductCatalogue.wesections);
		System.out.println("Total no of sections: "+list4.size());
		for(int i=0; i<list4.size();i++)
		{

			gl.VerifyElementPresent(Vype_ProductCatalogue.wesections,"list of titles");
			String s=list4.get(i).getText();
			System.out.println((i+1)+":"+s);

		}
	}

	@When("^User clicks on any option from sort by$")
	public void user_clicks_on_any_option_from_sort_by() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		gl.clickbutton(Vype_ProductCatalogue.AtoZ, "A to Z");
	}

	@Then("^Verify the hyperlinks is available$")
	public void verify_the_hyperlinks_is_available() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    gl.VerifyElementVisible(Vype_ProductCatalogue.txtclear,"Clear hyperlink");
	    
	    gl.fnScrollToView(Vype_ProductCatalogue.txtclearfilter);
	    
	    gl.VerifyElementVisible(Vype_ProductCatalogue.txtclearfilter, "Clear all filters ");
	}

	@When("^User clicks on clear hyperlink at the bottom$")
	public void user_clicks_on_clear_hyperlink_at_the_bottom() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		 gl.clickUsingJs(Vype_ProductCatalogue.txtclear,"Clear hyperlink");
	}

	@Then("^Verify the filter is cleared$")
	public void verify_the_filter_is_cleared() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   gl.verifyobjectisnotavailable(Vype_ProductCatalogue.txtclearfilter,"Clear hyperlink");
	}

	@When("^User clicks on any option from Nicotine strength$")
	public void user_clicks_on_any_option_from_Nicotine_strength() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		gl.clickbutton(Vype_ProductCatalogue.btnNS, "1.8");
	}

	@Then("^User selects any nictoine strength and verify flavors are with corresponding nictoine strength$")
	public void user_selects_any_nictoine_strength_and_verify_flavors_are_with_corresponding_nictoine_strength() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
		gl.clickbutton(Vype_ProductCatalogue.btndone, "Done ");

	       
		List<WebElement> list=gl.findElementsList(Vype_ProductCatalogue.flavors);
		
		String dup="";
		for(int i=0;i<list.size();i++)
		{
			for(int j=i+1;j<list.size();j++)
			{
				if(list.get(i).getText().equals(list.get(j).getText()))
				{
					String s=gl.getText(Vype_ProductCatalogue.flavordesc(i));
					String s1=gl.getText(Vype_ProductCatalogue.flavordesc(j));
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

		String str=gl.getText(Vype_ProductCatalogue.filterBy);
		gl.VerifyElementPresent(Vype_ProductCatalogue.filterBy, str);

		gl.clickbutton(Vype_ProductCatalogue.filterBy, str);
	}

	@When("^click on Filter and sort and select Z to A and select nictoine strength$")
	public void click_on_Filter_and_sort_and_select_Z_to_A_and_select_nictoine_strength() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		gl.clickbutton(Vype_ProductCatalogue.Sortfilter, "Sort & Filter");
		
		gl.clickUsingJs(Vype_ProductCatalogue.ZtoA, "Z to A");
		
		gl.clickbutton(Vype_ProductCatalogue.btnNS, "1.8");
		
		gl.clickbutton(Vype_ProductCatalogue.btndone, "Done ");
	
		
	}

	@Then("^verify flavors are in Decending order from Z to A are with corresponding nictoine strength$")
	public void verify_flavors_are_in_Decending_order_from_Z_to_A_are_with_corresponding_nictoine_strength() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		gl.VerifyElementPresent(Vype_ProductCatalogue.ZtoA, "Z to A");
		
				//list after sorting Z to A
		
				List<WebElement> list1=gl.findElementsList(Vype_ProductCatalogue.flavors);
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
				
				String str=gl.getText(Vype_ProductCatalogue.filterBy);
				gl.VerifyElementPresent(Vype_ProductCatalogue.filterBy, str);
		
			gl.clickbutton(Vype_ProductCatalogue.filterBy, str);
		
	List<WebElement> list=gl.findElementsList(Vype_ProductCatalogue.flavors);
	
	String dup="";
	for(int i=0;i<list.size();i++)
	{
		for(int j=i+1;j<list.size();j++)
		{
			if(list.get(i).getText().equals(list.get(j).getText()))
			{
				String s=gl.getText(Vype_ProductCatalogue.flavordesc(i));
				String s1=gl.getText(Vype_ProductCatalogue.flavordesc(j));
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

	String str1=gl.getText(Vype_ProductCatalogue.filterBy);
	gl.VerifyElementPresent(Vype_ProductCatalogue.filterBy, str);

	gl.clickbutton(Vype_ProductCatalogue.filterBy, str);
		
	}
}

	
	
	
	
	
	
	
	
	
	
	
	

