public class Solution {
    /**
     * Medium level problem
     *
     * The rotation of the array is really just
     * nums[k -> the last element] joined with nums[0 -> k]
     *
     * Doing some reversing magic, we can accomplish this in place in O(n) time
     */
    public void rotate(int[] nums, int k) {
        k %= nums.length; // At some point in time, we are doing more work than we need to
        reverse(nums, 0, nums.length - 1); // Reverse the entire array
        reverse(nums, 0, k - 1); // Reverse the first k items in the reversed array
        reverse(nums, k, nums.length - 1); // Reverse the k to last item in the array
    }

    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
