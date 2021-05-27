package com.nt.helper;

import java.util.ResourceBundle;

import javax.servlet.http.HttpServletRequest;

import com.nt.command.ICommand;

public class CommandMapper {
	private static ResourceBundle bundle;
	static {
		bundle=ResourceBundle.getBundle("com/nt/commons/config");
	}

	public  static ICommand  mapRequestToCommand(String reqUri, HttpServletRequest req)throws Exception{
		//  get Command class name from properites by giving incoming request uri
		String className=bundle.getString(reqUri);
		//Load and instantiate command class
		Class clazz=Class.forName(className);
		ICommand cmd=(ICommand)(clazz.getDeclaredConstructors()[0]).newInstance();
		return cmd;
	}
}
