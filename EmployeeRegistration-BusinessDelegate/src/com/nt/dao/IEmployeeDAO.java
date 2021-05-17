package com.nt.dao;

import java.sql.Connection;
import java.sql.SQLException;

import com.nt.bo.EmployeeBO;

public interface IEmployeeDAO {
    public  int  insert(EmployeeBO bo,Connection con)throws SQLException;
}
