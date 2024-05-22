class Solution {
    public int missingNumber(int[] nums) {
        int N = nums.length;
        int Sum = (N*(N+1))/2;
        int arrsum=0;
        
        for( int i =0;i<nums.length;i++){
            arrsum+=nums[i];
}
        
        return Sum-arrsum;
        
        
    }
}