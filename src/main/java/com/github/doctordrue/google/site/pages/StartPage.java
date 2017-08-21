package com.github.doctordrue.google.site.pages;

import org.openqa.selenium.Keys;

import com.epam.jdi.uitests.core.interfaces.complex.interfaces.CheckPageTypes;
import com.epam.jdi.uitests.web.selenium.elements.common.Button;
import com.epam.jdi.uitests.web.selenium.elements.common.TextField;
import com.epam.jdi.uitests.web.selenium.elements.composite.WebPage;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.JFindBy;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.JPage;
import com.github.doctordrue.google.site.GoogleSite;

@JPage(
        url = "/",
        urlTemplate = "https?:\\/\\/(www)*\\.google\\.(ru|com)\\/.*",
        title = "Google",
        urlCheckType = CheckPageTypes.MATCH,
        titleCheckType = CheckPageTypes.CONTAINS)
public class StartPage extends WebPage {

	@JFindBy(name = "q")
	public TextField searchField;

	@JFindBy(name = "btnK")
	public Button searchButton;

	public SearchResultsPage search(String text) {
		searchField.newInput(text);
		searchField.input(Keys.ENTER);
		return GoogleSite.resultsPage;
	}
}
