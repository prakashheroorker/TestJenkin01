package goVype_Properties;
import org.openqa.selenium.By;
public class Vype_AgeCertify {

	//Text on Age Certify Page
	public static By weAgeCertify=By.xpath("(//*[@class='Button__Label-sc-1gw2hd1-2 czwIxn'])[1]");
			//".//*[text()='To gain access to our platform, please select your province of residence and confirm you have reached the legal age to purchase vaping products in that province.']");
	//Province Drop down
	public static By weDropDownProvince=By.xpath("(.//*[@name='province'])[2]");
	//I am 18/19 or over button
	public static By btnIam19orOver=By.xpath("(//*[@class='Button__Label-sc-1gw2hd1-2 czwIxn'])[1]");
	// "(//*[@class='Button__Label-sc-1gw2hd1-2 inRZgq'])[1]");
	//I am not 18 button
	public static By btnIamNot18 = By.xpath(".//*[contains(text(),'I am not')]");
	//Under 18 Error message
	public static By txtErrorMustBeAtLeast18 = By.xpath(".//div[@type='error']//p");
	
	



}
