package com.googlecode.jmapper.integrationtest.others.github.bean;

import com.googlecode.jmapper.annotations.JMap;

public class Source {

	@JMap(value = "destinationText", classes = Destination.class)
private String sourceText;
@JMap(value = "nestedDestination", classes = Destination.class)
private NestedSource nestedSource;

public Source() {
}

public Source(String sourceText, NestedSource nestedSource) {
	super();
	this.sourceText = sourceText;
	this.nestedSource = nestedSource;
}

public String getSourceText() {
	return sourceText;
}
public void setSourceText(String sourceText) {
	this.sourceText = sourceText;
}
public NestedSource getNestedSource() {
	return nestedSource;
}
public void setNestedSource(NestedSource nestedSource) {
	this.nestedSource = nestedSource;
}

}
