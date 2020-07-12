package com.wordpress.commons;

public class GlobalConstants {
	public static final String LOGIN_PAGE_URL = "https://automationfc.wordpress.com/wp-admin/";

	public static final String rootFolderPath = System.getProperty("user.dir");

	// Firefox driver path
	public static final String FIREFOX_DRIVER_SYSTEM_KEY = "webdriver.gecko.driver";
	public static final String FIREFOX_DRIVER_SYSTEM_VALUE = rootFolderPath + "/browserDrivers/geckodriver";

	// Chrome driver path
	public static final String CHROME_DRIVER_SYSTEM_KEY = "webdriver.chrome.driver";
	public static final String CHROME_DRIVER_SYSTEM_VALUE = rootFolderPath + "/browserDrivers/chromedriver";
	// Edge driver path
	public static final String EDGE_DRIVER_SYSTEM_KEY = "webdriver.edge.driver";
	public static final String EDGE_DRIVER_SYSTEM_VALUE = rootFolderPath + "/browserDrivers/msedgedriver";

	// Common message in Search Product Page
	public static final long SHORT_TIMEOUT = 10;
	public static final long LONG_TIMEOUT = 30;

	// Login offical Info for admin
	public static final String ADMIN_EMAIL = "automationeditor";
	public static final String ADMIN_PASSWORD = "automationfc";
}
