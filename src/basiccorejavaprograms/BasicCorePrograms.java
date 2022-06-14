package basiccorejavaprograms;

import java.util.Scanner;
import java.lang.Math;

public class BasicCorePrograms {
    public static void main(String[] args) {
        powerOfTwo();
    }

    static void powerOfTwo() {
        System.out.println("Enter the value of number");
        Scanner sc = new Scanner(System.in);
        double power = sc.nextInt();

        if (power > 31) {
            System.out.println("Please enter value less than 31");
            return;
        }

        for (int i = 1; i <= power; i++) {
            double number = 2;
            System.out.println("Value of 2 poer of enterd value is:" + Math.pow(number, i));
        }
    }
}