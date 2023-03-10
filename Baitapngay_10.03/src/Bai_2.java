import java.util.Scanner;

public class Bai_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap diem Tb: ");
		float diemTB = sc.nextFloat();
		sc.close();
		
		if(diemTB > 10 && diemTB < 0) {
			System.out.println("Diem TB khong hop le");
		} else {
			if(diemTB >= 8.0) {
				System.out.println("Xep loai: Gioi");
			} else if(diemTB >= 6.5 && diemTB < 8.0) {
				System.out.println("Xep loai: Kha");
			} else if(diemTB >= 5.0 && diemTB < 6.5) {
				System.out.println("Xep loai: Trung Binh");
			} else {
				System.out.println("Xep loai: Yeu");
			}
		}
	} 

}
