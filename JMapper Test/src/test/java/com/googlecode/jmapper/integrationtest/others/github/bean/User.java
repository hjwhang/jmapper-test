/**
 * Copyright (c) 2014 EraWeb and/or its affiliates. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *   - Redistributions of source code must retain the above copyright
 *     notice, this list of conditions and the following disclaimer.
 *
 *   - Redistributions in binary form must reproduce the above copyright
 *     notice, this list of conditions and the following disclaimer in the
 *     documentation and/or other materials provided with the distribution.
 *
 *   - Neither the name of EraWeb or the names of its
 *     contributors may be used to endorse or promote products derived
 *     from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS
 * IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE ARE DISCLAIMED.  IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */ 
package com.googlecode.jmapper.integrationtest.others.github.bean;

import java.util.Date;

/**
 * <p>This class describe a system <source>User</source>
 * 
 * @author Vincenzo Magistro
 *
 */
public class User<T> {
	
	/**
	 * <p>User ID.</p>
	 */
	private T id; 
	
	/**
	 * <p>Username.</p>
	 */
	private String username;

	/**
	 * <p>User password.</p>
	 */
	private String password;
	
	/**
	 * <p>Timestamp the account for the User was created on.</p>
	 */
	private Date registrationTimestamp;
	
	/**
	 * <p>When the account was updated.</p> 
	 */
	private Date lastUpdate;
	
	/**
	 * <p>Timestamp the user logged in last time.<p>
	 */
	private Date lastLogin;
	
	/**
	 * <p>Timestamp of account expiration.</p>
	 * <p>Set to null if account never expires.</p> 
	 */
	private Date expireTimestamp;
	
	/**
	 * <p>Set to true if account is active/enabled.</p>
	 */
	private boolean active;
	
	/**
	 * <p>User email.</p>
	 */
	private String email;
	
	
	
	
	
	
	
	

	/**
	 * @return the id
	 */
	public T getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(T id) {
		this.id = id;
	}


	/**
	 * @return the registrationTimestamp
	 */
	public Date getRegistrationTimestamp() {
		return registrationTimestamp;
	}

	/**
	 * @param registrationTimestamp the registrationTimestamp to set
	 */
	public void setRegistrationTimestamp(Date registrationTimestamp) {
		this.registrationTimestamp = registrationTimestamp;
	}

	/**
	 * @return the active
	 */
	public boolean isActive() {
		return active;
	}

	/**
	 * @param active the active to set
	 */
	public void setActive(boolean active) {
		this.active = active;
	}

	/**
	 * @return the expireTimestamp
	 */
	public Date getExpireTimestamp() {
		return expireTimestamp;
	}

	/**
	 * @param expireTimestamp the expireTimestamp to set
	 */
	public void setExpireTimestamp(Date expireTimestamp) {
		this.expireTimestamp = expireTimestamp;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the lastUpdate
	 */
	public Date getLastUpdate() {
		return lastUpdate;
	}

	/**
	 * @param lastUpdate the lastUpdate to set
	 */
	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	/**
	 * @return the lastLogin
	 */
	public Date getLastLogin() {
		return lastLogin;
	}

	/**
	 * @param lastLogin the lastLogin to set
	 */
	public void setLastLogin(Date lastLogin) {
		this.lastLogin = lastLogin;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
	
	

}
