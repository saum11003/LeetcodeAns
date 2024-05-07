class Solution {
    public int removeDuplicates(int[] nums) {

        if (nums.length == 0) return 0;
        if (nums.length == 1) return 1;

        int writeIndex = 1;

        
        for (int readIndex = 1; readIndex < nums.length; readIndex++) {
            if (nums[readIndex] != nums[writeIndex - 1]) {
                nums[writeIndex] = nums[readIndex];
                writeIndex++;
            }
        }
        return writeIndex;
    }
}
