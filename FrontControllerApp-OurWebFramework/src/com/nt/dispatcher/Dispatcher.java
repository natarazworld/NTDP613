package com.nt.dispatcher;

import java.util.ResourceBundle;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Dispatcher {
	private static ResourceBundle bundle;
	static {
		bundle=ResourceBundle.getBundle("com/nt/commons/config");
	}


	public  static  void  dispatchToView(HttpServletRequest req,HttpServletResponse res, String  lvn)throws Exception{
		 //get phyysical  view name based on lvn
		String pvn=bundle.getString(lvn);
		//forward  to physical view  using rd.forward(req,res)
		RequestDispatcher rd=req.getRequestDispatcher(pvn);
		rd.forward(req,res);
	}
	
}
