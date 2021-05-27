package com.nt.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface ICommand {
    public  String  execute(HttpServletRequest req, HttpServletResponse res)throws Exception;
}
