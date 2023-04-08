import java.util.Scanner;

public class Car extends Vehicle{
	private int soGhe;
	private String loaiMay;
	
	public Car() {}

	public Car(String mauXe, double giaThanh, String hangSanXuat, int soGhe, String loaiMay) {
		super(mauXe, giaThanh, hangSanXuat);
		this.soGhe = soGhe;
		this.loaiMay = loaiMay;
	}

	public int getSoGhe() {
		return soGhe;
	}

	public void setSoGhe(int soGhe) {
		this.soGhe = soGhe;
	}

	public String getLoaiMay() {
		return loaiMay;
	}

	public void setLoaiMay(String loaiMay) {
		this.loaiMay = loaiMay;
	}

	@Override
	public void inPut() {
		Scanner sc = new Scanner(System.in);
		super.inPut();
		System.out.println("Nhap so ghe: ");
		this.soGhe = sc.nextInt();
		sc.nextLine();
		System.out.println("Nhap loai may: ");
		this.loaiMay = sc.nextLine();
	}

	@Override
	public void outPut() {
		super.outPut();
		System.out.printf("%8d|%10s|\n", this.soGhe, this.loaiMay);
	}
	
}
