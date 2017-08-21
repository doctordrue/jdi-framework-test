package com.github.doctordrue.google.site.elements;

import com.epam.jdi.uitests.web.selenium.elements.common.Link;
import com.epam.jdi.uitests.web.selenium.elements.common.Text;
import com.epam.jdi.uitests.web.selenium.elements.composite.Section;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.JFindBy;

public class ResultsItem extends Section {

	@JFindBy(css = "h3.r>a")
	public Link header;

	@JFindBy(css = "div.s span.st")
	public Text description;
}
