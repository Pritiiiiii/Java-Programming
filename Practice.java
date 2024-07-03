import java .util.Scanner;
public class Practice {
public static int countOfDigits(int n ){
    //here we get count of digit
    int count=0;
    while (n!=0) {
        n=n/10;
        count++;
    }return count;
}
public static int pow(int n,int p){
    int product=1;
for(int i=1;i<=p;i++){
    product=product*n;

}
return product;
}
    public static void main(String[] args) {
    //    int count= countOfDigits(78989);
    //    System.out.println(count);
       int n=1634;
       int sum=0;
    
       int temp=n;
       int countDigits=countOfDigits(n);
       while ( n!=0) {
        int digit=n%10;
        sum=sum+pow(digit, countDigits);
        n=n/10;
       }
       if(sum==temp){
        System.out.println("armstrong");
       }else{
        System.out.println("not an armstrong");
       }
        /*int year=2029;
        if(year%4==0 && year%100 !=0 ||year%400==0 ){
            System.out.println("leap year ");
        }
        else{
            System.out.println("not a leap year");
        } */
       /* 
        *  Scanner sc=new Scanner(System.in);
       System.out.println("Enter character: " ) ;
       char ch=sc.next().charAt(0);
     
       if(ch>='a' && ch<='z' || ch>='A'&& ch<='Z') {
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' ||ch=='u' || ch=='A'|| ch=='E' || ch=='I' || ch=='O' || ch=='U'){
            System.out.println("vowel");
        }
        else{
            System.out.println("CONSONANT");
        }
       
       }
       else{
        System.out.println("invalid input");
       }
      

       */
      
// int num=1;
// do{
//     System.out.println(num);
//     num++;

// }while(num<=10);
// int i=1;
// while (i<=10) {
//     System.out.println(i);
//     i++;
    
// }
// for(int i=1;i<=10;i++){
//     System.out.println(i);
// }
        //factorial of number
//         int num=3;
//         int fact=1;
//         for (int i=1;i<=num;i++){
// fact=fact*i;
//         }
//         System.out.println(fact);
/*int num=8;
int count=0;
for(int i=1;i<=num;i++){
    if(num%i==0){
        count++;
        
    }   
}
if(count==2){
    System.out.println("prime number");
}
else{
    System.out.println("not prime number");
}/* */
//sum of digit
/*int num=124357;
int oddsum=0;
int evensum=0;
int product=1;
while(num!=0){
    int digit=num%10;
    num=num/10;
    if(digit%2==0){
        evensum=evensum+digit;
    }
    if(digit%2!=0){
oddsum=oddsum+digit;
    }
    product=evensum*oddsum;
    
}
System.out.println(evensum);
System.out.println(oddsum);
System.out.println(product); */
// int num=56;
// int temp=27;
// int sum=0;
// while(num!=0){
//     int digit=num%10;
//     sum=sum+digit;
//      num=num/10;
// }if(temp%sum==0){
//     System.out.println("number is special number: ");
// }
// else{
//     System.out.println("not a special number");
// }

    }
    
}
