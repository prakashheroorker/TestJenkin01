package stepDefinitions;

import com.rai.framework.BaseClass;
import com.rai.framework.CommonFunctions;

import com.rai.framework.RAI_Desktop_Utility_Functions;



import org.openqa.selenium.By;



import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import goVype_Properties.Vype_CommonXpath;
import goVype_Properties.Vype_ConditionsOfSale;
import goVype_Properties.Vype_CookiePolicy;
import goVype_Properties.Vype_Footer;
import goVype_Properties.Vype_PrivacyPolicy;

public class BottomContents extends BaseClass  {
	RAI_Desktop_Utility_Functions gl = new RAI_Desktop_Utility_Functions();
	CommonFunctions function = new CommonFunctions(gl);
	
	//public static RemoteWebDriver driver;
	
	@When("^Scroll Down and click on conditions of sale in the page footer$")
	public void scroll_Down_and_click_on_conditions_of_sale_in_the_page_footer() throws Throwable {
		gl.fnScrollToView(Vype_ConditionsOfSale.lnkConditionsOfSale);
		gl.clickLink(Vype_ConditionsOfSale.lnkConditionsOfSale, "lnkConditionsOfSale");
	}

	@Then("^Verify Whether User Is Navigated To Conditions Of Sale Page$")
	public void verify_Whether_User_Is_Navigated_To_Conditions_Of_Sale_Page() throws Throwable {
		gl.VerifyElementVisible(Vype_ConditionsOfSale.pgeConditionsOfSale, "Conditions Of Sale Page");
		
	}

	@And("^Verify Display Content Is Same As Production URL$")
	public void verify_Display_Content_Is_Same_As_Production_URL() throws Throwable {
		String content=gl.getText(Vype_ConditionsOfSale.weConditionsOfSaleContent);
		//String content = "ConditionsofSaleImperialTobaccoCompanyIntroductionWhatthesetermscover:TheseTermsandConditionsofSale(\"Terms\"),togetherwithallinformationanddocumentsreferredtointhem,governallsalesofproducts(\"Products\")byusthroughthiswebsite(the\"Website\")toyou.Whyyoushouldreadthem:PleasemakesureyouhavereadtheseTermscarefully,especiallythelimitationsofourliability,beforeplacinganorder.Thesetermstellyouwhoweare,howwewillprovideproductstoyou,howyouandwemaychangeorendthecontract,whattodoifthereisaproblemandotherimportantinformation.Ifyouthinkthatthereisamistakeintheseterms,pleasecontactustodiscuss.Acceptanceoftheseterms:ByplacinganorderforaProductthroughourWebsite,youagreetoandaccepttheseTerms.YoushouldprintacopyoftheseTermsorsavethemforfuturereference.Eligibility:ToregisterwithandpurchaseProductsviatheWebsite,youmustbeanadultoflegalagetopurchasevapingproductsinyourCanadianjurisdictionofresidenceandyoumustonlyplaceordersforpersonalordomesticuse.Youmaynotplacelargemultipleordersofvapingproductsthatexceedanamountreasonablyrequiredforpersonaluseortheuseofadultfamilymembers.WemayamendtheseTermsfromtimetotime:EverytimeyouorderaProduct,pleasechecktheseTermstoensureyouunderstandthetermswhichwillapplyatthattime.TheseTermsweremostrecentlyupdatedonMay8,2020.Websitetermsofuse:YouruseofourWebsiteisgovernedbyourWebsiteTermsandConditions.PleasereadtheseastheyincludeimportanttermsthatapplywheneveryouvisitthisWebsite.InformationAboutUsWhoweare:WhenyoupurchaseaProductthroughourWebsiteyouwillbecontractingwithImperialTobaccoCompanyLimited,3711,St-AntoineStreetWest,Montreal(Quebec)H4C3P6(\"we\",\"our\"or\"us\").Howtocontactus:Tocontactus,pleaseseeourContactUspageoremailusatinfo.ca@vuse.comorwritetousviapostatConsumerService(ImperialTobacco),3711,St-AntoineStreetWest,Montreal(Quebec)H4C3P6.Howwemaycontactyou:Ifwehavetocontactyouwewilldosobytelephoneorbywritingtoyouattheemailaddressorpostaladdressyouprovidedtousinyourorder.\"Writing\"includesemails.Whenweusethewords\"writing\"or\"written\"intheseTerms,thisincludesemails.OurProductsProductsmayvaryslightlyfromtheirpictures:TheProductsareasdescribedonthisWebsitefromtimetotime.PleasenotethattheProductsandanypackagingontheWebsiteareforillustrativepurposesonly.SlightvariationsmayoccurbetweenthedeliveredProductandpackaging,andtheimageoftheProductandpackaginggivenontheWebsite.YoushouldensurethatyouhavecheckedtheProductdescriptionontheWebsitebeforeplacingyourorder.HowToOrderWeonlyselltoadultsoflegalagetobuyvapingproductsinCanada:WeonlyacceptordersfromadultsoflegalagetopurchasevapingproductsintheirCanadianjurisdictionofresidence,whoplaceordersforpersonalordomesticuse,andwhocanreceivetheirshipmentataCanadianpostaladdressbyshowingavalidgovernmentissuedIDupondelivery.Wedonotacceptlargemultipleordersofvapingproductsthatexceedanamountreasonablyrequiredforpersonaluseortheuseofadultfamilymembers.Creditcardrequired:Inordertoplaceanorder,youmustbetheholderofavalidcreditcardaccountandprovidethedetails.Orderingprocess:YoumayplaceanorderforaProductviaouronlineorderprocessontheWebsite.TheWebsitecontainsinstructionsonhowtocompletetheorderprocessandcheckandamendanyerrorsbeforesubmittingyourordertous.Attheendoftheorderprocessyouwillbeaskedtoprovidepaymentthroughtheon-linepaymentfacility.Yourorderwillbesubmittedtouswhenyouclickonthe\"SUBMITORDER\"buttonattheendoftheorderprocess.YourorderrepresentsanoffertoustopurchaseaProduct.Howwewillacceptyourorder:Afteryouplaceyourorder,wewillsendyouaconfirmationemailconfirmingouracceptanceofyourorder.Takingpayment:Byplacinganorder,youauthorizeustoimmediatelychargeyourpaymentcardforthepurchasepriceandweareentitledtorelyonyourplacingofanorderasaninstructiontoustotakeyourpayment.Ifwecannotacceptyourorder:Ifweareunabletoacceptyourorder,wewillinformyouofthisandwillnotchargeyoufortheProduct.ThismightbebecausetheProductisoutofstock,becauseofunexpectedlimitsonourresourceswhichwecouldnotreasonablyplanfor,becausewehaveidentifiedanerrorinthepriceordescriptionoftheProduct,becauseweareunabletomeetadeliverydeadline,orbecausetheorderexceedsanamountreasonablyrequiredforpersonaluseortheuseofadultfamilymembers(orisoneofmultiplelargeordersplacedbyyou,thatexceedsanamountreasonablyrequiredforpersonaluseortheuseofadultfamilymembers).Productsaresubjecttoavailability:AllProductsshownontheWebsitearesubjecttoavailability.WewillinformyoubyemailassoonaspossibleiftheProductyouhaveorderedisnotavailableandwillnotprocessyourorder.PricesPrices&DeliveryCosts:Allpricesstatedexcludeapplicabletaxes.Deliverychargeswillbeindicatedtoyouatthetimeoforderingandwillbeaddedtothepurchasepricebeforeyouconfirmyourorder.Wheretofindtheprice:ThepriceofaProductisaspublishedontheWebsiteonthedateyouplaceyourorder.Pricesaresubjecttochangewithoutnoticeatanytime,butchangeswillnotaffectanyorderthatyouhavepreviouslyplaced.Whathappensifwegotthepricewrong:Itispossiblethat,despiteourreasonableefforts,aProductonourWebsitemaybeincorrectlypriced.IfwediscoveranerrorinthepriceofaProductthatyouhaveordered,wewillinformyouofthiserrorandgiveyoutheoptiontocontinuewithyourorderatthecorrectpriceortocancelyourorder.Ifyoudonotrespondtouswithin7days,wewilltreattheorderascancelledandnotifyyouinwriting.HowToPayHowtopay:YoumaypayfortheProductwithacreditcard,oranyotherpaymentmethodthatweindicatetoyouthatwewillacceptfromtimetotime,usingtheonlinepaymentfacility.Thepaymentfacilityisoperatedbyathirdpartyprovider.Youruseofthepaymentfacilitywillbesubjecttothetermsandconditionsofthethirdpartyprovider.Youshouldensurethatyouhavereadandagreewiththosetermsandconditionsbeforeusingthepaymentfacility.Authorityforpayment:Wewillrequestauthorityforpaymentfromyourcardatthetimeyouplaceyourorder.Ifwefailtoreceiveauthorityforyourpayment,orifwereasonablybelievethatpaymentwillberefused,wereservetherighttorejectyourorder.Intheeventofafailedpaymentforwhateverreason,youagreetocompensateusinfullagainstallreasonablecosts,expensesandoutgoingsweincurinattemptingtoobtainpaymentauthorizedbyormadebyyou.ShippingCanadaonly(excludingQuebec,NovaScotia,Yukon,NorthwestTerritories,andNunavut):DeliveryofaProductwillonlybemadetoaCanadianpostaladdress.Deliverycostandmethod:YourorderwillbesentusingoneofourdeliveryserviceprovidersatthecostdisplayedontheWebsitebeforeyouconfirmyourorder.Weacceptnoresponsibilityforordersthatarenotreceivedasaresultofanincompleteorincorrectaddressbeingprovided.WhenwewillprovidetheProducts:WewillindicateourestimateddeliverydateontheWebsite.PleasenotethatthedateindicatedontheWebsiteisonlyanestimateandisnotguaranteed.WewillsendyouanemailconfirmingwhenyourProducthasbeenshipped,whichwillbewithin30daysafterthedateonwhichweacceptyourorder.Wearenotresponsiblefordelaysoutsideofourcontrol:IfoursupplyoftheProductsisdelayedbyaneventoutsideourcontrol,wewillcontactyouassoonaspossibletoletyouknowandwewilltakestepstominimizetheeffectofthedelay.However,ifyouhavenotreceivedyourProductwithin5businessdaysofthedateweconfirmthatyourproducthasshipped,pleasenotifyus.WhenyoubecomeresponsiblefortheProducts:TheProductswillbeyourresponsibilityoncetheyhavebeendeliveredtotheaddressindicatedinyourorder.WhenyouowntheProducts:YouwillowntheProductsoncewehavereceivedpaymentfromyouinfull.IfyouarenotathomewhentheProductisdelivered:AnadultwillberequiredtosignandacceptresponsibilityfortheProductatthetimeofdelivery.TheProductswillnotbeleftinamailboxoratthedoorstep.Pleasehavegovernment-issuedphotoidentificationavailableatthetimeofdeliverytohelpconfirmyourage.Ifanadultisnotavailableatyouraddresstotakedelivery,anotewillbeleftinformingyouofhowtoarrangefordeliveryorwheretopick-uptheProducts.Ifyoudonotarrangefordelivery:IfyoudonotarrangedeliveryorcollecttheProductsfromapick-uplocationspecifiedinanoteleftatyourdeliveryaddress,wewillcontactyouforfurtherinstructions.Ifweareunabletoarrangeforanewdeliverytime,wemaycancelthecontractandtheProductswillbereturnedtoourwarehouse.ReasonswemaysuspendthesupplyofProductstoyou.WemayhavetosuspendthesupplyofaProductto:dealwithtechnicalproblemsormakeminortechnicalchanges;updatetheProducttoreflectchangesinrelevantlawsandregulatoryrequirements;makechangestotheProductasrequestedbyyouornotifiedbyustoyou.Incorrect,DamagedorDefectiveItems.Pleaseinspectyourdeliverywithin5daysofreceipttomakesurethatyoureceivedwhatyouorderedingoodcondition.Damageditems.Ifyourdeliveryarrivesdamaged,pleasecontactusimmediatelytoarrangeareturn.Wereservetherighttoinspecttheproductanddeterminewhetherornotweconsidertheitemtobedamaged.Ifweconfirmthatitisdamaged,youwillreceiveafullrefundorreplacement.Incorrectitems.Ifyourdeliverydoesnotcontainalloftheitemsyouordered,orifitcontainsdifferentitemsfromtheonesyourordered,pleaseletusknowimmediatelysothatwecanresolvethesituation.Defectiveitems.Ifyouritemisdefectiveinanyway,pleasecontactusimmediatelytoarrangeareplacement.Thefollowingoutlinesourreturnpolicyontheproductcategoriesidentifiedbelow:Batteries:within6monthsofthedateofreceipt.Chargers:within12monthsofreceipt.ReturnsUnopenedreturns:Weacceptreturnsofunopenedproductswithin14daysofreceipt.Return/ReplacementProcess:Ifyouwouldliketoreturnyourorderorobtainareplacementproductforanyreasonoutlinedbelow,pleasefollowthestepsbelow:Contactusbyphoneat1-833-308-8873oremailusatinfo.ca@vuse.comPleasebepreparedtoprovidedetailssuchas:Thenatureofyourrequest(e.g.didyourdeliverycontainincorrect,damaged,ordefectiveproducts?).Yourordernumberoranemailaddressorphonenumberassociatedwithyouraccountsothatwecanlocateyourpurchase.Theproductbatch/serialnumber(ifavailable).Ifadeliverycontainsanincorrect,damagedordefectiveproduct,youwillbeaskedtoreturnthefaultydeviceforreview.Afterreview,ifthedeviceisdeterminedtobefaulty,wewillissueafullrefundorreplacementproduct.Youmayalsobeofferedtheoptionofhavingareplacementproductsenttoyouimmediately,conditionalonyouragreementtoreturnyourincorrect,damagedordefectiveproductuponreceiptofthereplacementproduct.Failuretoreturnareplacementproductwithin21daysofreceiptofthereplacementproductmayresultinachargetoyourpaymentmethodfortheamountofthereplacementdevice.SubscriptionProgramOurSubscriptionTerms&Conditionssetoutadditionalinformation,andtermswhichapplytooursubscriptionprogram.ThisdocumentisavailablethroughourWebsite,andherebyincorporatedintotheseTermsbyreference.ComplaintsHowtotellusaboutproblems:PleasecontactusviaemailortheaddressprovidedintheseTermsifyouhaveanycomplaintsabouttheProducts.Weaimtoresolveanycomplaintsasquicklyaspossiblewithin14days.YourAccountHowtocreateanaccount:YoumayplaceanordertopurchasetheProductbycreatinganaccountontheWebsite.Inordertoapplytocreateanaccount,pleasefollowtheinstructionsontheWebsite.Itwillbeatoursolediscretionastowhetherweacceptyourapplicationtocreateanaccount.Oneaccountperuser:Onlyoneaccountmaybecreatedperindividualuser.Informationwerequire:Youwillbeaskedtoprovideinformationincludingyourname,dateofbirth,emailaddressandbillingaddresswhencreatingyouraccount.Werequireyourdateofbirthandyourbillingaddresstoverifythatyouareanadultoflegalagetopurchasevapingproducts,assetoutinourPrivacyPolicy.YouremailaddresswillbeusedtoidentifyyouwhenyouuseittoaccessyouraccountontheWebsite.Youagreetoupdateandmaintainaccurateinformationinconnectionwithyouraccount.Wereservetherighttoterminateyouraccountintheeventthatyouprovideaninvalidemailaddressorotherinaccurateinformation.Choosingapassword:Youwillalsoneedtoprovideapasswordinordertoaccessyouraccount.Youareentirelyresponsibleformaintainingtheconfidentialityofyourpasswordandyouwillberesponsibleforanydamageorlossescausedbyunauthorizedaccessresultingfromyourfailuretokeepyourpasswordsecure.Weencourageyoutousea\"strong\"password(includingacombinationofnumbersandletters)thatisuniquetoourservice.Youagreetonotifyusimmediatelyintheeventofanyunauthorizeduse,orsuspectedunauthorizeduseofyourpasswordoraccount.ClosingYourAccountWemaycloseyouraccount:Wemaytemporarilysuspendorcloseyouraccountatanytimeandforanyreasonwithoutnotice.Howcanyoucloseyouraccount:Youmaycloseyouraccountatanytimeandforanyreasonbycontactingusbytelephoneat1-833-308-8873.Wemayneedtotakestepstoverifyyouridentitybeforewecanmakechangesinconnectionwithyouraccount.HowWeMayUseYourPersonalInformationUseo\r\n";
		gl.fnContentValidation(content, Vype_ConditionsOfSale.weConditionsOfSaleContent);
	}
	
		
	@Then("^Verify the Support Email ID in the content$")
	public void verify_the_Support_Email_ID_in_the_content() throws Throwable {
		gl.clickLink(Vype_ConditionsOfSale.lnkinfoSupportEmailID, "info.ca@vuse.com ");

	}

	@Then("^Verify SubLinks Content - Cookie policy$")
	public void verify_SubLinks_Content_Cookie_policy() throws Throwable {
		gl.clickLink(Vype_ConditionsOfSale.lnkCookiePolicy, "Cookie policy Link");
	    gl.navigateBack();
	    gl.ScrolltoTopofthepage();
	}
	
	
	@When("^Scroll down and click on cookie policy in the page footer$")
	public void swipe_down_and_click_on_cookie_policy_in_the_page_footer() throws Throwable {
		gl.fnScrollToView(Vype_CommonXpath.lnkCookiePolicy);
		gl.clickLink(Vype_CommonXpath.lnkCookiePolicy,"Footer section Cookie Policy");
		Thread.sleep(2000);
		
	}

	@Then("^Verify whether user is navigated to cookie policy page$")
	public void verify_whether_user_is_navigated_to_cookie_policy_page() throws Throwable {
		
		gl.VerifyPageDisplayed(Vype_CommonXpath.txtCookiePolicy, "Cookie Policy");
		
	}

	@Then("^Verify Cookie Policy content should be same as Production environment\\.$")
	public void verify_Cookie_Policy_content_should_be_same_as_Production_environment() throws Throwable {
		String txtCookiePolicyContent=gl.getText(Vype_CommonXpath.txtcookiePolicyContent);
		gl.fnContentValidation(txtCookiePolicyContent, Vype_CommonXpath.txtcookiePolicyContent);
		
	}

	@Then("^Verify the terms and conditions ,privacy policy and contact us links in the page content are displayed\\.$")
	public void verify_the_terms_and_conditions_privacy_policy_and_contact_us_links_in_the_page_content_are_displayed() throws Throwable {
		
		gl.VerifyElementVisible(Vype_Footer.pgTermsAndCondition," Terms & Conditions");
		
		gl.VerifyElementVisible(Vype_CommonXpath.txtPrivacyPolicy, "Privacy Policy ");
		
		gl.VerifyElementVisible(Vype_CommonXpath.lnkContactUs,"Contact Us");
		
	}
	
	@And("^Verify the  website, delete and Control cookies and partners or site urls are displayed$")
	public void verify_the_website_delete_and_Control_cookies_and_partners_or_site_urls_are_displayed() throws Throwable {
		
		gl.VerifyElementVisible(Vype_CommonXpath.websiteurl,"https://www.vuse.com/ca/en/");
		
		gl.VerifyElementVisible(Vype_CookiePolicy.lnkAllaboutCookies, "https://www.vuse.com/ca/en/");
		
		gl.VerifyElementVisible(Vype_CookiePolicy.lnkPartners,"www.google.com/policies/privacy/partners/");
		
	}
	
	@When("^Click on Terms and Conditions link in the content$")
	public void click_on_Terms_and_Conditions_link_in_the_content() throws Throwable {
		
		gl.clickbutton(Vype_CommonXpath.lnkTermsandConditions,"Terms and Conditions");
		Thread.sleep(30000);
		
		
	}
	

	@Then("^Verify the user navigates to  terms and condition page in the new tab$")
	public void verify_the_user_navigates_to_terms_and_condition_page_in_the_new_tab() throws Throwable {
	
		gl.fnSwitchToSucceedingTab();
		gl.VerifyElementVisible(Vype_Footer.pgTermsAndCondition," Terms & Conditions");
		
		
		
	}
	@When("^Close the current tab$")
	public void close_the_current_tab() throws Throwable {
		gl.fnCloseCurrentTab();
		gl.fnSwitchToDefaultTab();
	}

	@When("^Click on Privacy Policy link  in the content$")
	public void click_on_Privacy_Policy_link_in_the_content() throws Throwable {
		gl.clickLink(Vype_CommonXpath.lnkPrivacyPolicy,"Privacy Policy");
		Thread.sleep(2000);
		
		
	}
	
	@Then("^Verify the user navigates to  Privacy policy page in the new tab$")
	public void verify_the_user_navigates_to_Privacy_policy_page_in_the_new_tab() throws Throwable {
		gl.VerifyElementVisible(Vype_CommonXpath.txtPrivacyPolicy, "Privacy Policy ");
	
		
	}

	@When("^Click on http://www.allaboutcookies.org/ link$")
	public void click_on_http_www_allaboutcookies_org_link() throws Throwable {
		gl.clickLink(Vype_CookiePolicy.lnkAllaboutCookies,"http://www.allaboutcookies.org/");
	}

	@And("^Navigate back to the Cookie Policy page$")
	public void navigate_back_to_the_Cookie_Policy_page() throws Throwable {
		gl.navigateBack();
		Thread.sleep(3000);
		gl.VerifyPageDisplayed(Vype_CommonXpath.txtCookiePolicy, "Cookie Policy");
	}

	@When("^Click on policies/privacy/partners link$")
	public void click_on_policies_privacy_partners_link() throws Throwable {
		gl.clickLink(Vype_CookiePolicy.lnkPartners,"www.google.com/policies/privacy/partners/");
		
	}

	@Then("^Verify the user navigates to Google Privacy terms page in the same tab$")
	public void verify_the_user_navigates_to_Google_Privacy_terms_page_in_the_same_tab() throws Throwable {
		Thread.sleep(20000);
		gl.VerifyPageDisplayed(Vype_CookiePolicy.txtPrivacyTerms, "Privacy & Terms");
	
	}

	@Then("^navigate back to homepage$")
	public void navigate_back_to_homepage() throws Throwable {
		gl.navigateBack();
		Thread.sleep(3000);
		// Verify that Post Login home page is displayed
		gl.VerifyPageDisplayed(Vype_CommonXpath.btnAccount, "Post Login Vype Home");
	}

	@When("^Click on Contact Us link$")
	public void click_on_Contact_Us_link() throws Throwable {
		gl.clickLink(Vype_CommonXpath.lnkContactUs,"Contact Us");
		gl.fnCloseCurrentTab();
		gl.fnSwitchToDefaultTab();
	}

	@When("^Scroll down and click on Terms & Conditions in the page footer$")
	public void scroll_down_and_click_on_Terms_Conditions_in_the_page_footer() throws Throwable {
		gl.fnScrollToView(Vype_Footer.lnkTermsAndCondition);
		gl.clickUsingJs(Vype_Footer.lnkTermsAndCondition," Terms & Conditions");
		Thread.sleep(3000);
	}

	@When("^Click on Terms And Conditions$")
	public void click_on_TermsAndConditions() throws Throwable {
		gl.clickUsingJs(Vype_Footer.lnkTermsAndCondition," Terms & Conditions");
	    Thread.sleep(3000);
	}

	@Then("^Verify that Terms & Conditions page displayed$")
	public void verify_that_Terms_Conditions_page_displayed() throws Throwable {
		gl.VerifyElementVisible(Vype_Footer.pgTermsAndCondition," Terms & Conditions");
		Thread.sleep(3000);
	}
	
	@Then("^Verify TermsAndConditions content should be same as Production environment\\.$")
	public void verify_TermsAndConditions_content_should_be_same_as_Production_environment() throws Throwable {
		
		String content=gl.getText(Vype_Footer.weTermsandConditions);
		gl.fnContentValidation(content, Vype_Footer.weTermsandConditions);
	}
	
	@Then("^Verify the Sub-Links Conditions Of Sale, Privacy policy,Cookiepolicy and Contact us are displayed in the content$")
	public void verify_the_Sub_Links_Conditions_Of_Sale_Privacy_policy_Cookiepolicy_and_Contact_us_are_displayed_in_the_content() throws Throwable {
	   
		gl.VerifyElementPresent(Vype_ConditionsOfSale.lnkConditionsOfSale,"ConditionsOfSale");
		
		gl.VerifyElementVisible(Vype_CommonXpath.lnkContactUs,"Contact Us");
		
		gl.VerifyElementVisible(Vype_CommonXpath.txtPrivacyPolicy, "Privacy Policy ");
		
	}
	
	@Then("^Navigate back to home page$")
	public void navigate_back_to_home_page() throws Throwable {
	    gl.browserBack();
	 // Verify that Post Login home page is displayed
	 gl.VerifyPageDisplayed(Vype_CommonXpath.btnAccount, "Post Login Vype Home");
		
	}
	
	@Then("^Verify that Conditions of Sale content present in the Terms & Condition page$")
	public void verify_that_Conditions_of_Sale_content_present_in_the_Terms_Condition_page() throws Throwable {
		gl.VerifyElementPresent(By.xpath("//*[@href='https://www.vuse.com/ca/en/pages/conditions-of-sale']"), "Conditions of Sale");
		Thread.sleep(3000);
		
	}

	@Then("^Verify the Support email Id support@govype.ca content present in the Terms & Condition page$")
	public void verify_the_Support_email_Id_support_govype_ca_content_present_in_the_Terms_Condition_page() throws Throwable {
		gl.VerifyElementPresent(By.xpath(".//*[@href='mailto:support@govype.ca']"), "Support Email ID(support@govype.ca)");	
		
		
		Thread.sleep(3000);
	}
	
	
	@When("^Scroll Down and Click on  Privacy Policy in the page footer$")
	public void scroll_Down_and_Click_on_Privacy_Policy_in_the_page_footer() throws Throwable {
		gl.fnScrollToView(Vype_ConditionsOfSale.lnkConditionsOfSale);
		gl.clickLink(Vype_CommonXpath.lnkPrivacyPolicy, "Privacy Policy link ");
		Thread.sleep(2000);
	}

	@Then("^Verify privacy policy page is displayed$")
	public void verify_privacy_policy_page_is_displayed() throws Throwable {
		gl.VerifyPageDisplayed(Vype_CommonXpath.txtPrivacyPolicy, "Privacy Policy ");
		Thread.sleep(2000);
	}

	@Then("^Verify Privacy Policy page content should be same as Production environment\\.$")
	public void verify_Privacy_Policy_page_content_should_be_same_as_Production_environment() throws Throwable {
		
		String content=gl.getText(Vype_PrivacyPolicy.wePrivacyPolicyContent);
		gl.fnContentValidation(content , Vype_PrivacyPolicy.wePrivacyPolicyContent);
		Thread.sleep(5000);
		
	}

	@Then("^Verify the Support Email ID: support@govype\\.ca and website url is displayed$")
	public void verify_the_Support_Email_ID_support_govype_ca_and_website_url_is_displayed() throws Throwable {
		System.out.println(">>>>>>>>>>>Support email Id: >>>>>>>>>>>>>>>>");
		String supportID = "info.ca@vuse.com";
		gl.fnContentValidation(supportID , Vype_PrivacyPolicy.lnkPPSupportEmailID);
		Thread.sleep(2000);
		gl.VerifyElementVisible(Vype_CommonXpath.websiteurl,"https://www.vuse.com/ca/en/");
		
	}
	
	@Then("^Verify the Sub-Links Conditions Of Sale, Terms and Condition ,Cookiepolicy,Account details page and Contact us in the content$")
	public void verify_the_Sub_Links_Conditions_Of_Sale_Terms_and_Condition_Cookiepolicy_Account_details_page_and_Contact_us_in_the_content() throws Throwable {
		
		gl.VerifyElementPresent(Vype_ConditionsOfSale.lnkConditionsOfSale,"ConditionsOfSale");
		
		gl.VerifyElementPresent(Vype_Footer.lnkTermsAndCondition," Terms & Conditions");
		
		gl.VerifyElementPresent(Vype_CommonXpath.lnkCookiePolicy,"Cookie Policy");
		
		gl.VerifyElementVisible(Vype_CommonXpath.lnkContactUs,"Contact Us");
		
		gl.VerifyElementVisible(Vype_CommonXpath.lnkAccdetailspage,"//a[@href='https://www.vuse.com/ca/en/account']");
			
	}

	@When("^Click on Terms & Condition sublink$")
	public void click_on_Terms_Condition_sublink() throws Throwable {
		gl.ScrolltoTopofthepage();
		Thread.sleep(2000);
		//gl.clickUsingJs(Vype_PrivacyPolicy.lnkTermsConditions, "Terms and Conditions link");
		Thread.sleep(3000);
		//gl.closeBrowser();
		gl.fnSwitchToDefaultTab();
	}

	@Then("^Verify Terms and Conditions page is opened in same tab$")
	public void verify_Terms_and_Conditions_page_is_opened_in_same_tab() throws Throwable {
		/*String currentWindowHandle = rdriver.getWindowHandle();
		//Thread.sleep(3000);
		gl.fnVerifyPageLoadedInSameTab(currentWindowHandle, Vype_CommonXpath.txtTermsConditions, "Terms and COnditions");
		Thread.sleep(3000);*/
		
		gl.VerifyElementPresent(Vype_PrivacyPolicy.pgTermsConditions, "TermsConditions");
		
	}

	@When("^Click on Conditions of Sales sublink in the content$")
	public void click_on_Conditions_of_Sales_sublink_in_the_content() throws Throwable {
		gl.fnSwitchToDefaultTab();
		gl.clickUsingJs(Vype_PrivacyPolicy.lnkConditionofSale, "Conditions of Sales link");
		
	}

	@When("^Navigate back to privacy policy page$")
	public void navigate_back_to_privacy_policy_page() throws Throwable {
	    gl.browserBack();
	    gl.VerifyPageDisplayed(Vype_CommonXpath.txtPrivacyPolicy, "Privacy Policy ");
		Thread.sleep(2000);
	    
	}
	@Then("^Verify Conditions of Sales page is opened in same tab$")
	public void verify_Conditions_of_Sales_page_is_opened_in_same_tab() throws Throwable {
		String currentWindowHandle2 = rdriver.getWindowHandle();
		//Thread.sleep(3000);
		gl.fnVerifyPageLoadedInSameTab(currentWindowHandle2, Vype_CommonXpath.txtConditionsofSale, "Conditions of Sales");

		Thread.sleep(3000);
	}

}
