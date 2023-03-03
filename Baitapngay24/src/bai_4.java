
public class bai_4 {
	public static void main(String[] args) {
		float a = 4f, b = 5f, c = 6f;
		float p = (a + b + c) / 2;
		System.out.println("Dien tich cua tam giac la: " + Math.sqrt(p * (p -a) * (p - b) * (p - c)));
	}
}
