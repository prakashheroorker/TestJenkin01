package com.rai.framework;

import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Base64;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CommandInfo;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.DriverCommand;
import org.openqa.selenium.remote.HttpCommandExecutor;
import org.openqa.selenium.remote.RemoteExecuteMethod;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.http.HttpClient.Factory;
import org.openqa.selenium.remote.internal.OkHttpClient;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.perfecto.reportium.client.ReportiumClientFactory;
import com.perfecto.reportium.model.Job;
import com.perfecto.reportium.model.PerfectoExecutionContext;
import com.perfecto.reportium.model.Project;
import com.perfecto.reportium.test.TestContext;
import com.perfecto.reportium.test.result.TestResultFactory;
import com.perfectomobile.httpclient.utils.FileUtils;

import goVype_Properties_mobile.Vype_CommonXpath;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;



public class RAI_Mobile_Utility_Functions extends BaseClass {
	
	


	public  AndroidDriver connectWithoutProxy(DesiredCapabilities caps) {

		URL url;


		try {

			url = new URL(Constants.HostURL);

		} catch (MalformedURLException e) {

			throw new RuntimeException(e.getMessage(), e);

		}
		/*piece of code has been commented as in common it doesn't support for both vendors, 
		1. As DXC HttpClientbuilder is provided by apache, but CTS are using the one provided by Selenium. - if DXC tries to update the Maven dependency 
		getting error on Latest RAI framewok so to match DXC has been updated their function to Selenium instead Apache */

		//Since Even the CTS has kept the same name as MyHttpClientFactory , so we have to change out file to MyHttpClientFactory_DXC for implementation
		// DXC HttpClientbuilder is provided by apache, but CTS are using the one provided by Selenium. So we cannot reuse the same builder library. 


		okhttp3.OkHttpClient.Builder client = new okhttp3.OkHttpClient.Builder().connectTimeout(60, TimeUnit.SECONDS)
				.writeTimeout(60, TimeUnit.SECONDS).readTimeout(60, TimeUnit.SECONDS);
		Factory factory = new MyHttpClientFactory(new OkHttpClient(client.build(), url));
		HttpCommandExecutor executor = new HttpCommandExecutor(new HashMap<String, CommandInfo>(), url, factory);

		return new AndroidDriver(executor, caps);

	}

	private static String getWorkstation() {

		Map<String, String> env = System.getenv();

		if (env.containsKey(Constants.WorkStationType_ComputerName)) {

			// Windows

			return env.get(Constants.WorkStationType_ComputerName);

		} else if (env.containsKey(Constants.WorkStationType_HostName)) {

			// Unix/Linux/MacOS

			return env.get(Constants.WorkStationType_HostName);

		} else {

			// From DNS

			try

			{

				return InetAddress.getLocalHost().getHostName();

			}

			catch (UnknownHostException ex)

			{

				return "Unknown";

			}

		}

	}
	public RAI_Mobile_Utility_Functions() {

	}

	

	// Constructor to launch device
	public RAI_Mobile_Utility_Functions(String name_class,String TestCaseName) {
		System.out.println("Connecting to Perfecto Lab---------------");
		try {
			String browserName =Constants.BROWSERNAME;
			DesiredCapabilities capabilities = new DesiredCapabilities(browserName, "", Platform.ANY);
			
			//DesiredCapabilities capabilities = new DesiredCapabilities("", "", Platform.ANY);
			String host = Constants.PM_CLOUD;
			String securityToken=Constants.SecurityToken;
			capabilities.setCapability("securityToken", securityToken);
			capabilities.setCapability("resolution", "1920x1080");
			capabilities.setCapability("takesScreenshot", false);
			capabilities.setCapability("screenshotOnError", true);
			capabilities.setCapability("scriptName", TestCaseName);
			SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");
			capabilities.setCapability("enableAppiumBehavior", true);
			capabilities.setCapability("useAppiumForWeb", true);
			Date today = Calendar.getInstance().getTime();
			String reportDate = df.format(today);
			int date_CIjob= Integer.parseInt(reportDate);
            // TODO: Change your device ID
			capabilities.setCapability("deviceName" ,Constants.PM_DEVICEID);
			 adriver = new AndroidDriver(new URL("https://" + host + "/nexperience/perfectomobile/wd/hub/fast"), capabilities);
            PerfectoLabUtils.setExecutionIdCapability(capabilities, host);
           
			PerfectoExecutionContext perfectoExecutionContext = new PerfectoExecutionContext.PerfectoExecutionContextBuilder()
					.withProject(new Project("Reynolds", "1.0")).withJob(new Job("Updated Tc mobile", 45)).withContextTags("tag1")
					.withWebDriver(adriver).build();
			
			reportiumClient = new ReportiumClientFactory().createPerfectoReportiumClient(perfectoExecutionContext);
			String testName = TestCaseName;
			reportiumClient.testStart(testName, new TestContext());


		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	public String fnGetListOfValuesFromDropdown(By by, String elementname) throws Exception 
	{
		String str = "";
		try 
		{
			//WebElement e1 = fluentWait(by, 2);
			WebDriverWait wait = new WebDriverWait(adriver, 30);
			wait.until(ExpectedConditions.visibilityOfElementLocated(by));
			MobileElement e1 = (MobileElement) adriver.findElement(by);
			if (e1.isDisplayed()) 
			{
				Select se = new Select(e1);

				List<WebElement> allOptions = se.getOptions();
				for (int j = 0; j < allOptions.size(); j++) 
				{
					str=str+allOptions.get(j).getText()+ " ";
				}                             
				str=str.substring(0, str.length()).trim();
				System.out.println(str);
				reportiumClient.reportiumAssert("Dropdown content is verified", true);
			}
		} 
		catch (Exception e) 
		{
			// TODO: handle exception
			reportiumClient.reportiumAssert("Dropdown content is verified", false);
			e.printStackTrace();
		}
		return str;
	}



	public void fnClearCache() throws IOException, InterruptedException  {
		if(GetPlatformVersion().equalsIgnoreCase("Android"))
		{
			Map<String, Object> params = new HashMap<>();

			adriver.executeScript("mobile:browser:clean", params);
			Thread.sleep(3000);
		}

		else
		{
			ClearSafariCache();
			System.out.println("Selected Device is iOS");
		}

	}

	public void ClearSafariCache() throws InterruptedException {
		int OSVersion;
		//Calling Method
		OSVersion = Integer.parseInt(deviceInfo(adriver, "osVersion").substring(0, 2));

		System.out.println("=============="+ OSVersion);
		// TODO Auto-generated method stub

		Boolean aLreadyInSafari = true;

		//Go to Home Page
		Map<String,Object> param = new HashMap<String, Object>();
		param.put("keySequence", "HOME ");
		adriver.executeScript("mobile:presskey", param);

		//Launch Settings Menu
		startApp("Settings", adriver);

		if(OSVersion==15)
		{
			String myAUT = "com.apple.Preferences";
			param.clear();
			param.put("identifier", myAUT);
			adriver.executeScript("mobile:application:open", param); 
			
			
		}



		switchToContext(adriver, "NATIVE_APP");


		if(OSVersion==10){

			if( waitForElementToAppear(adriver, By.xpath("//*[@label=\"Back\"] |//UIANavigationBar//*[@label=\"Safari\"]"), 5)){

				//If is safari setting menu opened Go ahead and clear the safari cache
				if( waitForElementToAppear(adriver, By.xpath("//UIANavigationBar//*[@label=\"Safari\"]"), 5)){



					processClearing1(adriver, false);

					//else come back to main Settings menu and Clear the Cache
				}
				else{
					rdriver.findElementByXPath("//*[@label=\"Back\"]").click();
					processClearing(adriver, false);
				}

			}
			else {

				processClearing(adriver, false);
			}


		}

		else{
			////XCUIElementTypeButton[@label=\"Settings\"]
			if( waitForElementToAppear(adriver, By.xpath("//XCUIElementTypeButton[@label=\"Settings\"]"), 5)){

				//If is safari setting menu opened Go ahead and clear the safari cache
				if( waitForElementToAppear(adriver, By.xpath("//*[@label=\"Safari\" and @visible=\"true\"]"), 5)){



					processClearing1(adriver, false);

					//else come back to main Settings menu and Clear the Cache
				}
				else{
					adriver.findElementByXPath("//XCUIElementTypeButton[@label=\"Settings\"]").click();
					processClearing(adriver, false);
				}

			}
			else {

				processClearing(adriver, false);
			}

		}

	}

	public void processClearing(AppiumDriver driver, Boolean aLreadyInSafariSetting) throws InterruptedException {
		int OSVersion;
		//Calling Method
		OSVersion = Integer.parseInt(deviceInfo(driver, "osVersion").substring(0, 2));
		//skipping if screen already in safari page
		if (aLreadyInSafariSetting == false){

			if(deviceInfo(driver, "model").contains("iPad")){
				try {
					driver.findElementByXPath("//*[@label=\"Cancel\"]").click();
				} catch (Exception e) {

					System.out.println("no such element found");
				}
			}

			if(OSVersion==10){

				try {
					scrolltoXPath(driver,"//UIASearchBar[@label=\"Settings\" and @visible=\"true\"] | //XCUIElementTypeSearchField | //UIASearchBar");
					driver.findElementByXPath("//*[@label=\"Safari Suggestions\"]").click();
				} catch (NoSuchElementException e1) {

					System.out.println("no such element found");
				}

				if(deviceInfo(driver, "model").contains("iPad")){

					driver.findElementByXPath("//UIAButton[@label=\"Search\"]").click();

				}
			}

			else{

				try {
					scrolltoXPath(driver,"//*[@label='Search']");
					driver.findElementByXPath("(//*[@label='Safari' and @visible='true'])[2]").click();
				} catch (NoSuchElementException e1) {

					System.out.println("no such element found");
				}

				if(deviceInfo(driver, "model").contains("iPad")){

					driver.findElementByXPath("//UIAButton[@label=\"Search\"]").click();

				}

			}

			Thread.sleep(2000);
			// switchToContext(driver, "WEBVIEW");
		}

		ScrolltoText("Clear History and Website Data", driver);



		//Clear only if Clear History is enabled      
		if( waitForElementToAppear(driver, By.xpath("//XCUIElementTypeCell[@label=\"Clear History and Website Data\" and @enabled=\"true\"]|//UIATableCell[@label=\"Clear History and Website Data\" and @enabled = 'true']"), 5)){

			//Some times Clear History Widget not opened. Checking and trying again if not opened
			if( !waitForElementToAppear(driver, By.xpath("//*[@label=\"Cancel\"]"), 5)){


				driver.findElementByXPath("//*[@value=\"Clear History and Website Data\"]").click();

			}

			driver.findElementByXPath("//*[@label=\"Clear History and Data\"]").click();

			//For IPAD

			if(deviceInfo(driver, "model").contains("iPad")){
				try {
					driver.findElementByXPath("//*[@label=\"Clear\"]").click();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					System.out.println(" no such element found");
				}
			}
		}

		else

			System.out.println("Cache Already Cleared. Nothing to clear");

	}

	public static void processClearing1(AppiumDriver driver, Boolean aLreadyInSafariSetting) throws InterruptedException {

		//skipping if screen already in safari page
		if (aLreadyInSafariSetting == false){

			ScrolltoText("Clear History and Website Data", driver);

			//Clear only if Clear History is enabled      
			if( waitForElementToAppear(driver, By.xpath("//XCUIElementTypeCell[@label=\"Clear History and Website Data\" and @enabled=\"true\"]|//UIATableCell[@label=\"Clear History and Website Data\" and @enabled = 'true']|//*[@value=\"Clear History and Data\"]"), 5)){

				//Some times Clear History Widget not opened. Checking and trying again if not opened
				if(!waitForElementToAppear(driver, By.xpath("//*[@label=\"Cancel\"]"), 5)){


					driver.findElementByXPath("//*[@value=\"Clear History and Website Data\"]").click();

				}
				driver.findElementByXPath("//*[@label=\"Clear History and Data\"]").click();

				//For IPAD
				if(deviceInfo(driver, "model").contains("iPad")){
					try {
						driver.findElementByXPath("//*[@label=\"Clear\"]").click();
					} catch (NoSuchElementException e) {

					}
				}
			}

			else
				System.out.println("Cache Already Cleared. Nothing to clear");
		}
	}

	// ***************************************************************************************************************************************************************************************************************************
	// Launch Application
	public void launchApplication(String url) throws Exception {
		// Launch Browser
		try {
			switchToContext(adriver,"WEBVIEW");
			System.out.println("Launching Browser-------------");

			adriver.get(url);
			Thread.sleep(5000);
			
			adriver.executeScript("mobile:screen:image");

		} catch (Exception e) {
			// TODO: handle exception

			// reportiumClient.stepEnd();
			e.printStackTrace();

		}
	}


	public void Menubutton() throws Exception
	{
		if(Constants.PM_DEVICEType.equalsIgnoreCase("Android"))
		{
			clickUsingJs(Vype_CommonXpath.btnmenu, "Menu");

		}
		if(Constants.PM_DEVICEType.equalsIgnoreCase("IOS"))
		{
			IOSMenu();
		}

	}
	public void IOSMenu() throws Exception
	{
		//Iphone 11

		if(Constants.PM_DEVICEID.equalsIgnoreCase("00008030-00052C892190402E"))
		{
			
			
			
			
			String Exception ="";

			try{
				
				Map<String, Object> params = new HashMap<>();
				params.put("label", "PUBLIC:Apple_iPhone-11_220907_114504.png");
				params.put("threshold", 80);
				adriver.executeScript("mobile:button-image:click", params);



			}
			catch(Exception e)
			{
				System.out.println("Exception");
				Exception="e";
			}
			if(Exception.equals("e"))
			{

				Map<String, Object> params = new HashMap<>();
				params.put("label", "PUBLIC:Apple_iPhone-11_220907_113550.png");
				params.put("threshold", 80);
				adriver.executeScript("mobile:button-image:click", params);

				


			}

		}

		//iphone 6 plus
		if(Constants.PM_DEVICEID.equalsIgnoreCase("D9FBD36CA9547EA8DD5A8CC70F37D676188E429D"))
		{
			Map<String, Object> params = new HashMap<>();
			params.put("label", "PRIVATE:1661424127262_menu11.PNG");
			params.put("threshold", "60");
			params.put("match", "Similar");
			params.put("screen.top", "33%");
			params.put("screen.left", "4%");
			params.put("screen.width", "10%");
			params.put("screen.height", "4%");
			adriver.executeScript("mobile:button-image:click", params);
		}

		//iPhone 7
		if(Constants.PM_DEVICEID.equalsIgnoreCase("43743E300CD30E70762D5663F54624CEDDD1246E"))
		{
			Map<String, Object> params = new HashMap<>();
			params.put("label", "PRIVATE:1661495235244_menu11.PNG");
			params.put("threshold", "60");
			params.put("match", "Similar");
			params.put("screen.top", "34%");
			params.put("screen.left", "5%");
			params.put("screen.width", "9%");
			params.put("screen.height", "6%");
			adriver.executeScript("mobile:button-image:click", params);
		}

		//iPhone 11 pro
		if(Constants.PM_DEVICEID.equalsIgnoreCase("00008030-000661960E41802E"))
		{
			
			String Exception ="";

			try{
				Map<String, Object> params = new HashMap<>();
				params.put("label", "PUBLIC:Apple_iPhone-11_220907_114504.png");
				params.put("threshold", 80);
				adriver.executeScript("mobile:button-image:click", params);


			}
			catch(Exception e)
			{
				System.out.println("Exception");
				Exception="e";
			}
			if(Exception.equals("e"))
			{

				Map<String, Object> params = new HashMap<>();
				params.put("label", "PUBLIC:Apple_iPhone-11_220907_113550.png");
				params.put("threshold", 80);
				adriver.executeScript("mobile:button-image:click", params);


			}


		}

	}
	//set location
	public void SetLocationDevice(String Address) throws InterruptedException {
		try{
			Map<String, Object> params = new HashMap<>();
			params.put("address", Address);
			adriver.executeScript("mobile:location:set", params);
		}

		catch (Exception e) {
			reportiumClient.stepEnd();
			// TODO: handle exception
			e.printStackTrace();
		}
	} 

	//////////////////////////////////////////////
	//Clear cache

	public String getText(By by)
	{
		//Fetch the requested property
		String textProperty = adriver.findElement(by).getText();

		//Return the text data of a web element
		return textProperty;
	}
	public void VerifyObjectisnotdisplayed(By by,String pageName,String data)
	{
		try {
			adriver.findElement(by).isDisplayed();

			reportiumClient.reportiumAssert("Text content is verified", false);
			//reportiumClient.testStop(TestResultFactory.createFailure(data));



		} catch (Exception e) {
			reportiumClient.testStop(TestResultFactory.createSuccess());

		}

	}

	public void waitTillElementPresenceLocated(By by) throws Exception
	{
		try 
		{
			WebDriverWait wait = new WebDriverWait(adriver, 120);
			wait.until(ExpectedConditions.presenceOfElementLocated(by));
		} catch (Exception e) 
		{
			// TODO: handle exception
			reportiumClient.reportiumAssert("Element is not enabled", false);
			e.printStackTrace();
		}
	}
	public void ClickOnOkButton() {
		Map<String, Object> params4 = new HashMap<>();


		params4.put("label","Close");
		params4.put("threshold",90);
		params4.put("ignorecase","case");
		adriver.executeScript("mobile:button-text:click", params4);
		reportiumClient.reportiumAssert("Ok button was clicked", true);



	}
	public String[] fnConvertStringToStringArray(String text)
	{
		String[] str = text.split(",");
		return str;
	}
	public boolean verifyPageByObjects(By by, String elementname, String pageName) throws Exception {
		try {

			WebDriverWait wait = new WebDriverWait(adriver, 120);
			wait.until(ExpectedConditions.visibilityOfElementLocated(by));
			MobileElement e1 = (MobileElement) adriver.findElement(by);
			if (e1.isDisplayed()) {
				reportiumClient.reportiumAssert("Element is displayed on" + pageName, true);
				//File screenshot=rdriver.getScreenshotAs(OutputType.FILE);
				adriver.executeScript("mobile:screen:image");
			} else {
				reportiumClient.reportiumAssert("Element is not displayed on" + pageName, false);

			}
		} catch (Exception e) {
			// TODO: handle exception

			e.printStackTrace();
		}
		return true;
	}
	public void ClearTextField( By by) {
		// TODO Auto-generated method stub
		try
		{
			MobileElement e1 = (MobileElement) adriver.findElement(by);
			if(e1.isDisplayed())
			{
				//Clear the text field
				e1.clear();
				//File screenshot=rdriver.getScreenshotAs(OutputType.FILE);
				adriver.executeScript("mobile:screen:image");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

	public boolean VerifyElementVisible(By by, String elementname) throws Exception 
	{
//		try 
//		{
			//Explicitwait
			
			WebDriverWait wait = new WebDriverWait(adriver, 120);
			wait.until(ExpectedConditions.visibilityOfElementLocated(by));
			MobileElement e1 = (MobileElement) adriver.findElement(by);

			if (e1.isDisplayed()) 
			{
				reportiumClient.reportiumAssert(elementname+" is Visible", true);
				//File screenshot=rdriver.getScreenshotAs(OutputType.FILE);
				//rdriver.executeScript("mobile:screen:image");
				return true;
			} 
			else 
			{
				reportiumClient.reportiumAssert(elementname + " is not Visible", false);	
				return false;
			}

		//} 
		/*catch (Exception e) 
		{
			// TODO: handle exception
			reportiumClient.reportiumAssert("Failed as " + elementname + " Element could not be located", false);
			e.printStackTrace();
		}*/
	}

	public boolean verifyobjectisnotavailable(By by,String elementname){

		List<WebElement> e1 = adriver.findElements(by);
		if (e1.size() == 0)
		{
			reportiumClient.reportiumAssert(elementname + " is not visible", true);
			System.out.println(elementname+" is not visible");
			adriver.executeScript("mobile:screen:image");

			return true;
			

		}

		else
		{
			reportiumClient.reportiumAssert(elementname + " is visible", false);

			System.out.println(elementname+" is visible");
			adriver.executeScript("mobile:screen:image");
			return false;
		}


	} 
	// ********************************************************************************************************************************************
	public void verifyTitle(String Text) throws Exception {
		try {
			if (adriver.getTitle().contains(Text))
				reportiumClient.reportiumAssert("Page Title " + "'" + Text + "'" + " Is Verified", true);
			adriver.executeScript("mobile:screen:image");
		} catch (Exception e) {
			// TODO: handle exception
			reportiumClient.reportiumAssert("Page Title " + "'" + Text + "'" + " Does Not Match", false);
			e.printStackTrace();
		}
	}
	public void SwipeRightToLeft(int count) throws InterruptedException {
		System.out.println("Swipping right to left");
		for (int i = 0; i < count; i++) {
			Map<String, Object> params7 = new HashMap<>();
			params7.put("start", "76%,65%");
			params7.put("end", "25%,75%");
			params7.put("duration", "2");
			adriver.executeScript("mobile:touch:swipe", params7);
		}

	} 

	public void SwipeLeftToRight(int count) throws InterruptedException {
		System.out.println("Swipping  left to right");

		for (int i = 0; i < count; i++) {
			Map<String, Object> params = new HashMap<>();
			params.put("start", "1574,606");
			params.put("end", "885,565");
			params.put("duration", "0");
			adriver.executeScript("mobile:touch:swipe", params);

		}


	} 


	////////////////////////////////////////
	public static void startApp(String appName, AppiumDriver d) {
		Map<String, String> params = new HashMap<String, String>();
		params.put("name", appName);
		d.executeScript("mobile:application:open", params);
	}

	public static void closeApp(String appName, AppiumDriver d) {
		Map<String, String> params = new HashMap<String, String>();
		params.clear();
		params.put("name", appName);
		d.executeScript("mobile:application:close", params);
	}
	////////////////////////////
	public static void scrolltoXPath(AppiumDriver adriver, String xPath) {

		do {
			try {
				adriver.findElement(By.xpath(xPath)).sendKeys("safari");
				break;

			} catch (Exception NoSuchElementException) {

				Map<String, Object> params = new HashMap<>();
				params.put("end", "20%,90%");
				params.put("start", "20%,20%");
				params.put("duration", "2");
				Object res = adriver.executeScript("mobile:touch:swipe", params);

			}

		} while (true);
	}



	//////////
	public static Boolean waitForElementToAppear(AppiumDriver adriver, By selector, long timeOutInSeconds) {

		adriver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);

		//https://stackoverflow.com/questions/7991522/selenium-webdriver-test-if-element-is-present

		try {
			adriver.findElement(selector);
		} catch (Exception e) {
			adriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			return false;
		}
		adriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		return true;
	}

	///////////////////////////
	public static void ScrolltoText(String LabelText, AppiumDriver adriver){

		Map<String, Object> params2 = new HashMap<String, Object>();

		params2.put("content", LabelText);
		params2.put("scrolling", "scroll");
		params2.put("maxscroll", "5");
		params2.put("next", "SWIPE_UP");
		params2.put("words", "words");
		Object result2 = adriver.executeScript("mobile:text:select", params2);

	}

	public static String deviceInfo(AppiumDriver adriver, String deviceProperty){

		Map<String, Object> params = new HashMap<>();
		params.put("property", deviceProperty);
		return (String) adriver.executeScript("mobile:device:info", params);
	}

	////////////////////////////////////////
	public void SwipeAndSearch(By by, String elementname, String data) throws InterruptedException {
		try{
			//Switching to Visual 
			switchToContext(adriver, "VISUAL");
			String findCommand = "mobile:text:find"; // The proprietary function call
			Map<String, Object> params = new HashMap<>();
			params.put("content", data);    // The text we're looking for

			params.put("scrolling", "scroll");  // Add the scroll and search
			params.put("next", "SWIPE_UP");     // Next is mandatory if using scroll and search

			params.put("maxscroll", "20");       // Not mandatory, default is 5
			params.put("threshold", "80");  // Adding threshold 
			adriver.executeScript(findCommand, params); // Calling the script
			switchToContext(adriver, "WEBVIEW");
		}
		catch(Exception e ){
			//reportiumClient.reportiumAssert("SGW content is not verified on" + elementname, false);
			fnFinalBlock();
			e.printStackTrace();
		}
	}

	/////////////////////////////////////////
	public void RotateDevice() throws InterruptedException {
		try{
			Map<String, Object> pars = new HashMap<>();
			pars.put("state", "portrait");
			String reStr = (String) adriver.executeScript("mobile:device:rotate", pars);
		}

		catch (Exception e) {
			reportiumClient.stepEnd();
			// TODO: handle exception
			e.printStackTrace();
		}
	}


	/////////////////////////////////////////
	public void RotateDeviceLandscape() throws InterruptedException {
		try{
			Map<String, Object> pars = new HashMap<>();
			pars.put("state", "landscape");
			adriver.executeScript("mobile:device:rotate", pars);
		}

		catch (Exception e) {
			reportiumClient.stepEnd();
			// TODO: handle exception
			e.printStackTrace();
		}
	}




	// **********************************************************************************************************
	// This function is for verifying text visible on mobile device
	public void verifyTextOnThePage(String pageName, String data) {
		Map<String, Object> params3 = new HashMap<>();

		params3.put("content", data);
		params3.put("threshold", 80);

		System.out.println(">>>>>>data" + data);
		Object result1 = adriver.executeScript("mobile:text:find", params3);
		if (result1.equals("true"))
		{
			reportiumClient.reportiumAssert("Text content is verified", true);
			//File screenshot=rdriver.getScreenshotAs(OutputType.FILE);
			adriver.executeScript("mobile:screen:image");
		}
		else
			reportiumClient.reportiumAssert("Text content is not verified", false);

	}
	public boolean CheckTextOnThePage(String pageName, String data) {

		try
		{
			Map<String, Object> params3 = new HashMap<>();

			params3.put("content", data);
			params3.put("threshold", 80);

			System.out.println(">>>>>>data" + data);


			Object result1 = adriver.executeScript("mobile:text:find", params3);


			if (result1.equals("true"))
			{

				//File screenshot=rdriver.getScreenshotAs(OutputType.FILE);
				adriver.executeScript("mobile:screen:image");
				return true;
			}
			else
			{
				System.out.println("object not found");
				return false;
			}
		}
		catch(Exception e)
		{
			System.out.println("object not found");
			return false;
		}
	}
	// **********************************************************************************************************
	// This function is for verifying text visible on mobile device .This
	// function returns boolean value
	public boolean verifyManyTextOnThePage(String pageName, String data) {
		Map<String, Object> params3 = new HashMap<>();

		params3.put("content", data);
		System.out.println(">>>>>>data" + data);
		Object result1 = adriver.executeScript("mobile:text:find", params3);
		if (result1.equals("true"))
		{
			//File screenshot=rdriver.getScreenshotAs(OutputType.FILE);
			adriver.executeScript("mobile:screen:image");
			return true;
		}

		else
			return false;

	}

	// **********************************************************************************************************************************************************
	// Swipping o bottom of the screen

	// Swipping to bottom of the screen

	public void SwipeDown(int count) throws InterruptedException {
		for (int i = 0; i < count; i++) {
			Map<String, Object> params = new HashMap<>();
			params.put("start", "50%,85%");
			params.put("end", "50%,20%");
			params.put("duration", "3");
			Object res = adriver.executeScript("mobile:touch:swipe", params);
			Thread.sleep(3000);
		}
	}

	public void screenshot(String pageName) throws IOException{
		File scr=rdriver.getScreenshotAs(OutputType.FILE);
		File dest = new File("filePath/" + pageName);

		FileUtils.copyFile(scr, dest);
	}


	// *************************************************************************************************************************************************************************************
	// verification of element is present or not
	public void verifyPageByObject(By by, String elementname, String pageName) throws Exception {
		try {

			WebDriverWait wait = new WebDriverWait(adriver, 120);
			wait.until(ExpectedConditions.visibilityOfElementLocated(by));
			MobileElement e1 = (MobileElement) adriver.findElement(by);
			if (e1.isDisplayed()) {
				reportiumClient.reportiumAssert("Element is displayed on " + pageName, true);
				//File screenshot=rdriver.getScreenshotAs(OutputType.FILE);
				adriver.executeScript("mobile:screen:image");
			} else {
				reportiumClient.reportiumAssert("Element is not displayed on " + pageName, false);

			}
		} catch (Exception e) {
			// TODO: handle exception

			e.printStackTrace();
		}

	}
	public boolean isDisabled(By by, String elementname) //throws IOException 
	{
		// Click Button
		//try {

			WebDriverWait wait = new WebDriverWait(adriver, 120);
			wait.until(ExpectedConditions.visibilityOfElementLocated(by));
			MobileElement e1 = (MobileElement) adriver.findElement(by);
			if (e1.isEnabled()) {
				reportiumClient.reportiumAssert("Element is Disabled", false);

				//File screenshot=rdriver.getScreenshotAs(OutputType.FILE);
				adriver.executeScript("mobile:screen:image");
				return true;
			} else {
				reportiumClient.reportiumAssert("Element is Enabled", true);
				return false;
			//}
		/*} catch (Exception e) {
			// TODO: handle exception

			e.printStackTrace();*/
		}

	}
	public void launchurl(String url) throws Exception {
		// Launch Browser
		try {
			//switchToContext(adriver,"WEBVIEW");
			System.out.println("Launching Browser-------------");
			adriver.get(url);
			Thread.sleep(5000);

			adriver.executeScript("mobile:screen:image");
		} catch (Exception e) {
			// TODO: handle exception
			// reportiumClient.stepEnd();
			e.printStackTrace();
		}
	}
	
	public int ExtractTextFromObjectandReturnValue(By by)
	{
		WebDriverWait wait = new WebDriverWait(adriver, 120);
		wait.until(ExpectedConditions.visibilityOfElementLocated(by));
		MobileElement e1 = (MobileElement) adriver.findElement(by);
		String message = e1.getText();
		int value = Integer.parseInt(message);
		//File screenshot=rdriver.getScreenshotAs(OutputType.FILE);
		adriver.executeScript("mobile:screen:image");
		return value;
	}

	public void waitTillElementEnable(By by) throws Exception{
		try {
			WebDriverWait wait = new WebDriverWait(adriver, 120);
			wait.until(ExpectedConditions.elementToBeClickable(by));
		} catch (Exception e) {
			// TODO: handle exception
			reportiumClient.reportiumAssert("Element is not enabled", false);
			e.printStackTrace();
		}
	}

	// *************************************************************************************************************************************************************************************
	// verification of text is present in textbox or not
	public void verifyTextInTheTextBox(By by, String elementname, String pageName) throws Exception {
		try {

			WebDriverWait wait = new WebDriverWait(adriver, 120);
			wait.until(ExpectedConditions.visibilityOfElementLocated(by));
			MobileElement e1 = (MobileElement) adriver.findElement(by);
			String textInsideInputBox = e1.getAttribute("value");

			if (!textInsideInputBox.isEmpty()) {
				reportiumClient.reportiumAssert("Element is displayed on" + pageName, true);
				//File screenshot=rdriver.getScreenshotAs(OutputType.FILE);
				adriver.executeScript("mobile:screen:image");
			} else {
				reportiumClient.reportiumAssert("Element is not displayed on" + pageName, false);

			}
		} catch (Exception e) {
			// TODO: handle exception

			e.printStackTrace();
		}

	}
	// **************************************************************************************************

	// verification of element is present or not
	public boolean verifyPageByManyObject(By by, String elementname, String pageName) {

		WebDriverWait wait = new WebDriverWait(adriver, 120);
		wait.until(ExpectedConditions.visibilityOfElementLocated(by));
		MobileElement e1 = (MobileElement) adriver.findElement(by);
		if (e1.isDisplayed())
			return true;
		else
			return false;

	}

	// ***************************************************************************************************************************************************************************************************************************
	// Enter Value in edit field
	public void inputText(By by, String elementname, String data) throws Exception {
		try {
			reportiumClient.testStep("Entering " + data + " in " + elementname + " Edit Field");
			System.out.println("Entering " + data + " in " + elementname + " Edit Field");
			WebDriverWait wait = new WebDriverWait(adriver, 120);
			wait.until(ExpectedConditions.visibilityOfElementLocated(by));
			MobileElement e1 = (MobileElement) adriver.findElement(by);
			if (e1.isDisplayed()) {
				e1.click();
				e1.clear();
				e1.sendKeys(data);
				//File screenshot=rdriver.getScreenshotAs(OutputType.FILE);
				adriver.executeScript("mobile:screen:image");
				//rdriver.executeScript("mobile:screen:image");

			}
		} catch (Exception e) {
			// TODO: handle exception
			reportiumClient.stepEnd();
			e.printStackTrace();
		}
	}


	// *****************************************************************************************************************
	public void TypeAndHitEnterText(By by, String elementname, String data) throws Exception {
		try {
			reportiumClient.testStep("Entering " + data + " in " + elementname + " Edit Field");
			System.out.println("Entering " + data + " in " + elementname + " Edit Field");
			WebDriverWait wait = new WebDriverWait(adriver, 120);
			wait.until(ExpectedConditions.visibilityOfElementLocated(by));
			MobileElement e1 = (MobileElement) adriver.findElement(by);
			if (e1.isDisplayed()) {
				e1.clear();
				e1.sendKeys(data);
				Thread.sleep(2000);

				e1.sendKeys(Keys.ENTER);
				Thread.sleep(4000);

			}
		} catch (Exception e) {
			// TODO: handle exception
			reportiumClient.stepEnd();
			e.printStackTrace();
		}
	}

	// ********************************************************************************************

	// Clicking back button of mobile device

	@SuppressWarnings("unused")
	public void clickBrowseBack() {
		if (GetPlatformVersion().equalsIgnoreCase("iOS") ){
			System.out.println("hitting device BACK key");
			adriver.navigate().back();

		} else {
			System.out.println("hitting device BACK key");
			/*Map<String, Object> Parms = new HashMap<>();
			Parms.put("keySequence", "BACK");
			rdriver.executeScript("mobile:presskey", Parms);*/
			Map<String, Object> params = new HashMap<>();
			params.put("target", "back");
			String res = (String) adriver.executeScript("mobile:browser:navigate", params);


		}
	}
	public void ClosetabAndroid() {
		Map<String, Object> params = new HashMap<>();
		params.put("keySequence", "BACK");
		adriver.executeScript("mobile:presskey", params);
	}
	// ***************************************************************************************************************************************************************************************************************************
	// Click Button
	public void clickbutton(By by, String elementname) throws IOException {
		// Click Button
		try {
			reportiumClient.testStep("Clicking " + elementname + " button");

			System.out.println("Clicking " + elementname + " button");
			WebDriverWait wait = new WebDriverWait(adriver, 120);
			wait.until(ExpectedConditions.visibilityOfElementLocated(by));
			MobileElement e1 = (MobileElement) adriver.findElement(by);
			if (e1.isDisplayed()) {
				e1.click();
				Thread.sleep(2000);
				//File screenshot=rdriver.getScreenshotAs(OutputType.FILE);
				//rdriver.executeScript("mobile:screen:image");
				//rdriver.executeScript("mobile:screen:image");
			}
		} catch (Exception e) {
			// TODO: handle exception
			reportiumClient.stepEnd();
			e.printStackTrace();
		}
	}
	public void dropdown(By by,String flavor)
	{
		MobileElement e1 = (MobileElement) adriver.findElement(by);
		List<MobileElement> options = e1.findElements(By.tagName("option"));
		for (WebElement option : options)
		{
			System.out.println(options);
			if(flavor.equals(option.getText()))
			{
				option.click();
				break;
			}



		}
	}

	public boolean fnIsSelected(By by, String elementname) throws IOException {
		// Click Button
		try 
		{
			@SuppressWarnings("unused")
			JavascriptExecutor js = (JavascriptExecutor) adriver;
			WebDriverWait wait = new WebDriverWait(adriver, 20);
			wait.until(ExpectedConditions.visibilityOfElementLocated(by));
			MobileElement e1 = (MobileElement) adriver.findElement(by);
			if (e1.isDisplayed()) 
			{
				if (e1.isSelected()) 
				{
					reportiumClient.reportiumAssert("Element is Enabled", true);
					clickUsingJs(by, elementname);
					Thread.sleep(3000);
				} 

			}
			return true;
		} 
		catch (Exception e) 
		{
			// TODO: handle exception

			e.printStackTrace();
			return false;
		}

	} 
	public void fnclick_Selenium(By by)throws Exception {
		try 
		{
			adriver.findElement(by).click();

			reportiumClient.reportiumAssert("Verify Click function", true);
		}

		catch (Exception e) 
		{
			// TODO: handle exception
			reportiumClient.reportiumAssert("Error : On Click function", false);
			e.printStackTrace();
		}


	}
	public void frameByelement(By by) throws Exception 
	{
		try 
		{

			MobileElement e1 = (MobileElement) adriver.findElement(by);
			adriver.switchTo().frame(e1);
			Thread.sleep(2000);
			reportiumClient.reportiumAssert( " Element Switched to frame", true);

		} 
		catch (Exception e) 
		{
			// TODO: handle exception
			reportiumClient.reportiumAssert("Element is not in frame", false);
			e.printStackTrace();
		}
	}
	public void inputText_Frame(By by, String elementname, String data) throws Exception 
	{
		try 
		{
			WebDriverWait wait = new WebDriverWait(adriver, 45);
			wait.until(ExpectedConditions.visibilityOfElementLocated(by));
			MobileElement e1 = (MobileElement) adriver.findElement(by);
			if (e1.isDisplayed()) 
			{
				e1.click();
				e1.clear();
				e1.sendKeys(data);
				reportiumClient.reportiumAssert("Input Text Added", true);

			}
		} 
		catch (Exception e) 
		{
			// TODO: handle exception
			//test
			reportiumClient.reportiumAssert("Failed to add text", false);
			e.printStackTrace();;
		}
	}
	public void switchDefault() throws Exception 
	{

		// Switch Default Window
		try 
		{
			adriver.switchTo().defaultContent();
			Thread.sleep(5000);
			reportiumClient.reportiumAssert("Switched to default content", true);
		} 
		catch (Exception e)
		{
			// TODO: handle exception
			reportiumClient.reportiumAssert("Element not Switched to default content", false);
			e.printStackTrace();
		}
	}
	public void selectByValue(By by, String elementname, String data) throws Exception 
	{
		try 
		{
			WebDriverWait wait = new WebDriverWait(adriver, 30);
			wait.until(ExpectedConditions.visibilityOfElementLocated(by));
			//wait.until(ExpectedConditions.elementToBeSelected(by));
			MobileElement e1 = (MobileElement) adriver.findElement(by);
			if (e1.isDisplayed()) 
			{
				Select se = new Select(e1);
				se.selectByVisibleText(data.trim());
				reportiumClient.reportiumAssert(elementname+" is selected", true);
			}
		}
		catch (Exception e) 
		{
			// TODO: handle exception
			reportiumClient.reportiumAssert(elementname+" is selected", false);
			e.printStackTrace();
		}
	}
	public void clickUsingJs(By by, String elementname) throws Exception 
	{
		try 
		{

			MobileElement e1 = (MobileElement) adriver.findElement(by);

			JavascriptExecutor executor = (JavascriptExecutor)adriver;
			executor.executeScript("arguments[0].click();", e1);
			adriver.executeScript("mobile:screen:image");
		} 
		catch (Exception e) 
		{
			// TODO: handle exception/
			reportiumClient.stepEnd();
			e.printStackTrace();
		}
	}
	//Added by Sandeepa
	public void EnterText(String txt)throws IOException{
		try
		{
			System.out.println("EnterText " + txt);
			Map<String, Object> params = new HashMap<>();
			params.put("label", "Text");
			// params.put("text", "alva.white36@bat.com");
			params.put("text", txt);
			params.put("operation", "single");
			System.out.println("EnterText1" );
			rdriver.executeScript("mobile:edit-text:set", params);
			System.out.println("EnterText2" );
		}catch (Exception e) {
			// TODO: handle exception
			reportiumClient.stepEnd();
			e.printStackTrace();
		}

	}
	//Find Elements
	public List<WebElement> findElementsList(By by){
		return adriver.findElements(by);
	}
	public void fnHidekeyboard()
	{
		Map<String,Object> param = new HashMap<>();
		param.put("keySequence", "HIDE_KEYBOARD ");
		adriver.executeScript("mobile:presskey", param);
	}




	//platform version
	public String GetPlatformVersion()
	{
		Map params = new HashMap<>();  
		params.put("property", "os");  
		String DeviceOS = (String) adriver.executeScript("mobile:handset:info", params);  
		return DeviceOS;
	}
	public void VerifyElementsVisible(By by, String elementname) throws Exception 
	{
		try 
		{
			//Explicitwait
			//WebDriverWait wait = new WebDriverWait(rdriver, 120);
			//wait.until(ExpectedConditions.visibilityOfElementLocated(by));
			
			MobileElement e1 = (MobileElement) adriver.findElement(by);
			

			if (e1.isDisplayed()) 
			{
				reportiumClient.reportiumAssert(elementname+" is Visible", true);
				//File Screenshot=rdriver.getScreenshotAs(OutputType.FILE);
				adriver.executeScript("mobile:screen:image");
			} 
			else 
			{
				reportiumClient.reportiumAssert(elementname + " is not Visible", false);     
			}

		} 
		catch (Exception e) 
		{
			// TODO: handle exception
			reportiumClient.reportiumAssert("Failed as " + elementname + " Element could not be located", false);
			e.printStackTrace();
		}
	}

	//tapping on the video screen
	public void TapScreen()
	{

		Map<String, Object> params = new HashMap<>();
		params.put("location", "20%,27%,20%,65%");
		Object res = adriver.executeScript("mobile:touch:tap", params);
		//File Screenshots=rdriver.getScreenshotAs(OutputType.FILE);
		adriver.executeScript("mobile:screen:image");
	}
	// ***************************************************************************************************************************************************************************************************************************
	// Click Link
	public void clickLink(By by, String elementname) throws IOException {
		try {

			reportiumClient.testStep("Clicking " + elementname + " Link");
			System.out.println("Clicking " + elementname + " Link");
			WebDriverWait wait = new WebDriverWait(adriver, 60);

			wait.until(ExpectedConditions.visibilityOfElementLocated(by));
			MobileElement e1 = (MobileElement) adriver.findElement(by);
			if (e1.isDisplayed()) {
				e1.click();
				//File screenshot=rdriver.getScreenshotAs(OutputType.FILE);
				adriver.executeScript("mobile:screen:image");

			}
		} catch (Exception e) {
			reportiumClient.stepEnd();
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	// ***************************************************************************************************************************************************************************************************************************
	// Click Link by name

	public void clickLinkbyName(String data) throws IOException {
		try {
			reportiumClient.testStep("Clicking " + data + " Link");
			System.out.println("Clicking " + data + " Link");
			Thread.sleep(2000);
			adriver.findElement(By.partialLinkText(data)).click();

		} catch (Exception e) {
			reportiumClient.stepEnd();
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	// ***************************************************************************************************************************************************************************************************************************
	
	// Swipe Screen
	public void SwipeDownSmallerUnits(int count) throws InterruptedException {
		for (int i = 0; i < count; i++) {
			Map<String, Object> params = new HashMap<>();
			params.put("start", "50%,45%");
			params.put("end", "50%,20%");
			params.put("duration", "3");
			Object res = adriver.executeScript("mobile:touch:swipe", params);
			Thread.sleep(3000);
			/*Dimension dim = rdriver.manage().window().getSize();
		for (int i = 0; i < count; i++) {
			int height = dim.getHeight();
			int width = dim.getWidth();
			int x = width / 2;
			int top_y = (int) (height * 0.45);
			int bottom_y = (int) (height * 0.20);
			System.out.println("coordinates :" + x + "  " + top_y + " " + bottom_y);
			TouchAction ts = new TouchAction((PerformsTouchActions) rdriver);
			ts.press(x, top_y).moveTo(x, bottom_y).release().perform();
			Thread.sleep(3000);*/
			//}
		}
	}
	// Swipe Screen
	public void SwipeUpSmallerUnits(int count) throws InterruptedException {
		for (int i = 0; i < count; i++) {
			Map<String, Object> params = new HashMap<>();
			params.put("start", "50%,20%");
			params.put("end", "50%,45%");
			params.put("duration", "3");
			Object res = adriver.executeScript("mobile:touch:swipe", params);
			Thread.sleep(3000);
			
		}
	}

	// ************************************************************************************************************************************************************************88

	// extract whole content of the page by getPageSource()

	public void verifyTextContent(String text) throws IOException {
		try {

			WebDriverWait wait = new WebDriverWait(adriver, 120);
			

			if (adriver.getPageSource().contains(text)) {
				reportiumClient.reportiumAssert("Text content is verified>>>>new fn", true);
				System.out.println(">>>>>>>>Text is verified");
				//File screenshot=rdriver.getScreenshotAs(OutputType.FILE);
				adriver.executeScript("mobile:screen:image");
			} else {
				reportiumClient.reportiumAssert("Text content is not verified>>>new fn", false);
				System.out.println(">>>>>>>>Text is verified");
			}
		} catch (Exception e) {
			// TODO: handle exception

			e.printStackTrace();
		}
	}

	// ***************************************************************************************************************************************************************************************************************************
	// Element is enabled
	public boolean isEnabled(By by, String elementname) //throws IOException 
	{
		// Click Button
		//try {

			WebDriverWait wait = new WebDriverWait(adriver, 120);
			wait.until(ExpectedConditions.visibilityOfElementLocated(by));
			MobileElement e1 = (MobileElement) adriver.findElement(by);
			if (e1.isEnabled()) {
				reportiumClient.reportiumAssert("Element is Enabled", true);
				//File screenshot=rdriver.getScreenshotAs(OutputType.FILE);
				adriver.executeScript("mobile:screen:image");
				return true;
			} else {
				reportiumClient.reportiumAssert("Element is Disabled", false);
				
				return false;

			}
		/*} catch (Exception e) {
			// TODO: handle exception

			e.printStackTrace();
		}*/

	}
	

	// *********************************************************************************************************************************************************
	// Extract text from Webelement

	public boolean ExtractTextFromObject(By by, String pageName, String data) {
		WebDriverWait wait = new WebDriverWait(adriver, 120);
		wait.until(ExpectedConditions.visibilityOfElementLocated(by));
		MobileElement e1 = (MobileElement) adriver.findElement(by);
		String message = e1.getText().replace("\n", " ");
		reportiumClient.reportiumAssert( message , true);
		System.out.println(">>>>>" + message + ">>>>>");
		if (message.equalsIgnoreCase(data)) {

			reportiumClient.reportiumAssert("Text content" + data + " is verified on" + pageName, true);
			//File screenshot=rdriver.getScreenshotAs(OutputType.FILE);
			adriver.executeScript("mobile:screen:image");
			return true;

		} else {
			reportiumClient.reportiumAssert("Text content is not verified on" + pageName, false);
			return false;
		}

	}
	boolean testStop_isCalled = false;
	public void fnCatchBlock(Exception e) {

		reportiumClient.testStop(TestResultFactory.createFailure(e.getMessage(), e));
		e.printStackTrace();
		testStop_isCalled = true;
	}


	public void fnFinalBlock() {
		try {
			if(testStop_isCalled==false)

			{
				reportiumClient.testStop(TestResultFactory.createSuccess());
			}
			PerfectoLabUtils.downloadReport(adriver, "pdf", Constants.Report_URL);

			adriver.quit();

			// Retrieve the URL to the DigitalZoom Report (= Reportium
			// Application) for an aggregated view over the execution
			String reportURL = reportiumClient.getReportUrl();
			System.out.println("***reportURL****" + reportURL);
			// Retrieve the URL to the Execution Summary PDF Report

			String reportPdfUrl = (String) (adriver.getCapabilities().getCapability("reportPdfUrl"));
			// For detailed documentation on how to export the Execution
			// Summary PDF Report, the Single Test report and other
			// attachments such as
			// video, images, device logs, vitals and network files - see
			// http://developers.perfectomobile.com/display/PD/Exporting+the+Reports
			System.out.println("***reportPdfUrl****" + reportPdfUrl);
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	public void fnNavigateBack() {
		adriver.navigate().back();

	}


	public boolean verifyobjectisnotavailable(By by){

		List e1 = adriver.findElements(by);
		if (e1.size() == 0)

			return true;
		else
			return false;

	} 
	public String ExtractText(By by)
	{
		WebDriverWait wait = new WebDriverWait(adriver, 120);
		wait.until(ExpectedConditions.visibilityOfElementLocated(by));
		String message=adriver.findElement(by).getText();

		reportiumClient.reportiumAssert("Element is displayed",true);
		adriver.executeScript("mobile:screen:image");
		return message;

	}


	public void LogResult(boolean result, String Message)
	{
		if (result == true)
		{
			reportiumClient.reportiumAssert( Message , true);
		}
		else
		{
			reportiumClient.reportiumAssert( Message, false);
		}
	}
	// *****************************************************************************************************************************************************************

	// To extract text from image

	public void ExtractTextFromImageObject(By by, String pageName, String data) {

		Map<String, Object> params = new HashMap<>();
		params.put("content", data);
		params.put("threshold", 80);
		// params.put("imageBounds.needleBound", 30);
		String extracted_screen_text = (String) adriver.executeScript("mobile:checkpoint:text", params);

		if (extracted_screen_text.equalsIgnoreCase("true")) {
			reportiumClient.reportiumAssert("SGW content" + data + " is verified on" + pageName, true);
			//File screenshot=rdriver.getScreenshotAs(OutputType.FILE);
			adriver.executeScript("mobile:screen:image");
		} else {
			WebDriverWait wait = new WebDriverWait(adriver, 120);
			wait.until(ExpectedConditions.visibilityOfElementLocated(by));
			MobileElement e1 = (MobileElement) adriver.findElement(by);
			String extractedMessage = e1.getAttribute("alt");
			if (extractedMessage.equalsIgnoreCase(data)) {
				reportiumClient.reportiumAssert("SGW content" + data + " is verified on" + pageName, true);
			} else {
				reportiumClient.reportiumAssert("SGW content is not verified on" + pageName, false);
			}
		}

	}
	///
	public void ExtractTextFromImageObjects(By by, String pageName, String data) {

		WebDriverWait wait = new WebDriverWait(adriver, 120);
		wait.until(ExpectedConditions.visibilityOfElementLocated(by));
		MobileElement e1 = (MobileElement) adriver.findElement(by);
		String extractedMessage = e1.getAttribute("alt");
		if (extractedMessage.equalsIgnoreCase(data)) {
			reportiumClient.reportiumAssert("SGW content" + data + " is verified on" + pageName, true);
		} else {
			Map<String, Object> params = new HashMap<>();
			params.put("content", data);
			params.put("threshold", 80);
			// params.put("imageBounds.needleBound", 30);
			String extracted_screen_text = (String) adriver.executeScript("mobile:checkpoint:text", params);

			if (extracted_screen_text.equalsIgnoreCase("true")) {
				reportiumClient.reportiumAssert("SGW content" + data + " is verified on" + pageName, true);
				//File screenshot=rdriver.getScreenshotAs(OutputType.FILE);
				adriver.executeScript("mobile:screen:image");

			} else {
				reportiumClient.reportiumAssert("SGW content is not verified on" + pageName, false);
			}
		}

	}

	// ************************************************************************************************************************************************************
	// Get Attribute Value function - To retrive text from properties
	// @11/23/2018

	public void ExtractAttributeValue(By by, String pageName, String data, String attributeValue) {
		try {
			WebDriverWait wait = new WebDriverWait(adriver, 120);
			wait.until(ExpectedConditions.visibilityOfElementLocated(by));
			MobileElement e1 = (MobileElement) adriver.findElement(by);
			String message = e1.getAttribute(attributeValue).replace("\n", " ");
			System.out.println(">>>>>" + message + "<<<<<");
			if (message.equalsIgnoreCase(data)) {
				reportiumClient.reportiumAssert("Text content" + data + " is verified on" + pageName, true);
				System.out.println(message);
				//File screenshot=rdriver.getScreenshotAs(OutputType.FILE);
				adriver.executeScript("mobile:screen:image");
			} else {
				reportiumClient.reportiumAssert("Text content is not verified on" + pageName, false);
				System.out.println("text is not displayed");
			}

		} catch (Exception e) {
			// TODO: handle exception
			reportiumClient.reportiumAssert("Something Went Wrong", false);
			e.printStackTrace();
		}
	}

	// Get current date
	public String getCurrentDate(String dateFormat) 
	{
		// Create object of SimpleDateFormat class and decide the format
		// Date format - MM/dd/yyyy or M/d/yyyy
		DateFormat dateformat = new SimpleDateFormat(dateFormat);
		//get current date time with Date()
		Date date = new Date();
		// Now format the date
		String formatedDate = dateformat.format(date);
		//return formated date
		return formatedDate;
	}


	// ****************************************************************************************************************************************************
	public String fnGetAttributeValue(By by, String AttributeName) throws IOException {
		return adriver.findElement(by).getAttribute(AttributeName);

	}

	// **************************************************************************************************************************************************
	// *****************************************************************************************************************************
	public void CompareValue(String validstring1, String validstring2) {
		try {
			if (validstring1.equalsIgnoreCase(validstring2)) {
				// Log
				reportiumClient.reportiumAssert("Text is matched", true);
				//File screenshot=rdriver.getScreenshotAs(OutputType.FILE);
				adriver.executeScript("mobile:screen:image");

			} else {

				reportiumClient.reportiumAssert("Text is not matched", false);

			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	// **********************************************************************************************************************************************************************
	// Refresh the page
	public void RefreshPage() {
		adriver.navigate().refresh();
	}

	// *************************************************************************************************************************************
	public void FnAllowPopUp(String data) {
		Map<String, Object> params = new HashMap<>();
		params.put("label", data);
		params.put("threshold", 90);
		params.put("ignorecase", "case");
		adriver.executeScript("mobile:button-text:click", params);
		reportiumClient.reportiumAssert("Ok button was clicked", true);
		//File screenshot=rdriver.getScreenshotAs(OutputType.FILE);
		adriver.executeScript("mobile:screen:image");

	}

	// ****************************************************************************************************************************************************************
	public void FnAllowPopUp() {
		Map<String, Object> params4 = new HashMap<>();

		if (GetPlatformVersion().equalsIgnoreCase("IOS")) {
			params4.put("label", "Close");
			params4.put("threshold", 90);
			params4.put("ignorecase", "case");
			adriver.executeScript("mobile:button-text:click", params4);

			reportiumClient.reportiumAssert("Close button was clicked", true);
			//File screenshot=rdriver.getScreenshotAs(OutputType.FILE);
			adriver.executeScript("mobile:screen:image");
		} else {
			params4.put("label", "OK");
			params4.put("threshold", 90);
			params4.put("ignorecase", "case");
			adriver.executeScript("mobile:button-text:click", params4);
			reportiumClient.reportiumAssert("Ok button was clicked", true);
			adriver.executeScript("mobile:screen:image");
		}
	}

	////
	// ********************************************************************************
	public void switchToContext(String context) {
		RemoteExecuteMethod executeMethod = new RemoteExecuteMethod(adriver);
		Map<String, String> params = new HashMap<>();
		params.put("name", context);
		executeMethod.execute(DriverCommand.SWITCH_TO_CONTEXT, params);
	}

	public String getCurrentContextHandle() {
		RemoteExecuteMethod executeMethod = new RemoteExecuteMethod(adriver);
		String context = (String) executeMethod.execute(DriverCommand.GET_CURRENT_CONTEXT_HANDLE, null);
		return context;
	}

	public List<String> getContextHandles() {
		RemoteExecuteMethod executeMethod = new RemoteExecuteMethod(adriver);
		List<String> contexts = (List<String>) executeMethod.execute(DriverCommand.GET_CONTEXT_HANDLES, null);
		return contexts;
	}

	public void switchToContext(AppiumDriver adriver, String context) {
		RemoteExecuteMethod executeMethod = new RemoteExecuteMethod(adriver);
		Map<String, String> params = new HashMap<String, String>();
		params.put("name", context);
		executeMethod.execute(DriverCommand.SWITCH_TO_CONTEXT, params);
	}
	// ************************************************************************************************************************************************************

	// Close Tab
	public void closeTab(By by, String context) throws Exception {
		try {
			// Switch to context
			switchToContext(context);

			// Perform Click action on the native element
			MobileElement nativeE1 = (MobileElement)adriver.findElement(by);

			//	if ( rdriver.getContext().contains("NATIVE_APP")) {
			// Click the button
			nativeE1.click();
			//}

			// horizontal swipe
			// Horizontal swipe function - code

			// switchToContent - webView
			switchToContext("WEBVIEW");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//
	public boolean ScrollByxpath(By by ) 
	{
		try{
			WebDriverWait wait = new WebDriverWait(adriver, 6);
			wait.until(ExpectedConditions.elementToBeClickable(by));
			WebElement e1 = adriver.findElement(by);
			JavascriptExecutor js = (JavascriptExecutor) adriver;
			js.executeScript("arguments[0].scrollIntoView();", e1);
			return true;
		}
		catch (Exception e){
			return false;
		}
	}
	public boolean ScrolltoBottomofthepage( ) 
	{
		try{

			JavascriptExecutor js = (JavascriptExecutor) adriver;
			js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			Thread.sleep(10000);
			return true;
		}
		catch (Exception e){
			return false;
		}
	}
	public boolean ScrolltoTopofthepage( ) 
	{
		try{

			JavascriptExecutor js = (JavascriptExecutor) adriver;
			js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
			Thread.sleep(10000);
			return true;
		}
		catch (Exception e){
			return false;
		}
	}



	// ****************************************************************************************
	public void ClickUsingOCR(String data) {
		Map<String, Object> params = new HashMap<>();
		params.put("label", data);
		params.put("threshold", 70);
		params.put("ignorecase", "case");
		adriver.executeScript("mobile:button-text:click", params);
		
		adriver.executeScript("mobile:screen:image");
		reportiumClient.reportiumAssert(data + " was clicked", true);


	}
	public  void fnLocationAccess()
	{
		if(CheckTextOnThePage("Location Access", "Would Like To"))
		{    
			ClickUsingOCR("OK");
		}

	}

	// verification of element is present or not and return boolean values
	public boolean VerifyPageByObject(By by, String elementname, String pageName) {

		Boolean isElementPresent;
		try {
			WebDriverWait wait = new WebDriverWait(adriver, 120);
			wait.until(ExpectedConditions.visibilityOfElementLocated(by));
			MobileElement e1 = (MobileElement) adriver.findElement(by);

			isElementPresent = e1.isDisplayed();
			if (isElementPresent) {
				reportiumClient.reportiumAssert("Element is displayed on" + pageName, true);
				//File screenshot=rdriver.getScreenshotAs(OutputType.FILE);
				adriver.executeScript("mobile:screen:image");
				return isElementPresent;

			} else {
				reportiumClient.reportiumAssert("Element is not displayed on" + pageName, false);
				return isElementPresent;
			}

		} catch (Exception e) {
			isElementPresent = false;
			System.out.println(e.getMessage());
			return isElementPresent;

		}

	}
	
	//
	public boolean isAlertPresent(){
		boolean foundAlert=false;

		WebDriverWait wait= new WebDriverWait (adriver,10);
		try{
			adriver.executeScript("Alert(\"Perfecto Mobile\"Allow") ; 
			foundAlert=true;
		}
		catch(Exception e){
			System.out.println("Alert is not present");
		}
		return foundAlert;


	} 
	//



	//
	public boolean VerifyPageObject(By by, String pageName) {

		Boolean isElementPresent=true;
		try {
			WebDriverWait wait = new WebDriverWait(adriver, 120);
			wait.until(ExpectedConditions.visibilityOfElementLocated(by));
			MobileElement e1 = (MobileElement) adriver.findElement(by);

			isElementPresent = e1.isDisplayed();
			if (isElementPresent) {
				reportiumClient.reportiumAssert("Element is displayed on" + pageName, true);
				//File screenshot=rdriver.getScreenshotAs(OutputType.FILE);
				adriver.executeScript("mobile:screen:image");
				return isElementPresent;
			} 

		} catch (Exception e) {
			isElementPresent = false;
			System.out.println("Proceeding with else block");
			return isElementPresent;

		}
		return isElementPresent;

	}
	//////////////////////////
	public void ClickUsingImage(String image) throws InterruptedException
	{
		Map<String, Object> params = new HashMap();
		params.put("label", "PUBLIC:"+image);
		params.put("timeout", "20");
		params.put("threshold", "80");
		params.put("match", "bounded");
		params.put("imageBounds.needleBound", "30");
		adriver.executeScript("mobile:button-image:click", params);
		Thread.sleep(3000);
	}

	// Image size validiaton - added - 10/23/2018 - by Suneel Kaushik Subramanya
	public void imageSizeValidation(By by, int imageWidth, int imageHeight) throws Exception {
		// Gather image data
		MobileElement Image = (MobileElement) adriver.findElement(by);

		// Get the image size
		int actual_image_width = Image.getSize().getWidth();
		// Retrieve height of element.
		int actual_image_height = Image.getSize().getHeight();

		try {
			if ((actual_image_width == imageWidth) && (actual_image_height == imageHeight)) {

				reportiumClient.reportiumAssert("Size Validation Successfull with values " + imageWidth + +imageHeight,
						true);
				
				adriver.executeScript("mobile:screen:image");
			} else {
				reportiumClient.reportiumAssert("Size Validation is unsuccessfull.", false);
			}
		} catch (Exception e) {
			// TODO: handle exception

			e.printStackTrace();
		}
	}



	public void fnBrowserBack() throws InterruptedException {
		adriver.navigate().back();
		Thread.sleep(10000);
	}

	// Content Validation through object - added @ 11/13/2018
	public void verifyTextContent(String data, By by) throws Exception {
		try {

			WebDriverWait wait = new WebDriverWait(adriver, 120);
			MobileElement e1 = (MobileElement) adriver.findElement(by);
			if (e1.isDisplayed()) {
				String actualString = e1.getText().trim();
				Assert.assertEquals(actualString, data.trim());
				System.out.println(">>>>>>>" + actualString + ">>>>>>");
				reportiumClient.reportiumAssert("Text content is verified>>>>new fn", true);
				System.out.println(">>>>>>>>Text is not verified");
			} else {
				reportiumClient.reportiumAssert("Text content is not verified>>>new fn", false);
				System.out.println(">>>>>>>>Text is not verified");
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	//*************************************
	public void VerifyTextUsingOCR(String data, String pageName) {

		Map<String, Object> params = new HashMap<>();
		//params.put("context", "body");
		params.put("content", data);
		params.put("threshold", 80);
		String res = (String) adriver.executeScript("mobile:text:find", params);
		if (res.equals("true"))
			reportiumClient.reportiumAssert("Text content"+data+" is verified on "+pageName, true);
		else
			reportiumClient.reportiumAssert("Text content is not verified"+pageName, false);

	}


	// ******************************************************************************************************************************************************************
	// Password encryption
	public void fnPasswordEncryption(String data, By by) {
		try {
			String encryptedPasswordByBytes = Base64.getEncoder().encodeToString(data.getBytes());
			reportiumClient.testStep("Entering " + encryptedPasswordByBytes + " in Password Edit Field");
			System.out.println("Entering " + encryptedPasswordByBytes + " in Password Edit Field");

			WebDriverWait wait = new WebDriverWait(adriver, 120);
			wait.until(ExpectedConditions.visibilityOfElementLocated(by));
			MobileElement e1 = (MobileElement) adriver.findElement(by);
			if (e1.isDisplayed()) {
				e1.click();
				e1.clear();
				e1.sendKeys(data);
				//File screenshot=rdriver.getScreenshotAs(OutputType.FILE);
				adriver.executeScript("mobile:screen:image");

			}
		} catch (Exception e) {
			// TODO: handle exception
			reportiumClient.stepEnd();
			e.printStackTrace();
		}

	}
	public void ExtractTextOCR(String pageName, String data) {

		Map<String, Object> params = new HashMap<>();
		params.put("content", data);
		params.put("threshold", 80);
		// params.put("imageBounds.needleBound", 30);
		String extracted_screen_text = (String) adriver.executeScript("mobile:checkpoint:text", params);

		if (extracted_screen_text.equalsIgnoreCase("true")) {
			reportiumClient.reportiumAssert("Text content" + data + " is verified on" + pageName, true);
		} else {


			reportiumClient.reportiumAssert("Text content is not verified on" + pageName, false);
		}
	}



	public void fnClickUsingNativeElements(By by, String tab_heading) throws Exception
	{
		try
		{
			//Switch to context
			switchToContext("NATIVE_APP");

			//Perform Click action on the native element
			MobileElement nativeE1 = (MobileElement) adriver.findElement(by);
			nativeE1.click();
			/*//if((rdriver.getContext()).contains("NATIVE_APP"))
                  {
                        //Click using OCR
                        //ClickUsingOCR(tab_heading);
                  }*/
			//switchToContent - webView
			switchToContext("WEBVIEW");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	public void fnFailiureMsg(String data) {
		reportiumClient.testStep(data);

	}


	public String[] fnConvertStringToStringArrayNewline(String text)
	{
		String[] str = text.split("\\r\\n|\\n|\\r");

		return str;
	}


	public String getCurrentUrl() throws IOException 
	{
		return adriver.getCurrentUrl();
	}

	public void fnContentValidation(String data, By by) throws Exception {
		try {
			WebElement e1 = adriver.findElement(by);
			if (e1.isDisplayed()) {
				String actualString = e1.getText().trim().replace("\n", "").replace(" ", "");
				data = data.trim().replace("\n", "").replace(" ", "");
				boolean ActualString = actualString.equalsIgnoreCase(data);
				System.out.println(">>>>>>>" + actualString + ">>>>>>");
				if (ActualString) {
					reportiumClient.reportiumAssert("'" + data + "'" + " Content validated successfully", true);
					adriver.executeScript("mobile:screen:image");
				} else {
					reportiumClient.reportiumAssert("'" + data + "'" + " Content validation failed", false);
				}
			}
		}
		catch (Exception e) {
			// TODO: handle exception
			reportiumClient.reportiumAssert("'" + data + "'" + " Exception: Content validation failed", false);
			e.printStackTrace();
		}
	}

	public void VerifyElementNotVisible(By by, String string) {
		try
		{
			WebElement e1 = adriver.findElement(by);
			if (!e1.isDisplayed()) 
			{
				System.out.println(" Element Is Not Visible");

			}
		}
		catch (Exception e) 
		{
			System.out.println(" Element Is Visible");
		}

	}

	public void ClearText(By by, String elementname) throws Exception {
		try {
			WebElement e1 = adriver.findElement(by);
			if (e1.isDisplayed()) {
				Actions actions = new Actions(adriver);
				actions.moveToElement(e1).click().build().perform();
				//actions.sendKeys();
				e1.sendKeys(Keys.CONTROL,"a",Keys.DELETE);
				reportiumClient.reportiumAssert("Cleared " + elementname + " Field Successfully.", true);
			}
		} catch (Exception e) {
			// TODO: handle exception
			reportiumClient.reportiumAssert("Failed To Clear " + elementname + " Field.", false);
			e.printStackTrace();
		}
	}
	// ********************************************************************************************************************************************
	public boolean isObjectPresent(By by, String elementname) {
		boolean foundObject = false;



		try {
			adriver.findElement(by).isDisplayed();
			foundObject = true;
		} catch (Exception e) {
			System.out.println(elementname + " is not present");
		}
		return foundObject;



	}


	// ------------------------------------Enter Value in edit field  entering usernames and text fields


	public void inputTextjavaScriptSendkeys(RemoteWebDriver driver, By by, String text) throws Exception {
		try {
			reportiumClient.testStep("Entering " + text+ " in Edit field");
			System.out.println("Entering " + text+ " in Edit field");
			WebDriverWait wait = new WebDriverWait(driver, 120);
			wait.until(ExpectedConditions.visibilityOfElementLocated(by));
			WebElement e1 = driver.findElement(by);
			if (e1.isDisplayed()) {
				String jsScript = "let input = arguments[0]; \r\n" + "let lastValue = input.value;\r\n"
						+ "input.value = arguments[1];\r\n" + "let event = new Event('input', { bubbles: true });\r\n"
						+ "event.simulated = true;\r\n"
						+ "let tracker = input._valueTracker;\r\n" + "if (tracker) {\r\n" + "  tracker.setValue(lastValue);\r\n"
						+ "}\r\n" + "input.dispatchEvent(event);";
			driver.executeScript(jsScript, e1, text);

			}
		} catch (Exception e) {
			// TODO: handle exception
			reportiumClient.stepEnd();
			e.printStackTrace();
		}
	}

	public void inputTextjavaScripfnPasswordencryption(RemoteWebDriver driver, By by, String text) throws Exception {
		try {
			String encryptedPasswordByBytes = Base64.getEncoder().encodeToString(text.getBytes());
			reportiumClient.testStep("Entering " + encryptedPasswordByBytes + " in Password Edit Field");
			System.out.println("Entering " + encryptedPasswordByBytes + " in Password Edit Field");
			WebDriverWait wait = new WebDriverWait(driver, 120);
			wait.until(ExpectedConditions.visibilityOfElementLocated(by));
			WebElement e1 = driver.findElement(by);
			if (e1.isDisplayed()) {
				String jsScript = "let input = arguments[0]; \r\n" + "let lastValue = input.value;\r\n"
						+ "input.value = arguments[1];\r\n" + "let event = new Event('input', { bubbles: true });\r\n"
						+ "event.simulated = true;\r\n"
						+ "let tracker = input._valueTracker;\r\n" + "if (tracker) {\r\n" + "  tracker.setValue(lastValue);\r\n"
						+ "}\r\n" + "input.dispatchEvent(event);";
				driver.executeScript(jsScript, e1, text);

			}
		} catch (Exception e) {
			// TODO: handle exception
			reportiumClient.stepEnd();
			e.printStackTrace();
		}
	}

	public void verifyCurrentURLInPage(String url)
    {
        adriver.get(url);
        try
        {

            if (adriver.getCurrentUrl().equalsIgnoreCase(url))
            {



               reportiumClient.reportiumAssert(url +" URL Is Verified", true);
                adriver.executeScript("mobile:screen:image");
            }
        }
        catch(Exception e)
        {
            reportiumClient.reportiumAssert(url + " URL Is not verified", false);
            adriver.executeScript("mobile:screen:image");



       }



   }

	//------------------------------------------------------------
	
	public void HowerMouse(By by, String elementname) throws Exception {
		try {
			WebElement e1 = rdriver.findElement(by);
			if (e1.isDisplayed()) {
				//if (!isSafari) {
				Actions actions = new Actions(rdriver);
				actions.moveToElement(e1).build().perform();

				/*} else {
					String strJavaScript = "var element = arguments[0];"
							+ "var mouseEventObj = document.createEvent('MouseEvents');"
							+ "mouseEventObj.initEvent( 'mouseover', true, true );"
							+ "element.dispatchEvent(mouseEventObj);";

					// Then JavascriptExecutor class is used to execute the
					// script to trigger the dispatched event.
					((JavascriptExecutor) rdriver).executeScript(strJavaScript, e1);
					Thread.sleep(3000);
				}*/
				reportiumClient.reportiumAssert("Successfully Mouseover on " + elementname, true);
			}
		} catch (Exception e) {
			// TODO: handle exception
			reportiumClient.reportiumAssert("Successfully Mouseover on " + elementname, false);
			e.printStackTrace();
		}
	}



}