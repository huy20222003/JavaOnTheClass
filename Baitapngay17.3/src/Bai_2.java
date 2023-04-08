
class Rectangle {
	public float length;
	public float width;
	
	public void Rectangle() {
		this.length = 0f;
		this.width = 0f;
	}

	public Rectangle(float length, float width) {
		this.length = length;
		this.width = width;
	}
	
	public float getArea() {
		return length * width;
	}
}

public class Bai_2 {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(3f, 4f);
		Rectangle r2 = new Rectangle(5.3f, 6.2f);
		
		System.out.println("R1 length = " + r1.length);
		System.out.println("R1 width = " + r1.width);
		
		System.out.println("\nR2 length = " + r2.length);
		System.out.println("R2 width = " + r2.width);
		
		r1.length = 5f;
		r1.width = 6f;
		
		r2.length = 4.5f;
		r2.width = 6.7f;
		
		System.out.println("\nR1 length = " + r1.length);
		System.out.println("R1 width = " + r1.width);
		
		System.out.println("\nR2 length = " + r2.length);
		System.out.println("R2 width = " + r2.width);
		
		System.out.println("\nR1 area = " + r1.getArea());
		System.out.println("R2 area = " + r2.getArea());
	}

}
