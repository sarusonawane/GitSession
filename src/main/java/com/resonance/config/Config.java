package com.resonance.config;

import com.resonance.utility.PropUtil;

public class Config {
	/**
	 * This method will return url mentiond in appliction.properties file
	 */
	
	public String getAppUrl() { 
		return getProperty("app.url");
		
		}
	public String getBrowseName() {
		return getProperty("browserName");
		
	}
	private String getProperty(String property) {
		PropUtil prop = new PropUtil();
		String dir = System.getProperty("usr.dir");
		return prop.getValue(dir+"/src/main/resources/application.properties",property);	
	}

}
