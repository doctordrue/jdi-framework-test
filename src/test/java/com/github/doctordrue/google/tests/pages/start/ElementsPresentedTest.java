package com.github.doctordrue.google.tests.pages.start;

import static com.github.doctordrue.google.site.GoogleSite.startPage;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.github.doctordrue.google.tests.BaseTest;

public class ElementsPresentedTest extends BaseTest {

	@Test
	public void checkStartPageOpenedTest() {
		startPage.open();
		startPage.checkOpened();
	}

	@Test(dependsOnMethods = "checkStartPageOpenedTest")
	public void checkSearchFieldPresentedTest() {
		assertTrue(startPage.searchField.isDisplayed(), "Search field is displayed on page: ");
	}

}
