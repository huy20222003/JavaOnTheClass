import java.util.Scanner;

public class bai_10 {
	
	public static void main(String[] args) {
		int a;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Nhap a = ");
			a = sc.nextInt();
			sc.close();
		}while(a < 10);
	}
}
