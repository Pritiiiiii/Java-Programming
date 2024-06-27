//output:16,11,6,1,-4,1,6,11,16
//input:16
public class Program7 {
     static void program7(int n){
        if(n>0){
            System.out.print(n +" ");
            program7(n-5);
        }System.out.print(n +" ");
    }
    public static void main(String[] args) {
        program7(16);
    }

}
