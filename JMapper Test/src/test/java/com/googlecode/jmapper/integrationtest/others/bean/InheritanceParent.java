package com.googlecode.jmapper.integrationtest.others.bean;

import java.io.Serializable;

import com.googlecode.jmapper.annotations.JMap;

public class InheritanceParent implements Serializable {
	private static final long serialVersionUID = 1L;

	@JMap private InheritanceBean language;
	@JMap private String requestDateTime;
	@JMap private String currency;
	@JMap private String order;
	
	public InheritanceBean getLanguage() {
		return language;
	}
	
	public void setLanguage(InheritanceBean language) {
		this.language = language;
	}
	public String getRequestDateTime() {
		return requestDateTime;
	}
	public void setRequestDateTime(String requestDateTime) {
		this.requestDateTime = requestDateTime;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getOrder() {
		return order;
	}
	public void setOrder(String order) {
		this.order = order;
	}
	
}
