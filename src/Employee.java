/*
 * Brendan Howell
 * CSC-151
 * Employee Class Project
 * This project creates a class that has the following fields
 * name, idNumber, department and position
 */
public class Employee {
	// instance variables
	private String name;
	private int idNumber;
	private String department;
	private String position;
	
	// constructor 1
	public Employee(String na, int id, String depart, String pos){
		name = na;
		idNumber = id;
		department = depart;
		position = pos;
	}  //  end constructor

	// constructor 2
	public Employee(String na, int id){
		name = na;
		idNumber = id;
		department = "";
		position = "";
	}  //  end constructor 2
	
	//  constructor3
	public Employee(){
		name = "";
		idNumber = 0;
		department = "";
		position = "";
	}  // end constructor 3
	
	// setters and getters
	public void setName(String na){
		name = na;
	}  //  End setName
	
	public String getName(){
		return name;
	}  // End getName
	
	public void setIdNumber(int id){
		idNumber = id;
	}  //  End setIdNumber
	
	public int getIdNumber(){
		return idNumber;
	}  // End getIdNumber
	
	public void setDepartment(String depart){
		department = depart;
	}  //  End setDepartment
	
	public String getDepartment(){
		return department;
	}  // End getDepartment
	
	public void setPosition(String pos){
		position = pos;
	}  //  End setPosition
	
	public String getPosition(){
		return position;
	}  // End getPosition
	
} //  End Class
