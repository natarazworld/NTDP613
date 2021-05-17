package com.nt.delegate;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.NamingException;

import com.nt.bo.FinanceEmployeeBO;
import com.nt.bo.HREmployeeBO;
import com.nt.dao.FinanceEmployeeDAOImpl;
import com.nt.dao.HREmployeeDAOImpl;
import com.nt.dao.IEmployeeDAO;
import com.nt.exception.InternalProblemException;
import com.nt.factory.ConnectionFactory;
import com.nt.vo.EmployeeVO;

public class EmployeeMgmtBusinessDelegateImpl implements IEmployeeMgmtBusinessDelegate {
	private  IEmployeeDAO  hrDAO,finanaceDAO;

	public EmployeeMgmtBusinessDelegateImpl() {
    	 hrDAO=new HREmployeeDAOImpl();
    	 finanaceDAO=new FinanceEmployeeDAOImpl();
	}	

	@Override
	public String registerEmployee(EmployeeVO vo) throws InternalProblemException {
       //convert   EmpoyeeVO class object into  HREmployeeBO , FinanceEmployeeBO class objects  (### usecase1)
		 HREmployeeBO  ebo=new HREmployeeBO();
		 ebo.setEname(vo.getEname());
		 ebo.setDesg(vo.getDesg());
		 ebo.setAddrs(vo.getAddrs());
		 
		 FinanceEmployeeBO  fbo=new FinanceEmployeeBO();
		 fbo.setEname(vo.getEname());
		 fbo.setAddrs(vo.getAddrs());
		 fbo.setSalary(Double.parseDouble(vo.getSalary()));  //convertion
		 boolean flag=false;
		 Connection con=null;
		 String resultMsg=null;
		 try {
		 //get pooled  JDBC con object
		con=ConnectionFactory.getPooledConnection();  //(##UseCase3)
		 //begin Tx 
		 con.setAutoCommit(false);  //(##UseCase3)

		 //invoke the methods of both  DAO classes
		 int result1=finanaceDAO.insert(fbo, con);
		 int result2=hrDAO.insert(ebo, con);
		  if(result1==1 && result2==1)
			  flag=true;
		  else
			  flag=false;
		 }//try
		 catch(SQLException se) {
			 flag=false;
			   if(se.getErrorCode()==1)
				   throw new InternalProblemException(" Duplicated Employee number is not allowed");  //#UseCase2
			   else if(se.getErrorCode()==1400)
				   throw new InternalProblemException(" NULL Employee number is not allowed"); //# UseCase2
			   else if(se.getErrorCode()==12899)
				   throw new InternalProblemException(" Can not insert more than column size Data"); //#UseCase2
			   else
				   throw new InternalProblemException(" Some  DB Problem occurred"); //#UseCase2
		 }
		 catch(NamingException ne) {
			 flag=false;
			   throw new InternalProblemException(" DataSource related Jndi Problem");  //#UseCase2
		 }
		 catch(Exception e) {
			 flag=false;
			 throw new InternalProblemException(" unknown  Problem is raised");  //#UseCase2
		 }
		 finally {
			 //perform  Transaction Management  (##UseCase3)
			 try {
			    if(flag) {
			    	 con.commit(); //  (##UseCase3)
			    	 resultMsg="Employee Registration successfull--- (Transaction is committed)";
			    }
			    else {
			    	 con.rollback();  //(##UseCase3)
			    	 resultMsg="Employee Registration failed--- (Transaction is rolledb back)";
			    }
			 }//try
			 catch(SQLException se) {
				 se.printStackTrace();
			 }
			    
			    //close  connection (returning  JDBC con object back to  JDBC con pool)
			 try {
				 ConnectionFactory.closeConnection(con);
			 }
			 catch(SQLException se) {
				 se.printStackTrace();
			 }
			    
		 }//finally
		 
		return resultMsg;
	}//method
}//class
