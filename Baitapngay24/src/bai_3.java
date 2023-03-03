
import java.util.Scanner;

public class bai_3 {
 
    public static void main(String[] args) {
        float a, b, c, x1, x2;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap a = ");
        a = scanner.nextInt();
        System.out.print("Nhap b = ");
        b = scanner.nextInt();
        System.out.print("Nhap c = ");
        c = scanner.nextInt();
        scanner.close();
        if(a == 0) {
        	System.out.println("Phuong trinh co nghiem la: " + -c/b );
        } else {
        	float delta = (b * b) - (4 * a * c);
            if(delta < 0){
                System.out.print("Phuong trinh vo nghiem");
            } else if(delta == 0){
                System.out.println("Phuong trinh co nghiem kep");
                x1 = x2 = (-b) / (2 * a);
                System.out.println("Nghiem kep cua phuong trinh la: " + x1);
            } else if(delta > 0) {
                System.out.println("Phuong trinh co hai nghiem phan biet");
                x1 = (-b + (float)Math.sqrt(delta)) / (2 * a);
                System.out.println("Ngiem x1 cua phuong trinh la: " + x1);
                x2 = (-b - (float)Math.sqrt(delta)) / (2 * a);
                System.out.println("Ngiem x2 cua phuong trinh la: " + x2);
            }
        }
    }
}
