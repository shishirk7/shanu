// import java.util.*;

// public class reverse1{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the string:");
//         String str = sc.nextLine();
//         sc.close();
//         String r = rev(str);
//         System.out.println(r);

//     }

//     public static String rev(String str){
//         char[] c = str.toCharArray();
//         int length = str.length();

//         for(int i=0;i<length/2;i++){
//             char temp = c[i];
//             c[i] = c[length-i-1];
//             c[length-i-1] = temp;
//         }
//         return new String(c);

//     }
// }
import java.util.*;

public class rev{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = sc.nextLine();
        sc.close();
        String s = re(str);
        System.out.println(s);

    }
    
    public static String re(String str){
        int l =str.length();
        String rev = "";
        for(int i=l-1;i>=0;i--){
            rev += str.charAt(i);
        }
        return rev;

    }
    
}
