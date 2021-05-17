package com.nt.delegate;

import com.nt.exception.InternalProblemException;
import com.nt.vo.EmployeeVO;

public interface IEmployeeMgmtBusinessDelegate {
	public    String registerEmployee(EmployeeVO vo)throws InternalProblemException;

}
