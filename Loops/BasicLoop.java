import java.util.*;

public class BasicLoop {
    public static void main(String[] args) {

        // Print Number from 1 to 10 using while Loops

        int i = 0;
        while (i < 10){
            System.out.println(i+1);
            i++;
        }

        // Print Number from 1 to n using while Loops 

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");

        int n = sc.nextInt();
        i = 0;
        while(i<n){
            System.out.println(i+1);
            i++;
        }

        // For Loops Start

        // Print Sum of first n Natural Number using For Loops

        System.out.println("Enter the value of n: ");
        int n1 = sc.nextInt();
        int sum = 0;
        for (i=1; i<=n1; i++){
            sum = sum + i;
        }
        System.out.println("Sum of first " + n1 + " natural numbers is: " + sum);
        sc.close();

        // Print Square pattern using For Loops 

        for (int line = 1; line <= 4; line++){
            System.out.println("* * * *");
        }
    }
}