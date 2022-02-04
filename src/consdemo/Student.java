package consdemo;

public class Student {
	int studentId;
	String studentName;
	int marks;
	float grade;
	
	// default constructor
	public Student() {
		marks =-1;
		grade = -1;
		
		System.out.println("Student Default Constructor Called .");	
	}

	// paramatrized constructor ( 4 params)
	public Student(int studentId, String studentName, int marks, float grade) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.marks = marks;
		this.grade = grade;
	}

	// paramatrized constructor ( 2 params)
	

	public Student(int studentId, String studentName) {
		// this();
		this.studentId = studentId;
		this.studentName = studentName;
	}
	
	public void printStudentDetails() {
		System.out.println("Student Id : " + studentId);
		System.out.println("Student Name : " + studentName);
		System.out.println("marks : " + marks);
		System.out.println("Grade : " + grade);
	}

	public static void main(String[] args) {
		
		Student student1 = new Student();
		System.out.println("------ Printing the details about student1 ---------------");
		student1.printStudentDetails();
		
		System.out.println("------ Printing the details about student2 ---------------");
		Student student2 = new Student(3001,"Mike", 1, 83);
		
		student2.printStudentDetails();
	//	student2= new Student(3002,"Martin", 2, 86);
		System.out.println("========================");
		student2.studentName= "Martin";
		student2.studentId = 3002;
		
		student2.printStudentDetails();
		
		System.out.println("------ Printing the details about student3 ---------------");
		Student student3 = new Student(3006, "Mary");
		student3.printStudentDetails();
		
		
	}
}
