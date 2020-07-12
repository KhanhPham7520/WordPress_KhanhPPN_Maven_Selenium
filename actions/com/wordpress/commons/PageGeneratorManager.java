package com.wordpress.commons;

import org.openqa.selenium.WebDriver;

import com.wordpress.pageOjects.LoginPO;

public class PageGeneratorManager {
	
	
	public static LoginPO getLoginPage(WebDriver driver) {
		return new LoginPO(driver);
	}

}
