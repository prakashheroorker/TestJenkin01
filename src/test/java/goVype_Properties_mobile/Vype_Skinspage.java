package goVype_Properties_mobile;

import org.openqa.selenium.By;

public class Vype_Skinspage {

	public static By EpodflavorSection(String flavourSection) {
		
		return By.xpath("//div[@id='"+flavourSection+"']");
	}
	public static By btnAddFlavor(String flavor){
		return By.xpath("(//*[text()='"+flavor+"'])[1]");
		}
	
	public static By imgflavor(String flavor) {
		// TODO Auto-generated method stub
		return By.xpath("(.//*[text()='"+flavor+"']/..//*[@class='Origami__Container-sc-3zmvwr-0 laAJvH'])");
	}
	public static By btnQtyIncrement = By.xpath("//*[contains(@class,'QuantityPicker__Button')][2]");
	
	public static By btnAddToCart = By.xpath("(.//*[text()='Add to cart'])[1]");

	public static By lnkDevices = By.xpath("(//*[contains(@class,'Menu__MenuItemContainer-')])[2]");

	public static By lnkePod2 = By
				.xpath("(//*[contains(@class,'Menu__MenuItemContainer-')])[1]");

	public static By txtpersonlizepod=By.xpath("(//*[contains(text(),'Personalize your ePod')])");

	public static By deviceshop=By.xpath("(//*[contains(@class,'Menu__MenuItemContainer-')])[2]");

	public static By lnkepod=By.xpath("(//*[contains(@class,'Navigation__NavigationButton-sc-')])[2]");

	public static By LnkePod=By.xpath("(//*[contains(@class,'Menu__MenuItemContainer-')])[3]");

	public static By imgDefaultSkin=By.xpath("//*[contains(@class,'ProductPage__FigureWrap-sc-1pfzzzx-5 lfKgFa')]");

	public static By lnksaveall=By.xpath("//*[contains(@class,'Menu__List-sc-pbcgxm-2 cQAjHA')][1]");

	public static By epod2vaping=By.xpath("(//*[contains(@class,'Menu__MenuItemContainer-')])[1]");

	public static By productslist=By.xpath("(//*[contains(@class,'Menu__List-sc-')])");

	public static By clicksave=By.xpath("//*[contains(@class,'Menu__MenuItemContainer-sc-')][2]");

	public static By savelist=By.xpath("//*[contains(@class,'Menu__List-sc-pbcgxm-2 cQAjHA')][1]");

	public static By clickabout=By.xpath("//*[contains(@class,'Menu__MenuItemContainer-sc-pbcgxm-0 clGBxz')][3]");

	public static By aboutpage=By.xpath("//*[contains(@class,'Menu__List-sc')]");

	public static By clickhelp=By.xpath("//*[contains(@class,'Menu__MenuItemContainer-sc-')][6]");

	public static By verifyhelp=By.xpath("//*[contains(@class,'Menu__List-sc-')]");

	public static By btnloginregister=By.xpath("//*[contains(@class,'MobileNavItem__Container-sc')]");

	public static By clickback=By.xpath("//*[contains(@class,'Menu__ReturnLink-sc')]");

	public static By skintype(String Skin) {
		
		return By.xpath("//*[contains(text(),'"+Skin+"')]");
	}
	

}
