package com.resonance.constant;

public interface Locator {
	public String homeScreen_closePopupBtn = "XPATH##//button[contains(text(),'x')]";
	String homeScreen_travelLink = "XPATH##//a[contains(@htf,'travel/fli')]";
	String homeScreen_fromcity = "XPATH##//label[contains(text(),'From')]/parent::div";
	String homeScreen_searchTxBx = "XPATH##input[placeholder='Search for products,brand and more,]";
	String homeScreen_fromCity_BOM = "XPATH##//lable[contains(text(),'Form')]/parent::div/following-sibling::div/descendant::[contains(text(),'BOM')]";

}
