class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int countbr =0;
        int maxcount=0;
        
       
        
        for(int i =0;i<nums.length;i++){
            if(nums[i]==1){
                countbr++;
                if(countbr>maxcount){
maxcount=countbr;
                }
}else{
countbr=0;}     
}
        return maxcount;
        
    }
}