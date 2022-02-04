package studentManagement;

public class Student {
	int marks = 100;  // instance variable
	int score =0;
	
	public void takeExam() {
		int marksScored = 0;  //local variable
		if(marks>50) {
			marksScored= 0;
		}
		
		System.out.println(marksScored);
		
	}
	
	public static void main(String[]  args) {
		int counter=0;
		Student s = new Student();
		s.takeExam();
	}
}
