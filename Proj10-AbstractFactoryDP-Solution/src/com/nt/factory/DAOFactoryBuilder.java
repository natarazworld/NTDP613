//DAOFactoryBuilder.java
package com.nt.factory;

//class  acting AbstractFactory /Factory on factories/super factory
public class DAOFactoryBuilder {
	
	// Abstract factory logic ::  method returning one of factories object
	public  static  DAOFactory  buildDAOFactory(String storeType) {
		  if(storeType.equalsIgnoreCase("DB"))
			  return new DBDAOFactory();
		  else if(storeType.equalsIgnoreCase("EXCEL"))
			  return  new ExcelDAOFactory();
		  else
			  throw new IllegalArgumentException("Invalid Store Type");
	}

}
