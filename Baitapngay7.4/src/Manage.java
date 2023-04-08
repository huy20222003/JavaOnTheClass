import java.util.Scanner;

public class Manage {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		do {
			System.out.print("Nhap so luong o to: ");
			n = sc.nextInt();
		}while(n <= 0);
		Car[] c = new Car[n];
		
		for(int i = 0; i < n; i++) {
			System.out.println("Nhap thong tin cho o to thu " + (i + 1) +":");
			c[i] = new Car();
			c[i].inPut();
			System.out.println("\n");
		}
		
		System.out.println("Danh sach cac xe la: ");
		System.out.printf("|%8s|%10s|%10s|%8s|%10s|\n", "Mau xe", "Gia thanh", "Hang san xuat", "So ghe", "Loai may");
		for(int i = 0; i < n; i++) {
			c[i].outPut();
		}
		
		System.out.println("\nThong tin cac o to thuoc hang san xuat Toyota: ");
		for(int i = 0; i < n; i++) {
			if(c[i].getHangSanXuat().equals("Toyota")) {
				c[i].outPut();
			}
		}
	}

}
