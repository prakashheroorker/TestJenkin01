package com.rai.framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import com.perfecto.reportium.client.ReportiumClient;

import io.appium.java_client.AppiumDriver;

public class BaseClass {
	public static RemoteWebDriver rdriver;
	public static ReportiumClient reportiumClient;
	public  static AppiumDriver adriver;
	public static WebDriver driver;
	

}