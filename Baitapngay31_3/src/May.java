import java.util.Scanner;

public class May {
	private String ten;
	private String diaChi;
	private String nhanHieu;
	private double giaThanh;
	
	public May() {}
	
	public May(String ten, String diaChi, String nhanHieu, double giaThanh) {
		this.ten = ten;
		this.diaChi = diaChi;
		this.nhanHieu = nhanHieu;
		this.giaThanh = giaThanh;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getNhanHieu() {
		return nhanHieu;
	}

	public void setNhanHieu(String nhanHieu) {
		this.nhanHieu = nhanHieu;
	}

	public double getGiaThanh() {
		return giaThanh;
	}

	public void setGiaThanh(double giaThanh) {
		this.giaThanh = giaThanh;
	}
	
	public void Input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ten NSX: ");
		this.ten = sc.nextLine();
		System.out.println("Nhap dia chi: ");
		this.diaChi = sc.nextLine();
		System.out.println("Nhap nhan hieu: ");
		this.nhanHieu = sc.nextLine();
		System.out.println("Nhap gia thanh: ");
		this.giaThanh = sc.nextDouble();
	}
	
	public void Show() {
		StringBuilder stb = new StringBuilder();
		stb.append("Ten NSX: ").append(this.ten).append("\n");
		stb.append("Dia chi: ").append(this.diaChi).append("\n");
		stb.append("Nhan hieu: ").append(this.nhanHieu).append("\n");
		stb.append("Gia thanh: ").append(this.giaThanh);
		System.out.println(stb.toString());
	}
}
