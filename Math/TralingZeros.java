//program to find the trailing zeros in factorial of anumber1


package Daily_Code.Math;

import java.util.Scanner;

public class TralingZeros {


    static int count(int n){
        int res=0;
        int powerOf5=5;
        while((n/powerOf5)!=0){
        res=res+(n/powerOf5);
        powerOf5=powerOf5*5;
        }
        return res;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a num  :");
        int n = sc.nextInt();
        System.out.println(count(n));
    }
    
}
