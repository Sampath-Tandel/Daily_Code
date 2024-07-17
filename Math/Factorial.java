//find factorial of a number
package Daily_Code.Math;

import java.util.Scanner;

public class Factorial {

    static int fact(int n) {
        if (n == 0)
            return 1;
        else
            return n * fact(n - 1);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a num  :");
        int n = sc.nextInt();
        System.out.println(fact(n));
    }
}
