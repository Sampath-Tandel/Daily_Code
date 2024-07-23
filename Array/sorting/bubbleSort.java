package sorting;

public class bubbleSort {
    public static void main(String[] args) {
        int[] nums = { 6, 2, 66, 55, 973, 6, 564, 23, 768, 3 };
        int temp;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }

            }

        }
        for (int i : nums) {
            System.out.print(" "+i);

        }

    }

}
