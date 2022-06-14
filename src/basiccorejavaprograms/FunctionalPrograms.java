package basiccorejavaprograms;

import java.util.Scanner;

public class FunctionalPrograms {
    public static void main(String[] args) {
        distanceBetweenTwoPoints(2,2);
    }

    static void distanceBetweenTwoPoints(double x, double y) {
        double distance = Math.sqrt((x * x + y * y));
        System.out.println("Distance between two pont is :" + distance);
    }
}
