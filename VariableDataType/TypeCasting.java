//Conversion possible when type are compatiable and source is less than or equal to destination

public class TypeCasting {
    public static void main(String args[]) {
        float f = 10.5f;
        int i = (int) f; // Explicit type casting
        System.out.println(i);

        // Type casting are used when we want to convert one data type to another data
        // type. It is of two types : Implicit and Explicit

        // Implicit type casting : It is done automatically by the compiler when we
        // assign a value of one data type to another data type. It is also known as
        // widening conversion. It is done when the source data type is smaller than the
        // destination data type.
        int a = 10;
        float b = a; // Implicit type casting
        System.out.println(b);

        // Explicit type casting : It is done manually by the programmer when we want to
        // convert a value of one data type to another data type. It is also known as
        // narrowing conversion. It is done when the source data type is larger than the
        // destination data type.

        double c = 10.5;
        int d = (int) c; // Explicit type casting
        System.out.println(d);
    }
}