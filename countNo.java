import java.util.*;
public class countNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.");
        int n = sc.nextInt();
        sc.close();
        int count =0;
        n= Math.abs(n);  
        
        do { 
            count++;
            n = n/10;

            
        } while (n>0);
        System.out.println(count);
    }
}
