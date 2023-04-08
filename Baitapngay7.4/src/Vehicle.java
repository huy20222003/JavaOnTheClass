import java.util.Scanner;

public class Vehicle {
	private String mauXe;
	private double giaThanh;
	private String hangSanXuat;
	
	public Vehicle() {}
	
	public Vehicle(String mauXe, double giaThanh, String hangSanXuat) {
		this.mauXe = mauXe;
		this.giaThanh = giaThanh;
		this.hangSanXuat = hangSanXuat;
	}

	public String getMauXe() {
		return mauXe;
	}

	public void setMauXe(String mauXe) {
		this.mauXe = mauXe;
	}

	public double getGiaThanh() {
		return giaThanh;
	}

	public void setGiaThanh(double giaThanh) {
		this.giaThanh = giaThanh;
	}

	public String getHangSanXuat() {
		return hangSanXuat;
	}

	public void setHangSanXuat(String hangSanXuat) {
		this.hangSanXuat = hangSanXuat;
	}
	
	public void inPut() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap mau xe: ");
		this.mauXe = sc.nextLine();
		System.out.println("Nhap gia thanh: ");
		this.giaThanh = sc.nextDouble();
		sc.nextLine();
		System.out.println("Nhap hang san xuat: ");
		this.hangSanXuat = sc.nextLine();
	}
	
	public void outPut() {
		System.out.printf("|%8s|%10.3f|%13s|", this.mauXe, this.giaThanh, this.hangSanXuat);
	}
	
}
