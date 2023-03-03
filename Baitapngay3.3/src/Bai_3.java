import java.util.Scanner;

public class Bai_3 {

	public static void main(String[] args) {
		int n, p= 0;
		float sum = 0f;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap n = ");
		n = sc.nextInt();
		sc.close();
		for(int i = 1; i <= n; i++) {
			p = p + i;
			sum +=(float) 1 / p;
		}
		System.out.println("Tong la: " + sum);
	}

}
