package goVype_Properties;

import org.openqa.selenium.By;

public class Vype_RewardsSubscription {
	
	public static By txtCurrentPtns = By.xpath("//*[contains(@class,'PointsChart__Points')]");

	public static By txtYourhistory = By.xpath("//*[text()='Your history']");

	public static By txtSubscriptionPoints = By.xpath("//*[text()='Subscribe to the Program Subscription']/..//*[text() = '+2000']/..");

	public static By txtCartSummary = By.xpath("//*[@class='Total__Inner-sc-1axpxsv-1 cnJWJv']");

	public static By txtUpdatedPtns = By.xpath("//*[contains(@class,'PointsChart__Points-sc')]");


}
