public class ReverSestring {
    public static void main(String[] args) {
        
         String str="ABCD";
       str = str.toLowerCase();
        String result=" ";
for(int i=0;i<str.length();i++)
{
    char ch = str.charAt(i) ;
    result=ch+result;
    // str=str+ch;
}
System.out.println(result);
         
        



// System.out.println("reverse string: " +result);
//reverse number
// int num=2345;
// int result1=0;
// while ((num!=0)) 
// {
//     result1=result1*10 + num%10;
//    num=num/10;
// }
// System.out.println(result1);

//using string buffer class
// stringBuffer sb=stringBuffer(string.valueOf(num));


//     String str="priti";
// char[]charAraay= str.toCharArray();
//     revrse(charAraay, charAraay.length);
    
//     }
//     public static void revrse(char[]str,int n){
//         int i=0;
//         int l=n-1;
//         while (i<l) {
//             int temp=i;
//             i=l;
//             l=temp;
//             i++;
//             l--;
//         }
//     }
    //     String str = "priti";
    //     char[] charArray = str.toCharArray();
    //     reverse(charArray, charArray.length);
        
    //     // Convert the char array back to a string and print the result
    //     String reversedStr = new String(charArray);
    //     System.out.println("Reversed String: " + reversedStr);
    // }

    // public static void reverse(char[] str, int n) {
    //     int i = 0;
    //     int l = n - 1;
    //     while (i < l) {
    //         // Swap characters
    //         char temp = str[i];
    //         str[i] = str[l];
    //         str[l] = temp;
    //         i++;
    //         l--;
    //     }
    }
}

