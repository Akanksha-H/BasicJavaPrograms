package basiccorejavaprograms;

import java.util.Scanner;
import java.lang.Math;

public class BasicCorePrograms {
    public static void main(String[] args) {
        swapTwoNumbers();
    }

    static void swapTwoNumbers() {
        System.out.println("Enter the value of first number");
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        System.out.println("Enter the value of second number");
        int second  = sc.nextInt();
        System.out.println("Numbers before swap--");
        System.out.println("First number = " + first);
        System.out.println("Second number = " + second);

        int temp = first;
        first = second;
        second = temp;

        System.out.println("Numbers after swap--");
        System.out.println("First number = " + first);
        System.out.println("Second number = " + second);
    }
}