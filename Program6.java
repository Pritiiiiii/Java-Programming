//wap to print all the number from 500-1 without using any loop 
// method recursion
//BUT IT LEADS STACK OVERFLOW ERROR
public class Program6 {
    // static void print(int n){
    //    if(n>=1){// base condition in recursion
    //    System.out.println(n);
    //     n--;
    //     print(n);
    //    }
    //     }
    static void program(int n){
       if(n<=500){
        System.out.println(n);
        n++;
program(n);
       }
    }
    public static void main(String[] args) {
  program(1);

    }
    
}
