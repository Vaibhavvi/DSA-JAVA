public class JavaBasic {
    public static void main(String args[]) {

        // Print Hello World and other statements .....
        System.out.println("Hello Vaibhav Dubey !");
        System.out.println("Hello Kaise ho !");
        System.out.println("Hello Kya Haal !");
        System.out.println("Hello Vibhu !");

        // Vaiables Declaration and Initialization
        int c = 10;
        int d = 20;

        System.out.println("The sum of c and d is : " + (c+d));


        // Data Types in Java

        // long and double are 8bytes in size
        long myLongNum = 100000000000L; // size 8 bytes
        double myDoubleNum = 19.99d; // size 8 bytes
        int myNum = 5; // size 4 bytes
        float myFloatNum = 6.99f; // size 4 bytes
        char myLetter = 'D';  // size 2 bytes
        boolean myBool = true;  // size 1 bit
        String myText = "Hello World"; // size depends on the string
        System.out.println("Integer : "+ myNum + "\n" + " Float :"+ myFloatNum + "\n" + " Character :"+ myLetter + "\n" + " Boolean :"+ myBool + "\n" + " String :"+ myText + "\n" + " Long :"+ myLongNum + "\n" + " Double :"+ myDoubleNum);

        // Sum of two Numbers 

        int a = 50;
        int b = 20;
        int sum = a+b;
        System.out.println("The sum of a and b is : "+ sum);
    }
}

//Boilierplate code for Java programming Language.