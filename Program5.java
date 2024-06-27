import java.util.Scanner;

public class Program5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the day of the week: ");
        String day = sc.next().toLowerCase();
        
        switch(day) {
            case "monday":
            case "wednesday":
                System.out.println("Basketball");
                break;
            case "tuesday":
                System.out.println("Tennis");
                break;
            case "thursday":
                System.out.println("Cricket");
                break;
                case "friday":
                System.out.println("Tennis");
                break;
                case "saturday":
                System.out.println("Exercise");
                break;
                case "sunday":
                System.out.println("holiday");
            default:
                System.out.println("No activity scheduled for this day.");
                break;
        }
        
        sc.close();
    }
}
