
public class Bai_1 {
	private int a = 50;
	
	public void doubleValue(Bai_1 ob) {
		ob.a = ob.a * 2;
	}
	
	public static void main(String[] args) {
		Bai_1 obj = new Bai_1();
		System.out.println("Before pass to method:" + obj.a);
		obj.doubleValue(obj);
		System.out.println("After pass to method:" + obj.a);
	}
}
