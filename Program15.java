//wap to find the largest digit present in the number
//453324-5
import java.util.Scanner;
public class Program15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
/*
 int largest=0;
    while ((n!=0)) 
    {
        int digit=n%10;
        if(digit>largest)
        {
largest=digit;
        }
        n=n/10; 
   }
  System.out.println(largest);
    */  

    //smallest number
    int smallest=9;
    while ((n!=0)) {
        int digit=n%10;
        if(digit<smallest){
            smallest=digit;
        }
n=n/10;
    }
System.out.println(smallest);
   
}
}
