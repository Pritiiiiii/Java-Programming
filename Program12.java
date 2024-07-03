//wap to check if the number is  a niven number(harshad's number)or not
//a harshad number is number which is divisible by sum of its digit example 27 2+7=9  27%9==0 , 21 2+1  21%3==0
import java.util.Scanner;
public class Program12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int num1=sc.nextInt();
        int sum=0;
        int temp=num1;
        while(num1!=0){
int digit=num1%10;
sum=sum+digit;
num1=num1/10;
        }
        if(temp%sum==0){
            System.out.println("A number is niven number(harshad's number)");
        }
        else{
            System.out.println(" A number is Not a harshad's number or niven");
        }

    }
}
