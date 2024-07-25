import java.util.Scanner;
public class Triplates {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] values=new int[size];
        for(int i=0;i<values.length;i++){
            values[i]=sc.nextInt();
        }for(int i=0;i<values.length;i++){
            for(int j=i+1;j<values.length;j++){
                for(int k=j+1;k<values.length;k++){
                    if(values[i]+values[j]+values[k]==0){
                        System.out.println(values[i]+" "+values[j]+" "+values[k]);
                    }
                   
                }
            }
        }

    }
}
