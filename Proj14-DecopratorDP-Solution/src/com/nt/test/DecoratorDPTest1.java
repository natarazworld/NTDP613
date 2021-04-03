package com.nt.test;

import com.nt.comp.Icecream;
import com.nt.comp.VanilaIcecream;
import com.nt.decorator.ChocoChipsDecorator;
import com.nt.decorator.DryFruitDecorator;
import com.nt.decorator.HoneyDecorator;

public class DecoratorDPTest1 {

	public static void main(String[] args) {
	     Icecream  ice1=new VanilaIcecream();
	     ice1.prepare();
	     System.out.println("-----------------------------");
	     Icecream ice2=new DryFruitDecorator(new DryFruitDecorator(new VanilaIcecream()));
	     ice2.prepare();
	     System.out.println("..................................");
	     Icecream ice3=new DryFruitDecorator(new HoneyDecorator(new VanilaIcecream()));
	     ice3.prepare();
	     System.out.println("..................................");
	     Icecream ice4=new DryFruitDecorator(new HoneyDecorator(new ChocoChipsDecorator(new VanilaIcecream())));
	     ice4.prepare();

	}

}
