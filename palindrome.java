
import java.util.*;

public class palindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to check palidrome or not :");
        String str = sc.nextLine();
        String str1 = str;
        sc.close();
        String s ="";
        

        for(int i=str.length()-1;i>=0;i--){
           s += str.charAt(i);

        }
        boolean b = true;
        for(int i=0;i<str1.length();i++){
            if(str1.charAt(i)!=s.charAt(i)){
                b=false;
                break;

            }}
            if(b){
                System.out.println("palindrome");

            }else{
                System.out.println("not palindrome");
            }
        
        
    }
    
}
