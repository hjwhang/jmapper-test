package com.googlecode.jmapper.integrationtest.others.bean;

import com.googlecode.jmapper.annotations.JGlobalMap;
import com.googlecode.jmapper.annotations.JMapAccessor;
import com.googlecode.jmapper.annotations.JMapConversion;
import com.googlecode.jmapper.annotations.JMapConversion.Type;

@JGlobalMap("user")
public class FlatProDestination {

	@JMapAccessor(get="gName",set="sName")
	private String name;
	private String surname;
	private String address;
	private String number;
	
	public FlatProDestination() {
	}
	
	public FlatProDestination(String name, String surname, String address, String number) {
		super();
		this.name = name;
		this.surname = surname;
		this.address = address;
		this.number = number;
	}

	@JMapConversion(from={"name","surname","address","number"},type=Type.DYNAMIC,avoidSet=true)
	public static String fromDestConversion(){
		return "${destination}.${source.set}(${source});";
	}
	
	@JMapConversion(from={"user"},type=Type.DYNAMIC,avoidSet=true)
	public static String fromSourceConversion(){
		return "${destination} = ${source}.${destination.get}();";
	}
	
	public String gName() {
		return name;
	}
	public void sName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}

}
