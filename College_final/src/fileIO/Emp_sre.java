package fileIO;

import java.io.*;

public class Emp_sre implements Serializable{
	private int id;
	private String name;
	private String department;
	private  double expLevel;
	public Emp_sre(int id, String name, String department, double expLevel)
	{
		this.id = id;
		this.name = name;
		this.department = department;
		this.expLevel = expLevel;
	}
	public int getId() {
		return id;
	} 
	public void setId(int id) {
		this.id = id;
	} 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	} 
	public String getDepartment() {
		return department;
	} 
	public void setDepartment(String department) {
		this.department = department;
	} 
	public double getExpLevel() {
		return expLevel;
	} 
	public void setExpLevel(double expLevel) {
		this.expLevel = expLevel;
	}
}
