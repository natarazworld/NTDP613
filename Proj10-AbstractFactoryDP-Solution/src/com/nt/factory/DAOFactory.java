//DAOFactory.java
package com.nt.factory;

import com.nt.dao.DAO;

public interface DAOFactory {
	public   DAO  createDAO(String type);
}
