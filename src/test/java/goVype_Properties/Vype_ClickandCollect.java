package goVype_Properties;

import org.openqa.selenium.By;

public class Vype_ClickandCollect {

	//Adding flavor in pods ooage
	public static By imgflavor(String flavor)
	{
		return By.xpath("//*[text()='"+flavor+"']");

	}

	//adding quantity
	public static By btnquantity(String flavor)
	{
		return By.xpath("(//*[contains(@class,'Card__Title-sc-') and text()='"+flavor+"'])/../div[3]/div/div[2]/div/button[2]");

	}
	
	//adding quantity
		public static By btnquantity1(String flavor)
		{
			return By.xpath("(//*[contains(@class,'Card__Title-sc-') and text()='"+flavor+"'])/../div[3]/div/div[2]/div/button[1]");

		}

	//add to cart button
	public static By btnaddtocart(String flavor)
	{
		return By.xpath("(//*[contains(@class,'Card__Title-sc-') and text()='"+flavor+"'])/../div[4]/div/div/button[1]");
	}

	//click and collect option
	public static By btnclickandcollect=By.xpath("//*[contains(text(),'Click & ')]");

	//postalcode text box
	public static By postalcode=By.xpath("//*[contains(@placeholder,'Postal')]");

	//search
	public static By txtsearch=By.xpath("(//button[contains(@class,'Button__Container-sc')])[1]");

	//store element list
	public static By storelist=By.xpath("(//*[contains(@class,'StoresList__Name')])");

	//store element list
	public static By storesdistances=By.xpath("(//*[contains(@class,'StoresList__Distance')])");

	//store indicator
	public static By storeindicator=By.xpath("(//*[contains(@class,'StoresList__Indicator')])");

	//store name indicator text
	public static By storetext=By.xpath("(//*[contains(@class,'StoresList__Indicator')])/../../div");

	//select checkbox
	public static By selectcheckbox=By.xpath("(//*[contains(@class,'SelectBox__Indicator')])");

	//click and collect delivary option
	public static By txtclickandcollect=By.xpath("(//*[contains(text(),'Click and collect')])");

	//free shipping
	public static By txtfree=By.xpath("(//*[contains(text(),'Free')])");

	//order
	public static By txtorder=By.xpath("(//*[text()='Orders'])[1]");//(//*[text()='My Orders'])[1]

	//orders screen
	public static By pgorders=By.xpath("(//*[text()='Orders'])[2]");

	//username
	public static By user=By.xpath("(//*[contains(@class,'ReviewBlock__Container')])[2]/div/span[1]");

	//customer name
	public static By customer=By.xpath("//tr[1]/td[3]");

	//order number
	public static By ordernum=By.xpath("//tr[1]/td[1]/span[1]");

	//time remaining
	public static By timeremaining=By.xpath("//tr[1]/td[5]");

	//status
	public static By txtstatus=By.xpath("//tr[1]/td[4]");

	//time since order  //a few seconds ago
	public static By timesinceorder=By.xpath("//tr[1]/td[1]/span[2]");

	//Actions
	public static By Action=By.xpath("//tr[1]/td[6]");
	
	//accept
	public static By btnaction=By.xpath("//tr[1]/td[6]/button");

	//arrow button
	public static By arrowbtn=By.xpath("//tr[1]/td[7]/div");

	//cancel button
	public static By btnclose(String ordernum)
	{

		return By.xpath("(//*[text()='"+ordernum+"'])[2]/../../../../../button");
	}
	//cancel button after collected
	public static By btnclosecollected(String ordernum)
	{

		return By.xpath("(//*[text()='"+ordernum+"'])[1]/../../../../../button");
	}

	//verify different status
	public static By allstatus=By.xpath("//tr[1]/td");

	//reject button
	public static By btnreject=By.xpath("//*[text()='Reject']");

	//Accept button
	public static By btnacceptorder=By.xpath("(//div[text()='Reject'])/../../../div[2]/button");




	//product
	public static By flavorpresent=By.xpath("//*[contains(@class,'sc-gFGZVQ dfAJTX')]");

	//device starterbundle
	public static By solodevice=By.xpath("(//*[contains(text(),'Vuse ePod')])[1]");

	//flavor
	public static By solodeviceflavor=By.xpath("(//*[contains(text(),'Vuse ePod')])[2]");

	//flavor count
	public static By productcount(String count)
	{
		return By.xpath("//*[text()='"+count+"']");
	}
	//flavor count
	public static By Customername(String name)
	{
		return By.xpath("(//*[text()='"+name+"'])[2]");
	}

	//click on ready to pick up
	public static By btnreadytopickup=By.xpath("(//div[text()='Reject'])/../../../div[2]/button");

	//status after updating
	public static By txtStatusupdated(String Orderno)
	{
		return By.xpath("(//*[text()='"+Orderno+"'])[2]/../../div[2]");
	}

	//status after updating
	public static By txtStatusupdatedaftercollected(String Orderno)
	{
		return By.xpath("(//*[text()='"+Orderno+"'])[1]/../../div[2]");
	}

	//btn markascollected
	public static By btnmarkascollected(String orderno)
	{
		return By.xpath("(//*[text()='"+orderno+"'])[2]/../../following-sibling::div//*[text()='Mark as collected']");
	}

	//order in collected
	public static By orderstatus(String orderno)
	{
		return By.xpath("(//*[text()='"+orderno+"'])");
	}

	//collected 
	public static By lnkcollected=By.xpath("(//*[text()='Collected'])");

	//order in collected page
	public static By orderstatuscollected(String orderno)
	{
		return By.xpath("(//*[text()='"+orderno+"'])/../../td[4]");
	}

	//customer name in collected tab
	public static By Custmernamecollected(String orderno)
	{
		return By.xpath("(//*[text()='"+orderno+"'])/../../td[3]");
	}

	//-----------------------

	//reject popup
	public static By rejectorderpopup=By.xpath("//*[contains(text(),'Reject Order')]");

	//reject popup message
	public static By rejectorderpopupmsg=By.xpath("//*[contains(text(),'The order will be r')]");

	//reason for rejecting
	public static By lblrejecttext=By.xpath("//*[contains(text(),'Reason for rejecting')]");

	//input for reason
	public static By inputtext=By.cssSelector("#reason");

	//submit button
	public static By btnsubmit=By.xpath("//*[text()='Submit']");

	//cancel
	public static By btncancel=By.xpath("//*[text()='Cancel']");

	//error text
	public static By txterror=By.xpath("(//*[contains(text(),'You must provid')])[2]");

	//Rejected button
	public static By lnkrejected=By.xpath("(//*[contains(text(),'Rejected')])");

	//-------------accessory-------------//

	//Acessory type
	public static By Accessorytype(String name)
	{
		return By.xpath("//*[text()='"+name+"']");
	}

	//device colour
	public static By lnkcolor(String colour)
	{
		return By.xpath("//*[@data-tip='"+colour+"']/button");
		//*[@data-tip='"+colour+"']/button
	}

	//Quantity picker button
	public static By btnplus=By.xpath("(//*[contains(@class,'QuantityPicker__Button')])[2]");

	//Quantity picker button
	public static By btnminus=By.xpath("(//*[contains(@class,'QuantityPicker__Button')])[1]");

	//Add to cart button
	public static By btnaddtocart=By.xpath("(//*[contains(text(),'Add to cart')])");


	//------------------click and collect device-----------//
	
	//core collection
	public static By lnkcorecollections=By.xpath("//*[contains(text(),'CORE')]");
	
	//elements collection
	public static By lnkelementscollection=By.xpath("//*[contains(text(),'ELEMENTS')]");
	
	public static By btndevicecolour(String devicecolour)
	{
		return By.xpath("//*[text()='"+devicecolour+"']/../button/span");
	}
	
	public static By skincorecollections=By.xpath("//*[contains(text(),'Core')]");
	
	public static By btncancelorder=By.xpath("//button[text()='Cancel order']");
	
	public static By yescancel=By.xpath("//*[contains(text(),'Yes')]");
	
	public static By btnX=By.xpath("//p[contains(text(),'Your order has')]/../../../../button/div");
	
	public static By txtelementscollection=By.xpath("//*[contains(text(),'Elements Collection')]");
	
	public static By allproducts=By.xpath("//*[contains(text(),'Vuse ePod')]");
	
	//akhila new
	public static By profileicon=By.xpath("//*[@class='sc-jSMfEi hhMOY']");
	public static By txtlogout=By.xpath("//*[text()='Logout']");
	public static By pgprofile=By.xpath("(//*[text()='Settings'])[2]");
	public static By typeofcourier=By.xpath("//*[text()='CNC']");
	
	public static By btnreorder(String Orderno)
	{
		return By.xpath("//*[text()='"+Orderno+"']/../../../../div/button");
	}
	public static By listlines(int i)
	{
		return By.xpath("(//*[contains(@class,'sc-gFGZVQ dfAJTX')])["+(i+1)+"]");
	}
}
