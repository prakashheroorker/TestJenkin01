package goVype_Properties;

import org.openqa.selenium.By;

public class Vype_ePen3CartridgesFlavorDetail {

	//Add to Cart button in Modal
	public static By btnAddToCart=By.xpath("(.//*[text()='Add to cart'])[1]");


	//Text "Nicotine Strength" from the Flavor detail page
	public static By weTxtNicotineStrength=By.xpath("(.//*[contains(text(),'Nicotine strength')])[1]");

	//Text "Quantity" from the Flavor detail page
	public static By weTxtQuantity=By.xpath("(.//*[contains(text(),'Quantity')])[1]");

	//Text "12mg/ml" is displayed from the Flavor detail page
	public static By weTxt12mgperml=By.xpath("(.//*[text()='12mg/ml'])[1]");

	//Text "30mg/ml" is displayed from the Flavor detail page
	public static By weTxt30mgperml=By.xpath("(.//*[text()='30mg/ml'])[1]");

	//Text "0mg/ml" is displayed from the Flavor detail page
	public static By weTxt0mgperml=By.xpath("(.//*[text()='0mg/ml'])[1]");

	//Quantity Increment button under 12 mg/ml on Add to Cart Modal
	public static By btnIncrement12mgperml=By.xpath(".//*[text()='12mg/ml']/..//div//button[2]");

	//Quantity Increment button under 30 mg/ml on Add to Cart Modal
	public static By btnIncrement30mgperml=By.xpath(".//*[text()='30mg/ml']/..//div//button[2]");

	//Quantity Increment button under 0 mg/ml on Add to Cart Modal
	public static By btnIncrement0mgperml=By.xpath(".//*[text()='0mg/ml']/..//div//button[2]");

	//Quantity Increment button under 1.6% on Add to Cart Modal
	public static By btnIncrement1point6percent=By.xpath(".//*[text()='1.6%']/..//div//button[2]");

	//Quantity Increment button under 3% on Add to Cart Modal
	public static By btnIncrement3percent=By.xpath(".//*[text()='3%']/..//div//button[2]");

	//Quantity Increment button under 5% on Add to Cart Modal
	public static By btnIncrement5percent=By.xpath(".//*[text()='5%']/..//div//button[2]");

	//Text "Total" is displayed on Add to Cart Modal
	public static By weTxtTotal=By.xpath("(.//*[text()='Total'])[1]");


	//Text "$N" is displayed  from the Flavor detail page
	public static By weTxtTotalValueN(String num){

		return By.xpath("(.//*[text()='$"+num+"'])[1]");

	}

	//Text "$N" is displayed  from the Flavor detail page
	public static By weTxtTotalValueN1(String num){

		return By.xpath("(.//*[text()='$"+num+"'])[4]");

	}


	//Text 'Strawberry Smash ePen 3 Cartridge' from the Flavor detail page
	public static By weTxtStrawberrySmashePen3Cartridge=By.xpath("(.//*[text()='Strawberry Smash ePen 3 Cartridge'])[2]");
	//After browsing back from the cart
	public static By weTxtStrawberrySmashePen3Cartridge1=By.xpath("(.//*[text()='Strawberry Smash ePen 3 Cartridge'])[4]");

	//Text Flavor'Strawberry Smash ePen 3 Cartridge'description from the Flavor detail page
	public static By weTxtStrawberrySmashePen3CartridgeDescription=By.xpath("(.//*[text()='A fusion of strawberry with green fruit notes.'])[1]");

	//select flavor pods
	public static By weFlavorPods(String flavor)
	{
		return By.xpath(".//img[contains(@alt,'"+flavor+"')]");
	}

	//flavor specific pod page
	public static By pgFlavorPods(String flavor)
	{
		return By.xpath(".//h1[contains(text(),'"+flavor+"')]");
	}

	//Subscribe and Save Button
	public static By btnSubscribeAndSave = By.xpath(".//*[contains(@class,'Order')]//*[contains(text(),'Subscribe')]");

	//Scroll to Nicotine Selection
	public static By weTxtChooseQuantity = By.xpath(".//h4[contains(text(),'Choose quantity')]");

	//Subscribe and save buttomn
	public static By btnSubscribeAndSave2 = By.xpath(".//button//*[text()='Subscribe & Save']");

	//Text "$N/month" is displayed from the flavor details page
	public static By weTxtTotalValueNPerMonth(String num){

		return By.xpath("(.//*[text()='$"+num+"/month'])[1]");

	}

	//Text Flavor'Strawberry Smash ePen 3 Cartridge'description from the Flavor detail page
	public static By weTxtStrawberryePen3CartridgeDescription=By.xpath("(.//*[text()='A fusion of strawberry flavour with fruit and green notes.'])[1]");



	//Text 'Original Strawberry' from the Flavor detail page
	public static By weTxtOriginalStrawberryFlavor=By.xpath("(.//*[text()='Original Strawberry'])[2]");



}
