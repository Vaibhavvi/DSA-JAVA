package Pattern;

public class HardPattern {

    // Hollow rectangle method
    public static void hollow_rectangle(int totalRows, int totalCols) {

        for(int i = 1; i <= totalRows; i++) {

            for(int j = 1; j <= totalCols; j++) {

                // Border condition
                if(i == 1 ||  i == totalRows || j == 1 || j == totalCols) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println(); // move to next line
        }
    }

    //02 - Inverted and Rotated Half Pyramid

    public static void HalfPyramid(int n){
        //outer Loop
        for (int i=1; i<=n; i++){
            //spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /* 

    //03 Inverted Half Paramid pattern with number
    public static void HalfPyramidNumber(int n) {
        //outer loop
        for (int i=1; i<=n; i++){
            //number print
            for (int j=1; j>=i; j++){
                System.out.print(i);
            }

            for (int j=1; j<)
            System.out.println();
        }
    }

    */

    public static void main(String[] args) {
        hollow_rectangle(4, 5);

        // 02 Method Call 

        HalfPyramid(4);

    }
}