package com.wordpress.pageOjects;

import org.openqa.selenium.WebDriver;

import com.wordpress.commons.AbstractPages;
import com.wordpress.pageUIs.AdminDashboardPageUI;
import com.wordpress.pageUIs.LoginPageUI;

public class LoginPO extends AbstractPages {
	
	private WebDriver driver;
	
	public LoginPO(WebDriver driver) {
		this.driver = driver;
	}

	public void inputUsername(WebDriver driver, String inputValue) {
		waitToElementVisible(driver, LoginPageUI.USERNAME_TEXTBOX);
		sendKeyToElement(driver, LoginPageUI.USERNAME_TEXTBOX, inputValue);
	}
	
	public void inputPassword(WebDriver driver, String inputValue) {
		waitToElementVisible(driver, LoginPageUI.PASSWORD_TEXTBOX);
		sendKeyToElement(driver, LoginPageUI.PASSWORD_TEXTBOX, inputValue);
	}
	
	public void clickContinueButton(WebDriver driver) {
		waitToElementClickable(driver, LoginPageUI.CONTINUE_BUTTON);
		clickToElement(driver, LoginPageUI.CONTINUE_BUTTON);
	}
	
	public void clickLoginButton(WebDriver driver) {
		waitToElementClickable(driver, LoginPageUI.LOGIN_BUTTON);
		clickToElement(driver, LoginPageUI.LOGIN_BUTTON);
	}
	
	public String getTextValidationErrorMsg(WebDriver driver) {
		waitToElementVisible(driver, LoginPageUI.INPUT_VALIDATION_MSG_ERROR);
		return getTextElement(driver, LoginPageUI.INPUT_VALIDATION_MSG_ERROR);
	}
	
	public boolean isDashboardMenuDisplayed(WebDriver driver) {
		waitToElementVisible(driver, AdminDashboardPageUI.DASHBOARD_MENU);
		return isElementDisplayed(driver, AdminDashboardPageUI.DASHBOARD_MENU);
	}

}
