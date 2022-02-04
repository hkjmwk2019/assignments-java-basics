package consdemo;

public class StaticDemo {

	public int num1 = 100;
	public static int num2 = 200;

	public StaticDemo() {
		num1 += 10; // 10
		num2 -= 20; // 20
	}

	public void display1() {
		num1 = num2++;
		num2 = 100;
		num1 = --num2;
	}

	public static void display2() {
		num2--;
	}

	public static void main(String[] args) {
		StaticDemo demo1 = new StaticDemo();
		StaticDemo demo2 = new StaticDemo();
		
		System.out.println("demo1 num1 " + demo1.num1);
		System.out.println("demo1 num2 " + demo1.num2);

		System.out.println("demo2 num1 " + demo2.num1);
		System.out.println("demo2 num2 " + demo2.num2);
		
		//StaticDemo demo2 = new StaticDemo();
		//demo1.display1();
		//demo2.display2();
		//display2();
		//StaticDemo.display2();
		// ====================================

		
	}

	
}
