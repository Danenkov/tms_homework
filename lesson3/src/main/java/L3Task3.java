import java.util.Scanner;

public class L3Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int value = scanner.nextInt();
        for (int i = 0; i <= value; i++) {
            if (i%2==0) {
                continue;
            }
            if (i%3==0) {
                System.out.println(i);
            }
        }
    }
}
