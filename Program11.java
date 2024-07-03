//wapto check if the nunber is special number or not
//a number is said to be a special number 
import java.util.Scanner;
public class Program11 {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a number");
    int num=sc.nextInt();
    int temp=num;
    int sum=0;
    int product=1;
    while (num!=0) {
        int digit=num%10;
sum=sum+digit;
product=product*digit;
num =num/10;
    }
    if(sum+product==temp){
        System.out.println("The given number is special number");
    }
    else{
        System.out.println("Not a special number");
    }
    
}
    
}
