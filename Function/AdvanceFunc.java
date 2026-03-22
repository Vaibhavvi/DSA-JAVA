public class AdvanceFunc {

    // Sum of 2 Number
    public static int Sum(int a , int b){
        return a+b;
    }

    // Sum of 3 Number
    public static int Sum(int a , int b , int c ){
        return a+b+c;
    }

    // Check Prime Number or Not with Optimized code
    public static boolean isPrime(int n){
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    // Print all prime range
    public static void PrimeinRange(int n){
        for(int i=2; i<=n; i++){
            if(isPrime(i)){
                System.out.println(i+ " ");
            }
        }
    }

    public static void main(String[] args) {
        // Function Call

        System.out.println(Sum(10, 20));
        System.out.println(Sum(10, 20 , 30));

        // Prime Function call
        System.out.println(isPrime(11));

        //Call Print prime range 
        PrimeinRange(20);
    }
}
