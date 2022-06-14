package basiccorejavaprograms;

import java.util.Scanner;
import java.lang.Math;

public class BasicCorePrograms {
    public static void main(String[] args) {
        vowelOrConstant();
    }

    static void vowelOrConstant(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a alphabet: ");
        char ch=sc.next( ).charAt(0);

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
            System.out.println(ch + " is vowel");
        else
            System.out.println(ch + " is consonant");
    }
}