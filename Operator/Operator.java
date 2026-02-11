package Operator;

public class Operator {
    public static void main(String[] args){
        //Arithmetic Opreators 

        int a = 10;
        int b = 5;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a % b);

        // Unary Operators 

        System.out.println(a++);
        System.out.println(++a);

        //Reatonal Operators

        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a==b);

        // Logical Operators

        System.out.println(a!=b && a>b);
        System.out.println(a!=b || a>b);

}
}