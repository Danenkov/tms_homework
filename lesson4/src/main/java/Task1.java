import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10);
        }
        System.out.println("исходный массив - " + Arrays.toString(arr));
        //Task 1.1 среднее арифметическое:
        double average = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            average = (double) sum / arr.length;
        }
        System.out.println("среднее арифметическое всех чисел = " + average);
        //Task 1.2 скопировать в новый массив но в обратном порядке:
        int[] arrCopy = new int[arr.length];
        for (int i = 0; i < arrCopy.length; i++) {
            arrCopy[i] = arr[arr.length - 1 - i];
        }
        System.out.println("в обратном порядке - " + Arrays.toString(arrCopy));
        //Task 1.3 найти повторяющееся число:
        int repeat = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    repeat = arr[j];
                    System.out.println("повторяющееся число - " + repeat);
                    return;
                }
            }
        }
    }
}