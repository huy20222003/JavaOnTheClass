
class Test {
	public Test() {
		System.out.println("ham tao khong doi");
	}
	
	public Test(int i) {
		this();
	}
}

public class Bai_3 {
	
	public static void main(String[] args) {
		Test thu = new Test(10);
	}

}
