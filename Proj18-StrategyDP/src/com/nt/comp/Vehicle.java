//Vehicle.java (target class) 
package com.nt.comp;

public final class Vehicle {
  private IEngine  engg;  //HAS- A property (Composition)
  
  public Vehicle() {
	 System.out.println("Vehicle:: 0-param constructor");
}

public void setEngg(IEngine engg) {
	System.out.println("Vehicle.setEngg(-)");
	this.engg = engg;
}

 public void drive(String sourcePlace,String destPlace) {
	 System.out.println("Vehicle.drive()");
	 engg.start();
	 System.out.println("Vehicle:: Driving started at"+sourcePlace);
	 System.out.println("Vehicle:: Driving is go on ......");
	 engg.stop();
	 System.out.println("Vehicle:: Driving ended  at"+destPlace);
 }

  
  
  
}
