package com.enlistasidekick.spring.beans;

public abstract class User {
	private String phoneNumber;
	private String nickName;
	private String userID;
	
	
	private void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getPhoneNumber() {
		return phoneNumber;	
	}
	
	private void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getNickName() {
		return nickName;
	}
	
	private void setUserID(String userID) {
		this.userID = userID;
	}
	public String getUserID() {
		return userID;
	}
}
