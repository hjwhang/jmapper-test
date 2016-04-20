/**
 * Copyright (c) 2014 EraWeb and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
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

import java.io.Serializable;
import java.util.Date;

import com.googlecode.jmapper.annotations.JGlobalMap;

/**
 * @author vik
 *
 */
@JGlobalMap(excluded={"gender", "locale", "pets"})
public class BuddyVO implements Serializable{
	
	/**
	 * <p>Generated Serial UID.</p>
	 */
	private static final long serialVersionUID = 8166563972634315444L;

	
	/**
	 * <p>Buddy ID.</p> 
	 */
	private Integer id;
	
	/**
	 * <p>Buddy email address.</p>
	 */
	private String email;
	
	/**
	 * <p>Password.</p>
	 */
	private String password;
	
	/**
	 * <p>Buddy first name.</p>
	 */
	private String firstName;
	
	/**
	 * <p>Buddy Last Name.</p>
	 */
	private String lastName;
	
	/**
	 * <p>Buddy's nickname.</p>
	 */
	private String nickName;
	
	/**
	 * </p> Buddy's date of birth.</p>
	 */
	private Date birthDay;
	
	/**
	 * <p>This Buddy is a Staff Member.</p>
	 */
	private boolean staff = false;
	
	/**
	 * <p>True is the email has been confirmed by Buddy.</p>
	 */
	private boolean emailConfirmed = false;
	
	/**
	 * <p>Django confirmation token to email address.</p>
	 */
	private String emailConfirmationToken;
	
	/**
	 * <p>Email confirmation timestamp.</p>
	 */
	private Date emailConfirmationStartDate;
	
	/**
	 * <p>true if Buddy is superuser/administrator.</p>
	 */
	private boolean superUser = false;
	
	/**
	 * <p>Timestamp the Buddy joined in.</p>
	 */
	private Date joinTimestamp;
	
	/**
	 * <p>City the Buddy lives in.</p> 
	 */
	private String city;
	
	/**
	 * <p>Path of the avatar image file.</p>
	 */
	private String avatarPath;
	
	/**
	 * <p>True if profile is public.</p>
	 */
	private boolean publicProfile = false;
	
	/**
	 * <p>Buddy gender (Male/Female).</p>
	 */
	private String gender;
	
	/**
	 * <p>True if Buddy accepted privacy terms.</p>
	 */
	private boolean privacyAccepted = false;
	
	/**
	 * <p>Timestamp the Buddy accepted privacy terms.</p>
	 */
	private Date privacyAcceptanceTimestamp;
	
	/**
	 * <p>True if Buddy accepted Terms &amp; Conditions.</p>
	 */
	private boolean termsAccepted = false;
	
	/**
	 * <p>Timestamp the Buddy accepted Terms &amp; Conditions.</p>
	 */
	private Date termsAcceptanceTimestamp;
	
	/**
	 * <p>The city the Buddy was born in.</p>
	 */
	private String birthCity;
	
	/**
	 * <p>Languages spoken by the Buddy.</p>
	 */
	private String spokenLanguages;
	
	/**
	 * <p>Buddy's job.</p>
	 */
	private String job;
	
	/**
	 * <p>Buddy's qualification.</p>
	 */
	private String qualification;
	
	/**
	 * <p>Genral info wrote by Buddy about (him/her)self.</p>
	 */
	private String about;
	
	/**
	 * <p>Timestamp the Buddy account was deactivated.</p>
	 */
	private Date deactivationTimestamp;
	
	/**
	 * <p>Preferred Locale.</p>
	 */
	private String locale;
	
	/**
	 * <p>True if Buddy is 18yo or more.</p>
	 */
	private boolean adult = false;
	
	/**
	 * <p>Timestamp the Buddy declared to be 18yo+.</p>
	 */
	private Date adultDeclarationTimestamp;
	
	/**
	 * <p>True if Buddy skipped Pet registration during Onboarding.</p>
	 */
	private boolean skipPetRegistration = false;
	
	/**
	 * <p>True if Buddy completed Onboarding.</p>
	 */
	private boolean profileCompleted = false;
	
	
	
	private Integer privacyCanSeePage;

	private Integer privacyCanSearch;

	private boolean notifyPrivateMessage;

	private boolean notifyComment;

	private boolean notifyFriendshipRequest;

	private boolean notifyMyGroupSubscription;

	private boolean notifyGroupSubscription;

	private boolean notifyGroupPublication;

	private boolean notifyLikes;

	private boolean notifyPosts;
	
	private Date lastLogin;
	
	
	
	
	private String passwordRecoveryCode = null;

	private Date passwordRecoveryTimestamp = null;
	
	
	
	
	
	
	
	
	/* **************************************************** 
	 * SETTERS AND GETTERS
	 * ****************************************************/
	
	
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the nickName
	 */
	public String getNickName() {
		return nickName;
	}

	/**
	 * @param nickName the nickName to set
	 */
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	/**
	 * @return the birthDay
	 */
	public Date getBirthDay() {
		return birthDay;
	}

	/**
	 * @param birthDay the birthDay to set
	 */
	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}

	/**
	 * @return the staff
	 */
	public boolean isStaff() {
		return staff;
	}

	/**
	 * @param staff the staff to set
	 */
	public void setStaff(boolean staff) {
		this.staff = staff;
	}

	/**
	 * @return the emailConfirmed
	 */
	public boolean isEmailConfirmed() {
		return emailConfirmed;
	}

	/**
	 * @param emailConfirmed the emailConfirmed to set
	 */
	public void setEmailConfirmed(boolean emailConfirmed) {
		this.emailConfirmed = emailConfirmed;
	}

	/**
	 * @return the emailConfirmationToken
	 */
	public String getEmailConfirmationToken() {
		return emailConfirmationToken;
	}

	/**
	 * @param emailConfirmationToken the emailConfirmationToken to set
	 */
	public void setEmailConfirmationToken(String emailConfirmationToken) {
		this.emailConfirmationToken = emailConfirmationToken;
	}

	/**
	 * @return the emailConfirmationStartDate
	 */
	public Date getEmailConfirmationStartDate() {
		return emailConfirmationStartDate;
	}

	/**
	 * @param emailConfirmationStartDate the emailConfirmationStartDate to set
	 */
	public void setEmailConfirmationStartDate(Date emailConfirmationStartDate) {
		this.emailConfirmationStartDate = emailConfirmationStartDate;
	}

	/**
	 * @return the superUser
	 */
	public boolean isSuperUser() {
		return superUser;
	}

	/**
	 * @param superUser the superUser to set
	 */
	public void setSuperUser(boolean superUser) {
		this.superUser = superUser;
	}

	/**
	 * @return the joinTimestamp
	 */
	public Date getJoinTimestamp() {
		return joinTimestamp;
	}

	/**
	 * @param joinTimestamp the joinTimestamp to set
	 */
	public void setJoinTimestamp(Date joinTimestamp) {
		this.joinTimestamp = joinTimestamp;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the avatarPath
	 */
	public String getAvatarPath() {
		return avatarPath;
	}

	/**
	 * @param avatarPath the avatarPath to set
	 */
	public void setAvatarPath(String avatarPath) {
		this.avatarPath = avatarPath;
	}

	/**
	 * @return the publicProfile
	 */
	public boolean isPublicProfile() {
		return publicProfile;
	}

	/**
	 * @param publicProfile the publicProfile to set
	 */
	public void setPublicProfile(boolean publicProfile) {
		this.publicProfile = publicProfile;
	}

	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * @return the privacyAccepted
	 */
	public boolean isPrivacyAccepted() {
		return privacyAccepted;
	}

	/**
	 * @param privacyAccepted the privacyAccepted to set
	 */
	public void setPrivacyAccepted(boolean privacyAccepted) {
		this.privacyAccepted = privacyAccepted;
	}

	/**
	 * @return the privacyAcceptanceTimestamp
	 */
	public Date getPrivacyAcceptanceTimestamp() {
		return privacyAcceptanceTimestamp;
	}

	/**
	 * @param privacyAcceptanceTimestamp the privacyAcceptanceTimestamp to set
	 */
	public void setPrivacyAcceptanceTimestamp(Date privacyAcceptanceTimestamp) {
		this.privacyAcceptanceTimestamp = privacyAcceptanceTimestamp;
	}

	/**
	 * @return the termsAccepted
	 */
	public boolean isTermsAccepted() {
		return termsAccepted;
	}

	/**
	 * @param termsAccepted the termsAccepted to set
	 */
	public void setTermsAccepted(boolean termsAccepted) {
		this.termsAccepted = termsAccepted;
	}

	/**
	 * @return the termsAcceptanceTimestamp
	 */
	public Date getTermsAcceptanceTimestamp() {
		return termsAcceptanceTimestamp;
	}

	/**
	 * @param termsAcceptanceTimestamp the termsAcceptanceTimestamp to set
	 */
	public void setTermsAcceptanceTimestamp(Date termsAcceptanceTimestamp) {
		this.termsAcceptanceTimestamp = termsAcceptanceTimestamp;
	}

	/**
	 * @return the birthCity
	 */
	public String getBirthCity() {
		return birthCity;
	}

	/**
	 * @param birthCity the birthCity to set
	 */
	public void setBirthCity(String birthCity) {
		this.birthCity = birthCity;
	}

	/**
	 * @return the spokenLanguages
	 */
	public String getSpokenLanguages() {
		return spokenLanguages;
	}

	/**
	 * @param spokenLanguages the spokenLanguages to set
	 */
	public void setSpokenLanguages(String spokenLanguages) {
		this.spokenLanguages = spokenLanguages;
	}

	/**
	 * @return the job
	 */
	public String getJob() {
		return job;
	}

	/**
	 * @param job the job to set
	 */
	public void setJob(String job) {
		this.job = job;
	}

	/**
	 * @return the qualification
	 */
	public String getQualification() {
		return qualification;
	}

	/**
	 * @param qualification the qualification to set
	 */
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	/**
	 * @return the about
	 */
	public String getAbout() {
		return about;
	}

	/**
	 * @param about the about to set
	 */
	public void setAbout(String about) {
		this.about = about;
	}

	/**
	 * @return the deactivationTimestamp
	 */
	public Date getDeactivationTimestamp() {
		return deactivationTimestamp;
	}

	/**
	 * @param deactivationTimestamp the deactivationTimestamp to set
	 */
	public void setDeactivationTimestamp(Date deactivationTimestamp) {
		this.deactivationTimestamp = deactivationTimestamp;
	}

	/**
	 * @return the locale
	 */
	public String getLocale() {
		return locale;
	}

	/**
	 * @param locale the locale to set
	 */
	public void setLocale(String locale) {
		this.locale = locale;
	}

	/**
	 * @return the adult
	 */
	public boolean isAdult() {
		return adult;
	}

	/**
	 * @param adult the adult to set
	 */
	public void setAdult(boolean adult) {
		this.adult = adult;
	}

	/**
	 * @return the adultDeclarationTimestamp
	 */
	public Date getAdultDeclarationTimestamp() {
		return adultDeclarationTimestamp;
	}

	/**
	 * @param adultDeclarationTimestamp the adultDeclarationTimestamp to set
	 */
	public void setAdultDeclarationTimestamp(Date adultDeclarationTimestamp) {
		this.adultDeclarationTimestamp = adultDeclarationTimestamp;
	}

	/**
	 * @return the skipPetRegistration
	 */
	public boolean isSkipPetRegistration() {
		return skipPetRegistration;
	}

	/**
	 * @param skipPetRegistration the skipPetRegistration to set
	 */
	public void setSkipPetRegistration(boolean skipPetRegistration) {
		this.skipPetRegistration = skipPetRegistration;
	}

	/**
	 * @return the profileCompleted
	 */
	public boolean isProfileCompleted() {
		return profileCompleted;
	}

	/**
	 * @param profileCompleted the profileCompleted to set
	 */
	public void setProfileCompleted(boolean profileCompleted) {
		this.profileCompleted = profileCompleted;
	}

	/**
	 * @return the privacyCanSeePage
	 */
	public Integer getPrivacyCanSeePage() {
		return privacyCanSeePage;
	}

	/**
	 * @param privacyCanSeePage the privacyCanSeePage to set
	 */
	public void setPrivacyCanSeePage(Integer privacyCanSeePage) {
		this.privacyCanSeePage = privacyCanSeePage;
	}

	/**
	 * @return the privacyCanSearch
	 */
	public Integer getPrivacyCanSearch() {
		return privacyCanSearch;
	}

	/**
	 * @param privacyCanSearch the privacyCanSearch to set
	 */
	public void setPrivacyCanSearch(Integer privacyCanSearch) {
		this.privacyCanSearch = privacyCanSearch;
	}

	/**
	 * @return the notifyPrivateMessage
	 */
	public boolean isNotifyPrivateMessage() {
		return notifyPrivateMessage;
	}

	/**
	 * @param notifyPrivateMessage the notifyPrivateMessage to set
	 */
	public void setNotifyPrivateMessage(boolean notifyPrivateMessage) {
		this.notifyPrivateMessage = notifyPrivateMessage;
	}

	/**
	 * @return the notifyComment
	 */
	public boolean isNotifyComment() {
		return notifyComment;
	}

	/**
	 * @param notifyComment the notifyComment to set
	 */
	public void setNotifyComment(boolean notifyComment) {
		this.notifyComment = notifyComment;
	}

	/**
	 * @return the notifyFriendshipRequest
	 */
	public boolean isNotifyFriendshipRequest() {
		return notifyFriendshipRequest;
	}

	/**
	 * @param notifyFriendshipRequest the notifyFriendshipRequest to set
	 */
	public void setNotifyFriendshipRequest(boolean notifyFriendshipRequest) {
		this.notifyFriendshipRequest = notifyFriendshipRequest;
	}

	/**
	 * @return the notifyMyGroupSubscription
	 */
	public boolean isNotifyMyGroupSubscription() {
		return notifyMyGroupSubscription;
	}

	/**
	 * @param notifyMyGroupSubscription the notifyMyGroupSubscription to set
	 */
	public void setNotifyMyGroupSubscription(boolean notifyMyGroupSubscription) {
		this.notifyMyGroupSubscription = notifyMyGroupSubscription;
	}

	/**
	 * @return the notifyGroupSubscription
	 */
	public boolean isNotifyGroupSubscription() {
		return notifyGroupSubscription;
	}

	/**
	 * @param notifyGroupSubscription the notifyGroupSubscription to set
	 */
	public void setNotifyGroupSubscription(boolean notifyGroupSubscription) {
		this.notifyGroupSubscription = notifyGroupSubscription;
	}

	/**
	 * @return the notifyGroupPublication
	 */
	public boolean isNotifyGroupPublication() {
		return notifyGroupPublication;
	}

	/**
	 * @param notifyGroupPublication the notifyGroupPublication to set
	 */
	public void setNotifyGroupPublication(boolean notifyGroupPublication) {
		this.notifyGroupPublication = notifyGroupPublication;
	}

	/**
	 * @return the notifyLikes
	 */
	public boolean isNotifyLikes() {
		return notifyLikes;
	}

	/**
	 * @param notifyLikes the notifyLikes to set
	 */
	public void setNotifyLikes(boolean notifyLikes) {
		this.notifyLikes = notifyLikes;
	}

	/**
	 * @return the notifyPosts
	 */
	public boolean isNotifyPosts() {
		return notifyPosts;
	}

	/**
	 * @param notifyPosts the notifyPosts to set
	 */
	public void setNotifyPosts(boolean notifyPosts) {
		this.notifyPosts = notifyPosts;
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
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
	 * @return the passwordRecoveryCode
	 */
	public String getPasswordRecoveryCode() {
		return passwordRecoveryCode;
	}

	/**
	 * @param passwordRecoveryCode the passwordRecoveryCode to set
	 */
	public void setPasswordRecoveryCode(String passwordRecoveryCode) {
		this.passwordRecoveryCode = passwordRecoveryCode;
	}

	/**
	 * @return the passwordRecoveryTimestamp
	 */
	public Date getPasswordRecoveryTimestamp() {
		return passwordRecoveryTimestamp;
	}

	/**
	 * @param passwordRecoveryTimestamp the passwordRecoveryTimestamp to set
	 */
	public void setPasswordRecoveryTimestamp(Date passwordRecoveryTimestamp) {
		this.passwordRecoveryTimestamp = passwordRecoveryTimestamp;
	}
	
	
	
	
	

}
