public class Program1 {
public static void main(String[] args) {
    char ch='k';
    if(ch>='a'&& ch<='z'||ch>='A'&&ch<='Z'){
        if(ch=='a'|| ch=='e'|| ch=='i'||ch=='o'||ch=='u' ||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
            System.out.println("vowels");
        }
        else{
            System.out.println("consonant");
        }
            
    }else{
        System.out.println("Not an alphabate");
    } 
       

    
}
    
}