import java.util.Scanner;

public class Bai_1 {

	public static void main(String[] args) {
		int n;
		long sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap n = ");
		n = sc.nextInt();
		sc.close();
		if(n < 0) {
			System.out.println("Nhap n > 0");
		} else {
			for(int i = 1; i <= n; i++) {
				sum += Math.pow(i, 2);
			}
			System.out.println("Tong S = " + sum);
		}
	}

}
