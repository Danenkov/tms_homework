import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[] arr = new int[] {1,2,3,4,2,5,7,3,2};
        int repeat = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length ; j++) {
                if (arr[i] == arr[j]) {
                    repeat = arr[j];
                }
            }
        }
        System.out.println("Число встречающееся чаще всего - " + repeat);
    }
}
