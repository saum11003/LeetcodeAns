class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        if(nums.length==1){
            return 1;
}
        int w_index=1;
        for(int i =1;i<nums.length;i++){
            if(nums[i] != nums[w_index-1]){
                nums[w_index]=nums[i];
                w_index++;
            }
}
        return w_index;
        
    }
}