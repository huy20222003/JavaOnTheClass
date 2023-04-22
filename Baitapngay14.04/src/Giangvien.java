import java.util.Scanner;

public class Giangvien extends Nguoi {
	private String lopDay;
	private double luongMotGio;
	private double soGioDayTrongThang;
	
	public Giangvien() {}

	public Giangvien(String hoTen, String ngaySinh, String gioiTinh, String diaChi, String lopDay, double luongMotGio, double soGioDayTrongThang) {
		super(hoTen, ngaySinh, gioiTinh, diaChi);
		this.lopDay = lopDay;
		this.luongMotGio = luongMotGio;
		this.soGioDayTrongThang = soGioDayTrongThang;
	}

	public String getLopDay() {
		return lopDay;
	}

	public void setLopDay(String lopDay) {
		this.lopDay = lopDay;
	}

	public double getLuongMotGio() {
		return luongMotGio;
	}

	public void setLuongMotGio(double luongMotGio) {
		this.luongMotGio = luongMotGio;
	}

	public double getSoGioDayTrongThang() {
		return soGioDayTrongThang;
	}

	public void setSoGioDayTrongThang(double soGioDayTrongThang) {
		this.soGioDayTrongThang = soGioDayTrongThang;
	}

	@Override
	public void inPut() {
		Scanner sc = new Scanner(System.in);
		super.inPut();
		System.out.print("Nhap lop day: ");
		this.lopDay = sc.nextLine();
		System.out.print("Nhap luong mot gio: ");
		this.luongMotGio = sc.nextDouble();
		System.out.print("Nhap so gio day trong thang: ");
		this.soGioDayTrongThang = sc.nextDouble();
	}

	@Override
	public void outPut() {
		super.outPut();
		System.out.println("Lop day: " + this.lopDay);
		System.out.println("Luong mot gio: " + this.luongMotGio);
		System.out.println("So gio day trong thang: " + this.soGioDayTrongThang);
	}
	
	public double luongThucNhan() {
		double luong = 0;
		if(this.lopDay.equalsIgnoreCase("SANG") || this.lopDay.equalsIgnoreCase("CHIEU")) {
			luong = this.luongMotGio * this.soGioDayTrongThang;
		} else if(this.lopDay.equalsIgnoreCase("TOI")) {
			luong = (this.luongMotGio * this.soGioDayTrongThang) * 1.2;
		}
		return luong;
	}
	
}
