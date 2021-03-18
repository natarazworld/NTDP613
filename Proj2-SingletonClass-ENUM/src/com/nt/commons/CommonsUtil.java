package com.nt.commons;

import java.io.Serializable;

public class CommonsUtil implements Cloneable,Serializable {

	   @Override
		public Object clone() throws CloneNotSupportedException {
			return super.clone();  //use clone() of  java.lang.Object class for cloning process.
		}
	
}
