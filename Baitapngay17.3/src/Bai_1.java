
class Circle {
	public float radius = 0;
	public static float PI = 3.14f;
	
	public Circle(float r) {
		this.radius = r;
	}
}

public class Bai_1 {
	
	public static void main(String[] args) {
		Circle c1 = new Circle(10.3f);
		Circle c2 = new Circle(5.7f);
		
		System.out.println("C1 radius = " + c1.radius);
		System.out.println("C1 PI = " + c1.PI);
		
		System.out.println("\nC2 radius = " + c2.radius);
		System.out.println("C2 PI = " + c2.PI);
		
		System.out.println("\nPI = " + Circle.PI);
		
		c1.radius = 16.2f;
		c1.PI = 7.8f;
		
		System.out.println("C1 radius = " + c1.radius);
		System.out.println("C1 PI = " + c1.PI);
		
		System.out.println("\nC2 radius = " + c2.radius);
		System.out.println("C2 PI = " + c2.PI);
	}
}


