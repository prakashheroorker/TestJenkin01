package goVype_Properties_mobile;

import org.openqa.selenium.By;

public class Vype_Skin_mobile
{

	public static By lnkCore= By.xpath("//*[text()='Core Collection']");

	public static By lnkCollX= By.xpath("//*[text()='Collection X']");
	
	public static By pgCore=  By.xpath("(//*[contains(@class,'Nav__ItemContainer-sc-')])[8]");
	
	public static By skintype(String skin) {
		return By.xpath(".//*[@href='/ca/en/buy-online/vype-epod-skins/" + skin + "/']");
		
	}
	
	
	public static By vuselogo=By.xpath(".//*[contains(@class,'//*[@class=\"Nav__Container-sc-9z4o2m-0 eqNYxy mobile-header-container\"]//*[@class=\"Nav__LogoWrap-sc-9z4o2m-3 jecGNH\"]')]");
	
	
	public static By btnmenu = By
			.xpath("//*[@class=\"Nav__Container-sc-9z4o2m-0 eGbTIz\"]//*[@class=\"MobileNav__Toggle-muz2dr-0 wHvKo\"]");
	
	
	//logout
    public static By btnlogout=By.xpath("(//*[text()='Logout'])[2]");
	
	
	
    public static By btnMenu=By.xpath("//*[@data-tracking='nav--link--image--Vype_Home']/preceding-sibling::button");
	
	
    public static By Skintype(String skin) {
		return By.xpath(".//*[@href='/ca/en/buy-online/vype-epod-skins/"+skin+"-epod-2/']");
				//".//*[@href=\"/ca/en/buy-online/vype-epod-skins/" + skin + "/\"]");
    }
	
	
    public static By skinTypCore(String skin) {
		return By.xpath(".//*[@href='/ca/en/buy-online/vype-epod-2-plus-skins/"+skin+"-plus/']");
		
	
	}


    
    public static By skinType(String skin) {
		return By.xpath(".//*[@href='/ca/en/buy-online/vype-epod-2-plus-skins/"+skin+"-epod-2-plus/']");
		
	
	}
    
    
    
    
    
    
    
	}
	
	
	
	
	
	
	


















