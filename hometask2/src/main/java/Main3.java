import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the month");
        String month = scanner.nextLine();
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
