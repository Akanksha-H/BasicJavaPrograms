package basiccorejavaprograms;

import java.util.Scanner;

public class FunctionalPrograms {
    public static void main(String[] args) {
        twoDArray();
    }

    static void twoDArray() {
        System.out.print("Enter number of columns: ");
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();
        boolean[][] booleans;
        booleans = new boolean[n][m];
        System.out.println("booleans[0][0] : " + booleans);
        int[][] ints = new int[n][m];
        System.out.println("ints[0][0] : " + ints);
        long[][] longs = new long[n][m];
        System.out.println("longs[0][0] : " + longs);
        float[][] floats = new float[n][m];
        System.out.println("floats[0][0] : " + floats);
        double[][] doubles = new double[n][m];
        System.out.println("doubles[0][0] : " + doubles);
    }
}
