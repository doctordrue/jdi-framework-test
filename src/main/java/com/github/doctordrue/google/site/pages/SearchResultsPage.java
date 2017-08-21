package com.github.doctordrue.google.site.pages;

import java.util.List;

import org.openqa.selenium.support.FindBy;

import com.epam.jdi.uitests.core.interfaces.complex.interfaces.CheckPageTypes;
import com.epam.jdi.uitests.web.selenium.elements.composite.Search;
import com.epam.jdi.uitests.web.selenium.elements.composite.WebPage;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.JFindBy;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.JPage;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.objects.JSearch;
import com.github.doctordrue.google.site.elements.ResultsItem;

@JPage(
        urlTemplate = "https?:\\/\\/(www)*\\.google\\.(ru|com)\\/search\\?.*",
        urlCheckType = CheckPageTypes.MATCH)
public class SearchResultsPage extends WebPage {

	@JSearch(
	        input = @FindBy(name = "q"),
	        jSuggestions = @JFindBy(css = "ul.sbsb_b[role = 'listbox']"),
	        jSearchButton = @JFindBy(name = "btnG"),
	        jInput = @JFindBy,
	        searchButton = @FindBy,
	        suggestions = @FindBy)
	public Search search;
	
	@JFindBy(css = "div#search div.g div[data-hveid]")
	public List<ResultsItem> results;
}
