import java.util.Scanner;

public class PracticeQuestion {
    public static void main(String args[]) {
        /*
         * VARIABLES & DATA TYPES QUESTIONS Question 1:In a program , input 3 numbers :
         * A , B and C.
         * You have to output the average of these 3 numbers.(Hint : Average of N
         * numbers is
         * sum of those numbers divided by N)
         */

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter 3 numbers : ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            int average = (a + b + c) / 3;

            System.out.println("Average of 3 numbers is :" + average);

            /*
             * Question2:In a program,input the side of a square. You have to output the area of the square.
             * (Hint : area of a square is (side x side))
             */

            System.out.println("Enter the side of a square :");
            int side = sc.nextInt();
            int area = side * side;

            System.out.println(area);
        }
    }
}
