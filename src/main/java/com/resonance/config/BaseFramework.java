package com.resonance.config;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static com.resonance.utility.Keyword.*;

public class BaseFramework {
	public RemoteWebDriver driver;

	@BeforeMethod
	public void setup() {
		this.driver = openBrowser("chrome");
		Config conf = new Config();
		launchUrl(conf.getAppUrl());
	}

	@AfterMethod
	public void tearDown() {

		driver.quit();

	}
}
