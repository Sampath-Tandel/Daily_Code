package Searching;

public class linearSearch {
    public static void main(String[] args) {

        int a[] = { 2, 5, 6, 7, 31, 54, 76, 98 };
        int target = 2;
        int i;
        int flag = -1;
        for (i = 0; i < a.length; i++) {
            if (a[i] == target) {
                flag = 0;

                break;
            }

        }
        if (flag == 0)
            System.out.println("target found at :" + i);
        else
            System.out.println("target not found");

    }
}
