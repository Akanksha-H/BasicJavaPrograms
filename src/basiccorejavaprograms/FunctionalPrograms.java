package basiccorejavaprograms;

import java.util.Scanner;

public class FunctionalPrograms {
    public static void main(String[] args) {
        quadratic();
    }

    public static void quadratic() {
        // value a, b, and c
        double a = 5, b = 6, c = 7;
        double root1, root2;

        // calculate the determinant (b2 - 4ac)
        double delta = b * b - 4 * a * c;

        // check if determinant is greater than 0
        if (delta > 0) {

            // two real and distinct roots
            root1 = (-b + Math.sqrt(delta)) / (2 * a);
            root2 = (-b - Math.sqrt(delta)) / (2 * a);

            System.out.format("root1 = %.2f and root2 = %.2f", root1, root2);
        }

        // check if determinant is equal to 0
        else if (delta == 0) {

            // two real and equal roots
            // determinant is equal to 0
            // so -b + 0 == -b
            root1 = root2 = -b / (2 * a);
            System.out.format("root1 = root2 = %.2f;", root1);
        }

        // if determinant is less than zero
        else {

            // roots are complex number and distinct
            double real = -b / (2 * a);
            double imaginary = Math.sqrt(-delta) / (2 * a);
            System.out.format("root1 = %.2f+%.2fi", real, imaginary);
            System.out.format("\nroot2 = %.2f-%.2fi", real, imaginary);
        }
    }
}
