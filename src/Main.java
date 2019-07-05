import java.util.Scanner;

public class Main {
    private static Exception e;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        try {
            if ((a < 0 || b < 0 || c < 0) || (a + b <= c) || (a + c <= b) || (b + c <= a)) {
                throw (e);
            }else {
                System.out.println("La 3 canh mot tam giac");
            }

        } catch (Exception e) {
            System.out.println("Khong Phai 3 canh mot tam giac");
        }
    }
}
