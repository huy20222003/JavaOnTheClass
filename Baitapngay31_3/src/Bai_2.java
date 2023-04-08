
class Calculator {
	public static int add(int a, int b) {
		return a + b;
	}
	
	public int sub(int a, int b) {
		return a - b;
	}
}

public class Bai_2 {
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		int s = cal.sub(3, 5);
		
		System.out.println("Subtraction result: " + s);
		
		//calling static method
		int a = Calculator.add(3, 5);
		System.out.println("Addition result: " + a);
	}
}
