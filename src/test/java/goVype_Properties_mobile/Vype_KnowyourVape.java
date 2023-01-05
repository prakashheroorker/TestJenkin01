package goVype_Properties_mobile;

import org.openqa.selenium.By;

public class Vype_KnowyourVape {
	
	//know youe vape image
		public static By ImgKnowYourVape = By.xpath(".//img[contains(@class, 'quality-seal-icon-bg')]");
		//Watch video button
		public static By btnWatchVideo = By.xpath("(.//p[text()='Watch Video'])/../..");
		//Watch video button
		public static By btnWatchVideo1 = By.xpath("(.//div[text()='Watch Video'])[2]/..");
		//Learn more button
		public static By btnlearnMore = By.xpath("(.//p[text()='Learn More'])/..");
		
		public static By lnkKnowYourVape = By.xpath("//*[text()='Know your Vape']");
		
		public static By txtSuppilerSourcing = By.xpath("(.//div[text()='Supplier Sourcing'])[1]");
		
		//1/6
		public static By txt1by6 = By.xpath("(.//*[text()='1'])[2]");
		//have a question
		public static By txthvques = By.xpath(".//*[@id='have-a-question-container']");
		//contact us
		public static By lnkcontactus = By.xpath(".//*[@id='contact-us']");
		//Video modal close button
		public static By btnVideoModalClose = By.xpath(".//span[contains(@class ,'close')]");
		//Know you vape icon
		public static By KYVIcon = By.xpath(".//img[contains(@class, 'kYVIcon')]");
		//collapse arrow content
		public static By content = By.xpath(".//div[contains(@class, 'StageBlocBodyCollapseElement')][1]");
		public static By lnkrawmat = By.xpath(".//*[contains(@class, 'circle-item circle-item-pos-2')]");
		//2/6
		public static By txt2by6 = By.xpath("(.//*[text()='2'])[2]");
		//Testing
		public static By lnktesting = By.xpath(".//*[contains(@class, 'circle-item circle-item-pos-3')]");
		//3/6
		public static By txt3by6 = By.xpath("(.//*[text()='3'])[2]");
		//Manufacturing process
		public static By lnkmanufacturingprocess = By.xpath(".//*[contains(@class, 'circle-item circle-item-pos-4')]");
		//4/6
		public static By txt4by6 = By.xpath("(.//*[text()='4'])[2]");
		//supply chain
		public static By lnksuppchain = By.xpath(".//*[contains(@class, 'circle-item circle-item-pos-5')]");
		//5/6
		public static By txt5by6 = By.xpath("(.//*[text()='5'])[2]");
		//Brand in hand
		public static By lnkbrandinhand = By.xpath(".//*[contains(@class, 'circle-item circle-item-pos-6')]");
		//6/6
		public static By txt6by6 = By.xpath("(.//*[text()='6'])[2]");
		

		
		public static By title = By.xpath("(.//*[@class='title-container'])[7]");
		
		public static By qnslist = By.xpath(".//*[@class='collapses-container']");
		
		public static By qnscontent = By.xpath("//*[contains(@class,'StageBlocBodyCollapseElement')]");
		
		public static By cntanswer = By.xpath("(.//*[@class=' collapse-desc collapse-open'])");
		
		public static By txtrawmaterialSourcing = By.xpath("(.//*[text()='Raw Material Sourcing'])[1]");
		
		public static By txttestingprocess = By.xpath("(.//*[text()='Testing'])[1]");
		
		public static By txtmanufacturing = By.xpath("(.//*[text()='Manufacturing Process'])[1]");
		
		public static By txtrsupplychain  = By.xpath("(.//*[text()='Supply Chain & Distribution'])[1]");
		
		public static By txtrbrandin  = By.xpath("(.//*[text()='Brand In Hand'])[1]");
		
		public static By title1 = By.xpath("(.//*[text()='Supplier Sourcing'])[2]");
		
		public static By title2 = By.xpath("(.//*[text()='Raw Material Sourcing'])[2]");
		
		public static By title3 = By.xpath("(.//*[text()='Testing'])[2]");
		
		public static By title4 = By.xpath("(.//*[text()='Manufacturing Process'])[2]");
		
		public static By title5 = By.xpath("(.//*[text()='Supply Chain & Distribution'])[2]");
		public static By title6 = By.xpath("(.//*[text()='Brand In Hand'])[2]");
		public static By dropdown(int i) {
			// TODO Auto-generated method stub
			return By.xpath("(.//*[@class='StageBlocBodyCollapseElement'])["+(i+1)+"]");
		}
		public static By cntanswer(int i) {
			// TODO Auto-generated method stub
			return By.xpath("(.//*[@class=' collapse-desc collapse-open'])["+(i+1)+"]");
		}
}