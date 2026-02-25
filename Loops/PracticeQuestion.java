import java.util.Scanner;

public class PracticeQuestion {
    public static void main(String args[]) {

        // Question - Check if a number is prime or not

        Scanner sc = new Scanner(System.in);
        int num;
        int sumEven = 0;
        int sumOdd = 0;
        do {
            System.out.println("Enter a number : ");
            num = sc.nextInt();
            if (num % 2 == 0) {
                sumEven += num;
                if (num == 0) {
                    break;
                }
            } else {
                sumOdd += num;
                if (num == 0) {
                    break;
                }
            }
        } while (num != 0);
        System.out.println("Sum of even numbers : " + sumEven);
        System.out.println("Sum of odd numbers : " + sumOdd);

        //Question- Write a program to print the multiplication table of a number N, entered by the user.
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        for(int i=1; i<=10; i++){
            System.out.println("Number : " + n + "x" + i + "=>" + n*i);
        }

        sc.close();
    }
}
