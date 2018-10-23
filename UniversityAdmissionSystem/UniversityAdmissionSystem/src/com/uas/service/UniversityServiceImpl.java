package com.uas.service;
import java.sql.SQLException;
import java.util.ArrayList;

import com.uas.bean.ParticipantBean;
import com.uas.bean.ProgramBean;
import com.uas.bean.UniversityBean;
import com.uas.dao.IUniversityDAO;
import com.uas.dao.UniversityDAOImpl;

public class UniversityServiceImpl implements IUniversityService {
	IUniversityDAO uda=null;

	public boolean validateName(String pName) {
		if(pName.matches("[A-Z]{1}[a-z]{1,}"))
		{
			return true;
		}
		else
		{
		return false;
		}
	}

	public boolean validateLocation(String location) {
		if(location.matches("[a-z]"))
		{
		return true;
		}
		else
		{
		return false;
		}
	}

	public boolean validateStartDate(String date1) {
		if(date1.matches("^[0-3]?[0-9]/[0-3]?[0-9]/(?:[0-9]{2})?[0-9]{2}$"))
		{
		return true;
		}
		else
		{
		return false;
		}
	}

	public boolean validateEndDate(String date2) {
		if(date2.matches("^[0-3]?[0-9]/[0-3]?[0-9]/(?:[0-9]{2})?[0-9]{2}$"))
		{
		return true;
		}
		else
		{
		return false;
		}
	}
	
	
	public int addProgramScheduledDetails(UniversityBean ub)
			throws SQLException {
		uda=new UniversityDAOImpl();

	    int sid= 0;
	
		sid = uda.addProgramScheduledDetails(ub);
	
	    return sid;
	}

	public UniversityBean getProgramDetailsById(int pid) throws SQLException {
		uda=new UniversityDAOImpl();

		return uda.getProgramDetailsById(pid);
	}

	public ArrayList<UniversityBean> getDetails() throws SQLException {
		uda = new UniversityDAOImpl();
		return uda.getDetails();
	}

	public void deleteProgram(int did) throws SQLException {
		uda = new UniversityDAOImpl();
		 uda.deleteProgram(did);
		
	}

	public ArrayList<ParticipantBean> getParticipantDetails()
			throws SQLException {
		uda = new UniversityDAOImpl();
		return uda.getParticipantDetails();
	}


	public int addProgramdDetails(ProgramBean pb) throws SQLException {
		uda = new UniversityDAOImpl();
		return uda.addProgramDetails(pb);
	}
	

	public ProgramBean getProgramDetails(String pname) throws SQLException {
		uda = new UniversityDAOImpl();
		return uda.getProgramDetails(pname);
	}


	public ArrayList<ProgramBean> getAllProgramDetails() throws SQLException {
		uda = new UniversityDAOImpl();
		return uda.getAllProgramDetails();
	}

	public void deleteprogramDetails(String proName) throws SQLException {
		uda = new UniversityDAOImpl();
		uda.deleteprogramDetails(proName);
		
	}




	
}
