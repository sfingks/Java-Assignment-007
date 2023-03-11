/**
 * @author Trevor Hartman
 * @author MK Ripley
 * @since Version 1.0
 * 3/11/2023
 */
import java.util.Scanner;

public class MyMath {

    public static void gcf(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter first number to be evaluated: ");
        int a = Integer.parseInt(s.nextLine());
        System.out.println("Enter second number to be evaluated: ");
        int b = Integer.parseInt(s.nextLine());

        int first = a;
        int second = b;
        int c = 0;

        while (b != 0) {
            if (a > b){
                c = b;
                b = (a % b);
                a = c;
            } else {
                b %= a;
            }
        }
        System.out.printf("The GCF of %d and %d is: %d\n", first, second, c);
    }
    public static void main(String[] args) {
        gcf();
    }
}
