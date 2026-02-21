package ConditionalStatements;

import java.util.Scanner;

public class ElseIf {
    public static void main(String[] args) {

        // Tax Calculation
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your income: ");
        int income = sc.nextInt();
        int tax;

        if(income<500000){
            tax = 0;
            System.out.println("0% Tax");
        }else if(income<1000000){
            tax = income * 20 / 100;
            System.out.println("20% Tax");
        }else{
            tax = income * 30 / 100;
            System.out.println("30% Tax");
        }

        System.out.println("Your tax is: " + tax);
        sc.close();


        // Largest of Three Numbers

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int a = sc1.nextInt();
        int b = sc1.nextInt();
        int c = sc1.nextInt();

        if(a>b && a>c){
            System.out.println("A is greatest");
        }else if(b>a && b>c){
            System.out.println("B is greatest");
        }else{
            System.out.println("C is greatest");
        }

        sc1.close();
    }
}
