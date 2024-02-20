import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the month");
        String month = scanner.nextLine();
        switch (month) {
            case "january":
                System.out.println("winter");
                break;
            case "february":
                System.out.println("winter");
                break;
            case "march":
                System.out.println("spring");
                break;
            case "april":
                System.out.println("spring");
                break;
            case "may":
                System.out.println("spring");
                break;
            case "june":
                System.out.println("summer");
                break;
            case "july":
                System.out.println("summer");
                break;
            case "august":
                System.out.println("summer");
                break;
            case "september":
                System.out.println("autumn");
                break;
            case "october":
                System.out.println("autumn");
                break;
            case "november":
                System.out.println("autumn");
                break;
            case "december":
                System.out.println("winter");
                break;
            default:
                System.out.println("There is no such month!");
        }
    }
}
