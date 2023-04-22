import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		do {
			System.out.print("Nhap so luong giang vien: ");
			n = sc.nextInt();
		} while(n <= 0);
		
		Giangvien[] gv = new Giangvien[n];
		for(int i = 0; i < n; i++) {
			System.out.println("Nhap thong tin giang vien thu " + (i + 1) + ":");
			gv[i] = new Giangvien();
			gv[i].inPut();
			System.out.println("\n");
		}
		
		System.out.println("Danh sach thong tin giang vien: ");
		for(int i = 0; i < n; i++) {
			gv[i].outPut();
			System.out.println("Luong" + gv[i].luongThucNhan());
			System.out.println("\n");
		}
		
		System.out.println("Giang vien co luong cao nhat la: ");
		double luongMax = gv[0].luongThucNhan();
		for(int i = 0; i < n; i++) {
			if(gv[i].luongThucNhan() > luongMax) {
				luongMax = gv[i].luongThucNhan();
				gv[i].outPut();
				System.out.println("Luong" + gv[i].luongThucNhan());
			}
		}
	}

}
