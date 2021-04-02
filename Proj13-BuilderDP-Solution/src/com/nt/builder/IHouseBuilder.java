//IHouseBuilder.java (Builder Interface)
package com.nt.builder;

import com.nt.product.House;

public interface IHouseBuilder {
   public void  constructRoof();
   public void  constructBasement();
   public void  constructStructor();
   public void  constructInterior();
   public House  getHouse();
}
