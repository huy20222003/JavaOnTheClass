
public class Bai_4 {
	public float dienTich(float a) {
		return (float) a * a;
	}
	
	public float dienTich(float a, float b) {
		return (float) a * b;
	}
	
	public float dienTich(float a, float b, float c) {
		float p = (float) (a + b + c) / 2;
		return (float) Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}
	
	public static void main(String[] args) {
		Bai_4 h = new Bai_4();
		System.out.println("Dien tich hinh vuong la: " + h.dienTich(4));
		System.out.println("Dien tich hinh chu nhat la: " + h.dienTich(4, 6));
		System.out.println("Dien tich hinh tam giac la: " + h.dienTich(4, 5, 6));
	}
}
