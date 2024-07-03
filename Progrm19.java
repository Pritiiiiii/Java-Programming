//Convert number to binary
//divided by  2  
import java.util.Scanner;
public class Progrm19 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    System.out.println("enter a number: ");
    int n=sc.nextInt();
//     String binary="";
//     while (n!=0) {
//         int reminder=n%2;
// binary=reminder+binary;
// n=n/2;
        
//     }
//     System.out.println(binary);


    //convert decimal to octal
// String  octal="";
// while (n!=0) {
//     int reminder=n%8;
//     octal=reminder+octal;
//     n=n/8;
// }
// System.out.println(octal);

//convert decimal to hexadecimal
String hexa="";
while (n!=0) {
    int reminder=n%16;
    if(reminder>=10)
    hexa=(char)(reminder+55)+hexa;
    else{
        hexa=reminder+hexa;
    }
    n=n/16;
}
System.out.println(hexa);
    }
    
}
