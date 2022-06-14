package basiccorejavaprograms;

import java.util.Scanner;
import java.lang.Math;

public class BasicCorePrograms {
    public static void main(String[] args) {
        quotientAndRemainder();
    }

    static void quotientAndRemainder() {
        System.out.println("Enter the value of dividend");
        Scanner sc = new Scanner(System.in);
        int dividend = sc.nextInt();
        System.out.println("Enter the value of divisor");
        int divisor = sc.nextInt();

        int quotient = dividend / divisor;
        int remainder = dividend % divisor;

        System.out.println("Quotient of entered number is = " + quotient);
        System.out.println("Remainder of entered number is = " + remainder);
    }
}