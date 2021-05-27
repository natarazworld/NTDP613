package com.nt.controller;

import java.io.IOException;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nt.command.ICommand;
import com.nt.dispatcher.Dispatcher;
import com.nt.helper.CommandMapper;


@WebServlet("*.do")
public class FrontActionGuardServlet extends HttpServlet {
	
	
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	    try {
		//read incoming request uri
		String reqUri=req.getServletPath();  //gives  only last part of  incoming request uri
		//get Command class from Command Mapper  (Action mgmt)
		ICommand cmd=CommandMapper.mapRequestToCommand(reqUri, req);
		//invoke standard method on  Command class obj  (navigation mgmt)
		String  lvn=cmd.execute(req, res);
		//use Dispather to get Physical view name and to forward the controller to physical view
		Dispatcher.dispatchToView(req, res, lvn);  //(view Managerment)
	    }//try
	    catch(Exception e) {
	    	e.printStackTrace();
	    	RequestDispatcher rd=req.getRequestDispatcher("/error.jsp");
	    	rd.forward(req,res);
	    }
		
	}//doGet(-,-)

	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doGet(req, res);
	}

}
