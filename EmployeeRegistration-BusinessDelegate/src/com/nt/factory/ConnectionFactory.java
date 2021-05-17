package com.nt.factory;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ResourceBundle;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class ConnectionFactory {

	
	public  static  Connection getPooledConnection()throws SQLException,NamingException {
		// create ResourceBundle class object
		ResourceBundle bundle=ResourceBundle.getBundle("com/nt/commons/jdbc");
		//get value from properties file by giving key
		String jndi=bundle.getString("ds.jndi.name");
		//create InitialContext object
		InitialContext ic=new  InitialContext();
		// get DataSource object from  Jndi registry through Jndi  lookup operation
		DataSource ds=(DataSource)ic.lookup(jndi);
		//get Pooled  JDBC connection using DataSoruce object
		Connection  con=ds.getConnection();
		return con;
	}
	
	public static  void  closeConnection(Connection con)throws SQLException {
		con.close();
	}
	
}
