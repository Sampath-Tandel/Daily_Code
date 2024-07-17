//program to count  the number of digits

package Daily_Code.Math;

import java.util.Scanner;

public class numberOfDigits {
    static int count(int n) {
        int a = 0;
        while (n > 0) {
            n = n / 10;
            a++;

        }
        return a;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a num  :");
        int n = sc.nextInt();
        System.out.println(count(n));
    }

}
