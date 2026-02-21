package ConditionalStatements;
import java.util.Scanner;

public class IfElse{
    public static void main(String[] args) {

        // Largest of two numbers

        int a = 120;
        int b = 100;

        if(a>b){
            System.out.println("A is greater than B");
        }else{
            System.out.println("B is greater than A");
        }

        // Find Odd or Even Number

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        if(num%2==0){
            System.out.println("Even Number");
        }else{
            System.out.println("Odd Number");
        }

        sc.close();

    }
}