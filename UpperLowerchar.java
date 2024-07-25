import java.util.Scanner;
public class UpperLowerchar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    int count=0;
    int count2=0;
    for(int i=0;i<str.length();i++){
        char ch=str.charAt(i);
        if(Character.isUpperCase(ch))
        count++;
        else if(Character.isLowerCase(ch))
        count2++;
    }
    System.out.println(count);
    System.out.println(count2);
    }
    
}
