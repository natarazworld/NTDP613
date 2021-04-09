package com.nt.factory;

import java.util.HashMap;
import java.util.Map;

import com.nt.comp.Circle;
import com.nt.comp.IShape;
import com.nt.comp.Square;

public class ShapeFactory {
	private static  Map<String,IShape> cacheMap=new HashMap();
	
	public static  IShape  getShape(String type) {
		  IShape shape=null;
		 if(!cacheMap.containsKey(type)) { 
		     if(type.equalsIgnoreCase("square"))
     			 shape=new Square();
	     	 else if(type.equalsIgnoreCase("circle"))
		     	 shape=new Circle();
		       else 
			      throw new IllegalArgumentException("Invalid Shape type");
		        // keep shape object in the cache
		       cacheMap.put(type,shape);
		 }
		 shape=cacheMap.get(type);
		 return  shape;
	}
}
