import java.util.Scanner;

public class bai_5 {

	public static void main(String[] args) {
		String ho, ten;
		Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ho = ");
        ho = scanner.nextLine();
        System.out.print("Nhap ten = ");
        ten = scanner.nextLine();
        scanner.close();
		System.out.println("Ho va Ten: " + ho + " " + ten);
	}

}
