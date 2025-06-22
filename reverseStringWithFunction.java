import java.util.Scanner;

public class reverseStringWithFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string:");

        String str = sc.nextLine();

        sc.close();

        StringBuilder re = new StringBuilder(str);
        StringBuilder n = re.reverse();
        System.out.println("Reversed string: " + n);
        
    }
    
}
