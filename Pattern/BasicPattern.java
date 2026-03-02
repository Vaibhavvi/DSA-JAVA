package Pattern;

public class BasicPattern {
    public static void main(String[] args) {
        System.out.println("Basic Pattern Example");

        // Pattern 01 -- Simple Pattern 
        for (int i=0; i<5; i++){
            for (int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println(); // Move to the next line after each row
        }

        System.out.println();
        // Pattern 02 -- Inverted Pattern

        for (int i=5; i>=0; i--){
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        // Pattern 03 -- Half pyramid

        for (int i=0; i<=5; i++){
            for (int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }

    }
}
