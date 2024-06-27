import java.util.Scanner;
public class Program10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
    int num=sc.nextInt();
   /* 
   while ((num!=0)) {
        int digit=num%10;
        System.out.println(digit);
        num=num/10;
        }
        
    }*/ 
    //print all digit even number
    // while (num!=0) {
    //     int digit=num%10;
    //     if(digit%2==0){
    //         System.out.println(digit);
    //     }
    //     num=num/10;
    // }
    
    //wap to find the sum of all the digit in the number
    /*int sum=0;
    while (num!=0) 
    {
        int digit=num%10;
        System.out.println(digit);
        num=num/10;
        sum=sum+digit;
    }
    System.out.println("sum of digit in the number: "+sum);*/


    //wap to find the product of sum of all even digit and sum of all odd digit
    int sumeven=0;
    int sumodd=0;
    int product=0;
    while (num!=0) 
    {
        int digit=num%10;
        System.out.println(digit);
        num=num/10;
        if(digit%2==0){
            sumeven=sumeven+digit;

        }if(digit%2!=0){
            sumodd=sumodd+digit;
        }
        product=sumeven*sumodd;
    }
    System.out.println("sum of even digit: " +sumeven);
    System.out.println("sum of odd digit: " +sumodd);
    System.out.println("product of even and odd digit: "+product);
    
    
    }
}

   
