package com.googlecode.jmapper.integrationtest.others.bean;
import com.googlecode.jmapper.integrationtest.others.bean.differentpath.InheritanceBean;
public class InheritanceSrc {

	private InheritanceBean language;
	private String requestDateTime;
	private String currency;
	private String order;
	
	public InheritanceSrc(InheritanceBean language) {
		super();
		this.language = language;
	}

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
