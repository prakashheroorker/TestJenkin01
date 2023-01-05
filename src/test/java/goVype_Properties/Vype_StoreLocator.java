package goVype_Properties;

import org.openqa.selenium.By;

public class Vype_StoreLocator {
	//Store Locator link from Home page
	public static By lnkStoreLocator = By.xpath(".//*[text()='Store Locator']");
			// ".//*[@href='/vape-stores']");

	// StoreLocator Page 
	public static By pgeStoreLocator=By.xpath(".//*[text()='Find a store near you']");
	//Added by Bhavitha
	public static By pgeStoreLocator2=By.xpath(".//*[text()='Find a Vuse Store near you']");
	//Location field
	public static By txtLocationField=By.xpath(".//input[@id='address-input' and @type='search']");

	//StoreName field
	public static By txtStoreNameField = By.xpath(".//*[@placeholder='Search store by name (e.g. Esso)']");
			//+ ".//input[@class='sc-jAaTju RKKqo' and @type='search']");
			// "//*[@id='address-input']");
			// ".//input[@class='sc-jAaTju RKKqo' and @type='search']");
			// "(//input[@type='search'])[2]");
			// ".//input[@class='sc-jAaTju fhtRBf' and @type='search']");

	//Search button
	public static By btnSearch = By.xpath(".//*[@class='sc-bdVaJa jZYyKx']");

	//Live objects: directions and mobile call
	public static By LiveObjects = By.xpath("(.//*[@class='sc-jTzLTM eIkaYY'])[1]");
			// "(.//*[@class='sc-EHOje kSSOfe'])[1]");

	//Location or Name Selection drop down
	public static By dropdwnLocation = By.xpath(".//select[@class='sc-jqCOkK kWCbJp']");
			// ".//select[@class='sc-csuQGl kEUXtm']");

	//Store Result
	public static By txtStoreResult = By.xpath("(.//*[text()='R&S EAST YORK CONVENIENCE'])[1]");
			//+ ".//*[text()='NEEDS BISHOP IRVING']");
			//+ "(//*[@class='sc-htoDjs norJX'])[1]");
			// "(.//div[@class='sc-ifAKCX jIKvYB'])[1]");
			//".//div[@class='sc-ifAKCX jIKvYB']");
	
	public static By txtStoreResult1 = By.xpath("(.//*[text()='PETRO CANADA - ELIE HAO'])[1]");
    public static By txtlocationStoreResult = By.xpath("(.//*[text()='R&S EAST YORK CONVENIENCE'])[1]");
	
	public static By txtbishop=By.xpath(".//*[text()='NEEDS BISHOP IRVING']");



	//Clear search result
	public static By btnClear = By.xpath(".//button[@class='sc-fYxtnH jHFmfe' and text()='(clear)']");
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
	public static By txtCanadianOutlet=By.xpath("(.//*[text()='ELM BASKET'])[1]");

	public static By txtScallyWags=By.xpath("(.//*[text()='SOBEYS'])[1]");
			//+ "(.//*[text()='SCALLYWAGS'])[1]");
	
	public static By txtStoresFound=By.xpath("//*[text()='Stores']");

	public static By txtTwoRoseHill=By.xpath("(.//*[text()='SUMMERHILL CONVENIENCE'])[1]");
			//+ "(.//*[text()='TWO ROSEHILL'])[1]");
	
	//Added by Sandeepa on 08/06/2020
		//StoreLocator Page
		public static By txtFindAStore=By.xpath("(.//*[text()='Find a store near you'])");
		
		//Dropdown list
		public static By dropdownList=By.xpath("(.//*[@class='sc-jlyJG gBkPre'])");
				// "(.//*[@class='sc-csuQGl kEUXtm'])");
		
		//Location drop down
		public static By dropDownLocation=By.xpath(".//select[@class='sc-gipzik klzOCO']");
				// "(.//select[@class='sc-csuQGl kEUXtm'])");
		
		
	    public static By txtPlacesInDropDown=By.xpath("//*[@class='ap-dropdown-menu ap-with-places']");
	    	//	+ "(.//*[@class='ap-dropdown-menu ap-with-places'])");

		//phone Icon
		public static By lnkphoneIcon=By.xpath("(.//*[@class='sc-gzVnrw jmkEdZ'])[1]");
				// "(.//*[@class='sc-bdVaJa fVfQJG'])[1]");
		
		//direction Icon
		public static By lnkDirectionIcon=By.xpath("(.//*[@class='sc-bdVaJa eksYmL'])[3]");
				// "(.//*[@class='sc-bZQynM driVCB'])[2]");
		
		//new tab direction 
		public static By lnkDirectionMapTab=By.xpath("(//*[@data-value='Directions'])[1]");
				// "(.//*[@class='iRxY3GoUYUY__icon'])[1]");
		
		//Address in map page.
		public static By addressInMapTab=By.xpath("(.//*[@class='widget-pane-link'])[3]");	
		
		/* Added by Bhavitha for BDD development */
		public static By txtlocationStoreResult1 = By.xpath(".//*[text()='DEPANNEUR BISHOP'][1]");
		
		/* Added by Harika for BDD development */
		
		public static By txtHastyMarket=By.xpath("(.//*[text()='HASTY MARKET'])[1]");

		public static By txtSkywayCigar=By.xpath("(.//*[text()='SKYWAY CIGAR'])[1]");
		
		public static By txtsmokevape=By.xpath("(.//*[text()='180 SMOKE VAPE STORE'])[1]");
		
		public static By txtConvenience=By.xpath("(.//*[text()='MAC'S CONVENIENCE'])[1]");
		

}
