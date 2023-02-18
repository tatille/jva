import java.util.Scanner;

public class XepLoaiHocTap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("nhap diem cua ban: ");
        double diem = scanner.nextDouble();

        if (diem >= 9) {
            System.out.println("xuat sac");
        } else if (diem >= 8) {
            System.out.println("gioi");
        } else if (diem >= 7) {
            System.out.println("kha");
        } else if (diem >= 5) {
            System.out.println("trung binh");
        } else {
            System.out.println("yeu");
        }
    }
}
