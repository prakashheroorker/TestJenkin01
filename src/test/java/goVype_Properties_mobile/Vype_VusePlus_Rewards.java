package goVype_Properties_mobile;

import org.openqa.selenium.By;

public class Vype_VusePlus_Rewards {
	//Gold Device Discount
			public static By pgRewards =By.xpath("//*[text()='summary']");
			
			public static By txtUser = By.xpath("(//*[contains(@class,'Tier__TierWrapper')])[2]");
		
			public static By txtAddPromotion =By.xpath("//*[contains(text(),'Add promotion')]");
			public static By lnkredeem =By.xpath("//*[contains(text(),'redeem')]");
			
			public static By imgDeviceDiscount =By.xpath("(//*[@class='CustomCheckbox__Figure-sc-1ktky1y-7 ifMXEl'])[1]");
			
			public static By txtPromotionApplied=By.xpath("//*[contains(text(),'Promotion Applied')]");
			
			public static By txtsubtotal=By.xpath("//*[text()='Subtotal']/following-sibling::strong");
			
			public static By txtdiscount=By.xpath("//*[contains(text(),'Discount')]/../following-sibling::strong");
			
			
	
}
