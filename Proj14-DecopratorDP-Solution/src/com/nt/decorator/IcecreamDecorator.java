//IcecreamDecorator.java (AbstractDecorator)
package com.nt.decorator;

import com.nt.comp.Icecream;

public abstract class IcecreamDecorator implements Icecream {
    private Icecream icecream;  //Composition (HAS-A property)
    
    public IcecreamDecorator(Icecream icecream) {
		 this.icecream=icecream;
	}
    
	@Override
	public void prepare() {
		 icecream.prepare();
	}

}
