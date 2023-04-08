import java.util.Scanner;

public class MayInMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so luong may in: ");
		int n = sc.nextInt();
		MayIn[] danhSachMayIn = new MayIn[n];
		
		//Nhap danh sach cac may in
		for(int i = 0; i < n; i++) {
			System.out.println("Nhap thong tin may in thu " + (i + 1) + ":");
			danhSachMayIn[i] = new MayIn();
			danhSachMayIn[i].Input();
		}
		
		//Xuat danh sach cac may in
		System.out.println("\nDanh sach cac may in la: ");
		for(int i = 0; i < n; i++) {
			System.out.println("\nThong tin may in so " + (i + 1));
			danhSachMayIn[i].Show();
		}
		
		//In ra danh sach may in cua nha san xuat Cannon
		System.out.println("\nDanh sach cac may in cua nha san xuat Cannon: ");
		for(int i = 0; i < n; i++) {
			if(danhSachMayIn[i].getTen().equalsIgnoreCase("Cannon")) {
				danhSachMayIn[i].Show();
			}
		}
	}

}
