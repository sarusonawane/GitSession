package com.resonance.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.resonance.config.BaseFramework;

public class PageBase {
	public RemoteWebDriver driver;
	public PageBase() {
		this.driver =BaseFramework.driver;
	}

}
