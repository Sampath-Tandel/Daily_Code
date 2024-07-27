package Recursion;

import java.util.Scanner;

public class printNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n = sc.nextInt();
        print(n);

    }

    static void print(int n) {
        if (n == 0) {
            return;
        } else {

            print(n - 1);
            System.out.println(n);
        }
    }
}
