import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название месяца");
        String month = scanner.nextLine();
        if (month.equals("декабрь") || month.equals("январь") || month.equals("февраль")) {
            System.out.println("Это зима");
        } else if (month.equals("март") || month.equals("апрель") || month.equals("май")) {
            System.out.println("Это весна");
        } else if (month.equals("июнь") || month.equals("июль") || month.equals("август")) {
            System.out.println("Это лето");
        } else if (month.equals("сентябрь") || month.equals("октябрь") || month.equals("ноябрь")) {
            System.out.println("Это осень");
        } else {
            System.out.println("Нет такого месяца!");
        }
    }
}
