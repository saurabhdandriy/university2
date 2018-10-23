package com.uas.bean;

public class UniversityBean {


	
	private int ScheduleProgramId;
	private String ProgramName;
	private String Location;
	private String StartDate;
	private String EndDate;
	private int  SessionsPerWeek;
	
	
	
	public int getSessionsPerWeek() {
		return SessionsPerWeek;
	}
	public void setSessionsPerWeek(int sessionsPerWeek) {
		SessionsPerWeek = sessionsPerWeek;
	}
	public UniversityBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UniversityBean(int scheduleProgramId, String programName,
			String location, String startDate, String endDate,
			int sessionsPerWeek) {
		super();
		ScheduleProgramId = scheduleProgramId;
		ProgramName = programName;
		Location = location;
		StartDate = startDate;
		EndDate = endDate;
		SessionsPerWeek = sessionsPerWeek;
	}
	public int getScheduleProgramId() {
		return ScheduleProgramId;
	}
	public void setScheduleProgramId(int scheduleProgramId) {
		ScheduleProgramId = scheduleProgramId;
	}
	public String getProgramName() {
		return ProgramName;
	}
	public void setProgramName(String programName) {
		ProgramName = programName;
	}
	public String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		Location = location;
	}
	public String getStartDate() {
		return StartDate;
	}
	public void setStartDate(String startDate) {
		StartDate = startDate;
	}
	public String getEndDate() {
		return EndDate;
	}
	public void setEndDate(String endDate) {
		EndDate = endDate;
	}
	
	@Override
	public String toString() {
		return "ScheduleProgramId  =  " + ScheduleProgramId
				+ ", ProgramName  =  " + ProgramName + ", Location  =  " + Location
				+ ", StartDate  =  " + StartDate + ", EndDate  =  " + EndDate
				+ ", SessionsPerWeek  =  " + SessionsPerWeek;
	}
	
}
