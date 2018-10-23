package com.uas.dao;

import java.sql.SQLException;
import java.util.ArrayList;

import com.uas.bean.ParticipantBean;
import com.uas.bean.ProgramBean;
import com.uas.bean.UniversityBean;

public interface IUniversityDAO {

	int addProgramScheduledDetails(UniversityBean ub) throws SQLException;

	UniversityBean getProgramDetailsById(int pid) throws SQLException;

	ArrayList<UniversityBean> getDetails() throws SQLException;

	void deleteProgram(int did) throws SQLException;

	ArrayList<ParticipantBean> getParticipantDetails() throws SQLException;

	int addProgramDetails(ProgramBean pb) throws SQLException;

	ProgramBean getProgramDetails(String pname) throws SQLException;

	ArrayList<ProgramBean> getAllProgramDetails() throws SQLException;

	void deleteprogramDetails(String proName) throws SQLException;

}
