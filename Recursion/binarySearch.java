//binary search using recursion
package Recursion;

public class binarySearch {
    public static void main(String[] args) {
        int[] a = { 2, 5, 6, 7, 31, 54, 76, 98 };
        search(a, 0, a.length - 1, 54);

    }

    static void search(int[] a, int left, int right, int target) {
        if (left > right) {
            System.out.println("target not found");
            return;

        }
        int mid = (left + right) / 2;

        if (a[mid] == target) {
            System.out.println("target found at :" + mid);
            return;

        } else if (target < a[mid]) {
            search(a, left, mid - 1, target);

        } else {

            search(a, mid + 1, right, target);
        }

    }

}
