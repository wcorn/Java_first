//package ch05_codes;
//
////Student.java
//public class Student {
//	public int classYear;
//	private String grade;
//	//public String grade;
//}



//package ch05_codes;
//public class Student 
//{ 
//	private String name; 
//	private int age; 
//
//	public void setName(String studentName) { 
//	 	name = studentName; 
//	} 
//	public void setAge(int studentAge) { 
//		age = studentAge; 
//	} 
//
//	public String getName() { 
//		return name; 
//	} 
//	public int getAge() { 
//		return age; 
//	} 
//} 


//// Example of auto generation of getter/setter methods
package ch05_codes;
public class Student 
{ 
	private String name; 
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
} 
