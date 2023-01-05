package stepDefinitions_Mobile;

import org.openqa.selenium.By;

import com.rai.framework.CommonFunctions_Mobile;
import com.rai.framework.RAI_Mobile_Utility_Functions;

import cucumber.api.java.en.*;
import goVype_Properties_mobile.Vype_CommonXpath;
import goVype_Properties_mobile.Vype_ConditionsOfSale;
import goVype_Properties_mobile.Vype_CookiePolicy;
import goVype_Properties_mobile.Vype_Footer;
import goVype_Properties_mobile.Vype_PrivacyPolicy;
import goVype_Properties_mobile.*;

public class Footerlinksvalidation {


	RAI_Mobile_Utility_Functions rai = new RAI_Mobile_Utility_Functions();
	CommonFunctions_Mobile function = new CommonFunctions_Mobile(rai);


	@When("^Swipe Down and click on conditions of sale in the page footer in mobile$")
	public void scroll_Down_and_click_on_conditions_of_sale_in_the_page_footer() throws Throwable {
		rai.ScrollByxpath(Vype_ConditionsOfSale.lnkConditionsOfSale);
		rai.clickLink(Vype_ConditionsOfSale.lnkConditionsOfSale, "lnkConditionsOfSale");
	}

	@Then("^Verify Whether User Is Navigated To Conditions Of Sale Page in mobile$")
	public void verify_Whether_User_Is_Navigated_To_Conditions_Of_Sale_Page_in_mobile() throws Throwable {
		rai.VerifyElementVisible(Vype_ConditionsOfSale.pgeConditionsOfSale, "Conditions Of Sale Page");
		
	}

	@And("^Verify Display Content Is Same As Production URL in mobile$")
	public void verify_Display_Content_Is_Same_As_Production_URL() throws Throwable {
		String content=rai.getText(Vype_ConditionsOfSale.weConditionsOfSaleContent);
		//String content = "ConditionsofSaleImperialTobaccoCompanyIntroductionWhatthesetermscover:TheseTermsandConditionsofSale(\"Terms\"),togetherwithallinformationanddocumentsreferredtointhem,governallsalesofproducts(\"Products\")byusthroughthiswebsite(the\"Website\")toyou.Whyyoushouldreadthem:PleasemakesureyouhavereadtheseTermscarefully,especiallythelimitationsofourliability,beforeplacinganorder.Thesetermstellyouwhoweare,howwewillprovideproductstoyou,howyouandwemaychangeorendthecontract,whattodoifthereisaproblemandotherimportantinformation.Ifyouthinkthatthereisamistakeintheseterms,pleasecontactustodiscuss.Acceptanceoftheseterms:ByplacinganorderforaProductthroughourWebsite,youagreetoandaccepttheseTerms.YoushouldprintacopyoftheseTermsorsavethemforfuturereference.Eligibility:ToregisterwithandpurchaseProductsviatheWebsite,youmustbeanadultoflegalagetopurchasevapingproductsinyourCanadianjurisdictionofresidenceandyoumustonlyplaceordersforpersonalordomesticuse.Youmaynotplacelargemultipleordersofvapingproductsthatexceedanamountreasonablyrequiredforpersonaluseortheuseofadultfamilymembers.WemayamendtheseTermsfromtimetotime:EverytimeyouorderaProduct,pleasechecktheseTermstoensureyouunderstandthetermswhichwillapplyatthattime.TheseTermsweremostrecentlyupdatedonMay8,2020.Websitetermsofuse:YouruseofourWebsiteisgovernedbyourWebsiteTermsandConditions.PleasereadtheseastheyincludeimportanttermsthatapplywheneveryouvisitthisWebsite.InformationAboutUsWhoweare:WhenyoupurchaseaProductthroughourWebsiteyouwillbecontractingwithImperialTobaccoCompanyLimited,3711,St-AntoineStreetWest,Montreal(Quebec)H4C3P6(\"we\",\"our\"or\"us\").Howtocontactus:Tocontactus,pleaseseeourContactUspageoremailusatinfo.ca@vuse.comorwritetousviapostatConsumerService(ImperialTobacco),3711,St-AntoineStreetWest,Montreal(Quebec)H4C3P6.Howwemaycontactyou:Ifwehavetocontactyouwewilldosobytelephoneorbywritingtoyouattheemailaddressorpostaladdressyouprovidedtousinyourorder.\"Writing\"includesemails.Whenweusethewords\"writing\"or\"written\"intheseTerms,thisincludesemails.OurProductsProductsmayvaryslightlyfromtheirpictures:TheProductsareasdescribedonthisWebsitefromtimetotime.PleasenotethattheProductsandanypackagingontheWebsiteareforillustrativepurposesonly.SlightvariationsmayoccurbetweenthedeliveredProductandpackaging,andtheimageoftheProductandpackaginggivenontheWebsite.YoushouldensurethatyouhavecheckedtheProductdescriptionontheWebsitebeforeplacingyourorder.HowToOrderWeonlyselltoadultsoflegalagetobuyvapingproductsinCanada:WeonlyacceptordersfromadultsoflegalagetopurchasevapingproductsintheirCanadianjurisdictionofresidence,whoplaceordersforpersonalordomesticuse,andwhocanreceivetheirshipmentataCanadianpostaladdressbyshowingavalidgovernmentissuedIDupondelivery.Wedonotacceptlargemultipleordersofvapingproductsthatexceedanamountreasonablyrequiredforpersonaluseortheuseofadultfamilymembers.Creditcardrequired:Inordertoplaceanorder,youmustbetheholderofavalidcreditcardaccountandprovidethedetails.Orderingprocess:YoumayplaceanorderforaProductviaouronlineorderprocessontheWebsite.TheWebsitecontainsinstructionsonhowtocompletetheorderprocessandcheckandamendanyerrorsbeforesubmittingyourordertous.Attheendoftheorderprocessyouwillbeaskedtoprovidepaymentthroughtheon-linepaymentfacility.Yourorderwillbesubmittedtouswhenyouclickonthe\"SUBMITORDER\"buttonattheendoftheorderprocess.YourorderrepresentsanoffertoustopurchaseaProduct.Howwewillacceptyourorder:Afteryouplaceyourorder,wewillsendyouaconfirmationemailconfirmingouracceptanceofyourorder.Takingpayment:Byplacinganorder,youauthorizeustoimmediatelychargeyourpaymentcardforthepurchasepriceandweareentitledtorelyonyourplacingofanorderasaninstructiontoustotakeyourpayment.Ifwecannotacceptyourorder:Ifweareunabletoacceptyourorder,wewillinformyouofthisandwillnotchargeyoufortheProduct.ThismightbebecausetheProductisoutofstock,becauseofunexpectedlimitsonourresourceswhichwecouldnotreasonablyplanfor,becausewehaveidentifiedanerrorinthepriceordescriptionoftheProduct,becauseweareunabletomeetadeliverydeadline,orbecausetheorderexceedsanamountreasonablyrequiredforpersonaluseortheuseofadultfamilymembers(orisoneofmultiplelargeordersplacedbyyou,thatexceedsanamountreasonablyrequiredforpersonaluseortheuseofadultfamilymembers).Productsaresubjecttoavailability:AllProductsshownontheWebsitearesubjecttoavailability.WewillinformyoubyemailassoonaspossibleiftheProductyouhaveorderedisnotavailableandwillnotprocessyourorder.PricesPrices&DeliveryCosts:Allpricesstatedexcludeapplicabletaxes.Deliverychargeswillbeindicatedtoyouatthetimeoforderingandwillbeaddedtothepurchasepricebeforeyouconfirmyourorder.Wheretofindtheprice:ThepriceofaProductisaspublishedontheWebsiteonthedateyouplaceyourorder.Pricesaresubjecttochangewithoutnoticeatanytime,butchangeswillnotaffectanyorderthatyouhavepreviouslyplaced.Whathappensifwegotthepricewrong:Itispossiblethat,despiteourreasonableefforts,aProductonourWebsitemaybeincorrectlypriced.IfwediscoveranerrorinthepriceofaProductthatyouhaveordered,wewillinformyouofthiserrorandgiveyoutheoptiontocontinuewithyourorderatthecorrectpriceortocancelyourorder.Ifyoudonotrespondtouswithin7days,wewilltreattheorderascancelledandnotifyyouinwriting.HowToPayHowtopay:YoumaypayfortheProductwithacreditcard,oranyotherpaymentmethodthatweindicatetoyouthatwewillacceptfromtimetotime,usingtheonlinepaymentfacility.Thepaymentfacilityisoperatedbyathirdpartyprovider.Youruseofthepaymentfacilitywillbesubjecttothetermsandconditionsofthethirdpartyprovider.Youshouldensurethatyouhavereadandagreewiththosetermsandconditionsbeforeusingthepaymentfacility.Authorityforpayment:Wewillrequestauthorityforpaymentfromyourcardatthetimeyouplaceyourorder.Ifwefailtoreceiveauthorityforyourpayment,orifwereasonablybelievethatpaymentwillberefused,wereservetherighttorejectyourorder.Intheeventofafailedpaymentforwhateverreason,youagreetocompensateusinfullagainstallreasonablecosts,expensesandoutgoingsweincurinattemptingtoobtainpaymentauthorizedbyormadebyyou.ShippingCanadaonly(excludingQuebec,NovaScotia,Yukon,NorthwestTerritories,andNunavut):DeliveryofaProductwillonlybemadetoaCanadianpostaladdress.Deliverycostandmethod:YourorderwillbesentusingoneofourdeliveryserviceprovidersatthecostdisplayedontheWebsitebeforeyouconfirmyourorder.Weacceptnoresponsibilityforordersthatarenotreceivedasaresultofanincompleteorincorrectaddressbeingprovided.WhenwewillprovidetheProducts:WewillindicateourestimateddeliverydateontheWebsite.PleasenotethatthedateindicatedontheWebsiteisonlyanestimateandisnotguaranteed.WewillsendyouanemailconfirmingwhenyourProducthasbeenshipped,whichwillbewithin30daysafterthedateonwhichweacceptyourorder.Wearenotresponsiblefordelaysoutsideofourcontrol:IfoursupplyoftheProductsisdelayedbyaneventoutsideourcontrol,wewillcontactyouassoonaspossibletoletyouknowandwewilltakestepstominimizetheeffectofthedelay.However,ifyouhavenotreceivedyourProductwithin5businessdaysofthedateweconfirmthatyourproducthasshipped,pleasenotifyus.WhenyoubecomeresponsiblefortheProducts:TheProductswillbeyourresponsibilityoncetheyhavebeendeliveredtotheaddressindicatedinyourorder.WhenyouowntheProducts:YouwillowntheProductsoncewehavereceivedpaymentfromyouinfull.IfyouarenotathomewhentheProductisdelivered:AnadultwillberequiredtosignandacceptresponsibilityfortheProductatthetimeofdelivery.TheProductswillnotbeleftinamailboxoratthedoorstep.Pleasehavegovernment-issuedphotoidentificationavailableatthetimeofdeliverytohelpconfirmyourage.Ifanadultisnotavailableatyouraddresstotakedelivery,anotewillbeleftinformingyouofhowtoarrangefordeliveryorwheretopick-uptheProducts.Ifyoudonotarrangefordelivery:IfyoudonotarrangedeliveryorcollecttheProductsfromapick-uplocationspecifiedinanoteleftatyourdeliveryaddress,wewillcontactyouforfurtherinstructions.Ifweareunabletoarrangeforanewdeliverytime,wemaycancelthecontractandtheProductswillbereturnedtoourwarehouse.ReasonswemaysuspendthesupplyofProductstoyou.WemayhavetosuspendthesupplyofaProductto:dealwithtechnicalproblemsormakeminortechnicalchanges;updatetheProducttoreflectchangesinrelevantlawsandregulatoryrequirements;makechangestotheProductasrequestedbyyouornotifiedbyustoyou.Incorrect,DamagedorDefectiveItems.Pleaseinspectyourdeliverywithin5daysofreceipttomakesurethatyoureceivedwhatyouorderedingoodcondition.Damageditems.Ifyourdeliveryarrivesdamaged,pleasecontactusimmediatelytoarrangeareturn.Wereservetherighttoinspecttheproductanddeterminewhetherornotweconsidertheitemtobedamaged.Ifweconfirmthatitisdamaged,youwillreceiveafullrefundorreplacement.Incorrectitems.Ifyourdeliverydoesnotcontainalloftheitemsyouordered,orifitcontainsdifferentitemsfromtheonesyourordered,pleaseletusknowimmediatelysothatwecanresolvethesituation.Defectiveitems.Ifyouritemisdefectiveinanyway,pleasecontactusimmediatelytoarrangeareplacement.Thefollowingoutlinesourreturnpolicyontheproductcategoriesidentifiedbelow:Batteries:within6monthsofthedateofreceipt.Chargers:within12monthsofreceipt.ReturnsUnopenedreturns:Weacceptreturnsofunopenedproductswithin14daysofreceipt.Return/ReplacementProcess:Ifyouwouldliketoreturnyourorderorobtainareplacementproductforanyreasonoutlinedbelow,pleasefollowthestepsbelow:Contactusbyphoneat1-833-308-8873oremailusatinfo.ca@vuse.comPleasebepreparedtoprovidedetailssuchas:Thenatureofyourrequest(e.g.didyourdeliverycontainincorrect,damaged,ordefectiveproducts?).Yourordernumberoranemailaddressorphonenumberassociatedwithyouraccountsothatwecanlocateyourpurchase.Theproductbatch/serialnumber(ifavailable).Ifadeliverycontainsanincorrect,damagedordefectiveproduct,youwillbeaskedtoreturnthefaultydeviceforreview.Afterreview,ifthedeviceisdeterminedtobefaulty,wewillissueafullrefundorreplacementproduct.Youmayalsobeofferedtheoptionofhavingareplacementproductsenttoyouimmediately,conditionalonyouragreementtoreturnyourincorrect,damagedordefectiveproductuponreceiptofthereplacementproduct.Failuretoreturnareplacementproductwithin21daysofreceiptofthereplacementproductmayresultinachargetoyourpaymentmethodfortheamountofthereplacementdevice.SubscriptionProgramOurSubscriptionTerms&Conditionssetoutadditionalinformation,andtermswhichapplytooursubscriptionprogram.ThisdocumentisavailablethroughourWebsite,andherebyincorporatedintotheseTermsbyreference.ComplaintsHowtotellusaboutproblems:PleasecontactusviaemailortheaddressprovidedintheseTermsifyouhaveanycomplaintsabouttheProducts.Weaimtoresolveanycomplaintsasquicklyaspossiblewithin14days.YourAccountHowtocreateanaccount:YoumayplaceanordertopurchasetheProductbycreatinganaccountontheWebsite.Inordertoapplytocreateanaccount,pleasefollowtheinstructionsontheWebsite.Itwillbeatoursolediscretionastowhetherweacceptyourapplicationtocreateanaccount.Oneaccountperuser:Onlyoneaccountmaybecreatedperindividualuser.Informationwerequire:Youwillbeaskedtoprovideinformationincludingyourname,dateofbirth,emailaddressandbillingaddresswhencreatingyouraccount.Werequireyourdateofbirthandyourbillingaddresstoverifythatyouareanadultoflegalagetopurchasevapingproducts,assetoutinourPrivacyPolicy.YouremailaddresswillbeusedtoidentifyyouwhenyouuseittoaccessyouraccountontheWebsite.Youagreetoupdateandmaintainaccurateinformationinconnectionwithyouraccount.Wereservetherighttoterminateyouraccountintheeventthatyouprovideaninvalidemailaddressorotherinaccurateinformation.Choosingapassword:Youwillalsoneedtoprovideapasswordinordertoaccessyouraccount.Youareentirelyresponsibleformaintainingtheconfidentialityofyourpasswordandyouwillberesponsibleforanydamageorlossescausedbyunauthorizedaccessresultingfromyourfailuretokeepyourpasswordsecure.Weencourageyoutousea\"strong\"password(includingacombinationofnumbersandletters)thatisuniquetoourservice.Youagreetonotifyusimmediatelyintheeventofanyunauthorizeduse,orsuspectedunauthorizeduseofyourpasswordoraccount.ClosingYourAccountWemaycloseyouraccount:Wemaytemporarilysuspendorcloseyouraccountatanytimeandforanyreasonwithoutnotice.Howcanyoucloseyouraccount:Youmaycloseyouraccountatanytimeandforanyreasonbycontactingusbytelephoneat1-833-308-8873.Wemayneedtotakestepstoverifyyouridentitybeforewecanmakechangesinconnectionwithyouraccount.HowWeMayUseYourPersonalInformationUseo\r\n";
		rai.fnContentValidation(content, Vype_ConditionsOfSale.weConditionsOfSaleContent);
	}
	
		
	@Then("^Verify the Support Email ID in the content in mobile$")
	public void verify_the_Support_Email_ID_in_the_content() throws Throwable {
		rai.VerifyElementVisible(Vype_ConditionsOfSale.lnkinfoSupportEmailID, "info.ca@vuse.com ");

	}

	@Then("^Verify SubLinks Content - Cookie policy in mobile$")
	public void verify_SubLinks_Content_Cookie_policy() throws Throwable {
		rai.VerifyElementVisible(Vype_ConditionsOfSale.lnkCookiePolicy, "Cookie policy Link");
	   // rai.clickBrowseBack();
	    //rai.ScrolltoTopofthepage();
	}
	
	
	@When("^Swipe down and click on cookie policy in the page footer in mobile$")
	public void scroll_down_and_click_on_cookie_policy_in_the_page_footer() throws Throwable {
		rai.ScrollByxpath(Vype_CommonXpath.lnkCookiePolicy);
		rai.clickLink(Vype_CommonXpath.lnkCookiePolicy,"Footer section Cookie Policy");
		Thread.sleep(2000);
		
	}

	@And("^Verify whether user is navigated to cookie policy page in mobile$")
	public void verify_whether_user_is_navigated_to_cookie_policy_page() throws Throwable {
		
		rai.VerifyElementsVisible(Vype_CommonXpath.txtCookiePolicy, "Cookie Policy");
		
	}

	@Then("^Verify Cookie Policy content should be same as Production environment in mobile$")
	public void verify_Cookie_Policy_content_should_be_same_as_Production_environment() throws Throwable {
		String txtCookiePolicyContent=rai.getText(Vype_CommonXpath.txtcookiePolicyContent);
		rai.fnContentValidation(txtCookiePolicyContent, Vype_CommonXpath.txtcookiePolicyContent);
		
	}

	@Then("^Verify the terms and conditions ,privacy policy and contact us links in the page content are displayed in mobile$")
	public void verify_the_terms_and_conditions_privacy_policy_and_contact_us_links_in_the_page_content_are_displayed() throws Throwable {
		
		rai.VerifyElementVisible(Vype_Footer.pgTermsAndCondition," Terms & Conditions");
		
		rai.VerifyElementVisible(Vype_CommonXpath.txtPrivacyPolicy, "Privacy Policy ");
		
		rai.VerifyElementVisible(Vype_CommonXpath.lnkContactUs,"Contact Us");
		
	}
	
	@And("^Verify the  website, delete and Control cookies and partners or site urls are displayed in mobile$")
	public void verify_the_website_delete_and_Control_cookies_and_partners_or_site_urls_are_displayed() throws Throwable {
		
		rai.VerifyElementVisible(Vype_CommonXpath.websiteurl,"https://www.vuse.com/ca/en/");
		
		rai.VerifyElementVisible(Vype_CookiePolicy.lnkAllaboutCookies, "https://www.vuse.com/ca/en/");
		
		rai.VerifyElementVisible(Vype_CookiePolicy.lnkPartners,"www.gooraie.com/policies/privacy/partners/");
		
	}
	
	@When("^Click on Terms and Conditions link in the content in mobile$")
	public void click_on_Terms_and_Conditions_link_in_the_content() throws Throwable {
		
		rai.clickbutton(Vype_CommonXpath.lnkTermsandConditions,"Terms and Conditions");
		Thread.sleep(30000);
		
		
	}
	

	@Then("^Verify the user navigates to  terms and condition page and browse back$")
	public void verify_the_user_navigates_to_terms_and_condition_page_in_the_new_tab() throws Throwable {
	
	
		rai.VerifyElementVisible(Vype_Footer.pgTermsAndCondition," Terms & Conditions");
	
		rai.ClosetabAndroid();
		rai.switchDefault();
	
		
		
		
	}
	/*@When("^Close the current tab in mobile$")
	public void close_the_current_tab() throws Throwable {
		rai.fnCloseCurrentTab();
		rai.fnSwitchToDefaultTab();
	}*/

	@When("^Click on Privacy Policy link  in the content in mobile$")
	public void click_on_Privacy_Policy_link_in_the_content() throws Throwable {
		rai.clickLink(Vype_CommonXpath.lnkPrivacyPolicy,"Privacy Policy");
		Thread.sleep(2000);
		
		
	}
	
	@Then("^Verify the user navigates to  Privacy policy page in the new tab in mobile$")
	public void verify_the_user_navigates_to_Privacy_policy_page_in_the_new_tab() throws Throwable {
		rai.VerifyElementVisible(Vype_CommonXpath.txtPrivacyPolicy, "Privacy Policy ");
	
		
	}

	@When("^Click on http://www.allaboutcookies.org/ link in mobile$")
	public void click_on_http_www_allaboutcookies_org_link() throws Throwable {
		rai.clickLink(Vype_CookiePolicy.lnkAllaboutCookies,"http://www.allaboutcookies.org/");
	}

	@And("^Navigate back to the Cookie Policy page in mobile$")
	public void navigate_back_to_the_Cookie_Policy_page() throws Throwable {
		rai.clickBrowseBack();
		Thread.sleep(3000);
		rai.VerifyElementsVisible(Vype_CommonXpath.txtCookiePolicy, "Cookie Policy");
	}

	@When("^Click on policies/privacy/partners link in mobile$")
	public void click_on_policies_privacy_partners_link() throws Throwable {
		rai.clickLink(Vype_CookiePolicy.lnkPartners,"www.gooraie.com/policies/privacy/partners/");
		
	}

	@Then("^Verify the user navigates to Google Privacy terms page in the same tab in mobile$")
	public void verify_the_user_navigates_to_Gooraie_Privacy_terms_page_in_the_same_tab() throws Throwable {
		Thread.sleep(20000);
		rai.VerifyElementsVisible(Vype_CookiePolicy.txtPrivacyTerms, "Privacy & Terms");
	
	}

	@Then("^navigate back to homepage in mobile$")
	public void navigate_back_to_homepage() throws Throwable {
		rai.clickBrowseBack();
		Thread.sleep(3000);
		// Verify that Post Login home page is displayed
		rai.VerifyElementsVisible(Vype_CommonXpath.btnAccount, "Post Login Vype Home");
	}

	@When("^Click on Contact Us link in mobile$")
	public void click_on_Contact_Us_link() throws Throwable {
		rai.clickLink(Vype_CommonXpath.lnkContactUs,"Contact Us");
		
	}

	@When("^Swipe down and click on Terms & Conditions in the page footer in mobile$")
	public void scroll_down_and_click_on_Terms_Conditions_in_the_page_footer() throws Throwable {
		rai.ScrollByxpath(Vype_Footer.lnkTermsAndCondition);
		rai.clickUsingJs(Vype_Footer.lnkTermsAndCondition," Terms & Conditions");
		Thread.sleep(3000);
	}

	@When("^Click on Terms And Conditions in mobile$")
	public void click_on_TermsAndConditions() throws Throwable {
		rai.clickUsingJs(Vype_Footer.lnkTermsAndCondition," Terms & Conditions");
	    Thread.sleep(3000);
	}

	@Then("^Verify that Terms & Conditions page displayed in mobile$")
	public void verify_that_Terms_Conditions_page_displayed() throws Throwable {
		rai.VerifyElementVisible(Vype_Footer.pgTermsAndConditions," Terms & Conditions");
		Thread.sleep(3000);
	}
	
	@Then("^Verify TermsAndConditions content should be same as Production environment in mobile$")
	public void verify_TermsAndConditions_content_should_be_same_as_Production_environment() throws Throwable {
		
		String content=rai.getText(Vype_Footer.weTermsandConditions);
		rai.fnContentValidation(content, Vype_Footer.weTermsandConditions);
	}
	
	@Then("^Verify the Sub-Links Conditions Of Sale, Privacy policy,Cookiepolicy and Contact us are displayed in the content in mobile$")
	public void verify_the_Sub_Links_Conditions_Of_Sale_Privacy_policy_Cookiepolicy_and_Contact_us_are_displayed_in_the_content() throws Throwable {
	   
		rai.VerifyElementsVisible(Vype_ConditionsOfSale.lnkConditionsOfSale,"ConditionsOfSale");
		
		rai.VerifyElementVisible(Vype_CommonXpath.lnkContactUs,"Contact Us");
		
		rai.VerifyElementVisible(Vype_CommonXpath.txtPrivacyPolicy, "Privacy Policy ");
		
	}
	
	@Then("^Browser back to home page$")
	public void Browser_back_to_home_page() throws Throwable {
	    rai.clickBrowseBack();
	 // Verify that Post Login home page is displayed
	 rai.VerifyElementsVisible(Vype_CommonXpath.btnAccount, "Post Login Vype Home");
		
	}
	
	@Then("^Verify that Conditions of Sale content present in the Terms & Condition page in mobile$")
	public void verify_that_Conditions_of_Sale_content_present_in_the_Terms_Condition_page() throws Throwable {
		rai.VerifyElementsVisible(By.xpath("//*[@href='https://www.vuse.com/ca/en/pages/conditions-of-sale']"), "Conditions of Sale");
		Thread.sleep(3000);
		
	}

	@Then("^Verify the Support email Id support@govype.ca content present in the Terms & Condition page in mobile$")
	public void verify_the_Support_email_Id_support_govype_ca_content_present_in_the_Terms_Condition_page() throws Throwable {
		rai.VerifyElementsVisible(By.xpath(".//*[@href='mailto:support@govype.ca']"), "Support Email ID(support@govype.ca)");	
		
		
		Thread.sleep(3000);
	}
	
	
	@When("^Swipe Down and Click on  Privacy Policy in the page footer in mobile$")
	public void scroll_Down_and_Click_on_Privacy_Policy_in_the_page_footer() throws Throwable {
		rai.ScrollByxpath(Vype_ConditionsOfSale.lnkConditionsOfSale);
		rai.clickLink(Vype_CommonXpath.lnkPrivacyPolicy, "Privacy Policy link ");
		Thread.sleep(2000);
	}

	@Then("^Verify privacy policy page is displayed in mobile$")
	public void verify_privacy_policy_page_is_displayed() throws Throwable {
		rai.VerifyElementsVisible(Vype_CommonXpath.txtPrivacyPolicy, "Privacy Policy ");
		Thread.sleep(2000);
	}

	@Then("^Verify Privacy Policy page content should be same as Production environment in mobile$")
	public void verify_Privacy_Policy_page_content_should_be_same_as_Production_environment() throws Throwable {
		
		String content=rai.getText(Vype_PrivacyPolicy.wePrivacyPolicyContent);
		rai.fnContentValidation(content , Vype_PrivacyPolicy.wePrivacyPolicyContent);
		Thread.sleep(5000);
		
	}

	@Then("^Verify the Support Email ID: support@govype\\.ca and website url is displayed in mobile$")
	public void verify_the_Support_Email_ID_support_govype_ca_and_website_url_is_displayed() throws Throwable {
		System.out.println(">>>>>>>>>>>Support email Id: >>>>>>>>>>>>>>>>");
		String supportID = "info.ca@vuse.com";
		rai.fnContentValidation(supportID , Vype_PrivacyPolicy.lnkPPSupportEmailID);
		Thread.sleep(2000);
		rai.VerifyElementVisible(Vype_CommonXpath.websiteurl,"https://www.vuse.com/ca/en/");
		
	}
	
	@Then("^Verify the Sub-Links Conditions Of Sale, Terms and Condition ,Cookiepolicy,Account details page and Contact us in the content in mobile$")
	public void verify_the_Sub_Links_Conditions_Of_Sale_Terms_and_Condition_Cookiepolicy_Account_details_page_and_Contact_us_in_the_content() throws Throwable {
		
		rai.VerifyElementsVisible(Vype_ConditionsOfSale.lnkConditionsOfSale,"ConditionsOfSale");
		
		rai.VerifyElementsVisible(Vype_Footer.lnkTermsAndCondition," Terms & Conditions");
		
		rai.VerifyElementsVisible(Vype_CommonXpath.lnkCookiePolicy,"Cookie Policy");
		
		rai.VerifyElementVisible(Vype_CommonXpath.lnkContactUs,"Contact Us");
		
		rai.VerifyElementVisible(Vype_CommonXpath.lnkAccdetailspage,"//a[@href='https://www.vuse.com/ca/en/account']");
			
	}

	@When("^Click on Terms & Condition sublink in mobile$")
	public void click_on_Terms_Condition_sublink() throws Throwable {
		rai.ScrolltoTopofthepage();
		Thread.sleep(2000);
		//rai.clickUsingJs(Vype_PrivacyPolicy.lnkTermsConditions, "Terms and Conditions link");
		Thread.sleep(3000);
		//rai.closeBrowser();
		//rai.fnSwitchToDefaultTab();
	}

	@Then("^Verify Terms and Conditions page is opened in same tab in mobile$")
	public void verify_Terms_and_Conditions_page_is_opened_in_same_tab() throws Throwable {
		/*String currentWindowHandle = rdriver.getWindowHandle();
		//Thread.sleep(3000);
		rai.fnVerifyPageLoadedInSameTab(currentWindowHandle, Vype_CommonXpath.txtTermsConditions, "Terms and COnditions");
		Thread.sleep(3000);*/
		
		rai.VerifyElementsVisible(Vype_PrivacyPolicy.pgTermsConditions, "TermsConditions");
		
	}

	@When("^Click on Conditions of Sales sublink in the content in mobile$")
	public void click_on_Conditions_of_Sales_sublink_in_the_content() throws Throwable {
		
		rai.clickUsingJs(Vype_PrivacyPolicy.lnkConditionofSale, "Conditions of Sales link");
		
	}

	@When("^Navigate back to privacy policy page in mobile$")
	public void navigate_back_to_privacy_policy_page() throws Throwable {
	    rai.clickBrowseBack();
	    Thread.sleep(2000);
	    rai.VerifyElementsVisible(Vype_CommonXpath.txtPrivacyPolicy, "Privacy Policy ");
		Thread.sleep(2000);
	    
	}
	/*@Then("^Verify Conditions of Sales page is opened in same tab in mobile$")
	public void verify_Conditions_of_Sales_page_is_opened_in_same_tab() throws Throwable {
		String currentWindowHandle2 = rdriver.getWindowHandle();
		//Thread.sleep(3000);
		rai.VerifyElementsVisible(currentWindowHandle2, Vype_CommonXpath.txtConditionsofSale, "Conditions of Sales");

		Thread.sleep(3000);
	}*/

}