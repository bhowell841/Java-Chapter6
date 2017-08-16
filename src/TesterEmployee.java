/*
 * Brendan Howell
 * CSC-151
 * Employee Class Tester
 * This program tests that the employee class
 * and will create three Employee objects to hold 
 * data, and display it in the console.
 * 
 */
public class TesterEmployee {

	public static void main(String[] args) {
		System.out.println("Name" + "\t"+"\t" + "ID Number" + "\t" + "Department" + "\t" + "Position");
		System.out.println("_____________________________________________________________________");
		
		// create and instance of Employee
		Employee emp1 = new Employee("Susan Meyers", 47899, "Accounting", "Vice President");
		System.out.println(emp1.getName() + "\t" + emp1.getIdNumber() +"\t" + "\t" + emp1.getDepartment() +"\t"+ emp1.getPosition());

		// create another instance with different parameter
		Employee emp2 = new Employee("Mark Jones", 39119, "IT", "Programmer");
		System.out.println(emp2.getName() + "\t" + emp2.getIdNumber() +"\t" + "\t" + emp2.getDepartment() +"\t" + "\t"+ emp2.getPosition());

		// create another instance with different parameter
		Employee emp3 = new Employee("Joy Rogers", 81774, "Manufacturing", "Engineer");
		System.out.println(emp3.getName() + "\t" + emp3.getIdNumber() +"\t" + "\t" + emp3.getDepartment() +"\t"+ emp3.getPosition());

	}  //  End Main

}  //  End Class
