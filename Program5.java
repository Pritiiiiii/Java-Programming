import java.util.Scanner;
public class Program5 {
    Scanner sc=new Scanner(System.in);
    String day=sc.next().toLowerCase();
    switch(day)
    {
        case "Monday":
        case "wednesday":{
            System.out.println("Basket Ball");  
        }
        break;
        case "Tuesday":{
            System.out.println("Tennis");
        }
        break;
        
        case "Thursday":{
            System.out.println("Cricket");
        }break;
    }

    
}
