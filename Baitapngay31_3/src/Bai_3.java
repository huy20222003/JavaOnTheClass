
public class Bai_3 {
private int a = 50;
	
	public void doubleValue(int a) {
		a = a * 2;
	}
	
	public static void main(String[] args) {
		Bai_3 obj = new Bai_3();
		System.out.println("Before pass to method:" + obj.a);
		obj.doubleValue(2);
		System.out.println("After pass to method:" + obj.a);
	}
}
