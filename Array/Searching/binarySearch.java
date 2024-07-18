package Searching;

public class binarySearch {
    public static void main(String[] args) {
        int a[] = { 2, 5, 6, 7, 31, 54, 76, 98 };
        int target = 4;
        int left = 0;
        int right = a.length - 1;

        while (left < right) {
            int mid = (left + right) / 2;
            if (a[mid] == target) {
                System.out.println("target found at :" + mid);
                break;

            } else if (target < mid) {
                right = mid - 1;

            } else {
                left = mid + 1;
            }

        }

    }

}
