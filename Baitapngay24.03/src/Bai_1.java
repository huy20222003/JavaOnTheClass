
public class Bai_1 {
	int x, y, z;
	
	public Bai_1() {
		x = y = z = 0;
		this.outData();
	}
	
	public Bai_1(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
		this.outData();
	}
	
	public void outData() {
		System.out.println(x + " " + y + " " + z);
	}
	
	public static void main(String[] args) {
		System.out.println("Ham tao khong doi");
		Bai_1 b = new Bai_1();
		System.out.println("Ham tao co doi");
		Bai_1 b1 = new Bai_1(2, 3, 4);
	}

}
