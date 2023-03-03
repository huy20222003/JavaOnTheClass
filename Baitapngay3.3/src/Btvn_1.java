import java.util.Scanner;

public class Btvn_1 {
	
	boolean isSoNguyenTo(int x) {
		if(x < 1) {
			return false;
		}
		for(int i = 2; i <= Math.sqrt(x); i++) {
			if(x % i == 0) {
				return false;
			}
		} 
		return true;
	}
	

	public static void main(String[] args) {
		Btvn_1 bt = new Btvn_1();
		System.out.println("Nhap so phan tu cua mang: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i = 0; i < n; i++) {
			System.out.print("Nhap a[" +i + "] = ");
			a[i] = sc.nextInt();
		}
		sc.close();
		
		System.out.print("Danh sach cac so nguyen to trong mang la: ");
		for(int i = 0; i < n; i++) {
			if(bt.isSoNguyenTo(a[i])) {
				System.out.print(a[i] + " ");
			}
		}
	}

}
