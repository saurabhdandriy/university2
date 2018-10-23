package com.uas.service;

import java.sql.SQLException;
import java.util.ArrayList;
import com.uas.bean.ParticipantBean;
import com.uas.bean.ProgramBean;
import com.uas.bean.UniversityBean;

public interface IUniversityService {

	int addProgramScheduledDetails(UniversityBean ub) throws SQLException;

	UniversityBean getProgramDetailsById(int pid) throws SQLException;

	
	ArrayList<UniversityBean> getDetails() throws SQLException;

	void deleteProgram(int did) throws SQLException;

	ArrayList<ParticipantBean> getParticipantDetails() throws SQLException;

	boolean validateName(String pName);

	boolean validateLocation(String location);

	boolean validateStartDate(String date1);

	boolean validateEndDate(String date2);

	ProgramBean getProgramDetails(String pname) throws SQLException;

	int addProgramdDetails(ProgramBean pb) throws SQLException;

	ArrayList<ProgramBean> getAllProgramDetails() throws SQLException;

	void deleteprogramDetails(String proName) throws SQLException;
	
	int modify(ProgramBean programBean) throws SQLException;

}
