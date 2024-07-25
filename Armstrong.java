//sum of each digit rase to the power of total number of digit
public class Armstrong{
//         public static void main(String[] args) {
//        int n=150;
//        int sum=0 ,temp=n;
// int countOfDigits =countDigits(n);
// while (n!=0) {
//     int digit=n%10;
//     sum=sum+pow(digit ,countOfDigits);
//     n=n/10;
// }if(sum==temp){
//     System.out.println("Armstrong Number");
// }else{
//     System.out.println("Not an armstrong number");
// }
//     }
//     public static int pow(int n,int p){
//         int prod=1;
//         for(int i=1;i<=p;i++){
//             prod=prod*n;
//         }
//         return prod;
//     }
//     public static int countDigits(int n){
//         int count=0;
//         while (n!=0) {
//             count++;
//             n=n/10;
//         }
//         return count;
//     }

public static void main(String[] args) {
    int num=153;
    int temp=num;
    int sum=0;
    int count=countDigits(num);
    while(num!=0){
        int digit=num%10;
        sum=sum+power(digit, count);
        num=num/10;
    }
    if(temp==sum){
        System.out.println("yes");
    }else{
        System.out.println("No");
    }
}
public static int power(int num,int p){
    int prod=1;
    for(int i=0;i<p;i++){
        prod=prod*num;
    }
    return prod;
}
public static int countDigits(int num){
    int count=0;
    while (num!=0) {
        num=num/10;
        count++;
    }
    return count;
}
}