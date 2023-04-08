import java.util.Scanner;

public class MayIn extends May{
	private int tocDoIn;
	private int doPhanGiai;
	
	public MayIn() {}
	
	public MayIn(String ten, String diaChi, String nhanHieu, double giaThanh, int tocDoIn, int doPhanGiai) {
		super(ten, diaChi, nhanHieu, giaThanh);
		this.tocDoIn = tocDoIn;
		this.doPhanGiai = doPhanGiai;
	}

	public double getTocDoIn() {
		return tocDoIn;
	}

	public void setTocDoIn(int tocDoIn) {
		this.tocDoIn = tocDoIn;
	}

	public double getDoPhanGiai() {
		return doPhanGiai;
	}

	public void setDoPhanGiai(int doPhanGiai) {
		this.doPhanGiai = doPhanGiai;
	}

	@Override
	public void Input() {
		super.Input();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap toc do in: ");
		this.tocDoIn = sc.nextInt();
		System.out.println("Nhap do phan giai: ");
		this.doPhanGiai = sc.nextInt();
	}

	@Override
	public void Show() {
		super.Show();
		System.out.println("Toc do in: " + this.tocDoIn);
		System.out.println("Do phan giai: " + this.doPhanGiai);
	}
	
	
}
