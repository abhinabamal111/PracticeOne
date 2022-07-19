package dayThree;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Persist {
	
	public static void main(String args[]){    
		  try{    
		  //Creating the object    
		  Student s1 =new Student(211,"ravi");    
		  //Creating stream and writing the object    
		  FileOutputStream fout=new FileOutputStream("C:\\Users\\ABHMAL\\Documents\\f.txt");    
		  ObjectOutputStream out=new ObjectOutputStream(fout); 
		  System.out.println(s1.toString());
		  out.writeObject(s1);    
		  out.flush();    
		  //closing the stream    
		  out.close();    
		  System.out.println("success");    
		  }catch(Exception e){System.out.println(e);}    
		 } 

}
