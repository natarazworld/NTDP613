package com.nt.test;

import com.nt.comp.IShape;
import com.nt.factory.ShapeFactory;

public class FlyWeightSolutionTest1 {

	public static void main(String[] args) {
		  Integer i1=Integer.valueOf(10);
		  Integer i2=Integer.valueOf(10);
		  Integer i3=Integer.valueOf(10);
		  Integer i4=Integer.valueOf(220);
		  System.out.println(i1.hashCode()+"  "+i2.hashCode()+"   "+i3.hashCode()+"  "+i4.hashCode());
		  

	}
}
