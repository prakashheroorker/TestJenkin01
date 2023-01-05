package goVype_Properties;

import org.openqa.selenium.By;

public class Vype_KnowyourVape {
	//Vuse News
		public static By lnkVuseNews = By.xpath(".//a[contains(@href, '/ca/en/blog/')]");
		//Know Your Vape
		public static By lnkKnowYourVape = By.xpath(".//*[@data-tracking='nav--link--text--Know your Vape']");
		//Quality image
		public static By ImgKnowYourVape = By.xpath(".//img[contains(@class, 'quality-seal-icon-bg')]");
		//Watch video button
		public static By btnWatchVideo = By.xpath("(.//p[text()='Watch Video'])/../..");
		//Watch video button
		public static By btnWatchVideo1 = By.xpath("(.//div[text()='Watch Video'])[1]/..");
		//Learn more button
		public static By btnlearnMore = By.xpath("(.//p[text()='Learn More'])/..");
		//Link Watch on youtube
		public static By lnkWatchonYouTube = By.xpath(".//*[contains(@aria-label, 'Watch on YouTube')]");
		//Video modal close button
		public static By btnVideoModalClose = By.xpath(".//span[contains(@class ,'close')]");
		//Watch later button
		public static By btnWatchLater = By.xpath(".//*[contains(@aria-label, 'Watch later')]");
		//Share button
		public static By btnShare = By.xpath(".//button[contains(@aria-label, 'Share')]");
		//Vuse logo
		public static By LogoVuseYt = By.xpath(".//a[contains(@class, 'ytp-title-channel-logo')]");
		//supplier sourcing text
		public static By txtSuppilerSourcing = By.xpath("(.//div[text()='Supplier Sourcing'])[1]");
		//video player
		public static By VideoPlayer = By.xpath(".//iframe[contains(@src, 'https://www.youtube.com/embed/')]");
		//Know you vape icon
		public static By KYVIcon = By.xpath(".//img[contains(@class, 'kYVIcon')]");
		//collapse arrow content
		public static By content = By.xpath(".//div[contains(@class, 'StageBlocBodyCollapseElement')][1]");
		//Vuse Icon
		public static By VuseIcon = By.xpath(".//*[contains(@class, 'Nav__DesktopLogo')]");
		//Stage 1 text
		public static By txtStage1 = By.xpath(".//h2[text()='STAGE 1']");
		//Video time
		public static By VideoTime = By.xpath(".//*[@class='ytp-time-current']");
		//1/6
		public static By txt1by6 = By.xpath(".//*[text()='We carefully select our suppliers']");
		//have a question
		public static By txthvques = By.xpath(".//*[@id='have-a-question-container']");
		//contact us
		public static By lnkcontactus = By.xpath(".//*[@id='contact-us']");
		//Raw material
		public static By lnkrawmat = By.xpath(".//*[contains(@class, 'circle-item circle-item-pos-2')]");
		//2/6
		public static By txt2by6 = By.xpath(".//*[text()='All our e-Liquid ingredients are checked and quality approved']");
		//Testing
		public static By lnktesting = By.xpath(".//*[contains(@class, 'circle-item circle-item-pos-3')]");
		//3/6
		public static By txt3by6 = By.xpath(".//*[text()='We conduct 1000s of hours of testing on all products']");
		//Manufacturing process
		public static By lnkmanufacturingprocess = By.xpath(".//*[contains(@class, 'circle-item circle-item-pos-4')]");
		//4/6
		public static By txt4by6 = By.xpath(".//*[text()='All our e-Liquids are made in our facilities']");
		//supply chain
		public static By lnksuppchain = By.xpath(".//*[contains(@class, 'circle-item circle-item-pos-5')]");
		//5/6
		public static By txt5by6 = By.xpath(".//*[text()='We can trace our vaping products right back to the source']");
		//Brand in hand
		public static By lnkbrandinhand = By.xpath(".//*[contains(@class, 'circle-item circle-item-pos-6')]");
		//6/6
		public static By txt6by6 = By.xpath(".//*[text()='We ensure high safety standards every step of the way']");
		//get in touch
		public static By txtgetintouch = By.xpath(".//h1[text()='Get in touch']");
		
		public static By title = By.xpath("(.//*[@class='title-container'])[7]");
		public static By qnslist = By.xpath(".//*[@class='collapses-container']");
		public static By qnscontent = By.xpath("//*[contains(@class,'StageBlocBodyCollapseElement')]");
		public static By cntanswer = By.xpath("(.//*[@class=' collapse-desc collapse-open'])");
		public static By txtrawmaterialSourcing = By.xpath("(.//*[text()='Raw Material Sourcing'])[1]");
		public static By txttestingprocess = By.xpath("(.//*[text()='Testing'])[1]");
		public static By txtmanufacturing = By.xpath("(.//*[text()='Manufacturing Process'])[1]");
		public static By txtrsupplychain  = By.xpath("(.//*[text()='Supply Chain & Distribution'])[1]");
		public static By txtrbrandin  = By.xpath("(.//*[text()='Brand In Hand'])[1]");
		public static By dropdown(int i) {
			// TODO Auto-generated method stub
			return By.xpath("(.//*[@class='StageBlocBodyCollapseElement'])["+(i+1)+"]");
		}
		public static By cntanswer(int i) {
			// TODO Auto-generated method stub
			return By.xpath("(.//*[@class=' collapse-desc collapse-open'])["+(i+1)+"]");
		}
}