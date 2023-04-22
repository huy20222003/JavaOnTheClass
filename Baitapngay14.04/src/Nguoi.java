import java.util.Scanner;

public class Nguoi {
	private String hoTen;
	private String ngaySinh;
	private String gioiTinh;
	private String diaChi;
	
	public Nguoi() {}
	
	public Nguoi(String hoTen, String ngaySinh, String gioiTinh, String diaChi) {
		this.hoTen = hoTen;
		this.ngaySinh = ngaySinh;
		this.gioiTinh = gioiTinh;
		this.diaChi = diaChi;
	}

	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(String ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	public String getGioiTinh() {
		return gioiTinh;
	}
	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	
	public void inPut() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ho ten: ");
		this.hoTen = sc.nextLine();
		System.out.print("Nhap gioi tinh: ");
		this.gioiTinh = sc.nextLine();
		System.out.print("Nhap ngay sinh: ");
		this.ngaySinh = sc.nextLine();
		System.out.print("Nhap dia chi: ");
		this.diaChi = sc.nextLine();
	}
	
	public void outPut() {
		StringBuilder stb = new StringBuilder();
		stb.append("Ho va ten: ").append(this.hoTen).append("\n");
		stb.append("Gioi tinh: ").append(this.gioiTinh).append("\n");
		stb.append("Ngay sinh: ").append(this.ngaySinh).append("\n");
		stb.append("Dia chi: ").append(this.diaChi);
		System.out.println(stb.toString());
	}
}
