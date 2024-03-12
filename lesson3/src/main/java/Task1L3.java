import java.util.Scanner;

public class Task1L3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число от 1 до 10000");
        int value = scanner.nextInt();
        if (value <= 10000) {
            int value1 = value/1000;
            System.out.print("Количество тысяч = ");
            System.out.println( value1);
            int value2 = (value-(value1*1000))/100;
//            проще int value2 = value%1000/100;
            System.out.print("Количество сотен = ");
            System.out.println( value2);
            int value3 = (value-(value1*1000)-(value2*100))/10;
            System.out.print("Количество десятков = ");
            System.out.println( value3);
            int value4 = (value-(value1*1000)-(value2*100)-(value3*10));
            System.out.print("Количество единиц = ");
            System.out.println( value4);
            System.out.print("Количество знаков = ");
            if (value < 10000 && value > 999) {
                System.out.println(4);
            } else if (value < 1000 && value > 99) {
                System.out.println(3);
            } else if (value < 100 && value >9) {
                System.out.println(2);
            } else if (value < 10) {
                System.out.println(1);
            }
        } else {
            System.out.println("Ошибка. Нужно ввести число от 1 до 10000");
        }
    }
}
