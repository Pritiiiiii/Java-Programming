//WAP TO FIND THE LARGEST NUMBER FROM EACH ROW OF THE ARRAY
public class MatrixLargeNUm {
    public static void main(String[] args) {
        int num[][]={{1,2,3},{10,20,30},{15,30,90}};
        for(int i=0;i<num.length;i++){
            int large=Integer.MIN_VALUE;
            for(int j=0;j<num[i].length;j++){
if(num[i][j]>large){
large=num[i][j];
}
            }
            System.out.println(large);
        }
    }
    
}

