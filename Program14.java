//count prime number less than N 

import java.util.Scanner;
public class Program14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int primeCount=0;
        for(int i=2;i<n;i++){
            int factorCount=0;
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    factorCount++;
                }
            }
            if(factorCount==2){
                primeCount++;
                System.out.println(i+" ");
            }
            
        }
        
        System.out.println(primeCount);
       
    }
}
