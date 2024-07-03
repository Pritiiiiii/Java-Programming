//strong number 1,2,145,40585
import java.util.Scanner;
public class Program16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int sum=0;
    int temp=n;
    while(n!=0){
        int digit=n%10;
        sum=sum+factorial(digit);
        n=n/10;
    }
    if(sum==temp){
        System.out.println("Strong number");
    }
    else{
        System.out.println("Not a strong number");
    }
    }
    public static int factorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
         fact=fact*i;
        }
        return fact;
    }
    
}

