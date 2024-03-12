import java.util.Scanner;

public class L3Task2 {
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

        System.out.println("Enter the name of the month");
        month = scanner.nextLine();
        switch (month) {
            case "january":
                System.out.println("This is winter");
                break;
            case "february":
                System.out.println("This is winter");
                break;
            case "march":
                System.out.println("This is spring");
                break;
            case "april":
                System.out.println("This is spring");
                break;
            case "may":
                System.out.println("This is spring");
                break;
            case "june":
                System.out.println("This is summer");
                break;
            case "july":
                System.out.println("This is summer");
                break;
            case "august":
                System.out.println("This is summer");
                break;
            case "september":
                System.out.println("This is autumn");
                break;
            case "october":
                System.out.println("This is autumn");
                break;
            case "november":
                System.out.println("This is autumn");
                break;
            case "december":
                System.out.println("This is winter");
                break;
            default:
                System.out.println("There is no such month!");
        }
    }
}
