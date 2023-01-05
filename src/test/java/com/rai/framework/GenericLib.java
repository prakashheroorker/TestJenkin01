package com.rai.framework;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;
import java.util.Base64;
import java.util.HashMap;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.UnhandledException;
import org.apache.commons.lang3.time.StopWatch;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.InvalidElementStateException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


import com.itextpdf.text.pdf.PdfWriter;

//ITextPDF Imports
import com.google.common.base.Function;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.draw.LineSeparator;


//BaseClass Imports


import org.openqa.selenium.remote.HttpCommandExecutor;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.http.HttpClient.Factory;
import org.openqa.selenium.remote.internal.OkHttpClient;
import org.openqa.selenium.remote.CommandInfo;
import org.openqa.selenium.Platform;
import java.util.*;
import java.net.*;


public class GenericLib extends BaseClass 
{
	//********************************************************************
	//Declarations
	//********************************************************************
	static String ClassName;

	static String TestCaseName;

	static File FILE;

	static File imFILE;

	StopWatch pageLoad = new StopWatch();
	StopWatch timer = new StopWatch();

	/**
	 * Document
	 */
	Document document;

	/**
	 * PdfWriter
	 */
	PdfWriter writer;

	/**
	 * PdfPTables
	 */
	PdfPTable statusTable;

	/**
	 * PdfCell
	 */
	PdfPCell cell;

	/**
	 * Overall Run Result
	 */
	public static boolean overalRunResultFlag = false;

	//*******************************
	//Date Declarations For Run Summary
	//*******************************
	static java.util.Date runStartTimeStamp = new java.util.Date();
	static String[] date1 = runStartTimeStamp.toString().split(" ");
	static String[] date2 = date1[3].split(":");
	static String dateval = date2[0] + date2[1] + date2[2];

	//Current Directory
	private static String currentDir = System.getProperty("user.dir");

	//Dynamic Report Folder Path
	private static String dateFolder;

	//********************************************************************
	//Constructor
	//********************************************************************

	@SuppressWarnings("static-access")
	public GenericLib(String testCaseName) throws MalformedURLException, DocumentException, Exception
	{
		this.ClassName = testCaseName;
		String BrowserName = Constants.BROWSERNAME;
		if (BrowserName.equalsIgnoreCase("Chrome")) 
		{

			System.setProperty("webdriver.chrome.driver", "./src/test/resources/driver/chromedriver.exe");
			rdriver = new ChromeDriver();
			// Dimension dim=new Dimension(1200,768);
			//rdriver.manage().window().setSize(dim);

			LogResult_and_CaptureImage("PASS", "Launch Application", "Executing Script On Chrome", "NO");

		} 
		else if (BrowserName.equalsIgnoreCase("IE")) 
		{
			DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
			capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
			capabilities.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
			//browser.executeScript("document.body.style.transform='scale(0.9)';");
			capabilities.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION, true);
			capabilities.setCapability("allow-blocked-content", true);
			capabilities.setCapability("allowBlockedContent", true);

			System.setProperty("webdriver.ie.rdriver", "C:/IAS/IAS_Selenium/Packages/Test_Libraries/IEDriverServer.exe");

			rdriver = new InternetExplorerDriver(capabilities);

			rdriver.manage().window().maximize();

			LogResult_and_CaptureImage("PASS", "Launch Application", "Executing Script On IE", "NO");
		} 
		else if (BrowserName.equalsIgnoreCase("Firefox")) 
		{

			System.setProperty("webdriver.gecko.rdriver", "C:/IAS/IAS_Selenium/Packages/Test_Libraries/geckodriver.exe");
			DesiredCapabilities capabilities = DesiredCapabilities.firefox();
			capabilities.setCapability("dom.webnotifications.enabled", false);

			rdriver = new FirefoxDriver();
			//Code for authentication required pop up
			if(isAlertPresent()){
				System.out.println("Alert is present");
				confirmAlert("", "");}
			else
			{
				System.out.println("Alert is not present");
			}

			rdriver.manage().window().maximize();
			LogResult_and_CaptureImage("PASS", "Launch Application", "Executing Script On FireFox", "NO");


		}
		else if (BrowserName.equalsIgnoreCase("Edge")) 
		{

			System.setProperty("webdriver.edge.rdriver", "C:/IAS/IAS_Selenium/Packages/Test_Libraries/MicrosoftWebDriver.exe");
			rdriver = new EdgeDriver();
			rdriver.manage().window().maximize();
			LogResult_and_CaptureImage("PASS", "Launch Application", "Executing Script On Edge", "NO");
		}
	}
	
	public GenericLib()
	{
		
	}

	

	//******************************************************************************************************************************
	//ScreenShot function
	//******************************************************************************************************************************
	protected static String takeScreenshot()
	{
		//****************************************************************************
		//Folder path creation
		//****************************************************************************
		//If Images folder is not present create an image folder in current directory
		imFILE = new File(currentDir +"\\images");
		if (!imFILE.exists())
		{
			imFILE.mkdir();
		}

		//If Screenshots folder is not present, then create a screenshot folder in current directory
		imFILE = new File(currentDir + "\\images\\Screenshots");
		if (!imFILE.exists())
		{
			imFILE.mkdir();
		}

		//****************************************************************************

		//Image Time Stamp
		java.util.Date imgTimeStamp = new java.util.Date();
		String[] imgdate1 = imgTimeStamp.toString().split(" ");
		String[] imgdate2 = imgdate1[3].split(":");
		String imgdateval = imgdate2[0] + imgdate2[1] + imgdate2[2]; 

		//ImagePath
		String imgPath = currentDir +"\\images\\ScreenShots\\page_"+imgdate1[1] + imgdate1[2] + imgdateval+".jpeg";

		//****************************************************************************

		//GetScreenShot Method Directory and Image File
		File getSreenShotMethodImageFile = new File (imgPath);

		//Take Screenshot of viewable area
		File scrFile = ((TakesScreenshot)rdriver).getScreenshotAs(OutputType.FILE);
		//Write Screenshot to a file
		try 
		{
			FileUtils.copyFile(scrFile, getSreenShotMethodImageFile);
		} 
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return imgPath;
	}

	//******************************************************************************************************************************
	//******************************************************************************************************************************
	//******************************************************************************************************************************
	//Reporting Functiions
	//******************************************************************************************************************************
	//******************************************************************************************************************************
	//******************************************************************************************************************************

	//******************************************************************************************************************************
	//Start Report
	//******************************************************************************************************************************

	@SuppressWarnings("static-access")
	public void start_report(String TestCaseName)
	{	

		this.TestCaseName = TestCaseName;
		pageLoad.reset();
		pageLoad.start();

		//****************************************************************************
		//Folder Path Creation
		//****************************************************************************

		//Create pdf_Reports folder if it is not created
		this.FILE = new File(currentDir+"\\Pdf_Reports");
		if (!this.FILE.exists())
		{
			this.FILE.mkdir();
		}

		this.dateFolder = currentDir+"\\Pdf_Reports\\"+this.date1[1]+"_"+this.date1[2]+"_"+this.date1[5];

		this.FILE = new File(dateFolder);
		if (!this.FILE.exists())
		{
			this.FILE.mkdir();
		}

		//Create page specific folder 
		this.FILE = new File(dateFolder+"\\"+this.ClassName);
		if (!this.FILE.exists())
		{
			this.FILE.mkdir();
		}
		try
		{
			this.document = new Document(PageSize.A4);
			writer = PdfWriter.getInstance(document, new FileOutputStream(new File(dateFolder+"\\"+this.ClassName+"\\"+this.TestCaseName+ "_" + date1[1] + date1[2] + dateval +".pdf")));
			/*PdfWriter.getInstance(document, new FileOutputStream(new File (FILE)));*/
			document.open();

			//***************************************************************************************************************************
			//Main Heading
			//***************************************************************************************************************************
			//Test Report Name

			//Add a line separator
			document.add(new LineSeparator(1f, 100, null, 0, -5));

			//Add Main Heading
			Font blackTimes = new Font(FontFamily.HELVETICA, 15, Font.BOLD, BaseColor.BLACK);
			Chunk mainHeading = new Chunk(TestCaseName, blackTimes);
			Paragraph p = new Paragraph(mainHeading);
			p.setAlignment(Paragraph.ALIGN_CENTER);
			document.add(p);

			//Add a line separator
			document.add(new LineSeparator(1f, 100, null, 0, -5));

			//Add a dummy line
			document.add(new Paragraph("\n"));

			//***************************************************************************************************************************
			//Test Case Details
			//***************************************************************************************************************************
			//Test case Name
			document.add(new Paragraph("Testcase Name : " +TestCaseName, new Font(Font.FontFamily.HELVETICA, Font.DEFAULTSIZE, Font.BOLD)));

			//Test Objective
			//document.add(new Paragraph("Test Objective : " +TestCaseObjective, new Font(Font.FontFamily.HELVETICA, Font.DEFAULTSIZE, Font.BOLD)));

			//Test Environment
			//document.add(new Paragraph("Test Environment : " +TestEnvironmentUrl, new Font(Font.FontFamily.HELVETICA, Font.DEFAULTSIZE, Font.BOLD)));

			//Java Version
			document.add(new Paragraph("Java Version : " +System.getProperty("java.version"), new Font(Font.FontFamily.HELVETICA, Font.DEFAULTSIZE, Font.BOLD)));

			//Host Name
			document.add(new Paragraph("Host Name : " +InetAddress.getLocalHost().getHostName(), new Font(Font.FontFamily.HELVETICA, Font.DEFAULTSIZE, Font.BOLD)));

			//Operating System
			document.add(new Paragraph("Operating System : " +System.getProperty("os.name"), new Font(Font.FontFamily.HELVETICA, Font.DEFAULTSIZE, Font.BOLD)));

			//Add a dummy line
			document.add(new Paragraph("\n"));

			//Add a line separator
			document.add(new LineSeparator(0.5f, 100, null, 0, -5));

			Image dxcLogo = Image.getInstance(currentDir+"\\dxc_logo.png");
			//If image size exceeds a threshold value decrease it to below size
			if ((dxcLogo.getWidth()>525.00) | (dxcLogo.getHeight()>500.00))
			{
				dxcLogo.scaleToFit(500, 600);
				dxcLogo.setAlignment(dxcLogo.ALIGN_CENTER);
			}

			//Add DXC Logo
			document.add(dxcLogo);

			//Add a new page/ page break
			document.newPage();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	@SuppressWarnings("deprecation")
	public void LogResult_and_CaptureImage(String Status, String StepName, String StepDescription, String screenCapture, String ...pageRenderTime) 
			throws DocumentException, MalformedURLException, Exception
	{
		java.util.Date date1 = new java.util.Date();

		//******************************************************************************************************************************
		//Basic Table format
		//******************************************************************************************************************************
		try
		{
			Font blackTimesNormal = new Font(FontFamily.HELVETICA, 10, Font.NORMAL, BaseColor.BLACK);
			Font blackTimesBold = new Font(FontFamily.HELVETICA, 10, Font.BOLD, BaseColor.BLACK);

			this.statusTable = new PdfPTable(new float[]{.5f, .5f, .2f, .6f});
			Chunk stepDetails = new Chunk("Step Details", blackTimesBold);
			Paragraph p = new Paragraph(stepDetails);
			p.setAlignment(Element.ALIGN_LEFT);
			cell = new PdfPCell(p);
			cell.setColspan(4);
			cell.setBackgroundColor(new BaseColor(208, 211, 212));
			this.statusTable.addCell(cell);

			Chunk stepNameHeading = new Chunk("Step Name", blackTimesBold);
			cell = new PdfPCell(new Paragraph(stepNameHeading));
			cell.setBackgroundColor(new BaseColor(208, 211, 212));
			this.statusTable.addCell(cell);

			Chunk stepDescriptionHeading = new Chunk("Step Description", blackTimesBold);
			cell = new PdfPCell(new Paragraph(stepDescriptionHeading));
			cell.setBackgroundColor(new BaseColor(208, 211, 212));
			this.statusTable.addCell(cell);

			Chunk statusHeading = new Chunk("Status", blackTimesBold);
			cell = new PdfPCell(new Paragraph(statusHeading));
			cell.setBackgroundColor(new BaseColor(208, 211, 212));
			this.statusTable.addCell(cell);

			Chunk timeHeading = new Chunk("Time", blackTimesBold);
			cell = new PdfPCell(new Paragraph(timeHeading));
			cell.setBackgroundColor(new BaseColor(208, 211, 212));
			this.statusTable.addCell(cell);

			//******************************************************************************************************************************
			//Appending Data To Table
			//******************************************************************************************************************************

			//When Passed
			if (Status.equalsIgnoreCase("PASS"))
			{
				//Step name
				Chunk stepName = new Chunk(StepName, blackTimesNormal);
				cell = new PdfPCell(new Paragraph(stepName));
				this.statusTable.addCell(cell);
				//Step description
				Chunk stepDescription = new Chunk(StepDescription, blackTimesNormal);
				cell = new PdfPCell(new Paragraph(stepDescription));
				this.statusTable.addCell(cell);
				//Status
				Font green = new Font(FontFamily.HELVETICA, 10, Font.NORMAL, new BaseColor(39, 174, 96));
				Chunk greenStatus = new Chunk(Status, green);
				cell = new PdfPCell(new Paragraph(greenStatus));
				this.statusTable.addCell(cell);
				//Time
				Chunk time = new Chunk(date1.toGMTString(), blackTimesNormal);
				cell = new PdfPCell(new Paragraph(time));
				this.statusTable.addCell(cell);

			}

			//When Failed
			else if (Status.equalsIgnoreCase("Fail"))
			{
				//Step name
				Chunk stepName = new Chunk(StepName, blackTimesNormal);
				cell = new PdfPCell(new Paragraph(stepName));
				this.statusTable.addCell(cell);
				//Step description
				Chunk stepDescription = new Chunk(StepDescription, blackTimesNormal);
				cell = new PdfPCell(new Paragraph(stepDescription));
				this.statusTable.addCell(cell);
				//Status
				Font red = new Font(FontFamily.HELVETICA, 10, Font.NORMAL, new BaseColor(231, 76, 60));
				Chunk redStatus = new Chunk(Status, red);
				cell = new PdfPCell(new Paragraph(redStatus));
				this.statusTable.addCell(cell);
				//Time
				Chunk time = new Chunk(date1.toGMTString(), blackTimesNormal);
				cell = new PdfPCell(new Paragraph(time));
				this.statusTable.addCell(cell);

				//Change the result flag to "True"
				overalRunResultFlag = true;
			}

			//Update Report
			updateReport();


			if (pageRenderTime.length==1)
			{
				document.add(new Paragraph("Page Load Time : " +pageRenderTime[0]+ "secs", new Font(Font.FontFamily.HELVETICA, Font.DEFAULTSIZE, Font.BOLD)));
			}

			//Add a dummy line
			document.add(new Paragraph("\n"));

			//Screen capture if needed
			//Test Step Details: Along With Image
			//Create a Dynamic table with respect to number of test logs 
			if (screenCapture.equalsIgnoreCase("YES"))
			{
				//Add a dummy line
				document.add(new Paragraph("\n"));
				document.add(new Paragraph(new Paragraph("Screenshot : ", new Font(Font.FontFamily.HELVETICA, Font.DEFAULTSIZE, Font.BOLD))));
				//Image
	//	 rdriver.executeScript("mobile:screen:image");
				Image img = Image.getInstance(takeScreenshot());
				//If image size exceeds a threshold value decrease it to below size
				if (img.getWidth()>600.00)
				{
					img.scaleToFit(400, img.getHeight());
					img.setAlignment(Image.ALIGN_CENTER);
				}
				if (writer.getVerticalPosition(true) - document.bottom() < 160)
				{
					document.newPage();
				}
				document.add(img);

				//Add a dummy line
				document.add(new Paragraph("\n"));
			}
		}
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	//******************************************************************************************************************************
	//Update Report
	//******************************************************************************************************************************

	public void updateReport()
	{
		if (this.statusTable != null)
		{
			this.statusTable.setSpacingBefore(15f);
			try 
			{

				/*float m_temp = writer.getVerticalPosition(true);
				float b_temp = document.bottom();*/

				//If in case the page space is less add a new page

				if (writer.getVerticalPosition(true)- document.bottom() < 160)
				{
					document.newPage();
				}

				//Add a dummy line
				document.add(new Paragraph("\n"));

				//Add a line separator
				document.add(new LineSeparator(0.5f, 100, null, 0, -5));

				//Add a dummy line
				document.add(new Paragraph("\n"));

				//Add the table
				this.document.add(this.statusTable);
			}
			catch (DocumentException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			this.statusTable.setSpacingAfter(15f);
		}
	}

	//******************************************************************************************************************************
	//End Report
	//******************************************************************************************************************************
	@SuppressWarnings("deprecation")
	public void endReport()
	{
		java.util.Date runEndTimeStamp = new java.util.Date();

		//Stop Timer
		pageLoad.stop();

		//*********************************************************************
		//Result String
		String runResult;
		//Validate run result flag
		if(overalRunResultFlag==true)
		{
			//Set Run result to FAIL
			runResult = "FAIL";
		}
		else
		{
			//Set Run result to PASS
			runResult = "PASS";
		}
		overalRunResultFlag=false;


		//*********************************************************************

		try
		{	
			//Add a new page
			document.newPage();

			//*****************************************************************
			//Test Summary
			//*****************************************************************
			//Add a line separator
			document.add(new LineSeparator(1f, 100, null, 0, -5));


			Font blackTimes = new Font(FontFamily.HELVETICA, 16, Font.BOLD, BaseColor.BLACK);
			Font greenResult = new Font(FontFamily.HELVETICA, 14, Font.BOLD, new BaseColor(39, 174, 96));
			Font redResult = new Font(FontFamily.HELVETICA, 14, Font.BOLD, new BaseColor(231, 76, 60));
			Font blackTimesDefaultSize = new Font(FontFamily.HELVETICA, Font.DEFAULTSIZE, Font.BOLD, BaseColor.BLACK);

			Chunk summaryHeading = new Chunk("Run Summary", blackTimes);
			Paragraph p = new Paragraph(summaryHeading);
			p.setAlignment(Paragraph.ALIGN_CENTER);
			document.add(p);

			//Add a line separator
			document.add(new LineSeparator(1f, 100, null, 0, -5));

			//Add a dummy line
			document.add(new Paragraph("\n"));

			//***************************************************************************************************************************
			//Test Run Details
			//***************************************************************************************************************************

			//Add a line separator
			document.add(new LineSeparator(0.5f, 100, null, 0, -5));

			//Add a dummy line
			document.add(new Paragraph("\n"));

			//Overall Status
			Chunk beginning = new Chunk("Result : ", blackTimesDefaultSize);
			Phrase p1 = new Phrase(beginning);
			if (runResult.equalsIgnoreCase("PASS"))
			{
				Chunk runresult = new Chunk(runResult, greenResult);
				p1.add(runresult);
				Paragraph p8 = new Paragraph();
				p8.add(p1);
				document.add(p8);
			}
			else
			{
				Chunk runresult = new Chunk(runResult, redResult);
				p1.add(runresult);
				Paragraph p8 = new Paragraph();
				p8.add(p1);
				document.add(p8);
			}

			//Run Started
			document.add(new Paragraph("Run Started : " +runStartTimeStamp.toGMTString(), new Font(Font.FontFamily.HELVETICA, Font.DEFAULTSIZE, Font.BOLD)));

			//Run Ended
			document.add(new Paragraph("Run Ended : " +runEndTimeStamp.toGMTString(), new Font(Font.FontFamily.HELVETICA, Font.DEFAULTSIZE, Font.BOLD)));

			//Run Duration
			document.add(new Paragraph("Run Duration : "+(pageLoad.getTime()/1000)+ " seconds", new Font(Font.FontFamily.HELVETICA, Font.DEFAULTSIZE, Font.BOLD)));

			//Add a dummy line
			document.add(new Paragraph("\n"));

			//Add a line separator
			document.add(new LineSeparator(0.5f, 100, null, 0, -5));

			document.close();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	//******************************************************************************************************************************
	//******************************************************************************************************************************
	//******************************************************************************************************************************

	public boolean isAlertPresent(){
		boolean foundAlert=false;

		WebDriverWait wait= new WebDriverWait (rdriver,10);
		try{
			wait.until(ExpectedConditions.alertIsPresent());
			foundAlert=true;
		}
		catch(Exception e){
			System.out.println("Alert is not present");
		}
		return foundAlert;


	}
	/*public void launchApplication(String browserName, String url) throws Exception 
	{

		// Launch Browser
		try 
		{
			//Timer
			fnStartWatch();
			if (browserName.equalsIgnoreCase("Chrome")) 
			{
				System.setProperty("webdriver.chrome.rdriver", "C:/IAS/IAS_Selenium/Packages/Test_Libraries/chromedriver.exe");
				rdriver = new ChromeDriver();
				rdriver.manage().window().maximize();
				LogResult_and_CaptureImage("PASS", "Launch Application", "Executing Script On Chrome", "NO");
				//extent.createTest("AmericanSpirit_PioneeringOrganicTobacco_PCUser_001","AmericanSpirit_PioneeringOrganicTobacco_PCUser_001");
			} 
			else if (browserName.equalsIgnoreCase("IE")) 
			{
				//Code to enable protected mode, disable blocking contents,
				DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
				capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
				capabilities.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
				//browser.executeScript("document.body.style.transform='scale(0.9)';");
				capabilities.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION, true);
				capabilities.setCapability("allow-blocked-content", true);
				capabilities.setCapability("allowBlockedContent", true);

				System.setProperty("webdriver.ie.rdriver", "C:/IAS/IAS_Selenium/Packages/Test_Libraries/IEDriverServer.exe");

				rdriver = new InternetExplorerDriver(capabilities);

				rdriver.manage().window().maximize();

				LogResult_and_CaptureImage("PASS", "Launch Application", "Executing Script On IE", "NO");

			} 
			else if (browserName.equalsIgnoreCase("Edge")) 
			{
				System.setProperty("webdriver.edge.rdriver", "C:/IAS/IAS_Selenium/Packages/Test_Libraries/MicrosoftWebDriver.exe");
				rdriver = new EdgeDriver();
				rdriver.manage().window().maximize();
				LogResult_and_CaptureImage("PASS", "Launch Application", "Executing Script On Edge", "NO");
			}

			else if (browserName.equalsIgnoreCase("Firefox")) 
			{
				System.setProperty("webdriver.gecko.rdriver", "C:/IAS/IAS_Selenium/Packages/Test_Libraries/geckodriver.exe");
				DesiredCapabilities capabilities = DesiredCapabilities.firefox();
				capabilities.setCapability("dom.webnotifications.enabled", false);

				rdriver = new FirefoxDriver();
				//Code for authentication required pop up
				if(isAlertPresent()){
					System.out.println("Alert is present");
					confirmAlert("", "");}
				else
				{
					System.out.println("Alert is not present");
				}

				rdriver.manage().window().maximize();
				LogResult_and_CaptureImage("PASS", "Launch Application", "Executing Script On FireFox", "NO");

			}
			//StopWatch pageLoad = new StopWatch();
				pageLoad.reset();
                pageLoad.start();
			//Delete All Cookie - Added @ 12/7/2018
			deleteAllCookie();
			rdriver.get(url);
			//                if (browserName.equalsIgnoreCase("firefox")) {
			//                      Alert alert = rdriver.switchTo().alert();
			//                      
			//                      alert.sendKeys("rjrws\\hzdbr6" + Keys.TAB.toString()+"Tokyo101!@#");
			//                      alert.accept();
			//                }

			pageLoad.stop();
		//	LogResult_and_CaptureImage(Status.PASS, "Total Page Load Time: " + pageLoad.getTime() + " milliseconds");
        //        LogResult_and_CaptureImage(Status.PASS, "Total Page Load Time: " + (pageLoad.getTime()/1000) + " Seconds");

			Thread.sleep(5000);
                if (browserName.equalsIgnoreCase("Firefox")){
                      //Authentication pop up handler

                            Alert alert = rdriver.switchTo().alert();
                            alert.sendKeys("rjrws\bzdbf5" + Keys.TAB.toString()+"20@reynolds");
                            alert.accept();

                //Runtime.getRuntime().exec("C:\\IAS\\IAS_Selenium\\Login.exe");
                }
			LogResult_and_CaptureImage("PASS", "Launch URL", "Opened URL : "+url, "YES", fnStopWatch());
		}
		catch (Exception e) 
		{
			// TODO: handle exception
			//Log
			LogResult_and_CaptureImage("FAIL", "Launch Application", "Failed To Launch The Application", "YES");
			e.printStackTrace();
		}
	}
*/
	
	public void launchApplication(String browserName, String url) throws Exception 
	{
		// Launch Browser
		try 
		{
			//Timer
			fnStartWatch();
			if (browserName.equalsIgnoreCase("Chrome")) 
			{
				
			
				DesiredCapabilities capabilities = new DesiredCapabilities("", "", Platform.ANY);
				capabilities.setCapability("securityToken","eyJhbGciOiJSUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICJnclN5Wmc4T2QwQWhnTjVIeUFsd042Xzl1Q1BxdFFjQW9fNnowaElaQm40In0.eyJqdGkiOiJhMDM1NmY4ZC1hYjlhLTQ5ODktODg5OC04YTg1ODEyNjZiNmEiLCJleHAiOjAsIm5iZiI6MCwiaWF0IjoxNTc2ODM4ODAyLCJpc3MiOiJodHRwczovL2F1dGgucGVyZmVjdG9tb2JpbGUuY29tL2F1dGgvcmVhbG1zL3JhaS1wZXJmZWN0b21vYmlsZS1jb20iLCJhdWQiOiJvZmZsaW5lLXRva2VuLWdlbmVyYXRvciIsInN1YiI6ImE3NGE5ZmJlLWVjZGYtNDRjOC1hMTk2LWY2NDNlMWQ1YWM2YSIsInR5cCI6Ik9mZmxpbmUiLCJhenAiOiJvZmZsaW5lLXRva2VuLWdlbmVyYXRvciIsIm5vbmNlIjoiMzA4MzNmMDItOGJkNC00YTRlLWJiYTktNWQ2NzliOTk2MGExIiwiYXV0aF90aW1lIjowLCJzZXNzaW9uX3N0YXRlIjoiNzllMzhkMjAtZjIyNC00MmJjLTgzNDktOGFmYTI2YTgwNTY1IiwicmVhbG1fYWNjZXNzIjp7InJvbGVzIjpbIm9mZmxpbmVfYWNjZXNzIiwidW1hX2F1dGhvcml6YXRpb24iXX0sInJlc291cmNlX2FjY2VzcyI6eyJhY2NvdW50Ijp7InJvbGVzIjpbIm1hbmFnZS1hY2NvdW50IiwibWFuYWdlLWFjY291bnQtbGlua3MiLCJ2aWV3LXByb2ZpbGUiXX19fQ.YN63fPY1Z3D_llZ4qJ2A2hFtxe5Ombu1t4xB0oWgydHE0GpQZlJtoLB2WSXeyCo7W4HPQ1HFLMumjXoLkXboSdrQLMH1y38dtWJ1FSCAun89Ei8iGjqgzCzuw62CLbu8FQrG-SuBCWRApGXGK2f1Akdv0MHBsSw5_U3sNtc9NHsbApHTo1BdnQ3kWqO4GaJim8bQOcdqEsw1wM3AozOvxy5VnG4F9Os0a0orBeX_oRS7oFOl8zX1nUeuEZIXt1LgelwU4MW8boLKDn_sUnte70tFPlKI2tDA3KPobN2pp7zZ9BemLzZ6pG25IWPBL0uEQk--Tt569uSwr_mUXNbFyg");
				capabilities.setCapability("platformName", "Windows");
		        capabilities.setCapability("platformVersion", "10");
		        capabilities.setCapability("browserName", "Chrome");
		        capabilities.setCapability("browserVersion", "91");
		        capabilities.setCapability("resolution", "1440x900");
		        capabilities.setCapability("scriptName", TestCaseName);
		   //     capabilities.setCapability("deviceSessionId", "486a0118-70b2-4816-870b-62bcef056146");
		        //capabilities.setCapability("deviceSessionId", "fbc92d07-5c7a-47b5-a5ca-f17b02c3b47a");
		        
//			
				PerfectoLabUtils.setExecutionIdCapability(capabilities, "rai.perfectomobile.com");
			
				rdriver = connectWithoutProxy(capabilities);
				
				
				LogResult_and_CaptureImage("PASS", "Launch Application", "Executing Script On Chrome", "NO");
				
			} 
			else if (browserName.equalsIgnoreCase("IE")) 
			{
				DesiredCapabilities capabilities = new DesiredCapabilities("", "", Platform.ANY);
				capabilities.setCapability("securityToken","eyJhbGciOiJSUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICJnclN5Wmc4T2QwQWhnTjVIeUFsd042Xzl1Q1BxdFFjQW9fNnowaElaQm40In0.eyJqdGkiOiJhMDM1NmY4ZC1hYjlhLTQ5ODktODg5OC04YTg1ODEyNjZiNmEiLCJleHAiOjAsIm5iZiI6MCwiaWF0IjoxNTc2ODM4ODAyLCJpc3MiOiJodHRwczovL2F1dGgucGVyZmVjdG9tb2JpbGUuY29tL2F1dGgvcmVhbG1zL3JhaS1wZXJmZWN0b21vYmlsZS1jb20iLCJhdWQiOiJvZmZsaW5lLXRva2VuLWdlbmVyYXRvciIsInN1YiI6ImE3NGE5ZmJlLWVjZGYtNDRjOC1hMTk2LWY2NDNlMWQ1YWM2YSIsInR5cCI6Ik9mZmxpbmUiLCJhenAiOiJvZmZsaW5lLXRva2VuLWdlbmVyYXRvciIsIm5vbmNlIjoiMzA4MzNmMDItOGJkNC00YTRlLWJiYTktNWQ2NzliOTk2MGExIiwiYXV0aF90aW1lIjowLCJzZXNzaW9uX3N0YXRlIjoiNzllMzhkMjAtZjIyNC00MmJjLTgzNDktOGFmYTI2YTgwNTY1IiwicmVhbG1fYWNjZXNzIjp7InJvbGVzIjpbIm9mZmxpbmVfYWNjZXNzIiwidW1hX2F1dGhvcml6YXRpb24iXX0sInJlc291cmNlX2FjY2VzcyI6eyJhY2NvdW50Ijp7InJvbGVzIjpbIm1hbmFnZS1hY2NvdW50IiwibWFuYWdlLWFjY291bnQtbGlua3MiLCJ2aWV3LXByb2ZpbGUiXX19fQ.YN63fPY1Z3D_llZ4qJ2A2hFtxe5Ombu1t4xB0oWgydHE0GpQZlJtoLB2WSXeyCo7W4HPQ1HFLMumjXoLkXboSdrQLMH1y38dtWJ1FSCAun89Ei8iGjqgzCzuw62CLbu8FQrG-SuBCWRApGXGK2f1Akdv0MHBsSw5_U3sNtc9NHsbApHTo1BdnQ3kWqO4GaJim8bQOcdqEsw1wM3AozOvxy5VnG4F9Os0a0orBeX_oRS7oFOl8zX1nUeuEZIXt1LgelwU4MW8boLKDn_sUnte70tFPlKI2tDA3KPobN2pp7zZ9BemLzZ6pG25IWPBL0uEQk--Tt569uSwr_mUXNbFyg");
				capabilities.setCapability("platformName", "Windows");
		        capabilities.setCapability("platformVersion", "10");
		        capabilities.setCapability("browserName", "Internet Explorer");
		        capabilities.setCapability("browserVersion", "latest");
		        capabilities.setCapability("resolution", "1440x900");
		        capabilities.setCapability("scriptName", TestCaseName);
				
		        PerfectoLabUtils.setExecutionIdCapability(capabilities, "rai.perfectomobile.com");
		
				rdriver = connectWithoutProxy(capabilities);
                LogResult_and_CaptureImage("PASS", "Launch Application", "Executing Script On IE", "NO");

			} 
			else if (browserName.equalsIgnoreCase("Firefox")) 
			{
				
				DesiredCapabilities capabilities = new DesiredCapabilities("", "", Platform.ANY);
				capabilities.setCapability("securityToken","eyJhbGciOiJSUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICJnclN5Wmc4T2QwQWhnTjVIeUFsd042Xzl1Q1BxdFFjQW9fNnowaElaQm40In0.eyJqdGkiOiJhMDM1NmY4ZC1hYjlhLTQ5ODktODg5OC04YTg1ODEyNjZiNmEiLCJleHAiOjAsIm5iZiI6MCwiaWF0IjoxNTc2ODM4ODAyLCJpc3MiOiJodHRwczovL2F1dGgucGVyZmVjdG9tb2JpbGUuY29tL2F1dGgvcmVhbG1zL3JhaS1wZXJmZWN0b21vYmlsZS1jb20iLCJhdWQiOiJvZmZsaW5lLXRva2VuLWdlbmVyYXRvciIsInN1YiI6ImE3NGE5ZmJlLWVjZGYtNDRjOC1hMTk2LWY2NDNlMWQ1YWM2YSIsInR5cCI6Ik9mZmxpbmUiLCJhenAiOiJvZmZsaW5lLXRva2VuLWdlbmVyYXRvciIsIm5vbmNlIjoiMzA4MzNmMDItOGJkNC00YTRlLWJiYTktNWQ2NzliOTk2MGExIiwiYXV0aF90aW1lIjowLCJzZXNzaW9uX3N0YXRlIjoiNzllMzhkMjAtZjIyNC00MmJjLTgzNDktOGFmYTI2YTgwNTY1IiwicmVhbG1fYWNjZXNzIjp7InJvbGVzIjpbIm9mZmxpbmVfYWNjZXNzIiwidW1hX2F1dGhvcml6YXRpb24iXX0sInJlc291cmNlX2FjY2VzcyI6eyJhY2NvdW50Ijp7InJvbGVzIjpbIm1hbmFnZS1hY2NvdW50IiwibWFuYWdlLWFjY291bnQtbGlua3MiLCJ2aWV3LXByb2ZpbGUiXX19fQ.YN63fPY1Z3D_llZ4qJ2A2hFtxe5Ombu1t4xB0oWgydHE0GpQZlJtoLB2WSXeyCo7W4HPQ1HFLMumjXoLkXboSdrQLMH1y38dtWJ1FSCAun89Ei8iGjqgzCzuw62CLbu8FQrG-SuBCWRApGXGK2f1Akdv0MHBsSw5_U3sNtc9NHsbApHTo1BdnQ3kWqO4GaJim8bQOcdqEsw1wM3AozOvxy5VnG4F9Os0a0orBeX_oRS7oFOl8zX1nUeuEZIXt1LgelwU4MW8boLKDn_sUnte70tFPlKI2tDA3KPobN2pp7zZ9BemLzZ6pG25IWPBL0uEQk--Tt569uSwr_mUXNbFyg");
				capabilities.setCapability("platformName", "Windows");
		        capabilities.setCapability("platformVersion", "10");
		        capabilities.setCapability("browserName", "Firefox");
		        capabilities.setCapability("browserVersion", "latest");
		        capabilities.setCapability("resolution", "1440x900");
		        capabilities.setCapability("scriptName", TestCaseName);
				
		        PerfectoLabUtils.setExecutionIdCapability(capabilities, "rai.perfectomobile.com");
			
				rdriver = connectWithoutProxy(capabilities);
				LogResult_and_CaptureImage("PASS", "Launch Application", "Executing Script On FireFox", "NO");

			}
			else if (browserName.equalsIgnoreCase("Edge")) 
			{
				
				DesiredCapabilities capabilities = new DesiredCapabilities("", "", Platform.ANY);
				capabilities.setCapability("securityToken","eyJhbGciOiJSUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICJnclN5Wmc4T2QwQWhnTjVIeUFsd042Xzl1Q1BxdFFjQW9fNnowaElaQm40In0.eyJqdGkiOiJhMDM1NmY4ZC1hYjlhLTQ5ODktODg5OC04YTg1ODEyNjZiNmEiLCJleHAiOjAsIm5iZiI6MCwiaWF0IjoxNTc2ODM4ODAyLCJpc3MiOiJodHRwczovL2F1dGgucGVyZmVjdG9tb2JpbGUuY29tL2F1dGgvcmVhbG1zL3JhaS1wZXJmZWN0b21vYmlsZS1jb20iLCJhdWQiOiJvZmZsaW5lLXRva2VuLWdlbmVyYXRvciIsInN1YiI6ImE3NGE5ZmJlLWVjZGYtNDRjOC1hMTk2LWY2NDNlMWQ1YWM2YSIsInR5cCI6Ik9mZmxpbmUiLCJhenAiOiJvZmZsaW5lLXRva2VuLWdlbmVyYXRvciIsIm5vbmNlIjoiMzA4MzNmMDItOGJkNC00YTRlLWJiYTktNWQ2NzliOTk2MGExIiwiYXV0aF90aW1lIjowLCJzZXNzaW9uX3N0YXRlIjoiNzllMzhkMjAtZjIyNC00MmJjLTgzNDktOGFmYTI2YTgwNTY1IiwicmVhbG1fYWNjZXNzIjp7InJvbGVzIjpbIm9mZmxpbmVfYWNjZXNzIiwidW1hX2F1dGhvcml6YXRpb24iXX0sInJlc291cmNlX2FjY2VzcyI6eyJhY2NvdW50Ijp7InJvbGVzIjpbIm1hbmFnZS1hY2NvdW50IiwibWFuYWdlLWFjY291bnQtbGlua3MiLCJ2aWV3LXByb2ZpbGUiXX19fQ.YN63fPY1Z3D_llZ4qJ2A2hFtxe5Ombu1t4xB0oWgydHE0GpQZlJtoLB2WSXeyCo7W4HPQ1HFLMumjXoLkXboSdrQLMH1y38dtWJ1FSCAun89Ei8iGjqgzCzuw62CLbu8FQrG-SuBCWRApGXGK2f1Akdv0MHBsSw5_U3sNtc9NHsbApHTo1BdnQ3kWqO4GaJim8bQOcdqEsw1wM3AozOvxy5VnG4F9Os0a0orBeX_oRS7oFOl8zX1nUeuEZIXt1LgelwU4MW8boLKDn_sUnte70tFPlKI2tDA3KPobN2pp7zZ9BemLzZ6pG25IWPBL0uEQk--Tt569uSwr_mUXNbFyg");
				capabilities.setCapability("platformName", "Windows");
		        capabilities.setCapability("platformVersion", "10");
		        capabilities.setCapability("browserName", "Edge");
		        capabilities.setCapability("browserVersion", "79");
		        capabilities.setCapability("resolution", "1440x900");
		        capabilities.setCapability("scriptName", TestCaseName);
				
		        PerfectoLabUtils.setExecutionIdCapability(capabilities, "rai.perfectomobile.com");
				
				rdriver = connectWithoutProxy(capabilities);
				LogResult_and_CaptureImage("PASS", "Launch Application", "Executing Script On Edge", "NO");

			}
			
			else if (browserName.equalsIgnoreCase("Safari")) 
			{
				
				DesiredCapabilities capabilities = new DesiredCapabilities("", "", Platform.ANY);
				capabilities.setCapability("securityToken","eyJhbGciOiJSUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICJnclN5Wmc4T2QwQWhnTjVIeUFsd042Xzl1Q1BxdFFjQW9fNnowaElaQm40In0.eyJqdGkiOiJhMDM1NmY4ZC1hYjlhLTQ5ODktODg5OC04YTg1ODEyNjZiNmEiLCJleHAiOjAsIm5iZiI6MCwiaWF0IjoxNTc2ODM4ODAyLCJpc3MiOiJodHRwczovL2F1dGgucGVyZmVjdG9tb2JpbGUuY29tL2F1dGgvcmVhbG1zL3JhaS1wZXJmZWN0b21vYmlsZS1jb20iLCJhdWQiOiJvZmZsaW5lLXRva2VuLWdlbmVyYXRvciIsInN1YiI6ImE3NGE5ZmJlLWVjZGYtNDRjOC1hMTk2LWY2NDNlMWQ1YWM2YSIsInR5cCI6Ik9mZmxpbmUiLCJhenAiOiJvZmZsaW5lLXRva2VuLWdlbmVyYXRvciIsIm5vbmNlIjoiMzA4MzNmMDItOGJkNC00YTRlLWJiYTktNWQ2NzliOTk2MGExIiwiYXV0aF90aW1lIjowLCJzZXNzaW9uX3N0YXRlIjoiNzllMzhkMjAtZjIyNC00MmJjLTgzNDktOGFmYTI2YTgwNTY1IiwicmVhbG1fYWNjZXNzIjp7InJvbGVzIjpbIm9mZmxpbmVfYWNjZXNzIiwidW1hX2F1dGhvcml6YXRpb24iXX0sInJlc291cmNlX2FjY2VzcyI6eyJhY2NvdW50Ijp7InJvbGVzIjpbIm1hbmFnZS1hY2NvdW50IiwibWFuYWdlLWFjY291bnQtbGlua3MiLCJ2aWV3LXByb2ZpbGUiXX19fQ.YN63fPY1Z3D_llZ4qJ2A2hFtxe5Ombu1t4xB0oWgydHE0GpQZlJtoLB2WSXeyCo7W4HPQ1HFLMumjXoLkXboSdrQLMH1y38dtWJ1FSCAun89Ei8iGjqgzCzuw62CLbu8FQrG-SuBCWRApGXGK2f1Akdv0MHBsSw5_U3sNtc9NHsbApHTo1BdnQ3kWqO4GaJim8bQOcdqEsw1wM3AozOvxy5VnG4F9Os0a0orBeX_oRS7oFOl8zX1nUeuEZIXt1LgelwU4MW8boLKDn_sUnte70tFPlKI2tDA3KPobN2pp7zZ9BemLzZ6pG25IWPBL0uEQk--Tt569uSwr_mUXNbFyg");
				capabilities.setCapability("platformName", "Mac");
		        capabilities.setCapability("platformVersion", "OS X El Capitan");
		        capabilities.setCapability("browserName", "Safari");
		        capabilities.setCapability("browserVersion", "10");
		        capabilities.setCapability("resolution", "1440x900");
		        capabilities.setCapability("scriptName", TestCaseName);
		      //  capabilities.setCapability("location", "NA-US-BOS");
				
		        PerfectoLabUtils.setExecutionIdCapability(capabilities, "rai.perfectomobile.com");
				
				rdriver = connectWithoutProxy(capabilities);
				LogResult_and_CaptureImage("PASS", "Launch Application", "Executing Script On Safari", "NO");

			}
			
			
			//Delete All Cookie - Added @ 12/7/2018
			deleteAllCookie();
			rdriver.get(url);
			rdriver.manage().window().maximize();
		
			LogResult_and_CaptureImage("PASS", "Launch URL", "Opened URL : "+url, "YES", fnStopWatch());
		}
		catch (Exception e) 
		{
			// TODO: handle exception
			//Log
			LogResult_and_CaptureImage("FAIL", "Launch Application", "Failed To Launch The Application", "YES");
			e.printStackTrace();
		}
	}

	
	
/*	@SuppressWarnings("deprecation")
	public  RemoteWebDriver connectViaProxy(DesiredCapabilities caps) {

		String proxyHost = "proxy.rjr.com";

		int proxyPort = 8080;

		String proxyUserDomain = "RJRWS";

		String proxyUser = "lzz6s4";

		String proxyPassword = "5@reynolds";

		String host = "rai.perfectomobile.com";

		URL url;


		try {

			url = new URL("https://" + host + "/nexperience/perfectomobile/wd/hub");

		} catch (MalformedURLException e) {

			throw new RuntimeException(e.getMessage(), e);

		}

		HttpClientBuilder builder = HttpClientBuilder.create();

		HttpHost proxy = new HttpHost(proxyHost, proxyPort);

		CredentialsProvider credsProvider = new BasicCredentialsProvider();

		credsProvider.setCredentials(new AuthScope(proxyHost, proxyPort),
				new NTCredentials(proxyUser, proxyPassword, getWorkstation(), proxyUserDomain));

		if (url.getUserInfo() != null && !url.getUserInfo().isEmpty()) {

			credsProvider.setCredentials(
					new AuthScope(url.getHost(), (url.getPort() > 0 ? url.getPort() : url.getDefaultPort())),
					new UsernamePasswordCredentials(url.getUserInfo()));

		}

		builder.setProxy(proxy);

		builder.setDefaultCredentialsProvider(credsProvider);

		MyHttpClientFactory factory = new MyHttpClientFactory(builder);

		HttpCommandExecutor executor = new HttpCommandExecutor(new HashMap<String, CommandInfo>(), url, factory);
		//AppiumCommandExecutor executor = new HttpCommandExecutor(new HashMap<String, CommandInfo>(), url, factory);
		// AppiumCommandExecutor executor = new HttpCommandExecutor(new
		// HashMap<String, CommandInfo>(), url, factory);
		return new RemoteWebDriver(executor, caps);
		//return new AppiumDriver(executor, caps);
		// return new IOSDriver(executor, caps);

	}
*/
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

		if (env.containsKey("COMPUTERNAME")) {

			// Windows

			return env.get("COMPUTERNAME");

		} else if (env.containsKey("HOSTNAME")) {

			// Unix/Linux/MacOS

			return env.get("HOSTNAME");

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


	
	
	
	// Enter Value in edit field
	public void inputText(By by, String elementname, String data) throws Exception 
	{
		try 
		{
			WebDriverWait wait = new WebDriverWait(rdriver, 30);
			wait.until(ExpectedConditions.visibilityOfElementLocated(by));
			WebElement e1 = rdriver.findElement(by);
			if (e1.isDisplayed()) 
			{
				Actions actions = new Actions(rdriver);
				actions.moveToElement(e1).click().build().perform();
				e1.clear();
				e1.sendKeys(data);
				LogResult_and_CaptureImage("PASS", "Input Text", "'"+data+"'"+" Entered In " + elementname + " Text Field Successfully.", "NO");
			}
		} 
		catch (Exception e) 
		{
			// TODO: handle exception
			LogResult_and_CaptureImage("FAIL", "Input", "Failed To Locate " +elementname+ " Text field.", "YES");
			e.printStackTrace();
		}
	}

	public void Vuse_CF_inputText(By by, String elementname, String data) throws Exception 
	{
		try 
		{
			fnStartWatch();
			rdriver.findElement(by).clear();
			Thread.sleep(2000);
			//Action Class
			rdriver.findElement(by).sendKeys(data);

			//Java script
			/*JavascriptExecutor executor = (JavascriptExecutor)rdriver;
			executor.executeScript("arguments[0].value='enter the value here';", data);*/
		} 
		catch (Exception e) 
		{
			// TODO: handle exception
			LogResult_and_CaptureImage("FAIL", "Input", "Failed To Locate " +elementname+ " Text field.", "YES");
			e.printStackTrace();
		}
	}

	// Click Button
	public void clickbutton(By by, String elementname) throws Exception 
	{
		// Click Button
		try 
		{
			fnStartWatch();
			WebDriverWait wait = new WebDriverWait(rdriver, 45);
			wait.until(ExpectedConditions.visibilityOfElementLocated(by));
			WebElement e1 = rdriver.findElement(by);
			if (e1.isDisplayed()) 
			{
				Actions actions = new Actions(rdriver);
				actions.moveToElement(e1).click().build().perform();
				LogResult_and_CaptureImage("PASS", "Click Button", "Clicked on " + elementname + " Button Successfully.", "YES");
			}
		} 
		catch (Exception e) 
		{
			// TODO: handle exception
			LogResult_and_CaptureImage("FAIL", "Click Button", "Failed To Click On " + elementname + " Button.", "YES");
			e.printStackTrace();
		}
	}

	// Click Link
	public void clickLink(By by, String elementname) throws Exception 
	{
		try 
		{
			fnStartWatch();
			WebDriverWait wait = new WebDriverWait(rdriver, 30);
			wait.until(ExpectedConditions.visibilityOfElementLocated(by));
			WebElement e1 = rdriver.findElement(by);
			if (e1.isDisplayed()) 
			{
				Actions actions = new Actions(rdriver);
				actions.moveToElement(e1).click().build().perform();
				LogResult_and_CaptureImage("PASS", "Click Link", "Clicked " + elementname + " Link Successfully.", "NO");
			}
		}
		catch (Exception e) 
		{
			// TODO: handle exception
			LogResult_and_CaptureImage("FAIL", "Click Link", "Failed to Click on " + elementname + " Link", "YES");
			e.printStackTrace();
		}
	}
	public void isEnabled(By by, String elementname) throws Exception 
	{
		// Click Button
		try 
		{
			WebDriverWait wait = new WebDriverWait(rdriver, 30);
			wait.until(ExpectedConditions.visibilityOfElementLocated(by));
			WebElement e1 = rdriver.findElement(by);
			if (e1.isEnabled()) 
			{
				LogResult_and_CaptureImage("PASS", "Validate Element Is Enabled ", elementname + " Element Is Enabled", "NO");
			} 
			else
			{
				LogResult_and_CaptureImage("FAIL", "Validate Element Is Enabled", elementname + " Element Is Disabled.", "NO");
			}
		} 
		catch (Exception e) 
		{
			// TODO: handle exception
			LogResult_and_CaptureImage("FAIL", "Error : Validate Element Is Enabled",  elementname + " Element Is Disabled.", "YES");
			e.printStackTrace();
		}
	}
	
	//Author- Divya Kumari
	public void isSelected(By by, String elementname) throws Exception 
	{
		// Click Button
		try 
		{
			WebDriverWait wait = new WebDriverWait(rdriver, 30);
			wait.until(ExpectedConditions.visibilityOfElementLocated(by));
			WebElement e1 = rdriver.findElement(by);
			if (e1.isDisplayed()) 
			{
			if (e1.isSelected()) 
			{
				LogResult_and_CaptureImage("PASS", "Validate Element Is Enabled ", elementname + " Element Is Enabled", "NO");
			} 
			else
			{
				LogResult_and_CaptureImage("FAIL", "Validate Element Is Enabled", elementname + " Element Is Disabled.", "NO");
			}
		} 
		}
		catch (Exception e) 
		{
			// TODO: handle exception
			LogResult_and_CaptureImage("FAIL", "Error : Validate Element Is Enabled",  elementname + " Element Is Disabled.", "YES");
			e.printStackTrace();
		}
	}
	
	public void isElementInVisible(By by) throws Exception
	{
		try
		{
			WebDriverWait wait = new WebDriverWait(rdriver, 30);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(by));
		} 
		catch (Exception e)
		{
			// TODO: handle exception
			LogResult_and_CaptureImage("FAIL", "Error : Time Out", "Element Is Visible In The Page", "YES");
			e.printStackTrace();
		}
	}
	

	//Updated - @ 10/29/2018 - By Suneel Kaushik Subramanya
	public void ElementShouldContain(By by, String elementname, String data) throws Exception 
	{
		try 
		{
			//Fluentwait
			//WebElement e1;
			//e1 = fluentWait(by, 2);
			WebDriverWait wait = new WebDriverWait(rdriver, 30);
			wait.until(ExpectedConditions.visibilityOfElementLocated(by));
			WebElement e1 = rdriver.findElement(by);
			if (e1.isDisplayed()) 
			{
				String actualString = e1.getText();
				assertTrue(actualString.replaceAll("\\n", "").replaceAll("\\t", "").replaceAll(" ", "").toUpperCase().contains(data.replaceAll(" ", "").toUpperCase()));
				LogResult_and_CaptureImage("PASS", "Element Should Contain", data+" Presents In Element", "YES");
			}
		} 
		catch (Exception e)
		{
			// TODO: handle exception
			LogResult_and_CaptureImage("FAIL", "Element Should Contain", data+" Is Not Present In Element", "YES");
			e.printStackTrace();
		}
	}

	//Updated - @10/29/2018 - By Suneel Kaushik Subramanya
	public void ElementShouldNotContain(By by, String elementname, String data) throws Exception 
	{
		try 
		{
			/*//Fluentwait
			WebElement e1;
			e1 = fluentWait(by, 2);*/
			WebDriverWait wait = new WebDriverWait(rdriver, 30);
			wait.until(ExpectedConditions.visibilityOfElementLocated(by));
			WebElement e1 = rdriver.findElement(by);
			if (e1.isDisplayed()) 
			{
				String actualString = e1.getText();
				assertFalse(actualString.contains(data));
				LogResult_and_CaptureImage("PASS", "Element Should Not Contain", data+" Is Not Presents In Element", "YES");
			}
		}
		catch (Exception e) 
		{
			// TODO: handle exception
			LogResult_and_CaptureImage("FAIL", "Element Should Not Contain", data+" Is Present In Element", "YES");
			e.printStackTrace();
		}
	}

	public void isDisabled(By by, String elementname) throws Exception 
	{
		try 
		{
			WebDriverWait wait = new WebDriverWait(rdriver, 30);
			wait.until(ExpectedConditions.visibilityOfElementLocated(by));
			WebElement e1 = rdriver.findElement(by);
			if (e1.isEnabled()) 
			{
				LogResult_and_CaptureImage("FAIL", "Element Disabled", elementname + " Is Enabled", "NO");
			}
			else 
			{
				LogResult_and_CaptureImage("PASS", "Element Disabled", elementname + " Is Disabled", "NO");
			}
		} 
		catch (Exception e) 
		{
			// TODO: handle exception
			LogResult_and_CaptureImage("FAIL", "Element Disabled", elementname + " Element Is Not Disabled", "NO");
			e.printStackTrace();
		}
	}

	// Click Image
	public void clickImage(By by, String elementname) throws Exception
	{
		try 
		{
			fnStartWatch();
			WebDriverWait wait = new WebDriverWait(rdriver,30);
			wait.until(ExpectedConditions.visibilityOfElementLocated(by));
			WebElement e1 = rdriver.findElement(by);
			if (e1.isDisplayed()) 
			{
				Actions actions = new Actions(rdriver);
				actions.moveToElement(e1).click().build().perform();
				LogResult_and_CaptureImage("PASS", "Click Image", "Clicked on  " + elementname + " Image Successfully.", "NO");
			}
		} 
		catch (Exception e) 
		{
			// TODO: handle exception
			LogResult_and_CaptureImage("FAIL", "Click Image", "Failed to Click on " + elementname + " Image.", "YES");
			e.printStackTrace();
		}
	}

	public void clickUsingJs(By by, String elementname) throws Exception 
	{
		try 
		{
			fnStartWatch();
			WebElement e1 = rdriver.findElement(by);
			JavascriptExecutor executor = (JavascriptExecutor)rdriver;
			executor.executeScript("arguments[0].click();", e1);
			LogResult_and_CaptureImage("PASS", "Click Object", "Clicked On " + elementname + " Element.", "NO");
		} 
		catch (Exception e) 
		{
			// TODO: handle exception
			LogResult_and_CaptureImage("FAIL", "Click Object", "Failed To Click On " + elementname + " Element.", "YES");
			e.printStackTrace();
		}
	}
	public void Vuse_CF_clickUsingJs(By by, String elementname) throws Exception 
	{
		try 
		{
			fnStartWatch();
			WebElement e1 = rdriver.findElement(by);
			JavascriptExecutor executor = (JavascriptExecutor)rdriver;
			executor.executeScript("arguments[0].click();", e1);

		} 
		catch (Exception e) 
		{
			// TODO: handle exception
			LogResult_and_CaptureImage("FAIL", "Click Object", "Failed To Click On " + elementname + " Element.", "YES");
			e.printStackTrace();
		}
	}

	// Click Element
	public void clickElement(By by, String elementname) throws Exception 
	{
		try 
		{
			fnStartWatch();
			WebDriverWait wait = new WebDriverWait(rdriver, 30);
			wait.until(ExpectedConditions.visibilityOfElementLocated(by));
			WebElement e1 = rdriver.findElement(by);
			if (e1.isDisplayed()) 
			{
				Actions actions = new Actions(rdriver);
				actions.moveToElement(e1).click().build().perform();
				LogResult_and_CaptureImage("PASS", "Click Element", "Clicked On " +elementname + " Element Successfully.", "NO");
			}
		}
		catch (Exception e) 
		{
			// TODO: handle exception
			LogResult_and_CaptureImage("FAIL", "Click Element", "Failed To Click On " + elementname + ".", "YES");
			e.printStackTrace();
		}
	}

	public void ScrollPageDown() throws Exception 
	{
		try 
		{
			JavascriptExecutor jse = (JavascriptExecutor)rdriver;
			jse.executeScript("window.scrollBy(0,250)", "");

			Thread.sleep(3000);
			//LogResult_and_CaptureImage("PASS", "Scroll Page Down", "Page Successfully Scrolled Down", "NO");
		} 
		catch (Exception e) 
		{
			// TODO: handle exception
			LogResult_and_CaptureImage("FAIL", "Scroll Page Down", "Unable To Scroll Page Down", "YES");
			e.printStackTrace();
		}
	}

	public void ScrollPageUp() throws Exception 
	{
		try 
		{
			JavascriptExecutor jse = (JavascriptExecutor)rdriver;
			jse.executeScript("window.scrollBy(0,-250)", "");
			Thread.sleep(1000);
			LogResult_and_CaptureImage("PASS", "Scroll Page Up", "Page Successfully Scrolled Up", "NO");
		} 
		catch (Exception e) 
		{
			// TODO: handle exception
			LogResult_and_CaptureImage("FAIL", "Scroll Page Up", "Unable To Scroll Page Up", "YES");
			e.printStackTrace();
		}
	}

	public void closeBrowser() throws Exception 
	{
		try 
		{
			rdriver.close();
			LogResult_and_CaptureImage("PASS", "Close Browser", "Closed Browser Successfully", "NO");
		}
		catch (Exception e) 
		{
			// TODO: handle exception
			LogResult_and_CaptureImage("FAIL", "Close Browser", "Failed to Close Browser", "YES");
			e.printStackTrace();
		}
	}

	public void closeAllBrowser() throws Exception 
	{
		try 
		{
			rdriver.quit();
			LogResult_and_CaptureImage("PASS", "Close All Browser", "Closed All Browser Successfully", "NO");
		}
		catch (Exception e)
		{
			// TODO: handle exception
			LogResult_and_CaptureImage("FAIL", "Close All Browser", "Failed To Close All Browser", "YES");
			e.printStackTrace();
		}
	}

	public void confirmAlert() throws Exception 
	{
		try 
		{
			WebDriverWait wait = new WebDriverWait(rdriver, 30);
			wait.until(ExpectedConditions.alertIsPresent());
			Alert alt = rdriver.switchTo().alert();
			Thread.sleep(1000);
			alt.accept();
			LogResult_and_CaptureImage("PASS", "Confirm Alert Popup", "Alert Popup Accecpted Successfully", "NO");

		} 
		catch (Exception e) 
		{
			// TODO: handle exception
			LogResult_and_CaptureImage("FAIL", "Confirm Alert Popup", "Either Failed to Accecpt Alert/The Alert window didn't Popup", "YES");
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
			LogResult_and_CaptureImage("PASS", "Confirm Alert Popup", "Alert Popup Accecpted Successfully", "NO");
		}
		catch (Exception e) 
		{
			// TODO: handle exception
			LogResult_and_CaptureImage("FAIL", "Confirm Alert Popup", "Either Failed to Accecpt Alert/The Alert window didn't Popup", "YES");
		}
	}

	public void dismissAlert() throws Exception 
	{
		try
		{
			WebDriverWait wait = new WebDriverWait(rdriver, 30);
			wait.until(ExpectedConditions.alertIsPresent());
			Alert alt = rdriver.switchTo().alert();
			Thread.sleep(1000);
			alt.dismiss();
			LogResult_and_CaptureImage("PASS", "Dismiss Alert Popup", "Dismissed Alert Popup Successfully", "YES");
		} 
		catch (Exception e) 
		{
			// TODO: handle exception
			LogResult_and_CaptureImage("FAIL", "Dismiss Alert Popup", "Failed To Dismiss Alert", "YES");
			e.printStackTrace();
		}
	}

	public void doubleClick(By by, String elementname) throws Exception 
	{
		try 
		{
			fnStartWatch();
			WebDriverWait wait = new WebDriverWait(rdriver, 30);
			wait.until(ExpectedConditions.visibilityOfElementLocated(by));
			WebElement e1 = rdriver.findElement(by);
			if (e1.isDisplayed()) {
				Actions builder = new Actions(rdriver);
				builder.doubleClick(e1).build().perform();
				LogResult_and_CaptureImage("PASS", "Double Click", "Double Clicked On " +elementname+ " Element Successfully.", "NO");
			}
		} 
		catch (Exception e) 
		{
			// TODO: handle exception
			LogResult_and_CaptureImage("FAIL", "Double Click", " Failed To Locate " + elementname + " Element.", "YES");
			e.printStackTrace();
		}
	}

	//Click link in webtable
	//Pass the xpath of table and then search all links inside table and click link
	public void ClickLinkinWebTable1(By by,String elementname,String link) throws Exception
	{
		try
		{
			fnStartWatch();
			WebDriverWait wait = new WebDriverWait(rdriver, 30);
			wait.until(ExpectedConditions.visibilityOfElementLocated(by));
			WebElement e1 = rdriver.findElement(by);
			if(e1.isDisplayed())
			{
				WebElement webtable1 = rdriver.findElement(by);
				List<WebElement>links = webtable1.findElements(By.tagName("a"));
				int totallinks = links.size();

				List<String> value = new ArrayList<String>();
				for (int j=0; j<totallinks; j++){

					value.add(links.get(j).getText());
				}
				if (value.contains(link))
				{
					LogResult_and_CaptureImage("PASS", "Click Link", "'"+link+"'"+ " Clicked Link In Web Table Successfully", "NO");
				}
			}
		} 
		catch (Exception e)
		{
			// TODO: handle exception
			LogResult_and_CaptureImage("FAIL", "Error : Click Link", "Failed To Locate " +"'"+link+"'"+ " Link", "YES");
			e.printStackTrace();
		}
	}

	public void reloadPage() throws Exception 
	{
		try 
		{
			rdriver.navigate().refresh();
			rdriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			LogResult_and_CaptureImage("PASS", "Refresh Or Reload Page", "Page Refreshed Successfully", "NO");
		} 
		catch (Exception e) 
		{
			// TODO: handle exception
			LogResult_and_CaptureImage("FAIL", "Error : Refresh Or Reload Page", "Failed to Refresh page", "YES");
			e.printStackTrace();
		}
	}

	public void navigateBack() throws Exception 
	{
		try 
		{
			rdriver.navigate().back();
			rdriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			LogResult_and_CaptureImage("PASS", "Navigate Back", "Navigated Back To Previous Page Successfully", "NO");
		}
		catch (Exception e) 
		{
			// TODO: handle exception
			LogResult_and_CaptureImage("FAIL", "Error : Navigate Back", "Failed To Navigate To Back Page", "YES");
			e.printStackTrace();
		}
	}

	public void selectCheckbox(By by, String elementname) throws Exception 
	{
		try
		{
			WebDriverWait wait = new WebDriverWait(rdriver, 30);
			wait.until(ExpectedConditions.visibilityOfElementLocated(by));
			WebElement e1 = rdriver.findElement(by);
			if (e1.isDisplayed()) 
			{
				if (e1.isSelected()) 
				{
					LogResult_and_CaptureImage("FAIL", "Select Checkbox", elementname+ " Checkbox Is Already Selected", "YES");
				} 
				else 
				{
					e1.click();
					Thread.sleep(2000);
					LogResult_and_CaptureImage("PASS", "Select Checkbox", elementname+ " Checkbox Is Selected Successfully.", "YES");
				}
			}
		}
		catch (Exception e) 
		{
			// TODO: handle exception
			LogResult_and_CaptureImage("FAIL", "Error : Select Checkbox", "Failed To Locate " +elementname+ " Checkbox", "YES");
			e.printStackTrace();
		}
	}

	public void unselectCheckbox(By by, String elementname) throws Exception 
	{
		try 
		{
			WebDriverWait wait = new WebDriverWait(rdriver, 30);
			wait.until(ExpectedConditions.visibilityOfElementLocated(by));
			WebElement e1 = rdriver.findElement(by);
			if (e1.isDisplayed()) 
			{
				if (e1.isSelected()) 
				{
					e1.click();
					Thread.sleep(2000);
				} 
				else 
				{
					LogResult_and_CaptureImage("FAIL", "Unselect Checkbox", "Checkbox Is Already Unselected", "NO");
				}
			}
		} 
		catch (Exception e) 
		{
			// TODO: handle exception
			LogResult_and_CaptureImage("FAIL", "Error : Unselect Checkbox", " Checkbox Is Already Unselected", "YES");
			e.printStackTrace();
		}
	}

	public void selectByIndex(By by, String elementname, String data) throws Exception 
	{
		try 
		{
			WebDriverWait wait = new WebDriverWait(rdriver, 30);
			wait.until(ExpectedConditions.visibilityOfElementLocated(by));
			//wait.until(ExpectedConditions.elementToBeSelected(by));
			WebElement e1 = rdriver.findElement(by);
			if (e1.isDisplayed()) 
			{
				Select se = new Select(e1);
				int val = Integer.parseInt(data.trim());
				se.selectByIndex(val);
				LogResult_and_CaptureImage("PASS",  "Select By Index From Dropdown", elementname + " Is Selected From Dropdown Successfully.", "NO");
			}
		}
		catch (Exception e) 
		{
			// TODO: handle exception
			LogResult_and_CaptureImage("FAIL", "Select By Index From Dropdown", "Failed to select " + elementname + " from the dropdown.", "YES");
			e.printStackTrace();
		}
	}

	public void selectByText(By by, String elementname, String data) throws Exception {
		try 
		{
			WebDriverWait wait = new WebDriverWait(rdriver, 30);
			wait.until(ExpectedConditions.visibilityOfElementLocated(by));
			//wait.until(ExpectedConditions.elementToBeSelected(by));
			WebElement e1 = rdriver.findElement(by);
			if (e1.isDisplayed()) 
			{
				Select se = new Select(e1);
				se.selectByVisibleText(data.trim());
				LogResult_and_CaptureImage("PASS",  "Select By Text From Dropdown", elementname + " Is Selected From Dropdown Successfully.", "NO");
			}
		} 
		catch (Exception e) 
		{
			// TODO: handle exception
			LogResult_and_CaptureImage("FAIL", "Select By Text From Dropdown", "Failed to select " + elementname + " from the dropdown.", "YES");
			e.printStackTrace();
		}
	}
	
	public void jsSelect(By by, String item) {
		WebDriverWait wait = new WebDriverWait(rdriver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(by));
		//wait.until(ExpectedConditions.elementToBeSelected(by));
		WebElement e1 = rdriver.findElement(by);
	    JavascriptExecutor executor = (JavascriptExecutor) rdriver;
	    executor.executeScript("const textToFind = '" + item + "';" +
	            "const dd = arguments[0];" +
	            "dd.selectedIndex = [...dd.options].findIndex (option => option.text === textToFind);", e1);
	}
	public void selectByText(By by, String data) throws Exception {
		try 
		{
			WebDriverWait wait = new WebDriverWait(rdriver, 30);
			wait.until(ExpectedConditions.visibilityOfElementLocated(by));
			//wait.until(ExpectedConditions.elementToBeSelected(by));
			WebElement e1 = rdriver.findElement(by);
			if (e1.isDisplayed()) 
			{
				Select se = new Select(e1);
				se.selectByVisibleText(data.trim());
				LogResult_and_CaptureImage("PASS",  "Select By Text From Dropdown", data + " Is Selected From Dropdown Successfully.", "NO");
			}
		} 
		catch (Exception e) 
		{
			// TODO: handle exception
			LogResult_and_CaptureImage("FAIL", "Select By Text From Dropdown", "Failed to select " + data + " from the dropdown.", "YES");
			e.printStackTrace();
		}
	}


	public void verifyTitle(String Text) throws Exception 
	{
		try 
		{
			if (rdriver.getTitle().contains(Text))
				LogResult_and_CaptureImage("PASS", "Verify Page Title", "Page Title " +"'"+Text+"'"+" Is Verified", "NO");
		}
		catch (Exception e) 
		{
			// TODO: handle exception
			LogResult_and_CaptureImage("FAIL", "Verify Page Title", "Page Title " +"'"+Text+"'"+ " Does Not Match", "NO");
			e.printStackTrace();
		}
	}

	public void selectByValue(By by, String elementname, String data) throws Exception 
	{
		try 
		{
			WebDriverWait wait = new WebDriverWait(rdriver, 30);
			wait.until(ExpectedConditions.visibilityOfElementLocated(by));
			//wait.until(ExpectedConditions.elementToBeSelected(by));
			WebElement e1 = rdriver.findElement(by);
			if (e1.isDisplayed()) 
			{
				Select se = new Select(e1);
				se.selectByVisibleText(data.trim());
				LogResult_and_CaptureImage("PASS",  "Select By Value From Dropdown", elementname + " Is Selected From Dropdown Successfully.", "NO");
			}
		}
		catch (Exception e) 
		{
			// TODO: handle exception
			LogResult_and_CaptureImage("FAIL", "Select By Value From Dropdown", "Failed to select " + elementname + " from the dropdown.", "YES");
			e.printStackTrace();
		}
	}

	public void switchDefault() throws Exception 
	{
		// Switch Default Window
		try 
		{
			rdriver.switchTo().defaultContent();
			Thread.sleep(5000);
			LogResult_and_CaptureImage("PASS", "Switch Control To Default Window", "Control Switched To Default Window Successfully", "NO");
		} 
		catch (Exception e)
		{
			// TODO: handle exception
			LogResult_and_CaptureImage("FAIL", "Switch Control To Default Window", "Failed To Switch Control To Default Window", "YES");
			e.printStackTrace();
		}
	}

	public void frameByIndex(int Input) throws Exception 
	{
		try 
		{
			WebDriverWait wait = new WebDriverWait(rdriver, 20);
			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(Input));
			rdriver.switchTo().frame(Input);
			Thread.sleep(2000);
			LogResult_and_CaptureImage("PASS", "Switch In To Frame By Index", "Switched In To Frame Successfully.", "NO");
		} 
		catch (Exception e)
		{
			// TODO: handle exception
			LogResult_and_CaptureImage("FAIL", "Switch In To Frame By Index", "Failed To Switch In To Frame.", "YES");
			e.printStackTrace();
		}
	}

	public void frameByelement(By by) throws Exception 
	{
		try 
		{
			WebDriverWait wait = new WebDriverWait(rdriver, 20);
			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(by));
			WebElement e1 = rdriver.findElement(by);
			rdriver.switchTo().frame(e1);
			Thread.sleep(2000);
			LogResult_and_CaptureImage("PASS", "Switch In To Frame", "Switched To Frame Successfully.", "NO");
		} 
		catch (Exception e) 
		{
			// TODO: handle exception
			LogResult_and_CaptureImage("FAIL", "Switch In To Frame", "Failed To Locate Frame.", "YES");
			e.printStackTrace();
		}
	}

	//Updated - @11/2/2018 - By Suneel Kaushik Subramanya
	public void waitTillElementEnable(By by) throws Exception
	{
		try 
		{
			WebDriverWait wait = new WebDriverWait(rdriver, 30);
			wait.until(ExpectedConditions.elementToBeClickable(by));
		} 
		catch (Exception e) 
		{
			// TODO: handle exception
			LogResult_and_CaptureImage("FAIL", "Error : Time Out", "Element Is Not Clickable in the page", "YES");
			e.printStackTrace();
		}
	}

	public void waitTillElementVisible(By by) throws Exception
	{
		try
		{
			WebDriverWait wait = new WebDriverWait(rdriver, 30);
			wait.until(ExpectedConditions.visibilityOfElementLocated(by));
		} 
		catch (Exception e)
		{
			// TODO: handle exception
			LogResult_and_CaptureImage("FAIL", "Error : Time Out", "Element Is Not Visible In The Page", "YES");
			e.printStackTrace();
		}
	}

	public void ClickRadioButton(By by, String elementname) throws Exception
	{
		try 
		{
			fnStartWatch();
			WebElement e1 = rdriver.findElement(by);
			if (e1.isDisplayed()) 
			{
				if (e1.isSelected()) 
				{
					LogResult_and_CaptureImage("FAIL", "Click Radio Button",  elementname + " Radio Button is already Clicked", "YES");
				} 
				else 
				{
					e1.click();
					LogResult_and_CaptureImage("PASS", "Click Radio Button", "Clicked " +elementname + " Radio Button Successfully.", "YES");
				}
			}
		} 
		catch (Exception e) 
		{
			// TODO: handle exception
			LogResult_and_CaptureImage("FAIL", "Error : Click Radio Button", "Failed To Identify " + elementname+ " Radio Button", "YES");
			e.printStackTrace();
		}
	}

	//Need to add this keyword in the Keyword List
	public void ClickRadioButtonByValue(String data) throws Exception 
	{
		try 
		{
			List<WebElement> radios = rdriver.findElements(By.xpath("//input[@type='radio']"));
			System.out.println("No " +radios.size());

			for(int i=0;i<radios.size();i++)
			{
				System.out.println("value  "+ i +"   "+radios.get(i).getAttribute("value"));
				if (radios.get(i).getAttribute("value").contains(data)) 
				{
					radios.get(i).click();
				}
				LogResult_and_CaptureImage("PASS", "Click Radio Button By Value", data + "Radio Button Is Clicked Successfully.", "YES");
			}
		}
		catch (Exception e)
		{
			// TODO: handle exception
			LogResult_and_CaptureImage("FAIL", "Click Radio Button By Value", "Failed To Click " + data + " Radio Button.", "YES");
			e.printStackTrace();
		}
	}

	public void UnCheckAll() throws Exception 
	{
		int i=0;
		try 
		{
			List<WebElement> Check = rdriver.findElements(By.xpath("//input[@type='checkbox']"));
			System.out.println("No " +Check.size());
			for(i=0;i<Check.size();i++)
			{
				System.out.println("value  "+ i +"   "+Check.get(i).getText());
				if (Check.get(i).isSelected()) {
					Check.get(i).click();
				}
			}
			LogResult_and_CaptureImage("PASS", "Uncheck All Checkbox", "All Check Boxes are UnChecked Successfully.", "YES");
		}

		catch (Exception e) 
		{
			// TODO: handle exception
			LogResult_and_CaptureImage("FAIL", "Uncheck All Checkbox", "Failed To Unselect Checkboxes.", "YES");
			e.printStackTrace();
		}	
	}

	// Added on 04192018
	//Modified return type on 11/13/2018 - by Prathisha
	// Again Modified on 11/14/2018 - by Prathisha

	public boolean VerifyIsCheckboxSelected(By by, String elementname) throws Exception 
	{
		try 
		{
			@SuppressWarnings("unused")
			JavascriptExecutor js = (JavascriptExecutor) rdriver;
			WebDriverWait wait = new WebDriverWait(rdriver, 30);
			wait.until(ExpectedConditions.visibilityOfElementLocated(by));
			WebElement e1 = rdriver.findElement(by);
			if (e1.isDisplayed()) 
			{
				if (e1.isSelected()) 
				{
					LogResult_and_CaptureImage("PASS", "Verify Checkbox Is Selected", elementname + "Checkbox Is Selected", "YES");
				} 
			}
			return true;
		} 
		catch (Exception e) 
		{
			// TODO: handle exception
			LogResult_and_CaptureImage("FAIL", "Error : Verify Checkbox Is Not Selected", "Failed To Identify The " +elementname+ " Element", "YES");
			e.printStackTrace();
			return false;
		}
	}

	public boolean IsCheckboxSelected(By by, String elementname) throws Exception 
	{
		try 
		{
			
			WebDriverWait wait = new WebDriverWait(rdriver, 30);
			wait.until(ExpectedConditions.visibilityOfElementLocated(by));
			WebElement e1 = rdriver.findElement(by);
			if (e1.isDisplayed()) 
			{
				if (e1.isSelected()) 
				{
					return true;
					//LogResult_and_CaptureImage("PASS", "Verify Checkbox Is Selected", elementname + "Checkbox Is Selected", "YES");
				} 
				return false;
			}
			return false;
		} 
		catch (Exception e) 
		{
			// TODO: handle exception
			//    LogResult_and_CaptureImage("FAIL", "Error : Verify Checkbox Is Not Selected", "Failed To Identify The " +elementname+ " Element", "YES");
			e.printStackTrace();
			return false;
		}
	}


	public void VerifyIsCheckboxUnSelected(By by, String elementname) throws Exception 
	{
		try 
		{
			//Fluentwait
			/*WebElement e1;
			e1 = fluentWait(by, 2);*/
			WebDriverWait wait = new WebDriverWait(rdriver, 30);
			wait.until(ExpectedConditions.visibilityOfElementLocated(by));
			WebElement e1 = rdriver.findElement(by);
			if (e1.isDisplayed()) 
			{
				if (e1.isSelected()) 
				{
					LogResult_and_CaptureImage("FAIL", "Verify Checkbox Is Not Selected", elementname + "Checkbox Is Selected", "YES");
				} 
				else
				{
					LogResult_and_CaptureImage("PASS", "Verify Checkbox Is Not Selected", elementname + "Checkbox Is Not Selected", "YES");
				}
			}
		} 
		catch (Exception e) 
		{
			// TODO: handle exception
			LogResult_and_CaptureImage("FAIL", "Error : Verify Checkbox Is Not Selected", "Failed To Identify The " +elementname+ " Element", "YES");
			e.printStackTrace();
		}
	}
	
    // Click Button
           public void clickbuttonUsingSelenium(By by, String elementname) throws Exception 
           {
                  // Click Button
                  try 
                  {
                        fnStartWatch();
                        WebDriverWait wait = new WebDriverWait(rdriver, 45);
                        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
                        WebElement e1 = rdriver.findElement(by);
                        if (e1.isDisplayed()) 
                        {
                               e1.click();
                               LogResult_and_CaptureImage("PASS", "Click Button", "Clicked on " + elementname + " Button Successfully.", "YES");
                        }
                  } 
                  catch (Exception e) 
                  {
                        // TODO: handle exception
                        LogResult_and_CaptureImage("FAIL", "Click Button", "Failed To Click On " + elementname + " Button.", "YES");
                        e.printStackTrace();
                  }
           }


	//Updated @ 10/27/2018 - By Suneel Kaushik Subramanya
	public boolean VerifyElementVisible(By by, String elementname) throws Exception 
	{
		boolean result = false;
		try
		{
			//Explicitwait
			WebDriverWait wait = new WebDriverWait(rdriver, 30);
			wait.until(ExpectedConditions.visibilityOfElementLocated(by));
			WebElement e1 = rdriver.findElement(by);
			//WebElement e1;
			if (e1.isDisplayed()) 
			{
				if (!(elementname.equalsIgnoreCase("NO")))
				{
					LogResult_and_CaptureImage("PASS", "Verify Element Is Visible", elementname+ " Element Is Visible", "NO");
				}
				result = true;
			}

		} 
		catch (Exception e) 
		{
			// TODO: handle exception
			if (!(elementname.equalsIgnoreCase("NO")))
			{
				LogResult_and_CaptureImage("FAIL", "Verify Element Is Visible", elementname+ " Element Is Not Visible", "NO");
				e.printStackTrace();
			}


			result = false;
		}
		return result;
	}
	public boolean isObjectPresent(By by,String elementname){
		boolean foundObject=false;


		try{
			rdriver.findElement(by).isDisplayed();
			foundObject=true;
		}
		catch(Exception e){
			System.out.println(elementname+" is not present");
		}
		return foundObject;


	}

	////////////////////////////////////////////////////////
	public boolean VerifyElementPresent(By by, String elementname) throws Exception 
	{
		boolean result = false;
		try
		{
			//Explicitwait
			WebDriverWait wait = new WebDriverWait(rdriver, 30);

			wait.until(ExpectedConditions.presenceOfElementLocated(by));
			WebElement e1 = rdriver.findElement(by);

			if (e1.isDisplayed()) 
			{
				if (!(elementname.equalsIgnoreCase("NO")))
				{
					LogResult_and_CaptureImage("PASS", "Verify Element Is Visible", elementname+ " Element Is Visible", "NO");
				}
				result = true;
			}

		} 
		catch (Exception e) 
		{
			// TODO: handle exception
			if ((elementname.equalsIgnoreCase("NO")))
			{
				LogResult_and_CaptureImage("FAIL", "Verify Element Is Visible", elementname+ " Element Is Not Visible", "NO");
			}
			e.printStackTrace();

			result = false;
		}
		return result;
	}

	////////////////////////////////////////////////////
	//Updated - @ 10/29/2018 - By Suneel Kaushik Subramanya
	//Updated - @ 2/4/2019	- By Suneel Kaushik Subramanya
	public void VerifyElementNotVisible(By by, String elementname) throws Exception 
	{
		try
		{
			WebElement e1 = rdriver.findElement(by);
			if (e1.isDisplayed()) 
			{
				LogResult_and_CaptureImage("FAIL", "Verify Element Is Not Visible", elementname+ " Element Is Visible", "NO");

			}
		}
		catch (Exception e) 
		{
			// TODO: handle exception
			LogResult_and_CaptureImage("PASS", "Verify Element Is Not Visible", elementname+ " Element Is Not Visible", "YES");

		}
	}

	//Updated - @ 10/29/2018 - By Suneel Kaushik Subramanya
	public void PageShouldContainsText(String text) throws Exception 
	{
		try 
		{
			if(rdriver.getPageSource().contains(text))
			{
				LogResult_and_CaptureImage("PASS", "Verify Page Contains Text", "Page Contains The Data " +text, "YES");
			}
			else
			{
				LogResult_and_CaptureImage("FAIL", "Verify Page Contains Text", "Page Does Not Contains The Data " +text, "YES");
			}
		} 
		catch (Exception e)
		{
			// TODO: handle exception
			LogResult_and_CaptureImage("FAIL", "Error : Verify Page Contains Text", "Error While Locating The Text " +text, "YES");
			e.printStackTrace();
		}
	}

	//Updated - @ 10/29/2018 - By Suneel Kaushik Subramanya
	public void PageShouldContainsImage(By by, String elementname) throws Exception 
	{
		try 
		{
			//Fluentwait
			/*WebElement ImageFile;
			ImageFile = fluentWait(by, 2);*/
			WebDriverWait wait = new WebDriverWait(rdriver, 30);
			wait.until(ExpectedConditions.visibilityOfElementLocated(by));
			WebElement ImageFile = rdriver.findElement(by);

			Boolean ImagePresent = (Boolean) ((JavascriptExecutor)rdriver).executeScript("return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0", ImageFile);
			if (ImagePresent)
			{
				LogResult_and_CaptureImage("PASS", "Verify Page Contains Image", "Page Contains The Image " +elementname, "NO");
			}
			else
			{
				LogResult_and_CaptureImage("FAIL", "Verify Page Contains Image", "Page Does Not Contains The Image " +elementname, "NO");
			}
		} 
		catch (Exception e)
		{
			// TODO: handle exception
			LogResult_and_CaptureImage("FAIL", "Error : Verify Page Contains Image", "Error In Locating " +elementname+ " Image", "YES");	
			e.printStackTrace();
		}
	}

	//Hower Mouse over an element - updated @11/2/2018 - By Suneel Kaushik Subramanya
	public void HowerMouse(By by, String elementname) throws Exception
	{
		try 
		{
			WebDriverWait wait = new WebDriverWait(rdriver, 30);
			wait.until(ExpectedConditions.visibilityOfElementLocated(by));
			WebElement e1 = rdriver.findElement(by);
			if (e1.isDisplayed()) 
			{
				Actions actions = new Actions(rdriver);
				actions.moveToElement(e1).build().perform();
				LogResult_and_CaptureImage("PASS", "Perform Mouse Hower", "Successfully Mouseover on "+elementname, "NO");
			}
		} 
		catch (Exception e) 
		{
			// TODO: handle exception
			LogResult_and_CaptureImage("FAIL", "Perform Mouse Hower", "Failed To Mouseover On " +elementname, "NO");
			e.printStackTrace();
		}
	}
	//////////////////////////////////////////////
	//Hower Mouse over an element - updated @11/2/2018 - By Suneel Kaushik Subramanya
	public void HowerPaginationDots(By by, String elementname) throws Exception
	{
		try 
		{
			WebDriverWait wait = new WebDriverWait(rdriver, 30);
			wait.until(ExpectedConditions.visibilityOfElementLocated(by));
			WebElement e1 = rdriver.findElement(by);
			if (e1.isDisplayed()) 
			{
				Actions actions = new Actions(rdriver);
				//actions.moveToElement(e1).build().perform();
				actions.moveToElement(e1);
				actions.clickAndHold();
				actions.perform();
				LogResult_and_CaptureImage("PASS", "Perform Mouse Hower", "Successfully Mouseover on "+elementname, "NO");
			}
		} 
		catch (Exception e) 
		{
			// TODO: handle exception
			LogResult_and_CaptureImage("FAIL", "Perform Mouse Hower", "Failed To Mouseover On " +elementname, "NO");
			e.printStackTrace();
		}
	}
	/////////////////////////////////
	public void MenuSelection_HowerMouse(By by, String elementname, String data) throws Exception 
	{
		try 
		{
			WebDriverWait wait = new WebDriverWait(rdriver, 30);
			wait.until(ExpectedConditions.visibilityOfElementLocated(by));
			WebElement e1 = rdriver.findElement(by);
			if (e1.isDisplayed()) 
			{
				WebElement element = rdriver.findElement(By.linkText(data));
				WebElement el = rdriver.findElement(by);
				Actions actions = new Actions(rdriver);
				actions.moveToElement(element).perform();
				actions.moveToElement(el).click();
				LogResult_and_CaptureImage("PASS", "Select Menu Through Mouse Hower", "Selected " +elementname+ " Menu Successfully.", "NO");
			}
		}
		catch (Exception e) 
		{
			// TODO: handle exception
			LogResult_and_CaptureImage("FAIL", "Select Menu Through Mouse Hower", "Failed To Select Menu " +elementname+ " Through Mouse Hover", "NO");
			e.printStackTrace();
		}
	}

	// Robotclass for sendkeys
	public void KeyBoard_Events(String data) throws Exception 
	{
		try 
		{
			Robot r=new Robot();
			if (data.equalsIgnoreCase("Enter"))
			{
				r.keyPress(KeyEvent.VK_ENTER);
			}
			else if ((data.equalsIgnoreCase("Tab")))
			{
				r.keyPress(KeyEvent.VK_TAB );
			}
			LogResult_and_CaptureImage("PASS", "Send A Keyboard Event", "Key " +data+ " Pressed Successfully.", "NO");
		}

		catch (Exception e) 
		{
			// TODO: handle exception
			LogResult_and_CaptureImage("FAIL", "Send A Keyboard Event", "Failed to Click  the Keyboard.", "NO");
			e.printStackTrace();
		}	
	}

	//Verify Header Count - updated @ 11/3/2018 - By Suneel kaushik Subramanya
	public void HeaderCountShouldBe(By by,String elementname,int headercount) throws Exception 
	{

		try 
		{
			WebDriverWait wait = new WebDriverWait(rdriver, 30);
			wait.until(ExpectedConditions.visibilityOfElementLocated(by));
			//WebElement e1 = rdriver.findElement(by);

			List<WebElement> allHeadersOfTable =  rdriver.findElements(by);
			int totalHeaders = allHeadersOfTable.size();   
			assertTrue(totalHeaders == headercount);
			LogResult_and_CaptureImage("PASS", "Compare Header Count", headercount+" Is Same", "NO");

		} 
		catch (Exception e) 
		{
			// TODO: handle exception
			LogResult_and_CaptureImage("FAIL", "Compare Header Count", "Failed To Get Header Count", "YES");
			e.printStackTrace();
		}	
	}

	//Verify Table Existence - updated @ 11/3/2018 - By Suneel Kaushik Subramanya
	public void VerifyTableExistence(By by,String elementname) throws Exception
	{
		try
		{
			/*//Fluentwait
			WebElement e1;*/
			//e1 = fluentWait(by, 2);
			WebDriverWait wait = new WebDriverWait(rdriver, 30);
			wait.until(ExpectedConditions.visibilityOfElementLocated(by));
			WebElement e1 = rdriver.findElement(by);
			if(e1.isDisplayed())
			{
				WebElement webtable1 = rdriver.findElement(by);
				List<WebElement>rows = webtable1.findElements(By.tagName("tr"));
				int totalrows = rows.size();
				List<WebElement>columns = rows.get(0).findElements(By.tagName("th"));
				int totalcolumns = columns.size();
				//Added screenshot and log
				LogResult_and_CaptureImage("PASS", "Verify Table Existence", "Found Table With " +totalrows+ " Rows And " +totalcolumns+ " Columns", "YES");
			}
		}
		catch (Exception e)
		{
			// TODO: handle exception
			LogResult_and_CaptureImage("FAIL", "Verify Table Existence", "Failed To Find Table", "YES");
			e.printStackTrace();	
		}
	}

	public void uploadFile(String filename) throws AWTException
	{
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

	//Prathisha for revel
	public void ElementShouldContainText(By by, String elementname, String data) throws Exception 
	{
		try 
		{
			//Fluentwait
			//WebElement e1;
			//e1 = fluentWait(by, 2);
			WebDriverWait wait = new WebDriverWait(rdriver, 45);
			wait.until(ExpectedConditions.visibilityOfElementLocated(by));
			WebElement e1 = rdriver.findElement(by);
			if (e1.isDisplayed()) 
			{
				String actualString = e1.getText();
				String Userverify = (actualString.substring(0, actualString.indexOf(','))).trim();
				boolean ActualText = data.contains(Userverify);
				if (ActualText) 
				{
					LogResult_and_CaptureImage("PASS", "Element Should Contain", data+" Presents In Element", "YES");
				} 
				else
				{
					LogResult_and_CaptureImage("FAIL", "Element Should Contain", data+" Is Not Present In Element", "YES");
				}
				//assertTrue(actualString.replaceAll("\\n", "").replaceAll("\\t", "").replaceAll(" ", "").toUpperCase().contains(data.replaceAll(" ", "").toUpperCase()));
				//LogResult_and_CaptureImage("PASS", "Element Should Contain", data+" Presents In Element", "YES");
			}
		} 
		catch (Exception e)
		{
			// TODO: handle exception
			LogResult_and_CaptureImage("FAIL", "Element Should Contain", data+" Is Not Present In Element", "YES");
			e.printStackTrace();
		}
	}
	public void fnContentValidation(String data) throws Exception {
		try {

			//fnSwitchToNewwindow();
			WebElement e1=rdriver.findElement(By.xpath(".//*[@class='container mainContainer']"));
			if (e1.isDisplayed()) {
				String actualString = e1.getText().trim();
				System.out.println(">>>>>>>"+actualString+">>>>>>>>>>");
				assertTrue(actualString.equalsIgnoreCase(data.trim()));
				LogResult_and_CaptureImage("Pass", "Content Validation", "'"+data+ "'"+ " Content validated successfully", "YES");

			}
			//fnCloseCurrentTab();
			// fnSwitchToDefaultTab();



		} catch (Exception e) {
			// TODO: handle exception
			LogResult_and_CaptureImage("Fail", "Content Validation", "'"+data+ "'"+ " Content validation UnSuccessfull", "YES");
			e.printStackTrace();

		}
	}
	public void clearElementText(By by, String elementname) throws Exception 
	{
		try 
		{
			WebDriverWait wait = new WebDriverWait(rdriver, 30);
			wait.until(ExpectedConditions.visibilityOfElementLocated(by));
			WebElement e1 = rdriver.findElement(by);
			if (e1.isDisplayed())
			{
				Actions actions = new Actions(rdriver);
				actions.moveToElement(e1).click().build().perform();
				e1.clear();
				e1.sendKeys(" ");
				LogResult_and_CaptureImage("PASS", "Clear Element Text", "Cleared " + elementname + " Field Successfully.", "NO");
			}
		} 
		catch (Exception e) 
		{
			// TODO: handle exception
			LogResult_and_CaptureImage("FAIL", "Clear Element Text", "Failed To Clear " + elementname + " Field.", "YES");
			e.printStackTrace();
		}
	}

	public void VerifyLinkExistence(By by, String elementname) throws Exception 
	{
		try 
		{
			//Fluentwait
			/*WebElement e1;
			e1 = fluentWait(by, 2);*/
			WebDriverWait wait = new WebDriverWait(rdriver, 30);
			wait.until(ExpectedConditions.visibilityOfElementLocated(by));
			WebElement e1 = rdriver.findElement(by);
			if (e1.isDisplayed()) 
			{
				LogResult_and_CaptureImage("PASS", "Verify Link Existence", elementname+ " Link " +" Exist", "NO");
			}
		} 
		catch (Exception e) 
		{
			// TODO: handle exception
			LogResult_and_CaptureImage("FAIL", "Verify Link Existence", elementname+ " Link " +" Does Not Exist", "YES");
			e.printStackTrace();
		}
	}

	//Verify Table Should contain
	public void TableShouldContain(By by,String elementname,String data) throws Exception
	{
		try
		{
			//Fluentwait
			/*WebElement e1;
			e1 = fluentWait(by, 2);*/
			WebDriverWait wait = new WebDriverWait(rdriver, 30);
			wait.until(ExpectedConditions.visibilityOfElementLocated(by));
			WebElement e1 = rdriver.findElement(by);
			if(e1.isDisplayed())
			{
				WebElement webtable1 = rdriver.findElement(by);
				List<WebElement>rows = webtable1.findElements(By.tagName("tr"));
				List<WebElement>columns = rows.get(0).findElements(By.tagName("th"));
				int totalcolumns = columns.size();
				List<String> value = new ArrayList<String>();
				for (int j=0; j<totalcolumns; j++)
				{
					value.add(columns.get(j).getText());
				}
				if (value.contains(data))
				{
					LogResult_and_CaptureImage("PASS", "Table Should Contain", "'"+data+"'"+" Found In Table", "NO");
				}
			}
		} 
		catch (Exception e)
		{
			// TODO: handle exception
			LogResult_and_CaptureImage("FAIL", "Table Should Contain", "Failed To Find "+ "'"+ data+"'" +" In Table", "YES");
			e.printStackTrace();	
		}
	}	

	//Click link in webtable
	//Pass the xpath of table and then search all links inside table and click link
	public void ClickLinkinWebTable(By by,String elementname,String link) throws Exception
	{
		try
		{
			WebDriverWait wait = new WebDriverWait(rdriver, 30);
			wait.until(ExpectedConditions.visibilityOfElementLocated(by));
			WebElement e1 = rdriver.findElement(by);
			if(e1.isDisplayed())
			{
				WebElement webtable1 = rdriver.findElement(by);
				List<WebElement>links = webtable1.findElements(By.tagName("a"));
				int totallinks = links.size();

				List<String> value = new ArrayList<String>();
				for (int j=0; j<totallinks; j++)
				{
					value.add(links.get(j).getText());
				}
				if (value.contains(link))
				{
					LogResult_and_CaptureImage("PASS", "Click Link", link + " Clicked Link In Webtable Successfully", "NO");
				}
			}
		} 
		catch (Exception e)
		{
			// TODO: handle exception
			LogResult_and_CaptureImage("FAIL", "Click Link", link+" Link Not Found In Table", "YES");
			e.printStackTrace();	
		}
	}

	//TableShouldNotContain
	public void TableShouldNotContain(By by,String elementname,String data) throws Exception
	{
		try
		{
			WebDriverWait wait = new WebDriverWait(rdriver, 30);
			wait.until(ExpectedConditions.visibilityOfElementLocated(by));
			WebElement e1 = rdriver.findElement(by);
			if(e1.isDisplayed())
			{
				WebElement webtable1 = rdriver.findElement(by);
				List<WebElement>rows = webtable1.findElements(By.tagName("tr"));
				List<WebElement>columns = rows.get(0).findElements(By.tagName("th"));
				int totalcolumns = columns.size();
				List<String> value = new ArrayList<String>();
				for (int j=0; j<totalcolumns; j++)
				{
					value.add(columns.get(j).getText());
				}
				if (value.contains(data))
				{
					LogResult_and_CaptureImage("FAIL", "Table Should Not Contain", "'" +data+"'"+ " Was Found In Table ", "YES");
				}
			}
		}
		catch (Exception e)
		{
			// TODO: handle exception
			LogResult_and_CaptureImage("PASS", "Table Should Not Contain", "Failed to find "+"'" +data+"'"+ " In Table", "YES");
			e.printStackTrace();
		}
	}
	 
		public void fnScrollToViewAndClick(By by, String elemntName) throws Exception 
				{
					//Wait till the element is visible
					//Fluentwait
					/*WebElement e1;
					e1 = fluentWait(by, 2);*/
					try{
						WebDriverWait wait = new WebDriverWait(rdriver, 30);
						wait.until(ExpectedConditions.visibilityOfElementLocated(by));
						WebElement e1 = rdriver.findElement(by);

						((JavascriptExecutor) rdriver).executeScript("arguments[0].scrollIntoView(true);", e1);
						Thread.sleep(3000);
						LogResult_and_CaptureImage("PASS", "Scroll", "Passed to scroll down till " + elemntName + " element found", "YES");
						
						//e1.click();
					}
					catch(Exception e){

						LogResult_and_CaptureImage("FAIL", "Scroll", "Failed to scroll or click on element", "YES");
						e.printStackTrace();
					} 
				}
		 

	

	public boolean isclickable(By by, String elementname) throws Exception 
	{
		try 
		{
			fnStartWatch();
			WebDriverWait wait = new WebDriverWait(rdriver, 30); 
			 wait.until(ExpectedConditions.elementToBeClickable(by));
			/*JavascriptExecutor executor = (JavascriptExecutor)rdriver;
			executor.executeScript("arguments[0].click();", e2);*/
			LogResult_and_CaptureImage("Fail", "Click Object", "Element" + elementname + " is clickable ", "Yes");
			return false;
		} 
		catch (Exception e) 
		{
			LogResult_and_CaptureImage("PASS", "Click Object", "Element " + elementname + " is not clickable", "Yes");
			return true;
		}
	}
	//Login Function - updated @ 11/2/2018 - By Suneel kaushik Subramanya
	//Updated again @11/28/2018 - By Suneel Kaushik Subramanya
	//Updated again @2/1/2018 - By Suneel Kaushik Subramanya
	public void fnLogin(String ...strings) throws Exception
	{
		try
		{	
			fnStartWatch();
			WebDriverWait wait = new WebDriverWait(rdriver, 30);
			WebElement e1 = null;
			WebElement e2 = null;
			WebElement e3 = null;
			JavascriptExecutor executor = (JavascriptExecutor)rdriver;
			if ((strings.length < 2)||(strings.length >3))
			{
				System.err.println("Usage: ... [username] [password] ...[Optional : Vuse - when working with Vuse]");
				System.exit(1);
			}
			if (strings.length > 2)
			{
				e1 = rdriver.findElement(By.id("email"));
				e2 = rdriver.findElement(By.id("pass"));
				e3 = rdriver.findElement(By.id("send2"));
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
			}
			else
			{
				e1 = rdriver.findElement(By.id("username"));
				e2 = rdriver.findElement(By.id("password"));
				e3 = rdriver.findElement(By.id("edit-submit"));
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));

			}
			if(e1.isDisplayed())
			{	
				e1.sendKeys(strings[0]);
				e2.sendKeys(strings[1]);
				fnStartWatch();
				executor.executeScript("arguments[0].click();", e3);
				waitForPageLoad();
			}
			LogResult_and_CaptureImage("PASS", "Login To Application", "Logged In To Application", "YES");
		}
		catch (Exception e)
		{
			// TODO: handle exception
			LogResult_and_CaptureImage("FAIL", "Login To Application", "Failed To Login To The Application", "YES");
			e.printStackTrace();
			//Stop The Timer
			fnStopWatch();
		}
	}

	//verify page displayed using URL
	public void VerifyPageDisplayed(String url) throws Exception 
	{
		try 
		{
			waitForPageLoad();
			Thread.sleep(10000);
			String pageTitle = rdriver.getCurrentUrl();
			if (pageTitle.toUpperCase().contains(url.toUpperCase())) 
			{
				LogResult_and_CaptureImage("PASS", " Verify Page Is Displayed Using URL", url + " Page Is Displayed", "YES", fnStopWatch());

			} 
			else 
			{
				LogResult_and_CaptureImage("FAIL", "Verify Page Is Displayed Using URL", "Following " +url+ " Page Is Not Displayed", "YES");
			}
		}
		catch (Exception e) 
		{
			// TODO: handle exception
			LogResult_and_CaptureImage("FAIL", "Error", "Failed To Load Page With Title : " + url, "YES");
			e.printStackTrace();
		}
	}

	//Updated - @ 10/29/2018 - By Suneel Kaushik Subramanya
	public boolean VerifyObjectDisplayed(By by) throws Exception 
	{
		/*//Fluentwait
		WebElement e1;
		e1 = fluentWait(by, 2);*/
		try
		{
			WebDriverWait wait = new WebDriverWait(rdriver, 30);
			wait.until(ExpectedConditions.visibilityOfElementLocated(by));
			WebElement e1 = rdriver.findElement(by);

			if(e1.isDisplayed())
			{
				LogResult_and_CaptureImage("PASS", "Verify Object Is Displayed", "Object Is Displayed", "YES");
			}
			return e1.isDisplayed();
		}
		catch (Exception e)
		{
			LogResult_and_CaptureImage("FAIL", "Error", "Failed To Locate The Object", "YES");
			return false;
		}
	}
	public boolean VerifyElementVisiblescrncptr(By by, String elementname) throws Exception 
	{
		boolean result = false;
		try
		{
			//Explicitwait
			WebDriverWait wait = new WebDriverWait(rdriver, 45);
			wait.until(ExpectedConditions.visibilityOfElementLocated(by));
			WebElement e1 = rdriver.findElement(by);

			if (e1.isDisplayed()) 
			{
				if (!(elementname.equalsIgnoreCase("NO")))
				{
					LogResult_and_CaptureImage("PASS", "Verify Element Is Visible", elementname+ " Element Is Visible", "YES");
				}
				result = true;
			}

		} 
		catch (Exception e) 
		{
			// TODO: handle exception
			if (!(elementname.equalsIgnoreCase("NO")))
			{
				LogResult_and_CaptureImage("FAIL", "Verify Element Is Visible", elementname+ " Element Is Not Visible", "NO");
			}
			e.printStackTrace();

			result = false;
		}
		return result;
	}

	public void ScrollDownUsingAction() throws Exception
	{
		try
		{
			Actions pgdn = new Actions(rdriver);
			pgdn.sendKeys(Keys.PAGE_DOWN).build().perform();
			Thread.sleep(1000);
			LogResult_and_CaptureImage("PASS", "Scroll Page Down", "Page Successfully Scrolled Down", "NO");
		}
		catch (Exception e) 
		{
			// TODO: handle exception
			LogResult_and_CaptureImage("FAIL", "Scroll Page Down", "Unable To Scroll Page Down", "YES");
			e.printStackTrace();
		}

	}
	public boolean Vuse_CF_VerifyObjectDisplayed(By by) throws Exception 
	{
		/*//Fluentwait
		WebElement e1;
		e1 = fluentWait(by, 2);*/
		try
		{
			WebDriverWait wait = new WebDriverWait(rdriver, 30);
			wait.until(ExpectedConditions.visibilityOfElementLocated(by));
			WebElement e1 = rdriver.findElement(by);

			if(e1.isDisplayed())
			{
				System.out.println("Object Is Displayed");
				//LogResult_and_CaptureImage("PASS", "Verify Object Is Displayed", "Object Is Displayed", "YES");
			}
			return e1.isDisplayed();
		}
		catch (Exception e)
		{
			LogResult_and_CaptureImage("FAIL", "Error", "Failed To Locate The Object", "YES");
			return false;
		}
	}
	public boolean VerifyObjectDisplayed(By by,String Element) throws Exception 
	{
		/*//Fluentwait
		WebElement e1;
		e1 = fluentWait(by, 2);*/
		try
		{
			WebDriverWait wait = new WebDriverWait(rdriver, 20);
			wait.until(ExpectedConditions.visibilityOfElementLocated(by));
			WebElement e1 = rdriver.findElement(by);

			if(e1.isDisplayed())
			{

				LogResult_and_CaptureImage("PASS", "Verify"+ "Object" +  "Is Displayed",Element + "Is Displayed", "Yes");
			}
			return e1.isDisplayed();
		}
		catch (Exception e)
		{
			System.out.println("Proceeding to Else block as"+ Element+ "is not found" );
			return false;
		}
	}
	public boolean Vuse_CF_VerifyObjectDisplayed(By by,String Element) throws Exception 
	{
		/*//Fluentwait
		WebElement e1;
		e1 = fluentWait(by, 2);*/
		try
		{
			WebDriverWait wait = new WebDriverWait(rdriver, 20);
			wait.until(ExpectedConditions.visibilityOfElementLocated(by));
			WebElement e1 = rdriver.findElement(by);

			if(e1.isDisplayed())
			{
				System.out.println(Element +"is visible");
				//LogResult_and_CaptureImage("PASS", "Verify Object Is Displayed", "Object Is Displayed", "Yes");
			}
			return e1.isDisplayed();
		}
		catch (Exception e)
		{
			System.out.println("Proceeding to Else block");
			return false;
		}
	}

	//Updated @ 10/29/2018 - By Suneel Kaushik Subramanya
	//Updated again @ 11/2/2018 - By Suneel Kaushik Subramanya
	//Updated again @ 12/14/2018 - By Suneel Kaushik Subramanya
	public void VerifyPageDisplayed(By by,String pageName) throws Exception 
	{
		try 
		{	
			
			WebDriverWait wait = new WebDriverWait(rdriver, 45);
			wait.until(ExpectedConditions.visibilityOfElementLocated(by));
							
				WebElement e1 = rdriver.findElement(by);

				if (e1.isDisplayed())
				{
					//Changed @ 12/14/2018 - below single line
					LogResult_and_CaptureImage("PASS", "Verify Page Is Displayed", pageName + " page is Displayed", "YES", fnStopWatch());
				} 
				else 
				{
					LogResult_and_CaptureImage("FAIL", "Verify Page Is Displayed", pageName + " page is not Displayed", "YES");
				}
			
			
		}
		catch (Exception e) 
		{
			// TODO: handle exception
			LogResult_and_CaptureImage("FAIL", "Error", "Failed As Element " + pageName + " Could Not Be Located", "YES");
			e.printStackTrace();
			endReport();
		}
	}

	//Page validation using page title - updated @ 11/2/2018 - By Suneel Kaushik Subramanya
	public void VerifyPageDisplayedUsingPageTitle(String title) throws Exception 
	{
		try
		{
			//waitForPageLoad();
		//	WebDriverWait wait = new WebDriverWait(rdriver, 30);
		//	wait.until(ExpectedConditions.visibilityOfElementLocated(by));
			//WebElement e1 = rdriver.findElement(by);
			String pageTitle = rdriver.getTitle();
			if (pageTitle.toUpperCase().contains(title.toUpperCase())) 
			{
				LogResult_and_CaptureImage("PASS", "Verify Page Is Displayed Using Page Title", title + " Page Is Displayed", "YES", fnStopWatch());
			} 
			else
			{
				LogResult_and_CaptureImage("FAIL", "Verify Page Is Displayed Using Page Title", title + " Page Is Not Displayed ", "YES");
			}
		} 
		catch (Exception e) 
		{
			// TODO: handle exception
			LogResult_and_CaptureImage("FAIL", "Error", title + "page is not Displayed", "YES");
			e.printStackTrace();
		}
	}
	//For Vuse
	public void VerifyPageDisplayedUsingPagetitle(String title) throws Exception 
	{
		try
		{
			//waitForPageLoad();
		//	WebDriverWait wait = new WebDriverWait(rdriver, 30);
			//wait.until(ExpectedConditions.visibilityOfElementLocated(by));
			//WebElement e1 = rdriver.findElement(by);
			boolean pageTitle = rdriver.getTitle().contains(title);
			if (pageTitle) 
			{
				LogResult_and_CaptureImage("PASS", "Verify Page Is Displayed Using Page Title", title + " Page Is Displayed", "YES", fnStopWatch());
			} 
			else
			{
				LogResult_and_CaptureImage("FAIL", "Verify Page Is Displayed Using Page Title", title + " Page Is Not Displayed ", "YES");
			}
		} 
		catch (Exception e) 
		{
			// TODO: handle exception
			LogResult_and_CaptureImage("FAIL", "Error", title + "page is not Displayed", "YES");
			e.printStackTrace();
		}
	}
	public void fnContentValidate(String data , By by) throws Exception {
		try {
			WebElement e1=rdriver.findElement(by);
			//System.out.println("E"+e1.getText());
			String actualString = e1.getText().trim();
			boolean ActualString = actualString.equalsIgnoreCase(data);
			//contains(data);
			System.out.println(">>>>>>>Expected string"+data+">>>>>>");
			System.out.println(">>>>>>>"+actualString+">>>>>>");
			//assertTrue(actualString.contains(data));

			if(ActualString){
				LogResult_and_CaptureImage("Pass", "Content Validation", "'"+data+ "'"+ " Content validated successfully", "YES");
			}
			else
			{
				LogResult_and_CaptureImage("Fail", "Content Validation", "'"+data+ "'"+ " Content validation failed", "YES");
			}


		} catch (Exception e) 
		{
			// TODO: handle exception
			LogResult_and_CaptureImage("FAIL", "Error : Verify Text From Alert", "Alert Text Verification Failed", "YES");
			e.printStackTrace();
		}
	}
	public void fnTextContains(String data , By by) throws Exception {
		try {
			WebElement e1=rdriver.findElement(by);
			//System.out.println("E"+e1.getText());
			data=data.replace(" ", "").trim();
			String actualString = e1.getText().replace(" ", "").trim();

			//String ActualString = actualString.replace(" ", "");
			//boolean AS = Boolean.parseBoolean(ActualString);
			boolean AS = actualString.equalsIgnoreCase(data);
			//contains(data);
			System.out.println(">>>>>>>Expected string"+data+">>>>>>");
			System.out.println(">>>>>>>"+actualString+">>>>>>");
			//assertTrue(actualString.contains(data));

			if(AS){
				LogResult_and_CaptureImage("Pass", "Content Validation", "'"+data+ "'"+ " Content validated successfully", "YES");
			}
			else
			{
				LogResult_and_CaptureImage("Fail", "Content Validation", "'"+data+ "'"+ " Content validation failed", "YES");
			}


		} catch (Exception e) 
		{
			// TODO: handle exception
			LogResult_and_CaptureImage("FAIL", "Error : Verify Text From Alert", "Alert Text Verification Failed", "YES");
			e.printStackTrace();
		}
	}


	//Content Validation - Added @ 10/29/2018 - By Prathisha
	public void fnContentValidation(String data,By by) throws Exception 
    {
          try
          {
                 WebElement e1=rdriver.findElement(by);
                 if (e1.isDisplayed()) {
                        String actualString = e1.getText().trim().replace("\n","").replace(" ", "");
                        data=data.trim().replace("\n", "").replace(" ", "");
                     //   String ActualText = e1.getText().trim().replace("\n","").replace(" ", "");
                        boolean ActualString = actualString.equalsIgnoreCase(data);
                        System.out.println(">>>FromApplication>>>>"+actualString+">>>FromApplication>>>");
                        System.out.println(">>>FromDataSheet>>>>"+data+">>>FromDataSheet>>>");

                        if(ActualString){
                              LogResult_and_CaptureImage("Pass", "Content Validation", "'"+data+ "'"+ " Content validated successfully", "YES");
                        }
                        else
                        {
                              LogResult_and_CaptureImage("Fail", "Content Validation", "'"+data+ "'"+ " Content validation failed", "YES");
                        }
                 }
                 
          }

          catch (Exception e) 
          {
                 // TODO: handle exception
                 LogResult_and_CaptureImage("FAIL", "Content Validation", "'"+data+ "'"+ " Is Not Present In Element", "YES");
                 e.printStackTrace();
          }
    }



	public void ClickUsingRobo(int x, int y) throws Exception
	{
		try
		{
			Robot r = new Robot();
			r.mouseMove(x,y);
			r.mousePress( InputEvent.BUTTON1_MASK );
			r.mouseRelease( InputEvent.BUTTON1_MASK );
			LogResult_and_CaptureImage("PASS", "ClickUsingRobo", "Element Clicked Successfully", "NO");
		}
		catch (Exception e) 
		{
			// TODO: handle exception
			LogResult_and_CaptureImage("FAIL", "ClickUsingRobo", "Unable to Click the Element", "YES");
			e.printStackTrace();
		}

	}
	public void fnStartsWith(String expected, String actual) throws DocumentException, Exception
	{

		if(actual.startsWith(expected))
		{
			LogResult_and_CaptureImage("PASS", "Starts with verified ", " Verified Successfully", "YES");
			System.out.println("Starts with Matches");
		}else
		{
			LogResult_and_CaptureImage("FAIL", "Error : On verification", " Verification Failed", "YES");
			Assert.fail("Content was not matching-Starts with"+ expected + actual);
		}
	}

	public boolean fnStringContains(String[] exp, String Actual) throws DocumentException, Exception
	{
		for (int i=0; i<exp.length;i++)
		{
			try{
				if(exp[i].toString().contentEquals(Actual))
				{
					LogResult_and_CaptureImage("PASS", "Content matches ", " Verified Successfully", "YES");
					System.out.println("Content Matches");
					return true;
				}
			}

			catch (Exception e) 
			{
				Assert.fail("Content was not matching with one of the values"+ exp[0] + Actual);
				return false;
			}


		}
		return false;

	}

	public void HardRestrictionValidationminicart(String RestrictionType, String data2, By ...by) throws Exception
	{
		try
		{
	//		WebDriverWait wait = new WebDriverWait(rdriver, 60);
		//	JavascriptExecutor executor = (JavascriptExecutor)rdriver;
			if(RestrictionType.equalsIgnoreCase("Hard"))
			{



				//Not available for shipment
				fnContentValidation( data2,by[0]); 

			}
		}
		catch(Exception e)
		{
			System.err.println("Usage: ... [Error textString]..[Error textString]..]");
			LogResult_and_CaptureImage("FAIL", "Error : On verification", " Verification Failed", "YES");
		}



	}

	public int getAllElementsAndSum(By by,String elementname) throws DocumentException, Exception
	{
		int count=0;

		try{

		//	JavascriptExecutor js = (JavascriptExecutor) rdriver;
			WebDriverWait wait = new WebDriverWait(rdriver, 30);
			wait.until(ExpectedConditions.visibilityOfElementLocated(by));
			List<WebElement> element = rdriver.findElements(by);
			int elementSize = element.size();
			System.out.println("eleme"+elementSize);               
			//List<String> value = new ArrayList<String>();

			for (int j=0; j<elementSize; j++){

				String temp= element.get(j).getText();
				System.out.println("temp"+temp);
				count = count + Integer.parseInt(temp.substring(1, temp.length()-1));
			}
			LogResult_and_CaptureImage("PASS", "Content matches ", " Verified Successfully", "YES");
			System.out.println("count inside try"+count);
			return count;
		} catch (Exception e)
		{
			// TODO: handle exception

			LogResult_and_CaptureImage("FAIL", "Error : On verification", " Verification Failed", "YES");
			e.printStackTrace();	
		}
		System.out.println("count outside try"+count);
		return count;

	}

	public void click(By by, String text )throws DocumentException, Exception {
		try 
		{
			WebElement e1 = rdriver.findElement(by);
			if (e1.isDisplayed()) {
				Actions actions = new Actions(rdriver);
				actions.moveToElement(e1).click().build().perform();
				LogResult_and_CaptureImage("PASS", "Verify Click function", " Verified Successfully", "YES");
			}
		}

		catch (Exception e) 
		{
			// TODO: handle exception
			LogResult_and_CaptureImage("FAIL", "Error : On Click function", " Verification Failed", "YES");
			e.printStackTrace();
		}


	}

	public void validateTableFromWebPage (By by , String text , int orderType, int hyperlink){


		WebElement mytable = rdriver.findElement(by);
		//To locate rows of table. 
		List < WebElement > rows_table = mytable.findElements(By.tagName("tr"));
		//To calculate no of rows In table.
		int rows_count = rows_table.size();
		//Loop will execute till the last row of table.
		System.out.println("-------------------READ STARTED------------------------------- ");
		for (int row = 1; row < rows_count; row++) {
		//	ArrayList<String> rowData = new ArrayList<String>();

			//To locate columns(cells) of that specific row.
			List < WebElement > Columns_row = rows_table.get(row).findElements(By.tagName("td"));

			//To calculate no of columns (cells). In that specific row.
		//	int columns_count = Columns_row.size();
			//System.out.println("Number of cells In Row " + row + " are " + columns_count);
			//Loop will execute till the last cell of that specific row.
			String celtext = Columns_row.get(orderType).getText();
			if(celtext.contentEquals(text)){
				System.out.println("Clicking on View Details");
				//System.out.println("Value"+Columns_row.get(hyperlink).findElement(By.tagName("a")).getText());
				System.out.println("Value2"+Columns_row.get(hyperlink).getText());
				//System.out.println("Value2"+Columns_row.get(hyperlink).findElement(By.linkText("View Details")).getText());
				// Columns_row.get(hyperlink).findElement(By.linkText("View Details")).click();			
				Columns_row.get(hyperlink).click();
				break;
			}
		}

	}

	public HashMap<Integer, ArrayList<String>> readTableFromWebPage ( By by) throws DocumentException, Exception {

		HashMap<Integer, ArrayList<String>> map= new HashMap<Integer, ArrayList<String>>();

		//To locate table.
		WebElement mytable = rdriver.findElement(by);
		//To locate rows of table. 
		List < WebElement > rows_table = mytable.findElements(By.tagName("tr"));
		//To calculate no of rows In table.
		int rows_count = rows_table.size();
		//Loop will execute till the last row of table.
		System.out.println("-------------------READ STARTED------------------------------- ");
		for (int row = 0; row < rows_count; row++) {
			ArrayList<String> rowData = new ArrayList<String>();

			//To locate columns(cells) of that specific row.
			List < WebElement > Columns_row = rows_table.get(row).findElements(By.tagName("td"));

			//To calculate no of columns (cells). In that specific row.
			int columns_count = Columns_row.size();
			//System.out.println("Number of cells In Row " + row + " are " + columns_count);
			//Loop will execute till the last cell of that specific row.
			for (int column = 0; column < columns_count; column++) {
				// To retrieve text from that specific cell.
				String celtext = Columns_row.get(column).getText();
				rowData.add(celtext);
				//  System.out.println("Cell Value of row number " + row + " and column number " + column + " Is " + celtext);
			}
			map.put(row, rowData);
			//System.out.println("-------------------------------------------------- ");
		}


		for(Integer key: map.keySet()) {
			if(map.containsKey(key)){
				System.out.println(key +"    " + map.get(key));
			}
		}

		LogResult_and_CaptureImage("PASS", "Verify Text From Alert", "Alert Text Verified Successfully", "YES");
		System.out.println("-------------------READ ENDED------------------------------- ");
		return map;

	}
	//Added @10/17/2018 - By Prathisha V
	public void fnSwitchToPrecedingTab() throws Exception 
	{
		String handle_pointer = "" ;
		try
		{
			fnStartWatch();
			ArrayList<String> windowHandles = new ArrayList<String> (rdriver.getWindowHandles());
			String handle = rdriver.getWindowHandle();
			int windowHandles_size = windowHandles.size();

			for (int k=0; k<windowHandles_size; k++)
			{
				handle_pointer = windowHandles.get(k);
				if (handle_pointer.equals(handle))
				{
					//If the first window is selected and to loop around the window, below condition suffice
					if (k==0)
					{
						handle_pointer = windowHandles.get(windowHandles_size-1);
						break;
					}
					//Decrement handler pointer index and grab that handler data from array list
					handle_pointer = windowHandles.get(k-1);
					break;
				}
			}
			//Switch to previous (or preceding) tab
			rdriver.switchTo().window(handle_pointer);
		}
		catch (Exception e)
		{
			// TODO: handle exception
			LogResult_and_CaptureImage("FAIL", "Switch Tabs", "Unable To Switch To The Preceding Window", "YES");
			e.printStackTrace();
		}
	}

	//Added @10/17/2018 - By Prathisha V
	public void fnSwitchToTab(int tabIndex) throws Exception
	{
		try
		{
			fnStartWatch();
			//Wrote the list for debugging purpose only
			ArrayList<String> windowHandles = new ArrayList<String> (rdriver.getWindowHandles());
			//Switch to current
			rdriver.switchTo().window(windowHandles.get(tabIndex));
		}
		catch (Exception e)
		{
			// TODO: handle exception
			LogResult_and_CaptureImage("FAIL", "Switch Tabs", "Unable To Switch To " +tabIndex+ " tab", "YES");
			e.printStackTrace();			
		}
	}

	//Added @10/17/2018 - By Prathisha V
	public void fnSwitchToSucceedingTab() throws Exception 
	{
		String handle_pointer = "" ;
		try
		{
			fnStartWatch();
			ArrayList<String> windowHandles = new ArrayList<String> (rdriver.getWindowHandles());
			String handle = rdriver.getWindowHandle();
			int windowHandles_size = windowHandles.size();

			for (int k=0; k<windowHandles_size; k++)
			{
				handle_pointer = windowHandles.get(k);
				if (handle_pointer.equals(handle))
				{
					//If the last window is selected and to loop around the window, below condition suffice
					if (k == (windowHandles_size-1))
					{
						handle_pointer = windowHandles.get(0);
						break;
					}
					//Decrement handler pointer index and grab that handler data from array list
					handle_pointer = windowHandles.get(k+1);
					break;
				}
			}
			//Switch to previous (or preceding) tab
			rdriver.switchTo().window(handle_pointer);
		}
		catch (Exception e)
		{
			// TODO: handle exception
			LogResult_and_CaptureImage("FAIL", "Switch Tabs", "Unable To Switch To The Succeeding Window", "YES");
			e.printStackTrace();
		}
	}


	//Scroll to view of specified object - updated - @10/27/2018 - By Suneel Kaushik Subramanya
	public void fnScrollToView(By by) throws Exception 
	{
		//Wait till the element is visible
		//Fluentwait
		/*WebElement e1;
		e1 = fluentWait(by, 2);*/
		try{
			WebDriverWait wait = new WebDriverWait(rdriver, 30);
			wait.until(ExpectedConditions.visibilityOfElementLocated(by));
			WebElement e1 = rdriver.findElement(by);

			((JavascriptExecutor) rdriver).executeScript("arguments[0].scrollIntoView(true);", e1);
			Thread.sleep(3000);
		}
		catch(Exception e){

			LogResult_and_CaptureImage("FAIL", "Scroll", "Failed to scroll", "YES");
			e.printStackTrace();
		}


	}

	public void fnCloseCurrentTab() 
	{
		rdriver.close();
	}

	public void fnSwitchToDefaultTab() throws Exception 
	{
		try 
		{
			fnStartWatch();
			ArrayList<String> windowHandles = new ArrayList<String> (rdriver.getWindowHandles());
			rdriver.switchTo().window(windowHandles.get(0));
		}
		catch (Exception e)
		{
			// TODO: handle exception
			LogResult_and_CaptureImage("FAIL", "Switch Tabs", "Unable To Switch To The Default Window", "YES");
			e.printStackTrace();
			endReport();
		}
	}

	public void browserBack() throws IOException
	{
		fnStartWatch();
		rdriver.navigate().back();
	}


	public void refresh() 
	{
		rdriver.navigate().refresh();
	}

	public String getCurrentUrl() throws IOException 
	{
		return rdriver.getCurrentUrl();
	}

	//Get attribute - added @ 11/2/2018- by Suneel Kaushik Subramanya
	public String getAttributeValue(By by, String AttributeName) throws IOException 
	{
		return rdriver.findElement(by).getAttribute(AttributeName);
	}

	public void waitForPageLoad() 
	{
		//FluentWait<WebDriver> wait = getFluentWait();
		WebDriverWait wait = new WebDriverWait(rdriver, 30); 
		try 
		{
			Thread.sleep(1000);
			wait.until(new Function<WebDriver, Boolean>() 
			{

				public Boolean apply(WebDriver webDriver) 
				{
					return String.valueOf(((JavascriptExecutor) webDriver).executeScript("return document.readyState"))
							.equals("complete");
				}
			}
					);
		} 
		catch (Exception e) 
		{
		}
	}

	//FluentWait with respect to element 
	public WebElement fluentWait(final By by, int pollingValue)
	{
		List<Class<? extends Throwable>> ignoreExceptionClasses = new ArrayList<Class<? extends Throwable>>();
		ignoreExceptionClasses.add(NoSuchElementException.class);
		ignoreExceptionClasses.add(ElementNotVisibleException.class);
		ignoreExceptionClasses.add(InvalidElementStateException.class);
		ignoreExceptionClasses.add(StaleElementReferenceException.class);
		try
		{
			//Fluent wait - wait till element is visible - poll for 30 seconds, @ pollingValue second interval
			@SuppressWarnings("deprecation")
			Wait<WebDriver> wait = new FluentWait<WebDriver>(rdriver)
					.withTimeout(30, TimeUnit.SECONDS)
					.pollingEvery(pollingValue, TimeUnit.SECONDS)
					.ignoreAll(ignoreExceptionClasses);

			WebElement e1 = wait.until(new Function<WebDriver,WebElement>()
			{
				public WebElement apply(WebDriver rdriver)
				{
					return rdriver.findElement(by);
				}
			});
			return e1;
		}
		catch (Exception e)
		{
		}
		return null;
	}

	public FluentWait<WebDriver> getFluentWait() 
	{
		List<Class<? extends Throwable>> ignoreExceptionClasses = new ArrayList<Class<? extends Throwable>>();
		ignoreExceptionClasses.add(NoSuchElementException.class);
		ignoreExceptionClasses.add(ElementNotVisibleException.class);
		ignoreExceptionClasses.add(InvalidElementStateException.class);
		ignoreExceptionClasses.add(StaleElementReferenceException.class);
		try 
		{
			@SuppressWarnings("deprecation")
			FluentWait<WebDriver> wait = new FluentWait<WebDriver>(rdriver).withTimeout(60, TimeUnit.SECONDS)
					.pollingEvery(1, TimeUnit.SECONDS).ignoreAll(ignoreExceptionClasses);
			return wait;
		} 
		catch (Exception e) 
		{
		}
		return null;
	}

	public String capturePageTitle() 
	{
		return rdriver.getTitle();
	}

	public int fnTotalNumberOfElements(By by,int expectedCount,String elementName) throws Exception 
	{
		List<WebElement> allElements = rdriver.findElements(by);
		int totalCount = allElements.size();
		if (totalCount==expectedCount) 
		{
			LogResult_and_CaptureImage("PASS", "Validate Elements Count", elementName+" Actual And Expected Counts Are Identical", "YES");
		} 
		else 
		{
			LogResult_and_CaptureImage("FAIL", "Validate Elements Count", elementName+" Actual And Expected Count Does not Match","YES");
		}
		return totalCount;
	}

	public String fnGetAttributeValue(By by, String AttributeName) throws IOException 
	{
		return rdriver.findElement(by).getAttribute(AttributeName);
	}

	public void fnStartWatch() throws IOException 
	{
		timer.reset();
		timer.start();
	}

	public String fnStopWatch() throws IOException 
	{
		timer.stop();
		return Integer.toString((int) (timer.getTime()/1000));
	}

	//Modal window closing function  - added @ 10/22/2018 - by Suneel Kaushik Subramanya
	public void closeModalWindow(By by, String elementname) throws Exception 
	{
		try 
		{
			//Wait statement
			WebDriverWait wait = new WebDriverWait(rdriver, 30);
			wait.until(ExpectedConditions.visibilityOfElementLocated(by));

			//Create a webelement 
			WebElement e1 = rdriver.findElement(by);

			if (e1.isDisplayed()) 
			{
				//Perform click action
				e1.click();
				//Log
				LogResult_and_CaptureImage("PASS", "Close Modal Window", elementname + " modal window is clsoed", "YES");	
			}
			else
			{
				//Log
				LogResult_and_CaptureImage("FAIL", "Close Modal Window", elementname + " modal window is not Visible", "NO");
			}
		} 
		catch (Exception e) 
		{
			// TODO: handle exception
			LogResult_and_CaptureImage("FAIL", "ERROR", "Failed as Element " + elementname + "Was Not Visible", "YES");
			e.printStackTrace();
		}
	}

	public String getText(By by)
	{
		//Fetch the requested property
		String textProperty = rdriver.findElement(by).getText();

		//Return the text data of a web element
		return textProperty;
	}


	//Compare String - Updated @ 11/2/2018 - by Prathisha
	public boolean cmpString(String validstring1, String validstring2) throws Exception
	{
		try
		{
			if (validstring1.equalsIgnoreCase(validstring2))
			{
				//Log
				LogResult_and_CaptureImage("PASS", "Text Comparision", "Source String : " +"'" +validstring1+ "' "+ "and Destination String : " +"'" +validstring2+ "'" +" Are Identical", "NO");
				return true;
			}
			else
			{
				//Log
				LogResult_and_CaptureImage("FAIL", "Text Comparision", "Source String : "+"'" +validstring1+ "' "+ "Does Not Match With Destination String : " +"'" +validstring2+ "'", "NO");
				return false;
			}
		}
		catch (Exception e)
		{
			// TODO: handle exception
			LogResult_and_CaptureImage("FAIL", "Text Comparision", "Error While Comparing Texts", "NO");
			e.printStackTrace();
		}
		return false;
	}

	//Compare two string and assert without ignorecase - added @ 10/29/2018 - by Preethi
	public void fnCompareText(String src, String dest) throws Exception
	{
		try
		{
			System.out.println(">>>>>>>>>>>"+dest+">>>>>>>>>>>>>>>>");		
			if (src.equals(dest))
			{
				LogResult_and_CaptureImage("PASS", "Text Comparision", "Source String : " +"'" +src+ "' "+ "and Destination String : " +"'" +dest+ "'" +" Are Identical", "NO");
			}
		}
		catch (Exception e) 
		{
			// TODO: handle exception
			LogResult_and_CaptureImage("FAIL", "Text Comparision", "Source String : "+"'" +src+ "' "+ "Does Not Match With Destination String : " +"'" +dest+ "'", "NO");
			e.printStackTrace();
		}
	}

	//Image size validiaton - added - 10/23/2018 - by Suneel Kaushik Subramanya
	public void imageSizeValidation(By by, int imageWidth, int imageHeight) throws Exception
	{
		//Gather image data
		WebElement Image = rdriver.findElement(by);

		//Get the image size
		int actual_image_width = Image.getSize().getWidth();
		//Retrieve height of element.
		int actual_image_height = Image.getSize().getHeight();

		try
		{
			if ((actual_image_width ==(imageWidth))&&(actual_image_height ==(imageHeight)))
			{
				LogResult_and_CaptureImage("PASS", "Validate Image Size", "Image Size Validated Successfully", "YES");
			}
			else
			{
				LogResult_and_CaptureImage("FAIL", "Validate Image Size", "Image Size Validation Unsuccessful", "NO");
			}
		}
		catch (Exception e)
		{
			// TODO: handle exception
			LogResult_and_CaptureImage("FAIL", "Validate Image Size", "Error While Validating Image Size", "NO");
			e.printStackTrace();
		}
	}

	//Page verification with boolean return - added @ 10/24/2018 - by Suneel Kaushik Subramanya
	//Updated - 11/2/2018 - By Suneel Kaushik Subramanya
	public boolean VerifyPageDisplayed(By by) throws Exception
	{
		try
		{
			waitForPageLoad();
			//Fluentwait
			/*WebElement e1;
			e1 = fluentWait(by, 2);*/
			WebDriverWait wait = new WebDriverWait(rdriver, 30);
			wait.until(ExpectedConditions.visibilityOfElementLocated(by));
			WebElement e1 = rdriver.findElement(by);

			if (e1.isDisplayed()) 
			{
				LogResult_and_CaptureImage("PASS", "Verify Page Is Displayed", "Page Is Displayed", "YES", fnStopWatch());
				return true;
			} 
			else 
			{
				LogResult_and_CaptureImage("FAIL", "Verify Page Is Displayed", "Page Is Not Displayed", "YES");
				return false;
			}
		}
		catch (Exception e) 
		{
			// TODO: handle exception
			LogResult_and_CaptureImage("FAIL", "Verify Page Is Displayed", "Error while verifying page", "YES");
			e.printStackTrace();
		}
		return false;
	}

	//Scroll to view of specified object - added @ 10/29/2018 - by Preethi
	public void fnContentValidateJS(String data , By by) throws Exception 
	{
		try
		{
			//Fluent wait
			/*WebElement e1 = fluentWait(by, 2);*/
			WebDriverWait wait = new WebDriverWait(rdriver, 30);
			wait.until(ExpectedConditions.visibilityOfElementLocated(by));
			WebElement e1 = rdriver.findElement(by);
			if (e1.isDisplayed()) 
			{
				JavascriptExecutor js = (JavascriptExecutor)rdriver;
				String text = js.executeScript("return document.documentElement.innerText;").toString();
				assertTrue(text.contains(data));
				LogResult_and_CaptureImage("PASS", "Content Validation", "Verified the text" + data + " Successfully.", "NO");
			}
		}
		catch (Exception e)
		{
			LogResult_and_CaptureImage("FAIL", "Content Validation", "Contents Validation Unsuccessful", "NO");
			e.printStackTrace();
		}
	}

	//Get Current Date - added @ 10/29/2018 - by Preethi
	public String getCurrentDate()
	{
		String str = "";
		try
		{
			//Updated @ 11/1/2018 - changed from (MM/dd/YY) to (M/d/yy))
			SimpleDateFormat sdf = new SimpleDateFormat("M/d/yy");
			str = sdf.format(System.currentTimeMillis());
			//System.out.println("formatted date in mm/dd/yy : " + str);
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return str;
	}

	//Get List of values from list drop down - added @ 10/29/2018 - by Preethi
	public String fnGetListOfValuesFromDropdown(By by, String elementname) throws Exception 
	{
		String str = "";
		try 
		{
			//WebElement e1 = fluentWait(by, 2);
			WebDriverWait wait = new WebDriverWait(rdriver, 30);
			wait.until(ExpectedConditions.visibilityOfElementLocated(by));
			WebElement e1 = rdriver.findElement(by);
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
				LogResult_and_CaptureImage("PASS", "Retrieve List Of Values From Drop Down", elementname + "dropdown values are retrieved", "NO");
			}
		} 
		catch (Exception e) 
		{
			// TODO: handle exception
			LogResult_and_CaptureImage("FAIL", "Retrieve List Of Values From Drop Down", "Failed to retrieve dorpdown values for " + elementname, "NO");
			e.printStackTrace();
		}
		return str;
	}

	public void fnRemoveDuplicates(By by, String elementname) throws Exception 
	{

		try 
		{
			//WebElement e1 = fluentWait(by, 2);
			WebDriverWait wait = new WebDriverWait(rdriver, 30);
			wait.until(ExpectedConditions.visibilityOfElementLocated(by));
			WebElement e1 = rdriver.findElement(by);
			if (e1.isDisplayed()) 
			{
				String actualString = e1.getText().trim();
				char[] AS = actualString.toCharArray();// Converting it to Character from a string
				List<Character> listForm = new ArrayList();
				List<Character> LinkedlistForm = new LinkedList();
				Set<Character> Duplicates = new HashSet(); // HashSet Gives the Random ordered output 
				Set<Character> DuplicatesTreeset = new TreeSet<Character>();
				Set<Character> DuplicatesLinkedHashset = new LinkedHashSet<Character>();// TreeSet Gives the output as Alphabet order by removing Duplicates 
				for(char c : AS)
				{
					Duplicates.add(c);
					DuplicatesTreeset.add(c);
					DuplicatesLinkedHashset.add(c);
					listForm.add(c);
					LinkedlistForm.add(c);
				}

				System.out.println("HashSet" +Duplicates);
				System.out.println("TreeSet" +DuplicatesTreeset);
				System.out.println("LinkedhashSet" +DuplicatesLinkedHashset);
				System.out.println("ArrayList" +listForm);
				System.out.println("LinkedList" +LinkedlistForm);
				LogResult_and_CaptureImage("PASS", "Retrieve List Of Values From Drop Down", elementname + "dropdown values are retrieved", "NO");
			}
		} 
		catch (Exception e) 
		{
			// TODO: handle exception
			LogResult_and_CaptureImage("FAIL", "Retrieve List Of Values From Drop Down", "Failed to retrieve dorpdown values for " + elementname, "NO");
			e.printStackTrace();
		}
	}

	//Validate Substring in a String @ added 11/1/2018 - by Prathisha
	public void StringShouldContain(String Parent, String Child) throws Exception 
	{
		try
		{
			//Validate Substring in a String
			if (Parent.contains(Child))
			{
				LogResult_and_CaptureImage("PASS", "Validate A Substring In A String", "String "+Parent+" Contains " +Child+ " Substring", "NO");
			}
			else
			{
				LogResult_and_CaptureImage("FAIL", "Validate A Substring In A String", "String "+Parent+ " doesn't contain " +Child+" Substring", "NO");
			}
		}
		catch (Exception e)
		{
			LogResult_and_CaptureImage("FAIL", "Validate A Substring In A String", "String "+Parent+ " doesn't contain " +Child+" Substring", "NO");
			e.printStackTrace();
		}
	} 

	//Name Generator - added @11/2/2018 - By Prathisha
	public String randomIdentifier() 
	{
		final String lexicon = "ABCDEFGHIJKLMNOPQRSTUVWXYZ12330674890";
		final java.util.Random rand = new java.util.Random();
		// consider using a Map<String,Boolean> to say whether the identifier is being used or not 
		final Set<String> identifiers = new HashSet<String>();
		StringBuilder builder = new StringBuilder();
		while(builder.toString().length() == 0) 
		{
			int length = rand.nextInt(5)+5;
			for(int i = 0; i < length; i++) 
			{
				builder.append(lexicon.charAt(rand.nextInt(lexicon.length())));
			}
			if(identifiers.contains(builder.toString())) 
			{
				builder = new StringBuilder();
			}
		}
		return builder.toString();
	}

	//Warning message validation through alt property - added @ 11/2/2018 - by Suneel Kaushik Subramanya
	public void imageValidationThroughAltAttribute(By by, String elementname, String verifyText) throws Exception
	{
		try
		{
			String actual_txt = getAttributeValue(by, "alt");
			if(actual_txt.equals(verifyText))
			{
				LogResult_and_CaptureImage("PASS", "Image Validation Through ALT Property",  "Warning Message Validated Successfully", "NO");
			}
			else
			{
				LogResult_and_CaptureImage("FAIL", "Image Validation Through ALT Property",  "Warning Message Validated Unsuccessful", "NO");
			}
		}
		catch (Exception e)
		{
			// TODO: handle exception
			LogResult_and_CaptureImage("FAIL", "Image Validation Through ALT Property", "Error while retrieving " +elementname, "YES");
		}
	}

	//page validation using page title
	public void fnVerifyPageDisplayedUsingPageTitle(String title,String pageName) throws Exception 
	{
		try 
		{
			waitForPageLoad();
			String pageTitle = rdriver.getTitle();
			if (pageTitle.toUpperCase().contains(title.toUpperCase())) 
			{
				LogResult_and_CaptureImage("PASS", "Verify Page is Displayed Using Page Title", pageName + "page is Displayed", "YES", fnStopWatch());
			} 
			else 
			{
				LogResult_and_CaptureImage("FAIL", "Verify Page is Displayed Using Page Title", pageName + "page is not Displayed", "YES");
			}

		} 
		catch (Exception e) 
		{
			// TODO: handle exception           
			LogResult_and_CaptureImage("FAIL", "Verify Page is Displayed Using Page Title", pageName + "page is not Displayed", "YES");
			e.printStackTrace();
		}
	}

	public void SelectByOption(By by,String data) throws Exception 
	{
		try
		{
			WebDriverWait wait = new WebDriverWait(rdriver, 30);
			WebElement e1 = rdriver.findElement(by);
			wait.until(ExpectedConditions.visibilityOfElementLocated(by));
			if(e1.isDisplayed())
			{
				e1.click();
				e1.sendKeys(data);
				Thread.sleep(2000);
				e1.sendKeys(Keys.ENTER);
				LogResult_and_CaptureImage("PASS", "Select", "from dropdown " +data + " Entered Successfully","YES");
			}
		}
		catch (Exception e)
		{

			e.printStackTrace();
		}
	}

	public void getExtractAttributeValue(By by, String value, String Attributevalue) throws Exception 
	{
		try 
		{
			WebElement e1=rdriver.findElement(by);
			if (e1.isDisplayed()) 
			{
				String actualString = getAttributeValue(by,Attributevalue);

				//Assert.assertEquals(actualString,value);
				if(actualString.equalsIgnoreCase(value)){
					LogResult_and_CaptureImage("PASS", "Extract Attribute Value", value+" Is Presents In Element", "NO");
				}
				else{
					LogResult_and_CaptureImage("Fail", "Extract Attribute Value", value+" Is not Presents", "NO");

				}
			}
		} 
		catch (Exception e) 
		{
			// TODO: handle exception
			LogResult_and_CaptureImage("FAIL", "Extract Atribute Value", value+" is not present in element", "YES");			
			e.printStackTrace();
		}
	}

	//Launch url
	//Updated @2/1/2019 - By Suneel Kaushik SubramanyaS
	public void launchUrl(String url) throws Exception
	{
		try
		{
			//Start Timer
			fnStartWatch();
			//Fetch url
			rdriver.get(url);
			//Log
			LogResult_and_CaptureImage("PASS", "Launch URL", "Launched URL "+url+ " Successfully" , "YES", fnStopWatch());
		}
		catch(Exception e)
		{
			//Log
			LogResult_and_CaptureImage("PASS", "Launch URL", "Launched URL "+url+ " Successfully" , "YES");
			e.printStackTrace();
			//Stop Timer
			fnStopWatch();
		}
	}

	//content validation
	public void fnContentValidation1(String data) throws Exception {
		try {

			//fnSwitchToNewwindow();
			WebElement e1=rdriver.findElement(By.xpath(".//*[@class='container mainContainer']"));
			if (e1.isDisplayed()) {
				String actualString = e1.getText().trim();
				System.out.println(">>>>>>>"+actualString+">>>>>>>>>>");
				assertTrue(actualString.equalsIgnoreCase(data.trim()));
				LogResult_and_CaptureImage("Pass", "Content Validation", "'"+data+ "'"+ " Content validated successfully", "YES");

			}
			//fnCloseCurrentTab();
			// fnSwitchToDefaultTab();



		} catch (Exception e) {
			// TODO: handle exception
			LogResult_and_CaptureImage("Fail", "Content Validation", "'"+data+ "'"+ " Content validation UnSuccessfull", "YES");
			e.printStackTrace();

		}
	}

	public void fnSwitchToNewwindow() throws Exception 
	{
	//	ArrayList<String> windowHandles = new ArrayList<String> (rdriver.getWindowHandles());
		Set<String> handles = rdriver.getWindowHandles();
		String firstWinHandle = rdriver.getWindowHandle();
		try 
		{
			handles.remove(firstWinHandle);
			String winHandle=(String) handles.iterator().next();
			if (winHandle!=firstWinHandle)
			{
				//To retrieve the handle of second window, extracting the handle which does not match to first window handle
				String secondWinHandle=winHandle; //Storing handle of second window handle
				//Switch control to new window
				rdriver.switchTo().window(secondWinHandle);
			}
		}
		catch (Exception e) 
		{

			e.printStackTrace();
		}
	}

	public String getText(By by, String elementname) throws Exception
	{String textProperty;
	try{
		//Fetch the requested property
		textProperty = rdriver.findElement(by).getText();

		//Return the text data of a web element
		return textProperty;
	}
	catch(Exception e){
		LogResult_and_CaptureImage("Fail", "Get text", elementname+"failed to get text", "YES");

		e.printStackTrace();
		return "Fail";
	}
	} 

	public void logResult(boolean result, String statement) throws Exception
	{try{
		if(result == true)
		{
			LogResult_and_CaptureImage("Pass", "Custom Log", statement, "YES");

		}
		else
		{
			LogResult_and_CaptureImage("Fail", "Custom Log", statement, "YES");
		}
	}
	catch(Exception e){

		LogResult_and_CaptureImage("Fail", "Custom Log", statement, "YES");

		e.printStackTrace();
	}
	}
	
	public String[] strListElements(By by){
        List<WebElement> list = rdriver.findElements(by);
        System.out.println("list:"+list);
        ListIterator<WebElement> lstItr = list.listIterator();

        String []strList =new String[list.size()];
        int i=0;
        while(lstItr.hasNext() && i<list.size()){
               for(WebElement a: list)
               {
                     strList[i]=a.getText();
                     System.out.println("strList "+strList[i]+" i"+i);
                     i++;
               }            
        }
        return strList;
  }      

	

	//Added @12/7/2018
	public void deleteAllCookie()
	{
		rdriver.manage().deleteAllCookies();
	}

	public void ExtractAttributeFromObject(By by,String attributeName,String elementname, String data) throws Exception 
	{
		try 
		{
			/*test.log(Status.INFO, "Verify is Element Visible_  " + data);*/

			WebElement e1 = rdriver.findElement(by);
			String message = e1.getAttribute(attributeName);
			if ((message.trim()).equalsIgnoreCase(data)) 
			{
				LogResult_and_CaptureImage("PASS", "Extract Attribute", "Extracted Attribute " +elementname+ " Successfully","YES");
				/*test.log(Status.PASS, elementname + " is Visible");*/
			} 
			else 
			{
				LogResult_and_CaptureImage("FAIL", "Extract Attribute", "Failed to Extract attribute from " +elementname, "YES");
				/*test.log(Status.FAIL, elementname + " is not Visible ");*/
			}
		} 
		catch (Exception e) 
		{
			// TODO: handle exception
			LogResult_and_CaptureImage("FAIL", "Extract Attribute", "Failed to Locate " +elementname, "YES");
			/*test.log(Status.FAIL, "Failed as" + elementname + "Element could not be located" );
			test.fail("Screenshot below: " + test.addScreenCaptureFromPath(takeScreenShot(elementname)));*/
			e.printStackTrace();
		}
	}
	public void Vuse_CF_inputTextSendkeys(By by, String elementname, String data) throws Exception 
	{
		try 
		{
			fnStartWatch();
			//WebElement e1 = rdriver.findElement(by);
			//rdriver.findElement(by).clear();
			Thread.sleep(2000);
			//Action Class
			rdriver.findElement(by).sendKeys(data);

			//Java script
			/*JavascriptExecutor executor = (JavascriptExecutor)rdriver;
              executor.executeScript("arguments[0].value='enter the value here';", data);*/
		} 
		catch (Exception e) 
		{
			// TODO: handle exception
			LogResult_and_CaptureImage("FAIL", "Input", "Failed To Locate " +elementname+ " Text field.", "YES");
			e.printStackTrace();
		}
	}


	public void ExtractTextFromObject(By by,String elementname, String data) throws Exception 
	{
		try 
		{
			/*test.log(Status.INFO, "Verify is Element Visible_  " + data);*/

			WebElement e1 = rdriver.findElement(by);
			String message = e1.getText();
			if ((message.replace("\n", " ")).equalsIgnoreCase(data)) 
			{
				LogResult_and_CaptureImage("PASS", "Extract Text", "Extracted Attribute " +elementname+ " Successfully","YES");
				/*test.log(Status.PASS, elementname + " is Visible");*/
			} 
			else 
			{
				LogResult_and_CaptureImage("FAIL", "Extract Text", "Failed to Locate " +elementname, "YES");
			}
		} 
		catch (Exception e) 
		{
			// TODO: handle exception
			LogResult_and_CaptureImage("FAIL", "Extract Text", "Failed to Locate " +elementname, "YES");
			/*test.log(Status.FAIL, "Failed as" + elementname + "Element could not be located" );
			test.fail("Screenshot below: " + test.addScreenCaptureFromPath(takeScreenShot(elementname)));*/
			e.printStackTrace();
		}
	}

	public String[] fnConvertStringToStringArray(String text)
	{
		String[] str = text.split(",");
		return str;
	}
	public void enterTab(){
		Actions action  = new Actions(rdriver);
		action.sendKeys(Keys.TAB);
	}
	public void fnPageDownusingActionClass(){
		Actions action  = new Actions(rdriver);
		action.sendKeys(Keys.DOWN);


	}
	public void fnPageEndusingActionClass(){
		Actions action  = new Actions(rdriver);
		action.sendKeys(Keys.END);
	}
	public void fnPageUpusingActionClass(){
		Actions action  = new Actions(rdriver);
		action.sendKeys(Keys.UP);
	}
	//To Enter 'TAB' key 
	public void enterTabUsingSelenium(By by){
		WebElement e1=rdriver.findElement(by);
		e1.sendKeys(Keys.TAB);		
	}
	
	//To Enter 'ENTER' key 
		public void enterEnterUsingSelenium(By by){
			WebElement e1=rdriver.findElement(by);
			e1.sendKeys(Keys.ENTER);		
		}

	//Excise tax calculation --Added @ 11/28/2018 - By Prathisha

	public void ExciseTaxCalculationUpdate(String SalesTax, String ExciseTax,String ExciseExpected,
			String SubTotalExpected, String OrderTotalExpected,String SalesTaxExpected,String ShippingExpected,
			String FreeShippingExpected,String FlavorType,String OrderDiscount,By PriceTablePath,By ...by) throws Exception
	{

		By PriceTable =PriceTablePath;
		try
		{
			WebDriverWait wait = new WebDriverWait(rdriver, 30);
			wait.until(ExpectedConditions.visibilityOfElementLocated(PriceTable));
			if((ExciseTax.equalsIgnoreCase("Yes"))&&(SalesTax.equalsIgnoreCase("Yes")))
			{

				if(rdriver.findElement(PriceTable).isDisplayed())
				{

					//Verify Excise tax value
					fnContentValidation(ExciseExpected,by[0],"ExciseTax Value" +ExciseExpected);

					//Verify Subtotal value
					fnContentValidation(SubTotalExpected,by[2],"SubTotal Value" +SubTotalExpected);
					//Sales tax Value
					fnContentValidation(SalesTaxExpected,by[1],"SalesTax Value" +SalesTaxExpected);
					//Ordertotal value
					fnContentValidation(OrderTotalExpected,by[3],"OrderTotal Value" +OrderTotalExpected);

					//Shipping and Free Shipping value
					fnContentValidation(ShippingExpected,by[4],"Shipping Value" +ShippingExpected);
					if(FlavorType.equalsIgnoreCase("AutoShip"))
					{
						fnContentValidation(FreeShippingExpected,by[5],"FreeShipping Value" +FreeShippingExpected);
						fnContentValidation(FreeShippingExpected,by[6],"AutoShip Discount Value" +OrderDiscount);
					}
				}
			}

			else if ((ExciseTax.equalsIgnoreCase("No"))&&(SalesTax.equalsIgnoreCase("Yes"))){
				if(rdriver.findElement(PriceTable).isDisplayed())
				{
					//Verify Subtotal value
					fnContentValidation(SubTotalExpected,by[2],"subtotal Value" +SubTotalExpected);
					//Sales tax Value
					fnContentValidation(SalesTaxExpected,by[1],"SalesTax Value" +SalesTaxExpected);
					//Ordertotal value
					fnContentValidation(OrderTotalExpected,by[3],"OrderTotal Value" +OrderTotalExpected);

					//Shipping and Free Shipping value
					fnContentValidation(ShippingExpected,by[4],"Shipping Value" +ShippingExpected);
					if(FlavorType.equalsIgnoreCase("AutoShip"))
					{
						fnContentValidation(FreeShippingExpected,by[5],"FreeShipping Value" +FreeShippingExpected);
						fnContentValidation(FreeShippingExpected,by[6],"AutoShip Discount Value" +OrderDiscount);
					}
				}
			}
			else if ((ExciseTax.equalsIgnoreCase("Yes"))&&(SalesTax.equalsIgnoreCase("No"))){
				if(rdriver.findElement(PriceTable).isDisplayed()){

					//Verify Excise tax value
					fnContentValidation(ExciseExpected,by[0],"ExciseTax Value" +ExciseExpected);

					//Verify Subtotal value
					fnContentValidation(SubTotalExpected,by[2],"SubTotal Value" +SubTotalExpected);

					//Ordertotal value
					fnContentValidation(OrderTotalExpected,by[3],"OrderTotal Value" +OrderTotalExpected);

					//Shipping and Free Shipping value
					fnContentValidation(ShippingExpected,by[4],"Shipping Value" +ShippingExpected);
					if(FlavorType.equalsIgnoreCase("AutoShip"))
					{
						fnContentValidation(FreeShippingExpected,by[5],"FreeShipping Value" +FreeShippingExpected);
						fnContentValidation(FreeShippingExpected,by[6],"AutoShip Discount Value" +OrderDiscount);
					}
				}
			}	

		}
		catch (Exception e)
		{
			LogResult_and_CaptureImage("FAIL", "Excise Tax Calculation", "All Total Values Are not Matched", "YES");
			e.printStackTrace();	
		}
	}

	public void fnContentValidation(String data,By by,String value) throws Exception 
	{
		try
		{
			WebElement e1=rdriver.findElement(by);
			if (e1.isDisplayed()) {
				String actualString = e1.getText().trim();
				data=data.trim();
				//String ActualText = e1.getText().trim();
				/*boolean ActualString = actualString.equalsIgnoreCase(actualString);*/
				//String ExpectedData = data.equalsIgnoreCase(data);
				System.out.println(">>>>>>>"+actualString+">>>>>>");

				//			String textpath="C:\\IAS\\IAS_Selenium\\Generated Tests\\Automation_Scripts\\Test Data\\txt_data.txt";
				//			FileUtils.writeStringToFile(new File(textpath), actualString);
				//System.out.println(actualString);
				//assertTrue(actualString.equalsIgnoreCase(data));

				//	Assert.assertEquals(actualString,data);
				if(actualString.equalsIgnoreCase(data)){
					LogResult_and_CaptureImage("Pass", value , "'"+value+ "'"+ " displayed successfully", "YES");
				}
				else{
					LogResult_and_CaptureImage("Fail", value , "'"+value+ "'"+ "  validation failed", "YES");

				}
				//LogResult_and_CaptureImage("Pass", value , "'"+value+ "'"+ " Content validated successfully", "YES");
			}
			/*if (e1.isDisplayed()) 
			{
				String actualString = e1.getText().trim();
				System.out.println(">>>>>>>>>>>"+actualString+">>>>>>>>>>>>>>>>");				
				Assert.assertEquals(actualString,data.trim());
				LogResult_and_CaptureImage("Pass", "Content Validation", "'"+data+ "'"+ " Content validated successfully", "YES");
			}*/
		}

		catch (Exception e) 
		{
			// TODO: handle exception
			LogResult_and_CaptureImage("FAIL", "Content Validation", "'"+value+ "'"+ " Is Not Present In Element", "YES");
			e.printStackTrace();
		}
	}

	//Soft restriction
	public void SoftRestrictionValidation(String State,String RestrictionType, By ...by) throws Exception
	{
		try
		{
			WebDriverWait wait = new WebDriverWait(rdriver, 60);
			JavascriptExecutor executor = (JavascriptExecutor)rdriver;
			if(RestrictionType.equalsIgnoreCase("Soft"))
			{
				WebElement e1 = rdriver.findElement(by[0]);
				WebElement e2 = rdriver.findElement(by[1]);
				//Terms Of Sale
				wait.until(ExpectedConditions.visibilityOfElementLocated(by[0]));
				executor.executeScript("arguments[0].click();", e1);
				//signed for by an adult
				wait.until(ExpectedConditions.visibilityOfElementLocated(by[1]));
				executor.executeScript("arguments[0].click();", e2);
				LogResult_and_CaptureImage("PASS", "Select Check Boxes", "Terms Of Use And Signed By Adults Check Box Have Been Selected", "YES");

				//For CA users
				if(State.equalsIgnoreCase("CA"))
				{
					WebElement e3 = rdriver.findElement(by[2]);
					wait.until(ExpectedConditions.visibilityOfElementLocated(by[2]));
					executor.executeScript("arguments[0].click();", e3);
					LogResult_and_CaptureImage("PASS","Select Check Box", "Phone Call Warning Check Box Is Selected", "YES");
				}
				else if(State.equalsIgnoreCase("FL"))
				{
					WebElement e4 = rdriver.findElement(by[3]);
					wait.until(ExpectedConditions.visibilityOfElementLocated(by[3]));
					executor.executeScript("arguments[0].click();", e4);
					LogResult_and_CaptureImage("PASS", "Select Check Box", "Tobacco Product Warning Check Box Is Selected", "YES");
				}

				else if(State.equalsIgnoreCase("TX"))
				{
					WebElement e5 = rdriver.findElement(by[4]);
					wait.until(ExpectedConditions.visibilityOfElementLocated(by[4]));
					executor.executeScript("arguments[0].click();", e5);
					LogResult_and_CaptureImage("PASS", "Select Check Box", "E Warning Check Box Is Selected", "YES");
				}
				else if(State.equalsIgnoreCase("MN"))
				{
					WebElement e7 = rdriver.findElement(by[5]);
					wait.until(ExpectedConditions.visibilityOfElementLocated(by[5]));
					executor.executeScript("arguments[0].click();", e7);
					LogResult_and_CaptureImage("PASS", "Select Check Box", "I Understand Warning Check Box Is Selected", "YES");
				}
			}	
		}
		catch(Exception e)
		{
			System.err.println("Usage: ... [Terms] [Adult] ...[Optional : If Sates(CA,FL,TX)[Phone Call Warning text]]");
			LogResult_and_CaptureImage("Fail", "Soft Restriction Validation", "Failed To Perform Requested Actions In Checkout Page", "YES");
		}
	}

	//Hard Level Restriction
	public void HardRestrictionValidation(String RestrictionType,String data1, String data2, By ...by) throws Exception
	{
		try
		{
			@SuppressWarnings("unused")
			WebDriverWait wait = new WebDriverWait(rdriver, 60);
			@SuppressWarnings("unused")
			JavascriptExecutor executor = (JavascriptExecutor)rdriver;
			if(RestrictionType.equalsIgnoreCase("Hard"))
			{

				//Some items are not available error message
				fnContentValidation(data1, by[0]);

				//Not available for shipment
				fnContentValidation(data2, by[1]);


			}
		}
		catch(Exception e)
		{
			System.err.println("Usage: ... [Error textString]..[Error textString]..]");
			LogResult_and_CaptureImage("Fail", "Hard Restriction Validation", "Failed To Perform Requested Actions", "YES");
		}

	}
	//Hard Level Restriction
	public void HardRestrictionValidationProdPage(String RestrictionType,String data1, By ...by) throws Exception
	{
		try
		{
			@SuppressWarnings("unused")
			WebDriverWait wait = new WebDriverWait(rdriver, 60);
			@SuppressWarnings("unused")
			JavascriptExecutor executor = (JavascriptExecutor)rdriver;
			if(RestrictionType.equalsIgnoreCase("Hard"))
			{

				//Some items are not available error message
				fnContentValidation(data1, by[0]);

			}
		}
		catch(Exception e)
		{
			System.err.println("Usage: ... [Error textString]..[Error textString]..]");
			LogResult_and_CaptureImage("Fail", "Hard Restriction Validation", "Failed To Perform Requested Actions", "YES");
		}

	}

	// Password encryption
	public void inputPasswordEncrypted(By by, String elementname, String data) throws Exception 
	{
		try 
		{
			String encryptedPasswordByBytes = Base64.getEncoder().encodeToString(data.getBytes());
			WebDriverWait wait = new WebDriverWait(rdriver, 30);
			wait.until(ExpectedConditions.visibilityOfElementLocated(by));
			WebElement e1 = rdriver.findElement(by);
			if (e1.isDisplayed()) 
			{
				Actions actions = new Actions(rdriver);
				actions.moveToElement(e1).click().build().perform();
				e1.clear();
				e1.sendKeys(data);
				LogResult_and_CaptureImage("PASS", "Input Password", "'"+encryptedPasswordByBytes+"'"+" Entered In " + elementname + " Text Field Successfully.", "NO");
			}
		} 
		catch (Exception e) 
		{
			// TODO: handle exception
			LogResult_and_CaptureImage("FAIL", "Input Password", "Failed To Locate " +elementname+ " Text field.", "YES");
			e.printStackTrace();
		}
	}


	public void fnVerifyTextFromAlert(String data) throws Exception 
	{
		try 
		{
			WebDriverWait wait = new WebDriverWait(rdriver, 30);
			wait.until(ExpectedConditions.alertIsPresent());
			Alert alt = rdriver.switchTo().alert();
			Thread.sleep(1000);
		System.out.println(alt.getText());
			if(data.equalsIgnoreCase(alt.getText()))
			{
				//test.pass("Screenshot below: " + test.addScreenCaptureFromPath(takeScreenShot("Validated Alert")));
				LogResult_and_CaptureImage("PASS", "Verify Text From Alert", "Alert Text Verified Successfully", "NO");
			}
			else
			{
				//   test.fail("Screenshot below: " + test.addScreenCaptureFromPath(takeScreenShot("Validated Alert")));
				LogResult_and_CaptureImage("FAIL", "Verify Text From Alert", "Alert Text Verification Failed", "NO");
			}
		} 
		catch (UnhandledException e) 
		{
			// TODO: handle exception
			LogResult_and_CaptureImage("FAIL", "Error : Verify Text From Alert", "Alert Text Verification Failed", "YES");
			e.printStackTrace();
		}
	}
	
	
	public void getAllElements(By by) throws DocumentException, Exception
	{
		try{
			//WebDriverWait wait = new WebDriverWait(rdriver, 30);
			//wait.until(ExpectedConditions.visibilityOfElementLocated(by));
			List<WebElement> element = rdriver.findElements(by);
			int elementSize = element.size();
			System.out.println("element size: "+elementSize); 
			
			for(int i=0;i<elementSize;i++){
				String temp= element.get(i).getText();
				VerifyObjectDisplayed(by, "Data "+ temp+" ");
				}
			}catch (Exception e)
			{
				LogResult_and_CaptureImage("FAIL", "Error : On verification", " Verification Failed", "YES");
				e.printStackTrace();	
			}
			return;
		}
	
	
	
	//Validate Shopify Order Items
		public boolean validationOfItemsInAString(String inputString, String[] items) {
		    boolean found = true;
		    for (String item : items) {
		        if (!inputString.contains(item)) {
		            found = false;
		            break;
		        }
		    }
		    return found;
		}
	
		//Validate Items In Cart
		public void validateItemsInCart(By by,String addedItems,String elementname)throws Exception{
			//Split Items In Excel
			String[] shStr1 = addedItems.split("-");
	        for(int x=0;x<shStr1.length;x++){
	             System.out.println("shStr1["+x+"] = "+shStr1[x]);
	             shStr1[x]=shStr1[x].trim();
	        }	        
	        System.out.println("No Of Items"+(shStr1.length));
			
			//Elements Obtained From Application
			String[] strArr = strListElements(by);	
			System.out.println("count of items in cart"+strArr.length);
			int i=0;
			for(i=0;i<strArr.length;i++){				
				String finalVal = "";
				String[] splitStr = strArr[i].split("\n");	

				for(int x=0;x<splitStr.length;x++){					
					System.out.println("splitStr"+splitStr[x]);
					if(finalVal==""){
						finalVal = finalVal+splitStr[x];
					}else{
						finalVal=finalVal+","+splitStr[x];
					}
					finalVal=finalVal.trim();
				}
				System.out.println("Final Val"+finalVal);
				if(finalVal.equals(shStr1[i])){
					System.out.println("Values are same");
				}else{
					System.out.println("Values are different");
					LogResult_and_CaptureImage("FAIL", "Cart Elements", "Clicked on " + elementname + "Not Validated Successfully.", "YES");
				}							
			}
			if(i==strArr.length){
				LogResult_and_CaptureImage("PASS", "Cart Elements", "Clicked on " + elementname + " Validated Successfully.", "YES");			
			}
		}
		
		
		//Clear Text In Text Box
		public void ClearDefaultTextInInputField(By by,String elementname) throws MalformedURLException, DocumentException, Exception{
			try 
			{
				WebDriverWait wait = new WebDriverWait(rdriver, 30);
				wait.until(ExpectedConditions.visibilityOfElementLocated(by));
				WebElement e1 = rdriver.findElement(by);
				if (e1.isDisplayed())
				{
					Actions actions = new Actions(rdriver);
					actions.moveToElement(e1).click().build().perform();
					e1.sendKeys(Keys.chord(Keys.CONTROL,"a"));
					e1.sendKeys(Keys.BACK_SPACE);
					LogResult_and_CaptureImage("PASS", "Clear Element Text", "Cleared " + elementname + " Field Successfully.", "NO");
				}
			} 
			catch (Exception e) 
			{
				// TODO: handle exception
				LogResult_and_CaptureImage("FAIL", "Clear Element Text", "Failed To Clear " + elementname + " Field.", "YES");
				e.printStackTrace();
			}
		}
		
		
		//Validate Current URL
		public void verifyCurrentURLInPage(String Text) throws Exception 
		{
			if (rdriver.getCurrentUrl().equalsIgnoreCase(Text)){
				LogResult_and_CaptureImage("PASS", "Verify Current URL", "Current URL " +"'"+Text+"'"+" Is Verified", "YES");
				System.out.println("PASS");
			}else{
				LogResult_and_CaptureImage("FAIL", "Verify Current URL", "Current URL" +"'"+Text+"'"+ " Does Not Match", "NO");
				System.out.println("FAIL");
			}

		}
		
		//Find Elements
		public List<WebElement> findElementsList(By by){
			return rdriver.findElements(by);
		}
		
		// Added by @Sandeepa S on 15/08/2020
		public void clickbuttonTillElementValueReaches(By by, int elementValue, String elementname) throws Exception {
			// Click Button
			try {
				fnStartWatch();
				WebDriverWait wait = new WebDriverWait(rdriver, 45);
				wait.until(ExpectedConditions.visibilityOfElementLocated(by));
				WebElement e1 = rdriver.findElement(by);
				if (e1.isDisplayed()) {
					Actions actions = new Actions(rdriver);
					for (int i = 0; i < elementValue; i++) {
						actions.moveToElement(e1).click().build().perform();
					}
					LogResult_and_CaptureImage("PASS", "Click Button",
							"Clicked on " + elementname + " Button Successfully.", "YES");
				}
			} catch (Exception e) {
				// TODO: handle exception
				LogResult_and_CaptureImage("FAIL", "Click Button", "Failed To Click On " + elementname + " Button.", "YES");
				e.printStackTrace();
			}
		}
		
		// Scroll to view of specified object without waiting - updated - @18/05/20
		// - By Sandeepa S
		// Do not Wait till the element is visible as some the test not working with
		// fnScrollToView
		public void scrollToView(By by) throws Exception {

			try {
				WebElement e1 = rdriver.findElement(by);

				((JavascriptExecutor) rdriver).executeScript("arguments[0].scrollIntoView(true);", e1);
				Thread.sleep(3000);
			} catch (Exception e) {

				LogResult_and_CaptureImage("FAIL", "Scroll", "Failed to scroll", "YES");
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
		LogResult_and_CaptureImage("PASS", "Verify Page Loaded in Same Tab", elementName + " " + "Page loaded in Same Tab Is Successfull", "YES");
		}

		else
		{
		LogResult_and_CaptureImage("FAIL", "Verify Page Loaded in Same Tab", elementName + " " + "Page loaded in Same Tab Is Not Successfull", "YES");
		}
		}
		else
		{
		LogResult_and_CaptureImage("FAIL", "Verify Page Loaded in Same Tab", elementName + " " + "Page loaded in Same Tab Is Not Successfull", "YES");
		}

		}

		catch (Exception e)
		{
		// TODO: handle exception
		LogResult_and_CaptureImage("FAIL", "Verify Page Loaded in Same Tab", "Unable To verify page loaded in same tab", "YES");
		e.printStackTrace();
		}

		}
		
		
		

		
	/*public void establishProxyConnection(String RJRUserID,String URL) throws Exception{

		//Connect via proxy 

		try
		{
			launchUrl("https://www.cnn.com");
			//User ID is required to enter else skip
			if(VerifyObjectDisplayed(Camel_Login.txtMicrosoft,"Proxy")){

				inputText(Camel_Login.txtMicrosoft,"Proxy", RJRUserID) ;
				clickbutton(Camel_Login.btnSubmit, "Next button");
			}
			
			//Wait till continue button is displayed
			WebDriverWait wait = new WebDriverWait(rdriver, 30);
			wait.until(ExpectedConditions.visibilityOfElementLocated(Camel_Login.btnSubmit));
			clickUsingJs(Camel_Login.btnSubmit, "Continue button");
			//After establishing connection launch app url
			launchUrl(URL);
			
			LogResult_and_CaptureImage("PASS", "Establish connection with  proxy", "Established connection with proxy Successfully", "NO");

		}
		catch(Exception e){

			e.printStackTrace();
			LogResult_and_CaptureImage("FAIL", "Establish connection with  proxy", "FAILED to Established connection with proxy ", "NO");
		}


	}*/
}