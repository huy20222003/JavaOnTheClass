import java.util.Scanner;

public class Btvn_2 {

	public static void main(String[] args) {
		int countNhoHonc = 0, countBangc = 0, countLonHonc = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap c = ");
		int c = sc.nextInt();
		System.out.println("Nhap so phan tu cua mang: ");
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i = 0; i < n; i++) {
			System.out.print("Nhap a[" +i + "] = ");
			a[i] = sc.nextInt();
		}
		sc.close();
		
		for(int i = 0; i < n; i++) {
			if(a[i] < c) {
				countNhoHonc++;
			} else if(a[i] == c) {
				countBangc++;
			} else {
				countLonHonc++;
			}
		}
		
		System.out.println("Co " + countNhoHonc + " so nho hon " + c);
		System.out.println("Co " + countBangc + " so bang " + c);
		System.out.println("Co " + countLonHonc + " so lon hon " + c);
	}

}
