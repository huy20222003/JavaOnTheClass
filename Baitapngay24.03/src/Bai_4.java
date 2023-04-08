import java.util.Scanner;

public class Bai_4 {
    private String tenNSX;
    private String diaChi;
    private String nhanHieu;
    private double giaThanh;

    public Bai_4() {}

    public Bai_4(String tenNSX, String diaChi, String nhanHieu, double giaThanh) {
        this.tenNSX = tenNSX;
        this.diaChi = diaChi;
        this.nhanHieu = nhanHieu;
        this.giaThanh = giaThanh;
    }

    public String getTenNSX() {
        return tenNSX;
    }

    public void setTenNSX(String tenNSX) {
        this.tenNSX = tenNSX;
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

    public void inPut() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap ten NSX: ");
        tenNSX = scanner.nextLine();

        System.out.print("Nhap dia chi: ");
        diaChi = scanner.nextLine();

        System.out.print("Nhap nhan hieu: ");
        nhanHieu = scanner.nextLine();

        System.out.print("Nhap gia thanh: ");
        giaThanh = scanner.nextDouble();
    }

    public void outPut() {
        System.out.println("Ten NSX: " + tenNSX);
        System.out.println("Dia chi: " + diaChi);
        System.out.println("Nhan hieu: " + nhanHieu);
        System.out.println("Gia thanh: " + giaThanh);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so luong: ");
        int n = scanner.nextInt();

        Bai_4[] danhSachMay = new Bai_4[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin may " + (i + 1) + ":");
            danhSachMay[i] = new Bai_4();
            danhSachMay[i].inPut();
        }

        System.out.println("\nDanh sach may in:");
        for (int i = 0; i < n; i++) {
            System.out.println("May in thu " + (i + 1) + ":");
            danhSachMay[i].outPut();
        }
    }
}
