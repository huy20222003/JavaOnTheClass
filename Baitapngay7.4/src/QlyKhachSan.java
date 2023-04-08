import java.util.Scanner;

public class QlyKhachSan {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		do {
			System.out.print("Nhap so luong khach thue: ");
			n = sc.nextInt();
		}while(n <= 0);
		KhachThue[] kt = new KhachThue[n];
		
		for(int i = 0; i < n; i++) {
			System.out.println("Nhap thong tin cho khach thue thu " + (i + 1) +":");
			kt[i] = new KhachThue();
			kt[i].inPut();
			System.out.println("\n");
		}
		
		for(int i = 0; i < n; i++) {
			System.out.println("Thong tin cua khach thue thu " + (i + 1) +":");
			kt[i].Output();
			System.out.println("\n");
		}
		
		sc.nextLine();
		System.out.print("Nhap so CMND: ");
		String ID = sc.nextLine();
		
		for(int i = 0; i < n; i++) {
			if(kt[i].getSoCMND().equals(ID)) {
				System.out.println("Hoa don: " + kt[i].tinhTien());
			} else {
				System.out.println("Khong tim thay so CMND");
			}
		}
	}
}
