import java.util.Scanner;

public class Count {
    public static int Count(int n, int m) {
        int day = 31*7 + 30*4 + 28;
        int count  = (m-n)*day;
        return count;
    }
    public static void main(String[] args) {
        System.out.println("Nhap nam bat dau: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        System.out.println("So ngay: "+ Count(n,m));
    }
}
