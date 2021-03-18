//SingletonTest3_Serialization.java
package com.nt.test3;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.nt.sdp.Printer3;

public class SingletonTest3_Serialization {
   public static void main(String[] args) {
	  try {
		  //get Singleton java class object
		  Printer3 p1=Printer3.getInstance();
		  //write object data to file using  ObjectInputStream support (Serialization process)
		   ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("printer_data.ser"));
		   oos.writeObject(p1);
		   oos.flush();  //writes data from buffer to destination
		   oos.close();
		   System.out.println("SErialization is done");
	  }
	  catch(IOException ioe) {
		  ioe.printStackTrace();
	  }
	  catch(Exception e) {
		  e.printStackTrace();
	  }
  }//main
}//class
