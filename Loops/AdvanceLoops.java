import java.util.Scanner;

public class AdvanceLoops {
    public static void main(String[] args) {
        
        // Do while Loop
        int counter = 5;

        do {
            System.out.println("Hello Vaibhav ");
            counter++;
        } while (counter < 7);

        // Question - Keep entring number until user enter a multiple of 10

        Scanner sc = new Scanner(System.in);
        int num ;
        
        for (;;) {
            System.out.println("Enter a number : ");
            num = sc.nextInt();

            if (num% 10 == 0){
                System.out.println("You entered a multiple of 10 ");
                break;
            }
        }

        // Display all numbers entered by user until he enters a multiple of 5
        for(int i=0; i<100; i++){
            System.out.println("Enter a number : ");
            num = sc.nextInt();

            if(num%5==0){
                continue;
            }else{
                System.out.println("Number : 6 " + num);
            }
        }

        sc.close();
        
    }
}