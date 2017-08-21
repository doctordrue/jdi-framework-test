package com.github.doctordrue.google.site;

import com.epam.jdi.uitests.web.selenium.elements.composite.WebSite;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.JSite;
import com.github.doctordrue.google.site.pages.SearchResultsPage;
import com.github.doctordrue.google.site.pages.StartPage;

@JSite(domain = "http://google.com")
public class GoogleSite extends WebSite {
	public static StartPage startPage;
	public static SearchResultsPage resultsPage;
}
