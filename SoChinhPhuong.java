import java.util.Scanner;

public class SoChinhPhuong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập một số nguyên dương: ");
        int n = input.nextInt();

        if (isPerfectSquare(n)) {
            System.out.println(n + " là số chính phương");
        } else {
            System.out.println(n + " không phải là số chính phương");
        }
    }

    public static boolean isPerfectSquare(int n) {
        if (n < 0) {
            return false;
        }
        int sqrt = (int) Math.sqrt(n);
        return sqrt * sqrt == n;
    }
}
