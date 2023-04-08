import java.util.Scanner;

class SinhVien {
	private String maSv;
	private String hoTen;
	private float diemTb;
	
	public SinhVien() {
		this.maSv = "";
		this.hoTen = "";
		this.diemTb = 0f;
	}
	
	public SinhVien(String maSv, String hoTen, float diemTb) {
		this.maSv = maSv;
		this.hoTen = hoTen;
		this.diemTb = diemTb;
	} 
	
	public void inputSv() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ma sinh vien: ");
		this.maSv = sc.nextLine();
		System.out.println("Nhap ho ten: ");
		this.hoTen = sc.nextLine();
		System.out.println("Nhap diem trung binh: ");
		this.diemTb = sc.nextFloat();
	}
	
	public void ShowSv() {
		System.out.println("Ma sinh vien: " + this.maSv);
		System.out.println("Ho ten sinh vien: " + this.hoTen);
		System.out.println("Diem trung binh sinh vien: " + this.diemTb);
	}
}

public class Bai_4 {

	public static void main(String[] args) {
		//khong truyen doi so
		SinhVien sv1 = new SinhVien();
		//co truyen doi so
		SinhVien sv2 = new SinhVien("21110", "Huy", 9);
		//doi tuong goi den cac phuong thuc nhap xuat
		SinhVien sv3 = new SinhVien();
		
		System.out.println("---Xuat ra cua ham tao khong doi---");
		sv1.ShowSv();
		System.out.println("\n");
		System.out.println("---Xuat cua ham tao co doi---");
		sv2.ShowSv();
		System.out.println("\n");
		System.out.println("---1 doi tuong voi cac phuong thuc nhap xuat---");
		sv3.inputSv();
		sv3.ShowSv();
	}

}
