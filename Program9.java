import java.util.Scanner;
public class Program9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number: ");
        int num =sc.nextInt();
        int count=0;
        for(int i=1;i<=num; i++){
            if(num % i ==0){
                count++;
            }
        }
        if(count==2){
            System.out.println("Number is prime number");
        }else{
            System.out.println("Number is not prime number");
        }

    }
}
