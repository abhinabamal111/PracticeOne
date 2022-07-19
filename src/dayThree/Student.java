package dayThree;

import java.io.Serializable;

public class Student implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -5893772819757356905L;
	int id;  
	 String name;  
	 public Student(int id, String name) {  
	  this.id = id;  
	  this.name = name;  
	 }
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}  
	 
	 

}
