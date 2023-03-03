
public class bai_11 {
	public static void main(String[] args) {
		int giaithua = 1;
		int a = 5;
		do {
			giaithua *= a;
			a--;
		} while(a > 0);
		System.out.println("Giai thua cua 5 la: " + giaithua);
	}
}
