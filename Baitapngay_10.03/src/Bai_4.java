import java.util.Scanner;

public class Bai_4 {
	public static void inputArray(int[]a, int n) {
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < n; i++) {
			System.out.print("Nhap a[" +i + "] = ");
			a[i] = sc.nextInt();
		}
	}
	
	public static int sumArray(int[]a, int n) {
		int sum = 0;
		for(int i = 0; i < n; i++) {
			sum += a[i];
		}
		return sum;
	}
	
	public static int EleMaxOfArray(int[]a, int n) {
		int max = a[0];
		for(int i = 0; i < n; i++) {
			if(a[i] > max) {
				max = a[i];
			}
		}
		return max;
	}
	
	public static void sortArray(int[]a, int n) {
		for(int i = 0; i < n; i++) {
			for(int j = i + 1; j < n; j++) {
				if(a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}	
	}
	
	public static void outputArray(int[]a, int n) {
		for(int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
	}
	
	
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so luong phan tu cua mang: ");
		n = sc.nextInt();
		int[] a = new int[n];  
		inputArray(a, n);
		System.out.print("Danh sach cac phan tu trong mang la: ");
		outputArray(a, n);
		System.out.println("\nTong cac phan tu trong mang la: " + sumArray(a, n));
		System.out.println("So lon nhat trong mang la: " + EleMaxOfArray(a, n));
		sortArray(a, n);
		System.out.print("Danh sach cac phan tu trong mang sau khi sap xep tang dan la: ");
		outputArray(a, n);
	}

}
