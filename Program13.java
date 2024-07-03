//wap to find the sum of all prime digits of number
import java.util.Scanner;
public class Program13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int sum=0;
        
        while(num!=0){
            int digit=num%10;
if(digit==2 || digit==3 || digit==5 || digit==7){
    sum=sum+digit;
}
num=num/10;

            /*int count=0;
            for(int i=1;i<=digit; i++){
                if(digit % i ==0){
                    count++;
                }
            if(count==2){
                sum=sum+digit;
            }
            num=num/10;
        }

    }
    System.out.println(sum);*/


        }
        System.out.println(sum);
}
}
