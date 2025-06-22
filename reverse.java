
import java.util.*;

public class reverse{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string.");
        String str = sc.nextLine();
        sc.close();
        
        char[] charArray = str.toCharArray();
        int length =0;

        for(char c: charArray){
            length++;
        }
          
        for(int i=0;i<length/2;i++){
            char temp = charArray[i];
            charArray[i]= charArray[length-i-1];
            charArray[length-i-1]=temp;
                }

                System.out.print("reverse:");
                for(char c : charArray){
                    System.out.print(c);
                }




    }
    
}