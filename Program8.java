//wap to find favtorial of a number
import java.util.Scanner;

public class Program8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=sc.nextInt();
//         int fact=1;
//         for(int i=1;i<=num;i++){
// fact=fact*i;
//         }
//         System.out.println(fact);

//wap to find factors
// for(int i=1;i<=num;i++)
// {
//     if(num%i==0){
//         System.out.print(i+ " ");
//     }
// }
//A perfect number
//example 6:1,2,3
/*int perfect=0;
for(int i=1;i<num;i++){
    if(num%i==0){
        perfect = perfect+i;
        System.out.print(i +" ");
    }
   
   
}
if(num==perfect){
    System.out.println("true");
}else{
    System.out.println("false");
}*/
//1 to 5 table print horizontal

for(int i=1;i<=10;i++){
    
    int table = num*i; 
    System.out.println(num+ "*" +i+ "=" +table );
}


    }
}
