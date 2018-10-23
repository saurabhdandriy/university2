package com.uas.ui;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import com.capgemini.bean.HotelBean;
import com.capgemini.exception.HotelBookingException;
import com.uas.bean.ParticipantBean;
import com.uas.bean.ProgramBean;
import com.uas.bean.UniversityBean;
import com.uas.service.IUniversityService;
import com.uas.service.UniversityServiceImpl;

public class Admin {
	 static Scanner scn = new Scanner(System.in);
	 static IUniversityService ser = null;
	public static void main(String[] args) throws SQLException {
		
		int i=0;
	do{
		i++;
	
		System.out.println("--------------UNIVERSITY ADMISSION SYSTEM------------------");
		System.out.println("1.PROGRAM OFFERED TABLE ");
		System.out.println("2.PROGRAM SCHEDULED TABLE ");
		System.out.println("3.VIEW PARTICIPANT LIST");
		System.out.println("4.Exit");
		int choice1=scn.nextInt();
	switch(choice1)
	{
	case 1:
					System.out.println("--------------PROGRAM OFFERED TABLE------------------");
					System.out.println("1.ADD PROGRAM ");
			   	    System.out.println("2.RETRIVE PROGRAM BY SCHEDULED ID");
			   	    System.out.println("3.VIEW ALL SCHEDULED PROGRAMS");
			   	    System.out.println("4.UPDATE SCHEDULED PROGRAM BY SCHEDULED ID");
			   	    System.out.println("5.DELETE PROGRAM BY SCHEDULED ID");
			   	    System.out.println("6.EXIT ");
			   	    int choice2 = scn.nextInt();
			   	    switch(choice2)
			   	    {
			   	    case 1:
			   	    
			   	    	ProgramBean pb = new ProgramBean();
			   	    	ser = new UniversityServiceImpl();
			   	    	String pName=null;
			   	    	//do
			   	    	//{
			   	    		System.out.println("Enter the name of the program");
			   	    		pName=scn.next();
			   	    		if(ser.validateName(pName))
			   	    		{
			   	    			pb.setProgramName(pName);
			   	    		}
			   	    		else
			   	    		{
			   	    			System.err.println("Enter the correct program name");
			   	    		}
			   	    		
			   	    		
			   	    	//}//while(!ser.validateName(pName));
			   	    	String description=null;
			   	    	System.out.println("Enter the description about the program");
			   	    	description=scn.next();
			   	    	pb.setDescription(description);
			   	    	String eligibility=null;
			   	    	System.out.println("Enter the eligibility ");
			   	    	pb.setEligibility(eligibility);
			   	    	eligibility=scn.next();
			   	    	int duration=0;
			   	    	System.out.println("Enter the duration of the program(In Years) ");
			   	    	duration = scn.nextInt();
			   	    	pb.setEligibility(eligibility);
			   	    	String certificate=null;
			   	    	System.out.println("Enter the degree certificates offered");
			   	    	certificate= scn.next();
			   	    	pb.setCertificateOffered(certificate);
			   	    	int progName= addProgramDetails(pb);
			   	    	System.out.println("The program details added for the program"+progName);
			   	    	break;
			   	    
			   	    case 2:
			   	    	System.out.println("Enter the Program Name");
			   	    	String pname= scn.next();
			   	    	pb= new ProgramBean();
			   	    	pb = getProgramDetails(pname);
			   	    	System.out.println(pb);
			   	    break;
			   	    
			   	    case 3:
			   	    	
			   	    	
			   	    	ArrayList<ProgramBean> progList= getAllProgramDetails();
			   	    	for(ProgramBean prb: progList)
			   	    	{
			   	    		System.out.println(prb);
			   	    	}
			   	    
			   	    break;
			   	    
			   	    case 4:
			   	    	
			   	    	
			   	    break;
			   	    
			   	    
			   	    case 5:
			   	    	System.out.println("Enter the program name");
			   	    	String proName=scn.next();
			   	    	deleteProgramDetails(proName);
			   	    	
			   	    break;
			   	    
			   	    case 6:
			   	    
			   	    
			   	    
			   	    break;
			   	    }
			   	    
					break;
	case 2:
					System.out.println("--------------PROGRAM SCHEDULED TABLE------------------");
					System.out.println("1.ADD SCHEDULE ");
			   	    System.out.println("2.RETRIVE PROGRAM BY SCHEDULED ID");
			   	    System.out.println("3.VIEW ALL SCHEDULED PROGRAMS");
			   	    System.out.println("4.UPDATE SCHEDULED PROGRAM BY SCHEDULED ID");
			   	    System.out.println("5.DELETE PROGRAM BY SCHEDULED ID");
			   	    System.out.println("6.EXIT ");
			        int choice3 = scn.nextInt();
			        switch(choice3){
		        	case 1:
		        		UniversityBean ub = new UniversityBean();
		        		ser= new UniversityServiceImpl();
		            	String pName=null;
		            	do{
		           	    System.out.println("Enter Your Program Name");
		           	    pName = scn.next();
		           	   if(ser.validateName(pName))
		           	    {	   
		           		   ub.setProgramName(pName);
		           		 break;
		           	    }
		           	    else
		           	    {
		           	    	System.err.println("Invlaid user name..User name first letter must be capital");
		           	    }
		            	}while(!ser.validateName(pName));
		            	String location=null;
		            	do{
		           	   System.out.println("Enter Location");
		           	   location = scn.next();
		           	   if(ser.validateLocation(location))
		           	   {
		               	   ub.setLocation(location);
		             		 break;


		           	   }
		           	   else
		           	   {
		           		   System.err.println("Invalid location");
		           	   }
		            	}while(!ser.validateLocation(location));
		            	String date1=null;
		            	do{
		           	   System.out.println("Enter Start Date");
		           	   date1 = scn.next();
		           	   if(ser.validateStartDate(date1))
		           	   {
		               	   ub.setStartDate(date1);
		             		 break;

		           	   }
		           	   else
		           	   {
		           	   System.err.println("Enter the date in the correct format as specified");
		           	   }
		            	}while(!ser.validateStartDate(date1));
		           	   String date2=null;
		           	   do{
		           	   System.out.println("Enter End Date");
		        	   date2 = scn.next();
		        	   if(ser.validateEndDate(date2))
		        	   {
		               	   ub.setEndDate(date2);
		             		 break;
		        	   }
		        	   else
		        	   {
		        		   System.err.println("Enter the date in the correct formar as specified");
		        	   }
		           	   }while(!ser.validateStartDate(date1));
		           	   System.out.println("Enter No of Sessions Per week");
		           	   int sessions = scn.nextInt();
		               ub.setSessionsPerWeek(sessions);
		               
		               
		           	   int sid=0;
		           	   sid = addProgramScheduledDetails(ub);
		           	   System.out.println("Program Information stored successfully for program Scheduled  id:"+sid);
					 break;
		        	case 2:
	        	
		        	 System.out.println("Enter Program Scheduled id");
		        	 int pid = scn.nextInt();
		        	
		        	 ub = new UniversityBean();
		        	 ub = getProgramDetailsById(pid);
		        	 System.out.println(ub);
	        	
		        	 break;
		        	case 3:
	        	
		        	ArrayList<UniversityBean> List=getDetails();
		        	
		    		for(UniversityBean e:List)
		    			{
		    			System.out.println(e);
		    			}
		        	break;
		        	case 4:
		        		break;
		        	case 5:
		        	System.out.println("enter the id");
					int did = scn.nextInt();
					deleteProgram(did);
		        	break;
		        	case 6:
		        		 System.exit(0);
		        		 break;
		        	default:
		        		 System.out.println("Invalid case");
		        			 
		        	}
	break;
	case 3:
			
			
				ArrayList<ParticipantBean> pList=getParticipantDetails();
	        	
	    		for(ParticipantBean e:pList)
	    			{
	    			System.out.println(e);
	    			}
	    		break;
		
	case 4:
				System.exit(0);
				break;
	default:
		 System.out.println("Invalid case");
			
		}
	
	}while(i<=3);
	}
      
	private static void deleteProgramDetails(String proName) throws SQLException {
		ser = new UniversityServiceImpl();
		ser.deleteprogramDetails(proName);
	}

	private static ArrayList<ProgramBean> getAllProgramDetails() throws SQLException {
		ser= new UniversityServiceImpl();
		return ser.getAllProgramDetails();
	}

	private static ProgramBean getProgramDetails(String pname) throws SQLException {
		ser = new UniversityServiceImpl();
		return ser.getProgramDetails(pname);
	}

	private static int addProgramDetails(ProgramBean pb) throws SQLException {
		ser = new UniversityServiceImpl();
		return ser.addProgramdDetails(pb);
	}

	
	private static ProgramBean updateProgramDetails(ProgramBean pb) throws SQLException {
		ser = new UniversityServiceImpl();
		return null;
	
	}
	
	

	private void modify() throws SQLException 
	{
		ArrayList<ProgramBean> ProgramList = new ArrayList<ProgramBean>();
		Scanner scanner = new Scanner(System.in);
		Scanner scanner1 = new Scanner(System.in);
		System.out.println("Enter hotel id to update");
		int hotelId = scanner.nextInt();

		Object service;
		ProgramList = service.viewProgram(ProgramId);
		if (ProgramList.isEmpty()) {
			//logger.error("No records found to update");
			System.err.println("No records found to update");
			return;
		}

		for (ProgramBean hotelBean1 : ProgramList) {
			
		}
		System.out.println("Update program name");
		String progName = scanner1.nextLine();
		System.out.println("Update description");
		String description = scanner1.nextLine();
		System.out.println("Update eligibility");
		String eligibility = scanner1.nextLine();
		System.out.println("Update duration");
		String duration = scanner1.nextLine();
		System.out.println("Update degree_certificate offered");
		String certificateOffered = scanner1.nextLine();
		
		
		
		
		ProgramBean ProgramBean = new ProgramBean();
		int hotelUpdateStatus = service.modify(ProgramBean);
		if (hotelUpdateStatus == 1) {
			//logger.info("Hotel Id " + hotelBean.getHotelId()+ " updated successfully");
			System.out.println("program name " + ProgramBean.getProgramName()
					+ " updated successfully");
		} else {
			System.err.println("program name"
					+ "" + ProgramBean.getProgramName()
					+ " is not updated");
		}

	}
	
	
	
	
	
	private static ArrayList<ParticipantBean> getParticipantDetails() throws SQLException {
		ser = new UniversityServiceImpl();
		return ser.getParticipantDetails();
	}
	private static void deleteProgram(int did) throws SQLException {
		ser = new UniversityServiceImpl();
		ser.deleteProgram(did);
		
	}
	private static ArrayList<UniversityBean> getDetails() throws SQLException {
		ser = new UniversityServiceImpl();
		return ser.getDetails();
	}
	private static int addProgramScheduledDetails(UniversityBean ub) throws SQLException {
		ser = new UniversityServiceImpl();
		return ser.addProgramScheduledDetails(ub);
		
	}
	
	private static UniversityBean getProgramDetailsById(int pid) throws SQLException {
		ser = new UniversityServiceImpl();
		return ser.getProgramDetailsById(pid);
	}

	}
