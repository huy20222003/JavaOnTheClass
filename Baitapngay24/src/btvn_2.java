import java.util.Scanner;

public class btvn_2 {
	public static void main(String[] args) {
		int N;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap N = ");
		N = sc.nextInt();
		sc.close();
		if(N < 0) {
			System.out.println("N la so nguyen am");
		} else if(N > 0) {
			System.out.println("N la so nguyen duong");
		} else {
			System.out.println("N khong phai la so nguyen am hoac nguyen duong");
		}
	}
}
