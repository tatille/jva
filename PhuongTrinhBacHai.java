
import java.util.Scanner;

public class PhuongTrinhBacHai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập hệ số a: ");
        double a = input.nextDouble();

        System.out.println("Nhập hệ số b: ");
        double b = input.nextDouble();

        System.out.println("Nhập hệ số c: ");
        double c = input.nextDouble();

        double delta = Math.pow(b, 2) - 4 * a * c;
        double x1, x2;

        if (delta > 0) {
            x1 = (-b + Math.sqrt(delta)) / (2 * a);
            x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Phương trình có hai nghiệm là " + x1 + " và " + x2);
        } else if (delta == 0) {
            x1 = (-b) / (2 * a);
            System.out.println("Phương trình có một nghiệm kép là " + x1);
        } else {
            System.out.println("Phương trình vô nghiệm");
        }
    }
}
