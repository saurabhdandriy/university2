package com.uas.dbutil;

public interface IQueryMapper {
	
	public static final String SCHEDULE_DETAILS ="INSERT INTO Programs_Scheduled VALUES(Scheduled_ID_SEQ.NEXTVAL,?,?,?,?,?)";
	public static final	String PROGRAM_SEQ_CURR_ID="SELECT Scheduled_ID_SEQ.CURRVAL FROM dual";
	public static final String RETRIEVE_BY_ID ="SELECT * FROM Programs_Scheduled WHERE Schedule_Program_Id =?";
	public static final String RETRIEVE_ALL ="SELECT * FROM Programs_Scheduled";
	public static final String DELETE_PROGRAM ="DELETE FROM Programs_Scheduled WHERE Schedule_Program_Id=?";
	
	public static final String RETRIEVE_ALL1 ="SELECT * FROM Participant";
	
	public static final String PROGRAM_DETAILS = "INSERT INTO PROGRAMS_OFFERED VALUES(?,?,?,?,?)";
	public static final String RETRIEVE_BY_PROGNAME ="SELECT * FROM PROGRAMS_OFFERED WHERE PROGRAM_NAME =?";
	public static final String DELETE_PROGRAM_PRONAME ="DELETE FROM PROGRAMS_OFFERED WHERE PROGRAM_NAME=?";
	public static final String RETRIEVE_ALL_PROGRAMS ="SELECT * FROM PROGRAMS_OFFERED";
	public static final String UPDATE_PROGRAM_PRONAME ="UPDATE PROGRAMS_OFFERED SET PROGRAM_NAME=? WHERE PROGRAM_NAME=?";
	
	

}
