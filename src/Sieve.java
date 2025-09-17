import java.util.Scanner;
public class Sieve {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        //boolean [] primenumbers;
        System.out.println("Please enter a number, between 1 and 40");
        int n = scan.nextInt();
        int [] primenumbers;
        //compostite = new boolean [n];
        //for (int i = 2; i*i < n; i++) {
        //}
        primenumbers = new int [10];
        for (int i = 1; i <= n; i++) {
            if (i <= 5) {
                if (i == 2) {
                    String y0 = ("0" + i);
                }
                if (i == 3) {
                    String y = ("0" + y + i);
                    System.out.println(y);
                }
                if (i == 5) {
                System.out.println("5");
                }
                }
            if (i > 5) {
                if (i % 2 != 0) {

                }

            }
        }
            
        }

    }

