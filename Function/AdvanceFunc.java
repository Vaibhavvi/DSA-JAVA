public class AdvanceFunc {

    // Sum of 2 Number
    public static int Sum(int a , int b){
        return a+b;
    }

    // Sum of 3 Number
    public static int Sum(int a , int b , int c ){
        return a+b+c;
    }

    public static void main(String[] args) {
        // Function Call

        System.out.println(Sum(10, 20));
        System.out.println(Sum(10, 20 , 30));
    }
}
