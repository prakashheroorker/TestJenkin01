package goVype_Properties;

import org.openqa.selenium.By;

public class Vype_VuseNews {


	public static By txtVuseNews = By.xpath("//*[text()='Vuse News']");
	
	public static By txtVusenews = By.xpath("(//*[text()='Vuse News'])[2]");

	public static By wefooterLinks = By.xpath("//*[contains(@class,'Footer__Links-sc')]");

	public static By weContent = By.xpath("//*[contains(@class,'RichText__Container-sc')]");
	
	public static final By newstitle = By.xpath("(//*[contains(@class,'typography__H1')])");
	
	public static By weDescription(int i) {
		
		return By.xpath("(//*[contains(@class,'ArticlePreview__Description-sc')])["+(i+1)+"]");
	}
	
	public static final By wenewstiles = By.xpath("(//*[contains(@class,'typography__H4')])");

	public static By weReadMore(int i) {

		return By.xpath("(//*[contains(@class,'ArticlePreview__Action-sc')])["+(i+1)+"]");
	}

	public static final By weReadMore = By.xpath("(//*[contains(@class,'ArticlePreview__Action-sc')])[1]");

	public static By wenewstiles(int i) {

		return By.xpath("(//*[contains(@class,'typography__H4')])["+(i+1)+"]");
	}

}
