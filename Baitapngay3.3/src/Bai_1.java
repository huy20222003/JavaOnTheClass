import java.util.Scanner;

public class Bai_1 {

	public static void main(String[] args) {
		int n;
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap n = ");
		n = sc.nextInt();
		sc.close();
		for(int i =0; i <= n; i++) {
			sum += i;
		}
		System.out.println("Tong cua n so tu nhien la: " + sum);
	}

}
