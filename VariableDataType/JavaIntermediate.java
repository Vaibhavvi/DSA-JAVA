import java.util.*;

public class JavaIntermediate {
    public static void main(String args[]) {

        // Taking User Input in Java

        try (Scanner sc = new Scanner(System.in)) {
            String name = sc.nextLine();
            System.out.println("Hello "+ name + " !");

            // Sum of two numbers using user input

            System.out.println("Enter the first number : ");
            int num1 = sc.nextInt();
            System.out.println("Enter the second number : ");
            int num2 = sc.nextInt();

            int sum = num1 + num2;

            System.out.println("The sum of "+ num1 + " and " + num2 + " is : " + sum);


            // Circle Area Calculation

            System.out.println("Enter the radius of the circle : ");
            double radius = sc.nextDouble();
            double area = 3.14 * radius * radius;
            System.out.println("The area of the circle is : " + area);
        }
    }
}