package com.rai.framework;

import static org.opencv.imgcodecs.Imgcodecs.imwrite;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;


import java.awt.AWTException;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.File;

import java.io.IOException;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;



import org.apache.commons.lang.UnhandledException;

import org.opencv.core.Core;

import org.opencv.core.Mat;
import org.opencv.core.Size;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;
import org.openqa.selenium.remote.internal.OkHttpClient;

import org.openqa.selenium.remote.http.HttpClient.Factory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.InvalidElementStateException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;

import org.openqa.selenium.StaleElementReferenceException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeOptions;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CommandInfo;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.HttpCommandExecutor;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


import com.google.common.base.Function;

import com.itextpdf.text.DocumentException;

import com.perfecto.reportium.client.ReportiumClientFactory;
import com.perfecto.reportium.model.Job;
import com.perfecto.reportium.model.PerfectoExecutionContext;
import com.perfecto.reportium.model.Project;
import com.perfecto.reportium.test.TestContext;
import com.perfecto.reportium.test.result.TestResultFactory;
import com.perfectomobile.httpclient.utils.FileUtils;

import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;



public class RAI_Desktop_Utility_Functions extends BaseClass{

	

	public RemoteWebDriver connectWithoutProxy(DesiredCapabilities caps) {


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

		//HttpClientBuilder builder = HttpClientBuilder.create();
		//MyHttpClientFactory factory = new MyHttpClientFactory(builder);

		okhttp3.OkHttpClient.Builder client = new okhttp3.OkHttpClient.Builder().connectTimeout(60, TimeUnit.SECONDS)
				.writeTimeout(60, TimeUnit.SECONDS).readTimeout(60, TimeUnit.SECONDS);
		Factory factory = new MyHttpClientFactory(new OkHttpClient(client.build(), url));

		HttpCommandExecutor executor = new HttpCommandExecutor(new HashMap<String, CommandInfo>(), url,factory);

		return new RemoteWebDriver(executor, caps);

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

	// static String TestCaseName;

	static boolean isSafari = false;
	DesiredCapabilities capabilities;

	// Constructor to launch device
	public RAI_Desktop_Utility_Functions(String name_class, String TestCaseName) {

		String BrowserName = Constants.BROWSERNAME;

      try
		{
			
				System.out.println("Connecting to Perfecto Lab---------------");
				capabilities = new DesiredCapabilities("", "", Platform.ANY);
				capabilities.setCapability("securityToken", Constants.SecurityToken);

				if (BrowserName.equalsIgnoreCase("Chrome")) {
					capabilities.setCapability("platformName", "Windows");
					capabilities.setCapability("platformVersion", "11");
					capabilities.setCapability("browserName", "Chrome");
					capabilities.setCapability("browserVersion", "108");
					capabilities.setCapability("resolution", "1920x1080");
					capabilities.setCapability("scriptName", TestCaseName);

				} else if (BrowserName.equalsIgnoreCase("IE")) {
					capabilities.setCapability("platformName", "Windows");
					capabilities.setCapability("platformVersion", "11");
					capabilities.setCapability("browserName", "Internet Explorer");
					capabilities.setCapability("browserVersion", "latest");
					capabilities.setCapability("resolution", "1440x900");
					capabilities.setCapability("scriptName", TestCaseName);

				} else if (BrowserName.equalsIgnoreCase("Firefox")) {
					capabilities.setCapability("platformName", "Windows");
					capabilities.setCapability("platformVersion", "11");
					capabilities.setCapability("browserName", "Firefox");
					capabilities.setCapability("browserVersion", "latest");
					capabilities.setCapability("resolution", "1440x900");
					capabilities.setCapability("scriptName", TestCaseName);
				} else if (BrowserName.equalsIgnoreCase("Edge")) {
					capabilities.setCapability("platformName", "Windows");
					capabilities.setCapability("platformVersion", "11");
					capabilities.setCapability("browserName", "Edge");
					capabilities.setCapability("browserVersion", "79");
					capabilities.setCapability("resolution", "1440x900");
					capabilities.setCapability("scriptName", TestCaseName);
				} else if (BrowserName.equalsIgnoreCase("Safari")) {
					capabilities.setCapability("platformName", "Mac");
					capabilities.setCapability("platformVersion", "macOS Catalina");
					capabilities.setCapability("browserName", "Safari");
					capabilities.setCapability("browserVersion", "14");
					capabilities.setCapability("resolution", "1280x1024");
					capabilities.setCapability("scriptName", TestCaseName);
					capabilities.setCapability("location", "NA-US-BOS");
					isSafari = true;
				}
				//	PerfectoLabUtils.setExecutionIdCapability(capabilities, Constants.PM_CLOUD);
				capabilities.setCapability("takesScreenshot", true);
				capabilities.setCapability("screenshotOnError", true);
				rdriver = connectWithoutProxy(capabilities);

				rdriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

				SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");
				Date today = Calendar.getInstance().getTime();
				String reportDate = df.format(today);
				int date_CIjob = Integer.parseInt(reportDate);

				// name_class
				PerfectoExecutionContext perfectoExecutionContext = new PerfectoExecutionContext.PerfectoExecutionContextBuilder()
						.withProject(new Project("BAT Canada", "1.0")).withJob(new Job("Subscription Update", date_CIjob))
						.withContextTags("BAT Canada - DXC").withWebDriver(rdriver).build();
				reportiumClient = new ReportiumClientFactory().createPerfectoReportiumClient(perfectoExecutionContext);

				// Initializing perfecto Reporting
				String testName = TestCaseName;
				reportiumClient.testStart(testName, new TestContext());
			}
			
		 catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	public RAI_Desktop_Utility_Functions() {

	}

	// ********************************************************************************************************************************************
	public void launchApplication(String url) throws Exception {
		// Launch Browser
		try {

			deleteAllCookie();
			rdriver.get(url);

			rdriver.manage().window().maximize();
			
			
				reportiumClient.reportiumAssert("Browser Launched Successfully", true);
				rdriver.executeScript("mobile:screen:image");
			
			
			

		} catch (Exception e) {
					
			
			reportiumClient.reportiumAssert("Failed to Launch Browser", false);
			
			
			
			e.printStackTrace();
		}
	}
	
	
	
	// ********************************************************************************************************************************************
	public void deleteAllCookie() {
		rdriver.manage().deleteAllCookies();
	}

	// Enter Value in edit field
	public void inputText(By by, String elementname, String data) throws Exception {
		try {

			WebElement e1 = rdriver.findElement(by);
			if (e1.isDisplayed()) {
				Actions actions = new Actions(rdriver);
				actions.moveToElement(e1).click().build().perform();
				e1.clear();
				e1.sendKeys(data);
				if(Constants.Environment.equalsIgnoreCase("QA"))
				{
					reportiumClient.reportiumAssert("Entered " + data + " in " + elementname + " Edit Field", true);	
					rdriver.executeScript("mobile:screen:image");
				}
				
				
				
				
				
			}
		} catch (Exception e) {
			// TODO: handle exception
				reportiumClient.reportiumAssert("Failed To Locate " + elementname + " Text field.", false);
			
			

			e.printStackTrace();
		}
	}



	// ********************************************************************************************************************************************
	// Password encryption
	public void inputPasswordEncrypted(By by, String elementname, String data) throws Exception {
		try {

			String encryptedPasswordByBytes = Base64.getEncoder().encodeToString(data.getBytes());
			reportiumClient.testStep("Entering " + encryptedPasswordByBytes + " in " + elementname + " Edit Field");
			WebElement e1 = rdriver.findElement(by);
			if (e1.isDisplayed()) {
				Actions actions = new Actions(rdriver);
				actions.moveToElement(e1).click().build().perform();
				e1.clear();
				e1.sendKeys(data);
				
						
					rdriver.executeScript("mobile:screen:image");
				

			}
		} catch (Exception e) {
			// TODO: handle exception
			
			
					
				reportiumClient.reportiumAssert("Failed To Locate " + elementname + " Text field.", false);
			
			

			e.printStackTrace();
		}
	}

	// ********************************************************************************************************************************************

	public void clickUsingJs(By by, String elementname) throws Exception {
		try {
			reportiumClient.testStep("Clicking " + elementname + " button");
			WebElement e1 = rdriver.findElement(by);
			
			
			
				if (e1.isDisplayed()) {
					if (!isSafari) {
	                  
						JavascriptExecutor executor = (JavascriptExecutor) rdriver;
						executor.executeScript("arguments[0].click();", e1);
					}
					else {
						e1.click();

					}
			
				
				}

			

			
		} catch (Exception e) {
			// TODO: handle exception
			
			reportiumClient.reportiumAssert("Failed To Click On " + elementname + " Element.", false);
			e.printStackTrace();
		}

			
		
	}
	
	
	public void fnVerifyPageLoadedInSameTab(String CurrentTab, By by, String elementName) throws Exception
	{
	try
	{
	String handle = rdriver.getWindowHandle();

	if (CurrentTab.equals(handle))
	{
	WebElement element = rdriver.findElement(by);
	if(element.isDisplayed())
	{
		reportiumClient.reportiumAssert("Verify Page Loaded in Same Tab " + elementName + " Element.", true);
	
	}

	else
	{
		reportiumClient.reportiumAssert("Verify Page Loaded in Same Tab and Page loaded in Same Tab Is Not Successfull " + elementName + " Element.", true);
		

	}
	}
	else
	{
		reportiumClient.reportiumAssert("Verify Page Loaded in Same Tab and Page loaded in Same Tab Is Not Successfull " + elementName + " Element.", false);
	}

	}

	catch (Exception e)
	{
	// TODO: handle exception
	
	reportiumClient.reportiumAssert("Unable To verify page loaded in same tab " + elementName + " Element.", false);
	e.printStackTrace();
	}

	}
	

	// ********************************************************************************************************************************************
	// Click Button
	public void clickbutton(By by, String elementname) throws Exception {
		// Click Button
		try {
			reportiumClient.testStep("Clicking " + elementname + " button");
			WebElement e1 = rdriver.findElement(by);

			if(Constants.Environment.equalsIgnoreCase("QA"))
			{
				if (e1.isDisplayed()) {
					if (!isSafari) {
						Actions actions = new Actions(rdriver);
						actions.moveToElement(e1).click().build().perform();
					} else {
						e1.click();
					}

				}
			}
			if(Constants.Environment.equalsIgnoreCase("production"))
			{
				if (e1.isDisplayed()) {
					if (!isSafari) {
						Actions actions = new Actions(driver);
						actions.moveToElement(e1).click().build().perform();
						
					} else {
						e1.click();
					}

				}
			}
			
		} catch (Exception e) {
			// TODO: handle exception
				reportiumClient.reportiumAssert("Failed To Click On " + elementname + " Element.", false);
				e.printStackTrace();
			
		}
	}
	// ********************************************************************************************************************************************

	// Click Link
	public void clickLink(By by, String elementname) throws Exception {
		try {
			reportiumClient.testStep("Clicking " + elementname + " button");
			WebElement e1 = rdriver.findElement(by);

			if (e1.isDisplayed()) {
				if (!isSafari) {
					Actions actions = new Actions(rdriver);
					actions.moveToElement(e1).click().build().perform();
				} else {
					e1.click();
				}

			}
		} catch (Exception e) {
			// TODO: handle exception
			reportiumClient.reportiumAssert("Failed To Click On " + elementname + " Element.", false);
			e.printStackTrace();
		}
	}

	// ********************************************************************************************************************************************
	public void isEnabled(By by, String elementname) throws Exception {
		// Click Button
		try {
			WebElement e1 = rdriver.findElement(by);
			if (e1.isEnabled()) {
				reportiumClient.reportiumAssert(elementname + " Element Is Enabled", true);
				rdriver.executeScript("mobile:screen:image");
			} else {
				reportiumClient.reportiumAssert(elementname + " Element Is Disabled.", false);
			}
		}

		catch (Exception e) {
			// TODO: handle exception
			reportiumClient.reportiumAssert(elementname + " Element Is Disabled.", false);
			e.printStackTrace();
		}
	}

	// ********************************************************************************************************************************************
	public void clickbuttonUsingSelenium(By by, String elementname) throws Exception {
		// Click Button
		try {
			reportiumClient.testStep("Clicking " + elementname + " button");
			WebDriverWait wait = new WebDriverWait(rdriver, 30);
			wait.until(ExpectedConditions.visibilityOfElementLocated(by));
			WebElement e1 = rdriver.findElement(by);
			if (e1.isDisplayed()) {
				e1.click();

			}
		} catch (Exception e) {
			// TODO: handle exception
			
			reportiumClient.reportiumAssert("Failed To Click On " + elementname + " Button.", false);
			
			
			fnCatchBlock(e);
			
		
			
		}
	}

	// ********************************************************************************************************************************************
	public void ElementShouldContain(By by, String elementname, String data) throws Exception {
		try {
			WebElement e1 = rdriver.findElement(by);
			if (e1.isDisplayed()) {
				String actualString = e1.getText();
				assertTrue(actualString.replaceAll("\\n", "").replaceAll("\\t", "").replaceAll(" ", "").toUpperCase()
						.contains(data.replaceAll(" ", "").toUpperCase()));
				reportiumClient.reportiumAssert(data + " Presents In Element", true);
				rdriver.executeScript("mobile:screen:image");
			}
		} catch (Exception e) {
			// TODO: handle exception
			reportiumClient.reportiumAssert(data + " Is Not Present In Element", false);
			e.printStackTrace();
		}
	}
	
	public void ClickUsingOCR(String data) {
		Map<String, Object> params = new HashMap<>();
		params.put("label", data);
		params.put("threshold", 70);
		params.put("ignorecase", "case");
		rdriver.executeScript("mobile:button-text:click", params);
		//File screenshot=rdriver.getScreenshotAs(OutputType.FILE);
		rdriver.executeScript("mobile:screen:image");
		reportiumClient.reportiumAssert(data + " was clicked", true);


	}

	public void launchApplicationprod(String browserName, String url) throws Exception 
	{
		// Launch Browser



		try 
		{

		}
		catch (Exception e) 
		{
			// TODO: handle exception
			//Log
			
			e.printStackTrace();
		}
	}


	// ********************************************************************************************************************************************
	public void ElementShouldNotContain(By by, String elementname, String data) throws Exception {
		try {
			WebElement e1 = rdriver.findElement(by);
			if (e1.isDisplayed()) {
				String actualString = e1.getText();
				assertFalse(actualString.contains(data));
				reportiumClient.reportiumAssert(data + " Is Not Present In Element", true);
				rdriver.executeScript("mobile:screen:image");
			}
		} catch (Exception e) {
			// TODO: handle exception
			reportiumClient.reportiumAssert(data + " Presents In Element", false);
			e.printStackTrace();
		}
	}

	//To handle authentication required window - Added @ 11/2/2018 - By Suneel Kaushik Subramanya
	public void confirmAlert(String RDCCredential, String RDCPassword) throws Exception
	{
		try
		{
			WebDriverWait wait = new WebDriverWait(rdriver, 10);
			wait.until(ExpectedConditions.alertIsPresent());
			Alert alt = rdriver.switchTo().alert();
			Thread.sleep(1000);
			alt.sendKeys(RDCCredential + Keys.TAB.toString()+RDCPassword);
			alt.accept();
			
		}
		catch (Exception e) 
		{
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	// ********************************************************************************************************************************************
	public void isDisabled(By by, String elementname) throws Exception {
		try {
			WebElement e1 = rdriver.findElement(by);
			if (e1.isEnabled()) {
				reportiumClient.reportiumAssert(elementname + " Is Enabled", false);
			} else {
				reportiumClient.reportiumAssert(elementname + " Is Disabled", true);
			}
		} catch (Exception e) {
			// TODO: handle exception
			reportiumClient.reportiumAssert("Element Is Not Disabled", false);
			e.printStackTrace();
		}
	}

	// ********************************************************************************************************************************************
	// Click Image
	public void clickImage(By by, String elementname) throws Exception {
		try {
			reportiumClient.testStep("Clicking " + elementname + " button");
			WebElement e1 = rdriver.findElement(by);
			if (e1.isDisplayed()) {
				if (!isSafari) {
					Actions actions = new Actions(rdriver);
					actions.moveToElement(e1).click().build().perform();
				} else {
					e1.click();
				}

			}
		} catch (Exception e) {
			// TODO: handle exception
			reportiumClient.reportiumAssert("Failed to Click on " + elementname + " Image.", false);
			e.printStackTrace();
		}
	}

	// ********************************************************************************************************************************************
	public void fnClickButtonSafari(By by, String Element) throws Exception {
		reportiumClient.testStep("Clicking " + Element + " button");
		WebElement consentText = rdriver.findElement(by);
		new Actions(rdriver).moveToElement(consentText).click().perform();
		((JavascriptExecutor) rdriver).executeScript("arguments[0].click()", consentText);

	}

	// ********************************************************************************************************************************************
	public boolean ScrolltoTopofthepage() {
		try {

			JavascriptExecutor js = (JavascriptExecutor) rdriver;
			js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
			Thread.sleep(5000);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	// ********************************************************************************************************************************************
	public void inputText_Frame(By by, String elementname, String data) throws Exception {
		try {

			WebElement e1 = rdriver.findElement(by);
			if (e1.isDisplayed()) {
				e1.click();
				// e1.clear();
				e1.sendKeys(data);
				reportiumClient.reportiumAssert(
						"'" + data + "'" + " Entered In " + elementname + " Text Field Successfully.", true);
				rdriver.executeScript("mobile:screen:image");

			}
		} catch (Exception e) {
			// TODO: handle exception
			// test
			reportiumClient.reportiumAssert("Failed To Locate " + elementname + " Text field.", false);
			e.printStackTrace();
			;
		}
	}

	// ********************************************************************************************************************************************
	public void fnContentValidationUsingContains(String data, By by) throws Exception {
		try {
			WebElement e1 = rdriver.findElement(by);
			if (e1.isDisplayed()) {
				String actualString = e1.getText().trim().replace("\n", "").replace(" ", "").toUpperCase();
				data = data.trim().replace("\n", "").replace(" ", "").toUpperCase();
				String ActualText = e1.getText().trim().replace("\n", "").replace(" ", "").toUpperCase();
				boolean ActualString = actualString.contains(data);
				System.out.println(">>>>>>>" + ActualText + ">>>>>>");

				if (ActualString) {
					reportiumClient.reportiumAssert("'" + data + "'" + " Content validated successfully", true);
					rdriver.executeScript("mobile:screen:image");
				} else {
					reportiumClient.reportiumAssert("'" + data + "'" + " Content validation failed", false);
				}
			}

		}

		catch (Exception e) {
			// TODO: handle exception
			reportiumClient.reportiumAssert("'" + data + "'" + " Content validation failed", false);
			e.printStackTrace();
		}
	}

	// ********************************************************************************************************************************************
	public void fnclick_Selenium(By by) throws DocumentException, Exception {
		try {
			rdriver.findElement(by).click();
			reportiumClient.reportiumAssert("Click function Verified Successfully", true);

		}

		catch (Exception e) {
			// TODO: handle exception
			reportiumClient.reportiumAssert("Error : On Click function Validation", false);
			e.printStackTrace();
		}

	}

	// ********************************************************************************************************************************************
	public void Vuse_CF_clickUsingJs(By by, String elementname) throws Exception {
		try {
			reportiumClient.testStep("Clicking " + elementname + " button");
			WebElement e1 = rdriver.findElement(by);
			JavascriptExecutor executor = (JavascriptExecutor) rdriver;
			executor.executeScript("arguments[0].click();", e1);

		} catch (Exception e) {
			// TODO: handle exception
			reportiumClient.reportiumAssert("Failed To Click On " + elementname + " Element.", false);
			e.printStackTrace();
		}
	}

	// ********************************************************************************************************************************************
	// Click Element
	public void clickElement(By by, String elementname) throws Exception {
		try {

			WebElement e1 = rdriver.findElement(by);
			if (e1.isDisplayed()) {
				reportiumClient.testStep("Clicking " + elementname + " button");
				if (!isSafari) {
					Actions actions = new Actions(rdriver);
					actions.moveToElement(e1).click().build().perform();
				} else {
					e1.click();
				}

			}
		} catch (Exception e) {
			// TODO: handle exception
			reportiumClient.reportiumAssert("Failed To Click On " + elementname + " Element.", false);
			e.printStackTrace();
		}
	}

	// ********************************************************************************************************************************************
	public void ScrollPageDown() throws Exception {
		try {
			JavascriptExecutor jse = (JavascriptExecutor) rdriver;
			jse.executeScript("window.scrollBy(0,250)", "");

			Thread.sleep(3000);

		} catch (Exception e) {
			// TODO: handle exception
			reportiumClient.reportiumAssert("Unable To Scroll Page Down", false);
			e.printStackTrace();
		}
	}

	// ********************************************************************************************************************************************
	public void ScrollPageUp() throws Exception {
		try {
			JavascriptExecutor jse = (JavascriptExecutor) rdriver;
			jse.executeScript("window.scrollBy(0,-250)", "");
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	// ********************************************************************************************************************************************
	public void closeBrowser() throws Exception {
		rdriver.close();
	}

	// ********************************************************************************************************************************************
	public void confirmAlert() throws Exception {
		try {
			Alert alt = rdriver.switchTo().alert();
			Thread.sleep(1000);
			alt.accept();
			reportiumClient.reportiumAssert("Alert Popup Accecpted Successfully", true);

		} catch (Exception e) {
			// TODO: handle exception
			reportiumClient.reportiumAssert("Either Failed to Accecpt Alert/The Alert window didn't Popup", false);
			e.printStackTrace();
		}
	}

	// ********************************************************************************************************************************************
	public void dismissAlert() throws Exception {
		try {
			Alert alt = rdriver.switchTo().alert();
			Thread.sleep(1000);
			alt.dismiss();
			reportiumClient.reportiumAssert("Dismissed Alert Popup Successfully", true);
		} catch (Exception e) {
			// TODO: handle exception
			reportiumClient.reportiumAssert("Failed To Dismiss Alert", false);
			e.printStackTrace();
		}
	}

	// ********************************************************************************************************************************************
	public void doubleClick(By by, String elementname) throws Exception {
		try {
			WebElement e1 = rdriver.findElement(by);
			if (e1.isDisplayed()) {
				Actions builder = new Actions(rdriver);
				builder.doubleClick(e1).build().perform();
				reportiumClient.reportiumAssert("Double Clicked On " + elementname + " Element Successfully.", true);
			}
		} catch (Exception e) {
			// TODO: handle exception
			reportiumClient.reportiumAssert("Failed To Locate " + elementname + " Element.", false);
			e.printStackTrace();
		}
	}

	// ********************************************************************************************************************************************
	public void ClickLinkinWebTable1(By by, String elementname, String link) throws Exception {
		try {
			WebElement e1 = rdriver.findElement(by);
			if (e1.isDisplayed()) {
				WebElement webtable1 = rdriver.findElement(by);
				List<WebElement> links = webtable1.findElements(By.tagName("a"));
				int totallinks = links.size();

				List<String> value = new ArrayList<String>();
				for (int j = 0; j < totallinks; j++) {

					value.add(links.get(j).getText());
				}
				if (value.contains(link)) {
					reportiumClient.reportiumAssert("'" + link + "'" + " Clicked Link In Web Table Successfully", true);
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			reportiumClient.reportiumAssert("Failed To Locate " + "'" + link + "'" + " Link", false);
			e.printStackTrace();
		}
	}

	// ********************************************************************************************************************************************
	public void reloadPage() throws Exception {
		try {
			rdriver.navigate().refresh();
			rdriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			reportiumClient.reportiumAssert("Page Refreshed Successfully", true);
		} catch (Exception e) {
			// TODO: handle exception
			reportiumClient.reportiumAssert("Failed to Refresh page", false);
			e.printStackTrace();
		}
	}

	// ********************************************************************************************************************************************
	public void navigateBack() throws Exception {
		try {
			rdriver.navigate().back();
			rdriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			reportiumClient.reportiumAssert("Navigated Back To Previous Page Successfully", true);
		} catch (Exception e) {
			// TODO: handle exception
			reportiumClient.reportiumAssert("Failed To Navigate To Back Page", false);
			e.printStackTrace();
		}
	}

	// ********************************************************************************************************************************************
	public void selectCheckbox(By by, String elementname) throws Exception {
		try {
			WebElement e1 = rdriver.findElement(by);
			if (e1.isDisplayed()) {
				if (e1.isSelected()) {
					reportiumClient.reportiumAssert(elementname + " Checkbox Is Already Selected", true);
				} else {
					e1.click();
					Thread.sleep(2000);
					reportiumClient.reportiumAssert(elementname + " Checkbox Is Selected Successfully.", true);
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			reportiumClient.reportiumAssert(elementname + " Checkbox Is Selected Successfully.", false);
			e.printStackTrace();
		}
	}

	// ********************************************************************************************************************************************
	public void unselectCheckbox(By by, String elementname) throws Exception {
		try {
			WebElement e1 = rdriver.findElement(by);
			if (e1.isDisplayed()) {
				if (e1.isSelected()) {
					e1.click();
					Thread.sleep(2000);
					reportiumClient.reportiumAssert("Checkbox Unselected Successfully.", true);
				} else {
					reportiumClient.reportiumAssert("Checkbox Is Already Unselected", false);
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			reportiumClient.reportiumAssert("Checkbox Is Already Unselected", false);
			e.printStackTrace();
		}
	}

	// ********************************************************************************************************************************************
	public void selectByIndex(By by, String elementname, String data) throws Exception {
		try {
			WebElement e1 = rdriver.findElement(by);
			if (e1.isDisplayed()) {
				Select se = new Select(e1);
				int val = Integer.parseInt(data.trim());
				se.selectByIndex(val);
				reportiumClient.reportiumAssert(elementname + " Is Selected From Dropdown Successfully.", true);
			}
		} catch (Exception e) {
			// TODO: handle exception
			reportiumClient.reportiumAssert("Failed to select + elementname + from the dropdown.", false);
			e.printStackTrace();
		}
	}

	// ********************************************************************************************************************************************
	public void selectByText(By by, String elementname, String data) throws Exception {
		try {
			WebElement e1 = rdriver.findElement(by);
			if (e1.isDisplayed()) {
				Select se = new Select(e1);
				se.selectByVisibleText(data.trim());
				reportiumClient.reportiumAssert(elementname + " Is Selected From Dropdown Successfully.", true);
			}
		} catch (Exception e) {
			// TODO: handle exception
			reportiumClient.reportiumAssert("Failed to select " + elementname + " from the dropdown.", false);
			e.printStackTrace();
		}
	}

	// ********************************************************************************************************************************************
	public void selectByText(By by, String data) throws Exception {
		try {

			WebElement e1 = rdriver.findElement(by);
			if (e1.isDisplayed()) {
				Select se = new Select(e1);
				se.selectByVisibleText(data.trim());
				reportiumClient.reportiumAssert(data + " Is Selected From Dropdown Successfully.", true);
			}
		} catch (Exception e) {
			// TODO: handle exception
			reportiumClient.reportiumAssert("Failed to select " + data + " from the dropdown.", false);
			e.printStackTrace();
		}
	}

	// ********************************************************************************************************************************************
	public void verifyTitle(String Text) throws Exception {
		try {
			if (rdriver.getTitle().contains(Text))
				reportiumClient.reportiumAssert("Page Title " + "'" + Text + "'" + " Is Verified", true);
			rdriver.executeScript("mobile:screen:image");
		} catch (Exception e) {
			// TODO: handle exception
			reportiumClient.reportiumAssert("Page Title " + "'" + Text + "'" + " Does Not Match", false);
			e.printStackTrace();
		}
	}

	// ********************************************************************************************************************************************
	public void selectByValue(By by, String elementname, String data) throws Exception {
		try {
			WebElement e1 = rdriver.findElement(by);
			if (e1.isDisplayed()) {
				Select se = new Select(e1);
				se.selectByVisibleText(data.trim());
				reportiumClient.reportiumAssert(elementname + " Is Selected From Dropdown Successfully.", true);
			}
		} catch (Exception e) {
			// TODO: handle exception
			reportiumClient.reportiumAssert("Failed to select " + elementname + " from the dropdown.", false);
			e.printStackTrace();
		}
	}

	// ********************************************************************************************************************************************
	public void switchDefault() throws Exception {
		// Switch Default Window
		try {
			rdriver.switchTo().defaultContent();
			Thread.sleep(5000);
			reportiumClient.reportiumAssert("Control Switched To Default Window Successfully", true);
		} catch (Exception e) {
			// TODO: handle exception
			reportiumClient.reportiumAssert("Failed To Switch Control To Default Window", false);
			e.printStackTrace();
		}
	}

	// ********************************************************************************************************************************************
	public void frameByIndex(int Input) throws Exception {
		try {
			WebDriverWait wait = new WebDriverWait(rdriver, 20);
			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(Input));
			rdriver.switchTo().frame(Input);
			Thread.sleep(2000);
			reportiumClient.reportiumAssert("Switched In To Frame Successfully.", true);
		} catch (Exception e) {
			// TODO: handle exception
			reportiumClient.reportiumAssert("Failed To Switch In To Frame.", false);
			e.printStackTrace();
		}
	}

	// ********************************************************************************************************************************************
	public void frameByelement(By by) throws Exception {
		try {

			WebElement e1 = rdriver.findElement(by);
			rdriver.switchTo().frame(e1);
			Thread.sleep(2000);
			reportiumClient.reportiumAssert("Switched To Frame Successfully.", true);
		} catch (Exception e) {
			// TODO: handle exception
			reportiumClient.reportiumAssert("Failed To Locate Frame.", false);
			e.printStackTrace();
		}
	}

	// ********************************************************************************************************************************************
	public void waitTillElementEnable(By by) throws Exception {
		try {
			WebDriverWait wait = new WebDriverWait(rdriver, 60);
			wait.until(ExpectedConditions.elementToBeClickable(by));
		} catch (Exception e) {
			// TODO: handle exception
			reportiumClient.reportiumAssert("Element Is Not Clickable in the page", false);
			e.printStackTrace();
		}
	}

	// ********************************************************************************************************************************************
	public void waitTillElementVisible(By by) throws Exception {
		try {
			WebDriverWait wait = new WebDriverWait(rdriver, 30);
			wait.until(ExpectedConditions.visibilityOfElementLocated(by));
		} catch (Exception e) {
			// TODO: handle exception
			reportiumClient.reportiumAssert("Element Is Not Visible In The Page", false);
			e.printStackTrace();
		}
	}

	// ********************************************************************************************************************************************
	public void ClickRadioButton(By by, String elementname) throws Exception {
		try {
			WebElement e1 = rdriver.findElement(by);
			if (e1.isDisplayed()) {
				if (e1.isSelected()) {
					reportiumClient.reportiumAssert(elementname + " Radio Button is already Clicked", true);
				} else {
					e1.click();
					reportiumClient.reportiumAssert("Clicked " + elementname + " Radio Button Successfully.", true);
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			reportiumClient.reportiumAssert("Failed To Identify " + elementname + " Radio Button", false);
			e.printStackTrace();
		}
	}

	// ********************************************************************************************************************************************
	public void ClickRadioButtonByValue(String data) throws Exception {
		try {
			List<WebElement> radios = rdriver.findElements(By.xpath("//input[@type='radio']"));
			System.out.println("No " + radios.size());

			for (int i = 0; i < radios.size(); i++) {
				System.out.println("value  " + i + "   " + radios.get(i).getAttribute("value"));
				if (radios.get(i).getAttribute("value").contains(data)) {
					radios.get(i).click();
				}
				reportiumClient.reportiumAssert(data + "Radio Button Is Clicked Successfully.", true);
			}
		} catch (Exception e) {
			// TODO: handle exception
			reportiumClient.reportiumAssert("Failed To Click " + data + " Radio Button.", false);
			e.printStackTrace();
		}
	}

	// ********************************************************************************************************************************************
	public void UnCheckAll(By by) throws Exception {
		int i = 0;
		try {
			List<WebElement> Check = rdriver.findElements(by);
			System.out.println("No " + Check.size());
			for (i = 0; i < Check.size(); i++) {
				System.out.println("value  " + i + "   " + Check.get(i).getText());
				if (Check.get(i).isSelected()) {
					Check.get(i).click();
				}
			}
			reportiumClient.reportiumAssert("All Check Boxes are UnChecked Successfully.", true);
		}

		catch (Exception e) {
			// TODO: handle exception
			reportiumClient.reportiumAssert("Failed To Unselect Checkboxes.", false);
			e.printStackTrace();
		}
	}

	// ********************************************************************************************************************************************
	public boolean VerifyIsCheckboxSelected(By by, String elementname) throws Exception {
		try {
			@SuppressWarnings("unused")
			JavascriptExecutor js = (JavascriptExecutor) rdriver;
			/*
			 * WebDriverWait wait = new WebDriverWait(rdriver, 30);
			 * wait.until(ExpectedConditions.visibilityOfElementLocated(by));
			 */
			WebElement e1 = rdriver.findElement(by);
			if (e1.isDisplayed()) {
				if (e1.isSelected()) {
					reportiumClient.reportiumAssert(elementname + "Checkbox Is Selected", true);
					rdriver.executeScript("mobile:screen:image");
				}
			}
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			reportiumClient.reportiumAssert("Failed To Identify The " + elementname + " Element", false);
			e.printStackTrace();
			return false;
		}
	}

	// ********************************************************************************************************************************************
	public boolean IsCheckboxSelected(By by, String elementname) throws Exception {
		try {
			@SuppressWarnings("unused")
			JavascriptExecutor js = (JavascriptExecutor) rdriver;
			WebElement e1 = rdriver.findElement(by);
			if (e1.isDisplayed()) {
				if (e1.isSelected()) {
					return true;
				}
				return false;
			}
			return false;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}
	}

	// ********************************************************************************************************************************************
	public void VerifyIsCheckboxUnSelected(By by, String elementname) throws Exception {
		try {
			WebElement e1 = rdriver.findElement(by);
			if (e1.isDisplayed()) {
				if (e1.isSelected()) {
					reportiumClient.reportiumAssert(elementname + "Checkbox Is Selected", true);
				}

				else {
					reportiumClient.reportiumAssert(elementname + "Checkbox Is Not Selected", false);
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			reportiumClient.reportiumAssert(elementname + "Checkbox Is Not Selected", false);
			e.printStackTrace();
		}
	}

	// ********************************************************************************************************************************************
	public boolean VerifyElementVisible(By by, String elementname) throws Exception {
		boolean result = false;
		try {

			WebElement e1 = rdriver.findElement(by);
			// WebElement e1;
			if (e1.isDisplayed()) {
				if (!(elementname.equalsIgnoreCase("NO"))) {
					reportiumClient.reportiumAssert(elementname + " Element Is Visible", true);
					rdriver.executeScript("mobile:screen:image");
				}
				
				result = true;
			}

		} catch (Exception e) {
			// TODO: handle exception
			if (!(elementname.equalsIgnoreCase("NO"))) {
				reportiumClient.reportiumAssert(elementname + " Element Is Not Visible", false);
				e.printStackTrace();
			}

			result = false;
		}
		return result;
	}

	// ********************************************************************************************************************************************
	public boolean isObjectPresent(By by, String elementname) {
		boolean foundObject = false;

		try {
			rdriver.findElement(by).isDisplayed();
			foundObject = true;
		} catch (Exception e) {
			System.out.println(elementname + " is not present");
		}
		return foundObject;

	}

	// ********************************************************************************************************************************************
	public boolean VerifyElementPresent(By by, String elementname) throws Exception {
		boolean result = false;
		try {
			WebElement e1 = rdriver.findElement(by);

			if (e1.isDisplayed()) {
				reportiumClient.reportiumAssert(elementname + " Element Is Visible", true);
				rdriver.executeScript("mobile:screen:image");
				result = true;
			}else {
				reportiumClient.reportiumAssert(elementname + " Element Is Not Visible", false);
			}

		} catch (Exception e) {
			// TODO: handle exception
			reportiumClient.reportiumAssert(elementname + " Element Is Not Visible", false);

			e.printStackTrace();

			result = false;
		}
		return result;
	}


	// ********************************************************************************************************************************************
	public void PageShouldContainsText(String text) throws Exception {
		try {
			if (rdriver.getPageSource().contains(text)) {
				reportiumClient.reportiumAssert("Page Contains The Data", true);
				rdriver.executeScript("mobile:screen:image");
			} else {
				reportiumClient.reportiumAssert("Page Does Not Contains The Data ", false);
			}
		} catch (Exception e) {
			// TODO: handle exception
			reportiumClient.reportiumAssert("Page Does Not Contains The Data ", false);
			e.printStackTrace();
		}
	}

	// ********************************************************************************************************************************************
	public void PageShouldContainsImage(By by, String elementname) throws Exception {
		try {
			WebElement ImageFile = rdriver.findElement(by);

			Boolean ImagePresent = (Boolean) ((JavascriptExecutor) rdriver).executeScript(
					"return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0",
					ImageFile);
			if (ImagePresent) {
				reportiumClient.reportiumAssert("Page Contains The Image " + elementname, true);
				rdriver.executeScript("mobile:screen:image");
			} else {
				reportiumClient.reportiumAssert("Page Does Not Contains The Image " + elementname, false);
			}
		} catch (Exception e) {
			// TODO: handle exception
			reportiumClient.reportiumAssert("Page Does Not Contains The Image " + elementname, false);
			e.printStackTrace();
		}
	}

	// ********************************************************************************************************************************************
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

	// ********************************************************************************************************************************************
	public void HowerPaginationDots(By by, String elementname) throws Exception {
		try {
			/*
			 * WebDriverWait wait = new WebDriverWait(rdriver, 30);
			 * wait.until(ExpectedConditions.visibilityOfElementLocated(by));
			 */
			WebElement e1 = rdriver.findElement(by);
			if (e1.isDisplayed()) {
				Actions actions = new Actions(rdriver);
				// actions.moveToElement(e1).build().perform();
				actions.moveToElement(e1);
				actions.clickAndHold();
				actions.perform();
				reportiumClient.reportiumAssert("Successfully Mouseover on " + elementname, true);
			}
		} catch (Exception e) {
			// TODO: handle exception
			reportiumClient.reportiumAssert("Failed To Mouseover On " + elementname, false);
			e.printStackTrace();
		}
	}

	// ********************************************************************************************************************************************
	public void MenuSelection_HowerMouse(By by, String elementname, String data) throws Exception {
		try {
			WebElement e1 = rdriver.findElement(by);
			if (e1.isDisplayed()) {
				WebElement element = rdriver.findElement(By.linkText(data));
				WebElement el = rdriver.findElement(by);
				Actions actions = new Actions(rdriver);
				actions.moveToElement(element).perform();
				actions.moveToElement(el).click();
				reportiumClient.reportiumAssert("Selected " + elementname + " Menu Successfully.", true);
			}
		} catch (Exception e) {
			// TODO: handle exception
			reportiumClient.reportiumAssert("Failed To Select Menu " + elementname + " Through Mouse Hover", false);
			e.printStackTrace();
		}
	}

	// ********************************************************************************************************************************************
	public void KeyBoard_Events(String data) throws Exception {
		try {
			Robot r = new Robot();
			if (data.equalsIgnoreCase("Enter")) {
				r.keyPress(KeyEvent.VK_ENTER);
			} else if ((data.equalsIgnoreCase("Tab"))) {
				r.keyPress(KeyEvent.VK_TAB);
			}
			reportiumClient.reportiumAssert("Key " + data + " Pressed Successfully.", true);
		}

		catch (Exception e) {
			// TODO: handle exception
			reportiumClient.reportiumAssert("Failed to Click  the Keyboard", false);
			e.printStackTrace();
		}
	}

	// ********************************************************************************************************************************************
	public void HeaderCountShouldBe(By by, String elementname, int headercount) throws Exception {

		try {

			List<WebElement> allHeadersOfTable = rdriver.findElements(by);
			int totalHeaders = allHeadersOfTable.size();
			assertTrue(totalHeaders == headercount);
			reportiumClient.reportiumAssert(headercount + " Is Same", true);

		} catch (Exception e) {
			// TODO: handle exception
			reportiumClient.reportiumAssert("Failed To Get Header Count", true);
			e.printStackTrace();
		}
	}

	// ********************************************************************************************************************************************
	public void VerifyTableExistence(By by, String elementname) throws Exception {
		try {
			WebElement e1 = rdriver.findElement(by);
			if (e1.isDisplayed()) {
				WebElement webtable1 = rdriver.findElement(by);
				List<WebElement> rows = webtable1.findElements(By.tagName("tr"));
				int totalrows = rows.size();
				List<WebElement> columns = rows.get(0).findElements(By.tagName("th"));
				int totalcolumns = columns.size();
				// Added screenshot and log
				reportiumClient.reportiumAssert(
						"Found Table With " + totalrows + " Rows And " + totalcolumns + " Columns", true);

			}
		} catch (Exception e) {
			// TODO: handle exception
			reportiumClient.reportiumAssert("Failed To Find Table", false);
			e.printStackTrace();
		}
	}

	// ********************************************************************************************************************************************
	public void uploadFile(String filename) throws AWTException {
		StringSelection ss = new StringSelection(filename);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		Robot robot;
		robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		robot.delay(2000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}

	// ********************************************************************************************************************************************
	public void ElementShouldContainText(By by, String elementname, String data) throws Exception {
		try {
			WebElement e1 = rdriver.findElement(by);
			if (e1.isDisplayed()) {
				String actualString = e1.getText();
				String Userverify = (actualString.substring(0, actualString.indexOf(','))).trim();
				boolean ActualText = data.contains(Userverify);
				if (ActualText) {
					reportiumClient.reportiumAssert(data + " Presents In Element", true);
					rdriver.executeScript("mobile:screen:image");
				} else {
					reportiumClient.reportiumAssert(data + " Is Not Present In Element", false);
				}

			}
		} catch (Exception e) {
			// TODO: handle exception
			reportiumClient.reportiumAssert(data + " Is Not Present In Element", false);
			e.printStackTrace();
		}
	}


	// ********************************************************************************************************************************************
	public void clearElementText(By by, String elementname) throws Exception {
		try {
			WebElement e1 = rdriver.findElement(by);
			if (e1.isDisplayed()) {
				Actions actions = new Actions(rdriver);
				actions.moveToElement(e1).click().build().perform();
				e1.clear();
				e1.sendKeys(" ");
				reportiumClient.reportiumAssert("Cleared " + elementname + " Field Successfully.", true);
			}
		} catch (Exception e) {
			// TODO: handle exception
			reportiumClient.reportiumAssert("Failed To Clear " + elementname + " Field.", false);
			e.printStackTrace();
		}
	}

	// ********************************************************************************************************************************************
	public void VerifyLinkExistence(By by, String elementname) throws Exception {
		try {
			WebElement e1 = rdriver.findElement(by);
			if (e1.isDisplayed()) {
				reportiumClient.reportiumAssert(elementname + " Link " + " Exist", true);
			}
		} catch (Exception e) {
			// TODO: handle exception
			reportiumClient.reportiumAssert(elementname + " Link " + " Does Not Exist", false);
			e.printStackTrace();
		}
	}

	// ********************************************************************************************************************************************
	public void TableShouldContain(By by, String elementname, String data) throws Exception {
		try {
			WebElement e1 = rdriver.findElement(by);
			if (e1.isDisplayed()) {
				WebElement webtable1 = rdriver.findElement(by);
				List<WebElement> rows = webtable1.findElements(By.tagName("tr"));
				List<WebElement> columns = rows.get(0).findElements(By.tagName("th"));
				int totalcolumns = columns.size();
				List<String> value = new ArrayList<String>();
				for (int j = 0; j < totalcolumns; j++) {
					value.add(columns.get(j).getText());
				}
				if (value.contains(data)) {
					reportiumClient.reportiumAssert("'" + data + "'" + " Found In Table", true);
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			reportiumClient.reportiumAssert("Failed To Find " + "'" + data + "'" + " In Table", false);
			e.printStackTrace();
		}
	}

	// ********************************************************************************************************************************************
	public void ClickLinkinWebTable(By by, String elementname, String link) throws Exception {
		try {
			/*
			 * WebDriverWait wait = new WebDriverWait(rdriver, 30);
			 * wait.until(ExpectedConditions.visibilityOfElementLocated(by));
			 */
			WebElement e1 = rdriver.findElement(by);
			if (e1.isDisplayed()) {
				WebElement webtable1 = rdriver.findElement(by);
				List<WebElement> links = webtable1.findElements(By.tagName("a"));
				int totallinks = links.size();

				List<String> value = new ArrayList<String>();
				for (int j = 0; j < totallinks; j++) {
					value.add(links.get(j).getText());
				}
				if (value.contains(link)) {
					reportiumClient.reportiumAssert(link + " Clicked Link In Webtable Successfully", true);
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			reportiumClient.reportiumAssert(link + " Link Not Found In Table", false);
			e.printStackTrace();
		}
	}

	// ********************************************************************************************************************************************
	public void TableShouldNotContain(By by, String elementname, String data) throws Exception {
		try {

			WebElement e1 = rdriver.findElement(by);
			if (e1.isDisplayed()) {
				WebElement webtable1 = rdriver.findElement(by);
				List<WebElement> rows = webtable1.findElements(By.tagName("tr"));
				List<WebElement> columns = rows.get(0).findElements(By.tagName("th"));
				int totalcolumns = columns.size();
				List<String> value = new ArrayList<String>();
				for (int j = 0; j < totalcolumns; j++) {
					value.add(columns.get(j).getText());
				}
				if (value.contains(data)) {
					reportiumClient.reportiumAssert("'" + data + "'" + " Was Found In Table ", true);
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			reportiumClient.reportiumAssert("Failed to find " + "'" + data + "'" + " In Table", false);
			e.printStackTrace();
		}
	}

	// ********************************************************************************************************************************************
	public boolean isclickable(By by, String elementname) throws Exception {
		try {
			WebDriverWait wait = new WebDriverWait(rdriver, 30);
			WebElement e2 = wait.until(ExpectedConditions.elementToBeClickable(by));
			reportiumClient.reportiumAssert("Element" + elementname + " is clickable", true);
			return false;
		} catch (Exception e) {
			reportiumClient.reportiumAssert("Element " + elementname + "is not clickable", false);
			return true;
		}
	}

	// ********************************************************************************************************************************************
	public void VerifyPageDisplayed(String url) throws Exception {
		try {
			Thread.sleep(10000);
			String pageTitle = rdriver.getCurrentUrl();
			if (pageTitle.toUpperCase().contains(url.toUpperCase())) {
				reportiumClient.reportiumAssert(url + " Page Is Displayed", true);
				rdriver.executeScript("mobile:screen:image");

			} else {
				reportiumClient.reportiumAssert("Following " + url + " Page Is Not Displayed", false);
			}
		} catch (Exception e) {
			// TODO: handle exception
			reportiumClient.reportiumAssert("Following " + url + " Page Is Not Displayed", false);
			e.printStackTrace();
		}
	}

	// ********************************************************************************************************************************************
	public boolean fnCompareValues(By from, By to) throws Exception {
		try {
			WebElement e1 = rdriver.findElement(from);
			String fromValueText = e1.getText().trim();
			WebElement e2 = rdriver.findElement(to);
			String toValueText = e2.getText().trim();
			if (fromValueText.equals(toValueText)) {
				reportiumClient.reportiumAssert("Content Verification done", true);
				return true;
			} else {
				reportiumClient.reportiumAssert("Content Verification failed", false);
				return false;
			}
		} catch (Exception e) {
			reportiumClient.reportiumAssert("Content Verification failed", false);
			return false;
		}

	}

	// ********************************************************************************************************************************************
	// ********************************************************************************************************************************************
	public boolean ScrolltoBottomofthepage() {
		try {

			JavascriptExecutor js = (JavascriptExecutor) rdriver;
			js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			Thread.sleep(10000);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	// ********************************************************************************************************************************************
	public boolean VerifyElementVisiblescrncptr(By by, String elementname) throws Exception {
		boolean result = false;
		try {

			WebElement e1 = rdriver.findElement(by);

			if (e1.isDisplayed()) {
				if (!(elementname.equalsIgnoreCase("NO"))) {
					reportiumClient.reportiumAssert(elementname + " Element Is Visible", true);
				}
				result = true;
			}

		} catch (Exception e) {
			// TODO: handle exception
			if (!(elementname.equalsIgnoreCase("NO"))) {
				reportiumClient.reportiumAssert(elementname + " Element Is Not Visible", false);
			}
			e.printStackTrace();

			result = false;
		}
		return result;
	}

	// ********************************************************************************************************************************************
	public void ScrollDownUsingAction() throws Exception {
		try {
			Actions pgdn = new Actions(rdriver);
			pgdn.sendKeys(Keys.PAGE_DOWN).build().perform();
			Thread.sleep(1000);
			reportiumClient.reportiumAssert("Page Successfully Scrolled Down", true);
		} catch (Exception e) {
			// TODO: handle exception
			reportiumClient.reportiumAssert("Page Successfully Scrolled Down", false);
			e.printStackTrace();
		}

	}

	// ********************************************************************************************************************************************
	public boolean VerifyObjectDisplayed(By by, String Element) throws Exception {
		try {
			WebElement e1 = rdriver.findElement(by);

			if (e1.isDisplayed()) {
				reportiumClient.reportiumAssert("Object Is Displayed", true);
				rdriver.executeScript("mobile:screen:image");
			}
			return e1.isDisplayed();
		} 
		catch (Exception e) {
			System.out.println(Element+" is not visible ");
			return false;
		}
	}
	// ********************************************************************************************************************************************
	public boolean VerifyObjectDisplayedCollections(By by, String Element) throws Exception {
		try {

			List<WebElement> e1 = rdriver.findElements(by);

			if (e1.isEmpty()) {
				reportiumClient.reportiumAssert("Object Is Displayed", true);
				rdriver.executeScript("mobile:screen:image");
			}
			return e1.isEmpty();
		} catch (Exception e) {
			System.out.println("Proceeding to Else block");
			return true;
		}
	}
	// ********************************************************************************************************************************************
	public void VerifyPageDisplayed(By by, String pageName) throws Exception {
		try {
			if (VerifyElementVisible(by, "NO")) {

				WebElement e1 = rdriver.findElement(by);

				if (e1.isDisplayed()) {
					// Changed @ 12/14/2018 - below single line
					reportiumClient.reportiumAssert(pageName + " page is Displayed", true);
					rdriver.executeScript("mobile:screen:image");
				} else {
					reportiumClient.reportiumAssert(pageName + " page is not Displayed", false);
				}
			} else {
				reportiumClient.reportiumAssert(pageName + " page is not Displayed", false);
			}
		} catch (Exception e) {
			// TODO: handle exception
			reportiumClient.reportiumAssert(pageName + " page is not Displayed", false);
			e.printStackTrace();
		}
	}

	// ********************************************************************************************************************************************
	public void VerifyPageDisplayedUsingPageTitle(String title) throws Exception {
		try {
			WebDriverWait wait = new WebDriverWait(rdriver, 30);
			String pageTitle = rdriver.getTitle();
			if (pageTitle.toUpperCase().contains(title.toUpperCase())) {
				reportiumClient.reportiumAssert(title + " Page Is Displayed", true);
				rdriver.executeScript("mobile:screen:image");
			} else {
				reportiumClient.reportiumAssert(title + " Page Is Not Displayed ", false);
			}
		} catch (Exception e) {
			// TODO: handle exception
			reportiumClient.reportiumAssert(title + " Page Is Not Displayed ", false);
			e.printStackTrace();
		}
	}

	// ********************************************************************************************************************************************
	public void VerifyPageDisplayedUsingPagetitle(String title) throws Exception {
		try {

			WebDriverWait wait = new WebDriverWait(rdriver, 30);
			boolean pageTitle = rdriver.getTitle().contains(title);
			if (pageTitle) {
				reportiumClient.reportiumAssert(title + " Page Is Displayed", true);
				rdriver.executeScript("mobile:screen:image");
				Thread.sleep(1000);
			} else {
				reportiumClient.reportiumAssert(title + " Page Is Not Displayed", false);
			}
		} catch (Exception e) {
			// TODO: handle exception
			reportiumClient.reportiumAssert(title + " Page Is Not Displayed", false);
			e.printStackTrace();
		}
	}

	// ********************************************************************************************************************************************
	public void fnContentValidate(String data, By by) throws Exception {
		try {
			WebElement e1 = rdriver.findElement(by);
			// System.out.println("E"+e1.getText());
			String actualString = e1.getText().trim();
			boolean ActualString = actualString.equalsIgnoreCase(data);
			// contains(data);
			System.out.println(">>>>>>>Expected string" + data + ">>>>>>");
			System.out.println(">>>>>>>" + actualString + ">>>>>>");
			// assertTrue(actualString.contains(data));

			if (ActualString) {
				reportiumClient.reportiumAssert("'" + data + "'" + " Content validated successfully", true);
				rdriver.executeScript("mobile:screen:image");
			} else {
				reportiumClient.reportiumAssert("'" + data + "'" + " Content validation failed", false);
			}

		} catch (Exception e) {
			// TODO: handle exception
			reportiumClient.reportiumAssert("'" + data + "'" + " Content validation failed", false);
			e.printStackTrace();
		}
	}

	// ********************************************************************************************************************************************
	public void fnTextContains(String data, By by) throws Exception {
		try {
			WebElement e1 = rdriver.findElement(by);
			data = data.replace(" ", "").trim();
			String actualString = e1.getText().replace(" ", "").trim();

			boolean AS = actualString.equalsIgnoreCase(data);
			System.out.println(">>>>>>>Expected string" + data + ">>>>>>");
			System.out.println(">>>>>>>" + actualString + ">>>>>>");

			if (AS) {
				reportiumClient.reportiumAssert("'" + data + "'" + " Content validated successfully", true);
				rdriver.executeScript("mobile:screen:image");
			} else {
				reportiumClient.reportiumAssert("'" + data + "'" + " Content validation failed", false);
			}

		} catch (Exception e) {
			// TODO: handle exception
			reportiumClient.reportiumAssert("'" + data + "'" + " Content validation failed", false);
			e.printStackTrace();
		}
	}

	// ********************************************************************************************************************************************
	public void fnContentValidation(String data, By by) throws Exception {
		try {
			WebElement e1 = rdriver.findElement(by);
			if (e1.isDisplayed()) {
				String actualString = e1.getText().trim().replace("\n", "").replace(" ", "").replace("  ", "");
				data = data.trim().replace("\n", "").replace(" ", "").replace("  ", "");
				System.out.println(">>>>>>>" + actualString + ">>>>>>");
				
				boolean ActualString = actualString.equalsIgnoreCase(data);
				System.out.println(data);


				if (ActualString) {
					reportiumClient.reportiumAssert("'" + data + "'" + " Content validated successfully", true);
					rdriver.executeScript("mobile:screen:image");
				} else {
					reportiumClient.reportiumAssert("'" + data + "'" + " Content validation failed", false);
				}
			}

		}

		catch (Exception e) {
			// TODO: handle exception
			reportiumClient.reportiumAssert("'" + data + "'" + " Content validation failed", false);
			e.printStackTrace();
		}
	}

	// ********************************************************************************************************************************************
	public void ClickUsingRobo(int x, int y) throws Exception {
		try {
			Robot r = new Robot();
			r.mouseMove(x, y);
			r.mousePress(InputEvent.BUTTON1_MASK);
			r.mouseRelease(InputEvent.BUTTON1_MASK);
			reportiumClient.reportiumAssert("Element Clicked Successfully", true);
		} catch (Exception e) {
			// TODO: handle exception
			reportiumClient.reportiumAssert("Unable to Click the Element", false);
			e.printStackTrace();
		}

	}
	
	public void clickAllowpopup() throws AWTException
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--enable-notifications");
	}

	// ********************************************************************************************************************************************
	public void fnStartsWith(String expected, String actual) throws DocumentException, Exception {

		if (actual.startsWith(expected)) {
			reportiumClient.reportiumAssert(" Verified Successfully", true);
			System.out.println("Starts with Matches");
		} else {

			Assert.fail("Content was not matching-Starts with" + expected + actual);
		}
	}

	// ********************************************************************************************************************************************
	public boolean fnStringContains(String[] exp, String Actual) throws DocumentException, Exception {
		for (int i = 0; i < exp.length; i++) {
			try {
				if (exp[i].toString().contentEquals(Actual)) {
					reportiumClient.reportiumAssert("Verified Successfully", true);
					System.out.println("Content Matches");
					return true;
				}
			}

			catch (Exception e) {
				Assert.fail("Content was not matching with one of the values" + exp[0] + Actual);
				return false;
			}

		}
		return false;

	}

	// ********************************************************************************************************************************************
	public void HardRestrictionValidationminicart(String RestrictionType, String data2, By... by) throws Exception {
		try {
			/* WebDriverWait wait = new WebDriverWait(rdriver, 60); */
			JavascriptExecutor executor = (JavascriptExecutor) rdriver;
			if (RestrictionType.equalsIgnoreCase("Hard")) {

				// Not available for shipment
				fnContentValidation(data2, by[0]);

			}
		} catch (Exception e) {
			System.err.println("Usage: ... [Error textString]..[Error textString]..]");
			reportiumClient.reportiumAssert("Error : On  Verification Failed", false);
		}

	}

	// ********************************************************************************************************************************************
	public int getAllElementsAndSum(By by, String elementname) throws DocumentException, Exception {
		int count = 0;

		try {

			JavascriptExecutor js = (JavascriptExecutor) rdriver;
			/*
			 * WebDriverWait wait = new WebDriverWait(rdriver, 30);
			 * wait.until(ExpectedConditions.visibilityOfElementLocated(by));
			 */
			List<WebElement> element = rdriver.findElements(by);
			int elementSize = element.size();
			System.out.println("eleme" + elementSize);
			List<String> value = new ArrayList<String>();

			for (int j = 0; j < elementSize; j++) {

				String temp = element.get(j).getText();
				System.out.println("temp" + temp);
				count = count + Integer.parseInt(temp.substring(1, temp.length() - 1));
			}
			reportiumClient.reportiumAssert("Verified Successfully", true);
			System.out.println("count inside try" + count);
			return count;
		} catch (Exception e) {
			// TODO: handle exception
			reportiumClient.reportiumAssert("Error : On Verification Failed", false);
			e.printStackTrace();
		}
		System.out.println("count outside try" + count);
		return count;

	}

	// ********************************************************************************************************************************************
	public void click(By by, String text) throws DocumentException, Exception {
		try {
			WebElement e1 = rdriver.findElement(by);
			if (e1.isDisplayed()) {
				Actions actions = new Actions(rdriver);
				actions.moveToElement(e1).click().build().perform();
				reportiumClient.reportiumAssert("Verified Successfully", true);
			}
		}

		catch (Exception e) {
			// TODO: handle exception
			reportiumClient.reportiumAssert("Error : On Verification Failed", false);
			e.printStackTrace();
		}

	}

	// ********************************************************************************************************************************************
	public void validateTableFromWebPage(By by, String text, int orderType, int hyperlink) {

		WebElement mytable = rdriver.findElement(by);
		// To locate rows of table.
		List<WebElement> rows_table = mytable.findElements(By.tagName("tr"));
		// To calculate no of rows In table.
		int rows_count = rows_table.size();
		// Loop will execute till the last row of table.
		System.out.println("-------------------READ STARTED------------------------------- ");
		for (int row = 1; row < rows_count; row++) {
			
			// To locate columns(cells) of that specific row.
			List<WebElement> Columns_row = rows_table.get(row).findElements(By.tagName("td"));

			// To calculate no of columns (cells). In that specific row.
	
			// System.out.println("Number of cells In Row " + row + " are " +
			// columns_count);
			// Loop will execute till the last cell of that specific row.
			String celtext = Columns_row.get(orderType).getText();
			if (celtext.contentEquals(text)) {
				System.out.println("Clicking on View Details");
				// System.out.println("Value"+Columns_row.get(hyperlink).findElement(By.tagName("a")).getText());
				System.out.println("Value2" + Columns_row.get(hyperlink).getText());
				// System.out.println("Value2"+Columns_row.get(hyperlink).findElement(By.linkText("View
				// Details")).getText());
				// Columns_row.get(hyperlink).findElement(By.linkText("View
				// Details")).click();
				Columns_row.get(hyperlink).click();
				break;
			}
		}

	}

	// ********************************************************************************************************************************************
	public HashMap<Integer, ArrayList<String>> readTableFromWebPage(By by) throws DocumentException, Exception {

		HashMap<Integer, ArrayList<String>> map = new HashMap<Integer, ArrayList<String>>();

		// To locate table.
		WebElement mytable = rdriver.findElement(by);
		// To locate rows of table.
		List<WebElement> rows_table = mytable.findElements(By.tagName("tr"));
		// To calculate no of rows In table.
		int rows_count = rows_table.size();
		// Loop will execute till the last row of table.
		System.out.println("-------------------READ STARTED------------------------------- ");
		for (int row = 0; row < rows_count; row++) {
			ArrayList<String> rowData = new ArrayList<String>();

			// To locate columns(cells) of that specific row.
			List<WebElement> Columns_row = rows_table.get(row).findElements(By.tagName("td"));

			// To calculate no of columns (cells). In that specific row.
			int columns_count = Columns_row.size();
			// System.out.println("Number of cells In Row " + row + " are " +
			// columns_count);
			// Loop will execute till the last cell of that specific row.
			for (int column = 0; column < columns_count; column++) {
				// To retrieve text from that specific cell.
				String celtext = Columns_row.get(column).getText();
				rowData.add(celtext);
				// System.out.println("Cell Value of row number " + row + " and
				// column number " + column + " Is " + celtext);
			}
			map.put(row, rowData);
			// System.out.println("--------------------------------------------------
			// ");
		}

		for (Integer key : map.keySet()) {
			if (map.containsKey(key)) {
				System.out.println(key + "    " + map.get(key));
			}
		}
		reportiumClient.reportiumAssert("Alert Text Verified Successfully", true);
		System.out.println("-------------------READ ENDED------------------------------- ");
		return map;

	}

	// ********************************************************************************************************************************************
	public void fnSwitchToPrecedingTab() throws Exception {
		String handle_pointer = "";
		try {
			ArrayList<String> windowHandles = new ArrayList<String>(rdriver.getWindowHandles());
			String handle = rdriver.getWindowHandle();
			int windowHandles_size = windowHandles.size();

			for (int k = 0; k < windowHandles_size; k++) {
				handle_pointer = windowHandles.get(k);
				if (handle_pointer.equals(handle)) {
					// If the first window is selected and to loop around the
					// window, below condition suffice
					if (k == 0) {
						handle_pointer = windowHandles.get(windowHandles_size - 1);
						break;
					}
					// Decrement handler pointer index and grab that handler
					// data from array list
					handle_pointer = windowHandles.get(k - 1);
					break;
				}
			}
			// Switch to previous (or preceding) tab
			rdriver.switchTo().window(handle_pointer);
		} catch (Exception e) {
			// TODO: handle exception
			reportiumClient.reportiumAssert("Unable To Switch To The Preceding Window", false);
			e.printStackTrace();
		}
	}

	// ********************************************************************************************************************************************
	public void fnSwitchToTab(int tabIndex) throws Exception {
		try {
			ArrayList<String> windowHandles = new ArrayList<String>(rdriver.getWindowHandles());
			// Switch to current
			rdriver.switchTo().window(windowHandles.get(tabIndex));
		} catch (Exception e) {
			// TODO: handle exception
			reportiumClient.reportiumAssert("Unable To Switch To " + tabIndex + " tab", false);
			e.printStackTrace();
		}
	}

	// ********************************************************************************************************************************************
	public void fnSwitchToSucceedingTab() throws Exception {
		String handle_pointer = "";
		try {
			ArrayList<String> windowHandles = new ArrayList<String>(rdriver.getWindowHandles());
			String handle = rdriver.getWindowHandle();
			int windowHandles_size = windowHandles.size();

			for (int k = 0; k < windowHandles_size; k++) {
				handle_pointer = windowHandles.get(k);
				if (handle_pointer.equals(handle)) {
					// If the last window is selected and to loop around the
					// window, below condition suffice
					if (k == (windowHandles_size - 1)) {
						handle_pointer = windowHandles.get(0);
						break;
					}
					// Decrement handler pointer index and grab that handler
					// data from array list
					handle_pointer = windowHandles.get(k + 1);
					break;
				}
			}
			// Switch to previous (or preceding) tab
			rdriver.switchTo().window(handle_pointer);
		} catch (Exception e) {
			// TODO: handle exception
			reportiumClient.reportiumAssert("Unable To Switch To The Succeeding Window", false);
			e.printStackTrace();
		}
	}

	// ********************************************************************************************************************************************
	public void fnScrollToView(By by) throws Exception {
		try {

			WebElement e1 = rdriver.findElement(by);

			((JavascriptExecutor) rdriver).executeScript("arguments[0].scrollIntoView(true);", e1);
			Thread.sleep(3000);
		} catch (Exception e) {
			reportiumClient.reportiumAssert("Failed to scroll", false);
			e.printStackTrace();
		}

	}

	// ********************************************************************************************************************************************
	public void fnCloseCurrentTab() {
		rdriver.close();
	}

	// ********************************************************************************************************************************************
	public void fnSwitchToDefaultTab() throws Exception {
		try {
			ArrayList<String> windowHandles = new ArrayList<String>(rdriver.getWindowHandles());
			rdriver.switchTo().window(windowHandles.get(0));
		} catch (Exception e) {
			// TODO: handle exception
			reportiumClient.reportiumAssert("Unable To Switch To The Default Window", false);
			e.printStackTrace();
		}
	}

	// ********************************************************************************************************************************************
	public void browserBack() throws IOException {

		rdriver.navigate().back();
	}

	// ********************************************************************************************************************************************
	public void refresh() {
		rdriver.navigate().refresh();
	}

	// ********************************************************************************************************************************************
	public String getCurrentUrl() throws IOException {
		return rdriver.getCurrentUrl();
	}

	// ********************************************************************************************************************************************
	public String getAttributeValue(By by, String AttributeName) throws IOException {
		return rdriver.findElement(by).getAttribute(AttributeName);
	}

	// ********************************************************************************************************************************************
	public void waitForPageLoad() {
		// FluentWait<WebDriver> wait = getFluentWait();
		WebDriverWait wait = new WebDriverWait(rdriver, 30);
		try {
			Thread.sleep(1000);
			wait.until(new Function<WebDriver, Boolean>() {

				//@Override
				public Boolean apply(WebDriver webDriver) {
					return String.valueOf(((JavascriptExecutor) webDriver).executeScript("return document.readyState"))
							.equals("complete");
				}
			});
		} catch (Exception e) {
		}
	}

	// ********************************************************************************************************************************************
	public WebElement fluentWait(final By by, int pollingValue) {
		List<Class<? extends Throwable>> ignoreExceptionClasses = new ArrayList<Class<? extends Throwable>>();
		ignoreExceptionClasses.add(NoSuchElementException.class);
		ignoreExceptionClasses.add(ElementNotVisibleException.class);
		ignoreExceptionClasses.add(InvalidElementStateException.class);
		ignoreExceptionClasses.add(StaleElementReferenceException.class);
		try {
			// Fluent wait - wait till element is visible - poll for 30 seconds,
			// @ pollingValue second interval
			Wait<WebDriver> wait = new FluentWait<WebDriver>(rdriver).withTimeout(30, TimeUnit.SECONDS)
					.pollingEvery(pollingValue, TimeUnit.SECONDS).ignoreAll(ignoreExceptionClasses);

			WebElement e1 = wait.until(new Function<WebDriver, WebElement>() {
				@Override
				public WebElement apply(WebDriver rdriver) {
					return rdriver.findElement(by);
				}
			});
			return e1;
		} catch (Exception e) {
		}
		return null;
	}

	// ********************************************************************************************************************************************
	public FluentWait<WebDriver> getFluentWait() {
		List<Class<? extends Throwable>> ignoreExceptionClasses = new ArrayList<Class<? extends Throwable>>();
		ignoreExceptionClasses.add(NoSuchElementException.class);
		ignoreExceptionClasses.add(ElementNotVisibleException.class);
		ignoreExceptionClasses.add(InvalidElementStateException.class);
		ignoreExceptionClasses.add(StaleElementReferenceException.class);
		try {
			FluentWait<WebDriver> wait = new FluentWait<WebDriver>(rdriver).withTimeout(60, TimeUnit.SECONDS)
					.pollingEvery(1, TimeUnit.SECONDS).ignoreAll(ignoreExceptionClasses);
			return wait;
		} catch (Exception e) {
		}
		return null;
	}

	// ********************************************************************************************************************************************
	public String capturePageTitle() {
		return rdriver.getTitle();
	}

	// ********************************************************************************************************************************************
	public int fnTotalNumberOfElements(By by, int expectedCount, String elementName) throws Exception {
		List<WebElement> allElements = rdriver.findElements(by);
		int totalCount = allElements.size();
		if (totalCount == expectedCount) {
			reportiumClient.reportiumAssert(elementName + " Actual And Expected Counts Are Identical", true);
		} else {
			reportiumClient.reportiumAssert(elementName + " Actual And Expected Count Does not Match", false);
		}
		return totalCount;
	}

	// ********************************************************************************************************************************************
	public String fnGetAttributeValue(By by, String AttributeName) throws IOException {
		return rdriver.findElement(by).getAttribute(AttributeName);
	}

	// ********************************************************************************************************************************************
	public void closeModalWindow(By by, String elementname) throws Exception {
		try {

			WebElement e1 = rdriver.findElement(by);

			if (e1.isDisplayed()) {
				// Perform click action
				e1.click();
				// Log
				reportiumClient.reportiumAssert(elementname + " modal window is clsoed", true);
			} else {
				// Log
				reportiumClient.reportiumAssert(elementname + " modal window is not Visible", false);
			}
		} catch (Exception e) {
			// TODO: handle exception
			reportiumClient.reportiumAssert(elementname + " modal window is not Visible", false);
			e.printStackTrace();
		}
	}

	// ********************************************************************************************************************************************
	public String getText(By by, String string) {
		// Fetch the requested property
		String textProperty = rdriver.findElement(by).getText();

		// Return the text data of a web element
		return textProperty;
	}

	// ********************************************************************************************************************************************
	public boolean cmpString(String validstring1, String validstring2) throws Exception {
		try {

			if (validstring1.equalsIgnoreCase(validstring2)) {
				// Log
				reportiumClient.reportiumAssert("Source String : " + "'" + validstring1 + "' "
						+ "and Destination String : " + "'" + validstring2 + "'" + " Are Identical", false);
				rdriver.executeScript("mobile:screen:image");
				return true;
			}

			else {
				// Log
				reportiumClient.reportiumAssert("Source String : " + "'" + validstring1 + "' "
						+ "Does Not Match With Destination String : " + "'" + validstring2 + "'", false);

				return false;
			}
		} catch (Exception e) {
			// TODO: handle exception
			reportiumClient.reportiumAssert("Source String : " + "'" + validstring1 + "' "
					+ "Does Not Match With Destination String : " + "'" + validstring2 + "'", false);
			e.printStackTrace();
		}
		return false;
	}

	// ********************************************************************************************************************************************
	public void fnCompareText(String src, String dest) throws Exception {
		try {
			System.out.println(">>>>>>>>>>>" + dest + ">>>>>>>>>>>>>>>>");
			if (src.equals(dest)) {
				reportiumClient.reportiumAssert("Source String : " + "'" + src + "' " + "and Destination String : "
						+ "'" + dest + "'" + " Are Identical", true);
				rdriver.executeScript("mobile:screen:image");
			}
		} catch (Exception e) {
			// TODO: handle exception
			reportiumClient.reportiumAssert("Source String : " + "'" + src + "' "
					+ "Does Not Match With Destination String : " + "'" + dest + "'", false);

			e.printStackTrace();
		}
	}

	// ********************************************************************************************************************************************
	public void imageSizeValidation(By by, int imageWidth, int imageHeight) throws Exception {
		// Gather image data
		WebElement Image = rdriver.findElement(by);

		// Get the image size
		int actual_image_width = Image.getSize().getWidth();
		// Retrieve height of element.
		int actual_image_height = Image.getSize().getHeight();

		try {
			if ((actual_image_width == (imageWidth)) && (actual_image_height == (imageHeight)))

			{
				reportiumClient.reportiumAssert("Image Size Validated Successfully", true);
				rdriver.executeScript("mobile:screen:image");
			} else {
				reportiumClient.reportiumAssert("Image Size Validation Unsuccessful", false);
			}
		} catch (Exception e) {
			// TODO: handle exception
			reportiumClient.reportiumAssert("Image Size Validation Unsuccessful", false);
			e.printStackTrace();
		}
	}

	// ********************************************************************************************************************************************
	public boolean VerifyPageDisplayed(By by) throws Exception {
		try {
			waitForPageLoad();
			WebElement e1 = rdriver.findElement(by);

			if (e1.isDisplayed()) {
				reportiumClient.reportiumAssert("Verify Page Is Displayed", true);
				rdriver.executeScript("mobile:screen:image");
				return true;
			} else {
				reportiumClient.reportiumAssert("Page Is Not Displayed", false);
				return false;
			}
		} catch (Exception e) {
			// TODO: handle exception
			reportiumClient.reportiumAssert("Page Is Not Displayed", false);
			e.printStackTrace();
		}
		return false;
	}

	// ********************************************************************************************************************************************
	public boolean fnVerifyPageDisplayed(By by, String Element) throws Exception {
		try {
			waitForPageLoad();

			WebElement e1 = rdriver.findElement(by);

			if (e1.isDisplayed()) {
				reportiumClient.reportiumAssert("Page Is Displayed", true);
				rdriver.executeScript("mobile:screen:image");
				return true;
			} else {
				reportiumClient.reportiumAssert("Page Is Not Displayed", false);
				return false;
			}
		} catch (Exception e) {
			// TODO: handle exception
			reportiumClient.reportiumAssert("Error while verifying page", false);
			e.printStackTrace();
		}
		return false;
	}

	// ********************************************************************************************************************************************
	public void fn_clickUsingJs(By by, String elementname) throws Exception {
		try {
			WebElement e1 = rdriver.findElement(by);
			JavascriptExecutor executor = (JavascriptExecutor) rdriver;
			executor.executeScript("arguments[0].click();", e1);
			reportiumClient.reportiumAssert("Clicked On " + elementname + " Element.", true);

		} catch (Exception e) {
			// TODO: handle exception
			reportiumClient.reportiumAssert("Failed To Click On " + elementname + " Element.", false);
			e.printStackTrace();
		}
	}

	// ********************************************************************************************************************************************
	public boolean fnVerifyObjectDisplayed(By by, String Element) throws Exception {

		try {
			WebElement e1 = rdriver.findElement(by);

			if (e1.isDisplayed()) {
				reportiumClient.reportiumAssert("Object Is Displayed", true);
				rdriver.executeScript("mobile:screen:image");
			}

			return e1.isDisplayed();
		} catch (Exception e) {
			reportiumClient.reportiumAssert("Failed To Locate The" + Element, false);
			return false;
		}
	}

	// ********************************************************************************************************************************************
	public void fnVerifyPageDisplayedUsingPageTitle(String title, String pageName) throws Exception {
		try {
			waitForPageLoad();
			String pageTitle = rdriver.getTitle();
			if (pageTitle.toUpperCase().contains(title.toUpperCase())) {
				reportiumClient.reportiumAssert(pageName + "page is Displayed", true);
				rdriver.executeScript("mobile:screen:image");

			} else {
				reportiumClient.reportiumAssert(pageName + "page is not Displayed", false);
			}

		} catch (Exception e) {
			// TODO: handle exception
			reportiumClient.reportiumAssert(pageName + "page is not Displayed", false);
			e.printStackTrace();
		}
	}

	// ********************************************************************************************************************************************
	public void ExtractTextFromObject(By by, String elementname, String data) throws Exception {
		try {
			/* test.log(Status.INFO, "Verify is Element Visible_  " + data); */

			WebElement e1 = rdriver.findElement(by);
			String message = e1.getText();
			if ((message.replace("\n", " ")).equalsIgnoreCase(data)) {
				reportiumClient.reportiumAssert("Extracted Attribute " + elementname + " Successfully", true);
				/* test.log(Status.PASS, elementname + " is Visible"); */
			} else {
				reportiumClient.reportiumAssert("Failed to Locate " + elementname, false);
			}
		} catch (Exception e) {
			// TODO: handle exception
			reportiumClient.reportiumAssert("Failed to Locate " + elementname, false);
			e.printStackTrace();
		}
	}

	// ********************************************************************************************************************************************
	public void launchUrl(String url) throws Exception {
		try {
			// Fetch url
			rdriver.get(url);
			// Log
			reportiumClient.reportiumAssert("Launched URL " + url + " Successfully", true);
			rdriver.executeScript("mobile:screen:image");
		} catch (Exception e) {
			// Log
			reportiumClient.reportiumAssert("Launched URL " + url + " Successfully", false);
			e.printStackTrace();
		}
	}

	// ********************************************************************************************************************************************
	public void ExtractAttributeFromObject(By by, String attributeName, String elementname, String data)
			throws Exception {
		try {
			/* test.log(Status.INFO, "Verify is Element Visible_  " + data); */

			WebElement e1 = rdriver.findElement(by);
			String message = e1.getAttribute(attributeName).replace("-", "");
			if ((message.trim()).equalsIgnoreCase(data)) {
				reportiumClient.reportiumAssert("Extracted Attribute " + elementname + " Successfully", true);
				rdriver.executeScript("mobile:screen:image");
			} else {
				reportiumClient.reportiumAssert("Failed to Extract attribute from " + elementname, false);
			}
		} catch (Exception e) {
			// TODO: handle exception
			reportiumClient.reportiumAssert("Failed to Extract attribute from " + elementname, false);
			e.printStackTrace();
		}
	}

	// ********************************************************************************************************************************************
	public void SelectByOption(By by, String data) throws Exception {
		try {
			// WebDriverWait wait = new WebDriverWait(rdriver, 30);
			WebElement e1 = rdriver.findElement(by);
			// wait.until(ExpectedConditions.visibilityOfElementLocated(by));
			if (e1.isDisplayed()) {
				if (!isSafari) {
					e1.click();
					e1.sendKeys(data);
					Thread.sleep(2000);
					e1.sendKeys(Keys.ENTER);
				} else {
					jsSelect(by, data);
				}

			}
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	// ********************************************************************************************************************************************
	public void jsSelect(By by, String data) throws Exception {

		try {

			WebElement e1 = rdriver.findElement(by);
			JavascriptExecutor executor = (JavascriptExecutor) rdriver;
			executor.executeScript(
					"const textToFind = '" + data + "';" + "const dd = arguments[0];"
							+ "dd.selectedIndex = [...dd.options].findIndex (option => option.text === textToFind);",
							e1);
			reportiumClient.reportiumAssert("Select " + data + " From dropdown", true);
		}

		catch (Exception e) {
			// TODO: handle exception
			reportiumClient.reportiumAssert("Select " + data + " From dropdown", false);
			e.printStackTrace();
		}

	}

	// ********************************************************************************************************************************************
	public void enterTab() {
		Actions action = new Actions(rdriver);
		action.sendKeys(Keys.TAB);
	}

	// ********************************************************************************************************************************************

	public boolean isAlertPresent() {
		boolean foundAlert = false;

		WebDriverWait wait = new WebDriverWait(rdriver, 10);
		try {
			wait.until(ExpectedConditions.alertIsPresent());
			foundAlert = true;
		} catch (Exception e) {
			System.out.println("Alert is not present");
		}
		return foundAlert;

	}

	// ********************************************************************************************************************************************
	public void fnclickUsingJs(By by, String elementname) throws Exception {
		try {

			WebElement e1 = rdriver.findElement(by);
			JavascriptExecutor executor = (JavascriptExecutor) rdriver;
			executor.executeScript("arguments[0].click();", e1);
			reportiumClient.reportiumAssert("Clicked On " + elementname + " Element.", true);
		} catch (Exception e) {
			// TODO: handle exception
			reportiumClient.reportiumAssert("Failed To Click On " + elementname + " Element.", false);
			e.printStackTrace();
		}
	}

	// ********************************************************************************************************************************************
	public String[] fnConvertStringToStringArray(String text) {
		String[] str = text.split(",");
		return str;
	}

	// ********************************************************************************************************************************************
	public String getText(By by) {
		// Fetch the requested property
		String textProperty = rdriver.findElement(by).getText();

		// Return the text data of a web element
		return textProperty;
	}

	// ********************************************************************************************************************************************
	public void fninputTextSendkeys(By by, String elementname, String data) throws Exception {
		try {
			Thread.sleep(2000);
			// Action Class
			rdriver.findElement(by).sendKeys(data);
			reportiumClient.reportiumAssert(
					"'" + data + "'" + " Entered In " + elementname + " Text Field Successfully.", true);

		} catch (Exception e) {
			// TODO: handle exception
			reportiumClient.reportiumAssert("Failed To Locate " + elementname + " Text field.", false);
			e.printStackTrace();
		}
	}


	// ********************************************************************************************************************************************
	public void fnContentValidation(String data, By by, String value) throws Exception {
		try {
			WebElement e1 = rdriver.findElement(by);
			if (e1.isDisplayed()) {
				String actualString = e1.getText().trim();
				data = data.trim();

				System.out.println(">>>>>>>" + actualString + ">>>>>>");

				if (actualString.equalsIgnoreCase(data)) {
					reportiumClient.reportiumAssert("'" + value + "'" + " displayed successfully", true);
				} else {
					reportiumClient.reportiumAssert("'" + value + "'" + "  validation failed", false);

				}

			}
		}

		catch (Exception e) {
			// TODO: handle exception
			reportiumClient.reportiumAssert("'" + value + "'" + " Is Not Present In Element", false);
			e.printStackTrace();
		}
	}

	// ********************************************************************************************************************************************
	public void logResult(boolean result, String statement) throws Exception {
		try {
			if (result == true) {
				reportiumClient.reportiumAssert("statement", true);

			} else {
				reportiumClient.reportiumAssert("statement", false);
			}
		} catch (Exception e) {

			reportiumClient.reportiumAssert("statement", false);

			e.printStackTrace();
		}
	}


	// ********************************************************************************************************************************************
	public void fnContentValidateJS(String data, By by) throws Exception {
		try {

			WebElement e1 = rdriver.findElement(by);
			if (e1.isDisplayed()) {
				JavascriptExecutor js = (JavascriptExecutor) rdriver;
				String text = js.executeScript("return document.documentElement.innerText;").toString();
				assertTrue(text.contains(data));
				reportiumClient.reportiumAssert("Verified the text" + data + " Successfully.", true);
			}
		} catch (Exception e) {
			reportiumClient.reportiumAssert("Contents Validation Unsuccessful", false);
			e.printStackTrace();
		}
	}

	// ********************************************************************************************************************************************
	public String getCurrentDate() {
		String str = "";
		try {
			// Updated @ 11/1/2018 - changed from (MM/dd/YY) to (M/d/yy))
			SimpleDateFormat sdf = new SimpleDateFormat("M/d/yy");
			str = sdf.format(System.currentTimeMillis());
			// System.out.println("formatted date in mm/dd/yy : " + str);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return str;
	}

	// ********************************************************************************************************************************************
	public String fnGetListOfValuesFromDropdown(By by, String elementname) throws Exception {
		String str = "";
		try {
			// WebElement e1 = fluentWait(by, 2);
			/*
			 * WebDriverWait wait = new WebDriverWait(rdriver, 30);
			 * wait.until(ExpectedConditions.visibilityOfElementLocated(by));
			 */
			WebElement e1 = rdriver.findElement(by);
			if (e1.isDisplayed()) {
				Select se = new Select(e1);

				List<WebElement> allOptions = se.getOptions();
				for (int j = 0; j < allOptions.size(); j++) {
					str = str + allOptions.get(j).getText() + " ";
				}
				str = str.substring(0, str.length()).trim();
				System.out.println(str);
				reportiumClient.reportiumAssert(elementname + "dropdown values are retrieved", true);

			}
		} catch (Exception e) {
			// TODO: handle exception
			reportiumClient.reportiumAssert("Failed to retrieve dorpdown values for " + elementname, false);

			e.printStackTrace();
		}
		return str;
	}

	// ********************************************************************************************************************************************
	public void fnRemoveDuplicates(By by, String elementname) throws Exception {

		try {
			// WebElement e1 = fluentWait(by, 2);
			/*
			 * WebDriverWait wait = new WebDriverWait(rdriver, 30);
			 * wait.until(ExpectedConditions.visibilityOfElementLocated(by));
			 */
			WebElement e1 = rdriver.findElement(by);
			if (e1.isDisplayed()) {
				String actualString = e1.getText().trim();
				char[] AS = actualString.toCharArray();// Converting it to
				// Character from a
				// string
				List<Character> listForm = new ArrayList<>();
				List<Character> LinkedlistForm = new LinkedList<>();
				Set<Character> Duplicates = new HashSet<>(); // HashSet Gives
				// the Random
				// ordered
				// output
				Set<Character> DuplicatesTreeset = new TreeSet<>();
				Set<Character> DuplicatesLinkedHashset = new LinkedHashSet<>();// TreeSet
				// Gives
				// the
				// output
				// as
				// Alphabet
				// order
				// by
				// removing
				// Duplicates
				for (char c : AS) {
					Duplicates.add(c);
					DuplicatesTreeset.add(c);
					DuplicatesLinkedHashset.add(c);
					listForm.add(c);
					LinkedlistForm.add(c);
				}

				System.out.println("HashSet" + Duplicates);
				System.out.println("TreeSet" + DuplicatesTreeset);
				System.out.println("LinkedhashSet" + DuplicatesLinkedHashset);
				System.out.println("ArrayList" + listForm);
				System.out.println("LinkedList" + LinkedlistForm);
				reportiumClient.reportiumAssert(elementname + "dropdown values are retrieved" + elementname, true);

			}
		} catch (Exception e) {
			// TODO: handle exception
			reportiumClient.reportiumAssert("Failed to retrieve dorpdown values for " + elementname, false);

			e.printStackTrace();
		}
	}

	// ********************************************************************************************************************************************
	public void StringShouldContain(String Parent, String Child) throws Exception {
		try {
			// Validate Substring in a String
			if (Parent.contains(Child)) {
				reportiumClient.reportiumAssert("String " + Parent + " Contains " + Child + " Substring", true);

			} else {
				reportiumClient.reportiumAssert("String " + Parent + " doesn't contain " + Child + " Substring", false);

			}
		} catch (Exception e) {
			reportiumClient.reportiumAssert("String " + Parent + " doesn't contain " + Child + " Substring", false);

			e.printStackTrace();
		}
	}

	// ********************************************************************************************************************************************
	public String randomIdentifier() {
		final String lexicon = "ABCDEFGHIJKLMNOPQRSTUVWXYZ12330674890";
		final java.util.Random rand = new java.util.Random();
		// consider using a Map<String,Boolean> to say whether the identifier is
		// being used or not
		final Set<String> identifiers = new HashSet<String>();
		StringBuilder builder = new StringBuilder();
		while (builder.toString().length() == 0) {
			int length = rand.nextInt(5) + 5;
			for (int i = 0; i < length; i++) {
				builder.append(lexicon.charAt(rand.nextInt(lexicon.length())));
			}
			if (identifiers.contains(builder.toString())) {
				builder = new StringBuilder();
			}
		}
		return builder.toString();
	}

	// ********************************************************************************************************************************************
	public void imageValidationThroughAltAttribute(By by, String elementname, String verifyText) throws Exception {
		try {
			String actual_txt = getAttributeValue(by, "alt");
			if (actual_txt.equals(verifyText)) {
				reportiumClient.reportiumAssert("Warning Message Validated Successfully", true);
			} else {
				reportiumClient.reportiumAssert("Warning Message Validated Unsuccessful", false);
			}
		} catch (Exception e) {
			// TODO: handle exception
			reportiumClient.reportiumAssert("Error while retrieving " + elementname, false);
		}
	}

	// ********************************************************************************************************************************************
	public void getExtractAttributeValue(By by, String value, String Attributevalue) throws Exception {
		try {
			WebElement e1 = rdriver.findElement(by);
			if (e1.isDisplayed()) {
				String actualString = getAttributeValue(by, Attributevalue);

				// Assert.assertEquals(actualString,value);
				if (actualString.equalsIgnoreCase(value)) {
					reportiumClient.reportiumAssert(value + " Is Presents In Element", true);
				} else {
					reportiumClient.reportiumAssert(value + " Is not Presents", false);

				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			reportiumClient.reportiumAssert(value + " Is not Presents", false);
			e.printStackTrace();
		}
	}

	// ********************************************************************************************************************************************
	public void fnContentValidation1(By by,String data) throws Exception {
		try {

			// fnSwitchToNewwindow();
			WebElement e1 = rdriver.findElement(by);
			if (e1.isDisplayed()) {
				String actualString = e1.getText().trim();
				System.out.println(">>>>>>>" + actualString + ">>>>>>>>>>");
				assertTrue(actualString.equalsIgnoreCase(data.trim()));
				reportiumClient.reportiumAssert("'" + data + "'" + " Content validated successfully", true);

			}
			// fnCloseCurrentTab();
			// fnSwitchToDefaultTab();

		} catch (Exception e) {
			// TODO: handle exception
			reportiumClient.reportiumAssert("'" + data + "'" + " Content validation UnSuccessfull", false);
			e.printStackTrace();

		}
	}

	// ********************************************************************************************************************************************
	public void fnSwitchToNewwindow() throws Exception {
		ArrayList<String> windowHandles = new ArrayList<String>(rdriver.getWindowHandles());
		Set<String> handles = rdriver.getWindowHandles();
		String firstWinHandle = rdriver.getWindowHandle();
		try {
			handles.remove(firstWinHandle);
			String winHandle = (String) handles.iterator().next();
			if (winHandle != firstWinHandle) {
				// To retrieve the handle of second window, extracting the
				// handle which does not match to first window handle
				String secondWinHandle = winHandle; // Storing handle of second
				// window handle
				// Switch control to new window
				rdriver.switchTo().window(secondWinHandle);
			}
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	// ********************************************************************************************************************************************
	// ********************************************************************************************************************************************
	public void fnPageDownusingActionClass() {
		Actions action = new Actions(rdriver);
		action.sendKeys(Keys.DOWN);

	}

	// ********************************************************************************************************************************************
	public void fnPageEndusingActionClass() {
		Actions action = new Actions(rdriver);
		action.sendKeys(Keys.END);
	}

	// ********************************************************************************************************************************************
	public void fnPageUpusingActionClass() {
		Actions action = new Actions(rdriver);
		action.sendKeys(Keys.UP);
	}

	// ********************************************************************************************************************************************
	public void fnVerifyTextFromAlert(String data) throws Exception {
		try {
			WebDriverWait wait = new WebDriverWait(rdriver, 30);
			wait.until(ExpectedConditions.alertIsPresent());
			Alert alt = rdriver.switchTo().alert();
			Thread.sleep(1000);
			System.out.println(alt.getText());
			if (data.equalsIgnoreCase(alt.getText())) {
				reportiumClient.reportiumAssert("Alert Text Verified Successfully", true);
			} else {
				// test.fail("Screenshot below: " +
				// test.addScreenCaptureFromPath(takeScreenShot("Validated
				// Alert")));
				reportiumClient.reportiumAssert("Alert Text Verification Failed", false);
			}
		} catch (UnhandledException e) {
			// TODO: handle exception
			reportiumClient.reportiumAssert("Alert Text Verification Failed", false);
			e.printStackTrace();
		}
	}
	// ********************************************************************************************************************************************

	public void closeAllBrowser() throws Exception {
		try {
			rdriver.close();
			reportiumClient.reportiumAssert("Closed All Browser Successfully", true);

		} catch (Exception e) {
			// TODO: handle exception
			reportiumClient.reportiumAssert("Failed To Close All Browser", false);

			e.printStackTrace();
		}
	}

	// ********************************************************************************************************************************************
	public boolean VerifyObjectDisplayed(By by) throws Exception {

		try {
			WebElement e1 = rdriver.findElement(by);

			if (e1.isDisplayed()) {
				reportiumClient.reportiumAssert("Verify Object Displayed", true);
				rdriver.executeScript("mobile:screen:image");

			}
			return e1.isDisplayed();
		} catch (Exception e) {
			reportiumClient.reportiumAssert("Failed to Identify an Object", false);

			return false;
		}
	}

	// ********************************************************************************************************************************************
	boolean testStop_isCalled = false;

	public void fnCatchBlock(Exception e) throws IOException {

		reportiumClient.testStop(TestResultFactory.createFailure(e.getMessage(), e));
		e.printStackTrace();
		testStop_isCalled = true;
		
		
	}

	// ********************************************************************************************************************************************
	public void fnFinalBlock() throws IOException {
		try {
			if (testStop_isCalled == false)

			{
				reportiumClient.testStop(TestResultFactory.createSuccess());
			}
			
			PerfectoLabUtils.downloadReport(rdriver, "pdf", Constants.Report_URL);

			rdriver.quit();

			// Retrieve the URL to the DigitalZoom Report (= Reportium
			// Application) for an aggregated view over the execution
			String reportURL = reportiumClient.getReportUrl();
			System.out.println("***reportURL****" + reportURL);
			// Retrieve the URL to the Execution Summary PDF Report

			String reportPdfUrl = (String) (rdriver.getCapabilities().getCapability("reportPdfUrl"));
			// For detailed documentation on how to export the Execution
			// Summary PDF Report, the Single Test report and other
			// attachments such as
			// video, images, device logs, vitals and network files - see
			// http://developers.perfectomobile.com/display/PD/Exporting+the+Reports
			System.out.println("***reportPdfUrl****" + reportPdfUrl);
		} 
		catch (Exception e) {
			
						e.printStackTrace();
		}
	}
	// ********************************************************************************************************************************************
	//Find Elements
	public List<WebElement> findElementsList(By by){
		return rdriver.findElements(by);
	}

	// ********************************************************************************************************************************************
	public void fnElementScreenShot(By by, String BrandName, String SGW) throws Exception
	{
		WebElement ele = rdriver.findElement(by);

		File screenshot = ele.getScreenshotAs(OutputType.FILE);

		/*// Get entire page screenshot
		File screenshot = ((TakesScreenshot)rdriver).getScreenshotAs(OutputType.FILE);
		BufferedImage  fullImg = ImageIO.read(screenshot);

		// Get the location of element on the page
		Point point = ele.getLocation();

		// Get width and height of the element
		int eleWidth = ele.getSize().getWidth();
		int eleHeight = ele.getSize().getHeight();

		// Crop the entire page screenshot to get only element screenshot
		try{
			BufferedImage eleScreenshot= fullImg.getSubimage(point.getX(), point.getY(),eleWidth, eleHeight);

			ImageIO.write(eleScreenshot, "png", screenshot);
		}
		catch(RasterFormatException ignoRasterFormatException){
			System.out.println("Ignore Exception");
		}*/
		// Copy the element screenshot to disk
		FileUtils.copyFile(screenshot, new File("./src/test/resources/TextDetectionScreenshot/SGW.png"));


		SharpenedImageClass(BrandName);

		Tesseract tesseract = new Tesseract(); 
		tesseract.setDatapath("./src/test/resources/tessdata"); 

		// the path of your tess data folder 
		// inside the extracted file 
		String text;
		try {
			text = tesseract.doOCR(new File("./src/test/resources/TextDetectionScreenshot/SGWResizeImage.png"));
			System.out.print(text); 
			String SGWmessage=text.replace("\n", " ");
			fnCompareText(SGWmessage,SGW);
		} catch (TesseractException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

	}
	// ********************************************************************************************************************************************
	public static void SharpenedImageClass(String BrandName) {

		try{
			// For proper execution of native libraries
			// Core.NATIVE_LIBRARY_NAME must be loaded before
			// calling any of the opencv methods
			System.load("C:/opencv/build/java/x64/opencv_java342.dll");

			//Storing Captured image in source MAt file
			Mat source =Imgcodecs.imread("./src/test/resources/TextDetectionScreenshot/SGW.png", Imgcodecs.CV_LOAD_IMAGE_COLOR);
			//Creating Empty Mat file to save resized image
			Mat resizeImage = new Mat();
			if(BrandName.equalsIgnoreCase(Constants.Brand_LuckyStrike))
			{
				Imgproc.resize(source, resizeImage, new Size(Constants.Dim_Width, Constants.Dim_HeightLuckyStrike));
			}
			else
			{

				Imgproc.resize(source, resizeImage, new Size(Constants.Dim_Width,Constants.Dim_HeightAllBrands));
			}
			Mat destination = new Mat(source.rows(), source.cols(), source.type());
			imwrite("./src/test/resources/TextDetectionScreenshot/SGWResizeImage.png", resizeImage);
			Imgproc.cvtColor(resizeImage, resizeImage, Imgproc.COLOR_BGR2GRAY);

			//Removes Noices from Images using GassianBlur filter
			Imgproc.GaussianBlur(resizeImage, destination, new Size(0,0), 10);

			Core.addWeighted(resizeImage, 1.5, destination, -0.5, 0, destination);

			// writing output image
			Imgcodecs.imwrite("./src/test/resources/TextDetectionScreenshot/SGWResizeImage.png", destination);
		}catch (Exception e) {
		}
	}
	// ********************************************************************************************************************************************
	public boolean fnVerifyObjectDisplayedNegativeValidation(By by) throws Exception {


		WebElement e1 = rdriver.findElement(by);

		if (e1.isDisplayed()) {
			rdriver.executeScript("mobile:screen:image");
		}
		return e1.isDisplayed();
	}

	// ********************************************************************************************************************************************
	public void VerifyElementNotVisible(By by, String elementname) throws Exception {
		try {
			WebElement e1 = rdriver.findElement(by);
			if (!(e1.isDisplayed())) {
				reportiumClient.reportiumAssert(elementname + " Element Is not Visible", true);
				rdriver.executeScript("mobile:screen:image");

			}
		} catch (NoSuchElementException e) {
			// TODO: handle exception
			reportiumClient.reportiumAssert(elementname + " Element Is not Visible", true);

		}
	}

	// ********************************************************************************************************************************************
	public boolean IsSelected(By by, String elementname) throws Exception {
		try {
			@SuppressWarnings("unused")
			JavascriptExecutor js = (JavascriptExecutor) rdriver;
			WebElement e1 = rdriver.findElement(by);
			if (e1.isDisplayed()) {
				if (e1.isSelected()) {
					return true;
				}
				return false;
			}
			return false;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}
	}

	// ********************************************************************************************************************************************

	public void clickbuttonTillElementValueReaches(By by, int elementValue, String elementname) throws Exception {
		// Click Button
		try {
			//fnStartWatch();
			WebDriverWait wait = new WebDriverWait(rdriver, 45);
			wait.until(ExpectedConditions.visibilityOfElementLocated(by));
			WebElement e1 = rdriver.findElement(by);
			if (e1.isDisplayed()) {
				Actions actions = new Actions(rdriver);
				for (int i = 0; i < elementValue; i++) {
					actions.moveToElement(e1).click().build().perform();
				}
				reportiumClient.reportiumAssert(elementname + " Element Is  Visible", true);

			}
		} catch (Exception e) {
			// TODO: handle exception
			reportiumClient.reportiumAssert(elementname + " Element Is  Visible", false);

		}
	}

	public void verifyCurrentURLInPage(String url)
	{
		rdriver.get(url);
		try
		{

			if (rdriver.getCurrentUrl().equalsIgnoreCase(url))
			{

				reportiumClient.reportiumAssert(url +" URL Is Verified", true);
				rdriver.executeScript("mobile:screen:image");
			}
		}
		catch(Exception e)
		{
			reportiumClient.reportiumAssert(url + " URL Is not verified", false);
			rdriver.executeScript("mobile:screen:image");

		}

	}

	public void ClearText(By by, String elementname) throws Exception {
		try {
			WebElement e1 = rdriver.findElement(by);
			if (e1.isDisplayed()) {
				Actions actions = new Actions(rdriver);
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

	public void VerifyObjectNotVisible(By by, String elementname) throws Exception {
		try {

			WebElement e1 = rdriver.findElement(by);

			if (e1.isDisplayed()) {
				reportiumClient.reportiumAssert(elementname + " Element Is Visible", false);
				rdriver.executeScript("mobile:screen:image");

			}
		} catch (NoSuchElementException e) {
			// TODO: handle exception
			reportiumClient.reportiumAssert(elementname + " Element Is not Visible", true);
			rdriver.executeScript("mobile:screen:image");

		}
	}
	
	public boolean verifyobjectisnotavailable(By by,String elementname){

		List<WebElement> e1 = rdriver.findElements(by);
		if (e1.size() == 0)
		{
			reportiumClient.reportiumAssert(elementname + " is not visible", true);
			System.out.println(elementname+" is not visible");
			rdriver.executeScript("mobile:screen:image");
		
			return true;
			
		}
			
		else
		{
			reportiumClient.reportiumAssert(elementname + " is visible", false);
		
			System.out.println(elementname+" is visible");
			rdriver.executeScript("mobile:screen:image");
			return false;
		}
			

	} 



	public void VerifyObjectNotDisplayed(By by, String elementname) throws Exception {

		try {

			WebElement	e1 = rdriver.findElement(by);
			System.out.println(elementname + " is Displayed");
			reportiumClient.reportiumAssert(elementname + " Element Is Visible", false);
			rdriver.executeScript("mobile:screen:image");

		}catch(Exception e) {
			System.out.println(elementname + " is NOT Displayed");
			reportiumClient.reportiumAssert(elementname + " Element Is not Visible", true);
			rdriver.executeScript("mobile:screen:image");

		}


	}	  

	public void enterEsc() {
		Actions action = new Actions(rdriver);
		action.sendKeys(Keys.ESCAPE);
	}

	public void fnCompareTextIgnoreCase(String src, String dest) throws Exception {
		try {
			System.out.println(">>>>>>>>>>>" + dest + ">>>>>>>>>>>>>>>>");
			if (src.equalsIgnoreCase(dest)) {
				reportiumClient.reportiumAssert("Source String : " + "'" + src + "' " + "and Destination String : "
						+ "'" + dest + "'" + " Are Identical", true);
				rdriver.executeScript("mobile:screen:image");
			}
		} catch (Exception e) {
			// TODO: handle exception
			reportiumClient.reportiumAssert("Source String : " + "'" + src + "' "
					+ "Does Not Match With Destination String : " + "'" + dest + "'", false);

			e.printStackTrace();
		}
	}


	public boolean verifyobjectisnotavailable(By by) {
		
		List<WebElement> e1 = rdriver.findElements(by);
		if (e1.size() == 0)
		{
			
			
			rdriver.executeScript("mobile:screen:image");
		
			return true;
			
		}
			
		else
		{
			
			rdriver.executeScript("mobile:screen:image");
			return false;
		}
	}
	
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

	// ********************************************************************************************************************************************
	// ********************************************************************************************************************************************
	// ********************************************************************************************************************************************
	// ********************************************************************************************************************************************
	// ********************************************************************************************************************************************
	// ********************************************************************************************************************************************
	// ********************************************************************************************************************************************
	// ********************************************************************************************************************************************
	// ********************************************************************************************************************************************
	// ********************************************************************************************************************************************

}