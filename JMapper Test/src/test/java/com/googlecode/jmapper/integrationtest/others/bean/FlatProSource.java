package com.googlecode.jmapper.integrationtest.others.bean;


public class FlatProSource {

	private User user;
	
	public FlatProSource() {
		user = new User();
	}
	
	public FlatProSource(User user) {
		super();
		this.user = user;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public static class User {
		
		private String name;
		private String surname;
		private String address;
		private String number;
		
		public User() {}
		
		public User(String name, String surname, String address, String number) {
			super();
			this.name = name;
			this.surname = surname;
			this.address = address;
			this.number = number;
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
}
