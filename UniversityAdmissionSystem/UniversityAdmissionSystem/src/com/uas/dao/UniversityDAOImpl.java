package com.uas.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.uas.bean.ParticipantBean;
import com.uas.bean.ProgramBean;
import com.uas.bean.UniversityBean;
import com.uas.dbutil.DBConnect;
import com.uas.dbutil.IQueryMapper;

public class UniversityDAOImpl implements IUniversityDAO{

	public int addProgramScheduledDetails(UniversityBean ub)
			throws SQLException {
		int sid=0;
		
		Connection conn = com.uas.dbutil.DBConnect.getConnected();
		PreparedStatement pst = conn.prepareStatement(com.uas.dbutil.IQueryMapper.SCHEDULE_DETAILS);
		
		pst.setString(1, ub.getProgramName());
		pst.setString(2,ub.getLocation());
		pst.setString(3,ub.getStartDate());
		pst.setString(4,ub.getEndDate());
		pst.setInt(5, ub.getSessionsPerWeek());
		
        int status = pst.executeUpdate();
        
		if(status==1){
			pst = conn.prepareStatement(com.uas.dbutil.IQueryMapper.PROGRAM_SEQ_CURR_ID);
			ResultSet rs = pst.executeQuery();

			if (rs.next()) {
				sid = rs.getInt(1);
				}
		}return sid;
	}

	public UniversityBean getProgramDetailsById(int pid) throws SQLException {
		UniversityBean ub = null;
		
		Connection conn = com.uas.dbutil.DBConnect.getConnected();
		PreparedStatement pst = conn.prepareStatement(IQueryMapper.RETRIEVE_BY_ID);
		
		pst.setInt(1, pid);
		ResultSet rs = pst.executeQuery();
		
		if(rs.next()){
			 ub = new UniversityBean();
		  ub.setScheduleProgramId(rs.getInt(1));
		  ub.setProgramName(rs.getString(2));
		  ub.setLocation(rs.getString(3));
		  ub.setStartDate(rs.getString(4));
		  ub.setEndDate(rs.getString(5));
		  ub.setSessionsPerWeek(rs.getInt(6));
		 
		}
		 
		return ub;
	}

	public ArrayList<UniversityBean> getDetails() throws SQLException {
		ArrayList<UniversityBean> list = new ArrayList<UniversityBean>();
		Connection conn = null;
		
		conn = DBConnect.getConnected();
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery(IQueryMapper.RETRIEVE_ALL);
		UniversityBean ub = null;
		while(rs.next()){
			ub = new UniversityBean();
			 ub.setScheduleProgramId(rs.getInt(1));
			  ub.setProgramName(rs.getString(2));
			  ub.setLocation(rs.getString(3));
			  ub.setStartDate(rs.getString(4));
			  ub.setEndDate(rs.getString(5));
			  ub.setSessionsPerWeek(rs.getInt(6));
           list.add(ub);
		}
		
		
		return list;
	}

	public void deleteProgram(int did) throws SQLException {
		Connection conn = null;
		
		conn = DBConnect.getConnected();
		PreparedStatement pst = conn.prepareStatement(IQueryMapper.DELETE_PROGRAM);
		pst.setInt(1, did);
		int rs = pst.executeUpdate();
		if(rs==1){
			System.out.println("record deleted");
		}
		else{
			System.out.println("not deleted");
		}		
	}

	public ArrayList<ParticipantBean> getParticipantDetails()
			throws SQLException {
		ArrayList<ParticipantBean> list1 = new ArrayList<ParticipantBean>();
		Connection conn = null;
		
		conn = DBConnect.getConnected();
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery(IQueryMapper.RETRIEVE_ALL1);
		ParticipantBean pb = null;
		while(rs.next()){
			pb = new ParticipantBean();
			
			 pb.setRollno(rs.getInt(1));
			 pb.setEmailid(rs.getString(2));
			 pb.setApplicationid(rs.getInt(3));
			 pb.setScheduleProgramId(rs.getInt(4));
			 
           list1.add(pb);
		}
		
		
		return list1;
	}
	public int addProgramDetails(ProgramBean pb) throws SQLException {

		
		String proname=null;
		Connection conn = com.uas.dbutil.DBConnect.getConnected();
		PreparedStatement pst = conn.prepareStatement(com.uas.dbutil.IQueryMapper.PROGRAM_DETAILS);
		pst.setString(1, pb.getProgramName());
		pst.setString(2, pb.getDescription());
		pst.setString(3, pb.getEligibility());
		pst.setInt(4, pb.getDureation());
		pst.setString(5, pb.getCertificateOffered());
		int status = pst.executeUpdate();
		return status;
	}
	public ProgramBean getProgramDetails(String pname) throws SQLException {
		
		
		ProgramBean pb = null;
		Connection conn = com.uas.dbutil.DBConnect.getConnected();
		PreparedStatement pst = conn.prepareStatement(IQueryMapper.RETRIEVE_BY_PROGNAME);
		pst.setString(1, pname);
		ResultSet rs = pst.executeQuery();
		if(rs.next())
		{
			pb= new ProgramBean();
			pb.setProgramName(rs.getString(1));
			pb.setDescription(rs.getString(2));
			pb.setEligibility(rs.getString(3));
			pb.setDureation(rs.getInt(4));
			pb.setCertificateOffered(rs.getString(5));
		}
		return pb;
	}

	public ArrayList<ProgramBean> getAllProgramDetails() throws SQLException {
	
		
		ArrayList<ProgramBean> list = new ArrayList<ProgramBean>();
		Connection conn= null;
		conn = DBConnect.getConnected();
		Statement st = conn.createStatement();
		ResultSet rs =st.executeQuery(IQueryMapper.RETRIEVE_ALL_PROGRAMS);
		while(rs.next())
		{
			ProgramBean pb = new ProgramBean();
			pb.setProgramName(rs.getString(1));
			pb.setDescription(rs.getString(2));
			pb.setEligibility(rs.getString(3));
			pb.setDureation(rs.getInt(4));
			pb.setCertificateOffered(rs.getString(5));
			list.add(pb);
		}
		return list;
	}

	public void deleteprogramDetails(String proName) throws SQLException {
		
		Connection conn = DBConnect.getConnected();
		PreparedStatement pst = conn.prepareStatement(IQueryMapper.DELETE_PROGRAM_PRONAME);
		pst.setString(1, proName);
		int rs = pst.executeUpdate();
		if(rs==1)
		{
			System.out.println("One program details deleted");
		}
		else
		{
			System.err.println("error occured not deleted");
		}
		
		
		
	}

	
	
	
}

