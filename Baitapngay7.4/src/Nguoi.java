import java.util.Scanner;

public class Nguoi {
	private String hoVaTen;
	private String ngaySinh;
	private String soCMND;
	
	public Nguoi() {}
	
	public Nguoi(String hoVaTen, String ngaySinh, String soCMND) {
		this.hoVaTen = hoVaTen;
		this.ngaySinh = ngaySinh;
		this.soCMND = soCMND;
	}


	public String getHoVaTen() {
		return hoVaTen;
	}
	public void setHoVaTen(String hoVaTen) {
		this.hoVaTen = hoVaTen;
	}
	public String getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(String ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	public String getSoCMND() {
		return soCMND;
	}
	public void setSoCMND(String soCMND) {
		this.soCMND = soCMND;
	}
	
	public void inPut() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ho va ten: ");
		this.hoVaTen = sc.nextLine();
		System.out.print("Nhap ngay sinh: ");
		this.ngaySinh = sc.nextLine();
		System.out.print("Nhap so chung minh nhan dan: ");
		this.soCMND = sc.nextLine();
	}
	
	public void Output() {
		StringBuilder stb = new StringBuilder();
		stb.append("Ho ten: ").append(this.hoVaTen).append("\n");
		stb.append("Ngay sinh: ").append(this.ngaySinh).append("\n");
		stb.append("So CMND: ").append(this.soCMND);
		System.out.println(stb.toString());
	}
}
