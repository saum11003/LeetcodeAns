class Solution {
    public void nextPermutation(int[] nums) {

        int k = nums.length-2;
        while (k >= 0 && nums[k] >= nums[k + 1]) {
            k--;
        }
        

        if (k >= 0) {
            int l = nums.length - 1;
            while (l > k && nums[l] <= nums[k]) {
                l--;
            }

            swap(nums, k, l);
        }
        

        reverse(nums, k + 1);
    }
    
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    
    private void reverse(int[] nums, int start) {
        int end = nums.length - 1;
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }
}
