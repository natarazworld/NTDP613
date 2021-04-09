package com.nt.factory;

import java.util.HashMap;
import java.util.Map;

import com.nt.comp.Circle;
import com.nt.comp.IShape;
import com.nt.comp.Square;

public class ShapeFactory {
	
	public static  IShape  getShape(String type) {
		
	   		  IShape shape=null;
		      if(type.equalsIgnoreCase("square"))
			 shape=new Square();
		 else if(type.equalsIgnoreCase("circle"))
			 shape=new Circle();
		 else 
			 throw new IllegalArgumentException("Invalid Shape type");
		      
		      
		 return  shape;
	}
}
