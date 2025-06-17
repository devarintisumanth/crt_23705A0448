public class Sorting {
    public static void main(String[] args) {
        int[] nums = {5, 3, 8, 4, 2};

        for (int j = 0; j < nums.length - 1; j++) {
            boolean isSwapped = false;

            for (int i = 0; i < nums.length - j - 1; i++) {
                if (nums[i] > nums[i + 1]) {
                    int temp = nums[i];
                    nums[i] = nums[i + 1];
                    nums[i + 1] = temp;
                    isSwapped = true;
                }
            }

            if (!isSwapped) break; 
        }

        for (int num : nums) {
            System.out.print(num + " ");
        }

        System.out.println(); 
    }
}
