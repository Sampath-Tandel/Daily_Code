package Recursion;

import java.util.Scanner;

public class printNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n = sc.nextInt();
        int count = 1;
        print(n, count);

    }

    static void print(int n, int count) {
        if (count == n){
        System.out.println(count);
            return;
        }
        else{
            System.out.println(count);
        count++;
        print(n, count);
        }
    }
}
