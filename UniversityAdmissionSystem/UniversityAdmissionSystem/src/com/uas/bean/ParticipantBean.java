package com.uas.bean;

public class ParticipantBean {

	 private int rollno;
     private String emailid;
     private  int applicationid;
     private int ScheduleProgramId;
     
     
	
	
	public ParticipantBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	
	public int getApplicationid() {
		return applicationid;
	}
	public void setApplicationid(int applicationid) {
		this.applicationid = applicationid;
	}
	public int getScheduleProgramId() {
		return ScheduleProgramId;
	}
	public void setScheduleProgramId(int scheduleProgramId) {
		ScheduleProgramId = scheduleProgramId;
	}
	@Override
	public String toString() {
		return "Rollno =  " + rollno + " , Email-id =  " + emailid
				+ " ,  Applicationid =  " + applicationid + " ,  Schedule Program Id =  "
				+ ScheduleProgramId ;
	}
}
