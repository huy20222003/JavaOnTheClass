import java.util.Scanner;

public class Bai_4 {
	public static void main(String[] args) {
		int n;
		int a = 1, b = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap n = ");
		n = sc.nextInt();
		sc.close();
		System.out.println("Day fibonaci la: ");
		for(int i = 0; a <= n; i++) {
			System.out.print(a + " ");
			int temp = a + b;
			a = b;
			b = temp;
		}
	}
}
