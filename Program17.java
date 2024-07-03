//wap to reverse the number and  check given number is palindrom
public class Program17 {
    public static void main(String[] args) {
        int num=121;
        int temp=num;
    int revers=0;
    while(num!=0){
int digit=num%10;
revers=revers*10+digit;
num=num/10;
    }
    System.out.println(revers);
    if(temp==revers){
        System.out.println("the given number is palindrome");
    }
    else{
        System.out.println("the given number is not palindrome");
    }
}
    }
   