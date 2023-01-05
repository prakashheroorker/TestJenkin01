package goVype_Properties_mobile;

import org.openqa.selenium.By;

public class Vype_Help {


	//-----------------------------------Shipping and delivery---------------------------->
	
	//Links under help
	public static By lnkshelp = By.xpath("//a[contains(@class,'Menu__MenuItemContaine')]");

	//scroller icon
	public static By scrollericon=By.xpath("//*[@class='scroller-icon']");
	
	//shipping cards
	public static By shippingcards=By.xpath("(//*[contains(@class,'card-title')])");
	
	//content for text express shipping
	public static By txtexpressshipping=By.xpath("(//*[contains(@class,'card-wrapper')])[1]");
	
	//content for Same day delivery
	public static By txtsamedayshipping=By.xpath("(//*[contains(@class,'card-info')])[2]");
	
	//content click and collect content
	public static By txtclickandcollect=By.xpath("(//*[contains(@class,'card-info')])[3]");
	
	//content free standard shipping
	public static By txtfreestandardshipping=By.xpath("(//*[contains(@class,'ship-text')])");
	
	//locate icon
	public static By locateicon=By.xpath("//*[@class='locate']");
	
	//click and collect text box
	public static By txtzipcode=By.xpath("//input[@placeholder='Enter postal code here']");
	
    //submit button
	public static By btnsubmit=By.xpath("//input[@type='submit']");
	
	//ready to shop
	public static By txtreadytoshop=By.xpath("//*[contains(text(),'READY TO')]");
	
	//device image
    public static By proddeviceimg=By.xpath("(//*[contains(@class,'product__img')])[1]");
    
    //pods image
    public static By podimage=By.xpath("(//*[contains(@class,'product__img')])[2]");
    
    //link shop device
    public static By lnkshopdevice=By.xpath("//*[contains(text(),'Shop devi')]");
    
    //link pods
    public static By lnkshoppods=By.xpath("//*[contains(text(),'Shop pods')]");
    
    //faqs
    public static By txtfaqs=By.xpath("//*[contains(text(),'Any ques')]");
    
    //keywords to search
    public static By txtkeywords=By.xpath("//*[contains(@placeholder,'Type keywords')]");
    
    //autosuggestion
    public static By txtsuggession(String question)
    {
    	return By.xpath("(//*[contains(text(),'"+question+"')])[1]");
    }
    
    //questions
    public static By txtquestions=By.xpath("(//*[contains(text(),'Questions? Se')])[1]");
    
    //all questions
    public static By txtallquestions=By.xpath("(//*[contains(@class,'Question__Container')])");
    
    
  //------------------------------------------Help-----------------------------------------//
    
    //Contact Us
    public static By lnkcontactUs=By.xpath("(//a[contains(text(),'Contact')])[2]");
    
    //Contact us page
    public static By txtcontactus=By.xpath("(//*[contains(text(),'Get in touch')])[1]");
    
    //Faqs
    public static By lnkfaq=By.xpath("(//*[contains(text(),'FAQ')])[1]");
    
    //StoreLocator
    public static By lnkStoreLocator=By.xpath("(//*[contains(text(),'Store Locator')])[2]");
    
    //Store Locator page
    public static By pgstorelocator=By.xpath("(//*[contains(text(),'Find a Vuse')])[1]");
    
    //---------------------------Contact us page---------------------------------------//

  //Verify all contact us options
    public static  By txtoptionscontactuspage=By.xpath("//*[contains(@class,'FlexItemBlurb__Title')]");
    
    //live chat
    public static By lnklivechat=By.xpath("//*[text()='Live Chat']");
    
    //content live chat
    public static By txtchat=By.xpath("//*[text()='Live Chat']/..");
    
    //popup
    public static By popup=By.xpath("//*[contains(@class,'HeaderView')]/..");
    
    //minimize button
    public static By btnminimize=By.xpath("//*[contains(@class,'HeaderView')]/div/button");
    
    //btncobrowse
    public static By btncobrowse=By.xpath("(//*[contains(text(),'CoBrowse')])[1]/..");
    
    //cobrowse
    public static By txtcobrowse=By.xpath("//*[contains(text(),'Co-Browse')]/..");
    
    //cobrowsetext
    public static By lnkcobrowse=By.xpath("//*[contains(text(),'Co-Browse')]");
    
    //close cobrowse
    public static By btnclose=By.xpath("//*[contains(text(),'Co-Browse')]/../div[2]");
    
    
    
    
    


}
