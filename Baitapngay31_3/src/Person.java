import java.util.Scanner;

public class Person {
	protected String ten;
	protected int tuoi;
	protected String diaChi;
	
	public Person(String ten, int tuoi, String diaChi) {
		this.ten = ten;
		this.tuoi = tuoi;
		this.diaChi = diaChi;
	}
	
	public void Input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ten: ");
		this.ten = sc.nextLine();
		System.out.println("Nhap tuoi: ");
		this.tuoi = sc.nextInt();
		System.out.println("Nhap dia chi: ");
		this.diaChi = sc.nextLine();
	}
	
	public void Show() {
		System.out.println("Ho Ten: " + this.ten + ", " + "Tuoi: " + ", " + "Dia chi: " + diaChi);
	}
}
