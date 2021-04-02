//House.java (product --Complext obj)
package com.nt.product;

public class House {
	private IBasement basement;
	private IStructure  structure;
	private  IRoof roof;
	private IInterior interior;
	
	///altl +shift+s,r
	public void setBasement(IBasement basement) {
		this.basement = basement;
	}
	public void setStructure(IStructure structure) {
		this.structure = structure;
	}
	public void setRoof(IRoof roof) {
		this.roof = roof;
	}
	public void setInterior(IInterior interior) {
		this.interior = interior;
	}
	
	//alt+shit+s,s
	@Override
	public String toString() {
		return "House [basement=" + basement + ", structure=" + structure + ", roof=" + roof + ", interior=" + interior
				+ "]";
	}

}
