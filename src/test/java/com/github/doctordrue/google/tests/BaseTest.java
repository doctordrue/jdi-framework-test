package com.github.doctordrue.google.tests;

import static com.epam.jdi.uitests.core.settings.JDISettings.logger;

import org.testng.annotations.BeforeSuite;

import com.epam.jdi.uitests.web.selenium.elements.composite.WebSite;
import com.epam.jdi.uitests.web.testng.testRunner.TestNGBase;
import com.github.doctordrue.google.site.GoogleSite;

public abstract class BaseTest extends TestNGBase {
	@BeforeSuite(alwaysRun = true)
	public static void setUp() throws Exception {
		WebSite.init(GoogleSite.class);
		logger.info("Run Tests");
	}

}
