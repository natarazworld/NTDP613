//ChocoChipsDecorator .java (ConcreteDecorator)
package com.nt.decorator;

import com.nt.comp.Icecream;

public class ChocoChipsDecorator extends IcecreamDecorator {

	public ChocoChipsDecorator(Icecream icecream) {
		super(icecream);
	}
	@Override
	public void prepare() {
		super.prepare();
		addChocoChips();
	}
	
	public void  addChocoChips() {
		 System.out.println("adding Chocochips");
	}
	

}
