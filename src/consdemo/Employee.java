package consdemo;

/* By default, java dose provide default constructor automatically 
 * But if you create parameterized constructor, default constructor would not be available.
 */

public class Employee {
	
	String employeeName;
	
	public Employee() {
		employeeName= "Ahmed";
	}

	public Employee(String employeeName) {
		this.employeeName = employeeName;
	}

	public static void main(String[] args) {
		Employee e1 = new Employee();
		Employee e2 = new Employee("Mary");
		
		System.out.println("The e1 employee's name is : " + e1.employeeName);
		System.out.println("The e2 employee's name is : " + e2.employeeName);
	}
}
