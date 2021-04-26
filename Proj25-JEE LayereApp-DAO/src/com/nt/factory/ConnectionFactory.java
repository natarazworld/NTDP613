package com.nt.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	public static  Connection  makeConenction(String url,String user,String pwd)throws Exception {
		Connection con=null;
		try {
			 con=DriverManager.getConnection(url,user,pwd);
		}
		catch(SQLException se) {
            se.printStackTrace();
            throw se;
		}
		catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
		
		return con;
	}//method

}//calss
