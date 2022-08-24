package com.resonance.homepage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.resonance.config.BaseFramework;
import com.resonance.pages.HomePage;
import com.resonance.pages.JoinMeetingPage;
import com.resonance.utility.Keyword;


public class HomePageTests extends BaseFramework {
	@Test
	public void verifyOnClickOfJoinMeetingUserLandsOnQuickJoinMeetingPages() {
		HomePage home = new HomePage();
		
		home.clickOnJoinMeeting();
		Keyword.waitFor(3000);
		
		JoinMeetingPage joinMeeting = new JoinMeetingPage();
		String actual = joinMeeting.getPagesHeading();
		Assert.assertEquals(actual, "Quick join a Meeting");
		
	}

	
}
