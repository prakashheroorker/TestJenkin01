package goVype_Properties;

import org.openqa.selenium.By;

public class Vype_ProductCatalogue {

	//Limited edition tile
	public static By LimitedEditiontile=By.xpath("//*[contains(@class,'QuickFilterCar') and text()='Limited Edition']");

	//verifying limited edition flavors
	public static By txtLimitedEditionflavors=By.xpath("//*[contains(@class,'ProductTag__Container-sc') and text()='Limited Edition']/../../h1");

	public static By txtlimitedflavor(int i)
	{
		return By.xpath("(//*[contains(@class,'ProductTag__Container-sc') and text()='Limited Edition']/../../h1)["+(i+1)+"]");

	}
	//Verify page
	public static By pgLimitedEdition=By.xpath("//*[@id='limited-edition-pods']/h3");

	//Limited Edition swipe
	public static By btnLimitedEditionswipe=By.xpath("//*[@id='limited-edition-pods']/div/div[2]");

	//-----------------------------------------Mint
	//Mint
	public static By MintTile=By.xpath("//*[contains(@class,'QuickFilterCar') and text()='Mint']");

	//verify Mint page
	public static By pgMint=By.xpath("//*[@id='mint']/h3");

	//Verify all flavors under mint
	public static By txtMintFlavors=By.xpath("(//*[@id='mint'])/div/div[3]/div/div/h1");

	//Mint each flavor
	public static By txtMintFlavor(int i){
		return By.xpath("((//*[@id='mint'])/div/div[3]/div/div/h1)["+(i+1)+"]");
	}

	//Limited Edition swipe
	public static By btnMintswipe=By.xpath("//*[@id='mint']/div/div[2]");

	//----------------------------------------Tobacco
	//Tobacco
	public static By Tobaccotile=By.xpath("//*[@alt='Tobacco']");

	//Tobacco page
	public static By pgTobacco=By.xpath("//*[@id='tobacco']/h3");

	//Verify all flavors under tobacco
	public static By txtTobaccoFlavors=By.xpath("(//*[@id='tobacco'])/div/div[3]/div/div/h1");

	//Tobacco each flavor
	public static By txttobaccoFlavor(int i){
		return By.xpath("((//*[@id='tobacco'])/div/div[3]/div/div/h1)["+(i+1)+"]");
	}

	//Tobacco swipe
	public static By btntobaccoswipe=By.xpath("//*[@id='tobacco']/div/div[2]");

	//-----------------------fruit-------
	//Fruit
	public static By fruittile=By.xpath("//*[@alt='Fruit']");

	//fruit page
	public static By pgFruit=By.xpath("//*[@id='fruit']/h3");

	//Verify all flavors under fruit
	public static By txtFruitFlavors=By.xpath("(//*[@id='fruit'])/div/div[3]/div/div/h1");

	//fruit each flavor
	public static By txtfruitFlavor(int i){
		return By.xpath("((//*[@id='fruit'])/div/div[3]/div/div/h1)["+(i+1)+"]");
	}

	//fruit swipe
	public static By btnfruitswipe=By.xpath("//*[@id='fruit']/div/div[2]");

	//----------------------------------------Berry
	//Berry
	public static By Berrytile=By.xpath("//*[@alt='Berry']");

	//Berry page
	public static By pgBerry=By.xpath("//*[@id='berry']/h3");

	//Verify all flavors under Berry
	public static By txtBerryFlavors=By.xpath("(//*[@id='berry'])/div/div[3]/div/div/h1");

	//Berry flavor
	public static By txtberryFlavor(int i){
		return By.xpath("((//*[@id='berry'])/div/div[3]/div/div/h1)["+(i+1)+"]");
	}

	//Berry swipe
	public static By btnberryswipe=By.xpath("//*[@id='berry']/div/div[2]");

	//--------------------------------------------Clear and vanilla
	//Clear and vanilla
	public static By Clearvanillatile=By.xpath("//*[@alt='Clear & Vanilla']");

	//Clear and vanilla page
	public static By pgClearVanilla=By.xpath("//*[@id='clear-and-vanilla']/h3");

	//Verify all flavors under Clear vanilla
	public static By txtClearVanillaFlavors=By.xpath("(//*[@id='clear-and-vanilla'])/div/div[3]/div/div/h1");

	//Clear and vanilla each flavor
	public static By txtClearVanillaFlavor(int i){
		return By.xpath("((//*[@id='clear-and-vanilla'])/div/div[3]/div/div/h1)["+(i+1)+"]");
	}

	//Clear and vanilla swipe
	public static By btnClearVanillaswipe=By.xpath("//*[@id='clear-and-vanilla']/div/div[2]");

	//-------------------------------Nicotine free flavors

	//Nicotine free
	public static By Nicotinefreetile=By.xpath("//*[@alt='Nicotine Free']");

	//Nicotine free page
	public static By pgNicotinefree=By.xpath("//*[@id='nicotine-free']/h3");

	//Verify all flavors under Nicotine free flavor
	public static By txtNicotinefreeFlavors=By.xpath("(//*[@id='nicotine-free'])/div/div[3]/div/div/h1");

	//Nicotine free each flavor
	public static By txtNicotinefreeFlavor(int i){
		return By.xpath("((//*[@id='nicotine-free'])/div/div[3]/div/div/h1)["+(i+1)+"]");
	}

	//Nicotine free swipe
	public static By btnNicotineswipe=By.xpath("//*[@id='nicotine-free']/div/div[2]");
	
	//-------------------------@Catalogue02--------------------------------------------------------
	public static By allCatagories=By.xpath("//*[contains(@class,'QuickFilterCard__Name-sc')]");
	
	//MyVuse IQ
	public static By MyVuseIQ=By.xpath("//*[contains(@class,'VuseIQToggle__FilterButton')]");
	
	//sort filter
	public static By Sortfilter=By.xpath("(//*[contains(@class,'FilterToggle__FilterButton')])[1]");
	
	//A -Z filter
	public static By AtoZ=By.xpath("//*[text()='Name: A-Z']");
	
	//z -A
	public static By ZtoA=By.xpath("//*[text()='Name: Z-A']");
	
	//done
	public static By btndone=By.xpath("//*[text()='Done']");
	
	//flavors
	public static By flavors=By.xpath("//*[contains(@class,'Card__Title')]");
	
	
	

	//Search
    public static By txtsearch=By.xpath("//*[text()='Search']");
    
	//Search
    public static By entertext=By.xpath("//input[@placeholder='Search']");
    //close
    public static By btnclose=By.xpath("//*[text()='Close']");
    
    //suggestions
    public static By txtsuggestions=By.xpath("//*[text()='Suggestions']");
    
    //search button
    public static By btnsearch=By.xpath("//button[text()='Search']");


     //flavor
    public static By flavor(String flavor)
    {
    	return By.xpath("//*[text()='"+flavor+"']");
    }
    public static By flavordesc(int i)
	{
		return By.xpath("(//*[contains(@class,'Card__Description')])["+(i+1)+"]");
	}
    
    //filter by
    public static By filterBy=By.xpath("//*[text()='Filter by:']/../button");
    
    public static By btnNS=By.xpath("//*[text()='Nicotine Strength']/../../ul/li[1]/button");
    
    //No results
    public static By txtnoresults=By.xpath("//*[text()='No results']");
    
    public static By btnLimitedEditionswipeleft = By.xpath("//*[@id='limited-edition-pods']/div/div[1]");

	public static By btnMintswipeleft =By.xpath("//*[@id='mint']/div/div[1]");

	public static By btntobaccoswipeleft =By.xpath("//*[@id='tobacco']/div/div[1]");

	public static By btnfruitswipeleft =By.xpath("//*[@id='fruit']/div/div[1]");

	public static By btnberryswipeleft =By.xpath("//*[@id='berry']/div/div[1]");

	public static By btnClearVanillaswipeleft =By.xpath("//*[@id='clear-and-vanilla']/div/div[1]");

	public static By btnNicotineswipeleft =By.xpath("//*[@id='nicotine-free']/div/div[1]");

	public static By wesections = By.xpath(".//*[contains(@class,'FilterSection__Section-sc')]");

	public static By txtclear = By.xpath("(.//*[text()='Clear'])[1]");

	public static By txtclearfilter = By.xpath(".//*[text()='Clear All Filters']");

	public static By txtfliter = By.xpath("(.//*[contains(text(),'Filter & Sort')])[2]");

	public static By wesections(int i) {
		// TODO Auto-generated method stub
		return By.xpath("(.//*[contains(@class,'FilterSection__Section-sc')])[["+(i+1)+"]");
	}
}