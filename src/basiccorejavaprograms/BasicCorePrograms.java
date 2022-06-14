package basiccorejavaprograms;

import java.util.Scanner;
import java.lang.Math;

public class BasicCorePrograms {
    public static void main(String[] args) {
        harmonicNumber();
    }

    static double harmonicNumber() {
        float harmonic = 1;
        System.out.println("Enter the value of number");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        // loop to apply the formula
        // Hn = H1 + H2 + H3 ... + Hn-1 + Hn-1 + 1/n
        for (int i = 2; i <= number; i++) {
            harmonic += (float) 1 / i;
            System.out.println("Value of harmonic number: " + harmonic);
        }
        return harmonic;
    }
}