package com.enlistasidekick.spring.beans;

public class ChallengeRequest {
	private String requestorName;
	private String phoneNumber;
	private String goal;
	private String customGoal;
	private String sidekickName;
	private String sidekickPhoneNumber;
	private String startDate;
	private String duration;
	private Frequency notificationFrequency;
	

	public enum Frequency {
		HOURLY, DAILY, WEEKLY, MONTHLY, ANNUALLY
	}	
	
	public void setRequestorName(String requestorName) {
		this.requestorName = requestorName;
	}
	public String getRequestorName() {
		return requestorName;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setGoal(String goal) {
		this.goal = goal;
	}
	public String getGoal() {
		return goal;
	}
	
	public void setCustomGoal(String customGoal) {
		this.customGoal = customGoal;
	}
	public String getCustomGoal() {
		return customGoal;
	}
	
	public void setSidekickName(String sidekickName) {
		this.sidekickName = sidekickName;
	}
	public String getSidekickName() {
		return sidekickName;
	}
	
	public void setSidekickPhoneNumber(String sidekickPhoneNumber) {
		this.sidekickPhoneNumber = sidekickPhoneNumber; 
	}
	public String getSidekickPhoneNumber() {
		return sidekickPhoneNumber;
	}
	
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getStartDate() {
		return startDate;
	}
	
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public String getDuration() {
		return duration;
	}
	
	public void setNotificationFrequency(Frequency notificationFrequency) {
		this.notificationFrequency = notificationFrequency;
	}
	public Frequency getNotificationFrequency() {
		return notificationFrequency;
	}
	
	public void createChallenge() {
		
	}
	
	public void submitChallenge() {
		
	}

}
