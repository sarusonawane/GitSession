package com.resonance.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JoinMeetingPage {
	
	@FindBy(css = "h2.m-txt")
	public WebElement quickJoinMeetingTxt;
	/**
	 * 
	 */
	public JoinMeetingPage() {
		PageFactory.initElements(driver,.this);
	}
	public String getPagesHeading() {
		return quickJoinMeetingTxt.getText();
	}
	

}
