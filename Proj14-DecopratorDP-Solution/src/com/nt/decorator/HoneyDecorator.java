//HoneyDecorator .java (ConcreteDecorator)
package com.nt.decorator;

import com.nt.comp.Icecream;

public class HoneyDecorator extends IcecreamDecorator {

	public HoneyDecorator(Icecream icecream) {
		super(icecream);
	}
	@Override
	public void prepare() {
		super.prepare();
		addHoney();
	}
	
	public void  addHoney() {
		 System.out.println("adding Honey");
	}
	

}
