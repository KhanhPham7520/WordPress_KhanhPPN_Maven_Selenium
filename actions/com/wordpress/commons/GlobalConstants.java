package com.wordpress.commons;

public class GlobalConstants {
	public static final String DEV_URL = "https://demo.nopcommerce.com/";
	public static final String ADMIN_PAGE_URL = "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F";

	public static final String rootFolderPath = System.getProperty("user.dir");

	// Firefox driver path
	public static final String FIREFOX_DRIVER_SYSTEM_KEY = "webdriver.gecko.driver";
	public static final String FIREFOX_DRIVER_SYSTEM_VALUE = rootFolderPath + "/browserDrivers/geckodriver";

	// Chrome driver path
	public static final String CHROME_DRIVER_SYSTEM_KEY = "webdriver.chrome.driver";
	public static final String CHROME_DRIVER_SYSTEM_VALUE = rootFolderPath + "/src/main/resources/browserDrivers/chromedriver";
	// Edge driver path
	public static final String EDGE_DRIVER_SYSTEM_KEY = "webdriver.edge.driver";
	public static final String EDGE_DRIVER_SYSTEM_VALUE = rootFolderPath + "/browserDrivers/msedgedriver";

	// Common message in Search Product Page
	public static final String NO_PRODUCT_WERE_FOUND_CRITERIA_MESSAGE = "No products were found that matched your criteria.";
	public static final long SHORT_TIMEOUT = 10;
	public static final long LONG_TIMEOUT = 30;

	// Login official Info for user
	public static final String USER_EMAIL = "phamphannhatkhanh7520@gmail.com";
	public static final String USER_PASSWORD = "foster1994";

	// Login offical Info for admin
	public static final String ADMIN_EMAIL = "admin@yourstore.com";
	public static final String ADMIN_PASSWORD = "admin";
}
