package goVype_Properties_mobile;

import org.openqa.selenium.By;

public class Vype_StoreLocator {
	//Store Locator link from Home page
	public static By lnkStoreLocator = By.xpath(".//*[@href='/ca/en/vape-stores']");
			// ".//*[@href='/vape-stores']");

	// StoreLocator Page 
	public static By pgeStoreLocator=By.xpath(".//*[text()='Find a store near you']");
	
	//Google API 
	public static By pgeStoreLocator2=By.xpath(".//*[text()='Find a Vuse Store near you']");
	
	//Location field
	public static By txtLocationField=By.xpath(".//input[@id='address-input' and @type='search']");

	public static By inputname=By.xpath("//*[@name='searchType']/div/select");
	//StoreName field
	public static By txtStoreNameField = By.xpath("(.//*[@type='search'])[2]");
			// "//*[@id='address-input']");
			// ".//input[@class='sc-jAaTju RKKqo' and @type='search']");
			// "(//input[@type='search'])[2]");
			// ".//input[@class='sc-jAaTju fhtRBf' and @type='search']");

	//Search button
	public static By btnSearch = By.xpath(".//*[@class='sc-bdVaJa jZYyKx']");

	//Live objects: directions and mobile call
	public static By LiveObjects = By.xpath("(.//*[contains(@class,'sc-gipzik BAccj')])[1]");
			// "(.//*[@class='sc-EHOje kSSOfe'])[1]");

	//Location or Name Selection drop down
	public static By dropdwnLocation = By.xpath("//*[@name='searchType']/div/select");
			// ".//select[@class='sc-csuQGl kEUXtm']");

	//Store Result
	public static By txtStoreResult = By.xpath("(//*[@class='sc-htoDjs norJX'])[1]");
			// "(.//div[@class='sc-ifAKCX jIKvYB'])[1]");
			//".//div[@class='sc-ifAKCX jIKvYB']");



	//Clear search result
	public static By btnClear = By.xpath(".//button[@class='sc-jhAzac hTuTak' and text()='(clear)']");
			// ".//button[@class='sc-jhAzac hTuTak' and text()='(clear)']");
			// ".//button[@class='sc-fBuWsC dKbSED' and text()='(clear)']");


	//Areas Suggested when we enter 'Ontario Canada' in the store locator search field.
	//text East York
	public static By txtEastYork=By.xpath("(.//*[text()='East York'])[1]");

	//text York
	public static By txtYork=By.xpath("(.//*[text()='York'])[1]");

	//text North York
	public static By txtNorthYork=By.xpath("(.//*[text()='North York'])[1]");

	//text Etobicoke
	public static By txtEtobicoke=By.xpath("(.//*[text()='Etobicoke'])[1]");

	//text Scarborough
	public static By txtScarborough=By.xpath("(.//*[text()='Scarborough'])[1]");

	//Addresses Text Displayed in M2N Postal Code	
	//text Bishop Avenue
	public static By txtBishopAvenue=By.xpath("(.//*[text()='Bishop Avenue'])[1]");

	//text Finch Avenue West
	public static By txtFinchAvenueWest=By.xpath("(.//*[text()='Finch Avenue West'])[1]");

	//text Yonge Street
	public static By txtYongeStreet=By.xpath("(.//*[text()='Yonge Street'])[1]");

	//text Bus Terminal
	public static By txtFinchBusTerminal=By.xpath("(.//*[text()='Finch Bus Terminal'])[1]");

	//Stores or Buildings Text Displayed when we enter '4901 Yonge Street, Old Toronto, Ontario, Canada' in the store locator search field.
	public static By txtCanadianOutlet=By.xpath("(.//*[text()='CANADIAN OUTLET'])[1]");

	public static By txtScallyWags=By.xpath("(.//*[text()='SCALLYWAGS'])[1]");

	public static By txtTwoRoseHill=By.xpath("(.//*[text()='TWO ROSEHILL'])[1]");
	
	//Added by Sandeepa on 08/06/2020
		//StoreLocator Page
		public static By txtFindAStore=By.xpath("(.//*[contains(text(),'Find a Vuse')])");
		
		//Dropdown list
		public static By dropdownList=By.xpath("(.//*[@class='sc-jlyJG gBkPre'])");
				// "(.//*[@class='sc-csuQGl kEUXtm'])");
		
		//Location drop down
		public static By dropDownLocation=By.xpath(".//select[@class='sc-gipzik klzOCO']");
				// "(.//select[@class='sc-csuQGl kEUXtm'])");
		
		
	    public static By txtPlacesInDropDown=By.xpath("//*[@class='ap-dropdown-menu ap-with-places']");
	    	//	+ "(.//*[@class='ap-dropdown-menu ap-with-places'])");

		//phone Icon
		public static By lnkphoneIcon=By.xpath("(.//*[contains(text(),'ELM BASKET')])/../../div[2]/div[1]/a");
				// "(.//*[@class='sc-bdVaJa fVfQJG'])[1]");
		
		//direction Icon
		public static By lnkDirectionIcon=By.xpath("(.//*[contains(text(),'ELM BASKET')])/../../div[2]/div[2]/a");
				// "(.//*[@class='sc-bZQynM driVCB'])[2]");
		
		//new tab direction 
		public static By lnkDirectionMapTab=By.xpath("(//*[@data-value='Directions'])[1]");
				// "(.//*[@class='iRxY3GoUYUY__icon'])[1]");
		
		//Address in map page.
		public static By addressInMapTab=By.xpath("(.//*[@class='widget-pane-link'])[3]");	
		
		//switch to list view button
	   public static By switchtolistview=By.xpath("(.//*[text()='Switch to '])");
				
		//close the popup
		public static By closeyourlocation=By.xpath("//*[@resource-id=\'com.android.chrome:id/infobar_close_button\']");
				
		//wanted
		public static By wanted=By.xpath("(.//*[text()='328 Yonge St, Toronto, ON M5B 1R8, Canada'])");
		
		/* Added by Harris for BDD development */
		
		public static By txtHastyMarket=By.xpath("(.//*[text()='HASTY MARKET'])[1]");

		public static By txtSkywayCigar=By.xpath("(.//*[text()='SKYWAY CIGAR'])[1]");
		


}
