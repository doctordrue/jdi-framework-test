package com.github.doctordrue.google.tests.search;

import static com.github.doctordrue.google.site.GoogleSite.resultsPage;
import static com.github.doctordrue.google.site.GoogleSite.startPage;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.github.doctordrue.google.tests.BaseTest;

public class SearchFromStartPageTest extends BaseTest {

	@BeforeTest
	public void openPage() {
		startPage.open();
		startPage.search("JDI");
	}

	@Test
	public void checkResultsPageOpened() {
		resultsPage.checkOpened();
	}

	@Test(dependsOnMethods = "checkResultsPageOpened")
	public void checkResultsContainsExpectedString() {
		boolean isResultFound = resultsPage.results.stream()
		        .anyMatch(e -> e.header.getURL().toString().contains("jdi.epam.com"));
		assertTrue(isResultFound, "Link to 'jdi.epam.com' is expected to be on first page of search: ");
	}
}
