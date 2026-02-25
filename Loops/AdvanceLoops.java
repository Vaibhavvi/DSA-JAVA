import java.util.Scanner;

public class AdvanceLoops {
    public static void main(String[] args) {
        // Do while Loop
        int counter = 5;

        do {
            System.out.println("Hello Vaibhav ");
            counter++;
        } while (counter < 7);

        // Question - Keep entring number until user enter a multiple of 10

        Scanner sc = new Scanner(System.in);
        int num;

        for (;;) {
            System.out.println("Enter a number : ");
            num = sc.nextInt();

            if (num % 10 == 0) {
                System.out.println("You entered a multiple of 10 ");
                break;
            }
        }

        // Display all numbers entered by user until he enters a multiple of 5
        for (int i = 0; i < 100; i++) {
            System.out.println("Enter a number : ");
            num = sc.nextInt();

            if (num % 5 == 0) {
                continue;
            } else {
                System.out.println("Number : " + num);
                break;
            }
        }

        // Que - Check if a number is prime or not 
        System.out.println("Enter a number : ");
        int n = sc.nextInt();

        boolean isPrime = true;

        if (n <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Not a Prime Number");
        }
        sc.close();
    }
}