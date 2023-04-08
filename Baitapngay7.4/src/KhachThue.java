import java.util.Scanner;

public class KhachThue extends Nguoi {
	private float soNgayThue;
	private String loaiPhongThue;
	private float donGia;
	
	public KhachThue() {}
	
	public KhachThue(String hoVaTen, String ngaySinh, String soCMND, float soNgayThue, String loaiPhongThue, float donGia) {
		super(hoVaTen, ngaySinh, soCMND);
		this.soNgayThue = soNgayThue;
		this.loaiPhongThue = loaiPhongThue;
		this.donGia = donGia;
	}

	public float getSoNgayThue() {
		return soNgayThue;
	}

	public void setSoNgayThue(float soNgayThue) {
		this.soNgayThue = soNgayThue;
	}

	public String getLoaiPhongThue() {
		return loaiPhongThue;
	}

	public void setLoaiPhongThue(String loaiPhongThue) {
		this.loaiPhongThue = loaiPhongThue;
	}

	public float getDonGia() {
		return donGia;
	}

	public void setDonGia(float donGia) {
		this.donGia = donGia;
	}

	@Override
	public void inPut() {
		Scanner sc = new Scanner(System.in);
		super.inPut();
		System.out.print("Nhap so ngay thue: ");
		this.soNgayThue = sc.nextFloat();
		System.out.print("Nhap loai phong thue: ");
		this.loaiPhongThue = sc.nextLine();
		sc.nextLine();
		System.out.print("Nhap don gia: ");
		this.donGia = sc.nextFloat();
	}

	@Override
	public void Output() {
		super.Output();
		System.out.println("So ngay thue: " + this.soNgayThue);
		System.out.println("Loai phong thue: " + this.loaiPhongThue);
		System.out.println("Don gia: " + this.donGia);
	}
	
	public float tinhTien() {
		return this.soNgayThue * this.donGia;
	}
	
}
