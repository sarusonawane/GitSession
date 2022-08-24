package com.resonance.traveltests;

import com.resonance.config.BaseFramework;
import com.resonance.constant.Locator;
import com.resonance.constant.LocatorType;

import static com.resonance.utility.Keyword.*;

import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

public class Travel extends BaseFramework {
	private static final Logger LOG =Logger.getLogger(Travel.class);
	@Test
	public void verifyErrorOnSelectingSameCitiesAsSourceAndDestination() {
		waitFor(3000);
		click(Locator.homeScreen_closePopupBtn);
		click(Locator.homeScreen_travelLink);
		waitFor(5000);
		click(Locator.homeScreen_fromcity);
		waitFor(2000);
		LOG.info("Click on from city dropdown");
		click(Locator.homeScreen_fromCity_BOM);
	}
	
	public void verifySearchResultsForShoes() {
		enterText(Locator.homeScreen_searchTxBx,"Shoes");
		
	}

	
	}
	
	
	
	


