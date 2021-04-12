//PetrolEngine.java (Dependent class)
package com.nt.comp;

public final class PetrolEngine implements IEngine {
   
   public PetrolEngine() {
	System.out.println("PetrolEngine:: 0-param constructor");
    }
   
	
	@Override
	public void start() {
		System.out.println("PetrolEngine is started");
	}

	@Override
	public void stop() {
		System.out.println("PetrolEngine is stopped");
	}

}
