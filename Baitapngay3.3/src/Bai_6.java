import java.util.Scanner;

public class Bai_6 {

	public static void main(String[] args) {
		int sum = 0;
		System.out.println("Nhap so phan tu cua mang: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i = 0; i < n; i++) {
			System.out.print("Nhap a[" +i + "] = ");
			a[i] = sc.nextInt();
		}
		sc.close();
		
		//in cac phan tu trong mang
		System.out.print("Danh sach cac phan tu la: ");
		for(int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
		
		//tinh tong cac phan tu trong mang
		for(int i = 0; i < n; i++) {
			sum += a[i];
		}
		System.out.print("\nTong cac phan tu trong mang la: " + sum);
		
		//sap xep giam dan cac phan tu
		System.out.print("\nDanh sach cac phan tu sau khi sap xep giam dan la: ");
		for(int i = 0; i < n; i++) {
			for(int j = i + 1; j < n; j++) {
				if(a[i] < a[j]) {
					int temp = a[i];
					a[i] =a[j];
					a[j] = temp;
				}
			}
		}
		
		//in cac phan tu sau khi sap xep giam dan
		for(int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
		
		//sap xep tang dan cac phan tu trong mang
		System.out.print("\nDanh sach cac phan tu sau khi sap xep tang dan la: ");
		for(int i = 0; i < n; i++) {
			for(int j = i + 1; j < n; j++) {
				if(a[i] > a[j]) {
					int temp = a[i];
					a[i] =a[j];
					a[j] = temp;
				}
			}
		}
		
		//in cac phan tu sau khi da sap xep tang dan
		for(int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
		//tim so lon nhat trong mang
		int max = a[1];
		for(int i = 0; i < n; i++) {
			if(a[i] > max) {
				max = a[i];
			}
		}
		System.out.println("\nSo lon nhat trong mang la: " + max);
		
		//tim so nho nhat trong mang
		int min = a[1];
		for(int i = 0; i < n; i++) {
			if(a[i] < min) {
				min = a[i];
			}
		}
		System.out.println("So nho nhat trong mang la: " + min);
	}

}
