import java.util.Scanner;

public class Bai_3 {

	public static void main(String[] args) {
		int[][] a;
		int n, m;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so dong: ");
		n = sc.nextInt();
		System.out.println("Nhap so cot: ");
		m = sc.nextInt();
		a = new int[n][m];
		
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				System.out.print("a [" + i + "][" + j + "] = ");
				a[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Danh sach cac phan tu trong mang la: ");
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.print("\n");
		}
		
		//tim so lon nhat trong mang
		int max = a[0][0];
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				if(a[i][j] > max) {
					max = a[i][j];
				}
			}
		}
		
		System.out.println("So lon nhat trong mang la: " + max);
		
		//tinh tong cac so chan trong mang
		int sum = 0;
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				if(a[i][j] % 2 == 0) {
					sum += a[i][j];
				}
			}
		}
		
		System.out.println("Tong cac so chan trong mang la: " + sum);
	}

}
