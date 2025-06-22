import java.util.Scanner;

public class countDNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter the no.");
        int n = sc.nextInt();
        int count = 0;

        System.out.println("enter the Digit no.");
        int d= sc.nextInt();

        int temp=Math.abs(n);

        while(temp>0){
            if(temp%10==d){
                count++;

            }
            temp /=10; 
        }
        System.out.println(count);
        sc.close();
    }
    
}
