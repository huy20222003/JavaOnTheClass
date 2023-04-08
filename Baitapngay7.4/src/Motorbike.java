import java.util.Scanner;

public class Motorbike extends Vehicle {
	private int wattage;
	
	public Motorbike() {}

	public Motorbike(String mauXe, double giaThanh, String hangSanXuat, int wattage) {
		super(mauXe, giaThanh, hangSanXuat);
		this.wattage = wattage;
	}

	public int getWattage() {
		return wattage;
	}

	public void setWattage(int wattage) {
		this.wattage = wattage;
	}

	@Override
	public void inPut() {
		Scanner sc = new Scanner(System.in);
		super.inPut();
		System.out.println("Nhap cong suat");
		this.wattage = sc.nextInt();
	}

	@Override
	public void outPut() {
		super.outPut();
		System.out.printf("%8d|\n", this.wattage);
	}
	
	
}
