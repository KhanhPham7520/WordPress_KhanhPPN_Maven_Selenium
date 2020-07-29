package com.wordpress.account;

import org.testng.annotations.Test;

import com.wordpress.AbstractTest;
import com.wordpress.commons.GlobalConstants;
import com.wordpress.commons.PageGeneratorManager;
import com.wordpress.pageOjects.LoginPO;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

public class TC_Account_Login extends AbstractTest {

	private WebDriver driver;
	private LoginPO loginPO;

	@BeforeTest
	@Parameters({ "browser" })
	public void beforeTest(@Optional("chrome") String browserName) {
		driver = getBrowserDriver(browserName);
		loginPO = PageGeneratorManager.getLoginPage(driver);
	}

	@BeforeMethod
	public void beforeMethod() {
		loginPO.openUrl(driver, GlobalConstants.LOGIN_PAGE_URL);
	}

	@Test
	public void TC_01_Login_Empty_Username() {

		loginPO.inputUsername(driver, "");

		loginPO.clickContinueButton(driver);

		verifyEquals(loginPO.getTextValidationErrorMsg(driver), "Please enter a username or email address.");

	}

	@Test
	public void TC_02_Login_Not_Exist_Username() {

		loginPO.inputUsername(driver, "phamphans");

		loginPO.clickContinueButton(driver);

		verifyEquals(loginPO.getTextValidationErrorMsg(driver),
				"User does not exist. Would you like to create a new account?");

	}

	@Test
	public void TC_03_Login_With_Invalid_Password() {

		loginPO.inputUsername(driver, GlobalConstants.ADMIN_EMAIL);

		loginPO.clickContinueButton(driver);

		loginPO.inputPassword(driver, "1234");

		loginPO.clickLoginButton(driver);

		verifyEquals(loginPO.getTextValidationErrorMsg(driver),
				"Oops, that's not the right password. Please try again!");

	}

	@Test
	public void TC_04_Login_With_Valid_Account() {

		loginPO.inputUsername(driver, GlobalConstants.ADMIN_EMAIL);

		loginPO.clickContinueButton(driver);

		loginPO.inputPassword(driver, GlobalConstants.ADMIN_PASSWORD);

		loginPO.clickLoginButton(driver);

		verifyTrue(loginPO.isDashboardMenuDisplayed(driver));

	}

	@AfterTest(alwaysRun = true)
	public void afterTest() {
		closeBrowserAndDriver(driver);
	}

}
