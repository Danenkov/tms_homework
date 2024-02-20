import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
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
