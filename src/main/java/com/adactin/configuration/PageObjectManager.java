package com.adactin.configuration;

import org.openqa.selenium.WebDriver;

import com.adactin.webelements.LoginPage;
import com.adactin.webelements.SearchHotel;
import com.adactin.webelements.BookingHotel;


public class PageObjectManager {
	
	public WebDriver driver;
	
	public PageObjectManager(WebDriver mdriver) {
	this.driver=mdriver;
	}
	
	public LoginPage lp;

	public LoginPage getLp() {
		if (lp==null) {
			lp = new LoginPage(driver);
		}
		return lp;
	}
	
	public SearchHotel tc102;

	public SearchHotel getTc102() {
		if (tc102==null) {
			tc102 = new SearchHotel(driver);
		}
		return tc102;
	}
	
	public BookingHotel tc104;
	
	public BookingHotel getTc104() {
		if (tc104==null) {
			tc104 = new BookingHotel(driver);
		}
		return tc104;
	}
	

}
