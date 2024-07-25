//find first and last digit without using any loop
import java.util.Scanner;
public class Program20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
            int digit=n%10;
System.out.println("Last digit :"+digit);
//first digit ka logic first we have to find total digits 
int totaldigit=(int)Math.log10(n);
int firstdigit=(int)(n/Math.pow(10, totaldigit));
System.out.println("first digit of number: "+firstdigit);
        
    }
}
