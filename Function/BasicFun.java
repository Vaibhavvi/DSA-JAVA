public class BasicFun {

    // Swap Function
    public static void SwapFun(int a , int b) {

        // Swap Logic
        int temp = a;
        a = b;
        b = temp;

        // Print Value After Swapping
        System.out.println("Value of a " + a);
        System.out.println("Value of b " + b);
    }


    // Product Function
    public static void ProductFun(int a , int b){
        //Product Logic
       int pro = a * b;
       System.out.println("Product of a and b = " + pro);
    }


    // Factorial Function

    public static void FactorialFun(int n){
        // Factorial Logic
        int f = 1;
        for(int i=1; i<=n; i++){
            f = f * i;
        }
        System.out.println("Factorial of number = " + f);
    }


    public static void main(String[] args){
        //Call Swap Function
        SwapFun(5,10);

        //Call Product Function
        ProductFun(10, 20);

        // Factorial Function 
        FactorialFun(5);
    }  
}